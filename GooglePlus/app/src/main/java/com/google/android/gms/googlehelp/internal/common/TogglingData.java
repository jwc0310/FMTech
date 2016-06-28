package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ewj;

public class TogglingData
  implements SafeParcelable
{
  public static final Parcelable.Creator<TogglingData> CREATOR = new ewj();
  final int a;
  String b;
  String c;
  public String d;
  
  private TogglingData()
  {
    this.a = 1;
  }
  
  public TogglingData(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
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
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.googlehelp.internal.common.TogglingData
 * JD-Core Version:    0.7.0.1
 */