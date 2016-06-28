package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fkn;
import java.util.Arrays;

public class StreetViewPanoramaLocation
  implements SafeParcelable
{
  public static final fkn CREATOR = new fkn();
  final int a;
  public final StreetViewPanoramaLink[] b;
  public final LatLng c;
  public final String d;
  
  public StreetViewPanoramaLocation(int paramInt, StreetViewPanoramaLink[] paramArrayOfStreetViewPanoramaLink, LatLng paramLatLng, String paramString)
  {
    this.a = paramInt;
    this.b = paramArrayOfStreetViewPanoramaLink;
    this.c = paramLatLng;
    this.d = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    StreetViewPanoramaLocation localStreetViewPanoramaLocation;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaLocation)) {
        return false;
      }
      localStreetViewPanoramaLocation = (StreetViewPanoramaLocation)paramObject;
    } while ((this.d.equals(localStreetViewPanoramaLocation.d)) && (this.c.equals(localStreetViewPanoramaLocation.c)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.c;
    arrayOfObject[1] = this.d;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    return new ejg(this).a("panoId", this.d).a("position", this.c.toString()).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.a(paramParcel, 3, this.c, paramInt, false);
    efj.a(paramParcel, 4, this.d, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaLocation
 * JD-Core Version:    0.7.0.1
 */