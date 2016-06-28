package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import efj;
import ewl;
import java.util.ArrayList;
import java.util.List;

public final class GoogleHelp
  implements SafeParcelable
{
  public static final Parcelable.Creator<GoogleHelp> CREATOR = new ewl();
  final int a;
  String b;
  public Account c;
  Bundle d;
  String e;
  int f;
  int g;
  boolean h;
  boolean i;
  List<String> j;
  @Deprecated
  Bundle k;
  @Deprecated
  Bitmap l;
  @Deprecated
  byte[] m;
  @Deprecated
  int n;
  @Deprecated
  int o;
  String p;
  public Uri q;
  List<OverflowMenuItem> r;
  @Deprecated
  int s;
  public ThemeSettings t;
  List<OfflineSuggestion> u;
  boolean v;
  public ErrorReport w = new ErrorReport();
  public TogglingData x;
  int y;
  PendingIntent z;
  
  public GoogleHelp(int paramInt1, String paramString1, Account paramAccount, Bundle paramBundle1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList, Bundle paramBundle2, Bitmap paramBitmap, byte[] paramArrayOfByte, int paramInt4, int paramInt5, String paramString3, Uri paramUri, List<OverflowMenuItem> paramList1, int paramInt6, ThemeSettings paramThemeSettings, List<OfflineSuggestion> paramList2, boolean paramBoolean3, ErrorReport paramErrorReport, TogglingData paramTogglingData, int paramInt7, PendingIntent paramPendingIntent)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramAccount;
    this.d = paramBundle1;
    this.e = paramString2;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.j = paramList;
    this.z = paramPendingIntent;
    this.k = paramBundle2;
    this.l = paramBitmap;
    this.m = paramArrayOfByte;
    this.n = paramInt4;
    this.o = paramInt5;
    this.p = paramString3;
    this.q = paramUri;
    this.r = paramList1;
    GoogleHelp localGoogleHelp;
    if (this.a < 4)
    {
      paramThemeSettings = new ThemeSettings();
      paramThemeSettings.b = paramInt6;
      localGoogleHelp = this;
    }
    for (;;)
    {
      localGoogleHelp.t = paramThemeSettings;
      this.u = paramList2;
      this.v = paramBoolean3;
      this.w = paramErrorReport;
      if (this.w != null) {
        this.w.Y = "GoogleHelp";
      }
      this.x = paramTogglingData;
      this.y = paramInt7;
      return;
      if (paramThemeSettings == null)
      {
        paramThemeSettings = new ThemeSettings();
        localGoogleHelp = this;
      }
      else
      {
        localGoogleHelp = this;
      }
    }
  }
  
  public GoogleHelp(String paramString)
  {
    this(7, paramString, null, null, null, 0, 0, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 0, null, new ArrayList(), false, new ErrorReport(), null, 0, null);
  }
  
  public static Bitmap a(Activity paramActivity)
  {
    try
    {
      View localView = paramActivity.getWindow().getDecorView().getRootView();
      Bitmap localBitmap = Bitmap.createBitmap(localView.getWidth(), localView.getHeight(), Bitmap.Config.ARGB_8888);
      localView.draw(new Canvas(localBitmap));
      return localBitmap;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = efj.m(paramParcel, 20293);
    int i2 = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(i2);
    efj.a(paramParcel, 2, this.b, false);
    efj.a(paramParcel, 3, this.c, paramInt, false);
    efj.a(paramParcel, 4, this.d, false);
    efj.a(paramParcel, 5, this.h);
    efj.a(paramParcel, 6, this.i);
    efj.b(paramParcel, 7, this.j, false);
    efj.a(paramParcel, 10, this.k, false);
    efj.a(paramParcel, 11, this.l, paramInt, false);
    efj.a(paramParcel, 14, this.p, false);
    efj.a(paramParcel, 15, this.q, paramInt, false);
    int i3 = this.s;
    efj.b(paramParcel, 17, 4);
    paramParcel.writeInt(i3);
    efj.c(paramParcel, 16, this.r, false);
    efj.a(paramParcel, 19, this.m, false);
    efj.c(paramParcel, 18, this.u, false);
    int i4 = this.o;
    efj.b(paramParcel, 21, 4);
    paramParcel.writeInt(i4);
    int i5 = this.n;
    efj.b(paramParcel, 20, 4);
    paramParcel.writeInt(i5);
    efj.a(paramParcel, 23, this.w, paramInt, false);
    efj.a(paramParcel, 22, this.v);
    efj.a(paramParcel, 25, this.t, paramInt, false);
    int i6 = this.f;
    efj.b(paramParcel, 29, 4);
    paramParcel.writeInt(i6);
    efj.a(paramParcel, 28, this.e, false);
    efj.a(paramParcel, 31, this.x, paramInt, false);
    int i7 = this.g;
    efj.b(paramParcel, 30, 4);
    paramParcel.writeInt(i7);
    int i8 = this.y;
    efj.b(paramParcel, 32, 4);
    paramParcel.writeInt(i8);
    efj.a(paramParcel, 33, this.z, paramInt, false);
    efj.n(paramParcel, i1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.googlehelp.GoogleHelp
 * JD-Core Version:    0.7.0.1
 */