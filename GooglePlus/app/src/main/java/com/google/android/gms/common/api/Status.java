package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import efn;
import eha;
import ejg;
import java.util.Arrays;

public final class Status
  implements SafeParcelable, efn
{
  public static final Parcelable.Creator<Status> CREATOR = new eha();
  public static final Status a = new Status(0);
  public static final Status b = new Status(14);
  public static final Status c = new Status(8);
  public static final Status d = new Status(15);
  public static final Status e = new Status(16);
  final int f;
  public final int g;
  final String h;
  final PendingIntent i;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  public Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramString;
    this.i = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  public final Status as_()
  {
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    Status localStatus;
    do
    {
      return false;
      localStatus = (Status)paramObject;
    } while ((this.f != localStatus.f) || (this.g != localStatus.g) || (!efj.a(this.h, localStatus.h)) || (!efj.a(this.i, localStatus.i)));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.f);
    arrayOfObject[1] = Integer.valueOf(this.g);
    arrayOfObject[2] = this.h;
    arrayOfObject[3] = this.i;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    ejg localejg = new ejg(this);
    String str;
    if (this.h != null) {
      str = this.h;
    }
    for (;;)
    {
      return localejg.a("statusCode", str).a("resolution", this.i).toString();
      int j = this.g;
      switch (j)
      {
      default: 
        str = "unknown status code: " + j;
        break;
      case -1: 
        str = "SUCCESS_CACHE";
        break;
      case 0: 
        str = "SUCCESS";
        break;
      case 1: 
        str = "SERVICE_MISSING";
        break;
      case 2: 
        str = "SERVICE_VERSION_UPDATE_REQUIRED";
        break;
      case 3: 
        str = "SERVICE_DISABLED";
        break;
      case 4: 
        str = "SIGN_IN_REQUIRED";
        break;
      case 5: 
        str = "INVALID_ACCOUNT";
        break;
      case 6: 
        str = "RESOLUTION_REQUIRED";
        break;
      case 7: 
        str = "NETWORK_ERROR";
        break;
      case 8: 
        str = "INTERNAL_ERROR";
        break;
      case 9: 
        str = "SERVICE_INVALID";
        break;
      case 10: 
        str = "DEVELOPER_ERROR";
        break;
      case 11: 
        str = "LICENSE_CHECK_FAILED";
        break;
      case 13: 
        str = "ERROR_OPERATION_FAILED";
        break;
      case 14: 
        str = "INTERRUPTED";
        break;
      case 15: 
        str = "TIMEOUT";
        break;
      case 16: 
        str = "CANCELED";
        break;
      case 3000: 
        str = "AUTH_API_INVALID_CREDENTIALS";
        break;
      case 3001: 
        str = "AUTH_API_ACCESS_FORBIDDEN";
        break;
      case 3002: 
        str = "AUTH_API_CLIENT_ERROR";
        break;
      case 3003: 
        str = "AUTH_API_SERVER_ERROR";
        break;
      case 3004: 
        str = "AUTH_TOKEN_ERROR";
        break;
      case 3005: 
        str = "AUTH_URL_RESOLUTION";
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = efj.m(paramParcel, 20293);
    int k = this.g;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(k);
    int m = this.f;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(m);
    efj.a(paramParcel, 2, this.h, false);
    efj.a(paramParcel, 3, this.i, paramInt, false);
    efj.n(paramParcel, j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Status
 * JD-Core Version:    0.7.0.1
 */