package com.google.android.gms.people.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fmo;

public class ParcelableLoadImageOptions
  implements SafeParcelable
{
  public static final fmo CREATOR = new fmo();
  final int a;
  final int b;
  final int c;
  final boolean d;
  
  public ParcelableLoadImageOptions(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return new ejg(this).a("imageSize", Integer.valueOf(this.b)).a("avatarOptions", Integer.valueOf(this.c)).a("useLargePictureForCp2Images", Boolean.valueOf(this.d)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(k);
    int m = this.c;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(m);
    efj.a(paramParcel, 3, this.d);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.people.internal.ParcelableLoadImageOptions
 * JD-Core Version:    0.7.0.1
 */