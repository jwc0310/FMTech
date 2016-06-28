package com.google.android.libraries.photoeditor.filterparameters;

import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.photoeditor.core.FilterFactory;
import com.google.android.libraries.photoeditor.core.NativeFilterParameter;
import efj;
import gem;

@UsedByReflection
public class AutoEnhanceFilterParameter
  extends NativeFilterParameter
{
  private static int[] a = { 12, 201, 202, 480, 481, 482 };
  
  static
  {
    FilterFactory.a.put(18, AutoEnhanceFilterParameter.class);
  }
  
  public final int[] a()
  {
    return a;
  }
  
  public final float b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return efj.Cv.a(getFilterType(), paramInt);
    }
    return 0.0F;
  }
  
  public final int b()
  {
    return 12;
  }
  
  public final float c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return efj.Cv.b(getFilterType(), paramInt);
    }
    return 2.0F;
  }
  
  public final Object d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return efj.Cv.c(getFilterType(), paramInt);
    case 12: 
      return Integer.valueOf(0);
    case 201: 
    case 202: 
      return new byte[0];
    }
    return "";
  }
  
  public int getFilterType()
  {
    return 18;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.AutoEnhanceFilterParameter
 * JD-Core Version:    0.7.0.1
 */