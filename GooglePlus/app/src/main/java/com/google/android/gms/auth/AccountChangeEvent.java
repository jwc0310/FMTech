package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ebj;
import efj;
import java.util.Arrays;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new ebj();
  final int a;
  final long b;
  final String c;
  final int d;
  final int e;
  final String f;
  
  public AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramLong;
    this.c = ((String)efj.a(paramString1));
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    AccountChangeEvent localAccountChangeEvent;
    do
    {
      return true;
      if (!(paramObject instanceof AccountChangeEvent)) {
        break;
      }
      localAccountChangeEvent = (AccountChangeEvent)paramObject;
    } while ((this.a == localAccountChangeEvent.a) && (this.b == localAccountChangeEvent.b) && (efj.a(this.c, localAccountChangeEvent.c)) && (this.d == localAccountChangeEvent.d) && (this.e == localAccountChangeEvent.e) && (efj.a(this.f, localAccountChangeEvent.f)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.b);
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = Integer.valueOf(this.d);
    arrayOfObject[4] = Integer.valueOf(this.e);
    arrayOfObject[5] = this.f;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    String str = "UNKNOWN";
    switch (this.d)
    {
    }
    for (;;)
    {
      return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
      str = "ADDED";
      continue;
      str = "REMOVED";
      continue;
      str = "RENAMED_TO";
      continue;
      str = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    long l = this.b;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeLong(l);
    efj.a(paramParcel, 3, this.c, false);
    int k = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeInt(k);
    int m = this.e;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeInt(m);
    efj.a(paramParcel, 6, this.f, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEvent
 * JD-Core Version:    0.7.0.1
 */