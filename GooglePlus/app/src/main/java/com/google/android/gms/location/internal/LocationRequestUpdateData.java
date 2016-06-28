package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fdf;
import fea;
import fec;
import fed;
import fee;

public class LocationRequestUpdateData
  implements SafeParcelable
{
  public static final fdf CREATOR = new fdf();
  final int a;
  int b;
  LocationRequestInternal c;
  fed d;
  PendingIntent e;
  fea f;
  
  public LocationRequestUpdateData(int paramInt1, int paramInt2, LocationRequestInternal paramLocationRequestInternal, IBinder paramIBinder1, PendingIntent paramPendingIntent, IBinder paramIBinder2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLocationRequestInternal;
    fed localfed;
    Object localObject;
    if (paramIBinder1 == null)
    {
      localfed = null;
      this.d = localfed;
      this.e = paramPendingIntent;
      localObject = null;
      if (paramIBinder2 != null) {
        break label64;
      }
    }
    for (;;)
    {
      this.f = ((fea)localObject);
      return;
      localfed = fee.a(paramIBinder1);
      break;
      label64:
      localObject = null;
      if (paramIBinder2 != null)
      {
        IInterface localIInterface = paramIBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if ((localIInterface != null) && ((localIInterface instanceof fea))) {
          localObject = (fea)localIInterface;
        } else {
          localObject = new fec(paramIBinder2);
        }
      }
    }
  }
  
  public static LocationRequestUpdateData a(fea paramfea)
  {
    return new LocationRequestUpdateData(1, 2, null, null, null, paramfea.asBinder());
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(k);
    efj.a(paramParcel, 2, this.c, paramInt, false);
    IBinder localIBinder1;
    IBinder localIBinder2;
    if (this.d == null)
    {
      localIBinder1 = null;
      efj.a(paramParcel, 3, localIBinder1, false);
      efj.a(paramParcel, 4, this.e, paramInt, false);
      fea localfea = this.f;
      localIBinder2 = null;
      if (localfea != null) {
        break label128;
      }
    }
    for (;;)
    {
      efj.a(paramParcel, 5, localIBinder2, false);
      efj.n(paramParcel, i);
      return;
      localIBinder1 = this.d.asBinder();
      break;
      label128:
      localIBinder2 = this.f.asBinder();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.internal.LocationRequestUpdateData
 * JD-Core Version:    0.7.0.1
 */