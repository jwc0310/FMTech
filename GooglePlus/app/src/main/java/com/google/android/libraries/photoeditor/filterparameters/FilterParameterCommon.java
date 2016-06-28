package com.google.android.libraries.photoeditor.filterparameters;

import com.google.android.apps.common.proguard.UsedByNative;
import efj;
import gem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UsedByNative
public abstract class FilterParameterCommon
  implements FilterParameter
{
  private static int[] a = { 610, 611, 612, 613, 614, 615, 616, 617, 618 };
  public static final Integer b = Integer.valueOf(0);
  public static final Integer c = Integer.valueOf(100);
  public static final Integer d = Integer.valueOf(-100);
  public final List<Integer> e;
  public int f = 1;
  private final boolean g;
  
  public FilterParameterCommon()
  {
    this.e = Collections.unmodifiableList(new ArrayList());
    this.g = true;
  }
  
  public FilterParameterCommon(int[] paramArrayOfInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfInt != null)
    {
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++) {
        localArrayList.add(Integer.valueOf(paramArrayOfInt[j]));
      }
    }
    this.e = Collections.unmodifiableList(localArrayList);
    this.g = false;
  }
  
  public static boolean g(int paramInt)
  {
    int[] arrayOfInt = a;
    int i = arrayOfInt.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (arrayOfInt[j] == paramInt) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public final boolean a(int paramInt, float paramFloat)
  {
    Float localFloat1 = Float.valueOf(b(paramInt));
    Float localFloat2 = Float.valueOf(c(paramInt));
    if ((!(localFloat1 instanceof Number)) || (!(localFloat2 instanceof Number))) {
      throw new IllegalArgumentException();
    }
    float f1 = ((Number)localFloat1).floatValue();
    float f2 = ((Number)localFloat2).floatValue();
    if (paramFloat < f1) {
      paramFloat = f1;
    }
    for (;;)
    {
      return setParameterFloat(paramInt, paramFloat);
      if (paramFloat > f2) {
        paramFloat = f2;
      }
    }
  }
  
  @UsedByNative
  public boolean affectsPanorama()
  {
    return this.g;
  }
  
  public float b(int paramInt)
  {
    return efj.Cv.a(getFilterType(), paramInt);
  }
  
  public float c(int paramInt)
  {
    return efj.Cv.b(getFilterType(), paramInt);
  }
  
  public FilterParameter c()
  {
    try
    {
      FilterParameter localFilterParameter = (FilterParameter)super.clone();
      return localFilterParameter;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new IllegalStateException("Clone not supported");
    }
    finally {}
  }
  
  public Object d(int paramInt)
  {
    return efj.Cv.c(getFilterType(), paramInt);
  }
  
  public final List<Integer> d()
  {
    return this.e;
  }
  
  public final int e()
  {
    return this.f;
  }
  
  public Object[] e(int paramInt)
  {
    int i = Float.valueOf(b(paramInt)).intValue();
    int j = Float.valueOf(c(paramInt)).intValue();
    Integer[] arrayOfInteger = new Integer[1 + (j - i)];
    for (int k = i; k <= j; k++) {
      arrayOfInteger[(k - i)] = Integer.valueOf(k);
    }
    return arrayOfInteger;
  }
  
  public final float f(int paramInt)
  {
    float f1 = Float.valueOf(b(4)).floatValue();
    float f2 = Float.valueOf(c(4)).floatValue();
    return (getParameterFloat(4) - f1) / (f2 - f1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.FilterParameterCommon
 * JD-Core Version:    0.7.0.1
 */