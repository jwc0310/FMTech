package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fdv;
import fdw;
import java.util.Arrays;

public class UploadRequest
  implements SafeParcelable
{
  public static final fdw CREATOR = new fdw();
  final int a;
  public final Account b;
  final String c;
  final long d;
  final long e;
  final long f;
  final String g;
  
  public UploadRequest(int paramInt, Account paramAccount, String paramString1, long paramLong1, long paramLong2, long paramLong3, String paramString2)
  {
    this.a = paramInt;
    this.b = paramAccount;
    this.c = paramString1;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramLong3;
    this.g = paramString2;
  }
  
  public UploadRequest(fdv paramfdv)
  {
    this.a = 1;
    this.b = paramfdv.a;
    this.c = paramfdv.b;
    this.d = paramfdv.c;
    this.e = paramfdv.d;
    this.f = paramfdv.e;
    this.g = null;
  }
  
  public static fdv a(Account paramAccount, String paramString, long paramLong)
  {
    return new fdv(paramAccount, paramString, paramLong);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    UploadRequest localUploadRequest;
    do
    {
      return true;
      if (!(paramObject instanceof UploadRequest)) {
        return false;
      }
      localUploadRequest = (UploadRequest)paramObject;
    } while ((this.b.equals(localUploadRequest.b)) && (this.c.equals(localUploadRequest.c)) && (efj.a(Long.valueOf(this.d), Long.valueOf(localUploadRequest.d))) && (this.e == localUploadRequest.e) && (this.f == localUploadRequest.f) && (efj.a(this.g, localUploadRequest.g)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = Long.valueOf(this.d);
    arrayOfObject[3] = Long.valueOf(this.e);
    arrayOfObject[4] = Long.valueOf(this.f);
    arrayOfObject[5] = this.g;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("UploadRequest{mVersionCode=").append(this.a).append(", mAccount=");
    Account localAccount = this.b;
    String str;
    if (localAccount == null) {
      str = "null";
    }
    for (;;)
    {
      return str + ", mReason='" + this.c + '\'' + ", mDurationMillis=" + this.d + ", mMovingLatencyMillis=" + this.e + ", mStationaryLatencyMillis=" + this.f + ", mAppSpecificKey='" + this.g + '\'' + '}';
      if (Log.isLoggable("GCoreUlr", 2)) {
        str = localAccount.name;
      } else {
        str = "account#" + localAccount.name.hashCode() % 20 + "#";
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.a(paramParcel, 3, this.c, false);
    long l1 = this.d;
    efj.b(paramParcel, 4, 8);
    paramParcel.writeLong(l1);
    long l2 = this.e;
    efj.b(paramParcel, 5, 8);
    paramParcel.writeLong(l2);
    long l3 = this.f;
    efj.b(paramParcel, 6, 8);
    paramParcel.writeLong(l3);
    efj.a(paramParcel, 7, this.g, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.reporting.UploadRequest
 * JD-Core Version:    0.7.0.1
 */