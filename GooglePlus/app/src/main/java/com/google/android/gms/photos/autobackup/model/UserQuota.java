package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fof;

public class UserQuota
  implements SafeParcelable
{
  public static final Parcelable.Creator<UserQuota> CREATOR = new fof();
  public final int a;
  long b;
  long c;
  boolean d;
  boolean e;
  
  public UserQuota()
  {
    this.a = 1;
  }
  
  public UserQuota(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
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
    long l1 = this.b;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeLong(l1);
    long l2 = this.c;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeLong(l2);
    efj.a(paramParcel, 4, this.d);
    efj.a(paramParcel, 5, this.e);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.photos.autobackup.model.UserQuota
 * JD-Core Version:    0.7.0.1
 */