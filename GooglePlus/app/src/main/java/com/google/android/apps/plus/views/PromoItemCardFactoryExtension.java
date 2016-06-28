package com.google.android.apps.plus.views;

import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import java.util.Arrays;
import lll;
import lod;

@UsedByReflection
public class PromoItemCardFactoryExtension
  implements lll
{
  private static final ArrayList<Integer> a;
  
  static
  {
    Integer[] arrayOfInteger = new Integer[7];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(1);
    arrayOfInteger[2] = Integer.valueOf(2);
    arrayOfInteger[3] = Integer.valueOf(3);
    arrayOfInteger[4] = Integer.valueOf(4);
    arrayOfInteger[5] = Integer.valueOf(5);
    arrayOfInteger[6] = Integer.valueOf(6);
    a = new ArrayList(Arrays.asList(arrayOfInteger));
  }
  
  public final int a(String paramString, long paramLong)
  {
    if (!lod.a(paramString))
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0) {}
      for (String str2 = "Incorrect stream card factory for activity ID: ".concat(str1);; str2 = new String("Incorrect stream card factory for activity ID: "))
      {
        Log.e("PromoCardFactoryExt", str2);
        return -1;
      }
    }
    switch (lod.b(paramString))
    {
    case 5: 
    default: 
      return 0;
    case 1: 
    case 2: 
    case 3: 
    case 6: 
    case 10: 
      return 1;
    case 4: 
      return 2;
    case 7: 
    case 8: 
      return 4;
    case 9: 
      return 5;
    }
    return 6;
  }
  
  public final ArrayList<Integer> b()
  {
    return a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PromoItemCardFactoryExtension
 * JD-Core Version:    0.7.0.1
 */