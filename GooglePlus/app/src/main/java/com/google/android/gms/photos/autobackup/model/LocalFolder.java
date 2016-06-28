package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fob;

public class LocalFolder
  implements SafeParcelable
{
  public static final Parcelable.Creator<LocalFolder> CREATOR = new fob();
  public final int a;
  String b;
  String c;
  boolean d;
  
  public LocalFolder(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return this.b + " (enabled=" + this.d + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, false);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.photos.autobackup.model.LocalFolder
 * JD-Core Version:    0.7.0.1
 */