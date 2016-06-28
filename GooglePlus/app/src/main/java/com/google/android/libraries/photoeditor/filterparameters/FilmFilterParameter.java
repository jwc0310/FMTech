package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;
import efj;
import gem;
import java.util.Arrays;
import java.util.List;

@UsedByReflection
public class FilmFilterParameter
  extends NativeFilterParameter
{
  public static final List<Integer> a;
  private static final int[] g = { 9, 0, 2, 19, 14, 6, 3 };
  
  static
  {
    Integer[] arrayOfInteger1 = new Integer[15];
    arrayOfInteger1[0] = Integer.valueOf(0);
    arrayOfInteger1[1] = Integer.valueOf(1);
    arrayOfInteger1[2] = Integer.valueOf(2);
    arrayOfInteger1[3] = Integer.valueOf(3);
    arrayOfInteger1[4] = Integer.valueOf(4);
    arrayOfInteger1[5] = Integer.valueOf(5);
    arrayOfInteger1[6] = Integer.valueOf(6);
    arrayOfInteger1[7] = Integer.valueOf(7);
    arrayOfInteger1[8] = Integer.valueOf(10);
    arrayOfInteger1[9] = Integer.valueOf(11);
    arrayOfInteger1[10] = Integer.valueOf(12);
    arrayOfInteger1[11] = Integer.valueOf(13);
    arrayOfInteger1[12] = Integer.valueOf(14);
    arrayOfInteger1[13] = Integer.valueOf(15);
    arrayOfInteger1[14] = Integer.valueOf(18);
    a = Arrays.asList(arrayOfInteger1);
    Integer[] arrayOfInteger2 = new Integer[12];
    arrayOfInteger2[0] = Integer.valueOf(1);
    arrayOfInteger2[1] = Integer.valueOf(2);
    arrayOfInteger2[2] = Integer.valueOf(0);
    arrayOfInteger2[3] = Integer.valueOf(7);
    arrayOfInteger2[4] = Integer.valueOf(11);
    arrayOfInteger2[5] = Integer.valueOf(4);
    arrayOfInteger2[6] = Integer.valueOf(14);
    arrayOfInteger2[7] = Integer.valueOf(6);
    arrayOfInteger2[8] = Integer.valueOf(13);
    arrayOfInteger2[9] = Integer.valueOf(12);
    arrayOfInteger2[10] = Integer.valueOf(3);
    arrayOfInteger2[11] = Integer.valueOf(8);
    Arrays.asList(arrayOfInteger2);
    FilterFactory.a.put(200, FilmFilterParameter.class);
  }
  
  public final int[] a()
  {
    return g;
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final Object d(int paramInt)
  {
    int i = ((Number)efj.Cv.c(getFilterType(), paramInt)).intValue();
    if ((getFilterType() == 200) && (paramInt == 3)) {
      return Integer.valueOf(((Integer)a.get(i)).intValue());
    }
    return Integer.valueOf(i);
  }
  
  public final Object[] e(int paramInt)
  {
    if (paramInt == 3) {
      return a.toArray();
    }
    return super.e(paramInt);
  }
  
  public int getFilterType()
  {
    return 200;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.FilmFilterParameter
 * JD-Core Version:    0.7.0.1
 */