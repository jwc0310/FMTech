package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ect;
import edd;
import efj;
import java.util.Arrays;

public class ApplicationStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator<ApplicationStatus> CREATOR = new ect();
  final int a;
  public String b;
  
  public ApplicationStatus()
  {
    this(1, null);
  }
  
  public ApplicationStatus(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ApplicationStatus)) {
      return false;
    }
    ApplicationStatus localApplicationStatus = (ApplicationStatus)paramObject;
    return edd.a(this.b, localApplicationStatus.b);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.internal.ApplicationStatus
 * JD-Core Version:    0.7.0.1
 */