package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fko;
import java.util.Arrays;

public class StreetViewPanoramaOrientation
  implements SafeParcelable
{
  public static final fko CREATOR = new fko();
  final int a;
  public final float b;
  public final float c;
  
  public StreetViewPanoramaOrientation(float paramFloat1, float paramFloat2)
  {
    this(1, paramFloat1, paramFloat2);
  }
  
  public StreetViewPanoramaOrientation(int paramInt, float paramFloat1, float paramFloat2)
  {
    if ((-90.0F <= paramFloat1) && (paramFloat1 <= 90.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      efj.b(bool, "Tilt needs to be between -90 and 90 inclusive");
      this.a = paramInt;
      this.b = (0.0F + paramFloat1);
      if (paramFloat2 <= 0.0D) {
        paramFloat2 = 360.0F + paramFloat2 % 360.0F;
      }
      this.c = (paramFloat2 % 360.0F);
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    StreetViewPanoramaOrientation localStreetViewPanoramaOrientation;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaOrientation)) {
        return false;
      }
      localStreetViewPanoramaOrientation = (StreetViewPanoramaOrientation)paramObject;
    } while ((Float.floatToIntBits(this.b) == Float.floatToIntBits(localStreetViewPanoramaOrientation.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localStreetViewPanoramaOrientation.c)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Float.valueOf(this.b);
    arrayOfObject[1] = Float.valueOf(this.c);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    return new ejg(this).a("tilt", Float.valueOf(this.b)).a("bearing", Float.valueOf(this.c)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    float f1 = this.b;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeFloat(f1);
    float f2 = this.c;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeFloat(f2);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaOrientation
 * JD-Core Version:    0.7.0.1
 */