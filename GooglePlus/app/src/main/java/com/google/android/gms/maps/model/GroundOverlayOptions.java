package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import euz;
import eva;
import fiu;
import fke;

public final class GroundOverlayOptions
  implements SafeParcelable
{
  public static final fke CREATOR = new fke();
  final int a;
  fiu b;
  LatLng c;
  float d;
  float e;
  LatLngBounds f;
  float g;
  float h;
  boolean i = true;
  float j = 0.0F;
  float k = 0.5F;
  float l = 0.5F;
  
  public GroundOverlayOptions()
  {
    this.a = 1;
  }
  
  public GroundOverlayOptions(int paramInt, IBinder paramIBinder, LatLng paramLatLng, float paramFloat1, float paramFloat2, LatLngBounds paramLatLngBounds, float paramFloat3, float paramFloat4, boolean paramBoolean, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.a = paramInt;
    this.b = new fiu(eva.a(paramIBinder));
    this.c = paramLatLng;
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = paramLatLngBounds;
    this.g = paramFloat3;
    this.h = paramFloat4;
    this.i = paramBoolean;
    this.j = paramFloat5;
    this.k = paramFloat6;
    this.l = paramFloat7;
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
    efj.a(paramParcel, 2, this.b.a.asBinder(), false);
    efj.a(paramParcel, 3, this.c, paramInt, false);
    float f1 = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeFloat(f1);
    float f2 = this.e;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeFloat(f2);
    efj.a(paramParcel, 6, this.f, paramInt, false);
    float f3 = this.g;
    efj.b(paramParcel, 7, 4);
    paramParcel.writeFloat(f3);
    float f4 = this.h;
    efj.b(paramParcel, 8, 4);
    paramParcel.writeFloat(f4);
    efj.a(paramParcel, 9, this.i);
    float f5 = this.j;
    efj.b(paramParcel, 10, 4);
    paramParcel.writeFloat(f5);
    float f6 = this.k;
    efj.b(paramParcel, 11, 4);
    paramParcel.writeFloat(f6);
    float f7 = this.l;
    efj.b(paramParcel, 12, 4);
    paramParcel.writeFloat(f7);
    efj.n(paramParcel, m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.GroundOverlayOptions
 * JD-Core Version:    0.7.0.1
 */