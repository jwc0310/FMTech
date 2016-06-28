package com.google.android.gms.location.reporting;

import aaw;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fdu;
import java.util.Arrays;

public class ReportingState
  implements SafeParcelable
{
  public static final fdu CREATOR = new fdu();
  final int a;
  public final int b;
  public final int c;
  public final boolean d;
  final boolean e;
  final int f;
  final int g;
  final Integer h;
  
  public ReportingState(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, int paramInt4, int paramInt5, Integer paramInteger)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramInt4;
    this.g = paramInt5;
    this.h = paramInteger;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ReportingState)) {}
    ReportingState localReportingState;
    do
    {
      return false;
      localReportingState = (ReportingState)paramObject;
    } while ((this.b != localReportingState.b) || (this.c != localReportingState.c) || (this.d != localReportingState.d) || (this.e != localReportingState.e) || (this.f != localReportingState.f) || (this.g != localReportingState.g) || (!efj.a(this.h, localReportingState.h)));
    return true;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    arrayOfObject[2] = Boolean.valueOf(this.d);
    arrayOfObject[3] = Boolean.valueOf(this.e);
    arrayOfObject[4] = Integer.valueOf(this.f);
    arrayOfObject[5] = Integer.valueOf(this.g);
    arrayOfObject[6] = this.h;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Integer localInteger;
    String str;
    if (this.h != null)
    {
      localInteger = this.h;
      if (localInteger == null) {
        str = "(null)";
      }
    }
    for (;;)
    {
      return "ReportingState{mReportingEnabled=" + this.b + ", mHistoryEnabled=" + this.c + ", mAllowed=" + this.d + ", mActive=" + this.e + ", mExpectedOptInResult=" + this.f + ", mExpectedOptInResultAssumingLocationEnabled=" + this.g + ", mVersionCode=" + this.a + ", mDeviceTag=" + str + '}';
      if (Log.isLoggable("GCoreUlr", 2))
      {
        str = String.valueOf(localInteger);
      }
      else
      {
        str = "tag#" + localInteger.intValue() % 20;
        continue;
        str = "(hidden-from-unauthorized-caller)";
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = aaw.a(this.b);
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(k);
    int m = aaw.a(this.c);
    efj.b(paramParcel, 3, 4);
    paramParcel.writeInt(m);
    efj.a(paramParcel, 4, this.d);
    efj.a(paramParcel, 5, this.e);
    int n = efj.c(this.f);
    efj.b(paramParcel, 7, 4);
    paramParcel.writeInt(n);
    efj.a(paramParcel, 8, this.h, false);
    int i1 = efj.c(this.g);
    efj.b(paramParcel, 9, 4);
    paramParcel.writeInt(i1);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.reporting.ReportingState
 * JD-Core Version:    0.7.0.1
 */