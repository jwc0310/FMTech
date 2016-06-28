package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fmb;

public final class ParcelableGetOptions
  implements SafeParcelable
{
  public static final fmb CREATOR = new fmb();
  final int a;
  final boolean b;
  final boolean c;
  final String d;
  final boolean e;
  final Bundle f;
  
  public ParcelableGetOptions(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, Bundle paramBundle)
  {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramString;
    this.e = paramBoolean3;
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    this.f = paramBundle;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return new ejg(this).a("useOfflineDatabase", Boolean.valueOf(this.b)).a("useWebData", Boolean.valueOf(this.c)).a("endpoint", this.d).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.b);
    int j = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.c);
    efj.a(paramParcel, 3, this.d, false);
    efj.a(paramParcel, 4, this.e);
    efj.a(paramParcel, 5, this.f, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.people.identity.internal.ParcelableGetOptions
 * JD-Core Version:    0.7.0.1
 */