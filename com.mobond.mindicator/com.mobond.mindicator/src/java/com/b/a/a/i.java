/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.b.a.a;

public class i {
    public static int a(double d2, double d3, double d4, double d5) {
        int n2;
        double d6;
        double d7;
        block44 : {
            double d8;
            double d9;
            block45 : {
                block49 : {
                    block48 : {
                        block46 : {
                            block47 : {
                                d9 = d2;
                                d7 = d3;
                                d6 = d4;
                                d8 = d5;
                                n2 = -1;
                                if (d9 == 0.0 || d8 == 0.0) break block44;
                                if (d7 == 0.0 || d6 == 0.0) break block45;
                                if (0.0 < d7) {
                                    if (0.0 < d8) {
                                        if (d7 <= d8) {
                                            n2 = 1;
                                        } else {
                                            double d10 = d7;
                                            d7 = d8;
                                            d8 = d10;
                                            double d11 = d9;
                                            d9 = d6;
                                            d6 = d11;
                                        }
                                    } else if (d7 <= (d8 = -d8)) {
                                        d6 = -d6;
                                    } else {
                                        double d12 = -d6;
                                        n2 = 1;
                                        double d13 = d7;
                                        d7 = d8;
                                        d8 = d13;
                                        double d14 = d9;
                                        d9 = d12;
                                        d6 = d14;
                                    }
                                } else if (0.0 < d8) {
                                    if ((d7 = -d7) <= d8) {
                                        d9 = -d9;
                                    } else {
                                        double d15 = -d9;
                                        n2 = 1;
                                        double d16 = d7;
                                        d7 = d8;
                                        d8 = d16;
                                        d9 = d6;
                                        d6 = d15;
                                    }
                                } else if (d7 >= d8) {
                                    d9 = -d9;
                                    d7 = -d7;
                                    d6 = -d6;
                                    d8 = -d8;
                                    n2 = 1;
                                } else {
                                    double d17 = -d9;
                                    double d18 = -d6;
                                    double d19 = -d7;
                                    d7 = -d8;
                                    d8 = d19;
                                    d9 = d18;
                                    d6 = d17;
                                }
                                if (!(0.0 < d9)) break block46;
                                if (!(0.0 < d6)) break block47;
                                if (!(d9 <= d6)) {
                                    return n2;
                                }
                                break block48;
                            }
                            return n2;
                        }
                        if (0.0 < d6) {
                            return -n2;
                        }
                        if (!(d9 >= d6)) break block49;
                        n2 = -n2;
                        d9 = -d9;
                        d6 = -d6;
                    }
                    do {
                        double d20 = Math.floor((double)(d6 / d9));
                        d6 -= d20 * d9;
                        if ((d8 -= d20 * d7) < 0.0) {
                            return -n2;
                        }
                        if (d8 > d7) {
                            return n2;
                        }
                        if (d9 > d6 + d6) {
                            if (d7 < d8 + d8) {
                                return n2;
                            }
                        } else {
                            if (d7 > d8 + d8) {
                                return -n2;
                            }
                            d6 = d9 - d6;
                            d8 = d7 - d8;
                            n2 = -n2;
                        }
                        if (d8 == 0.0) {
                            if (d6 == 0.0) {
                                return 0;
                            }
                            return -n2;
                        }
                        if (d6 == 0.0) {
                            return n2;
                        }
                        double d21 = Math.floor((double)(d9 / d6));
                        d9 -= d21 * d6;
                        if ((d7 -= d21 * d8) < 0.0) {
                            return n2;
                        }
                        if (d7 > d8) {
                            return -n2;
                        }
                        if (d6 > d9 + d9) {
                            if (d8 < d7 + d7) {
                                return -n2;
                            }
                        } else {
                            if (d8 > d7 + d7) {
                                return n2;
                            }
                            d9 = d6 - d9;
                            d7 = d8 - d7;
                            n2 = -n2;
                        }
                        if (d7 != 0.0) continue;
                        if (d9 == 0.0) {
                            return 0;
                        }
                        return n2;
                    } while (d9 != 0.0);
                    return -n2;
                }
                return -n2;
            }
            if (d8 > 0.0) {
                if (d9 > 0.0) {
                    return 1;
                }
                return n2;
            }
            if (d9 > 0.0) {
                return n2;
            }
            return 1;
        }
        if (d7 != 0.0) {
            if (d6 == 0.0) {
                return 0;
            }
            if (d7 > 0.0) {
                if (d6 > 0.0) {
                    return n2;
                }
                return 1;
            }
            if (d6 > 0.0) {
                return 1;
            }
            return n2;
        }
        return 0;
    }
}

