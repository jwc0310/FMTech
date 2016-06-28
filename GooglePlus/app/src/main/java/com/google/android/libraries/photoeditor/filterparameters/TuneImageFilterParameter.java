package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;

@UsedByReflection
public class TuneImageFilterParameter
  extends NativeFilterParameter
{
  static
  {
    FilterFactory.a.put(4, TuneImageFilterParameter.class);
  }
  
  public final int[] a()
  {
    return new int[] { 2, 0, 20, 10, 1, 11 };
  }
  
  public final float b(int paramInt)
  {
    if (paramInt == 20) {
      return 0.0F;
    }
    return super.b(paramInt);
  }
  
  public final int b()
  {
    return 2;
  }
  
  public int getFilterType()
  {
    return 4;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.TuneImageFilterParameter
 * JD-Core Version:    0.7.0.1
 */