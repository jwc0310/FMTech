package com.google.android.gms.herrevad;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import exp;

public class PredictedNetworkQuality
  implements SafeParcelable
{
  public static final Parcelable.Creator<PredictedNetworkQuality> CREATOR = new exp();
  final int a;
  public int b;
  public int c;
  public long d;
  public long e;
  
  public PredictedNetworkQuality()
  {
    this.a = 1;
    this.c = -1;
    this.d = -1L;
    this.e = -1L;
  }
  
  public PredictedNetworkQuality(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramLong1;
    this.e = paramLong2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName()).append("[\n");
    localStringBuilder.append("networkType: ").append(this.b).append("\n");
    localStringBuilder.append("predictedLatencyMicros: ").append(this.c).append("\n");
    localStringBuilder.append("predictedDownThroughputBps: ").append(this.d).append("\n");
    localStringBuilder.append("predictedUpThroughputBps: ").append(this.d).append("\n");
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
    int m = this.c;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeInt(m);
    long l1 = this.d;
    efj.b(paramParcel, 4, 8);
    paramParcel.writeLong(l1);
    long l2 = this.e;
    efj.b(paramParcel, 5, 8);
    paramParcel.writeLong(l2);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.herrevad.PredictedNetworkQuality
 * JD-Core Version:    0.7.0.1
 */