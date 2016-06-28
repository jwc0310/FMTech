import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class agu
  extends ld
{
  final RecyclerView d;
  final ld e = new agv(this);
  
  public agu(RecyclerView paramRecyclerView)
  {
    this.d = paramRecyclerView;
  }
  
  public final void a(View paramView, pr parampr)
  {
    super.a(paramView, parampr);
    String str = RecyclerView.class.getName();
    pr.a.a(parampr.b, str);
    if ((!a()) && (this.d.h != null))
    {
      agh localagh = this.d.h;
      agl localagl = localagh.g.b;
      agr localagr = localagh.g.y;
      RecyclerView localRecyclerView1 = localagh.g;
      if (!nj.a.b(localRecyclerView1, -1))
      {
        RecyclerView localRecyclerView4 = localagh.g;
        if (!nj.a.a(localRecyclerView4, -1)) {}
      }
      else
      {
        pr.a.a(parampr.b, 8192);
        pr.a.f(parampr.b, true);
      }
      RecyclerView localRecyclerView2 = localagh.g;
      if (!nj.a.b(localRecyclerView2, 1))
      {
        RecyclerView localRecyclerView3 = localagh.g;
        if (!nj.a.a(localRecyclerView3, 1)) {}
      }
      else
      {
        pr.a.a(parampr.b, 4096);
        pr.a.f(parampr.b, true);
      }
      int i = localagh.a(localagl, localagr);
      int j = localagh.b(localagl, localagr);
      pz localpz = new pz(pr.a.a(i, j, false, 0));
      pr.a.b(parampr.b, ((pz)localpz).a);
    }
  }
  
  final boolean a()
  {
    RecyclerView localRecyclerView = this.d;
    return (!localRecyclerView.l) || (localRecyclerView.q) || (localRecyclerView.c.d());
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool2;
    if (super.a(paramView, paramInt, paramBundle)) {
      bool2 = true;
    }
    agh localagh2;
    int k;
    int j;
    do
    {
      RecyclerView localRecyclerView1;
      do
      {
        agh localagh1;
        do
        {
          boolean bool1;
          do
          {
            return bool2;
            bool1 = a();
            bool2 = false;
          } while (bool1);
          localagh1 = this.d.h;
          bool2 = false;
        } while (localagh1 == null);
        localagh2 = this.d.h;
        localRecyclerView1 = localagh2.g;
        bool2 = false;
      } while (localRecyclerView1 == null);
      switch (paramInt)
      {
      default: 
        k = 0;
        j = 0;
        if (j != 0) {
          break label135;
        }
        bool2 = false;
      }
    } while (k == 0);
    label135:
    localagh2.g.scrollBy(k, j);
    return true;
    RecyclerView localRecyclerView4 = localagh2.g;
    if (nj.a.b(localRecyclerView4, -1)) {}
    for (int i = -(localagh2.n() - localagh2.p() - localagh2.r());; i = 0)
    {
      RecyclerView localRecyclerView5 = localagh2.g;
      if (nj.a.a(localRecyclerView5, -1))
      {
        int n = -(localagh2.m() - localagh2.o() - localagh2.q());
        j = i;
        k = n;
        break;
        RecyclerView localRecyclerView2 = localagh2.g;
        if (!nj.a.b(localRecyclerView2, 1)) {
          break label335;
        }
      }
      label335:
      for (i = localagh2.n() - localagh2.p() - localagh2.r();; i = 0)
      {
        RecyclerView localRecyclerView3 = localagh2.g;
        if (nj.a.a(localRecyclerView3, 1))
        {
          int m = localagh2.m() - localagh2.o() - localagh2.q();
          j = i;
          k = m;
          break;
        }
        j = i;
        k = 0;
        break;
      }
    }
  }
  
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.c(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!a()))
    {
      RecyclerView localRecyclerView = (RecyclerView)paramView;
      if (localRecyclerView.h != null) {
        localRecyclerView.h.a(paramAccessibilityEvent);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agu
 * JD-Core Version:    0.7.0.1
 */