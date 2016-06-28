import android.util.Log;
import android.util.SparseArray;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class lqu
  extends AbstractList<idr>
{
  int a;
  int b = 3;
  boolean c = false;
  private int e = 0;
  private int f = 2147483647;
  private int g = 2147483647;
  private final SparseArray<List<idr>> h;
  
  public lqu(lqp paramlqp, lqv paramlqv)
  {
    this.h = paramlqv.a;
    this.a = 0;
  }
  
  private final boolean c(int paramInt)
  {
    while (paramInt <= this.b)
    {
      List localList = (List)this.h.get(paramInt);
      if ((localList != null) && (localList.size() != 10) && (this.g > this.a))
      {
        lqp.a(this.d, paramInt * 10, 10);
        return true;
      }
      if ((this.h.get(paramInt) == null) || (this.h.get(paramInt) == this.d.c))
      {
        lqp.a(this.d, paramInt * 10, 10);
        return true;
      }
      paramInt++;
    }
    return false;
  }
  
  private final boolean d(int paramInt)
  {
    if (paramInt >= 0) {
      while (paramInt >= this.e)
      {
        if ((this.h.get(paramInt) == null) || (this.h.get(paramInt) == this.d.c))
        {
          this.d.b(paramInt * 10, 10);
          return true;
        }
        paramInt--;
      }
    }
    return false;
  }
  
  final void a()
  {
    if (this.a == 0) {
      this.h.clear();
    }
    for (;;)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      if (Log.isLoggable("StreamViewManager", 3))
      {
        int i5 = this.e;
        int i6 = this.b;
        new StringBuilder(36).append("Start: ").append(i5).append(", end: ").append(i6);
      }
      int i = 10 * this.e;
      int j = 10 * (1 + (this.b - this.e));
      lqp locallqp = this.d;
      int k = this.d.p;
      int m = Math.min(locallqp.g.a, j + i);
      if (m - i > 0)
      {
        llb localllb = locallqp.w;
        localllb.c = (m - i);
        localllb.b = i;
        localllb.a = k;
      }
      int n = this.h.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        int i4 = this.h.keyAt(i1);
        if ((i4 < this.e) || (i4 > this.b)) {
          localArrayList.add(Integer.valueOf(i4));
        }
      }
      int i2 = localArrayList.size();
      for (int i3 = 0; i3 < i2; i3++)
      {
        if (Log.isLoggable("StreamViewManager", 3))
        {
          String str = String.valueOf(localArrayList.get(i3));
          new StringBuilder(13 + String.valueOf(str).length()).append("Remove page: ").append(str);
        }
        this.h.remove(((Integer)localArrayList.get(i3)).intValue());
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if (Log.isLoggable("StreamViewManager", 3))
    {
      int i = paramInt / 10;
      new StringBuilder(25).append("Set max page: ").append(i);
    }
    this.f = (paramInt / 10);
    this.g = paramInt;
    this.b = Math.min(3 + this.d.q / 10, this.f);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (Log.isLoggable("StreamViewManager", 3)) {
      new StringBuilder(31).append("Set position pivot: ").append(paramInt);
    }
    int i = paramInt / 10;
    this.e = (i - 3);
    if (this.e < 0) {
      this.e = 0;
    }
    this.b = Math.min(this.f, i + 3);
    if (Log.isLoggable("StreamViewManager", 3))
    {
      int j = this.e;
      int k = this.b;
      new StringBuilder(49).append("Set position start: ").append(j).append(", end: ").append(k);
    }
    a();
    if (paramBoolean) {
      b(paramInt);
    }
  }
  
  public final void a(lke paramlke)
  {
    if (paramlke.e)
    {
      int i6 = -1 + (paramlke.b.size() + paramlke.d);
      this.d.g.a(i6);
    }
    int i = paramlke.d / 10;
    lqp locallqp = this.d;
    SparseArray localSparseArray = this.h;
    Map localMap = paramlke.c;
    List localList = paramlke.b;
    boolean bool;
    int j;
    if (paramlke.d % 10 == 0)
    {
      bool = true;
      efj.d(bool, "Offset not starting at the page level");
      j = localList.size() / 10;
    }
    for (int k = 0;; k++)
    {
      if (k >= j) {
        break label283;
      }
      ArrayList localArrayList1 = new ArrayList(10);
      int m = 0;
      for (;;)
      {
        if (m < 10)
        {
          ids localids1 = new ids();
          localids1.a = ((qzz)localList.get(m + k * 10));
          localids1.b = localMap;
          localArrayList1.add(localids1.a());
          m++;
          continue;
          bool = false;
          break;
        }
      }
      if (Log.isLoggable("StreamViewManager", 3))
      {
        int n = paramlke.a.c;
        int i1 = i + k;
        new StringBuilder(56).append("Page added (").append(n).append("): ").append(i1).append(", size: 10");
      }
      locallqp.a(localSparseArray, i + k, localArrayList1);
      localSparseArray.put(i + k, localArrayList1);
    }
    label283:
    if (localList.size() % 10 != 0)
    {
      int i2 = localList.size() % 10;
      ArrayList localArrayList2 = new ArrayList(i2);
      for (int i3 = 0; i3 < i2; i3++)
      {
        ids localids2 = new ids();
        localids2.a = ((qzz)localList.get(i3 + j * 10));
        localids2.b = localMap;
        localArrayList2.add(localids2.a());
      }
      if (Log.isLoggable("StreamViewManager", 3))
      {
        int i4 = paramlke.a.c;
        int i5 = i + j;
        new StringBuilder(56).append("Page added (").append(i4).append("): ").append(i5).append(", size: ").append(i2);
      }
      locallqp.a(localSparseArray, i + j, localArrayList2);
      localSparseArray.put(i + j, localArrayList2);
    }
    lqp.a(this.d, paramlke);
    a();
  }
  
  final void b(int paramInt)
  {
    int i = paramInt / 10;
    if ((i < this.e) || (i > this.b)) {}
    do
    {
      do
      {
        return;
        if (!this.d.v) {
          break;
        }
      } while (c(i));
      d(i);
      return;
    } while (d(i));
    c(i);
  }
  
  public final int size()
  {
    if (this.c) {
      return 1 + this.a;
    }
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqu
 * JD-Core Version:    0.7.0.1
 */