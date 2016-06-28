package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import evl;

public class ErrorReport
  implements SafeParcelable
{
  public static final Parcelable.Creator<ErrorReport> CREATOR = new evl();
  public int A;
  public String B;
  public String C;
  public String D;
  public Bundle E;
  public boolean F;
  public int G;
  public int H;
  public boolean I;
  public String J;
  public String K;
  public int L;
  public String M;
  public String N;
  public String O;
  public String P;
  public String Q;
  @Deprecated
  public String R;
  public String S;
  public BitmapTeleporter T;
  public String U;
  public FileTeleporter[] V;
  public String[] W;
  public boolean X;
  public String Y;
  public ThemeSettings Z;
  public final int a;
  public LogOptions aa;
  public String ab;
  public boolean ac;
  public Bundle ad;
  public ApplicationErrorReport b = new ApplicationErrorReport();
  public String c;
  public int d;
  public String e;
  public String f;
  public String g;
  public String h;
  public String i;
  public String j;
  public String k;
  public int l;
  public String m;
  public String n;
  public String o;
  public String p;
  public String q;
  public String[] r;
  public String[] s;
  public String[] t;
  public String u;
  public String v;
  public byte[] w;
  public int x;
  public int y;
  public int z;
  
  public ErrorReport()
  {
    this.a = 8;
  }
  
  public ErrorReport(int paramInt1, ApplicationErrorReport paramApplicationErrorReport, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt3, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString14, String paramString15, byte[] paramArrayOfByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7, String paramString16, String paramString17, String paramString18, Bundle paramBundle1, boolean paramBoolean1, int paramInt8, int paramInt9, boolean paramBoolean2, String paramString19, String paramString20, int paramInt10, String paramString21, String paramString22, String paramString23, String paramString24, String paramString25, String paramString26, String paramString27, BitmapTeleporter paramBitmapTeleporter, String paramString28, FileTeleporter[] paramArrayOfFileTeleporter, String[] paramArrayOfString4, boolean paramBoolean3, String paramString29, ThemeSettings paramThemeSettings, LogOptions paramLogOptions, String paramString30, boolean paramBoolean4, Bundle paramBundle2)
  {
    this.a = paramInt1;
    this.b = paramApplicationErrorReport;
    this.c = paramString1;
    this.d = paramInt2;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramString7;
    this.k = paramString8;
    this.l = paramInt3;
    this.m = paramString9;
    this.n = paramString10;
    this.o = paramString11;
    this.p = paramString12;
    this.q = paramString13;
    this.r = paramArrayOfString1;
    this.s = paramArrayOfString2;
    this.t = paramArrayOfString3;
    this.u = paramString14;
    this.v = paramString15;
    this.w = paramArrayOfByte;
    this.x = paramInt4;
    this.y = paramInt5;
    this.z = paramInt6;
    this.A = paramInt7;
    this.B = paramString16;
    this.C = paramString17;
    this.D = paramString18;
    this.E = paramBundle1;
    this.F = paramBoolean1;
    this.G = paramInt8;
    this.H = paramInt9;
    this.I = paramBoolean2;
    this.J = paramString19;
    this.K = paramString20;
    this.L = paramInt10;
    this.M = paramString21;
    this.N = paramString22;
    this.O = paramString23;
    this.P = paramString24;
    this.Q = paramString25;
    this.R = paramString26;
    this.S = paramString27;
    this.T = paramBitmapTeleporter;
    this.U = paramString28;
    this.V = paramArrayOfFileTeleporter;
    this.W = paramArrayOfString4;
    this.X = paramBoolean3;
    this.Y = paramString29;
    this.Z = paramThemeSettings;
    this.aa = paramLogOptions;
    this.ab = paramString30;
    this.ac = paramBoolean4;
    this.ad = paramBundle2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = efj.m(paramParcel, 20293);
    int i2 = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(i2);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.a(paramParcel, 3, this.c, false);
    int i3 = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeInt(i3);
    efj.a(paramParcel, 5, this.e, false);
    efj.a(paramParcel, 6, this.f, false);
    efj.a(paramParcel, 7, this.g, false);
    efj.a(paramParcel, 8, this.h, false);
    efj.a(paramParcel, 9, this.i, false);
    efj.a(paramParcel, 10, this.j, false);
    efj.a(paramParcel, 11, this.k, false);
    int i4 = this.l;
    efj.b(paramParcel, 12, 4);
    paramParcel.writeInt(i4);
    efj.a(paramParcel, 13, this.m, false);
    efj.a(paramParcel, 14, this.n, false);
    efj.a(paramParcel, 15, this.o, false);
    efj.a(paramParcel, 17, this.q, false);
    efj.a(paramParcel, 16, this.p, false);
    efj.a(paramParcel, 19, this.s, false);
    efj.a(paramParcel, 18, this.r, false);
    efj.a(paramParcel, 21, this.u, false);
    efj.a(paramParcel, 20, this.t, false);
    efj.a(paramParcel, 23, this.w, false);
    efj.a(paramParcel, 22, this.v, false);
    int i5 = this.y;
    efj.b(paramParcel, 25, 4);
    paramParcel.writeInt(i5);
    int i6 = this.x;
    efj.b(paramParcel, 24, 4);
    paramParcel.writeInt(i6);
    int i7 = this.A;
    efj.b(paramParcel, 27, 4);
    paramParcel.writeInt(i7);
    int i8 = this.z;
    efj.b(paramParcel, 26, 4);
    paramParcel.writeInt(i8);
    efj.a(paramParcel, 29, this.C, false);
    efj.a(paramParcel, 28, this.B, false);
    efj.a(paramParcel, 31, this.E, false);
    efj.a(paramParcel, 30, this.D, false);
    int i9 = this.H;
    efj.b(paramParcel, 34, 4);
    paramParcel.writeInt(i9);
    efj.a(paramParcel, 35, this.I);
    efj.a(paramParcel, 32, this.F);
    int i10 = this.G;
    efj.b(paramParcel, 33, 4);
    paramParcel.writeInt(i10);
    int i11 = this.L;
    efj.b(paramParcel, 38, 4);
    paramParcel.writeInt(i11);
    efj.a(paramParcel, 39, this.M, false);
    efj.a(paramParcel, 36, this.J, false);
    efj.a(paramParcel, 37, this.K, false);
    efj.a(paramParcel, 42, this.P, false);
    efj.a(paramParcel, 43, this.Q, false);
    efj.a(paramParcel, 40, this.N, false);
    efj.a(paramParcel, 41, this.O, false);
    efj.a(paramParcel, 46, this.T, paramInt, false);
    efj.a(paramParcel, 47, this.U, false);
    efj.a(paramParcel, 44, this.R, false);
    efj.a(paramParcel, 45, this.S, false);
    efj.a(paramParcel, 51, this.Y, false);
    efj.a(paramParcel, 50, this.X);
    efj.a(paramParcel, 49, this.W, false);
    efj.a(paramParcel, 48, this.V, paramInt, false);
    efj.a(paramParcel, 55, this.ac);
    efj.a(paramParcel, 54, this.ab, false);
    efj.a(paramParcel, 53, this.aa, paramInt, false);
    efj.a(paramParcel, 52, this.Z, paramInt, false);
    efj.a(paramParcel, 56, this.ad, false);
    efj.n(paramParcel, i1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.feedback.ErrorReport
 * JD-Core Version:    0.7.0.1
 */