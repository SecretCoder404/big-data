/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.AssetManager
 *  android.graphics.Color
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.os.Bundle
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.os.Vibrator
 *  android.view.View
 *  android.view.Window
 *  androidx.appcompat.app.e
 *  java.io.FileDescriptor
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui.lt;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.e;
import com.mobond.mindicator.ui.lt.DialogActivity;
import java.io.FileDescriptor;

public class DialogActivity
extends e {
    Vibrator a;

    private void a() {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            AssetFileDescriptor assetFileDescriptor = this.getAssets().openFd("r.mp3");
            mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            assetFileDescriptor.close();
            mediaPlayer.prepare();
            mediaPlayer.setVolume(1.0f, 1.0f);
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this){
                final /* synthetic */ DialogActivity a;
                {
                    this.a = dialogActivity;
                }

                public void onCompletion(MediaPlayer mediaPlayer) {
                }
            });
            mediaPlayer.start();
        }
        catch (Exception exception) {}
    }

    private void a(Context context, String string, String string2) {
        String string3;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 5).setCancelable(false).setMessage((CharSequence)string);
        if (string2 != null) {
            builder.setTitle((CharSequence)string2);
        }
        if ((string3 = this.getIntent().getAction()) != null && string3.equals((Object)"staion_alarm")) {
            builder.setIcon(2131230816);
            builder.setPositiveButton((CharSequence)"DISMISS", new DialogInterface.OnClickListener(this){
                final /* synthetic */ DialogActivity a;
                {
                    this.a = dialogActivity;
                }

                public void onClick(DialogInterface dialogInterface, int n2) {
                    this.a.finish();
                }
            });
            if (this.a.hasVibrator()) {
                long[] arrl = new long[]{500L, 1000L, 500L, 1000L, 500L, 1000L, 500L, 1000L, 500L, 1000L, 500L, 1000L};
                this.a.vibrate(arrl, 10);
            }
            this.a();
            this.b();
        } else {
            builder.setPositiveButton((CharSequence)"OK", new DialogInterface.OnClickListener(this){
                final /* synthetic */ DialogActivity a;
                {
                    this.a = dialogActivity;
                }

                public void onClick(DialogInterface dialogInterface, int n2) {
                    this.a.finish();
                }
            });
        }
        builder.create().show();
    }

    private void b() {
        this.getWindow().addFlags(6815872);
        PowerManager.WakeLock wakeLock = ((PowerManager)this.getSystemService("power")).newWakeLock(268435466, "androidtest:mywakelock");
        wakeLock.acquire(15000L);
        wakeLock.release();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492893);
        this.a = (Vibrator)this.getSystemService("vibrator");
        this.a((Context)this, this.getIntent().getStringExtra("message"), this.getIntent().getStringExtra("title"));
        this.findViewById(2131297186).setBackgroundColor(Color.parseColor((String)"#0FBBFFFF"));
    }

    protected void onDestroy() {
        super.onDestroy();
        this.a.cancel();
    }
}

