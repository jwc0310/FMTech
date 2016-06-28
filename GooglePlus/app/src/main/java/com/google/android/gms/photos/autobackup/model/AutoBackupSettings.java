package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fnz;

public class AutoBackupSettings
  implements SafeParcelable
{
  public static final Parcelable.Creator<AutoBackupSettings> CREATOR = new fnz();
  public final int a;
  String b;
  boolean c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  UserQuota k;
  
  public AutoBackupSettings()
  {
    this.a = 1;
  }
  
  public AutoBackupSettings(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, UserQuota paramUserQuota)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramBoolean4;
    this.g = paramBoolean5;
    this.h = paramBoolean6;
    this.i = paramBoolean7;
    this.j = paramBoolean8;
    this.k = paramUserQuota;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = efj.m(paramParcel, 20293);
    int n = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(n);
    efj.a(paramParcel, 2, this.b, false);
    efj.a(paramParcel, 3, this.c);
    efj.a(paramParcel, 4, this.d);
    efj.a(paramParcel, 5, this.e);
    efj.a(paramParcel, 6, this.f);
    efj.a(paramParcel, 7, this.g);
    efj.a(paramParcel, 8, this.h);
    efj.a(paramParcel, 9, this.i);
    efj.a(paramParcel, 10, this.j);
    efj.a(paramParcel, 11, this.k, paramInt, false);
    efj.n(paramParcel, m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.photos.autobackup.model.AutoBackupSettings
 * JD-Core Version:    0.7.0.1
 */