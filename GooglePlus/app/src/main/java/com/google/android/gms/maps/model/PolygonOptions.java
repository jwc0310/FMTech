package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fkj;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions
  implements SafeParcelable
{
  public static final fkj CREATOR = new fkj();
  final int a;
  final List<LatLng> b;
  final List<List<LatLng>> c;
  float d = 10.0F;
  int e = -16777216;
  int f = 0;
  float g = 0.0F;
  boolean h = true;
  boolean i = false;
  
  public PolygonOptions()
  {
    this.a = 1;
    this.b = new ArrayList();
    this.c = new ArrayList();
  }
  
  public PolygonOptions(int paramInt1, List<LatLng> paramList, List paramList1, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramList1;
    this.d = paramFloat1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramFloat2;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = efj.m(paramParcel, 20293);
    int k = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(k);
    efj.c(paramParcel, 2, this.b, false);
    List localList = this.c;
    if (localList != null)
    {
      int i1 = efj.m(paramParcel, 3);
      paramParcel.writeList(localList);
      efj.n(paramParcel, i1);
    }
    float f1 = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeFloat(f1);
    int m = this.e;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeInt(m);
    int n = this.f;
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(n);
    float f2 = this.g;
    efj.b(paramParcel, 7, 4);
    paramParcel.writeFloat(f2);
    efj.a(paramParcel, 8, this.h);
    efj.a(paramParcel, 9, this.i);
    efj.n(paramParcel, j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.PolygonOptions
 * JD-Core Version:    0.7.0.1
 */