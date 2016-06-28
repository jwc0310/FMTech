package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import exr;

public final class AccountData
  implements SafeParcelable
{
  public static final Parcelable.Creator<AccountData> CREATOR = new exr();
  final int a;
  public final String b;
  public final String c;
  
  public AccountData(int paramInt, String paramString1, String paramString2)
  {
    efj.a(paramString1, "Account name must not be empty.");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  private AccountData(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2);
  }
  
  public static AccountData a(String paramString)
  {
    efj.a(paramString, "Account name must not be empty.");
    return new AccountData(paramString, null);
  }
  
  public static AccountData a(String paramString1, String paramString2)
  {
    efj.a(paramString1, "Account name must not be empty.");
    efj.a(paramString2, "+Page ID must not be empty.");
    return new AccountData(paramString1, paramString2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.b, false);
    int j = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.c, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.accounts.api.AccountData
 * JD-Core Version:    0.7.0.1
 */