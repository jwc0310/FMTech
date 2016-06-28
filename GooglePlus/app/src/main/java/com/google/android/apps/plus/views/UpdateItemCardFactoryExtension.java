package com.google.android.apps.plus.views;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import dsr;
import dus;
import dwh;
import dxi;
import dxj;
import dxk;
import dyy;
import dyz;
import dzh;
import dzl;
import eab;
import efj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lll;
import lpi;
import lpk;
import lpo;
import mbb;

@UsedByReflection
public class UpdateItemCardFactoryExtension
  implements lll
{
  private static final ArrayList<Integer> a;
  
  static
  {
    Integer[] arrayOfInteger = new Integer[14];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(1);
    arrayOfInteger[2] = Integer.valueOf(2);
    arrayOfInteger[3] = Integer.valueOf(3);
    arrayOfInteger[4] = Integer.valueOf(4);
    arrayOfInteger[5] = Integer.valueOf(5);
    arrayOfInteger[6] = Integer.valueOf(6);
    arrayOfInteger[7] = Integer.valueOf(7);
    arrayOfInteger[8] = Integer.valueOf(8);
    arrayOfInteger[9] = Integer.valueOf(9);
    arrayOfInteger[10] = Integer.valueOf(10);
    arrayOfInteger[11] = Integer.valueOf(11);
    arrayOfInteger[12] = Integer.valueOf(12);
    arrayOfInteger[13] = Integer.valueOf(13);
    a = new ArrayList(Arrays.asList(arrayOfInteger));
  }
  
  public final int a(String paramString, long paramLong)
  {
    int i = 1;
    if ((0x100 & paramLong) != 0L) {
      i = 5;
    }
    do
    {
      do
      {
        return i;
        if ((0x40000 & paramLong) != 0L) {
          return 9;
        }
        if ((0x80000 & paramLong) != 0L) {
          return 10;
        }
        if ((0x200 & paramLong) != 0L) {
          return 4;
        }
        if ((0x400 & paramLong) != 0L) {
          return 3;
        }
        if ((0x1000 & paramLong) != 0L) {
          return 6;
        }
      } while ((0x804 & paramLong) != 0L);
      if ((0x18000 & paramLong) != 0L) {
        return 7;
      }
      if ((0x40 & paramLong) != 0L) {
        return 8;
      }
      if ((0xA0 & paramLong) != 0L) {
        return 2;
      }
    } while ((0x2000 & paramLong) != 0L);
    if ((0x200000 & paramLong) != 0L) {
      return 11;
    }
    if ((0x100000 & paramLong) != 0L) {
      return 12;
    }
    if ((0x400000 & paramLong) != 0L) {
      return 13;
    }
    return 0;
  }
  
  public final ViewGroup a(Context paramContext, String paramString, long paramLong)
  {
    int i;
    String str1;
    if (("update".equals(efj.u(paramString))) && (efj.v(paramString) == null))
    {
      i = 1;
      if (i != 0) {
        break label80;
      }
      str1 = String.valueOf(paramString);
      if (str1.length() == 0) {
        break label66;
      }
    }
    label66:
    for (String str2 = "Incorrect stream card factory for activity ID: ".concat(str1);; str2 = new String("Incorrect stream card factory for activity ID: "))
    {
      Log.e("UpdateCardFactoryExt", str2);
      return null;
      i = 0;
      break;
    }
    label80:
    Object localObject;
    if ((0x100 & paramLong) != 0L) {
      localObject = new dwh(paramContext);
    }
    label453:
    for (;;)
    {
      lpk locallpk = new lpk(paramContext);
      efj.e(localObject, "ContentCard cannot be null.");
      locallpk.f = ((lpi)localObject);
      locallpk.addView(locallpk.f);
      return locallpk;
      if ((0x40000 & paramLong) != 0L)
      {
        localObject = new dzh(paramContext);
      }
      else if ((0x80000 & paramLong) != 0L)
      {
        localObject = new dxk(paramContext);
      }
      else if ((0x200 & paramLong) != 0L)
      {
        localObject = new dxi(paramContext);
      }
      else if ((0x400 & paramLong) != 0L)
      {
        localObject = new dzl(paramContext);
      }
      else if ((0x1000 & paramLong) != 0L)
      {
        localObject = new dyy(paramContext);
      }
      else if ((0x804 & paramLong) != 0L)
      {
        localObject = new dxj(paramContext);
      }
      else if ((0x18000 & paramLong) != 0L)
      {
        localObject = ((dsr)mbb.a(paramContext, dsr.class)).a(paramContext);
      }
      else if ((0xE0 & paramLong) != 0L)
      {
        localObject = new dus(paramContext);
      }
      else if ((0x2000 & paramLong) != 0L)
      {
        localObject = new dxj(paramContext);
      }
      else if ((0x200000 & paramLong) != 0L)
      {
        localObject = new dyz(paramContext);
      }
      else
      {
        Iterator localIterator = mbb.c(paramContext, lpo.class).iterator();
        lpo locallpo;
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          locallpo = (lpo)localIterator.next();
        } while (!locallpo.a(paramLong));
        for (localObject = locallpo.a(paramContext);; localObject = null)
        {
          if (localObject != null) {
            break label453;
          }
          localObject = new eab(paramContext);
          break;
        }
      }
    }
  }
  
  public final ArrayList<Integer> b()
  {
    return a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.UpdateItemCardFactoryExtension
 * JD-Core Version:    0.7.0.1
 */