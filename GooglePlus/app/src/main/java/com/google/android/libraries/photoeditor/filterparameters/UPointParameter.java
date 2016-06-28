package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import gfi;

@UsedByReflection
public final class UPointParameter
  extends gfi
{
  private static final int[] g;
  
  static
  {
    int[] arrayOfInt1 = { 0, 1, 2, 11, 201 };
    int[] arrayOfInt2 = a;
    int[] arrayOfInt3 = new int[5 + arrayOfInt2.length];
    System.arraycopy(arrayOfInt1, 0, arrayOfInt3, 0, 5);
    System.arraycopy(arrayOfInt2, 0, arrayOfInt3, 5, arrayOfInt2.length);
    g = arrayOfInt3;
    FilterFactory.a.put(300, UPointParameter.class);
  }
  
  public final int[] a()
  {
    return g;
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final int getFilterType()
  {
    return 300;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.UPointParameter
 * JD-Core Version:    0.7.0.1
 */