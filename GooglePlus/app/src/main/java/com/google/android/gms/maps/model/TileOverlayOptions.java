package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fja;
import fjz;
import fkb;
import fkq;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final fkq CREATOR = new fkq();
  final int a;
  fjz b;
  boolean c = true;
  float d;
  boolean e = true;
  
  public TileOverlayOptions()
  {
    this.a = 1;
  }
  
  public TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    this.a = paramInt;
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      this.b = ((fjz)localObject);
      if (this.b != null) {
        new fja(this);
      }
      this.c = paramBoolean1;
      this.d = paramFloat;
      this.e = paramBoolean2;
      return;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof fjz))) {
        localObject = (fjz)localIInterface;
      } else {
        localObject = new fkb(paramIBinder);
      }
    }
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
    efj.a(paramParcel, 2, this.b.asBinder(), false);
    efj.a(paramParcel, 3, this.c);
    float f = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeFloat(f);
    efj.a(paramParcel, 5, this.e);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlayOptions
 * JD-Core Version:    0.7.0.1
 */