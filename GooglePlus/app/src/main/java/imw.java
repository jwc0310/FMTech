import android.accounts.AuthenticatorException;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

final class imw
{
  final gjj a;
  final String b;
  final ilf c;
  final boolean d;
  final gjc e;
  kcg f;
  boolean g;
  List<ilp> h;
  int i;
  boolean j;
  boolean k;
  private Map<ilp, ilq> m;
  private List<Exception> n = new ArrayList();
  private boolean o;
  
  imw(imt paramimt, gjj paramgjj, String paramString, ilf paramilf, boolean paramBoolean)
  {
    this.a = paramgjj;
    this.b = paramString;
    this.c = paramilf;
    this.d = paramBoolean;
    this.i = paramimt.d.b(paramgjj.a, paramString);
    if (this.i == -1) {}
    for (gjc localgjc = paramimt.d.a(paramgjj.a, paramString);; localgjc = paramimt.d.b(this.i))
    {
      this.e = localgjc;
      this.e.b("device_index", paramgjj.b);
      return;
    }
  }
  
  public final void a(ilx paramilx)
  {
    boolean bool1 = paramilx.a;
    if (!this.j) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      paramilx.a = (bool2 & bool1);
      paramilx.b |= this.o;
      paramilx.c |= this.k;
      paramilx.f.add(Integer.valueOf(this.i));
      paramilx.e.addAll(this.n);
      paramilx.d = this.i;
      return;
    }
  }
  
  final void a(Exception paramException)
  {
    Log.e("LoginManager", "Account update failed", paramException);
    this.n.add(paramException);
    this.j = true;
    int i1 = 1;
    Object localObject1 = paramException;
    fpy localfpy;
    Object localObject2;
    label77:
    int i2;
    if (localObject1 != null) {
      if ((localObject1 instanceof fpy))
      {
        localfpy = (fpy)localObject1;
        SparseArray localSparseArray = this.l.b;
        int i3 = this.i;
        if (localfpy.a == null)
        {
          localObject2 = null;
          localSparseArray.put(i3, localObject2);
          i2 = i1;
        }
      }
    }
    for (;;)
    {
      localObject1 = ((Throwable)localObject1).getCause();
      i1 = i2;
      break;
      localObject2 = new Intent(localfpy.a);
      break label77;
      if ((localObject1 instanceof AuthenticatorException))
      {
        i2 = 0;
        continue;
        this.o = (i1 | this.o);
        boolean bool1 = this.k;
        boolean bool2 = false;
        if (i1 == 0) {
          bool2 = true;
        }
        this.k = (bool1 | bool2);
      }
      else
      {
        i2 = i1;
      }
    }
  }
  
  final void a(List<Callable<Void>> paramList)
  {
    if (this.j) {}
    for (;;)
    {
      return;
      this.m = new IdentityHashMap();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator1 = this.h.iterator();
      while (localIterator1.hasNext())
      {
        ilp localilp = (ilp)localIterator1.next();
        ilq localilq2 = localilp.a(this.e, this.g);
        this.m.put(localilp, localilq2);
      }
      Iterator localIterator2 = this.m.values().iterator();
      while (localIterator2.hasNext())
      {
        ilq localilq1 = (ilq)localIterator2.next();
        if (localilq1 != null) {
          localilq1.a(this.e, this.f, localArrayList);
        }
      }
      Iterator localIterator3 = localArrayList.iterator();
      while (localIterator3.hasNext()) {
        paramList.add(new imx(this, (kbw)localIterator3.next()));
      }
    }
  }
  
  final boolean a()
  {
    if (this.j) {
      return true;
    }
    for (;;)
    {
      try
      {
        Iterator localIterator = this.m.keySet().iterator();
        if (!localIterator.hasNext()) {
          break label119;
        }
        ilp localilp = (ilp)localIterator.next();
        ilq localilq = (ilq)this.m.get(localilp);
        if (localilq == null) {
          break label131;
        }
        if (localilq.a(this.e) == ilr.b)
        {
          i1 = 1;
          if (i1 != 0) {
            continue;
          }
          this.h.remove(localilp);
          continue;
        }
        i1 = 0;
      }
      catch (IOException localIOException)
      {
        a(localIOException);
        return true;
      }
      continue;
      label119:
      boolean bool = this.h.isEmpty();
      return bool;
      label131:
      int i1 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     imw
 * JD-Core Version:    0.7.0.1
 */