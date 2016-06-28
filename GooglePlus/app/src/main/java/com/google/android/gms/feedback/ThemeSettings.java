package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import evp;

public class ThemeSettings
  implements SafeParcelable
{
  public static final Parcelable.Creator<ThemeSettings> CREATOR = new evp();
  final int a;
  public int b;
  public int c;
  
  public ThemeSettings()
  {
    this(1, 0, 0);
  }
  
  public ThemeSettings(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
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
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.feedback.ThemeSettings
 * JD-Core Version:    0.7.0.1
 */