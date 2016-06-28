package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eeo;
import efj;
import eht;
import ehv;
import eia;

public class GetServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetServiceRequest> CREATOR = new eia();
  final int a;
  final int b;
  int c;
  public String d;
  public IBinder e;
  public Scope[] f;
  public Bundle g;
  public Account h;
  
  public GetServiceRequest(int paramInt)
  {
    this.a = 2;
    this.c = eeo.a;
    this.b = paramInt;
  }
  
  public GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
    Account localAccount;
    if (paramInt1 < 2)
    {
      localAccount = null;
      if (paramIBinder != null) {
        localAccount = ehv.a(eht.a(paramIBinder));
      }
    }
    for (this.h = localAccount;; this.h = paramAccount)
    {
      this.f = paramArrayOfScope;
      this.g = paramBundle;
      return;
      this.e = paramIBinder;
    }
  }
  
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
    int m = this.c;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeInt(m);
    efj.a(paramParcel, 4, this.d, false);
    efj.a(paramParcel, 5, this.e, false);
    efj.a(paramParcel, 6, this.f, paramInt, false);
    efj.a(paramParcel, 7, this.g, false);
    efj.a(paramParcel, 8, this.h, paramInt, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.GetServiceRequest
 * JD-Core Version:    0.7.0.1
 */