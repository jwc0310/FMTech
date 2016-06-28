package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;

@UsedByReflection
public class UPointFilterParameter
  extends NativeFilterParameter
{
  static
  {
    FilterFactory.a.put(3, UPointFilterParameter.class);
  }
  
  public final int[] a()
  {
    return new int[0];
  }
  
  public final float b(int paramInt)
  {
    return d.intValue();
  }
  
  public final int b()
  {
    return 1000;
  }
  
  public final float c(int paramInt)
  {
    return c.intValue();
  }
  
  public final Object d(int paramInt)
  {
    return b;
  }
  
  public int getFilterType()
  {
    return 3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.UPointFilterParameter
 * JD-Core Version:    0.7.0.1
 */