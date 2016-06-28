package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ehs;
import ehw;

public class ValidateAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ValidateAccountRequest> CREATOR = new ehw();
  final int a;
  final int b;
  final IBinder c;
  final Scope[] d;
  final Bundle e;
  final String f;
  
  public ValidateAccountRequest(int paramInt1, int paramInt2, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramIBinder;
    this.d = paramArrayOfScope;
    this.e = paramBundle;
    this.f = paramString;
  }
  
  public ValidateAccountRequest(ehs paramehs, Scope[] paramArrayOfScope, String paramString, Bundle paramBundle) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.b;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(k);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, paramInt, false);
    efj.a(paramParcel, 5, this.e, false);
    efj.a(paramParcel, 6, this.f, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ValidateAccountRequest
 * JD-Core Version:    0.7.0.1
 */