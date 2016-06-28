package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import euz;
import eva;
import fiu;
import fkh;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final fkh CREATOR = new fkh();
  final int a;
  public LatLng b;
  public String c;
  String d;
  public fiu e;
  public float f = 0.5F;
  public float g = 1.0F;
  boolean h;
  boolean i = true;
  boolean j = false;
  float k = 0.0F;
  float l = 0.5F;
  float m = 0.0F;
  float n = 1.0F;
  
  public MarkerOptions()
  {
    this.a = 1;
  }
  
  public MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.a = paramInt;
    this.b = paramLatLng;
    this.c = paramString1;
    this.d = paramString2;
    if (paramIBinder == null) {}
    for (fiu localfiu = null;; localfiu = new fiu(eva.a(paramIBinder)))
    {
      this.e = localfiu;
      this.f = paramFloat1;
      this.g = paramFloat2;
      this.h = paramBoolean1;
      this.i = paramBoolean2;
      this.j = paramBoolean3;
      this.k = paramFloat3;
      this.l = paramFloat4;
      this.m = paramFloat5;
      this.n = paramFloat6;
      return;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = efj.m(paramParcel, 20293);
    int i2 = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(i2);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, false);
    if (this.e == null) {}
    for (IBinder localIBinder = null;; localIBinder = this.e.a.asBinder())
    {
      efj.a(paramParcel, 5, localIBinder, false);
      float f1 = this.f;
      efj.b(paramParcel, 6, 4);
      paramParcel.writeFloat(f1);
      float f2 = this.g;
      efj.b(paramParcel, 7, 4);
      paramParcel.writeFloat(f2);
      efj.a(paramParcel, 8, this.h);
      efj.a(paramParcel, 9, this.i);
      efj.a(paramParcel, 10, this.j);
      float f3 = this.k;
      efj.b(paramParcel, 11, 4);
      paramParcel.writeFloat(f3);
      float f4 = this.l;
      efj.b(paramParcel, 12, 4);
      paramParcel.writeFloat(f4);
      float f5 = this.m;
      efj.b(paramParcel, 13, 4);
      paramParcel.writeFloat(f5);
      float f6 = this.n;
      efj.b(paramParcel, 14, 4);
      paramParcel.writeFloat(f6);
      efj.n(paramParcel, i1);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.MarkerOptions
 * JD-Core Version:    0.7.0.1
 */