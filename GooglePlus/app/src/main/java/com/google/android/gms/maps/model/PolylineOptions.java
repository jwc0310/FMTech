package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fkk;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions
  implements SafeParcelable
{
  public static final fkk CREATOR = new fkk();
  final int a;
  final List<LatLng> b;
  float c = 10.0F;
  int d = -16777216;
  float e = 0.0F;
  boolean f = true;
  boolean g = false;
  
  public PolylineOptions()
  {
    this.a = 1;
    this.b = new ArrayList();
  }
  
  public PolylineOptions(int paramInt1, List paramList, float paramFloat1, int paramInt2, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramFloat1;
    this.d = paramInt2;
    this.e = paramFloat2;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
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
    efj.c(paramParcel, 2, this.b, false);
    float f1 = this.c;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeFloat(f1);
    int k = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeInt(k);
    float f2 = this.e;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeFloat(f2);
    efj.a(paramParcel, 6, this.f);
    efj.a(paramParcel, 7, this.g);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.PolylineOptions
 * JD-Core Version:    0.7.0.1
 */