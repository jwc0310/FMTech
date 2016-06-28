package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejh;

public class ResolveAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new ejh();
  final int a;
  final Account b;
  final int c;
  
  public ResolveAccountRequest(int paramInt1, Account paramAccount, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramAccount;
    this.c = paramInt2;
  }
  
  public ResolveAccountRequest(Account paramAccount, int paramInt)
  {
    this(1, paramAccount, paramInt);
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
    efj.a(paramParcel, 2, this.b, paramInt, false);
    int k = this.c;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeInt(k);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ResolveAccountRequest
 * JD-Core Version:    0.7.0.1
 */