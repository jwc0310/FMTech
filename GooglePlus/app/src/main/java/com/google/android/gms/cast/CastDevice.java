package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import edd;
import eds;
import efj;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastDevice
  implements SafeParcelable
{
  public static final Parcelable.Creator<CastDevice> CREATOR = new eds();
  final int a;
  String b;
  String c;
  public String d;
  String e;
  String f;
  int g;
  List<WebImage> h;
  int i;
  int j;
  private Inet4Address k;
  
  private CastDevice()
  {
    this(3, null, null, null, null, null, -1, new ArrayList(), 0, -1);
  }
  
  public CastDevice(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, List<WebImage> paramList, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    if (this.c != null) {}
    try
    {
      InetAddress localInetAddress = InetAddress.getByName(this.c);
      if ((localInetAddress instanceof Inet4Address)) {
        this.k = ((Inet4Address)localInetAddress);
      }
      this.d = paramString3;
      this.e = paramString4;
      this.f = paramString5;
      this.g = paramInt2;
      this.h = paramList;
      this.i = paramInt3;
      this.j = paramInt4;
      return;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      for (;;)
      {
        this.k = null;
      }
    }
  }
  
  public static CastDevice a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(CastDevice.class.getClassLoader());
    return (CastDevice)paramBundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    CastDevice localCastDevice;
    do
    {
      do
      {
        return true;
        if (!(paramObject instanceof CastDevice)) {
          return false;
        }
        localCastDevice = (CastDevice)paramObject;
        if (this.b != null) {
          break;
        }
      } while (localCastDevice.b == null);
      return false;
    } while ((edd.a(this.b, localCastDevice.b)) && (edd.a(this.k, localCastDevice.k)) && (edd.a(this.e, localCastDevice.e)) && (edd.a(this.d, localCastDevice.d)) && (edd.a(this.f, localCastDevice.f)) && (this.g == localCastDevice.g) && (edd.a(this.h, localCastDevice.h)) && (this.i == localCastDevice.i) && (this.j == localCastDevice.j));
    return false;
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.hashCode();
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.d;
    arrayOfObject[1] = this.b;
    return String.format("\"%s\" (%s)", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = efj.m(paramParcel, 20293);
    int n = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(n);
    efj.a(paramParcel, 2, this.b, false);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, false);
    efj.a(paramParcel, 5, this.e, false);
    efj.a(paramParcel, 6, this.f, false);
    int i1 = this.g;
    efj.b(paramParcel, 7, 4);
    paramParcel.writeInt(i1);
    efj.c(paramParcel, 8, Collections.unmodifiableList(this.h), false);
    int i2 = this.i;
    efj.b(paramParcel, 9, 4);
    paramParcel.writeInt(i2);
    int i3 = this.j;
    efj.b(paramParcel, 10, 4);
    paramParcel.writeInt(i3);
    efj.n(paramParcel, m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.CastDevice
 * JD-Core Version:    0.7.0.1
 */