package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fcd;
import java.util.Arrays;

public final class LocationRequest
  implements SafeParcelable
{
  public static final fcd CREATOR = new fcd();
  final int a;
  public int b;
  public long c;
  public long d;
  public boolean e;
  public long f;
  public int g;
  float h;
  long i;
  
  public LocationRequest()
  {
    this.a = 1;
    this.b = 102;
    this.c = 3600000L;
    this.d = 600000L;
    this.e = false;
    this.f = 9223372036854775807L;
    this.g = 2147483647;
    this.h = 0.0F;
    this.i = 0L;
  }
  
  public LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat, long paramLong4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramBoolean;
    this.f = paramLong3;
    this.g = paramInt3;
    this.h = paramFloat;
    this.i = paramLong4;
  }
  
  public static void b(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("invalid interval: " + paramLong);
    }
  }
  
  public final LocationRequest a(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("invalid numUpdates: " + paramInt);
    }
    this.g = paramInt;
    return this;
  }
  
  public final LocationRequest a(long paramLong)
  {
    b(paramLong);
    this.c = paramLong;
    if (!this.e) {
      this.d = ((this.c / 6.0D));
    }
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LocationRequest localLocationRequest;
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest)) {
        return false;
      }
      localLocationRequest = (LocationRequest)paramObject;
    } while ((this.b == localLocationRequest.b) && (this.c == localLocationRequest.c) && (this.d == localLocationRequest.d) && (this.e == localLocationRequest.e) && (this.f == localLocationRequest.f) && (this.g == localLocationRequest.g) && (this.h == localLocationRequest.h));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Long.valueOf(this.c);
    arrayOfObject[2] = Long.valueOf(this.d);
    arrayOfObject[3] = Boolean.valueOf(this.e);
    arrayOfObject[4] = Long.valueOf(this.f);
    arrayOfObject[5] = Integer.valueOf(this.g);
    arrayOfObject[6] = Float.valueOf(this.h);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("Request[");
    String str;
    switch (this.b)
    {
    case 101: 
    case 103: 
    default: 
      str = "???";
    }
    for (;;)
    {
      localStringBuilder2.append(str);
      if (this.b != 105)
      {
        localStringBuilder1.append(" requested=");
        localStringBuilder1.append(this.c + "ms");
      }
      localStringBuilder1.append(" fastest=");
      localStringBuilder1.append(this.d + "ms");
      if (this.i > this.c)
      {
        localStringBuilder1.append(" maxWait=");
        localStringBuilder1.append(this.i + "ms");
      }
      if (this.f != 9223372036854775807L)
      {
        long l = this.f - SystemClock.elapsedRealtime();
        localStringBuilder1.append(" expireIn=");
        localStringBuilder1.append(l + "ms");
      }
      if (this.g != 2147483647) {
        localStringBuilder1.append(" num=").append(this.g);
      }
      localStringBuilder1.append(']');
      return localStringBuilder1.toString();
      str = "PRIORITY_HIGH_ACCURACY";
      continue;
      str = "PRIORITY_BALANCED_POWER_ACCURACY";
      continue;
      str = "PRIORITY_LOW_POWER";
      continue;
      str = "PRIORITY_NO_POWER";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = efj.m(paramParcel, 20293);
    int k = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(k);
    int m = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(m);
    long l1 = this.c;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeLong(l1);
    long l2 = this.d;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeLong(l2);
    efj.a(paramParcel, 4, this.e);
    long l3 = this.f;
    efj.b(paramParcel, 5, 8);
    paramParcel.writeLong(l3);
    int n = this.g;
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(n);
    float f1 = this.h;
    efj.b(paramParcel, 7, 4);
    paramParcel.writeFloat(f1);
    long l4 = this.i;
    efj.b(paramParcel, 8, 8);
    paramParcel.writeLong(l4);
    efj.n(paramParcel, j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationRequest
 * JD-Core Version:    0.7.0.1
 */