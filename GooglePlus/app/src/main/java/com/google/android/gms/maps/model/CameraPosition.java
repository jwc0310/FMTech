package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import feu;
import fiv;
import fkc;
import java.util.Arrays;

public final class CameraPosition
  implements SafeParcelable
{
  public static final fkc CREATOR = new fkc();
  final int a;
  public final LatLng b;
  public final float c;
  public final float d;
  public final float e;
  
  public CameraPosition(int paramInt, LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    efj.b(paramLatLng, "null camera target");
    if ((0.0F <= paramFloat2) && (paramFloat2 <= 90.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Float.valueOf(paramFloat2);
      efj.a(bool, "Tilt needs to be between 0 and 90 inclusive: %s", arrayOfObject);
      this.a = paramInt;
      this.b = paramLatLng;
      this.c = paramFloat1;
      this.d = (paramFloat2 + 0.0F);
      if (paramFloat3 <= 0.0D) {
        paramFloat3 = 360.0F + paramFloat3 % 360.0F;
      }
      this.e = (paramFloat3 % 360.0F);
      return;
    }
  }
  
  public CameraPosition(LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(1, paramLatLng, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static CameraPosition a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, feu.a);
    if (localTypedArray.hasValue(feu.c)) {}
    for (float f1 = localTypedArray.getFloat(feu.c, 0.0F);; f1 = 0.0F)
    {
      if (localTypedArray.hasValue(feu.d)) {}
      for (float f2 = localTypedArray.getFloat(feu.d, 0.0F);; f2 = 0.0F)
      {
        LatLng localLatLng = new LatLng(f1, f2);
        fiv localfiv = new fiv();
        localfiv.a = localLatLng;
        if (localTypedArray.hasValue(feu.f)) {
          localfiv.b = localTypedArray.getFloat(feu.f, 0.0F);
        }
        if (localTypedArray.hasValue(feu.b)) {
          localfiv.d = localTypedArray.getFloat(feu.b, 0.0F);
        }
        if (localTypedArray.hasValue(feu.e)) {
          localfiv.c = localTypedArray.getFloat(feu.e, 0.0F);
        }
        return new CameraPosition(localfiv.a, localfiv.b, localfiv.c, localfiv.d);
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    CameraPosition localCameraPosition;
    do
    {
      return true;
      if (!(paramObject instanceof CameraPosition)) {
        return false;
      }
      localCameraPosition = (CameraPosition)paramObject;
    } while ((this.b.equals(localCameraPosition.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localCameraPosition.c)) && (Float.floatToIntBits(this.d) == Float.floatToIntBits(localCameraPosition.d)) && (Float.floatToIntBits(this.e) == Float.floatToIntBits(localCameraPosition.e)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = Float.valueOf(this.c);
    arrayOfObject[2] = Float.valueOf(this.d);
    arrayOfObject[3] = Float.valueOf(this.e);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return new ejg(this).a("target", this.b).a("zoom", Float.valueOf(this.c)).a("tilt", Float.valueOf(this.d)).a("bearing", Float.valueOf(this.e)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    float f1 = this.c;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeFloat(f1);
    float f2 = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeFloat(f2);
    float f3 = this.e;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeFloat(f3);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CameraPosition
 * JD-Core Version:    0.7.0.1
 */