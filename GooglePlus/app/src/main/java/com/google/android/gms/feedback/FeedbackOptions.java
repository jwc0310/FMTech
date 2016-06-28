package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import evm;
import java.util.ArrayList;

public class FeedbackOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator<FeedbackOptions> CREATOR = new evm();
  public final int a;
  public String b;
  public Bundle c;
  public String d;
  public ApplicationErrorReport e;
  public String f;
  public BitmapTeleporter g;
  public String h;
  public ArrayList<FileTeleporter> i;
  public boolean j;
  public ThemeSettings k;
  public LogOptions l;
  
  public FeedbackOptions()
  {
    this(3, null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null);
  }
  
  public FeedbackOptions(int paramInt, String paramString1, Bundle paramBundle, String paramString2, ApplicationErrorReport paramApplicationErrorReport, String paramString3, BitmapTeleporter paramBitmapTeleporter, String paramString4, ArrayList<FileTeleporter> paramArrayList, boolean paramBoolean, ThemeSettings paramThemeSettings, LogOptions paramLogOptions)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramBundle;
    this.d = paramString2;
    this.e = paramApplicationErrorReport;
    this.f = paramString3;
    this.g = paramBitmapTeleporter;
    this.h = paramString4;
    this.i = paramArrayList;
    this.j = paramBoolean;
    this.k = paramThemeSettings;
    this.l = paramLogOptions;
  }
  
  public final ApplicationErrorReport.CrashInfo a()
  {
    if (this.e == null) {
      return null;
    }
    return this.e.crashInfo;
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
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 5, this.d, false);
    efj.a(paramParcel, 6, this.e, paramInt, false);
    efj.a(paramParcel, 7, this.f, false);
    efj.a(paramParcel, 8, this.g, paramInt, false);
    efj.a(paramParcel, 9, this.h, false);
    efj.c(paramParcel, 10, this.i, false);
    efj.a(paramParcel, 11, this.j);
    efj.a(paramParcel, 12, this.k, paramInt, false);
    efj.a(paramParcel, 13, this.l, paramInt, false);
    efj.n(paramParcel, m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.feedback.FeedbackOptions
 * JD-Core Version:    0.7.0.1
 */