package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@UsedByReflection
public class Vintage2FilterParameter
  extends NativeFilterParameter
{
  private static final int[] a = { 9, 0, 2, 19, 6, 3, 800 };
  private static final List<Integer> g;
  
  static
  {
    Integer[] arrayOfInteger = new Integer[12];
    arrayOfInteger[0] = Integer.valueOf(1);
    arrayOfInteger[1] = Integer.valueOf(2);
    arrayOfInteger[2] = Integer.valueOf(0);
    arrayOfInteger[3] = Integer.valueOf(7);
    arrayOfInteger[4] = Integer.valueOf(11);
    arrayOfInteger[5] = Integer.valueOf(4);
    arrayOfInteger[6] = Integer.valueOf(14);
    arrayOfInteger[7] = Integer.valueOf(6);
    arrayOfInteger[8] = Integer.valueOf(13);
    arrayOfInteger[9] = Integer.valueOf(12);
    arrayOfInteger[10] = Integer.valueOf(3);
    arrayOfInteger[11] = Integer.valueOf(8);
    g = Collections.unmodifiableList(Arrays.asList(arrayOfInteger));
    FilterFactory.a.put(202, Vintage2FilterParameter.class);
  }
  
  public final int[] a()
  {
    return a;
  }
  
  public final float b(int paramInt)
  {
    if (paramInt == 800) {
      return 0.0F;
    }
    return super.b(paramInt);
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final float c(int paramInt)
  {
    if (paramInt == 800) {
      return -1 + g.size();
    }
    return super.c(paramInt);
  }
  
  public final Object d(int paramInt)
  {
    if (paramInt == 800)
    {
      int i = ((Number)super.d(3)).intValue();
      return Integer.valueOf(g.indexOf(Integer.valueOf(i)));
    }
    return super.d(paramInt);
  }
  
  public int getFilterType()
  {
    return 202;
  }
  
  public float getParameterFloat(int paramInt)
  {
    if (paramInt == 800) {}
    for (;;)
    {
      try
      {
        int i = getParameterInteger(3);
        int j = g.indexOf(Integer.valueOf(i));
        f2 = j;
        return f2;
      }
      finally {}
      float f1 = super.getParameterFloat(paramInt);
      float f2 = f1;
    }
  }
  
  public int getParameterInteger(int paramInt)
  {
    try
    {
      float f = getParameterFloat(paramInt);
      int i = (int)f;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean setParameterFloat(int paramInt, float paramFloat)
  {
    int i;
    if (paramInt == 800) {
      i = (int)paramFloat;
    }
    for (;;)
    {
      try
      {
        boolean bool3 = super.setParameterFloat(3, ((Integer)g.get(i)).intValue());
        bool2 = bool3;
        return bool2;
      }
      finally {}
      boolean bool1 = super.setParameterFloat(paramInt, paramFloat);
      boolean bool2 = bool1;
    }
  }
  
  public boolean setParameterInteger(int paramInt1, int paramInt2)
  {
    float f = paramInt2;
    try
    {
      boolean bool = setParameterFloat(paramInt1, f);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.Vintage2FilterParameter
 * JD-Core Version:    0.7.0.1
 */