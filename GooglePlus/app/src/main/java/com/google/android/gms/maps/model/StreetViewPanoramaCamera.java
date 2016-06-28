package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fiz;
import fkl;
import java.util.Arrays;

public class StreetViewPanoramaCamera
  implements SafeParcelable
{
  public static final fkl CREATOR = new fkl();
  final int a;
  public final float b;
  public final float c;
  public final float d;
  
  public StreetViewPanoramaCamera(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool;
    if ((-90.0F <= paramFloat2) && (paramFloat2 <= 90.0F))
    {
      bool = true;
      efj.b(bool, "Tilt needs to be between -90 and 90 inclusive");
      this.a = paramInt;
      if (paramFloat1 <= 0.0D) {
        paramFloat1 = 0.0F;
      }
      this.b = paramFloat1;
      this.c = (paramFloat2 + 0.0F);
      if (paramFloat3 > 0.0D) {
        break label128;
      }
    }
    label128:
    for (float f = 360.0F + paramFloat3 % 360.0F;; f = paramFloat3)
    {
      this.d = (f % 360.0F);
      fiz localfiz = new fiz();
      localfiz.b = paramFloat2;
      localfiz.a = paramFloat3;
      new StreetViewPanoramaOrientation(localfiz.b, localfiz.a);
      return;
      bool = false;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    StreetViewPanoramaCamera localStreetViewPanoramaCamera;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaCamera)) {
        return false;
      }
      localStreetViewPanoramaCamera = (StreetViewPanoramaCamera)paramObject;
    } while ((Float.floatToIntBits(this.b) == Float.floatToIntBits(localStreetViewPanoramaCamera.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localStreetViewPanoramaCamera.c)) && (Float.floatToIntBits(this.d) == Float.floatToIntBits(localStreetViewPanoramaCamera.d)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Float.valueOf(this.b);
    arrayOfObject[1] = Float.valueOf(this.c);
    arrayOfObject[2] = Float.valueOf(this.d);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    return new ejg(this).a("zoom", Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
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
    float f3 = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeFloat(f3);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaCamera
 * JD-Core Version:    0.7.0.1
 */