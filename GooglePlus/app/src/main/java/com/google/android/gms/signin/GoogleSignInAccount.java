package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import foz;

public class GoogleSignInAccount
  implements SafeParcelable
{
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new foz();
  final int a;
  String b;
  String c;
  String d;
  String e;
  Uri f;
  
  public GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri)
  {
    this.a = paramInt;
    this.b = efj.d(paramString1);
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramUri;
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
    efj.a(paramParcel, 2, this.b, false);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, false);
    efj.a(paramParcel, 5, this.e, false);
    efj.a(paramParcel, 6, this.f, paramInt, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.GoogleSignInAccount
 * JD-Core Version:    0.7.0.1
 */