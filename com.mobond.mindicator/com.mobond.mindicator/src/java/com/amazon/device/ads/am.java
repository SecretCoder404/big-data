/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.net.Uri
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.MediaController
 *  android.widget.VideoView
 *  com.amazon.device.ads.cy
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;

class am
implements MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener {
    private static String a = "am";
    private final cy b = new cz().a(a);
    private a c;
    private String d;
    private boolean e = false;
    private Context f;
    private VideoView g = null;
    private ViewGroup.LayoutParams h = null;
    private ViewGroup i = null;

    public am(Context context) {
        this.f = context;
    }

    private void d() {
        VideoView videoView = new VideoView(this.f);
        videoView.setOnCompletionListener((MediaPlayer.OnCompletionListener)this);
        videoView.setOnErrorListener((MediaPlayer.OnErrorListener)this);
        videoView.setLayoutParams(this.h);
        this.g = videoView;
        this.i.addView((View)this.g);
    }

    private void e() {
        Uri uri = Uri.parse((String)this.d);
        this.g.setVideoURI(uri);
    }

    private void f() {
        this.b.d("in displayPlayerControls");
        MediaController mediaController = new MediaController(this.f);
        this.g.setMediaController(mediaController);
        mediaController.setAnchorView((View)this.g);
        mediaController.requestFocus();
    }

    private void g() {
        this.b.d("in removePlayerFromParent");
        this.i.removeView((View)this.g);
    }

    public void a() {
        this.b.d("in playVideo");
        this.d();
        this.e();
        this.b();
    }

    public void a(ViewGroup.LayoutParams layoutParams) {
        this.h = layoutParams;
    }

    public void a(ViewGroup viewGroup) {
        this.i = viewGroup;
    }

    public void a(a a2) {
        this.c = a2;
    }

    public void a(String string) {
        this.e = false;
        this.d = string;
    }

    public void b() {
        this.b.d("in startPlaying");
        this.f();
        this.g.start();
    }

    public void c() {
        this.b.d("in releasePlayer");
        if (this.e) {
            return;
        }
        this.e = true;
        this.g.stopPlayback();
        this.g();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.c();
        a a2 = this.c;
        if (a2 != null) {
            a2.a();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        this.g();
        a a2 = this.c;
        if (a2 != null) {
            a2.b();
        }
        return false;
    }

    public static interface a {
        public void a();

        public void b();
    }

}

