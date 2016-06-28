import android.util.Log;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public final class cmg<T, Y>
  implements AbsListView.OnScrollListener
{
  private final int a;
  private int b = -1;
  private int c;
  private final int d;
  private cmi<T> e;
  private cmh<T, Y> f;
  private Queue<List<Y>> g = new LinkedBlockingQueue();
  private int h;
  private boolean i = false;
  
  public cmg(int paramInt, cmi<T> paramcmi, cmh<T, Y> paramcmh)
  {
    this.e = paramcmi;
    this.f = paramcmh;
    this.d = paramInt;
    this.a = (paramInt + 1);
  }
  
  public final void a()
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      List localList = (List)localIterator.next();
      this.f.b(localList);
    }
    this.g.clear();
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = this.i;
    int j;
    if (paramInt1 > this.h)
    {
      this.i = true;
      j = paramInt1 + paramInt2;
    }
    for (;;)
    {
      if (bool1 != this.i) {
        a();
      }
      boolean bool2;
      int k;
      if (j != -1)
      {
        bool2 = this.i;
        if (!bool2) {
          break label283;
        }
        k = Math.max(j, this.b);
      }
      for (int m = Math.min(j + this.d, this.e.getCount());; m = Math.min(j, this.c))
      {
        if (Log.isLoggable("Preloader", 2)) {
          new StringBuilder(76).append("preload first=").append(j).append(" increasing=").append(bool2).append(" start=").append(k).append(" end=").append(m);
        }
        this.b = m;
        this.c = k;
        if ((k != 0) || (m != 0))
        {
          List localList1 = this.e.a(k, m);
          if (!bool2) {
            Collections.reverse(localList1);
          }
          List localList2 = this.f.a(localList1);
          this.g.offer(localList2);
          if (this.g.size() > this.a)
          {
            List localList3 = (List)this.g.poll();
            this.f.b(localList3);
          }
        }
        this.h = paramInt1;
        return;
        if (paramInt1 >= this.h) {
          break label310;
        }
        this.i = false;
        j = paramInt1;
        break;
        label283:
        k = Math.max(0, j - this.d);
      }
      label310:
      j = -1;
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmg
 * JD-Core Version:    0.7.0.1
 */