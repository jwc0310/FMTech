package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import exo;
import java.util.Iterator;
import java.util.Set;

public class NetworkQualityReport
  implements SafeParcelable
{
  public static final Parcelable.Creator<NetworkQualityReport> CREATOR = new exo();
  public final int a;
  public int b = -1;
  public long c = -1L;
  public long d = -1L;
  public long e = -1L;
  public int f = -1;
  public Bundle g = new Bundle();
  public boolean h = false;
  
  public NetworkQualityReport()
  {
    this.a = 1;
  }
  
  public NetworkQualityReport(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, Bundle paramBundle, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramLong3;
    this.f = paramInt3;
    this.g = paramBundle;
    this.h = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName()).append("[\n");
    localStringBuilder.append("mLatencyMicros: ").append(this.b).append("\n");
    localStringBuilder.append("mDurationMicros: ").append(this.c).append("\n");
    localStringBuilder.append("mBytesDownloaded: ").append(this.d).append("\n");
    localStringBuilder.append("mBytesUploaded: ").append(this.e).append("\n");
    localStringBuilder.append("mMeasurementType: ").append(this.f).append("\n");
    localStringBuilder.append("mIsNoConnectivity: ").append(this.h).append("\n");
    Iterator localIterator = this.g.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder.append("custom param: ").append(str).append("/").append(this.g.getString(str)).append("\n");
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.b;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(k);
    long l1 = this.c;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeLong(l1);
    long l2 = this.d;
    efj.b(paramParcel, 4, 8);
    paramParcel.writeLong(l2);
    long l3 = this.e;
    efj.b(paramParcel, 5, 8);
    paramParcel.writeLong(l3);
    int m = this.f;
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(m);
    efj.a(paramParcel, 7, this.g, false);
    efj.a(paramParcel, 8, this.h);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.herrevad.NetworkQualityReport
 * JD-Core Version:    0.7.0.1
 */