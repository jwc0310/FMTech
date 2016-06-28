package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fch;

public final class CopresenceApiOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator<CopresenceApiOptions> CREATOR = new fch();
  public static final CopresenceApiOptions a = new CopresenceApiOptions(true, null);
  final int b;
  public final boolean c;
  public final String d;
  
  public CopresenceApiOptions(int paramInt, boolean paramBoolean, String paramString)
  {
    this.b = paramInt;
    this.c = paramBoolean;
    this.d = paramString;
  }
  
  private CopresenceApiOptions(boolean paramBoolean, String paramString)
  {
    this(1, true, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.c);
    efj.a(paramParcel, 3, this.d, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.copresence.internal.CopresenceApiOptions
 * JD-Core Version:    0.7.0.1
 */