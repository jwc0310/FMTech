import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class liw
  extends agd
{
  long a = 0L;
  ArrayList<agt> b = new ArrayList();
  final List<agt> c = new ArrayList();
  private long d = 0L;
  private List<agt> e = new ArrayList();
  private List<agt> f = new ArrayList();
  private final List<agt> g = new ArrayList();
  private int n;
  private int o;
  private final RecyclerView p;
  private final Runnable q = new lix(this);
  private Comparator<agt> r = new liy(this);
  
  public liw(RecyclerView paramRecyclerView)
  {
    this.p = paramRecyclerView;
    this.i = 400L;
    this.j = 350L;
  }
  
  public final void a()
  {
    int i;
    int k;
    label60:
    ov localov;
    int m;
    if (!this.f.isEmpty())
    {
      i = 1;
      if (i == 0) {
        break label293;
      }
      Collections.sort(this.f, this.r);
      Collections.reverse(this.f);
      this.n = -1;
      this.d = 0L;
      int j = this.f.size();
      k = 0;
      if (k >= j) {
        break label284;
      }
      agt localagt = (agt)this.f.get(k);
      View localView2 = localagt.a;
      this.g.add(localagt);
      localov = nj.a.j(localView2);
      localov.a(new liz(this, localagt, localov));
      m = this.p.h.d(localView2);
      if (this.n == -1)
      {
        this.n = m;
        if (this.n >= 0) {
          break label273;
        }
        this.n = this.o;
      }
    }
    for (;;)
    {
      if (m >= 0)
      {
        if (Log.isLoggable("FlyInFlyOutAnimator", 3))
        {
          int i1 = this.n;
          new StringBuilder(38).append("Animating remove from 0 to ").append(i1);
        }
        localov.b(this.d).a(this.j).a(new AccelerateDecelerateInterpolator()).c(this.n).b();
        this.d = (50L + this.d);
      }
      k++;
      break label60;
      i = 0;
      break;
      label273:
      this.o = this.n;
    }
    label284:
    this.f.clear();
    label293:
    if (!this.e.isEmpty())
    {
      Collections.sort(this.e, this.r);
      this.a = 0L;
      this.b.addAll(this.e);
      this.e.clear();
      if (i != 0)
      {
        View localView1 = ((agt)this.b.get(0)).a;
        Runnable localRunnable = this.q;
        long l = this.j;
        nj.a.a(localView1, localRunnable, l);
      }
    }
    else
    {
      return;
    }
    this.q.run();
  }
  
  public final boolean a(agt paramagt)
  {
    c(paramagt);
    this.f.add(paramagt);
    return true;
  }
  
  public final boolean a(agt paramagt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return false;
  }
  
  public final boolean a(agt paramagt1, agt paramagt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return false;
  }
  
  public final boolean b()
  {
    return (this.e.isEmpty()) && (this.f.isEmpty()) && (this.b.isEmpty()) && (this.c.isEmpty()) && (this.g.isEmpty());
  }
  
  public final boolean b(agt paramagt)
  {
    c(paramagt);
    View localView = paramagt.a;
    int i = this.p.h.c(localView);
    float f1 = this.p.getHeight() - i;
    nj.a.b(localView, f1);
    this.e.add(paramagt);
    return true;
  }
  
  public final void c()
  {
    if (!b()) {
      return;
    }
    for (int i = -1 + this.f.size(); i >= 0; i--)
    {
      agt localagt4 = (agt)this.f.get(i);
      d(localagt4);
      this.f.remove(localagt4);
    }
    for (int j = -1 + this.e.size(); j >= 0; j--)
    {
      agt localagt3 = (agt)this.e.get(j);
      f(localagt3);
      this.e.remove(localagt3);
    }
    for (int k = -1 + this.g.size(); k >= 0; k--)
    {
      agt localagt2 = (agt)this.g.get(k);
      View localView2 = localagt2.a;
      nj.a.j(localView2).a();
      d(localagt2);
      this.g.remove(localagt2);
    }
    for (int m = -1 + this.c.size(); m >= 0; m--)
    {
      agt localagt1 = (agt)this.c.get(m);
      View localView1 = localagt1.a;
      nj.a.j(localView1).a();
      f(localagt1);
      this.c.remove(localagt1);
    }
    this.b.clear();
    d();
  }
  
  public final void c(agt paramagt)
  {
    View localView = paramagt.a;
    nj.a.j(localView).a();
    if (this.f.remove(paramagt)) {
      d(paramagt);
    }
    if (this.e.remove(paramagt)) {
      f(paramagt);
    }
    if (!b()) {
      d();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     liw
 * JD-Core Version:    0.7.0.1
 */