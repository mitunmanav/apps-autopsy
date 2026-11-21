package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.model.ComparisonGroup;
import com.gpsmapcamera.geotagginglocationonphoto.model.PDFImageModule;
import com.itextpdf.text.Annotation;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfAction;
import com.itextpdf.text.pdf.PdfAnnotation;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.codec.TIFFConstants;
import com.tiktok.util.UrlConst;
import defpackage.am8;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c66;
import defpackage.ej6;
import defpackage.h55;
import defpackage.h65;
import defpackage.hv0;
import defpackage.i65;
import defpackage.j65;
import defpackage.l55;
import defpackage.lj6;
import defpackage.m55;
import defpackage.m82;
import defpackage.nj2;
import defpackage.pj2;
import defpackage.qj;
import defpackage.u65;
import defpackage.ut5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GeneratePDF {
    private final bj context;
    private ArrayList<Bitmap> pagePreviewBitmapList;
    private List<? extends View> pdfPageViewListForLinks;
    private File savedPDFFile;

    public GeneratePDF(bj bjVar) {
        bjVar.getClass();
        this.context = bjVar;
        this.pagePreviewBitmapList = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addLogowithlink(File file, int i) {
        try {
            PdfReader pdfReader = new PdfReader(new FileInputStream(file));
            int numberOfPages = pdfReader.getNumberOfPages();
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(file));
            if (1 <= numberOfPages) {
                int i2 = 1;
                while (true) {
                    PdfContentByte overContent = pdfStamper.getOverContent(i2);
                    if (overContent != null) {
                        Rectangle pageSize = pdfReader.getPageSize(i2);
                        pageSize.getClass();
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.context.getResources(), R.drawable.app_store_badge), TIFFConstants.TIFFTAG_MINSAMPLEVALUE, 100, true);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                        bitmapCreateScaledBitmap.compress(compressFormat, 100, byteArrayOutputStream);
                        Image image = Image.getInstance(byteArrayOutputStream.toByteArray());
                        image.getClass();
                        image.setAnnotation(new Annotation(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, "https://apps.apple.com/bf/app/gps-map-camera-timestamp/id1503116917"));
                        image.setAbsolutePosition(pageSize.getWidth() - 94.0f, 5.0f);
                        image.scaleAbsolute(70.0f, 25.0f);
                        overContent.addImage(image);
                        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.context.getResources(), R.drawable.play_store_badge), TIFFConstants.TIFFTAG_MINSAMPLEVALUE, 100, true);
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        bitmapCreateScaledBitmap2.compress(compressFormat, 100, byteArrayOutputStream2);
                        Image image2 = Image.getInstance(byteArrayOutputStream2.toByteArray());
                        image2.getClass();
                        image2.setAnnotation(new Annotation(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, "https://play.google.com/store/apps/details?id=com.gpsmapcamera.geotagginglocationonphoto"));
                        image2.setAbsolutePosition(pageSize.getWidth() - 172.0f, 5.0f);
                        image2.scaleAbsolute(70.0f, 25.0f);
                        overContent.addImage(image2);
                    }
                    if (i == 0) {
                        List<? extends View> list = this.pdfPageViewListForLinks;
                        View view = list != null ? (View) hv0.x(i2 - 1, list) : null;
                        if (view != null) {
                            ArrayList<PdfLinkInfo> arrayList = new ArrayList<>();
                            findLinksInView(view, view, i2, arrayList);
                            Iterator<PdfLinkInfo> it = arrayList.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                PdfLinkInfo next = it.next();
                                next.getClass();
                                PdfLinkInfo pdfLinkInfo = next;
                                Rectangle pageSize2 = pdfReader.getPageSize(i2);
                                pdfStamper.addAnnotation(PdfAnnotation.createLink(pdfStamper.getWriter(), new Rectangle(pdfLinkInfo.getRect().left, pageSize2.getHeight() - pdfLinkInfo.getRect().bottom, pdfLinkInfo.getRect().right, pageSize2.getHeight() - pdfLinkInfo.getRect().top), PdfAnnotation.HIGHLIGHT_INVERT, new PdfAction(pdfLinkInfo.getUrl())), i2);
                            }
                        }
                    }
                    if (i2 == numberOfPages) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            pdfStamper.close();
            pdfReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    private final void addViewToTempLayout(LinearLayout linearLayout, View view) {
        linearLayout.addView(view);
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int i6 = i3 / 2;
        int i7 = i4 / 2;
        while (i6 / i5 >= i2 && i7 / i5 >= i) {
            i5 *= 2;
        }
        return i5;
    }

    private final View createBefAftGroup(ComparisonGroup comparisonGroup, int i) {
        Bitmap processedBefAftBitmap;
        Bitmap processedBefAftBitmap2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(24, 8, 24, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        h55 h55Var = new h55(this.context, 1);
        h55Var.b(layoutParams2);
        h65 h65Var = new h65(this.context, 4);
        h65Var.b(layoutParams2);
        h65Var.f(this.context.getColor(R.color.splash_text_color_light));
        ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_medium));
        h65Var.e(comparisonGroup.getGroupName());
        h55Var.e(h65Var);
        h55 h55Var2 = new h55(this.context, 3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams3.setMargins(0, 8, 0, 8);
        h55Var2.b(layoutParams3);
        h55Var2.c.setBackgroundColor(this.context.getColor(R.color.app_sub_text_light));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 0.5f);
        h55 h55Var3 = new h55(this.context, 4);
        h55Var3.b(layoutParams4);
        h55Var3.c(0, 4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, i);
        h55 h55Var4 = new h55(this.context, 2);
        h55Var4.b(layoutParams5);
        if (comparisonGroup.getBeforeImagePath() != null) {
            String beforeImagePath = comparisonGroup.getBeforeImagePath();
            beforeImagePath.getClass();
            String string = this.context.getString(R.string.before);
            string.getClass();
            processedBefAftBitmap = getProcessedBefAftBitmap(beforeImagePath, string, true);
        } else {
            processedBefAftBitmap = null;
        }
        if (processedBefAftBitmap != null) {
            h55Var4.g(processedBefAftBitmap);
        } else if (comparisonGroup.getBeforeImagePath() != null) {
            String beforeImagePath2 = comparisonGroup.getBeforeImagePath();
            beforeImagePath2.getClass();
            h55Var4.h(new File(beforeImagePath2));
        }
        h55Var3.d(h55Var4);
        if (comparisonGroup.getBeforeComment().length() > 0) {
            h55Var3.d(createTextView(comparisonGroup.getBeforeComment()));
        }
        h55 h55Var5 = new h55(this.context, 4);
        h55Var5.b(layoutParams4);
        h55Var5.c(0, 4);
        h55 h55Var6 = new h55(this.context, 2);
        h55Var6.b(layoutParams5);
        if (comparisonGroup.getAfterImagePath() != null) {
            String afterImagePath = comparisonGroup.getAfterImagePath();
            afterImagePath.getClass();
            String string2 = this.context.getString(R.string.after);
            string2.getClass();
            processedBefAftBitmap2 = getProcessedBefAftBitmap(afterImagePath, string2, false);
        } else {
            processedBefAftBitmap2 = null;
        }
        if (processedBefAftBitmap2 != null) {
            h55Var6.g(processedBefAftBitmap2);
        } else if (comparisonGroup.getAfterImagePath() != null) {
            String afterImagePath2 = comparisonGroup.getAfterImagePath();
            afterImagePath2.getClass();
            h55Var6.h(new File(afterImagePath2));
        }
        h55Var5.d(h55Var6);
        if (comparisonGroup.getAfterComment().length() > 0) {
            h55Var5.d(createTextView(comparisonGroup.getAfterComment()));
        }
        h55 h55Var7 = new h55(this.context, 1);
        h55Var7.b(layoutParams2);
        h55Var7.c(0, 3);
        h55Var7.e(h55Var3);
        h55Var7.e(h55Var5);
        h55 h55Var8 = new h55(this.context, 4);
        h55Var8.b(layoutParams);
        h55Var8.c(0, 3);
        h55Var8.d(h55Var);
        h55Var8.d(h55Var2);
        h55Var8.d(h55Var7);
        LinearLayout linearLayout = (LinearLayout) h55Var8.c;
        linearLayout.getClass();
        return linearLayout;
    }

    private final h65 createDetailItemView(String str, String str2) {
        h65 h65Var = new h65(this.context, 5);
        h65Var.b(new LinearLayout.LayoutParams(0, -2, 0.5f));
        ((TextView) h65Var.c).setGravity(16);
        h65Var.f(this.context.getColor(R.color.splash_text_color_light));
        ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_regular));
        h65Var.d(new SpannableString(Html.fromHtml("<b>" + str + "</b> " + str2, 0)));
        return h65Var;
    }

    private final h65 createMapsLinkView(String str) {
        h65 h65Var = new h65(this.context, 5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(12, 2, 0, 0);
        h65Var.b(layoutParams);
        ((TextView) h65Var.c).setGravity(16);
        h65Var.f(this.context.getColor(R.color.splash_text_color_light));
        ((TextView) h65Var.c).setLinkTextColor(Color.parseColor("#0A66EA"));
        ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_medium));
        h65Var.d(new SpannableString(Html.fromHtml("<a href=\"" + str + "\">Open in Google Maps</a>", 0)));
        ((TextView) h65Var.c).setTag(str);
        ((TextView) h65Var.c).setMovementMethod(LinkMovementMethod.getInstance());
        return h65Var;
    }

    private final View createSingleImageBlock(PDFImageModule pDFImageModule, int i) {
        h55 h55Var = new h55(this.context, 4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(24, 8, 24, 0);
        h55Var.b(layoutParams);
        h55 h55Var2 = new h55(this.context, 2);
        h55Var2.b(new LinearLayout.LayoutParams(-1, i, ColumnText.GLOBAL_SPACE_CHAR_RATIO));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        h55Var2.i();
        Bitmap roundedImageBitmap = getRoundedImageBitmap(pDFImageModule);
        if (roundedImageBitmap != null) {
            h55Var2.g(roundedImageBitmap);
        } else if (pDFImageModule.getBitmap() != null) {
            h55Var2.g(pDFImageModule.getBitmap());
        } else {
            String filename = pDFImageModule.getFilename();
            if (filename != null && !ej6.B(filename)) {
                h55Var2.h(new File(pDFImageModule.getFilename()));
            }
        }
        String dateTime = pDFImageModule.getDateTime();
        dateTime.getClass();
        h65 h65VarCreateTextView = createTextView(dateTime);
        String link = pDFImageModule.getLink();
        link.getClass();
        h65 h65VarCreateMapsLinkView = createMapsLinkView(link);
        h55Var.d(h55Var2);
        h55Var.d(h65VarCreateTextView);
        h55Var.d(h65VarCreateMapsLinkView);
        LinearLayout linearLayout = (LinearLayout) h55Var.c;
        linearLayout.getClass();
        return linearLayout;
    }

    private final h65 createTextView(String str) {
        h65 h65Var = new h65(this.context, 5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(12, 6, 0, 0);
        h65Var.b(layoutParams);
        ((TextView) h65Var.c).setGravity(16);
        h65Var.f(this.context.getColor(R.color.splash_text_color_light));
        ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_medium));
        h65Var.e(str);
        return h65Var;
    }

    private final View createTwoImagesRow(PDFImageModule pDFImageModule, PDFImageModule pDFImageModule2, int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(24, 8, 24, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 0.5f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
        h55 h55Var = new h55(this.context, 1);
        h55Var.b(layoutParams);
        h55Var.c(0, 3);
        h55 h55Var2 = new h55(this.context, 4);
        h55Var2.b(layoutParams2);
        h55Var2.c(0, 4);
        h55 h55Var3 = new h55(this.context, 2);
        h55Var3.b(layoutParams3);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        h55Var3.i();
        Bitmap roundedImageBitmap = getRoundedImageBitmap(pDFImageModule);
        if (roundedImageBitmap != null) {
            h55Var3.g(roundedImageBitmap);
        } else if (pDFImageModule.getBitmap() != null) {
            h55Var3.g(pDFImageModule.getBitmap());
        } else {
            String filename = pDFImageModule.getFilename();
            if (filename != null && !ej6.B(filename)) {
                h55Var3.h(new File(pDFImageModule.getFilename()));
            }
        }
        String dateTime = pDFImageModule.getDateTime();
        dateTime.getClass();
        h65 h65VarCreateTextView = createTextView(dateTime);
        String link = pDFImageModule.getLink();
        link.getClass();
        h65 h65VarCreateMapsLinkView = createMapsLinkView(link);
        h55Var2.d(h55Var3);
        h55Var2.d(h65VarCreateTextView);
        h55Var2.d(h65VarCreateMapsLinkView);
        h55Var.e(h55Var2);
        bj bjVar = this.context;
        if (pDFImageModule2 != null) {
            h55 h55Var4 = new h55(bjVar, 4);
            h55Var4.b(layoutParams2);
            h55Var4.c(4, 0);
            h55 h55Var5 = new h55(this.context, 2);
            h55Var5.b(layoutParams3);
            h55Var5.i();
            Bitmap roundedImageBitmap2 = getRoundedImageBitmap(pDFImageModule2);
            if (roundedImageBitmap2 != null) {
                h55Var5.g(roundedImageBitmap2);
            } else if (pDFImageModule2.getBitmap() != null) {
                h55Var5.g(pDFImageModule2.getBitmap());
            } else {
                String filename2 = pDFImageModule2.getFilename();
                if (filename2 != null && !ej6.B(filename2)) {
                    h55Var5.h(new File(pDFImageModule2.getFilename()));
                }
            }
            String dateTime2 = pDFImageModule2.getDateTime();
            dateTime2.getClass();
            h65 h65VarCreateTextView2 = createTextView(dateTime2);
            String link2 = pDFImageModule2.getLink();
            link2.getClass();
            h65 h65VarCreateMapsLinkView2 = createMapsLinkView(link2);
            h55Var4.d(h55Var5);
            h55Var4.d(h65VarCreateTextView2);
            h55Var4.d(h65VarCreateMapsLinkView2);
            h55Var.e(h55Var4);
        } else {
            j65 h55Var6 = new h55(bjVar, 4);
            h55Var6.b(layoutParams2);
            h55Var.e(h55Var6);
        }
        LinearLayout linearLayout = (LinearLayout) h55Var.c;
        linearLayout.getClass();
        return linearLayout;
    }

    private final void findLinksInView(View view, View view2, int i, ArrayList<PdfLinkInfo> arrayList) {
        Object tag = view2.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (lj6.q(str, "http://", false) || lj6.q(str, UrlConst.HTTPS, false)) {
                view2.getDrawingRect(new Rect());
                int left = view2.getLeft();
                int top = view2.getTop();
                for (ViewParent parent = view2.getParent(); parent != null && !parent.equals(view); parent = parent.getParent()) {
                    if (parent instanceof View) {
                        View view3 = (View) parent;
                        int left2 = view3.getLeft() + left;
                        top = view3.getTop() + top;
                        left = left2;
                    }
                }
                arrayList.add(new PdfLinkInfo(i, str, new RectF(left, top, view2.getWidth() + left, view2.getHeight() + top)));
            }
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                childAt.getClass();
                findLinksInView(view, childAt, i, arrayList);
            }
        }
    }

    private final Bitmap getProcessedBefAftBitmap(String str, String str2, boolean z) {
        if (!new File(str).exists()) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = calculateInSampleSize(options, 720, 720);
            options.inJustDecodeBounds = false;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            options.inPreferredConfig = config;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            if (bitmapDecodeFile == null) {
                return null;
            }
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            float fMin = Math.min(width, height);
            float f = 0.05f * fMin;
            float f2 = width;
            canvas.drawRoundRect(new RectF(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, f2, height), f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDecodeFile, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, paint);
            paint.setXfermode(null);
            float f3 = 0.1f * fMin;
            float f4 = 0.4f * f3;
            float f5 = fMin * 0.04f;
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColor(-1);
            paint2.setTextSize(0.5f * f3);
            paint2.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            float f6 = f2 - f5;
            float fMeasureText = f6 - ((f4 * 2.0f) + paint2.measureText(str2));
            RectF rectF = new RectF(fMeasureText, f5, f6, f5 + f3);
            float f7 = 0.25f * f3;
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            paint3.setColor(z ? Color.parseColor("#E94444") : Color.parseColor("#2BDB21"));
            canvas.drawRoundRect(rectF, f7, f7, paint3);
            canvas.drawText(str2, fMeasureText + f4, ((f3 / 2.0f) + f5) - ((paint2.descent() + paint2.ascent()) / 2.0f), paint2);
            if (!bitmapDecodeFile.equals(bitmapCreateBitmap)) {
                bitmapDecodeFile.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Bitmap getRoundedCornerBitmap(Bitmap bitmap, float f) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawRoundRect(new RectF(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, bitmap.getWidth(), bitmap.getHeight()), f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, paint);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    private final Bitmap getRoundedImageBitmap(PDFImageModule pDFImageModule) {
        Bitmap bitmapDecodeFile;
        try {
            if (pDFImageModule.getBitmap() != null) {
                bitmapDecodeFile = pDFImageModule.getBitmap();
            } else {
                String filename = pDFImageModule.getFilename();
                if (filename == null || ej6.B(filename)) {
                    bitmapDecodeFile = null;
                } else {
                    String filename2 = pDFImageModule.getFilename();
                    filename2.getClass();
                    if (new File(filename2).exists()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(pDFImageModule.getFilename(), options);
                        options.inSampleSize = calculateInSampleSize(options, 720, 720);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        bitmapDecodeFile = BitmapFactory.decodeFile(pDFImageModule.getFilename(), options);
                    } else {
                        bitmapDecodeFile = null;
                    }
                }
            }
            if (bitmapDecodeFile == null) {
                return null;
            }
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            float fMin = Math.min(width, height) * 0.05f;
            canvas.drawRoundRect(new RectF(ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, width, height), fMin, fMin, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDecodeFile, ColumnText.GLOBAL_SPACE_CHAR_RATIO, ColumnText.GLOBAL_SPACE_CHAR_RATIO, paint);
            if (pDFImageModule.getBitmap() == null && !bitmapDecodeFile.equals(bitmapCreateBitmap)) {
                bitmapDecodeFile.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final boolean isValueAvailable(String str) {
        return (str == null || ej6.B(str) || bi3.b(ej6.Y(str).toString(), "-")) ? false : true;
    }

    public final void createBefAftPDF(Context context, File file, Bitmap bitmap, Bitmap bitmap2, String str, String str2, String str3, String str4, String str5, LinearLayout linearLayout, ArrayList<ComparisonGroup> arrayList, final i65 i65Var) {
        context.getClass();
        file.getClass();
        bitmap.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        linearLayout.getClass();
        arrayList.getClass();
        i65Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
        View viewInflate = this.context.getLayoutInflater().inflate(R.layout.item_pdf_page, (ViewGroup) linearLayout, false);
        viewInflate.getClass();
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        frameLayout.setBackgroundResource(2131232384);
        bj bjVar = this.context;
        new ArrayList();
        LinearLayout linearLayout2 = new LinearLayout(bjVar);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, ColumnText.GLOBAL_SPACE_CHAR_RATIO));
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = (LinearLayout) getBefAftHeaderView(bitmap2, str, str2, str3).c;
        linearLayout3.setTag(m55.class.getSimpleName());
        linearLayout2.addView(linearLayout3);
        h55 h55Var = new h55(this.context, 4);
        if (str4.length() > 0) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 0.5f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(24, 8, 24, 8);
            h55 h55Var2 = new h55(this.context, 1);
            h55Var2.b(layoutParams3);
            h65 h65Var = new h65(this.context, 3);
            h65Var.b(layoutParams2);
            ((TextView) h65Var.c).setGravity(17);
            h65Var.f(this.context.getColor(R.color.splash_text_color_light));
            ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_medium));
            h65Var.e(str4);
            h55Var2.e(h65Var);
            h55Var.d(h55Var2);
            j65 h55Var3 = new h55(context, 3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 1);
            layoutParams4.setMargins(12, 8, 12, 8);
            h55Var3.b(layoutParams4);
            h55Var3.c.setBackgroundColor(context.getColor(R.color.app_main_light));
            h55Var.d(h55Var3);
        }
        if (str5.length() > 0) {
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(24, 8, 24, 8);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            h55 h55Var4 = new h55(this.context, 1);
            h55Var4.b(layoutParams5);
            h65 h65Var2 = new h65(this.context, 4);
            h65Var2.b(layoutParams6);
            h65Var2.f(this.context.getColor(R.color.splash_text_color_light));
            ((TextView) h65Var2.c).setTypeface(ut5.a(this.context, R.font.rubik_medium));
            h65Var2.e(str5);
            h55Var4.e(h65Var2);
            h55Var.d(h55Var4);
        }
        linearLayout2.addView((LinearLayout) h55Var.c);
        ComparisonGroup comparisonGroup = arrayList.get(0);
        comparisonGroup.getClass();
        linearLayout2.addView(createBefAftGroup(comparisonGroup, TIFFConstants.TIFFTAG_COLORMAP));
        LinearLayout linearLayout4 = (LinearLayout) getFooterView(bitmap).c;
        linearLayout4.setTag(l55.class.getSimpleName());
        linearLayout2.addView(linearLayout4);
        arrayList2.add(frameLayout);
        if (arrayList.size() > 1) {
            List<ComparisonGroup> listSubList = arrayList.subList(1, arrayList.size());
            listSubList.getClass();
            boolean z = false;
            int iA = am8.a(0, listSubList.size() - 1, 2);
            if (iA >= 0) {
                int i = 0;
                while (true) {
                    View viewInflate2 = this.context.getLayoutInflater().inflate(R.layout.item_pdf_page, linearLayout, z);
                    viewInflate2.getClass();
                    FrameLayout frameLayout2 = (FrameLayout) viewInflate2;
                    frameLayout2.setBackgroundResource(2131232384);
                    bj bjVar2 = this.context;
                    new ArrayList();
                    LinearLayout linearLayout5 = new LinearLayout(bjVar2);
                    linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, ColumnText.GLOBAL_SPACE_CHAR_RATIO));
                    linearLayout5.setOrientation(1);
                    linearLayout5.setLayoutParams(layoutParams);
                    frameLayout2.addView(linearLayout5);
                    View view = new View(this.context);
                    view.setLayoutParams(new LinearLayout.LayoutParams(-1, 24));
                    linearLayout5.addView(view);
                    if (i < listSubList.size()) {
                        linearLayout5.addView(createBefAftGroup(listSubList.get(i), TIFFConstants.TIFFTAG_GRAYRESPONSEUNIT));
                    }
                    int i2 = i + 1;
                    if (i2 < listSubList.size()) {
                        View view2 = new View(this.context);
                        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, 1);
                        layoutParams7.setMargins(24, 12, 24, 12);
                        view2.setLayoutParams(layoutParams7);
                        view2.setBackgroundColor(this.context.getColor(R.color.box_bg_light));
                        linearLayout5.addView(view2);
                        View viewCreateBefAftGroup = createBefAftGroup(listSubList.get(i2), TIFFConstants.TIFFTAG_GRAYRESPONSEUNIT);
                        ViewGroup.LayoutParams layoutParams8 = viewCreateBefAftGroup.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams9 = layoutParams8 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams8 : null;
                        if (layoutParams9 != null) {
                            layoutParams9.topMargin = 0;
                        }
                        linearLayout5.addView(viewCreateBefAftGroup);
                    }
                    LinearLayout linearLayout6 = (LinearLayout) getFooterView(bitmap).c;
                    linearLayout6.setTag(l55.class.getSimpleName());
                    linearLayout5.addView(linearLayout6);
                    arrayList2.add(frameLayout2);
                    if (i == iA) {
                        break;
                    }
                    i += 2;
                    z = false;
                }
            }
        }
        this.pdfPageViewListForLinks = arrayList2;
        if (c66.i == null) {
            c66.i = new c66(14);
        }
        String string = file.toString();
        i65 i65Var2 = new i65() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.GeneratePDF.createBefAftPDF.1
            @Override // defpackage.i65
            public void pdfGenerationFailure(Exception exc) {
                i65Var.pdfGenerationFailure(exc);
            }

            @Override // defpackage.i65
            public void pdfGenerationSuccess(File file2) {
                try {
                    GeneratePDF.this.getPagePreviewBitmapList().clear();
                    GeneratePDF.this.getPagePreviewBitmapList().addAll(c66.o(file2));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i65Var.pdfGenerationSuccess(file2);
            }
        };
        m82 m82Var = new m82();
        m82Var.c = arrayList2;
        m82Var.b = string;
        m82Var.d = i65Var2;
        m82Var.execute(new Void[0]);
    }

    public final void createPDF(File file, Context context, Bitmap bitmap, Bitmap bitmap2, String str, String str2, String str3, String str4, String str5, String str6, String str7, LinearLayout linearLayout, ArrayList<PDFImageModule> arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, final i65 i65Var) {
        ArrayList<PDFImageModule> arrayList2;
        file.getClass();
        context.getClass();
        bitmap.getClass();
        bitmap2.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        linearLayout.getClass();
        arrayList.getClass();
        i65Var.getClass();
        ArrayList arrayList3 = new ArrayList();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
        View viewInflate = this.context.getLayoutInflater().inflate(R.layout.item_pdf_page, (ViewGroup) linearLayout, false);
        viewInflate.getClass();
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        frameLayout.setBackgroundResource(2131232384);
        new ArrayList();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, ColumnText.GLOBAL_SPACE_CHAR_RATIO));
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(linearLayout2);
        LinearLayout.LayoutParams layoutParams2 = layoutParams;
        int i = -1;
        LinearLayout linearLayout3 = (LinearLayout) getHeaderView(bitmap2, str, str2, z6 && isValueAvailable(str), z5).c;
        linearLayout3.setTag(m55.class.getSimpleName());
        linearLayout2.addView(linearLayout3);
        ArrayList arrayList4 = new ArrayList();
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, ColumnText.GLOBAL_SPACE_CHAR_RATIO));
        linearLayout4.setOrientation(1);
        if (z7 && isValueAvailable(str7)) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2, 0.5f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(24, 8, 24, 8);
            Drawable drawable = context.getDrawable(R.drawable.pdftitlebg);
            h55 h55Var = new h55(context, 1);
            h55Var.b(layoutParams4);
            h55Var.c.setBackground(drawable);
            h65 h65Var = new h65(context, 5);
            h65Var.b(layoutParams3);
            ((TextView) h65Var.c).setGravity(17);
            h65Var.f(context.getColor(R.color.splash_text_color_light));
            ((TextView) h65Var.c).setTypeface(ut5.a(context, R.font.rubik_medium));
            h65Var.e(str7);
            h55Var.e(h65Var);
            linearLayout4.addView(h55Var.a());
            if (h55Var.b) {
                qj.l("View already has parent");
                return;
            } else {
                h55Var.b = true;
                arrayList4.add(h55Var);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (z && isValueAvailable(str3)) {
            arrayList5.add(new u65(this.context.getString(R.string.supervisor_), str3));
        }
        if (z4 && isValueAvailable(str6)) {
            arrayList5.add(new u65(this.context.getString(R.string.project_name_), str6));
        }
        if (z2 && isValueAvailable(str4)) {
            arrayList5.add(new u65(this.context.getString(R.string.report_by_), str4));
        }
        if (z3 && isValueAvailable(str5)) {
            arrayList5.add(new u65(this.context.getString(R.string.remark_), str5));
        }
        boolean z8 = false;
        int iA = am8.a(0, arrayList5.size() - 1, 2);
        int i2 = 4;
        if (iA >= 0) {
            int i3 = 0;
            while (true) {
                h55 h55Var2 = new h55(this.context, 1);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i, -2);
                layoutParams5.setMargins(24, i2, 24, i2);
                h55Var2.b(layoutParams5);
                h55Var2.e(createDetailItemView((String) ((u65) arrayList5.get(i3)).a, (String) ((u65) arrayList5.get(i3)).b));
                int i4 = i3 + 1;
                if (i4 < arrayList5.size()) {
                    h55Var2.e(createDetailItemView((String) ((u65) arrayList5.get(i4)).a, (String) ((u65) arrayList5.get(i4)).b));
                } else {
                    h65 h65Var2 = new h65(context, 5);
                    h65Var2.b(new LinearLayout.LayoutParams(0, -2, 0.5f));
                    h55Var2.e(h65Var2);
                }
                linearLayout4.addView(h55Var2.a());
                if (!h55Var2.b) {
                    h55Var2.b = true;
                    arrayList4.add(h55Var2);
                    if (i3 == iA) {
                        break;
                    }
                    i3 += 2;
                    i2 = 4;
                    i = -1;
                } else {
                    qj.l("View already has parent");
                    return;
                }
            }
        }
        linearLayout2.addView(linearLayout4);
        if (arrayList.isEmpty()) {
            arrayList2 = arrayList;
        } else if (arrayList.size() == 1) {
            arrayList2 = arrayList;
            PDFImageModule pDFImageModule = arrayList2.get(0);
            pDFImageModule.getClass();
            linearLayout2.addView(createSingleImageBlock(pDFImageModule, 580));
        } else {
            arrayList2 = arrayList;
            PDFImageModule pDFImageModule2 = arrayList2.get(0);
            pDFImageModule2.getClass();
            linearLayout2.addView(createTwoImagesRow(pDFImageModule2, arrayList2.get(1), 360));
        }
        LinearLayout linearLayout5 = (LinearLayout) getFooterView(bitmap).c;
        linearLayout5.setTag(l55.class.getSimpleName());
        linearLayout2.addView(linearLayout5);
        arrayList3.add(frameLayout);
        if (arrayList2.size() > 2) {
            List<PDFImageModule> listSubList = arrayList2.subList(2, arrayList2.size());
            listSubList.getClass();
            int iA2 = am8.a(0, listSubList.size() - 1, 4);
            if (iA2 >= 0) {
                int i5 = 0;
                while (true) {
                    View viewInflate2 = this.context.getLayoutInflater().inflate(R.layout.item_pdf_page, linearLayout, z8);
                    viewInflate2.getClass();
                    FrameLayout frameLayout2 = (FrameLayout) viewInflate2;
                    frameLayout2.setBackgroundResource(2131232384);
                    new ArrayList();
                    LinearLayout linearLayout6 = new LinearLayout(context);
                    linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, ColumnText.GLOBAL_SPACE_CHAR_RATIO));
                    linearLayout6.setOrientation(1);
                    LinearLayout.LayoutParams layoutParams6 = layoutParams2;
                    linearLayout6.setLayoutParams(layoutParams6);
                    frameLayout2.addView(linearLayout6);
                    View view = new View(context);
                    view.setLayoutParams(new LinearLayout.LayoutParams(-1, 24));
                    linearLayout6.addView(view);
                    if (i5 < listSubList.size()) {
                        PDFImageModule pDFImageModule3 = listSubList.get(i5);
                        pDFImageModule3.getClass();
                        int i6 = i5 + 1;
                        linearLayout6.addView(createTwoImagesRow(pDFImageModule3, i6 < listSubList.size() ? listSubList.get(i6) : null, TIFFConstants.TIFFTAG_COLORMAP));
                    }
                    int i7 = i5 + 2;
                    if (i7 < listSubList.size()) {
                        PDFImageModule pDFImageModule4 = listSubList.get(i7);
                        pDFImageModule4.getClass();
                        int i8 = i5 + 3;
                        linearLayout6.addView(createTwoImagesRow(pDFImageModule4, i8 < listSubList.size() ? listSubList.get(i8) : null, TIFFConstants.TIFFTAG_COLORMAP));
                    }
                    LinearLayout linearLayout7 = (LinearLayout) getFooterView(bitmap).c;
                    linearLayout7.setTag(l55.class.getSimpleName());
                    linearLayout6.addView(linearLayout7);
                    arrayList3.add(frameLayout2);
                    if (i5 == iA2) {
                        break;
                    }
                    i5 += 4;
                    layoutParams2 = layoutParams6;
                    z8 = false;
                }
            }
        }
        this.pdfPageViewListForLinks = arrayList3;
        if (c66.i == null) {
            c66.i = new c66(14);
        }
        String string = file.toString();
        i65 i65Var2 = new i65() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.GeneratePDF.createPDF.1
            @Override // defpackage.i65
            public void pdfGenerationFailure(Exception exc) {
                i65Var.pdfGenerationFailure(exc);
            }

            @Override // defpackage.i65
            public void pdfGenerationSuccess(File file2) {
                try {
                    GeneratePDF.this.getPagePreviewBitmapList().clear();
                    GeneratePDF.this.getPagePreviewBitmapList().addAll(c66.o(file2));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i65Var.pdfGenerationSuccess(file2);
            }
        };
        m82 m82Var = new m82();
        m82Var.c = arrayList3;
        m82Var.b = string;
        m82Var.d = i65Var2;
        m82Var.execute(new Void[0]);
    }

    public final void generateBefAftPdf(Context context, File file, Bitmap bitmap, Bitmap bitmap2, String str, String str2, String str3, String str4, String str5, final LinearLayout linearLayout, ArrayList<ComparisonGroup> arrayList, final nj2 nj2Var, final pj2 pj2Var) {
        context.getClass();
        file.getClass();
        bitmap.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        linearLayout.getClass();
        arrayList.getClass();
        nj2Var.getClass();
        pj2Var.getClass();
        createBefAftPDF(context, file, bitmap, bitmap2, str, str2, str3, str4, str5, linearLayout, arrayList, new i65() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.GeneratePDF.generateBefAftPdf.1
            @Override // defpackage.i65
            public void pdfGenerationFailure(Exception exc) {
                pj2 pj2Var2 = pj2Var;
                exc.getClass();
                pj2Var2.invoke(exc);
                LinearLayout linearLayout2 = linearLayout;
                linearLayout2.getClass();
                linearLayout2.removeAllViews();
                linearLayout.setVisibility(8);
            }

            @Override // defpackage.i65
            public void pdfGenerationSuccess(File file2) {
                file2.getClass();
                GeneratePDF.this.addLogowithlink(file2, 1);
                nj2Var.invoke();
                LinearLayout linearLayout2 = linearLayout;
                linearLayout2.getClass();
                linearLayout2.removeAllViews();
                linearLayout.setVisibility(8);
            }
        });
    }

    public final void generateCompletePdf(Context context, File file, Bitmap bitmap, Bitmap bitmap2, String str, String str2, String str3, String str4, String str5, String str6, String str7, final LinearLayout linearLayout, ArrayList<PDFImageModule> arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, final nj2 nj2Var, final pj2 pj2Var) {
        context.getClass();
        file.getClass();
        bitmap.getClass();
        bitmap2.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        linearLayout.getClass();
        arrayList.getClass();
        nj2Var.getClass();
        pj2Var.getClass();
        createPDF(file, context, bitmap, bitmap2, str, str2, str3, str4, str5, str6, str7, linearLayout, arrayList, z, z2, z3, z4, z5, z6, z7, new i65() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.GeneratePDF.generateCompletePdf.1
            @Override // defpackage.i65
            public void pdfGenerationFailure(Exception exc) {
                pj2 pj2Var2 = pj2Var;
                exc.getClass();
                pj2Var2.invoke(exc);
                LinearLayout linearLayout2 = linearLayout;
                linearLayout2.getClass();
                linearLayout2.removeAllViews();
                linearLayout.setVisibility(8);
            }

            @Override // defpackage.i65
            public void pdfGenerationSuccess(File file2) {
                file2.getClass();
                GeneratePDF.this.addLogowithlink(file2, 0);
                nj2Var.invoke();
                LinearLayout linearLayout2 = linearLayout;
                linearLayout2.getClass();
                linearLayout2.removeAllViews();
                linearLayout.setVisibility(8);
            }
        });
    }

    public final m55 getBefAftHeaderView(Bitmap bitmap, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        m55 m55Var = new m55(this.context, 4);
        h55 h55Var = new h55(this.context, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
        layoutParams.setMargins(12, 8, 12, 8);
        layoutParams.gravity = 16;
        h55Var.b(layoutParams);
        if (bitmap != null) {
            h55 h55Var2 = new h55(this.context, 2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(48, -1, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            h55Var2.i();
            h55Var2.g(getRoundedCornerBitmap(bitmap, bitmap.getWidth() * 0.12f));
            layoutParams2.setMargins(0, 0, 0, 0);
            h55Var2.b(layoutParams2);
            h55Var.e(h55Var2);
        }
        if (str.length() > 0) {
            h65 h65Var = new h65(this.context, 3);
            h65Var.d(new SpannableString(str));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1, 1.1f);
            layoutParams3.setMargins(8, 0, 0, 0);
            h65Var.b(layoutParams3);
            ((TextView) h65Var.c).setGravity(16);
            ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_medium));
            h65Var.f(this.context.getColor(R.color.splash_text_color_light));
            h55Var.e(h65Var);
        }
        h65 h65Var2 = new h65(this.context, 4);
        SpannableString spannableString = new SpannableString(str2);
        if (str3.length() > 0) {
            SpannableString spannableString2 = new SpannableString(str3);
            h65Var2.e(this.context.getString(R.string.prepared_by) + " " + ((Object) spannableString2) + "\n" + ((Object) spannableString));
        } else {
            h65Var2.d(spannableString);
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 0.9f);
        layoutParams4.setMargins(0, 0, 4, 0);
        h65Var2.b(layoutParams4);
        ((TextView) h65Var2.c).setGravity(8388661);
        ((TextView) h65Var2.c).setTypeface(ut5.a(this.context, R.font.rubik_regular));
        h65Var2.f(this.context.getColor(R.color.splash_text_color_light));
        h55Var.e(h65Var2);
        m55Var.j(h55Var);
        return m55Var;
    }

    public final bj getContext() {
        return this.context;
    }

    public final l55 getFooterView(Bitmap bitmap) {
        bitmap.getClass();
        l55 l55Var = new l55(this.context);
        h55 h55Var = new h55(this.context, 1);
        h55Var.c.setBackground(this.context.getDrawable(R.drawable.ic_pdf_bg));
        h55 h55Var2 = new h55(this.context, 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(28, 28, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        h55Var2.i();
        h55Var2.g(bitmap);
        layoutParams.gravity = 8388627;
        layoutParams.setMargins(12, 3, 0, 3);
        h55Var2.b(layoutParams);
        h65 h65Var = new h65(this.context, 5);
        h65Var.d(new SpannableString(Html.fromHtml("<b>GPS Map Camera</b>", 0)));
        h65Var.c(0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.setMargins(8, 0, 0, 0);
        h65Var.b(layoutParams2);
        h65Var.f(this.context.getColor(R.color.app_text_main_light));
        ((TextView) h65Var.c).setGravity(16);
        ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_regular));
        h55Var.e(h55Var2);
        h55Var.e(h65Var);
        l55Var.j(h55Var);
        return l55Var;
    }

    public final m55 getHeaderView(Bitmap bitmap, String str, String str2, boolean z, boolean z2) {
        bitmap.getClass();
        str.getClass();
        str2.getClass();
        m55 m55Var = new m55(this.context, 4);
        h55 h55Var = new h55(this.context, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
        layoutParams.setMargins(24, 8, 24, 8);
        h55Var.b(layoutParams);
        if (z2) {
            h55 h55Var2 = new h55(this.context, 2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(48, 48, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            h55Var2.i();
            h55Var2.g(getRoundedCornerBitmap(bitmap, bitmap.getWidth() * 0.12f));
            layoutParams2.setMargins(0, 0, 10, 0);
            h55Var2.b(layoutParams2);
            h55Var.e(h55Var2);
        }
        if (z) {
            h65 h65Var = new h65(this.context, 3);
            h65Var.d(new SpannableString(str));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            layoutParams3.setMargins(16, 0, 0, 0);
            h65Var.b(layoutParams3);
            ((TextView) h65Var.c).setGravity(16);
            ((TextView) h65Var.c).setTypeface(ut5.a(this.context, R.font.rubik_medium));
            h65Var.f(this.context.getColor(R.color.splash_text_color_light));
            h55Var.e(h65Var);
        }
        h65 h65Var2 = new h65(this.context, 5);
        h65Var2.d(new SpannableString(str2));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.setMargins(0, 0, 4, 0);
        h65Var2.b(layoutParams4);
        ((TextView) h65Var2.c).setGravity(8388629);
        ((TextView) h65Var2.c).setTypeface(ut5.a(this.context, R.font.rubik_regular));
        h65Var2.f(this.context.getColor(R.color.splash_text_color_light));
        h55Var.e(h65Var2);
        m55Var.j(h55Var);
        return m55Var;
    }

    public final ArrayList<Bitmap> getPagePreviewBitmapList() {
        return this.pagePreviewBitmapList;
    }

    public final List<View> getPdfPageViewListForLinks() {
        return this.pdfPageViewListForLinks;
    }

    public final File getSavedPDFFile() {
        return this.savedPDFFile;
    }

    public final void setPagePreviewBitmapList(ArrayList<Bitmap> arrayList) {
        arrayList.getClass();
        this.pagePreviewBitmapList = arrayList;
    }

    public final void setPdfPageViewListForLinks(List<? extends View> list) {
        this.pdfPageViewListForLinks = list;
    }

    public final void setSavedPDFFile(File file) {
        this.savedPDFFile = file;
    }
}