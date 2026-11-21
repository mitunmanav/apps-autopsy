package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.media.AudioRecord;
import android.util.Log;
import defpackage.la9;

/* JADX INFO: loaded from: classes.dex */
public class SoundLevelMeter {
    private static final int AUDIO_FORMAT = 2;
    private static final int CHANNEL_CONFIG = 16;
    private static final String TAG = "SoundLevelMeter";
    private AudioRecord audioRecord;
    private boolean isRecording = false;
    Context mContext;
    SP sp;
    private static final int SAMPLE_RATE = 44100;
    private static final int BUFFER_SIZE = AudioRecord.getMinBufferSize(SAMPLE_RATE, 16, 2);

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateSoundLevel() {
        int i = BUFFER_SIZE / 2;
        short[] sArr = new short[i];
        while (this.isRecording) {
            if (this.audioRecord.read(sArr, 0, i) > 0) {
                double d = 0.0d;
                for (int i2 = 0; i2 < i; i2++) {
                    short s = sArr[i2];
                    d += (double) (s * s);
                }
                this.sp.setFloat(this.mContext, SP.SOUND_LEVEL, (float) (Math.log10(Math.sqrt(d / ((double) i))) * 20.0d));
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void start(Context context) {
        this.mContext = context;
        this.sp = new SP(context);
        if (la9.a(context, "android.permission.RECORD_AUDIO") != 0) {
            return;
        }
        AudioRecord audioRecord = new AudioRecord(1, SAMPLE_RATE, 16, 2, BUFFER_SIZE);
        this.audioRecord = audioRecord;
        if (audioRecord.getState() != 1) {
            Log.e(TAG, "AudioRecord initialization failed");
            return;
        }
        this.audioRecord.startRecording();
        this.isRecording = true;
        new Thread(new Runnable() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.SoundLevelMeter.1
            @Override // java.lang.Runnable
            public void run() {
                SoundLevelMeter.this.calculateSoundLevel();
            }
        }).start();
    }

    public void stop() {
        this.isRecording = false;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.stop();
            this.audioRecord.release();
            this.audioRecord = null;
        }
    }
}