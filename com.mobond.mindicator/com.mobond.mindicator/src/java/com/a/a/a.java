/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.String
 */
package com.a.a;

import android.content.Intent;
import com.a.a.k;
import com.a.a.u;

public class a
extends u {
    private Intent b;

    public a() {
    }

    public a(k k2) {
        super(k2);
    }

    public String getMessage() {
        if (this.b != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}

