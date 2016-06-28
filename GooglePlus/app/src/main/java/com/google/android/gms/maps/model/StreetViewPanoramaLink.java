package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fkm;
import java.util.Arrays;

public class StreetViewPanoramaLink
  implements SafeParcelable
{
  public static final fkm CREATOR = new fkm();
  final int a;
  public final String b;
  public final float c;
  
  public StreetViewPanoramaLink(int paramInt, String paramString, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramString;
    if (paramFloat <= 0.0D) {
      paramFloat = 360.0F + paramFloat % 360.0F;
    }
    this.c = (paramFloat % 360.0F);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    StreetViewPanoramaLink localStreetViewPanoramaLink;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaLink)) {
        return false;
      }
      localStreetViewPanoramaLink = (StreetViewPanoramaLink)paramObject;
    } while ((this.b.equals(localStreetViewPanoramaLink.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localStreetViewPanoramaLink.c)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = Float.valueOf(this.c);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    return new ejg(this).a("panoId", this.b).a("bearing", Float.valueOf(this.c)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, false);
    float f = this.c;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeFloat(f);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaLink
 * JD-Core Version:    0.7.0.1
 */