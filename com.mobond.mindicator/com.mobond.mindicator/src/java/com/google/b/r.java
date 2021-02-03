/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.k
 *  com.google.b.k$d
 *  com.google.b.k$f
 *  com.google.b.p
 *  com.google.b.x
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.TreeSet
 */
package com.google.b;

import com.google.b.e;
import com.google.b.j;
import com.google.b.k;
import com.google.b.p;
import com.google.b.v;
import com.google.b.x;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class r {
    static String a(p p2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string);
        r.a(p2, stringBuilder, 0);
        return stringBuilder.toString();
    }

    private static final String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase((char)c2)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase((char)c2));
        }
        return stringBuilder.toString();
    }

    private static void a(p p2, StringBuilder stringBuilder, int n2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : p2.getClass().getDeclaredMethods()) {
            hashMap2.put((Object)method.getName(), (Object)method);
            if (method.getParameterTypes().length != 0) continue;
            hashMap.put((Object)method.getName(), (Object)method);
            if (!method.getName().startsWith("get")) continue;
            treeSet.add((Object)method.getName());
        }
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String string = ((String)iterator.next()).replaceFirst("get", "");
            if (string.endsWith("List") && !string.endsWith("OrBuilderList")) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string.substring(0, 1).toLowerCase());
                stringBuilder2.append(string.substring(1, -4 + string.length()));
                String string2 = stringBuilder2.toString();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("get");
                stringBuilder3.append(string);
                Method method = (Method)hashMap.get((Object)stringBuilder3.toString());
                if (method != null) {
                    r.a(stringBuilder, n2, r.a(string2), k.a((Method)method, (Object)p2, (Object[])new Object[0]));
                    continue;
                }
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("set");
            stringBuilder4.append(string);
            if ((Method)hashMap2.get((Object)stringBuilder4.toString()) == null) continue;
            if (string.endsWith("Bytes")) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("get");
                stringBuilder5.append(string.substring(0, -5 + string.length()));
                if (hashMap.containsKey((Object)stringBuilder5.toString())) continue;
            }
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(string.substring(0, 1).toLowerCase());
            stringBuilder6.append(string.substring(1));
            String string3 = stringBuilder6.toString();
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append("get");
            stringBuilder7.append(string);
            Method method = (Method)hashMap.get((Object)stringBuilder7.toString());
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append("has");
            stringBuilder8.append(string);
            Method method2 = (Method)hashMap.get((Object)stringBuilder8.toString());
            if (method == null) continue;
            Object object = k.a((Method)method, (Object)p2, (Object[])new Object[0]);
            boolean bl2 = method2 == null ? !r.a(object) : (Boolean)k.a((Method)method2, (Object)p2, (Object[])new Object[0]);
            if (!bl2) continue;
            r.a(stringBuilder, n2, r.a(string3), object);
        }
        if (p2 instanceof k.d) {
            Iterator iterator2 = ((k.d)p2).d.d();
            while (iterator2.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator2.next();
                StringBuilder stringBuilder9 = new StringBuilder();
                stringBuilder9.append("[");
                stringBuilder9.append(((k.f)entry.getKey()).c());
                stringBuilder9.append("]");
                r.a(stringBuilder, n2, stringBuilder9.toString(), entry.getValue());
            }
        }
        k k2 = (k)p2;
        if (k2.b != null) {
            k2.b.a(stringBuilder, n2);
        }
    }

    static final void a(StringBuilder stringBuilder, int n2, String string, Object object) {
        if (object instanceof List) {
            Iterator iterator = ((List)object).iterator();
            while (iterator.hasNext()) {
                r.a(stringBuilder, n2, string, iterator.next());
            }
            return;
        }
        stringBuilder.append('\n');
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(string);
        if (object instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(v.a((String)object));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof e) {
            stringBuilder.append(": \"");
            stringBuilder.append(v.a((e)object));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof k) {
            stringBuilder.append(" {");
            r.a((p)((k)object), stringBuilder, n2 + 2);
            stringBuilder.append("\n");
            while (n3 < n2) {
                stringBuilder.append(' ');
                ++n3;
            }
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object.toString());
    }

    private static boolean a(Object object) {
        if (object instanceof Boolean) {
            return true ^ (Boolean)object;
        }
        if (object instanceof Integer) {
            return (Integer)object == 0;
        }
        if (object instanceof Float) {
            return ((Float)object).floatValue() == 0.0f;
        }
        if (object instanceof Double) {
            return (Double)object == 0.0;
        }
        if (object instanceof String) {
            return object.equals((Object)"");
        }
        if (object instanceof e) {
            return object.equals((Object)e.a);
        }
        if (object instanceof p) {
            return object == ((p)object).s();
        }
        if (object instanceof Enum) {
            return ((Enum)object).ordinal() == 0;
        }
        return false;
    }
}

