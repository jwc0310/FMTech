package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import efj;
import fde;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal
  implements SafeParcelable
{
  public static final fde CREATOR = new fde();
  public static final List<ClientIdentity> a = ;
  final int b;
  LocationRequest c;
  boolean d;
  boolean e;
  boolean f;
  List<ClientIdentity> g;
  final String h;
  boolean i;
  
  public LocationRequestInternal(int paramInt, LocationRequest paramLocationRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List<ClientIdentity> paramList, String paramString, boolean paramBoolean4)
  {
    this.b = paramInt;
    this.c = paramLocationRequest;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramBoolean3;
    this.g = paramList;
    this.h = paramString;
    this.i = paramBoolean4;
  }
  
  @Deprecated
  public static LocationRequestInternal a(LocationRequest paramLocationRequest)
  {
    return new LocationRequestInternal(1, paramLocationRequest, false, true, true, a, null, false);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationRequestInternal)) {}
    LocationRequestInternal localLocationRequestInternal;
    do
    {
      return false;
      localLocationRequestInternal = (LocationRequestInternal)paramObject;
    } while ((!efj.a(this.c, localLocationRequestInternal.c)) || (this.d != localLocationRequestInternal.d) || (this.e != localLocationRequestInternal.e) || (this.f != localLocationRequestInternal.f) || (this.i != localLocationRequestInternal.i) || (!efj.a(this.g, localLocationRequestInternal.g)));
    return true;
  }
  
  public int hashCode()
  {
    return this.c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c.toString());
    localStringBuilder.append(" requestNlpDebugInfo=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(" restorePendingIntentListeners=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(" triggerUpdate=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(" hideFromAppOps=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(" clients=");
    localStringBuilder.append(this.g);
    if (this.h != null)
    {
      localStringBuilder.append(" tag=");
      localStringBuilder.append(this.h);
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.c, paramInt, false);
    int k = this.b;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(k);
    efj.a(paramParcel, 2, this.d);
    efj.a(paramParcel, 3, this.e);
    efj.a(paramParcel, 4, this.f);
    efj.c(paramParcel, 5, this.g, false);
    efj.a(paramParcel, 6, this.h, false);
    efj.a(paramParcel, 7, this.i);
    efj.n(paramParcel, j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.internal.LocationRequestInternal
 * JD-Core Version:    0.7.0.1
 */