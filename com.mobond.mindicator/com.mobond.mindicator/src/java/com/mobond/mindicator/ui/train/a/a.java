/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.mobond.mindicator.ui.train.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class a
implements SensorEventListener {
    private a a;
    private SensorManager b;
    private Sensor c;
    private Sensor d;
    private float[] e = new float[3];
    private float[] f = new float[3];
    private float g;
    private float h;

    public a(Context context) {
        this.b = (SensorManager)context.getSystemService("sensor");
        this.c = this.b.getDefaultSensor(1);
        this.d = this.b.getDefaultSensor(2);
    }

    public void a() {
        this.b.registerListener((SensorEventListener)this, this.c, 1);
        this.b.registerListener((SensorEventListener)this, this.d, 1);
    }

    public void a(a a2) {
        this.a = a2;
    }

    public void b() {
        this.b.unregisterListener((SensorEventListener)this);
    }

    public void onAccuracyChanged(Sensor sensor, int n2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onSensorChanged(SensorEvent sensorEvent) {
        a a2 = this;
        synchronized (a2) {
            float[] arrf;
            if (sensorEvent.sensor.getType() == 1) {
                this.e[0] = 0.97f * this.e[0] + 0.029999971f * sensorEvent.values[0];
                this.e[1] = 0.97f * this.e[1] + 0.029999971f * sensorEvent.values[1];
                this.e[2] = 0.97f * this.e[2] + 0.029999971f * sensorEvent.values[2];
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f[0] = 0.97f * this.f[0] + 0.029999971f * sensorEvent.values[0];
                this.f[1] = 0.97f * this.f[1] + 0.029999971f * sensorEvent.values[1];
                this.f[2] = 0.97f * this.f[2] + 0.029999971f * sensorEvent.values[2];
            }
            if (SensorManager.getRotationMatrix((float[])(arrf = new float[9]), (float[])new float[9], (float[])this.e, (float[])this.f)) {
                float[] arrf2 = new float[3];
                SensorManager.getOrientation((float[])arrf, (float[])arrf2);
                this.g = (float)Math.toDegrees((double)arrf2[0]);
                this.g = (360.0f + (this.g + this.h)) % 360.0f;
                if (this.a != null) {
                    this.a.a(this.g);
                }
            }
            return;
        }
    }

    public static interface a {
        public void a(float var1);
    }

}

