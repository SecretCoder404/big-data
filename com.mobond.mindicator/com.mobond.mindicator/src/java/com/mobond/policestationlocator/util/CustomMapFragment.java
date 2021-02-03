/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.fragment.app.e
 *  com.google.android.gms.maps.SupportMapFragment
 */
package com.mobond.policestationlocator.util;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.google.android.gms.maps.SupportMapFragment;
import com.mobond.policestationlocator.util.a;

public class CustomMapFragment
extends SupportMapFragment {
    private View a;
    private a b;

    public void a(a.a a2) {
        this.b.setOnTouchListener(a2);
    }

    public View getView() {
        return this.a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.b = new a((Context)this.getActivity());
        this.b.addView(this.a);
        return this.b;
    }
}

