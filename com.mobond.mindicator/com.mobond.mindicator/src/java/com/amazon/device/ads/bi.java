/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.at
 *  com.amazon.device.ads.bb
 *  com.amazon.device.ads.db
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.amazon.device.ads;

import com.amazon.device.ads.a;
import com.amazon.device.ads.ac;
import com.amazon.device.ads.at;
import com.amazon.device.ads.bb;
import com.amazon.device.ads.db;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class bi {
    private static bi a = new bi();
    private HashMap<a, HashSet<ac>> b;
    private HashMap<String, HashSet<ac>> c;
    private HashMap<String, Pattern> d;
    private HashMap<String, HashSet<ac>> e;
    private final bb f;

    bi() {
        this(new bb());
        this.b();
    }

    bi(bb bb2) {
        this.f = bb2;
    }

    public static bi a() {
        return a;
    }

    private Pattern c(String string) {
        Pattern pattern = (Pattern)this.d.get((Object)string);
        if (pattern == null) {
            pattern = Pattern.compile((String)string);
            this.d.put((Object)string, (Object)pattern);
        }
        return pattern;
    }

    public Set<ac> a(a a2) {
        Set set = (Set)this.b.get((Object)a2);
        if (set == null) {
            set = new HashSet();
        }
        set.add((Object)this.f);
        return set;
    }

    public Set<ac> a(String string) {
        HashSet hashSet = new HashSet();
        for (String string2 : this.c.keySet()) {
            if (!this.c(string2).matcher((CharSequence)string).find()) continue;
            hashSet.addAll((Collection)this.c.get((Object)string2));
        }
        hashSet.add((Object)this.f);
        return hashSet;
    }

    public void a(a a2, ac ac2) {
        HashSet hashSet = (HashSet)this.b.get((Object)a2);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.b.put((Object)a2, (Object)hashSet);
        }
        hashSet.add((Object)ac2);
    }

    public void a(String string, ac ac2) {
        this.b(string, ac2);
        this.c(string, ac2);
    }

    public Set<ac> b(String string) {
        HashSet hashSet = new HashSet();
        for (String string2 : this.e.keySet()) {
            if (!this.c(string2).matcher((CharSequence)string).find()) continue;
            hashSet.addAll((Collection)this.e.get((Object)string2));
        }
        hashSet.add((Object)this.f);
        return hashSet;
    }

    void b() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.a("amazon.js", (ac)new at());
        db db2 = new db();
        this.a(a.b, (ac)db2);
        this.a(a.c, (ac)db2);
        this.a(a.d, (ac)db2);
        this.a("mraid.js", (ac)db2);
    }

    public void b(String string, ac ac2) {
        String string2 = String.format((String)"<[Ss][Cc][Rr][Ii][Pp][Tt](\\s[^>]*\\s|\\s)[Ss][Rr][Cc]\\s*=\\s*[\"']%s[\"']", (Object[])new Object[]{string});
        HashSet hashSet = (HashSet)this.c.get((Object)string2);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.c.put((Object)string2, (Object)hashSet);
        }
        hashSet.add((Object)ac2);
    }

    public void c(String string, ac ac2) {
        String string2 = String.format((String)".*\\W%s$|^%s$", (Object[])new Object[]{string, string});
        HashSet hashSet = (HashSet)this.e.get((Object)string2);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.e.put((Object)string2, (Object)hashSet);
        }
        hashSet.add((Object)ac2);
        hashSet.add((Object)this.f);
    }
}

