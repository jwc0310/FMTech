package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fkg;

public final class LatLng
  implements SafeParcelable
{
  public static final fkg CREATOR = new fkg();
  final int a;
  public final double b;
  public final double c;
  
  public LatLng(double paramDouble1, double paramDouble2)
  {
    this(1, paramDouble1, paramDouble2);
  }
  
  public LatLng(int paramInt, double paramDouble1, double paramDouble2)
  {
    this.a = paramInt;
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D)) {}
    for (this.c = paramDouble2;; this.c = ((360.0D + (paramDouble2 - 180.0D) % 360.0D) % 360.0D - 180.0D))
    {
      this.b = Math.max(-90.0D, Math.min(90.0D, paramDouble1));
      return;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LatLng localLatLng;
    do
    {
      return true;
      if (!(paramObject instanceof LatLng)) {
        return false;
      }
      localLatLng = (LatLng)paramObject;
    } while ((Double.doubleToLongBits(this.b) == Double.doubleToLongBits(localLatLng.b)) && (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(localLatLng.c)));
    return false;
  }
  
  public final int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.b);
    int i = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.c);
    return i * 31 + (int)(l2 ^ l2 >>> 32);
  }
  
  public final String toString()
  {
    return "lat/lng: (" + this.b + "," + this.c + ")";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    double d1 = this.b;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeDouble(d1);
    double d2 = this.c;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeDouble(d2);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLng
 * JD-Core Version:    0.7.0.1
 */