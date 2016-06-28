import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gpm
  implements gpl, mbo, met, mev, mex, mfb, mfd
{
  final tt a;
  public ArrayList<gpq> b = new ArrayList();
  ArrayList<gpq> c = new ArrayList();
  SparseArray<gpi> d = new SparseArray();
  private int e;
  private boolean f;
  private Handler g = new Handler();
  private Runnable h = new gpn(this);
  private ArrayList<gpq> i = new ArrayList();
  private rgq<Set<gpj>> j;
  private gpo k;
  
  gpm(Activity paramActivity, mek parammek, rgq<Set<gpj>> paramrgq)
  {
    this.a = ((tt)paramActivity);
    parammek.a(this);
    this.j = paramrgq;
  }
  
  public gpm(tt paramtt, mek parammek, int paramInt)
  {
    this.a = paramtt;
    this.e = paramInt;
    parammek.a(this);
  }
  
  private final void a(Collection<gpj> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      gpj localgpj = (gpj)localIterator.next();
      int m = localgpj.a();
      if (this.d.get(m) != null)
      {
        String str = String.valueOf(localgpj.getClass());
        throw new IllegalStateException(30 + String.valueOf(str).length() + "Multiple ActionBarController: " + str);
      }
      gpi localgpi = localgpj.a(this.a);
      this.d.put(m, localgpi);
    }
  }
  
  public final gpm a(mbb parammbb)
  {
    parammbb.a(gpl.class, this);
    return this;
  }
  
  public final void a()
  {
    this.f = true;
    c();
  }
  
  public final void a(int paramInt)
  {
    this.e = paramInt;
    a((Collection)this.j.a());
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    a(parammbb.c(gpj.class));
  }
  
  public final boolean a(Menu paramMenu)
  {
    this.a.getMenuInflater().inflate(this.e, paramMenu);
    this.k = new gpo(this, paramMenu);
    gpo localgpo = this.k;
    for (int m = 0; m < localgpo.c.d.size(); m++) {
      ((gpi)localgpo.c.d.valueAt(m)).a();
    }
    for (int n = 0; n < localgpo.a.size(); n++) {
      localgpo.a.getItem(n).setVisible(false);
    }
    int i2;
    for (int i1 = -1 + localgpo.c.c.size();; i1--)
    {
      i2 = 0;
      if (i1 < 0) {
        break;
      }
      ((gpq)localgpo.c.c.get(i1)).a(localgpo);
    }
    while (i2 < localgpo.c.d.size())
    {
      ((gpi)localgpo.c.d.valueAt(i2)).a(localgpo.a);
      i2++;
    }
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    for (int m = -1 + this.c.size(); m >= 0; m--) {
      if (((gpq)this.c.get(m)).a(paramMenuItem)) {
        return true;
      }
    }
    List localList = (List)this.k.b.get(paramMenuItem.getItemId());
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        if (((gqh)localIterator.next()).a(this.a)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final void b()
  {
    this.g.removeCallbacks(this.h);
    this.g.post(this.h);
  }
  
  public final void c()
  {
    if (!this.f) {
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    if (!this.i.isEmpty()) {
      localArrayList1.add(this.i.get(-1 + this.i.size()));
    }
    tp localtp;
    ArrayList localArrayList2;
    int i1;
    for (;;)
    {
      localtp = this.a.e().a();
      localArrayList2 = this.c;
      for (int m = 0;; m++)
      {
        int n = localArrayList2.size();
        i1 = 0;
        if (m >= n) {
          break;
        }
        gpq localgpq2 = (gpq)localArrayList2.get(m);
        if (!localArrayList1.contains(localgpq2)) {
          localgpq2.b(localtp);
        }
      }
      localArrayList1.addAll(this.b);
    }
    while (i1 < localArrayList1.size())
    {
      gpq localgpq1 = (gpq)localArrayList1.get(i1);
      if (!localArrayList2.contains(localgpq1)) {
        localgpq1.a(localtp);
      }
      i1++;
    }
    this.c = localArrayList1;
    b();
  }
  
  public final void c(gpq paramgpq)
  {
    this.i.add(paramgpq);
    c();
  }
  
  public final void d(gpq paramgpq)
  {
    this.i.remove(paramgpq);
    c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpm
 * JD-Core Version:    0.7.0.1
 */