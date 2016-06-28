package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import efj;
import fkt;

public final class StreetViewPanoramaOptions
  implements SafeParcelable
{
  public static final fkt CREATOR = new fkt();
  final int a;
  StreetViewPanoramaCamera b;
  String c;
  LatLng d;
  Integer e;
  Boolean f = Boolean.valueOf(true);
  Boolean g = Boolean.valueOf(true);
  Boolean h = Boolean.valueOf(true);
  Boolean i = Boolean.valueOf(true);
  Boolean j;
  
  public StreetViewPanoramaOptions()
  {
    this.a = 1;
  }
  
  public StreetViewPanoramaOptions(int paramInt, StreetViewPanoramaCamera paramStreetViewPanoramaCamera, String paramString, LatLng paramLatLng, Integer paramInteger, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5)
  {
    this.a = paramInt;
    this.b = paramStreetViewPanoramaCamera;
    this.d = paramLatLng;
    this.e = paramInteger;
    this.c = paramString;
    this.f = efj.a(paramByte1);
    this.g = efj.a(paramByte2);
    this.h = efj.a(paramByte3);
    this.i = efj.a(paramByte4);
    this.j = efj.a(paramByte5);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = efj.m(paramParcel, 20293);
    int m = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(m);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, paramInt, false);
    efj.a(paramParcel, 5, this.e, false);
    int n = efj.a(this.f);
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(n);
    int i1 = efj.a(this.g);
    efj.b(paramParcel, 7, 4);
    paramParcel.writeInt(i1);
    int i2 = efj.a(this.h);
    efj.b(paramParcel, 8, 4);
    paramParcel.writeInt(i2);
    int i3 = efj.a(this.i);
    efj.b(paramParcel, 9, 4);
    paramParcel.writeInt(i3);
    int i4 = efj.a(this.j);
    efj.b(paramParcel, 10, 4);
    paramParcel.writeInt(i4);
    efj.n(paramParcel, k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaOptions
 * JD-Core Version:    0.7.0.1
 */