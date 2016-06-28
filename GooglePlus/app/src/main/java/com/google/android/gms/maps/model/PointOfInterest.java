package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fki;

public final class PointOfInterest
  implements SafeParcelable
{
  public static final fki CREATOR = new fki();
  final int a;
  public final LatLng b;
  public final String c;
  public final String d;
  
  public PointOfInterest(int paramInt, LatLng paramLatLng, String paramString1, String paramString2)
  {
    this.a = paramInt;
    this.b = paramLatLng;
    this.c = paramString1;
    this.d = paramString2;
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
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.PointOfInterest
 * JD-Core Version:    0.7.0.1
 */