/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Hashtable
 */
package com.mulo.a.d;

import java.util.Hashtable;

public class c {
    public static int a;
    private static String[][] b;
    private static Hashtable<String, String[]> c;

    static {
        b = new String[][]{{"Local", "\u0932\u094b\u0915\u0932"}, {"Bus", "\u092c\u0938"}, {"Express", "\u091f\u094d\u0930\u0947\u0928"}, {"MSRTC", "\u092a\u0930\u093f\u0935\u0939\u0928"}, {"Train Chat", "\u091f\u094d\u0930\u0947\u0928 \u091a\u0945\u091f"}, {"Mono", "\u092e\u094b\u0928\u094b"}, {"Metro", "\u092e\u0947\u091f\u094d\u0930\u094b"}, {"Auto", "\u0930\u093f\u0915\u094d\u0937\u093e"}, {"Cab", "\u091f\u0945\u0915\u094d\u0938\u0940"}, {"Ferry", "\u092b\u0947\u0930\u0940"}, {"Jobs", "\u0928\u094b\u0915\u0930\u0940"}, {"Map", "\u0928\u0915\u093e\u0936\u093e"}, {"Mumbai Exhibitions", "\u092e\u0941\u0902\u092c\u0908\u0924\u0940\u0932 \u092a\u094d\u0930\u0926\u0930\u094d\u0936\u0928\u0947"}, {"Natak - Marathi Hindi Gujarati", "\u0928\u093e\u091f\u0915 - \u092e\u0930\u093e\u0920\u0940, \u0939\u093f\u0902\u0926\u0940, \u0917\u0941\u091c\u0930\u093e\u0924\u0940"}, {"Penalty - Traffic and Railway", "\u0926\u0902\u0921 - \u091f\u094d\u0930\u093e\u092b\u093f\u0915 \u0935 \u0930\u0947\u0932\u094d\u0935\u0947"}, {"Property", "\u092d\u093e\u0921\u0947 \u0905\u092a\u093e\u0930\u094d\u091f\u092e\u0947\u0902\u091f"}, {"Picnic", "\u092a\u093f\u0915\u0928\u093f\u0915"}, {"Emergency Contacts", "\u0906\u092a\u0924\u094d\u0915\u093e\u0932\u0940\u0928 \u0938\u0902\u092a\u0930\u094d\u0915"}, {"Ambulance Booking", "\u0930\u0941\u0917\u094d\u0923\u0935\u093e\u0939\u093f\u0915\u093e"}, {"Women Safety", "\u092e\u0939\u093f\u0932\u093e \u0938\u0941\u0930\u0915\u094d\u0937\u093e"}, {"Police Station Locator", "\u092a\u094b\u0932\u0940\u0938 \u0938\u094d\u0925\u093e\u0928\u0915"}, {"EXPLORE MUMBAI", "\u092e\u0941\u0902\u092c\u0908 \u0926\u0930\u094d\u0936\u0928"}, {"Mumbai Map", "\u092e\u0941\u0902\u092c\u0908\u091a\u093e \u0928\u0915\u093e\u0936\u093e"}, {"How to travel?", "\u092a\u094d\u0930\u0935\u093e\u0938 \u0915\u0938\u093e \u0915\u0930\u093e\u0935\u093e?"}, {"Popular places", "\u092a\u094d\u0930\u0938\u093f\u0927\u094d\u0926 \u0920\u093f\u0915\u093e\u0923\u0947"}, {"Shopping", "\u0916\u0930\u0947\u0926\u0940"}, {"Food & Drink", "\u092d\u094b\u091c\u0928\u093e\u0932\u092f"}, {"Hotels", "\u0930\u093e\u0939\u0923\u094d\u092f\u093e\u0915\u0930\u093f\u0924\u093e \u0939\u0949\u091f\u0947\u0932\u094d\u0938"}, {"Penalty", "\u0926\u0902\u0921"}, {"Pune Chat", "\u092a\u0941\u0923\u0947 \u0917\u092a\u094d\u092a\u093e"}, {"Natak", "\u0928\u093e\u091f\u0915"}, {"Emergency", "\u0906\u092a\u0924\u094d\u0915\u093e\u0932\u0940\u0928 \u0938\u0902\u092a\u0930\u094d\u0915"}, {"Safety", "\u092e\u0939\u093f\u0932\u093e \u0938\u0941\u0930\u0915\u094d\u0937\u093e"}, {"Rate us", "\u0930\u0947\u091f\u093f\u0902\u0917 \u0926\u094d\u092f\u093e"}, {"Upgrade", "\u0905\u0926\u094d\u092f\u093e\u0935\u0924 \u0915\u0930\u093e"}, {"Feedback", "\u0906\u092a\u0932\u094d\u092f\u093e \u0938\u0942\u091a\u0928\u093e"}, {"Contact us", "\u0938\u0902\u092a\u0930\u094d\u0915"}, {"Advertise with us", "\u091c\u093e\u0939\u093f\u0930\u093e\u0924 \u0915\u0930\u093e"}, {"Terms & Conditions", "\u0905\u091f\u0940 \u0935 \u0928\u093f\u092f\u092e"}, {"New Feature guide", "\u0928\u0935\u0940\u0928 \u0935\u0948\u0936\u093f\u0937\u094d\u091f\u094d\u092f\u0947"}, {"Version", "\u0906\u0935\u0943\u0924\u094d\u0924\u0940"}, {"Mobond", "\u092e\u094b\u092c\u0949\u0923\u094d\u0921"}, {"mumbai", "\u092e\u0941\u0902\u092c\u0908"}, {"pune", "\u092a\u0941\u0923\u0947"}, {"Mumbai", "\u092e\u0941\u0902\u092c\u0908"}, {"Pune", "\u092a\u0941\u0923\u0947"}, {"STATION", "\u0938\u094d\u0925\u093e\u0928\u0915"}, {"A to B", "\u0905 \u0924\u0947 \u092c"}, {"FARE", "\u092d\u093e\u0921\u0947"}, {"Airoli", "\u0910\u0930\u094b\u0932\u0940"}, {"Aman Lodge", "\u0905\u092e\u0928 \u0932\u0949\u091c"}, {"Ambernath", "\u0905\u0902\u092c\u0930\u0928\u093e\u0925"}, {"Ambivli", "\u0906\u0902\u092c\u093f\u0935\u0932\u0940"}, {"Andheri", "\u0905\u0902\u0927\u0947\u0930\u0940"}, {"Apta", "\u0906\u092a\u091f\u093e"}, {"Asangaon", "\u0906\u0938\u0928\u0917\u093e\u0902\u0935"}, {"Atgaon", "\u0906\u091f\u0917\u093e\u0902\u0935"}, {"Badlapur", "\u092c\u0926\u0932\u093e\u092a\u0942\u0930"}, {"Bamandongri", "\u092c\u093e\u092e\u0923\u0921\u094b\u0902\u0917\u0930\u0940"}, {"Bandra", "\u0935\u093e\u0902\u0926\u094d\u0930\u0947"}, {"Belapur CBD", "\u092c\u0947\u0932\u093e\u092a\u0942\u0930"}, {"Bhandup", "\u092d\u093e\u0902\u0921\u0941\u092a"}, {"Bhayander", "\u092d\u093e\u0908\u0902\u0926\u0930"}, {"Bhivpuri Road", "\u092d\u093f\u0935\u092a\u0941\u0930\u0940 \u0930\u094b\u0921"}, {"Bhiwandi Road", "\u092d\u093f\u0935\u0902\u0921\u0940 \u0930\u094b\u0921"}, {"Boisar", "\u092c\u094b\u0908\u0938\u0930"}, {"Borivali", "\u092c\u094b\u0930\u0940\u0935\u0932\u0940"}, {"Byculla", "\u092d\u093e\u092f\u0916\u0933\u093e"}, {"CSMT", "\u091b\u0924\u094d\u0930\u092a\u0924\u0940 \u0936\u093f\u0935\u093e\u091c\u0940 \u092e\u0939\u093e\u0930\u093e\u091c \u091f\u0930\u094d\u092e\u093f\u0928\u0938"}, {"Charni Road", "\u091a\u0930\u094d\u0928\u0940 \u0930\u094b\u0921"}, {"Chembur", "\u091a\u0947\u0902\u092c\u0942\u0930"}, {"Chinchpokli", "\u091a\u093f\u0902\u091a\u092a\u094b\u0915\u0933\u0940"}, {"Chunabhatti", "\u091a\u0941\u0928\u093e\u092d\u091f\u094d\u091f\u0940"}, {"Churchgate", "\u091a\u0930\u094d\u091a\u0917\u0947\u091f"}, {"Cotton Green", "\u0915\u0949\u091f\u0928 \u0917\u094d\u0930\u0940\u0928"}, {"Currey Road", "\u0915\u0930\u0940 \u0930\u094b\u0921"}, {"Dadar", "\u0926\u093e\u0926\u0930"}, {"Dahanu Road", "\u0921\u0939\u093e\u0923\u0942 \u0930\u094b\u0921"}, {"DAHANU", "\u0921\u0939\u093e\u0923\u0942"}, {"Dahisar", "\u0926\u0939\u093f\u0938\u0930"}, {"Dativali", "\u0926\u093e\u0924\u093f\u0935\u0932\u0940"}, {"Diva Jn", "\u0926\u093f\u0935\u093e \u091c\u0902\u0915\u094d\u0936\u0928"}, {"Dockyard Road", "\u0921\u0949\u0915\u092f\u093e\u0930\u094d\u0921 \u0930\u094b\u0921"}, {"Dolavli", "\u0921\u094b\u0932\u0935\u0932\u0940"}, {"Dombivli", "\u0921\u094b\u0902\u092c\u0940\u0935\u0932\u0940"}, {"GTB Nagar", "\u0917\u0941\u0930\u0941 \u0924\u0947\u0917\u092c\u0939\u093e\u0926\u0941\u0930 \u0928\u0917\u0930"}, {"Ghansoli", "\u0918\u0923\u0938\u094b\u0932\u0940"}, {"Ghatkopar", "\u0918\u093e\u091f\u0915\u094b\u092a\u0930"}, {"Goregaon", "\u0917\u094b\u0930\u0947\u0917\u093e\u0935"}, {"Govandi", "\u0917\u094b\u0935\u0902\u0921\u0940"}, {"Grant Road", "\u0917\u094d\u0930\u0945\u0902\u091f \u0930\u094b\u0921"}, {"Hamarapur", "\u0939\u092e\u0930\u093e\u092a\u0941\u0930"}, {"Jite", "\u091c\u093f\u0924\u0947"}, {"Jogeshwari", "\u091c\u094b\u0917\u0947\u0936\u094d\u0935\u0930\u0940"}, {"Juchandra Road", "\u091c\u0942\u091a\u0902\u0926\u094d\u0930 \u0930\u094b\u0921"}, {"Juinagar", "\u091c\u0941\u0908\u0928\u0917\u0930"}, {"Jumapatti", "\u091c\u0941\u092e\u094d\u092e\u093e\u092a\u091f\u094d\u091f\u0940"}, {"Kalamboli", "\u0915\u0933\u0902\u092c\u094b\u0932\u0940"}, {"Kalva", "\u0915\u0933\u0935\u093e"}, {"Kalyan", "\u0915\u0932\u094d\u092f\u093e\u0923"}, {"Kaman Road", "\u0915\u093e\u092e\u0923 \u0930\u094b\u0921"}, {"Kandivali", "\u0915\u093e\u0902\u0926\u093f\u0935\u0932\u0940"}, {"Kanjur Marg", "\u0915\u093e\u0902\u091c\u0941\u0930 \u092e\u093e\u0930\u094d\u0917"}, {"Karjat", "\u0915\u0930\u094d\u091c\u0924"}, {"Kasara", "\u0915\u0938\u093e\u0930\u093e"}, {"Kasu", "\u0915\u093e\u0938\u0941"}, {"Kelavli", "\u0915\u0947\u0933\u0935\u0932\u0940"}, {"Kelva Road", "\u0915\u0947\u0933\u0935\u0947 \u0930\u094b\u0921"}, {"Khadavli", "\u0916\u0921\u0935\u0932\u0940"}, {"Khandeshwar", "\u0916\u093e\u0902\u0926\u0947\u0936\u094d\u0935\u0930"}, {"Khar Road", "\u0916\u093e\u0930 \u0930\u094b\u0921"}, {"Kharbao", "\u0916\u093e\u0930\u092c\u093e\u0935"}, {"Khardi", "\u0916\u0930\u094d\u0921\u0940"}, {"Kharghar", "\u0916\u093e\u0930\u0918\u0930"}, {"Kharkopar", "\u0916\u093e\u0930\u0915\u094b\u092a\u0930"}, {"Khopoli", "\u0916\u094b\u092a\u094b\u0932\u0940"}, {"Kings Circle", "\u0915\u093f\u0902\u0917\u094d\u091c \u0938\u0930\u094d\u0915\u0932"}, {"Kopar", "\u0915\u094b\u092a\u0930"}, {"Koparkhairne", "\u0915\u094b\u092a\u0930\u0916\u0948\u0930\u0923\u0947"}, {"Kurla", "\u0915\u0941\u0930\u094d\u0932\u093e"}, {"Lower Parel", "\u0932\u094b\u0905\u0930 \u092a\u0930\u0933"}, {"Lowjee", "\u0932\u094c\u091c\u0940"}, {"Mahalakshmi", "\u092e\u0939\u093e\u0932\u0915\u094d\u0937\u094d\u092e\u0940"}, {"Mahim Jn", "\u092e\u093e\u0939\u0940\u092e \u091c\u0902\u0915\u094d\u0936\u0928"}, {"Malad", "\u092e\u093e\u0932\u093e\u0921"}, {"Manasarovar", "\u092e\u093e\u0928\u0938\u0930\u094b\u0935\u0930"}, {"Mankhurd", "\u092e\u093e\u0928\u0916\u0941\u0930\u094d\u0926"}, {"Marine Lines", "\u092e\u0930\u0940\u0928 \u0932\u093e\u0908\u0928\u094d\u0938"}, {"Masjid", "\u092e\u0938\u094d\u091c\u093f\u0926"}, {"Matheran", "\u092e\u093e\u0925\u0947\u0930\u093e\u0928"}, {"Matunga", "\u092e\u093e\u091f\u0941\u0902\u0917\u093e"}, {"Matunga Road", "\u092e\u093e\u091f\u0941\u0902\u0917\u093e \u0930\u094b\u0921"}, {"Mira Road", "\u092e\u0940\u0930\u093e \u0930\u094b\u0921"}, {"Mulund", "\u092e\u0941\u0932\u0941\u0902\u0921"}, {"Mumbai Central", "\u092e\u0941\u092e\u094d\u092c\u0908 \u0938\u0947\u0902\u091f\u094d\u0930\u0932"}, {"Mumbra", "\u092e\u0941\u0902\u092c\u094d\u0930\u093e"}, {"Nagothane", "\u0928\u093e\u0917\u094b\u0920\u0923\u0947"}, {"Nahur", "\u0928\u093e\u0939\u0942\u0930"}, {"Naigaon", "\u0928\u093e\u092f\u0917\u093e\u0935"}, {"Nalla Sopara", "\u0928\u093e\u0932\u093e \u0938\u094b\u092a\u093e\u0930\u093e"}, {"Navade Road", "\u0928\u093e\u0935\u0921\u0947 \u0930\u094b\u0921"}, {"Neral", "\u0928\u0947\u0930\u0933"}, {"Nerul", "\u0928\u0947\u0930\u0941\u0933"}, {"Nidi", "\u0928\u093f\u0921\u0940"}, {"Nilje", "\u0928\u093f\u0933\u091c\u0947"}, {"Umbermali", "\u0909\u0902\u092c\u0930\u092e\u093e\u0933\u0940 "}, {"Palasdhari", "\u092a\u0933\u0938\u0927\u0930\u0940"}, {"Palghar", "\u092a\u093e\u0932\u0918\u0930"}, {"Panvel", "\u092a\u0928\u0935\u0947\u0932"}, {"Parel", "\u092a\u0930\u0933"}, {"Pen", "\u092a\u0947\u0923 "}, {"Prabhadevi", "\u092a\u094d\u0930\u092d\u093e\u0926\u0947\u0935\u0940"}, {"Rabale", "\u0930\u092c\u093e\u0933\u0947"}, {"Ram Mandir", "\u0930\u093e\u092e \u092e\u0902\u0926\u093f\u0930"}, {"Rasayani", "\u0930\u0938\u093e\u092f\u0928\u0940"}, {"Reay Road", "\u0930\u0947 \u0930\u094b\u0921"}, {"Roha", "\u0930\u094b\u0939\u093e"}, {"Sandhurst Road", "\u0938\u0948\u0902\u0921\u0939\u0930\u094d\u0938\u094d\u091f \u0930\u094b\u0921"}, {"Sanpada", "\u0938\u093e\u0928\u093e\u092a\u093e\u0921\u093e"}, {"Santa Cruz", "\u0938\u093e\u0902\u0924\u093e\u0915\u094d\u0930\u0941\u091d"}, {"Saphale", "\u0938\u092b\u093e\u0933\u0947"}, {"Seawood Darave", "\u0938\u0940\u0935\u0942\u0921\u0938 \u0926\u093e\u0930\u093e\u0935\u0947"}, {"Sewri", "\u0936\u093f\u0935\u0921\u0940"}, {"Shahad", "\u0936\u0939\u093e\u0921"}, {"Shelu", "\u0936\u0947\u0932\u0942"}, {"Sion", "\u0936\u0940\u0935"}, {"Somtane", "\u0938\u094b\u092e\u091f\u0923\u0947"}, {"Taloja Panchanand", "\u0924\u0933\u094b\u091c\u0947 \u092a\u093e\u0902\u091a\u0928\u0902\u0926"}, {"Thakurli", "\u0920\u093e\u0915\u0941\u0930\u094d\u0932\u0940"}, {"Thane", "\u0920\u093e\u0923\u0947"}, {"Thansit", "\u0920\u093e\u0928\u0938\u093f\u091f"}, {"Tilaknagar", "\u091f\u093f\u0933\u0915 \u0928\u0917\u0930"}, {"Titwala", "\u091f\u093f\u091f\u0935\u093e\u0933\u093e"}, {"Turbhe", "\u0924\u0941\u0930\u094d\u092d\u0947"}, {"Ulhas Nagar", "\u0909\u0932\u094d\u0939\u093e\u0938\u0928\u0917\u0930"}, {"Umroli Road", "\u0909\u092e\u0930\u094b\u0933\u0940 \u0930\u094b\u0921"}, {"Vadala Road", "\u0935\u0921\u093e\u0933\u093e \u0930\u094b\u0921"}, {"Vaitarana", "\u0935\u0948\u0924\u0930\u0923\u093e"}, {"Vangani", "\u0935\u093e\u0902\u0917\u0923\u0940"}, {"Vangaon", "\u0935\u093e\u0923\u0917\u093e\u0935"}, {"Vasai Road", "\u0935\u0938\u0908 \u0930\u094b\u0921"}, {"VASAI", "\u0935\u0938\u0908"}, {"Vashi", "\u0935\u093e\u0936\u0940"}, {"Vasind", "\u0935\u093e\u0936\u093f\u0902\u0926"}, {"Vidyavihar", "\u0935\u093f\u0926\u094d\u092f\u093e\u0935\u093f\u0939\u093e\u0930"}, {"Vikhroli", "\u0935\u093f\u0915\u094d\u0930\u094b\u0933\u0940"}, {"Vile Parle", "\u0935\u093f\u0932\u0947\u092a\u093e\u0930\u094d\u0932\u0947"}, {"Virar", "\u0935\u093f\u0930\u093e\u0930"}, {"Vithalwadi", "\u0935\u093f\u0920\u094d\u0920\u0932\u0935\u093e\u0921\u0940"}, {"Waterpipe", "\u0935\u0949\u091f\u0930 \u092a\u093e\u0908\u092a"}, {"Pune", "\u092a\u0941\u0923\u0947"}, {"Shivaji Nagar", "\u0936\u093f\u0935\u093e\u091c\u0940\u0928\u0917\u0930"}, {"Khadki", "\u0916\u0921\u0915\u0940"}, {"Dapodi", "\u0926\u093e\u092a\u094b\u0921\u0940"}, {"Kasarwadi", "\u0915\u093e\u0938\u093e\u0930\u0935\u093e\u0921\u0940"}, {"Pimpri", "\u092a\u093f\u0902\u092a\u0930\u0940"}, {"Chinchwad", "\u091a\u093f\u0902\u091a\u0935\u0921"}, {"Akurdi", "\u0906\u0915\u0941\u0930\u094d\u0921\u0940 "}, {"Dehu Road", "\u0926\u0947\u0939\u0942 \u0930\u094b\u0921"}, {"Begdewadi", "\u092c\u0947\u0917\u0921\u0947\u0935\u093e\u0921\u0940 "}, {"Ghorawadi", "\u0918\u094b\u0930\u093e\u0935\u093e\u0921\u0940"}, {"Talegaon", "\u0924\u0933\u0947\u0917\u093e\u0935"}, {"Vadgaon", "\u0935\u0921\u0917\u093e\u0935"}, {"Kanhe", "\u0915\u093e\u0928\u094d\u0939\u0947"}, {"Kamshet", "\u0915\u093e\u092e\u0936\u0947\u0924"}, {"Malavli", "\u092e\u0933\u0935\u0932\u0940"}, {"Lonavla", "\u0932\u094b\u0923\u093e\u0935\u0933\u093e"}, {"AIROLI", "\u0910\u0930\u094b\u0932\u0940"}, {"AMAN LODGE", "\u0905\u092e\u0928 \u0932\u0949\u091c"}, {"AMBERNATH", "\u0905\u0902\u092c\u0930\u0928\u093e\u0925"}, {"AMBIVLI", "\u0906\u0902\u092c\u093f\u0935\u0932\u0940"}, {"ANDHERI", "\u0905\u0902\u0927\u0947\u0930\u0940"}, {"APTA", "\u0906\u092a\u091f\u093e"}, {"ASANGAON", "\u0906\u0938\u0928\u0917\u093e\u0902\u0935"}, {"ATGAON", "\u0906\u091f\u0917\u093e\u0902\u0935"}, {"BADLAPUR", "\u092c\u0926\u0932\u093e\u092a\u0942\u0930"}, {"BAMANDONGRI", "\u092c\u093e\u092e\u0923\u0921\u094b\u0902\u0917\u0930\u0940"}, {"BANDRA", "\u0935\u093e\u0902\u0926\u094d\u0930\u0947"}, {"BELAPUR CBD", "\u092c\u0947\u0932\u093e\u092a\u0942\u0930"}, {"BHANDUP", "\u092d\u093e\u0902\u0921\u0941\u092a"}, {"BHAYANDER", "\u092d\u093e\u0908\u0902\u0926\u0930"}, {"BHIVPURI ROAD", "\u092d\u093f\u0935\u092a\u0941\u0930\u0940 \u0930\u094b\u0921"}, {"BHIWANDI ROAD", "\u092d\u093f\u0935\u0902\u0921\u0940 \u0930\u094b\u0921"}, {"BOISAR", "\u092c\u094b\u0908\u0938\u0930"}, {"BORIVALI", "\u092c\u094b\u0930\u0940\u0935\u0932\u0940"}, {"BO", "\u092c\u094b\u0930\u0940\u0935\u0932\u0940"}, {"BYCULLA", "\u092d\u093e\u092f\u0916\u0933\u093e"}, {"CSMT", "\u091b\u0924\u094d\u0930\u092a\u0924\u0940 \u0936\u093f\u0935\u093e\u091c\u0940 \u092e\u0939\u093e\u0930\u093e\u091c \u091f\u0930\u094d\u092e\u093f\u0928\u0938"}, {"CHARNI ROAD", "\u091a\u0930\u094d\u0928\u0940 \u0930\u094b\u0921"}, {"CHEMBUR", "\u091a\u0947\u0902\u092c\u0942\u0930"}, {"CHINCHPOKLI", "\u091a\u093f\u0902\u091a\u092a\u094b\u0915\u0933\u0940"}, {"CHUNABHATTI", "\u091a\u0941\u0928\u093e\u092d\u091f\u094d\u091f\u0940"}, {"CHURCHGATE", "\u091a\u0930\u094d\u091a\u0917\u0947\u091f"}, {"CHG", "\u091a\u0930\u094d\u091a\u0917\u0947\u091f"}, {"COTTON GREEN", "\u0915\u0949\u091f\u0928 \u0917\u094d\u0930\u0940\u0928"}, {"CURREY ROAD", "\u0915\u0930\u0940 \u0930\u094b\u0921"}, {"DADAR", "\u0926\u093e\u0926\u0930"}, {"DAHANU ROAD", "\u0921\u0939\u093e\u0923\u0942 \u0930\u094b\u0921"}, {"DAHISAR", "\u0926\u0939\u093f\u0938\u0930"}, {"DATIVALI", "\u0926\u093e\u0924\u093f\u0935\u0932\u0940"}, {"DIVA JN", "\u0926\u093f\u0935\u093e \u091c\u0902\u0915\u094d\u0936\u0928"}, {"DOCKYARD ROAD", "\u0921\u0949\u0915\u092f\u093e\u0930\u094d\u0921 \u0930\u094b\u0921"}, {"DOLAVLI", "\u0921\u094b\u0932\u0935\u0932\u0940"}, {"DOMBIVLI", "\u0921\u094b\u0902\u092c\u0940\u0935\u0932\u0940"}, {"GTB NAGAR", "\u0917\u0941\u0930\u0941 \u0924\u0947\u0917\u092c\u0939\u093e\u0926\u0941\u0930 \u0928\u0917\u0930"}, {"GHANSOLI", "\u0918\u0923\u0938\u094b\u0932\u0940"}, {"GHATKOPAR", "\u0918\u093e\u091f\u0915\u094b\u092a\u0930"}, {"GOREGAON", "\u0917\u094b\u0930\u0947\u0917\u093e\u0935"}, {"GOVANDI", "\u0917\u094b\u0935\u0902\u0921\u0940"}, {"GRANT ROAD", "\u0917\u094d\u0930\u0945\u0902\u091f \u0930\u094b\u0921"}, {"HAMARAPUR", "\u0939\u092e\u0930\u093e\u092a\u0941\u0930"}, {"JITE", "\u091c\u093f\u0924\u0947"}, {"JOGESHWARI", "\u091c\u094b\u0917\u0947\u0936\u094d\u0935\u0930\u0940"}, {"JUCHANDRA ROAD", "\u091c\u0942\u091a\u0902\u0926\u094d\u0930 \u0930\u094b\u0921"}, {"JUINAGAR", "\u091c\u0941\u0908\u0928\u0917\u0930"}, {"JUMAPATTI", "\u091c\u0941\u092e\u094d\u092e\u093e\u092a\u091f\u094d\u091f\u0940"}, {"KALAMBOLI", "\u0915\u0933\u0902\u092c\u094b\u0932\u0940"}, {"KALVA", "\u0915\u0933\u0935\u093e"}, {"KALYAN", "\u0915\u0932\u094d\u092f\u093e\u0923"}, {"KAMAN ROAD", "\u0915\u093e\u092e\u0923 \u0930\u094b\u0921"}, {"KANDIVALI", "\u0915\u093e\u0902\u0926\u093f\u0935\u0932\u0940"}, {"KANJUR MARG", "\u0915\u093e\u0902\u091c\u0941\u0930 \u092e\u093e\u0930\u094d\u0917"}, {"KARJAT", "\u0915\u0930\u094d\u091c\u0924"}, {"KASARA", "\u0915\u0938\u093e\u0930\u093e"}, {"KASU", "\u0915\u093e\u0938\u0941"}, {"KELAVLI", "\u0915\u0947\u0933\u0935\u0932\u0940"}, {"KELVA ROAD", "\u0915\u0947\u0933\u0935\u0947 \u0930\u094b\u0921"}, {"KHADAVLI", "\u0916\u0921\u0935\u0932\u0940"}, {"KHANDESHWAR", "\u0916\u093e\u0902\u0926\u0947\u0936\u094d\u0935\u0930"}, {"KHAR ROAD", "\u0916\u093e\u0930 \u0930\u094b\u0921"}, {"KHARBAO", "\u0916\u093e\u0930\u092c\u093e\u0935"}, {"KHARDI", "\u0916\u0930\u094d\u0921\u0940"}, {"KHARGHAR", "\u0916\u093e\u0930\u0918\u0930"}, {"KHARKOPAR", "\u0916\u093e\u0930\u0915\u094b\u092a\u0930"}, {"KHOPOLI", "\u0916\u094b\u092a\u094b\u0932\u0940"}, {"KINGS CIRCLE", "\u0915\u093f\u0902\u0917\u094d\u091c \u0938\u0930\u094d\u0915\u0932"}, {"KOPAR", "\u0915\u094b\u092a\u0930"}, {"KOPARKHAIRNE", "\u0915\u094b\u092a\u0930\u0916\u0948\u0930\u0923\u0947"}, {"KURLA", "\u0915\u0941\u0930\u094d\u0932\u093e"}, {"LOWER PAREL", "\u0932\u094b\u0905\u0930 \u092a\u0930\u0933"}, {"LOWJEE", "\u0932\u094c\u091c\u0940"}, {"MAHALAKSHMI", "\u092e\u0939\u093e\u0932\u0915\u094d\u0937\u094d\u092e\u0940"}, {"MAHIM JN", "\u092e\u093e\u0939\u0940\u092e \u091c\u0902\u0915\u094d\u0936\u0928"}, {"MALAD", "\u092e\u093e\u0932\u093e\u0921"}, {"MANASAROVAR", "\u092e\u093e\u0928\u0938\u0930\u094b\u0935\u0930"}, {"MANKHURD", "\u092e\u093e\u0928\u0916\u0941\u0930\u094d\u0926"}, {"MARINE LINES", "\u092e\u0930\u0940\u0928 \u0932\u093e\u0908\u0928\u094d\u0938"}, {"MASJID", "\u092e\u0938\u094d\u091c\u093f\u0926"}, {"MATHERAN", "\u092e\u093e\u0925\u0947\u0930\u093e\u0928"}, {"MATUNGA", "\u092e\u093e\u091f\u0941\u0902\u0917\u093e"}, {"MATUNGA ROAD", "\u092e\u093e\u091f\u0941\u0902\u0917\u093e \u0930\u094b\u0921"}, {"MIRA ROAD", "\u092e\u0940\u0930\u093e \u0930\u094b\u0921"}, {"MULUND", "\u092e\u0941\u0932\u0941\u0902\u0921"}, {"MUMBAI CENTRAL", "\u092e\u0941\u092e\u094d\u092c\u0908 \u0938\u0947\u0902\u091f\u094d\u0930\u0932"}, {"MUMBRA", "\u092e\u0941\u0902\u092c\u094d\u0930\u093e"}, {"NAGOTHANE", "\u0928\u093e\u0917\u094b\u0920\u0923\u0947"}, {"NAHUR", "\u0928\u093e\u0939\u0942\u0930"}, {"NAIGAON", "\u0928\u093e\u092f\u0917\u093e\u0935"}, {"NALLA SOPARA", "\u0928\u093e\u0932\u093e \u0938\u094b\u092a\u093e\u0930\u093e"}, {"NAVADE ROAD", "\u0928\u093e\u0935\u0921\u0947 \u0930\u094b\u0921"}, {"NERAL", "\u0928\u0947\u0930\u0933"}, {"NERUL", "\u0928\u0947\u0930\u0941\u0933"}, {"NIDI", "\u0928\u093f\u0921\u0940"}, {"NILJE", "\u0928\u093f\u0933\u091c\u0947"}, {"UMBERMALI", "\u0909\u0902\u092c\u0930\u092e\u093e\u0933\u0940 "}, {"PALASDHARI", "\u092a\u0933\u0938\u0927\u0930\u0940"}, {"PALGHAR", "\u092a\u093e\u0932\u0918\u0930"}, {"PANVEL", "\u092a\u0928\u0935\u0947\u0932"}, {"PAREL", "\u092a\u0930\u0933"}, {"PEN", "\u092a\u0947\u0923 "}, {"PRABHADEVI", "\u092a\u094d\u0930\u092d\u093e\u0926\u0947\u0935\u0940"}, {"RABALE", "\u0930\u092c\u093e\u0933\u0947"}, {"RAM MANDIR", "\u0930\u093e\u092e \u092e\u0902\u0926\u093f\u0930"}, {"RASAYANI", "\u0930\u0938\u093e\u092f\u0928\u0940"}, {"REAY ROAD", "\u0930\u0947 \u0930\u094b\u0921"}, {"ROHA", "\u0930\u094b\u0939\u093e"}, {"SANDHURST ROAD", "\u0938\u0948\u0902\u0921\u0939\u0930\u094d\u0938\u094d\u091f \u0930\u094b\u0921"}, {"SANPADA", "\u0938\u093e\u0928\u093e\u092a\u093e\u0921\u093e"}, {"SANTA CRUZ", "\u0938\u093e\u0902\u0924\u093e\u0915\u094d\u0930\u0941\u091d"}, {"SAPHALE", "\u0938\u092b\u093e\u0933\u0947"}, {"SEAWOOD DARAVE", "\u0938\u0940\u0935\u0942\u0921\u0938 \u0926\u093e\u0930\u093e\u0935\u0947"}, {"SEWRI", "\u0936\u093f\u0935\u0921\u0940"}, {"SHAHAD", "\u0936\u0939\u093e\u0921"}, {"SHELU", "\u0936\u0947\u0932\u0942"}, {"SION", "\u0936\u0940\u0935"}, {"SOMTANE", "\u0938\u094b\u092e\u091f\u0923\u0947"}, {"TALOJA PANCHANAND", "\u0924\u0933\u094b\u091c\u0947 \u092a\u093e\u0902\u091a\u0928\u0902\u0926"}, {"THAKURLI", "\u0920\u093e\u0915\u0941\u0930\u094d\u0932\u0940"}, {"THANE", "\u0920\u093e\u0923\u0947"}, {"THANSIT", "\u0920\u093e\u0928\u0938\u093f\u091f"}, {"TILAKNAGAR", "\u091f\u093f\u0933\u0915 \u0928\u0917\u0930"}, {"TITWALA", "\u091f\u093f\u091f\u0935\u093e\u0933\u093e"}, {"TURBHE", "\u0924\u0941\u0930\u094d\u092d\u0947"}, {"ULHAS NAGAR", "\u0909\u0932\u094d\u0939\u093e\u0938\u0928\u0917\u0930"}, {"UMROLI ROAD", "\u0909\u092e\u0930\u094b\u0933\u0940 \u0930\u094b\u0921"}, {"VADALA ROAD", "\u0935\u0921\u093e\u0933\u093e \u0930\u094b\u0921"}, {"VAITARANA", "\u0935\u0948\u0924\u0930\u0923\u093e"}, {"VANGANI", "\u0935\u093e\u0902\u0917\u0923\u0940"}, {"VANGAON", "\u0935\u093e\u0923\u0917\u093e\u0935"}, {"VASAI ROAD", "\u0935\u0938\u0908 \u0930\u094b\u0921"}, {"VASHI", "\u0935\u093e\u0936\u0940"}, {"VASIND", "\u0935\u093e\u0936\u093f\u0902\u0926"}, {"VIDYAVIHAR", "\u0935\u093f\u0926\u094d\u092f\u093e\u0935\u093f\u0939\u093e\u0930"}, {"VIKHROLI", "\u0935\u093f\u0915\u094d\u0930\u094b\u0933\u0940"}, {"VILE PARLE", "\u0935\u093f\u0932\u0947\u092a\u093e\u0930\u094d\u0932\u0947"}, {"VIRAR", "\u0935\u093f\u0930\u093e\u0930"}, {"VITHALWADI", "\u0935\u093f\u0920\u094d\u0920\u0932\u0935\u093e\u0921\u0940"}, {"WATERPIPE", "\u0935\u0949\u091f\u0930 \u092a\u093e\u0908\u092a"}, {"PUNE", "\u092a\u0941\u0923\u0947"}, {"PUNE JUNCTION", "\u092a\u0941\u0923\u0947"}, {"SHIVAJI NAGAR", "\u0936\u093f\u0935\u093e\u091c\u0940\u0928\u0917\u0930"}, {"KHADKI", "\u0916\u0921\u0915\u0940"}, {"DAPODI", "\u0926\u093e\u092a\u094b\u0921\u0940"}, {"KASARWADI", "\u0915\u093e\u0938\u093e\u0930\u0935\u093e\u0921\u0940"}, {"PIMPRI", "\u092a\u093f\u0902\u092a\u0930\u0940"}, {"CHINCHWAD", "\u091a\u093f\u0902\u091a\u0935\u0921"}, {"AKURDI", "\u0906\u0915\u0941\u0930\u094d\u0921\u0940 "}, {"DEHU ROAD", "\u0926\u0947\u0939\u0942 \u0930\u094b\u0921"}, {"BEGDEWADI", "\u092c\u0947\u0917\u0921\u0947\u0935\u093e\u0921\u0940 "}, {"GHORAWADI", "\u0918\u094b\u0930\u093e\u0935\u093e\u0921\u0940"}, {"TALEGAON", "\u0924\u0933\u0947\u0917\u093e\u0935"}, {"VADGAON", "\u0935\u0921\u0917\u093e\u0935"}, {"KANHE", "\u0915\u093e\u0928\u094d\u0939\u0947"}, {"KAMSHET", "\u0915\u093e\u092e\u0936\u0947\u0924"}, {"MALAVLI", "\u092e\u0933\u0935\u0932\u0940"}, {"LONAVLA", "\u0932\u094b\u0923\u093e\u0935\u0933\u093e"}, {"Destination", "\u0917\u0902\u0924\u0935\u094d\u092f \u0938\u094d\u0925\u093e\u0928"}, {"Station Map", "\u0938\u094d\u091f\u0947\u0936\u0928 \u0928\u0915\u093e\u0936\u093e"}, {"To", "\u0924\u0947"}, {"Go", "\u092a\u0939\u093e"}, {"Vashi/Nerul/Panvel", "\u0935\u093e\u0936\u0940/\u0928\u0947\u0930\u0941\u0933/\u092a\u0928\u0935\u0947\u0932"}, {"Karjat/Khopoli", "\u0915\u0930\u094d\u091c\u0924/\u0916\u094b\u092a\u094b\u0932\u0940"}, {"Borivali/Virar/Dahanu", "\u092c\u094b\u0930\u093f\u0935\u0932\u0940/\u0935\u093f\u0930\u093e\u0930/\u0921\u0939\u093e\u0923\u0942"}, {"Karjat/Khopoli", "\u0915\u0930\u094d\u091c\u0924/\u0916\u094b\u092a\u094b\u0932\u0940"}, {"Goregaon-Harbour", "\u0917\u094b\u0930\u0947\u0917\u093e\u0935-\u0939\u093e\u0930\u094d\u092c\u0930"}, {"Panvel/Diva", "\u092a\u0928\u0935\u0947\u0932/\u0926\u093f\u0935\u093e"}, {"Nerul/Belapur CBD", "\u0928\u0947\u0930\u0941\u0933/\u092c\u0947\u0932\u093e\u092a\u0942\u0930"}, {"Kalyan/Khopoli/Kasara", "\u0915\u0932\u094d\u092f\u093e\u0923/\u0916\u094b\u092a\u094b\u0932\u0940/\u0915\u0938\u093e\u0930\u093e"}, {"Vasai/Dahanu", "\u0935\u0938\u0908/\u0921\u0939\u093e\u0923\u0942"}, {"Diva/Panvel", "\u0926\u093f\u0935\u093e/\u092a\u0928\u0935\u0947\u0932"}, {"Churchgate/Virar", "\u091a\u0930\u094d\u091a\u0917\u0947\u091f/\u0935\u093f\u0930\u093e\u0930"}, {"Panvel/Andheri/Goregaon", ""}, {"Borivali/Virar", "\u092c\u094b\u0930\u093f\u0935\u0932\u0940/\u0935\u093f\u0930\u093e\u0930"}, {"Panvel/Roha", "\u092a\u0928\u0935\u0947\u0932/\u0930\u094b\u0939\u093e"}, {"Andheri/Goregaon-Harbour", "\u0905\u0902\u0927\u0947\u0930\u0940/\u0917\u094b\u0930\u0947\u0917\u093e\u0935-\u0939\u093e\u0930\u094d\u092c\u0930"}, {"Dahanu", "\u0921\u0939\u093e\u0923\u0942"}, {"Diva", "\u0926\u093f\u0935\u093e"}, {"CSMT/Karjat", "\u0938\u0940.\u090f\u0938.\u090f\u092e.\u091f\u0940./\u0915\u0930\u094d\u091c\u0924"}, {"Virar/Boisar", "\u0935\u093f\u0930\u093e\u0930/\u092c\u094b\u0908\u0938\u0930"}, {"Khopoli/Kasara", "\u0916\u094b\u092a\u094b\u0932\u0940/\u0915\u0938\u093e\u0930\u093e"}, {"CSMT-Central", "\u0938\u0940.\u090f\u0938.\u090f\u092e.\u091f\u0940.- \u092e\u0927\u094d\u092f \u0930\u0947\u0932\u094d\u0935\u0947"}, {"CSMT-Harbour", "\u0938\u0940.\u090f\u0938.\u090f\u092e.\u091f\u0940.- \u0939\u093e\u0930\u094d\u092c\u0930"}, {"Dahanu-Shuttle", "\u0921\u0939\u093e\u0923\u0942-\u0936\u091f\u0932"}, {"Virar/Dahanu", "\u0935\u093f\u0930\u093e\u0930/\u0921\u0939\u093e\u0923\u0942"}, {"Panvel/Andheri/Goregaon", "\u092a\u0928\u0935\u0947\u0932/\u0905\u0902\u0927\u0947\u0930\u0940/\u0917\u094b\u0930\u0947\u0917\u093e\u0935"}, {"Share Suggestion", "\u0905\u0928\u094d\u092f \u092e\u093e\u0930\u094d\u0917 \u0938\u0941\u091a\u0935\u093e"}, {"Western Line", "\u092a\u0936\u094d\u091a\u093f\u092e \u0930\u0947\u0932\u094d\u0935\u0947"}, {"Central Line", "\u092e\u0927\u094d\u092f \u0930\u0947\u0932\u094d\u0935\u0947"}, {"Harbour Line", "\u0939\u093e\u0930\u094d\u092c\u0930 \u0932\u093e\u0908\u0928"}, {"Transharbour Line", "\u091f\u094d\u0930\u093e\u0928\u094d\u0938 \u0939\u093e\u0930\u094d\u092c\u0930 \u0932\u093e\u0908\u0928"}, {"WESTERN LINE", "\u092a\u0936\u094d\u091a\u093f\u092e \u0930\u0947\u0932\u094d\u0935\u0947"}, {"CENTRAL LINE", "\u092e\u0927\u094d\u092f \u0930\u0947\u0932\u094d\u0935\u0947"}, {"HARBOUR LINE", "\u0939\u093e\u0930\u094d\u092c\u0930 \u0932\u093e\u0908\u0928"}, {"TRANSHARBOUR LINE", "\u091f\u094d\u0930\u093e\u0928\u094d\u0938 \u0939\u093e\u0930\u094d\u092c\u0930 \u0932\u093e\u0908\u0928"}, {"TRANS HARBOUR LINE", "\u091f\u094d\u0930\u093e\u0928\u094d\u0938 \u0939\u093e\u0930\u094d\u092c\u0930 \u0932\u093e\u0908\u0928"}, {"URAN LINE", "\u0909\u0930\u0923 \u0932\u093e\u0908\u0928"}, {"Regular Ticket", "\u0924\u093f\u0915\u0940\u091f"}, {"1 Month  Pass", "\u0967 \u092e\u0939\u093f\u0928\u093e \u092a\u093e\u0938"}, {"3 Months Pass", "\u0969 \u092e\u0939\u093f\u0928\u0947 \u092a\u093e\u0938"}, {"6 Months Pass", "\u096c \u092e\u0939\u093f\u0928\u0947 \u092a\u093e\u0938"}, {"1 Year Pass", "\u0967 \u0935\u0930\u094d\u0937 \u092a\u093e\u0938"}, {"1 Week Pass", "\u0967 \u0906\u0920\u0935\u0921\u093e \u092a\u093e\u0938"}, {"2 Weeks Pass", "\u0968 \u0906\u0920\u0935\u0921\u0947 \u092a\u093e\u0938"}};
        c = null;
    }

    public static String a(String string, int n2) {
        if (c == null) {
            String[][] arrstring;
            c = new Hashtable();
            for (int i2 = 0; i2 < (arrstring = b).length; ++i2) {
                String[] arrstring2 = arrstring[i2];
                String string2 = arrstring2[0];
                c.put((Object)string2, (Object)arrstring2);
            }
        }
        if (c.containsKey((Object)string) && n2 < ((String[])c.get((Object)string)).length) {
            return ((String[])c.get((Object)string))[n2];
        }
        return string;
    }

    public static void a(String string) {
        if (string.equals((Object)"en")) {
            a = 0;
            return;
        }
        if (string.equals((Object)"mr")) {
            a = 1;
        }
    }
}
