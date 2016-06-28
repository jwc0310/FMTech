package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;

@UsedByReflection
public class RetroluxFilterParameter
  extends NativeFilterParameter
{
  static
  {
    FilterFactory.a.put(16, RetroluxFilterParameter.class);
  }
  
  public final int[] a()
  {
    return new int[] { 0, 2, 1, 9, 3, 233, 232, 19, 6, 102, 105, 235, 234 };
  }
  
  public final int b()
  {
    return 0;
  }
  
  public int getFilterType()
  {
    return 16;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.RetroluxFilterParameter
 * JD-Core Version:    0.7.0.1
 */