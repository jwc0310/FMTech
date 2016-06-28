package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fkd;

public final class CircleOptions
  implements SafeParcelable
{
  public static final fkd CREATOR = new fkd();
  final int a;
  public LatLng b = null;
  public double c = 0.0D;
  public float d = 10.0F;
  public int e = -16777216;
  public int f = 0;
  float g = 0.0F;
  boolean h = true;
  
  public CircleOptions()
  {
    this.a = 1;
  }
  
  public CircleOptions(int paramInt1, LatLng paramLatLng, double paramDouble, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramLatLng;
    this.c = paramDouble;
    this.d = paramFloat1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramFloat2;
    this.h = paramBoolean;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    double d1 = this.c;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeDouble(d1);
    float f1 = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeFloat(f1);
    int k = this.e;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeInt(k);
    int m = this.f;
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(m);
    float f2 = this.g;
    efj.b(paramParcel, 7, 4);
    paramParcel.writeFloat(f2);
    efj.a(paramParcel, 8, this.h);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CircleOptions
 * JD-Core Version:    0.7.0.1
 */