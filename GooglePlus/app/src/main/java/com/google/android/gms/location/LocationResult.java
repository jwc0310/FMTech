package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import feg;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult
  implements SafeParcelable
{
  public static final Parcelable.Creator<LocationResult> CREATOR = new feg();
  public static final List<Location> a = ;
  final int b;
  public final List<Location> c;
  
  public LocationResult(int paramInt, List<Location> paramList)
  {
    this.b = paramInt;
    this.c = paramList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationResult)) {
      return false;
    }
    LocationResult localLocationResult = (LocationResult)paramObject;
    if (localLocationResult.c.size() != this.c.size()) {
      return false;
    }
    Iterator localIterator1 = localLocationResult.c.iterator();
    Iterator localIterator2 = this.c.iterator();
    while (localIterator1.hasNext())
    {
      Location localLocation1 = (Location)localIterator2.next();
      Location localLocation2 = (Location)localIterator1.next();
      if (localLocation1.getTime() != localLocation2.getTime()) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = this.c.iterator();
    long l;
    for (int i = 17; localIterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31) {
      l = ((Location)localIterator.next()).getTime();
    }
    return i;
  }
  
  public final String toString()
  {
    return "LocationResult[locations: " + this.c + "]";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.c(paramParcel, 1, this.c, false);
    int j = this.b;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationResult
 * JD-Core Version:    0.7.0.1
 */