/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.a.a.a.a.b;

import d.a.a.a.a.e.c;
import d.a.a.a.a.e.d;
import d.a.a.a.a.e.e;
import d.a.a.a.i;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class a {
    public static final String ACCEPT_JSON_VALUE = "application/json";
    public static final String ANDROID_CLIENT_TYPE = "android";
    public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
    public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    public static final int DEFAULT_TIMEOUT = 10000;
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
    public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
    public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
    public static final String HEADER_USER_AGENT = "User-Agent";
    private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile((String)"http(s?)://[^\\/]+", (int)2);
    protected final i kit;
    private final c method;
    private final String protocolAndHostOverride;
    private final e requestFactory;
    private final String url;

    public a(i i2, String string, String string2, e e2, c c2) {
        if (string2 != null) {
            if (e2 != null) {
                this.kit = i2;
                this.protocolAndHostOverride = string;
                this.url = this.overrideProtocolAndHost(string2);
                this.requestFactory = e2;
                this.method = c2;
                return;
            }
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    private String overrideProtocolAndHost(String string) {
        if (!d.a.a.a.a.b.i.d(this.protocolAndHostOverride)) {
            string = PROTOCOL_AND_HOST_PATTERN.matcher((CharSequence)string).replaceFirst(this.protocolAndHostOverride);
        }
        return string;
    }

    protected d getHttpRequest() {
        return this.getHttpRequest((Map<String, String>)Collections.emptyMap());
    }

    protected d getHttpRequest(Map<String, String> map) {
        d d2 = this.requestFactory.a(this.method, this.getUrl(), map).a(false).a(10000);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CRASHLYTICS_USER_AGENT);
        stringBuilder.append(this.kit.getVersion());
        return d2.a(HEADER_USER_AGENT, stringBuilder.toString()).a(HEADER_DEVELOPER_TOKEN, CLS_ANDROID_SDK_DEVELOPER_TOKEN);
    }

    protected String getUrl() {
        return this.url;
    }
}

