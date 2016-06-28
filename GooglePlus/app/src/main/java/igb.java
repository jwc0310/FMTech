import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

@SuppressLint({"DefaultLocale"})
public final class igb
  implements hta
{
  private static final int b = (int)Math.round(Math.sqrt(16.0D));
  private static final mcs c = new mcs("debug.social.bitmap_pool", (byte)0);
  private static final String[] d = { "put", "evict", "hit", "inexact hit", "miss" };
  private final ifx e;
  private final ige f = new ige();
  private final igi g = new igi();
  private final int h;
  private int i;
  private final Map<ify, int[]> j = new HashMap();
  
  public igb(int paramInt)
  {
    this.h = paramInt;
    if (Build.VERSION.SDK_INT >= 19)
    {
      this.e = new igg();
      return;
    }
    this.e = new igc();
  }
  
  private final void a(int paramInt)
  {
    if (paramInt < 0)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      throw new IllegalArgumentException(String.format("Target byte size must be >= 0, got: %s", arrayOfObject));
    }
    Bitmap localBitmap;
    do
    {
      localBitmap.recycle();
      if (Log.isLoggable("BitmapPoolLru", 2))
      {
        String str = String.valueOf(localObject);
        new StringBuilder(16 + String.valueOf(str).length()).append("Evicted bitmap: ").append(str);
      }
      if (this.i <= paramInt) {
        break;
      }
      localBitmap = this.f.a();
      Object localObject = this.e.a(localBitmap);
      this.g.a((ify)localObject);
      this.i = ((int)(this.i - ((ify)localObject).c));
    } while (localBitmap != null);
    throw new IllegalStateException("Pool is larger than its max size, but has no more bitmaps to evict.");
  }
  
  public final Bitmap a(int paramInt1, int paramInt2, iga paramiga)
  {
    for (;;)
    {
      try
      {
        ify localify1 = this.e.a(paramInt1, paramInt2);
        Bitmap localBitmap = this.f.a(localify1);
        if (localBitmap == null)
        {
          ify localify2 = this.e.a(paramInt1 * b, paramInt2 * b);
          SortedSet localSortedSet = this.g.a.navigableKeySet().subSet(localify1, localify2);
          localify3 = this.e.a(localify1, localSortedSet, paramiga);
          if (localify3 != null) {
            localBitmap = this.f.a(localify3);
          }
          if (localBitmap != null)
          {
            this.e.a(localify1, localBitmap);
            this.i = ((int)(this.i - localify3.c));
            this.g.a(localify3);
            if (Log.isLoggable("BitmapPoolLru", 2))
            {
              String str1 = String.valueOf(localify3);
              String str2 = String.valueOf(localify1);
              new StringBuilder(18 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Got bitmap: ").append(str1).append(" for: ").append(str2);
            }
            return localBitmap;
          }
          if (!Log.isLoggable("BitmapPoolLru", 3)) {
            continue;
          }
          String str3 = String.valueOf(localify1);
          String str4 = String.valueOf(paramiga);
          new StringBuilder(29 + String.valueOf(str3).length() + String.valueOf(str4).length()).append("Missing bitmap: ").append(str3).append(" match type: ").append(str4);
          continue;
        }
        ify localify3 = localify1;
      }
      finally {}
    }
  }
  
  public final String a()
  {
    return "BitmapPoolLru";
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      ify localify = this.e.a(paramInt1, paramInt2);
      igf localigf = (igf)this.f.a.get(localify);
      int k;
      if (localigf != null) {
        k = localigf.a();
      }
      while (k < paramInt3)
      {
        a(Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888));
        k++;
        continue;
        k = 0;
      }
      return;
    }
    finally {}
  }
  
  public final void a(Bitmap paramBitmap)
  {
    for (;;)
    {
      try
      {
        ify localify = this.e.a(paramBitmap);
        if ((localify.c > this.h) || (paramBitmap.getConfig() != Bitmap.Config.ARGB_8888) || (!paramBitmap.isMutable()))
        {
          paramBitmap.recycle();
          return;
        }
        ige localige = this.f;
        igf localigf = (igf)localige.a.get(localify);
        if (localigf == null)
        {
          localigf = new igf(localify);
          localige.a.put(localify, localigf);
          localigf.b = localige.b.b;
          localigf.a = localige.b;
          localigf.b.a = localigf;
          localige.b.b = localigf;
        }
        if (localigf.d == null) {
          localigf.d = new ArrayList();
        }
        localigf.d.add(paramBitmap);
        igi localigi = this.g;
        Integer localInteger = (Integer)localigi.a.get(localify);
        NavigableMap localNavigableMap = localigi.a;
        if (localInteger == null)
        {
          m = 1;
          localNavigableMap.put(localify, Integer.valueOf(m));
          if (Log.isLoggable("BitmapPoolLru", 2))
          {
            String str = String.valueOf(localify);
            new StringBuilder(24 + String.valueOf(str).length()).append("Putting bitmap in pool: ").append(str);
          }
          this.i = ((int)(this.i + localify.c));
          a(this.h);
          continue;
        }
        k = localInteger.intValue();
      }
      finally {}
      int k;
      int m = k + 1;
    }
  }
  
  public final void a(PrintWriter paramPrintWriter)
  {
    try
    {
      paramPrintWriter.print("current size: ");
      paramPrintWriter.println(this.i);
      paramPrintWriter.println("Profiling is currently inactive; to activate set the property debug.social.bitmap_pool to true.");
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final String b()
  {
    return "The current size of the pool. With profiling, hit and miss counts for each bitmap size.";
  }
  
  public final void c()
  {
    try
    {
      a(0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final float d()
  {
    try
    {
      float f1 = this.i;
      int k = this.h;
      float f2 = f1 / k;
      return f2;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igb
 * JD-Core Version:    0.7.0.1
 */