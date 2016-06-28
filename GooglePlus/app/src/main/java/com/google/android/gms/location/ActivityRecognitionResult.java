package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fbv;
import java.util.Arrays;
import java.util.List;

public class ActivityRecognitionResult
  implements SafeParcelable
{
  public static final fbv CREATOR = new fbv();
  final int a;
  List<DetectedActivity> b;
  long c;
  long d;
  int e;
  
  public ActivityRecognitionResult(int paramInt1, List<DetectedActivity> paramList, long paramLong1, long paramLong2, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ActivityRecognitionResult localActivityRecognitionResult;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localActivityRecognitionResult = (ActivityRecognitionResult)paramObject;
    } while ((this.c == localActivityRecognitionResult.c) && (this.d == localActivityRecognitionResult.d) && (this.e == localActivityRecognitionResult.e) && (efj.a(this.b, localActivityRecognitionResult.b)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Long.valueOf(this.c);
    arrayOfObject[1] = Long.valueOf(this.d);
    arrayOfObject[2] = Integer.valueOf(this.e);
    arrayOfObject[3] = this.b;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    return "ActivityRecognitionResult [probableActivities=" + this.b + ", timeMillis=" + this.c + ", elapsedRealtimeMillis=" + this.d + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.c(paramParcel, 1, this.b, false);
    int j = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    long l1 = this.c;
    efj.b(paramParcel, 2, 8);
    paramParcel.writeLong(l1);
    long l2 = this.d;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeLong(l2);
    int k = this.e;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeInt(k);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionResult
 * JD-Core Version:    0.7.0.1
 */