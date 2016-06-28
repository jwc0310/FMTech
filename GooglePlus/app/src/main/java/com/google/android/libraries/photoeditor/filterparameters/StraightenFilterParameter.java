package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;

@UsedByReflection
public class StraightenFilterParameter
  extends NativeFilterParameter
{
  static
  {
    FilterFactory.a.put(5, StraightenFilterParameter.class);
  }
  
  public final int[] a()
  {
    return new int[] { 38, 39 };
  }
  
  public final float b(int paramInt)
  {
    if (paramInt == 38) {
      return -45.0F;
    }
    return -2.147484E+009F;
  }
  
  public final int b()
  {
    return 38;
  }
  
  public final float c(int paramInt)
  {
    if (paramInt == 38) {
      return 45.0F;
    }
    return 3.0F;
  }
  
  public final Object d(int paramInt)
  {
    return Float.valueOf(0.0F);
  }
  
  public int getFilterType()
  {
    return 5;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.StraightenFilterParameter
 * JD-Core Version:    0.7.0.1
 */