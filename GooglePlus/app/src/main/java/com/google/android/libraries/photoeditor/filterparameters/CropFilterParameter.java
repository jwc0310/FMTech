package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;

@UsedByReflection
public class CropFilterParameter
  extends NativeFilterParameter
{
  static
  {
    FilterFactory.a.put(6, CropFilterParameter.class);
  }
  
  public final int[] a()
  {
    return new int[] { 42, 40, 43, 44, 45, 46 };
  }
  
  public final float b(int paramInt)
  {
    return super.b(paramInt);
  }
  
  public final int b()
  {
    return 42;
  }
  
  public final float c(int paramInt)
  {
    return super.c(paramInt);
  }
  
  public final Object d(int paramInt)
  {
    if ((paramInt == 42) || (paramInt == 40)) {
      return super.d(paramInt);
    }
    return Float.valueOf(((Number)super.d(paramInt)).floatValue());
  }
  
  public int getFilterType()
  {
    return 6;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.CropFilterParameter
 * JD-Core Version:    0.7.0.1
 */