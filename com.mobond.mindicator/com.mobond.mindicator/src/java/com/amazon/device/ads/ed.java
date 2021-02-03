/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import com.amazon.device.ads.aq;
import com.amazon.device.ads.bk;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dw;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ez;
import org.json.JSONObject;

class ed
extends dw {
    private static final cv.a c = cv.a.Q;
    private final bn d;
    private final cv e;

    public ed(aq aq2) {
        this(aq2, cx.a(), bk.a(), bn.a(), cv.a());
    }

    ed(aq aq2, cx cx2, bk bk2, bn bn2, cv cv2) {
        super(new cz(), "SISUpdateDeviceInfoRequest", c, "/update_dev_info", aq2, cx2, bk2);
        this.d = bn2;
        this.e = cv2;
    }

    @Override
    public ez.b a() {
        String string = this.d.a("debug.adid", this.b().e());
        ez.b b2 = super.a();
        if (!eh.a(string)) {
            b2.a("adId", string);
        }
        return b2;
    }

    @Override
    public void a(JSONObject jSONObject) {
        super.a(jSONObject);
        if (co.a(jSONObject, "idChanged", false)) {
            this.e.b().a(cv.a.O);
        }
    }
}

