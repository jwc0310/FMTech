import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ijy
{
  public static final Comparator<ijx> a = new ijz();
  private static final fxw j = new fxw(0.0D, 0.0D);
  public final Context b;
  public final List<ijx> c = new ArrayList();
  public final Map<fxz, ijx> d = new HashMap();
  public final Map<String, ijx> e = new HashMap();
  public fxc f;
  public fxg g;
  public int h;
  public final ika i = new ika();
  private final int k;
  private final int l;
  private Rect m;
  
  public ijy(Context paramContext, int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    this.b = paramContext;
    this.k = paramInt;
    int n = efj.M(paramContext);
    int i1;
    if (n < 48) {
      i1 = 2097152;
    }
    for (;;)
    {
      ikb.a(paramContext);
      int i2 = 4 * ikb.c;
      ikb.a(paramContext);
      int i3 = i2 * ikb.d;
      this.l = (i1 / (i3 * 2));
      if (Log.isLoggable("MarkerClusterManager", 4))
      {
        int i8 = this.l;
        new StringBuilder(83).append("totalMarkerIconBytes=").append(i1).append(" markerIconBytes=").append(i3).append(" maxMarkers=").append(i8);
      }
      int i4 = paramDisplayMetrics.widthPixels;
      int i5 = paramDisplayMetrics.heightPixels;
      ikb.a(this.b);
      int i6 = ikb.c;
      ikb.a(this.b);
      int i7 = ikb.d;
      this.m = new Rect(-i6, -i7, i4 + i6, i5 + i7);
      if (Log.isLoggable("MarkerClusterManager", 3))
      {
        String str = String.valueOf(this.m);
        new StringBuilder(17 + String.valueOf(str).length()).append("mPaddedMapRect = ").append(str);
      }
      return;
      if (n < 64) {
        i1 = 8388608;
      } else {
        i1 = 20971520;
      }
    }
  }
  
  public static long a(long paramLong)
  {
    return System.currentTimeMillis() - paramLong;
  }
  
  private static boolean a(List<nve> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      if (!efj.b(((nve)localIterator.next()).b)) {
        return false;
      }
    }
    return true;
  }
  
  private final void b()
  {
    this.e.clear();
    Iterator localIterator1 = this.c.iterator();
    while (localIterator1.hasNext())
    {
      ijx localijx = (ijx)localIterator1.next();
      Iterator localIterator2 = localijx.c.iterator();
      while (localIterator2.hasNext())
      {
        nve localnve = (nve)localIterator2.next();
        this.e.put(localnve.a, localijx);
      }
    }
  }
  
  private final boolean b(List<nve> paramList)
  {
    for (int n = -1 + paramList.size(); n >= 0; n--)
    {
      nve localnve = (nve)paramList.get(n);
      if (TextUtils.equals(((giz)mbb.a(this.b, giz.class)).a(this.k).b("gaia_id"), localnve.a)) {
        return true;
      }
    }
    return false;
  }
  
  public final List<ijx> a(List<nve> paramList, Map<String, ijx> paramMap)
  {
    fyc localfyc = this.g.a();
    if ((!localfyc.c.equals(j)) || (!localfyc.d.equals(j)) || (!localfyc.a.equals(j)) || (!localfyc.b.equals(j))) {}
    for (int n = 1; n == 0; n = 0) {
      return null;
    }
    HashMap localHashMap = new HashMap(paramList.size());
    int i1 = paramList.size();
    int i2 = 0;
    if (i2 < i1)
    {
      nve localnve = (nve)paramList.get(i2);
      nvv localnvv = efj.a(localnve.b);
      ijx localijx;
      if ((localnvv != null) && (localnvv.b != null) && (localnvv.c != null))
      {
        fxw localfxw = new fxw(localnvv.b.doubleValue(), localnvv.c.doubleValue());
        localijx = (ijx)localHashMap.get(localfxw);
        if (localijx != null) {
          break label361;
        }
        Point localPoint = this.g.a(localfxw);
        localijx = new ijx(this.b, localnve, localfxw, localPoint);
        localHashMap.put(localfxw, localijx);
      }
      for (;;)
      {
        paramMap.put(localnve.a, localijx);
        if (Log.isLoggable("MarkerClusterManager", 2))
        {
          String str1 = String.valueOf(localnve.c);
          String str2 = String.valueOf(localijx.d);
          String str3 = String.valueOf(localijx.e);
          new StringBuilder(4 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str1).append(", ").append(str2).append(", ").append(str3);
        }
        i2++;
        break;
        label361:
        localijx.c.add(localnve);
      }
    }
    return new ArrayList(localHashMap.values());
  }
  
  public final void a(ijx paramijx)
  {
    long l1 = System.currentTimeMillis();
    int n;
    label32:
    ijx localijx1;
    ijx localijx2;
    int i3;
    if (this.c.size() <= 25)
    {
      n = 1;
      Iterator localIterator = this.c.iterator();
      if (!localIterator.hasNext()) {
        break label126;
      }
      localijx1 = (ijx)localIterator.next();
      if (localijx1 != paramijx) {
        break label89;
      }
      int i5 = ikc.b;
      localijx2 = localijx1;
      i3 = i5;
    }
    for (;;)
    {
      localijx2.a(i3);
      break label32;
      n = 0;
      break;
      label89:
      if (n != 0)
      {
        int i4 = ikc.c;
        localijx2 = localijx1;
        i3 = i4;
      }
      else
      {
        int i2 = ikc.a;
        localijx2 = localijx1;
        i3 = i2;
      }
    }
    label126:
    if (Log.isLoggable("MarkerClusterManager", 3))
    {
      int i1 = this.c.size();
      long l2 = System.currentTimeMillis() - l1;
      new StringBuilder(62).append("selectCluster: count=").append(i1).append(" duration=").append(l2);
    }
  }
  
  public final void a(List<ijx> paramList, boolean paramBoolean)
  {
    long l1 = System.currentTimeMillis();
    if ((paramBoolean) && (paramList.size() <= 25)) {}
    HashMap localHashMap;
    for (int n = 1;; n = 0)
    {
      localHashMap = new HashMap(this.c.size());
      Iterator localIterator1 = this.c.iterator();
      while (localIterator1.hasNext())
      {
        ijx localijx3 = (ijx)localIterator1.next();
        localHashMap.put(localijx3.a(), localijx3);
      }
    }
    this.c.clear();
    this.d.clear();
    Iterator localIterator2 = paramList.iterator();
    if (localIterator2.hasNext())
    {
      ijx localijx1 = (ijx)localIterator2.next();
      String str = localijx1.a();
      ijx localijx2;
      if (localHashMap.containsKey(str))
      {
        localijx2 = (ijx)localHashMap.remove(str);
        if ((localijx2.a != null) && (localijx2.b != null))
        {
          localijx1.a = localijx2.a;
          ikb localikb = localijx2.b;
          localijx1.b = localikb;
          localikb.f = localijx1;
          if (!localijx1.d.equals(localijx2.d)) {
            localijx1.a.a(localijx1.d);
          }
          this.d.put(localijx1.a, localijx1);
        }
      }
      for (int i1 = 1;; i1 = 0)
      {
        if ((n != 0) && (i1 == 0)) {
          localijx1.a(ikc.c);
        }
        ika localika = this.i;
        Collections.sort(localijx1.c, localika);
        this.c.add(localijx1);
        break;
        localijx2.b();
      }
    }
    Iterator localIterator3 = localHashMap.values().iterator();
    while (localIterator3.hasNext()) {
      ((ijx)localIterator3.next()).b();
    }
    b();
    if (Log.isLoggable("MarkerClusterManager", 3))
    {
      long l2 = System.currentTimeMillis() - l1;
      new StringBuilder(45).append("updateClusters: duration=").append(l2);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool1 = a();
    if ((paramBoolean) && (bool1)) {
      this.g = this.f.a();
    }
    int n = this.c.size();
    int i1 = 0;
    if (i1 < n)
    {
      ijx localijx = (ijx)this.c.get(i1);
      String str1;
      if (bool1)
      {
        localijx.e = this.g.a(localijx.d);
        Point localPoint = localijx.e;
        boolean bool3 = this.m.contains(localPoint.x, localPoint.y);
        if (Log.isLoggable("MarkerClusterManager", 2))
        {
          String str2 = String.valueOf(localijx);
          String str3 = String.valueOf(localPoint);
          new StringBuilder(31 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str2).append(" screenPosition=").append(str3).append(" onScreen=").append(bool3);
        }
        if (!bool3) {}
      }
      else if (localijx.a == null)
      {
        List localList = localijx.c;
        boolean bool2 = a(localList);
        ikb localikb = new ikb(this.b, localList, bool2, b(localList));
        localikb.g = localijx.f;
        Bitmap localBitmap = localikb.d();
        ikb.a(this.b);
        PointF localPointF = ikb.e;
        fxc localfxc = this.f;
        switch (localijx.c.size())
        {
        default: 
          int i6 = -4 + localijx.c.size();
          Context localContext5 = localijx.g;
          int i7 = efj.Op;
          Object[] arrayOfObject5 = new Object[5];
          arrayOfObject5[0] = ((nve)localijx.c.get(0)).c;
          arrayOfObject5[1] = ((nve)localijx.c.get(1)).c;
          arrayOfObject5[2] = ((nve)localijx.c.get(2)).c;
          arrayOfObject5[3] = ((nve)localijx.c.get(3)).c;
          arrayOfObject5[4] = Integer.valueOf(i6);
          str1 = localContext5.getString(i7, arrayOfObject5);
          label449:
          fxz localfxz = localfxc.a(str1, localijx.d, localBitmap, localPointF.x, localPointF.y);
          localijx.a = localfxz;
          localijx.b = localikb;
          localikb.f = localijx;
          this.d.put(localfxz, localijx);
        }
      }
      for (;;)
      {
        i1++;
        break;
        Context localContext4 = localijx.g;
        int i5 = efj.Oo;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = ((nve)localijx.c.get(0)).c;
        str1 = localContext4.getString(i5, arrayOfObject4);
        break label449;
        Context localContext3 = localijx.g;
        int i4 = efj.Or;
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = ((nve)localijx.c.get(0)).c;
        arrayOfObject3[1] = ((nve)localijx.c.get(1)).c;
        str1 = localContext3.getString(i4, arrayOfObject3);
        break label449;
        Context localContext2 = localijx.g;
        int i3 = efj.Oq;
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = ((nve)localijx.c.get(0)).c;
        arrayOfObject2[1] = ((nve)localijx.c.get(1)).c;
        arrayOfObject2[2] = ((nve)localijx.c.get(2)).c;
        str1 = localContext2.getString(i3, arrayOfObject2);
        break label449;
        Context localContext1 = localijx.g;
        int i2 = efj.On;
        Object[] arrayOfObject1 = new Object[4];
        arrayOfObject1[0] = ((nve)localijx.c.get(0)).c;
        arrayOfObject1[1] = ((nve)localijx.c.get(1)).c;
        arrayOfObject1[2] = ((nve)localijx.c.get(2)).c;
        arrayOfObject1[3] = ((nve)localijx.c.get(3)).c;
        str1 = localContext1.getString(i2, arrayOfObject1);
        break label449;
        if (localijx.a != null) {
          localijx.b();
        }
      }
    }
  }
  
  public final boolean a()
  {
    return this.h > this.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijy
 * JD-Core Version:    0.7.0.1
 */