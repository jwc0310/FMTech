import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.Arrays;

public class log
{
  private static int[] a;
  
  public log(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    boolean bool1 = KeyCharacterMap.deviceHasKey(4);
    int i = localResources.getIdentifier("status_bar_height", "dimen", "android");
    if (i > 0) {}
    for (int j = localResources.getDimensionPixelSize(i);; j = 0)
    {
      int i4;
      int i6;
      label110:
      int n;
      int m;
      int k;
      if (!bool1)
      {
        int i3 = localResources.getIdentifier("navigation_bar_width", "dimen", "android");
        if (i3 > 0)
        {
          i4 = localResources.getDimensionPixelSize(i3);
          int i5 = localResources.getIdentifier("navigation_bar_height", "dimen", "android");
          if (i5 > 0)
          {
            i6 = localResources.getDimensionPixelSize(i5);
            if (localResources.getIdentifier("navigation_bar_height_landscape", "dimen", "android") > 0)
            {
              n = i6;
              m = i6;
              k = i4;
            }
          }
        }
      }
      for (;;)
      {
        boolean bool2;
        boolean bool3;
        label166:
        DisplayMetrics localDisplayMetrics1;
        label226:
        DisplayMetrics localDisplayMetrics2;
        hfa localhfa;
        int i1;
        int i2;
        if (localResources.getConfiguration().orientation == 2)
        {
          bool2 = true;
          if ((0xF & localResources.getConfiguration().screenLayout) <= 3) {
            break label374;
          }
          bool3 = true;
          localDisplayMetrics1 = new DisplayMetrics();
          if (!a(localDisplay, localDisplayMetrics1))
          {
            localDisplay.getMetrics(localDisplayMetrics1);
            localDisplayMetrics1.heightPixels = (j + localDisplayMetrics1.heightPixels);
            if ((!bool3) || (!bool2)) {
              break label380;
            }
            localDisplayMetrics1.heightPixels = (n + localDisplayMetrics1.heightPixels);
          }
          localDisplayMetrics2 = a(localDisplayMetrics1.widthPixels, localDisplayMetrics1.heightPixels, bool2, bool3, j, k, m, n);
          localhfa = new hfa(paramContext, localDisplayMetrics2.widthPixels, localDisplayMetrics2.heightPixels, (byte)0);
          i1 = localDisplayMetrics1.heightPixels;
          i2 = localDisplayMetrics1.widthPixels;
          if (bool2) {
            break label417;
          }
        }
        label417:
        for (boolean bool4 = true;; bool4 = false)
        {
          DisplayMetrics localDisplayMetrics3 = a(i1, i2, bool4, bool3, j, k, m, n);
          a(localhfa, new hfa(paramContext, localDisplayMetrics3.widthPixels, localDisplayMetrics3.heightPixels, (byte)0), Math.min(localDisplayMetrics2.widthPixels, localDisplayMetrics3.widthPixels), Math.max(localDisplayMetrics2.widthPixels, localDisplayMetrics3.widthPixels));
          return;
          bool2 = false;
          break;
          label374:
          bool3 = false;
          break label166;
          label380:
          if (bool2)
          {
            localDisplayMetrics1.widthPixels = (k + localDisplayMetrics1.widthPixels);
            break label226;
          }
          localDisplayMetrics1.heightPixels = (m + localDisplayMetrics1.heightPixels);
          break label226;
        }
        m = i6;
        k = i4;
        n = 0;
        continue;
        i6 = 0;
        break label110;
        i4 = 0;
        break;
        k = 0;
        m = 0;
        n = 0;
      }
    }
  }
  
  public static int a(int paramInt)
  {
    if (paramInt >= a.length) {
      paramInt = -1 + a.length;
    }
    return a[paramInt];
  }
  
  private static DisplayMetrics a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i = paramInt2 - paramInt3;
    if ((paramBoolean2) && (paramBoolean1)) {
      i -= paramInt6;
    }
    for (;;)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      localDisplayMetrics.widthPixels = paramInt1;
      localDisplayMetrics.heightPixels = i;
      return localDisplayMetrics;
      if (paramBoolean1) {
        paramInt1 -= paramInt4;
      } else {
        i -= paramInt5;
      }
    }
  }
  
  private static void a(hfa paramhfa1, hfa paramhfa2, int paramInt1, int paramInt2)
  {
    int i = Math.min(paramhfa1.a, paramhfa2.a);
    int j = Math.max(paramhfa1.a, paramhfa2.a);
    a = new int[j + 1];
    for (int k = 1; k <= j; k++) {
      a[k] = Math.max(paramhfa1.a(k), paramhfa2.a(k));
    }
    a[i] = paramInt1;
    a[j] = paramInt2;
    if (Log.isLoggable("StreamImageSizer", 4))
    {
      new StringBuilder(51).append("Obtained screen dimensions: ").append(paramInt1).append("x").append(paramInt2);
      String str = String.valueOf(Arrays.toString(a));
      if (str.length() != 0) {
        "Image Widths: ".concat(str);
      }
    }
    else
    {
      return;
    }
    new String("Image Widths: ");
  }
  
  @TargetApi(17)
  private static boolean a(Display paramDisplay, DisplayMetrics paramDisplayMetrics)
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      paramDisplay.getRealMetrics(paramDisplayMetrics);
      return true;
    }
    try
    {
      paramDisplayMetrics.widthPixels = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(paramDisplay, new Object[0])).intValue();
      paramDisplayMetrics.heightPixels = ((Integer)Display.class.getMethod("getRawHeight", new Class[0]).invoke(paramDisplay, new Object[0])).intValue();
      return true;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     log
 * JD-Core Version:    0.7.0.1
 */