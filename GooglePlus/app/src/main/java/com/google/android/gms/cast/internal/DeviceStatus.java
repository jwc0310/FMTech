package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import edd;
import ede;
import efj;
import java.util.Arrays;

public class DeviceStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator<DeviceStatus> CREATOR = new ede();
  final int a;
  public double b;
  public boolean c;
  public int d;
  public ApplicationMetadata e;
  public int f;
  
  public DeviceStatus()
  {
    this(3, (0.0D / 0.0D), false, -1, null, -1);
  }
  
  public DeviceStatus(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2, ApplicationMetadata paramApplicationMetadata, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramDouble;
    this.c = paramBoolean;
    this.d = paramInt2;
    this.e = paramApplicationMetadata;
    this.f = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    DeviceStatus localDeviceStatus;
    do
    {
      return true;
      if (!(paramObject instanceof DeviceStatus)) {
        return false;
      }
      localDeviceStatus = (DeviceStatus)paramObject;
    } while ((this.b == localDeviceStatus.b) && (this.c == localDeviceStatus.c) && (this.d == localDeviceStatus.d) && (edd.a(this.e, localDeviceStatus.e)) && (this.f == localDeviceStatus.f));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Double.valueOf(this.b);
    arrayOfObject[1] = Boolean.valueOf(this.c);
    arrayOfObject[2] = Integer.valueOf(this.d);
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = Integer.valueOf(this.f);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    double d1 = this.b;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeDouble(d1);
    efj.a(paramParcel, 3, this.c);
    int k = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeInt(k);
    efj.a(paramParcel, 5, this.e, paramInt, false);
    int m = this.f;
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(m);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.internal.DeviceStatus
 * JD-Core Version:    0.7.0.1
 */