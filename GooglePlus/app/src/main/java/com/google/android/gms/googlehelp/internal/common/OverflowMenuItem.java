package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ewi;

public final class OverflowMenuItem
  implements SafeParcelable
{
  public static final Parcelable.Creator<OverflowMenuItem> CREATOR = new ewi();
  final int a;
  final int b;
  final String c;
  final Intent d;
  
  public OverflowMenuItem(int paramInt1, int paramInt2, String paramString, Intent paramIntent)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
    this.d = paramIntent;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
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
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.googlehelp.internal.common.OverflowMenuItem
 * JD-Core Version:    0.7.0.1
 */