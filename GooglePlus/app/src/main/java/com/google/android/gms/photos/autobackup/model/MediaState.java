package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fny;
import foc;
import java.util.HashMap;
import java.util.Map;

public class MediaState
  implements SafeParcelable
{
  public static final Parcelable.Creator<MediaState> CREATOR = new foc();
  public final int a;
  String[] b;
  int[] c;
  long[] d;
  private Map<String, fny> e;
  
  public MediaState()
  {
    this.a = 1;
  }
  
  public MediaState(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt, long[] paramArrayOfLong)
  {
    this.a = paramInt;
    this.b = paramArrayOfString;
    this.c = paramArrayOfInt;
    this.d = paramArrayOfLong;
    this.e = new HashMap();
    for (int i = 0; i < paramArrayOfString.length; i++) {
      this.e.put(paramArrayOfString[i], new fny(this, paramArrayOfInt[i], paramArrayOfLong[i]));
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, false);
    efj.a(paramParcel, 3, this.c, false);
    long[] arrayOfLong = this.d;
    if (arrayOfLong != null)
    {
      int k = efj.m(paramParcel, 4);
      paramParcel.writeLongArray(arrayOfLong);
      efj.n(paramParcel, k);
    }
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.photos.autobackup.model.MediaState
 * JD-Core Version:    0.7.0.1
 */