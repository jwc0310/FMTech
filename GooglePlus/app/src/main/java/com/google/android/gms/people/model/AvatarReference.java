package com.google.android.gms.people.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fnr;

public final class AvatarReference
  implements SafeParcelable
{
  public static final fnr CREATOR = new fnr();
  final int a;
  final int b;
  final String c;
  
  public AvatarReference(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt2 != 0) {}
    for (int i = 1; i == 0; i = 0) {
      throw new IllegalStateException();
    }
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return new ejg(this).a("source", Integer.valueOf(this.b)).a("location", this.c).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(k);
    efj.a(paramParcel, 2, this.c, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.people.model.AvatarReference
 * JD-Core Version:    0.7.0.1
 */