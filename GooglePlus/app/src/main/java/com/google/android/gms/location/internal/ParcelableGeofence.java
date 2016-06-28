package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fdg;
import java.util.Locale;

public class ParcelableGeofence
  implements SafeParcelable
{
  public static final fdg CREATOR = new fdg();
  final int a;
  final String b;
  final long c;
  final short d;
  final double e;
  final double f;
  final float g;
  final int h;
  final int i;
  final int j;
  
  public ParcelableGeofence(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
    int k = paramInt2 & 0x7;
    if (k == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt2);
    }
    this.a = paramInt1;
    this.d = paramShort;
    this.b = paramString;
    this.e = paramDouble1;
    this.f = paramDouble2;
    this.g = paramFloat;
    this.c = paramLong;
    this.h = k;
    this.i = paramInt3;
    this.j = paramInt4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ParcelableGeofence localParcelableGeofence;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof ParcelableGeofence)) {
        return false;
      }
      localParcelableGeofence = (ParcelableGeofence)paramObject;
      if (this.g != localParcelableGeofence.g) {
        return false;
      }
      if (this.e != localParcelableGeofence.e) {
        return false;
      }
      if (this.f != localParcelableGeofence.f) {
        return false;
      }
    } while (this.d == localParcelableGeofence.d);
    return false;
  }
  
  public int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.e);
    int k = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.f);
    return 31 * (31 * (31 * (k * 31 + (int)(l2 ^ l2 >>> 32)) + Float.floatToIntBits(this.g)) + this.d) + this.h;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[9];
    switch (this.d)
    {
    }
    for (String str = null;; str = "CIRCLE")
    {
      arrayOfObject[0] = str;
      arrayOfObject[1] = this.b;
      arrayOfObject[2] = Integer.valueOf(this.h);
      arrayOfObject[3] = Double.valueOf(this.e);
      arrayOfObject[4] = Double.valueOf(this.f);
      arrayOfObject[5] = Float.valueOf(this.g);
      arrayOfObject[6] = Integer.valueOf(this.i / 1000);
      arrayOfObject[7] = Integer.valueOf(this.j);
      arrayOfObject[8] = Long.valueOf(this.c);
      return String.format(localLocale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", arrayOfObject);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.b, false);
    int m = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(m);
    long l = this.c;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeLong(l);
    int n = this.d;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeInt(n);
    double d1 = this.e;
    efj.b(paramParcel, 4, 8);
    paramParcel.writeDouble(d1);
    double d2 = this.f;
    efj.b(paramParcel, 5, 8);
    paramParcel.writeDouble(d2);
    float f1 = this.g;
    efj.b(paramParcel, 6, 4);
    paramParcel.writeFloat(f1);
    int i1 = this.h;
    efj.b(paramParcel, 7, 4);
    paramParcel.writeInt(i1);
    int i2 = this.i;
    efj.b(paramParcel, 8, 4);
    paramParcel.writeInt(i2);
    int i3 = this.j;
    efj.b(paramParcel, 9, 4);
    paramParcel.writeInt(i3);
    efj.n(paramParcel, k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.internal.ParcelableGeofence
 * JD-Core Version:    0.7.0.1
 */