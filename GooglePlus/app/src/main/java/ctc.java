import android.graphics.Point;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ctc
  extends duq
{
  ctc(cta paramcta, long paramLong)
  {
    super(200L);
  }
  
  public final void a()
  {
    if (!this.d.s)
    {
      this.d.aj = true;
      return;
    }
    int i;
    int i4;
    if (this.d.ae != null)
    {
      i = 1;
      if (i == 0)
      {
        if (this.d.af == null) {
          break label174;
        }
        i4 = 1;
        label48:
        if (i4 == 0) {
          break label180;
        }
      }
    }
    ijy localijy;
    List localList1;
    label174:
    label180:
    for (boolean bool = true;; bool = false)
    {
      localijy = this.d.ad;
      localList1 = this.d.ac;
      localijy.h = localList1.size();
      localijy.g = localijy.f.a();
      ika localika = localijy.i;
      localika.a.clear();
      for (int j = -1 + localList1.size(); j >= 0; j--)
      {
        nve localnve = (nve)localList1.get(j);
        localika.a.put(localnve.a, Integer.valueOf(j));
      }
      i = 0;
      break;
      i4 = 0;
      break label48;
    }
    long l1 = System.currentTimeMillis();
    ArrayList localArrayList1 = new ArrayList();
    HashMap localHashMap = new HashMap();
    ikb.a(localijy.b);
    int k = ikb.b;
    List localList2 = localijy.a(localList1, localHashMap);
    ArrayList localArrayList2;
    if (localList2 == null)
    {
      localArrayList2 = null;
      if (localArrayList2 != null) {
        break label678;
      }
    }
    for (;;)
    {
      cta.b(this.d);
      return;
      Collections.sort(localList2, ijy.a);
      if (Log.isLoggable("MarkerClusterManager", 2))
      {
        String str2 = String.valueOf(localList2);
        new StringBuilder(25 + String.valueOf(str2).length()).append("initial sorted clusters: ").append(str2);
      }
      int m = localList2.size();
      for (int n = 0; n < m; n++)
      {
        ijx localijx2 = (ijx)localList2.get(n);
        ijx localijx3 = (ijx)localHashMap.get(((nve)localijx2.c.get(0)).a);
        for (int i3 = n + 1; i3 < m; i3++)
        {
          ijx localijx4 = (ijx)localList2.get(i3);
          Point localPoint1 = localijx2.e;
          Point localPoint2 = localijx4.e;
          if (Math.abs(localPoint1.y - localPoint2.y) > k) {
            break;
          }
          if (Math.abs(localPoint1.x - localPoint2.x) <= k) {
            localijx3.a((ijx)localHashMap.get(((nve)localijx4.c.get(0)).a), localHashMap);
          }
        }
      }
      Iterator localIterator = new HashSet(localHashMap.values()).iterator();
      while (localIterator.hasNext())
      {
        ijx localijx1 = (ijx)localIterator.next();
        localijx1.c();
        localArrayList1.add(localijx1);
        if (Log.isLoggable("MarkerClusterManager", 2))
        {
          String str1 = String.valueOf(localijx1);
          new StringBuilder(13 + String.valueOf(str1).length()).append("Add cluster: ").append(str1);
        }
      }
      if (Log.isLoggable("MarkerClusterManager", 3))
      {
        int i1 = localArrayList1.size();
        int i2 = localList1.size();
        long l2 = ijy.a(l1);
        new StringBuilder(91).append("calculateUserClusters: clusters=").append(i1).append(" users=").append(i2).append(" duration=").append(l2);
      }
      localArrayList2 = localArrayList1;
      break;
      label678:
      localijy.a(localArrayList2, bool);
      localijy.a(false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctc
 * JD-Core Version:    0.7.0.1
 */