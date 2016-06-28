package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import feh;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new feh();
  final int a;
  final List<LocationRequest> b;
  final boolean c;
  final boolean d;
  final boolean e;
  
  public LocationSettingsRequest(int paramInt, List<LocationRequest> paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramInt;
    this.b = paramList;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.c(paramParcel, 1, Collections.unmodifiableList(this.b), false);
    int j = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.c);
    efj.a(paramParcel, 3, this.d);
    efj.a(paramParcel, 4, this.e);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationSettingsRequest
 * JD-Core Version:    0.7.0.1
 */