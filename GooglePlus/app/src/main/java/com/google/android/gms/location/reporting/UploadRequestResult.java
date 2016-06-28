package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fdx;
import java.util.Arrays;

public final class UploadRequestResult
  implements SafeParcelable
{
  public static final fdx CREATOR = new fdx();
  final int a;
  public final int b;
  public final long c;
  
  public UploadRequestResult(int paramInt1, int paramInt2, long paramLong)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof UploadRequestResult)) {}
    UploadRequestResult localUploadRequestResult;
    do
    {
      return false;
      localUploadRequestResult = (UploadRequestResult)paramObject;
    } while ((this.c != localUploadRequestResult.c) || (this.b != localUploadRequestResult.b));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Long.valueOf(this.c);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return "Result{mVersionCode=" + this.a + ", mResultCode=" + this.b + ", mRequestId=" + this.c + '}';
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.b;
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(k);
    long l = this.c;
    efj.b(paramParcel, 3, 8);
    paramParcel.writeLong(l);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.reporting.UploadRequestResult
 * JD-Core Version:    0.7.0.1
 */