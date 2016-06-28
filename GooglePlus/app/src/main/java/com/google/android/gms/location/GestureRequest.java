package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fdz;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class GestureRequest
  implements SafeParcelable
{
  public static final fdz CREATOR = new fdz();
  final int a;
  final List<Integer> b;
  
  static
  {
    Integer[] arrayOfInteger1 = new Integer[19];
    arrayOfInteger1[0] = Integer.valueOf(1);
    arrayOfInteger1[1] = Integer.valueOf(2);
    arrayOfInteger1[2] = Integer.valueOf(3);
    arrayOfInteger1[3] = Integer.valueOf(4);
    arrayOfInteger1[4] = Integer.valueOf(5);
    arrayOfInteger1[5] = Integer.valueOf(6);
    arrayOfInteger1[6] = Integer.valueOf(7);
    arrayOfInteger1[7] = Integer.valueOf(8);
    arrayOfInteger1[8] = Integer.valueOf(9);
    arrayOfInteger1[9] = Integer.valueOf(10);
    arrayOfInteger1[10] = Integer.valueOf(11);
    arrayOfInteger1[11] = Integer.valueOf(12);
    arrayOfInteger1[12] = Integer.valueOf(13);
    arrayOfInteger1[13] = Integer.valueOf(14);
    arrayOfInteger1[14] = Integer.valueOf(15);
    arrayOfInteger1[15] = Integer.valueOf(16);
    arrayOfInteger1[16] = Integer.valueOf(17);
    arrayOfInteger1[17] = Integer.valueOf(18);
    arrayOfInteger1[18] = Integer.valueOf(19);
    Collections.unmodifiableList(Arrays.asList(arrayOfInteger1));
    Integer[] arrayOfInteger2 = new Integer[1];
    arrayOfInteger2[0] = Integer.valueOf(1);
    Collections.unmodifiableList(Arrays.asList(arrayOfInteger2));
    Integer[] arrayOfInteger3 = new Integer[10];
    arrayOfInteger3[0] = Integer.valueOf(2);
    arrayOfInteger3[1] = Integer.valueOf(4);
    arrayOfInteger3[2] = Integer.valueOf(6);
    arrayOfInteger3[3] = Integer.valueOf(8);
    arrayOfInteger3[4] = Integer.valueOf(10);
    arrayOfInteger3[5] = Integer.valueOf(12);
    arrayOfInteger3[6] = Integer.valueOf(14);
    arrayOfInteger3[7] = Integer.valueOf(16);
    arrayOfInteger3[8] = Integer.valueOf(18);
    arrayOfInteger3[9] = Integer.valueOf(19);
    Collections.unmodifiableList(Arrays.asList(arrayOfInteger3));
    Integer[] arrayOfInteger4 = new Integer[8];
    arrayOfInteger4[0] = Integer.valueOf(3);
    arrayOfInteger4[1] = Integer.valueOf(5);
    arrayOfInteger4[2] = Integer.valueOf(7);
    arrayOfInteger4[3] = Integer.valueOf(9);
    arrayOfInteger4[4] = Integer.valueOf(11);
    arrayOfInteger4[5] = Integer.valueOf(13);
    arrayOfInteger4[6] = Integer.valueOf(15);
    arrayOfInteger4[7] = Integer.valueOf(17);
    Collections.unmodifiableList(Arrays.asList(arrayOfInteger4));
  }
  
  public GestureRequest(int paramInt, List<Integer> paramList)
  {
    this.a = paramInt;
    this.b = paramList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.b, false);
    int j = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.GestureRequest
 * JD-Core Version:    0.7.0.1
 */