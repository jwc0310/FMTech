import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class aed
  extends agd
{
  ArrayList<ArrayList<agt>> a = new ArrayList();
  ArrayList<ArrayList<aen>> b = new ArrayList();
  ArrayList<ArrayList<aem>> c = new ArrayList();
  ArrayList<agt> d = new ArrayList();
  ArrayList<agt> e = new ArrayList();
  ArrayList<agt> f = new ArrayList();
  ArrayList<agt> g = new ArrayList();
  private ArrayList<agt> n = new ArrayList();
  private ArrayList<agt> o = new ArrayList();
  private ArrayList<aen> p = new ArrayList();
  private ArrayList<aem> q = new ArrayList();
  
  private final void a(aem paramaem)
  {
    if (paramaem.a != null) {
      a(paramaem, paramaem.a);
    }
    if (paramaem.b != null) {
      a(paramaem, paramaem.b);
    }
  }
  
  private static void a(List<agt> paramList)
  {
    for (int i = -1 + paramList.size(); i >= 0; i--)
    {
      View localView = ((agt)paramList.get(i)).a;
      nj.a.j(localView).a();
    }
  }
  
  private final void a(List<aem> paramList, agt paramagt)
  {
    for (int i = -1 + paramList.size(); i >= 0; i--)
    {
      aem localaem = (aem)paramList.get(i);
      if ((a(localaem, paramagt)) && (localaem.a == null) && (localaem.b == null)) {
        paramList.remove(localaem);
      }
    }
  }
  
  private final boolean a(aem paramaem, agt paramagt)
  {
    boolean bool1 = false;
    if (paramaem.b == paramagt) {
      paramaem.b = null;
    }
    for (;;)
    {
      View localView1 = paramagt.a;
      nj.a.c(localView1, 1.0F);
      View localView2 = paramagt.a;
      nj.a.a(localView2, 0.0F);
      View localView3 = paramagt.a;
      nj.a.b(localView3, 0.0F);
      a(paramagt, bool1);
      boolean bool2 = true;
      agt localagt;
      do
      {
        return bool2;
        localagt = paramaem.a;
        bool2 = false;
      } while (localagt != paramagt);
      paramaem.a = null;
      bool1 = true;
    }
  }
  
  public final void a()
  {
    int i;
    int j;
    label24:
    int k;
    if (!this.n.isEmpty())
    {
      i = 1;
      if (this.p.isEmpty()) {
        break label72;
      }
      j = 1;
      if (this.q.isEmpty()) {
        break label77;
      }
      k = 1;
      label36:
      if (this.o.isEmpty()) {
        break label82;
      }
    }
    label72:
    label77:
    label82:
    for (int m = 1;; m = 0)
    {
      if ((i != 0) || (j != 0) || (m != 0) || (k != 0)) {
        break label88;
      }
      return;
      i = 0;
      break;
      j = 0;
      break label24;
      k = 0;
      break label36;
    }
    label88:
    Iterator localIterator = this.n.iterator();
    while (localIterator.hasNext())
    {
      agt localagt = (agt)localIterator.next();
      View localView4 = localagt.a;
      ov localov = nj.a.j(localView4);
      this.f.add(localagt);
      localov.a(this.j).a(0.0F).a(new aeh(this, localagt, localov)).b();
    }
    this.n.clear();
    aee localaee;
    label278:
    aef localaef;
    label369:
    ArrayList localArrayList3;
    aeg localaeg;
    long l1;
    label444:
    long l2;
    if (j != 0)
    {
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.addAll(this.p);
      this.b.add(localArrayList1);
      this.p.clear();
      localaee = new aee(this, localArrayList1);
      if (i != 0)
      {
        View localView3 = ((aen)localArrayList1.get(0)).a.a;
        long l6 = this.j;
        nj.a.a(localView3, localaee, l6);
      }
    }
    else
    {
      if (k != 0)
      {
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.addAll(this.q);
        this.c.add(localArrayList2);
        this.q.clear();
        localaef = new aef(this, localArrayList2);
        if (i == 0) {
          break label513;
        }
        View localView2 = ((aem)localArrayList2.get(0)).a.a;
        long l5 = this.j;
        nj.a.a(localView2, localaef, l5);
      }
      if (m == 0) {
        break label521;
      }
      localArrayList3 = new ArrayList();
      localArrayList3.addAll(this.o);
      this.a.add(localArrayList3);
      this.o.clear();
      localaeg = new aeg(this, localArrayList3);
      if ((i == 0) && (j == 0) && (k == 0)) {
        break label541;
      }
      if (i == 0) {
        break label523;
      }
      l1 = this.j;
      if (j == 0) {
        break label529;
      }
      l2 = this.k;
      label454:
      if (k == 0) {
        break label535;
      }
    }
    label513:
    label521:
    label523:
    label529:
    label535:
    for (long l3 = this.l;; l3 = 0L)
    {
      long l4 = l1 + Math.max(l2, l3);
      View localView1 = ((agt)localArrayList3.get(0)).a;
      nj.a.a(localView1, localaeg, l4);
      return;
      localaee.run();
      break label278;
      localaef.run();
      break label369;
      break;
      l1 = 0L;
      break label444;
      l2 = 0L;
      break label454;
    }
    label541:
    localaeg.run();
  }
  
  public final boolean a(agt paramagt)
  {
    View localView = paramagt.a;
    au.a.a(localView);
    c(paramagt);
    this.n.add(paramagt);
    return true;
  }
  
  public final boolean a(agt paramagt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView1 = paramagt.a;
    float f1 = paramInt1;
    View localView2 = paramagt.a;
    int i = (int)(f1 + nj.a.e(localView2));
    float f2 = paramInt2;
    View localView3 = paramagt.a;
    int j = (int)(f2 + nj.a.f(localView3));
    View localView4 = paramagt.a;
    au.a.a(localView4);
    c(paramagt);
    int k = paramInt3 - i;
    int m = paramInt4 - j;
    if ((k == 0) && (m == 0))
    {
      e(paramagt);
      return false;
    }
    if (k != 0)
    {
      float f4 = -k;
      nj.a.a(localView1, f4);
    }
    if (m != 0)
    {
      float f3 = -m;
      nj.a.b(localView1, f3);
    }
    this.p.add(new aen(paramagt, i, j, paramInt3, paramInt4));
    return true;
  }
  
  public final boolean a(agt paramagt1, agt paramagt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView1 = paramagt1.a;
    float f1 = nj.a.e(localView1);
    View localView2 = paramagt1.a;
    float f2 = nj.a.f(localView2);
    View localView3 = paramagt1.a;
    float f3 = nj.a.b(localView3);
    View localView4 = paramagt1.a;
    au.a.a(localView4);
    c(paramagt1);
    int i = (int)(paramInt3 - paramInt1 - f1);
    int j = (int)(paramInt4 - paramInt2 - f2);
    View localView5 = paramagt1.a;
    nj.a.a(localView5, f1);
    View localView6 = paramagt1.a;
    nj.a.b(localView6, f2);
    View localView7 = paramagt1.a;
    nj.a.c(localView7, f3);
    if ((paramagt2 != null) && (paramagt2.a != null))
    {
      View localView8 = paramagt2.a;
      au.a.a(localView8);
      c(paramagt2);
      View localView9 = paramagt2.a;
      float f4 = -i;
      nj.a.a(localView9, f4);
      View localView10 = paramagt2.a;
      float f5 = -j;
      nj.a.b(localView10, f5);
      View localView11 = paramagt2.a;
      nj.a.c(localView11, 0.0F);
    }
    this.q.add(new aem(paramagt1, paramagt2, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public final boolean b()
  {
    return (!this.o.isEmpty()) || (!this.q.isEmpty()) || (!this.p.isEmpty()) || (!this.n.isEmpty()) || (!this.e.isEmpty()) || (!this.f.isEmpty()) || (!this.d.isEmpty()) || (!this.g.isEmpty()) || (!this.b.isEmpty()) || (!this.a.isEmpty()) || (!this.c.isEmpty());
  }
  
  public final boolean b(agt paramagt)
  {
    View localView1 = paramagt.a;
    au.a.a(localView1);
    c(paramagt);
    View localView2 = paramagt.a;
    nj.a.c(localView2, 0.0F);
    this.o.add(paramagt);
    return true;
  }
  
  public final void c()
  {
    for (int i = -1 + this.p.size(); i >= 0; i--)
    {
      aen localaen2 = (aen)this.p.get(i);
      View localView4 = localaen2.a.a;
      nj.a.b(localView4, 0.0F);
      nj.a.a(localView4, 0.0F);
      e(localaen2.a);
      this.p.remove(i);
    }
    for (int j = -1 + this.n.size(); j >= 0; j--)
    {
      d((agt)this.n.get(j));
      this.n.remove(j);
    }
    for (int k = -1 + this.o.size(); k >= 0; k--)
    {
      agt localagt2 = (agt)this.o.get(k);
      View localView3 = localagt2.a;
      nj.a.c(localView3, 1.0F);
      f(localagt2);
      this.o.remove(k);
    }
    for (int m = -1 + this.q.size(); m >= 0; m--) {
      a((aem)this.q.get(m));
    }
    this.q.clear();
    if (!b()) {
      return;
    }
    for (int i1 = -1 + this.b.size(); i1 >= 0; i1--)
    {
      ArrayList localArrayList3 = (ArrayList)this.b.get(i1);
      for (int i6 = -1 + localArrayList3.size(); i6 >= 0; i6--)
      {
        aen localaen1 = (aen)localArrayList3.get(i6);
        View localView2 = localaen1.a.a;
        nj.a.b(localView2, 0.0F);
        nj.a.a(localView2, 0.0F);
        e(localaen1.a);
        localArrayList3.remove(i6);
        if (localArrayList3.isEmpty()) {
          this.b.remove(localArrayList3);
        }
      }
    }
    for (int i2 = -1 + this.a.size(); i2 >= 0; i2--)
    {
      ArrayList localArrayList2 = (ArrayList)this.a.get(i2);
      for (int i5 = -1 + localArrayList2.size(); i5 >= 0; i5--)
      {
        agt localagt1 = (agt)localArrayList2.get(i5);
        View localView1 = localagt1.a;
        nj.a.c(localView1, 1.0F);
        f(localagt1);
        localArrayList2.remove(i5);
        if (localArrayList2.isEmpty()) {
          this.a.remove(localArrayList2);
        }
      }
    }
    for (int i3 = -1 + this.c.size(); i3 >= 0; i3--)
    {
      ArrayList localArrayList1 = (ArrayList)this.c.get(i3);
      for (int i4 = -1 + localArrayList1.size(); i4 >= 0; i4--)
      {
        a((aem)localArrayList1.get(i4));
        if (localArrayList1.isEmpty()) {
          this.c.remove(localArrayList1);
        }
      }
    }
    a(this.f);
    a(this.e);
    a(this.d);
    a(this.g);
    d();
  }
  
  public final void c(agt paramagt)
  {
    View localView = paramagt.a;
    nj.a.j(localView).a();
    for (int i = -1 + this.p.size(); i >= 0; i--) {
      if (((aen)this.p.get(i)).a == paramagt)
      {
        nj.a.b(localView, 0.0F);
        nj.a.a(localView, 0.0F);
        e(paramagt);
        this.p.remove(i);
      }
    }
    a(this.q, paramagt);
    if (this.n.remove(paramagt))
    {
      nj.a.c(localView, 1.0F);
      d(paramagt);
    }
    if (this.o.remove(paramagt))
    {
      nj.a.c(localView, 1.0F);
      f(paramagt);
    }
    for (int j = -1 + this.c.size(); j >= 0; j--)
    {
      ArrayList localArrayList3 = (ArrayList)this.c.get(j);
      a(localArrayList3, paramagt);
      if (localArrayList3.isEmpty()) {
        this.c.remove(j);
      }
    }
    int k = -1 + this.b.size();
    if (k >= 0)
    {
      ArrayList localArrayList2 = (ArrayList)this.b.get(k);
      for (int i1 = -1 + localArrayList2.size();; i1--)
      {
        if (i1 >= 0)
        {
          if (((aen)localArrayList2.get(i1)).a != paramagt) {
            continue;
          }
          nj.a.b(localView, 0.0F);
          nj.a.a(localView, 0.0F);
          e(paramagt);
          localArrayList2.remove(i1);
          if (localArrayList2.isEmpty()) {
            this.b.remove(k);
          }
        }
        k--;
        break;
      }
    }
    for (int m = -1 + this.a.size(); m >= 0; m--)
    {
      ArrayList localArrayList1 = (ArrayList)this.a.get(m);
      if (localArrayList1.remove(paramagt))
      {
        nj.a.c(localView, 1.0F);
        f(paramagt);
        if (localArrayList1.isEmpty()) {
          this.a.remove(m);
        }
      }
    }
    this.f.remove(paramagt);
    this.d.remove(paramagt);
    this.g.remove(paramagt);
    this.e.remove(paramagt);
    if (!b()) {
      d();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aed
 * JD-Core Version:    0.7.0.1
 */