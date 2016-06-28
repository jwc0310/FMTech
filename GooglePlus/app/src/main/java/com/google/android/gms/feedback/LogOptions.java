package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import evo;

public class LogOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator<LogOptions> CREATOR = new evo();
  public final int a;
  public String b;
  public boolean c;
  
  public LogOptions(int paramInt, String paramString, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramBoolean;
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
    efj.a(paramParcel, 3, this.c);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.feedback.LogOptions
 * JD-Core Version:    0.7.0.1
 */