package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fbw;
import fbx;
import java.util.Arrays;

public class DetectedActivity
  implements SafeParcelable
{
  public static final fbx CREATOR = new fbx();
  final int a;
  int b;
  public int c;
  
  static
  {
    new fbw();
  }
  
  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public final int a()
  {
    int i = this.b;
    if (i > 15) {
      i = 4;
    }
    return i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    DetectedActivity localDetectedActivity;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localDetectedActivity = (DetectedActivity)paramObject;
    } while ((this.b == localDetectedActivity.b) && (this.c == localDetectedActivity.c));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DetectedActivity [type=");
    int i = a();
    String str;
    switch (i)
    {
    case 6: 
    default: 
      str = Integer.toString(i);
    }
    for (;;)
    {
      return str + ", confidence=" + this.c + "]";
      str = "IN_VEHICLE";
      continue;
      str = "ON_BICYCLE";
      continue;
      str = "ON_FOOT";
      continue;
      str = "STILL";
      continue;
      str = "UNKNOWN";
      continue;
      str = "TILTING";
      continue;
      str = "WALKING";
      continue;
      str = "RUNNING";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(k);
    int m = this.c;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(m);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity
 * JD-Core Version:    0.7.0.1
 */