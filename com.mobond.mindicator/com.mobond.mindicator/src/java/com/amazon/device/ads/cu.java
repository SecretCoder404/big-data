/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.amazon.device.ads;

import android.view.ViewTreeObserver;
import com.amazon.device.ads.ag;
import com.amazon.device.ads.ct;
import com.amazon.device.ads.cu;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ds;
import com.amazon.device.ads.dt;
import com.amazon.device.ads.h;

class cu
implements dt {
    private static final String a = "cu";
    private ct b;
    private final cy c = new cz().a(a);

    cu(ct ct2) {
        this.b = ct2;
    }

    static /* synthetic */ ct a(cu cu2) {
        return cu2.b;
    }

    private void a(h h2) {
        h2.a("mraidBridge.ready();");
    }

    private void b(ds ds2, h h2) {
        String string = ds2.a("IS_VIEWABLE");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mraidBridge.viewableChange(");
        stringBuilder.append(string);
        stringBuilder.append(");");
        h2.a(stringBuilder.toString());
    }

    private void b(h h2) {
        h2.a(new ViewTreeObserver.OnGlobalLayoutListener(this, h2){
            final /* synthetic */ h a;
            final /* synthetic */ cu b;
            {
                this.b = cu2;
                this.a = h2;
            }

            public void onGlobalLayout() {
                com.amazon.device.ads.dk dk2 = this.a.g();
                if (dk2 != null) {
                    this.a.b(this);
                    cu.a(this.b).a(dk2.a().a(), dk2.a().b(), dk2.b(), dk2.c());
                    cu.a(this.b).q();
                }
            }
        });
    }

    private void c(ds ds2, h h2) {
        String string = ds2.a("bridgeName");
        if (string != null && string.equals((Object)this.b.c())) {
            switch (2.b[h2.f().ordinal()]) {
                default: {
                    return;
                }
                case 3: {
                    if (h2.m()) break;
                    this.c(h2);
                    this.a(h2);
                    return;
                }
                case 1: 
                case 2: {
                    this.b(h2);
                    this.c(h2);
                    this.a(h2);
                }
            }
        }
    }

    private void c(h h2) {
        h2.a("mraidBridge.stateChange('default');");
    }

    private void d(h h2) {
        if (h2.f().equals((Object)ag.h)) {
            this.b.a(h2);
            return;
        }
        if (h2.f().equals((Object)ag.g)) {
            h2.a("mraidBridge.stateChange('hidden');");
            h2.a("mraidBridge.viewableChange('false');");
        }
    }

    @Override
    public void a(ds ds2, h h2) {
        this.c.d(ds2.a().toString());
        switch (2.a[ds2.a().ordinal()]) {
            default: {
                return;
            }
            case 9: {
                this.b(ds2, h2);
                return;
            }
            case 8: {
                this.c(ds2, h2);
                return;
            }
            case 6: 
            case 7: {
                h2.a("mraidBridge.stateChange('hidden');");
                return;
            }
            case 5: {
                this.b.p();
                return;
            }
            case 4: {
                this.d(h2);
                return;
            }
            case 3: {
                this.b(h2);
                this.c(h2);
                this.a(h2);
                return;
            }
            case 2: {
                this.c(h2);
                this.a(h2);
            }
            case 1: 
        }
    }
}

