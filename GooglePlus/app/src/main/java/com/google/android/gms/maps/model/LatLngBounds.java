package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fix;
import fkf;
import java.util.Arrays;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final fkf CREATOR = new fkf();
  final int a;
  public final LatLng b;
  public final LatLng c;
  
  public LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    efj.b(paramLatLng1, "null southwest");
    efj.b(paramLatLng2, "null northeast");
    if (paramLatLng2.b >= paramLatLng1.b) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLatLng1.b);
      arrayOfObject[1] = Double.valueOf(paramLatLng2.b);
      efj.a(bool, "southern latitude exceeds northern latitude (%s > %s)", arrayOfObject);
      this.a = paramInt;
      this.b = paramLatLng1;
      this.c = paramLatLng2;
      return;
    }
  }
  
  public LatLngBounds(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    this(1, paramLatLng1, paramLatLng2);
  }
  
  public static fix a()
  {
    return new fix();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LatLngBounds localLatLngBounds;
    do
    {
      return true;
      if (!(paramObject instanceof LatLngBounds)) {
        return false;
      }
      localLatLngBounds = (LatLngBounds)paramObject;
    } while ((this.b.equals(localLatLngBounds.b)) && (this.c.equals(localLatLngBounds.c)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return new ejg(this).a("southwest", this.b).a("northeast", this.c).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.a(paramParcel, 3, this.c, paramInt, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds
 * JD-Core Version:    0.7.0.1
 */