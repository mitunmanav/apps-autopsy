package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class VideoTutorialModel {
    String link;
    String question;

    public VideoTutorialModel() {
    }

    public VideoTutorialModel(String str, String str2) {
        this.question = str;
        this.link = str2;
    }

    public String getLink() {
        return this.link;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setQuestion(String str) {
        this.question = str;
    }
}