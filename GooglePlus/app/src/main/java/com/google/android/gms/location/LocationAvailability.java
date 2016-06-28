package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fca;
import java.util.Arrays;

public final class LocationAvailability
  implements SafeParcelable
{
  public static final fca CREATOR = new fca();
  final int a;
  int b;
  int c;
  long d;
  public int e;
  
  public LocationAvailability(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    this.a = paramInt1;
    this.e = paramInt2;
    this.b = paramInt3;
    this.c = paramInt4;
    this.d = paramLong;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationAvailability)) {}
    LocationAvailability localLocationAvailability;
    do
    {
      return false;
      localLocationAvailability = (LocationAvailability)paramObject;
    } while ((this.e != localLocationAvailability.e) || (this.b != localLocationAvailability.b) || (this.c != localLocationAvailability.c) || (this.d != localLocationAvailability.d));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.e);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(this.c);
    arrayOfObject[3] = Long.valueOf(this.d);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LocationAvailability[isLocationAvailable: ");
    if (this.e < 1000) {}
    for (boolean bool = true;; bool = false) {
      return bool + "]";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(k);
    int m = this.c;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(m);
    long l = this.d;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeLong(l);
    int n = this.e;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeInt(n);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationAvailability
 * JD-Core Version:    0.7.0.1
 */