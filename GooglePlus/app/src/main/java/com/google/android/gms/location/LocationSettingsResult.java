package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import efn;
import fei;

public final class LocationSettingsResult
  implements SafeParcelable, efn
{
  public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new fei();
  final int a;
  final LocationSettingsStates b;
  private final Status c;
  
  public LocationSettingsResult(int paramInt, Status paramStatus, LocationSettingsStates paramLocationSettingsStates)
  {
    this.a = paramInt;
    this.c = paramStatus;
    this.b = paramLocationSettingsStates;
  }
  
  public final Status as_()
  {
    return this.c;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.c, paramInt, false);
    int j = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationSettingsResult
 * JD-Core Version:    0.7.0.1
 */