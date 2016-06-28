package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import foa;

public class AutoBackupStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator<AutoBackupStatus> CREATOR = new foa();
  public final int a;
  int b;
  String c;
  String d;
  float e;
  int f;
  int g;
  int h;
  String[] i;
  String j;
  
  public AutoBackupStatus()
  {
    this.a = 1;
  }
  
  public AutoBackupStatus(int paramInt1, int paramInt2, String paramString1, String paramString2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, String[] paramArrayOfString, String paramString3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramFloat;
    this.f = paramInt3;
    this.g = paramInt4;
    this.h = paramInt5;
    this.i = paramArrayOfString;
    this.j = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return new ejg(this).a("accountName", this.c).a("autoBackupState", Integer.valueOf(this.b)).a("currentItem", this.d).a("currentItemProgress", Float.valueOf(this.e)).a("numCompleted", Integer.valueOf(this.f)).a("numPending", Integer.valueOf(this.g)).a("numFailed", Integer.valueOf(this.h)).a("failedItems", this.i).a("enabledAccountName", this.j).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = efj.m(paramParcel, 20293);
    int m = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(m);
    int n = this.b;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(n);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, false);
    float f1 = this.e;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeFloat(f1);
    int i1 = this.f;
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(i1);
    int i2 = this.g;
    efj.b(paramParcel, 7, 4);
    paramParcel.writeInt(i2);
    int i3 = this.h;
    efj.b(paramParcel, 8, 4);
    paramParcel.writeInt(i3);
    efj.a(paramParcel, 9, this.i, false);
    efj.a(paramParcel, 10, this.j, false);
    efj.n(paramParcel, k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.photos.autobackup.model.AutoBackupStatus
 * JD-Core Version:    0.7.0.1
 */