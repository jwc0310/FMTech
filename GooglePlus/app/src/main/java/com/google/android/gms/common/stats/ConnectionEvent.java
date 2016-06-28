package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejl;

public final class ConnectionEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionEvent> CREATOR = new ejl();
  final int a;
  final long b;
  int c;
  final String d;
  final String e;
  final String f;
  final String g;
  final String h;
  final String i;
  final long j;
  final long k;
  
  public ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramLong2;
    this.k = paramLong3;
  }
  
  public ConnectionEvent(long paramLong1, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this(1, paramLong1, paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = efj.m(paramParcel, 20293);
    int n = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(n);
    long l1 = this.b;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeLong(l1);
    efj.a(paramParcel, 4, this.d, false);
    efj.a(paramParcel, 5, this.e, false);
    efj.a(paramParcel, 6, this.f, false);
    efj.a(paramParcel, 7, this.g, false);
    efj.a(paramParcel, 8, this.h, false);
    long l2 = this.j;
    efj.b(paramParcel, 10, 8);
    paramParcel.writeLong(l2);
    long l3 = this.k;
    efj.b(paramParcel, 11, 8);
    paramParcel.writeLong(l3);
    int i1 = this.c;
    efj.b(paramParcel, 12, 4);
    paramParcel.writeInt(i1);
    efj.a(paramParcel, 13, this.i, false);
    efj.n(paramParcel, m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.ConnectionEvent
 * JD-Core Version:    0.7.0.1
 */