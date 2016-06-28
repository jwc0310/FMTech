import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class imt
  implements giw, ilb
{
  final SparseArray<Intent> b = new SparseArray();
  final hgs c;
  final giz d;
  final kbu e;
  final ima f;
  ilo g;
  private final Context h;
  private final List<ilc> i = new ArrayList();
  private final Object j = new Object();
  private final gkr k;
  private final ExecutorService l;
  private gjm m;
  private List<ilp> n;
  
  public imt(Context paramContext)
  {
    this(paramContext, Executors.newCachedThreadPool(new imu()));
  }
  
  private imt(Context paramContext, ExecutorService paramExecutorService)
  {
    this.h = paramContext;
    this.l = paramExecutorService;
    this.c = ((hgs)mbb.a(paramContext, hgs.class));
    this.m = ((gjm)mbb.a(paramContext, gjm.class));
    this.k = ((gkr)mbb.a(paramContext, gkr.class));
    this.d = ((giz)mbb.a(paramContext, giz.class));
    this.e = ((kbu)mbb.a(paramContext, kbu.class));
    this.n = mbb.c(paramContext, ilp.class);
    this.g = ((ilo)mbb.b(paramContext, ilo.class));
    this.f = ((ima)mbb.a(paramContext, ima.class));
  }
  
  private final boolean a(int paramInt, ild paramild)
  {
    long l1;
    if (paramInt != -1)
    {
      gjb localgjb = this.d.a(paramInt);
      l1 = localgjb.a("LoginManager.last_updated", 0L);
      if (localgjb.c("logged_out")) {
        break label75;
      }
      if (!c(paramInt)) {
        break label48;
      }
    }
    label48:
    while ((!paramild.a) && (this.c.a() - l1 >= paramild.b)) {
      return true;
    }
    label75:
    return false;
  }
  
  static boolean a(gjc paramgjc, List<ilh> paramList)
  {
    boolean bool = paramgjc.c("logged_in");
    int i1;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      i1 = 1;
      if (localIterator.hasNext())
      {
        ilh localilh = (ilh)localIterator.next();
        if ((i1 != 0) && (localilh.a(paramgjc))) {}
        for (int i2 = 1;; i2 = 0)
        {
          i1 = i2;
          break;
        }
      }
    }
    else
    {
      i1 = 1;
    }
    if (i1 == 0) {
      return false;
    }
    if (!bool)
    {
      if ((paramgjc.c("logged_out")) && (!paramgjc.c("has_irrecoverable_error"))) {
        paramgjc.c();
      }
      paramgjc.b("logged_in", true).b("logged_out", false);
    }
    return true;
  }
  
  static ild b()
  {
    ile localile = new ile();
    localile.a = true;
    localile.b = 0L;
    localile.c = false;
    return new ild(localile);
  }
  
  private final void b(List<imw> paramList)
  {
    efj.l();
    int i1 = 0;
    this.b.clear();
    for (;;)
    {
      int i2;
      ArrayList localArrayList1;
      synchronized (this.j)
      {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = ils.a;
        arrayOfInt[1] = ils.b;
        i2 = 0;
        if (i2 >= 2) {
          break label438;
        }
        int i3 = arrayOfInt[i2];
        localArrayList1 = new ArrayList();
        Iterator localIterator1 = this.n.iterator();
        if (localIterator1.hasNext())
        {
          ilp localilp = (ilp)localIterator1.next();
          if (localilp.a() != i3) {
            continue;
          }
          localArrayList1.add(localilp);
        }
      }
      Iterator localIterator2 = paramList.iterator();
      imw localimw2;
      while (localIterator2.hasNext())
      {
        localimw2 = (imw)localIterator2.next();
        if (!localimw2.j) {
          if (localimw2.a.c)
          {
            localimw2.f = null;
            localimw2.g = true;
            localimw2.h = new ArrayList();
          }
          else
          {
            localimw2.f = new kcg(localimw2.a.a, localimw2.b, null, localimw2.d, null);
            if (localimw2.l.c(localimw2.i)) {
              break label456;
            }
            if (localimw2.d) {
              break label462;
            }
            break label456;
          }
        }
      }
      Object localObject3;
      int i4;
      int i5;
      ArrayList localArrayList3;
      for (;;)
      {
        localimw2.g = bool;
        localimw2.h = new ArrayList(localArrayList1);
        break;
        localObject3 = new ArrayList(paramList);
        i4 = 0;
        i5 = i1;
        if ((i4 >= 3) || (((List)localObject3).isEmpty())) {
          break label502;
        }
        ArrayList localArrayList2 = new ArrayList();
        Iterator localIterator3 = ((List)localObject3).iterator();
        while (localIterator3.hasNext()) {
          ((imw)localIterator3.next()).a(localArrayList2);
        }
        try
        {
          this.l.invokeAll(localArrayList2);
          localArrayList3 = new ArrayList();
          Iterator localIterator4 = ((List)localObject3).iterator();
          while (localIterator4.hasNext())
          {
            imw localimw1 = (imw)localIterator4.next();
            if (!localimw1.a()) {
              localArrayList3.add(localimw1);
            }
          }
          label438:
          if (i1 != 0) {
            Thread.currentThread().interrupt();
          }
          c(paramList);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          label456:
          label462:
          i6 = 1;
          localObject4 = localObject3;
          i4++;
          i5 = i6;
          localObject3 = localObject4;
        }
        boolean bool = true;
        continue;
        bool = false;
      }
      for (;;)
      {
        break;
        Object localObject4 = localArrayList3;
        int i6 = i5;
      }
      label502:
      i2++;
      i1 = i5;
    }
  }
  
  private final void c(List<imw> paramList)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    if (i1 < 3)
    {
      localArrayList = new ArrayList(paramList.size());
      localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(new imv(this, (imw)localIterator.next()));
      }
      try
      {
        this.l.invokeAll(localArrayList);
        i4 = i2;
        i5 = 1;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          i4 = 1;
          i5 = i3;
        }
        i1++;
        i3 = i5;
        i2 = i4;
      }
      if (i5 == 0) {}
    }
    while (i2 == 0)
    {
      ArrayList localArrayList;
      Iterator localIterator;
      int i4;
      int i5;
      return;
      break;
    }
    Thread.currentThread().interrupt();
  }
  
  private final void e(int paramInt)
  {
    List localList = mbb.c(this.h, ilt.class);
    int i1 = localList.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((ilt)localList.get(i2)).a(paramInt);
    }
  }
  
  final ilx a(String paramString1, String paramString2, ilf paramilf, boolean paramBoolean)
  {
    ilx localilx = new ilx();
    try
    {
      gjj localgjj = this.m.a(paramString1);
      if (localgjj != null)
      {
        imw localimw = new imw(this, localgjj, paramString2, paramilf, paramBoolean);
        b(Collections.singletonList(localimw));
        localilx.a = true;
        localimw.a(localilx);
      }
      return localilx;
    }
    catch (gjo localgjo)
    {
      localilx.e = Collections.singletonList(localgjo);
    }
    return localilx;
  }
  
  final List<ilh> a(List<Class<? extends ilh>> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Class localClass = (Class)localIterator.next();
      localArrayList.add((ilh)mbb.a(this.h, localClass));
    }
    return localArrayList;
  }
  
  public final void a(int paramInt)
  {
    b(paramInt);
  }
  
  public final void a(bw parambw, ilf paramilf, String paramString)
  {
    imm localimm = imm.a(parambw);
    if (localimm.ab)
    {
      localimm.a(true);
      localimm.a.a(localimm.b, localimm.c, -1);
    }
    localimm.ab = true;
    localimm.b = paramilf;
    localimm.c = paramString;
    localimm.d = null;
    localimm.Z = null;
    localimm.aa = -1;
    localimm.v();
  }
  
  public final void a(ilc paramilc)
  {
    this.i.add(paramilc);
  }
  
  public final void a(ild paramild)
  {
    b(paramild);
  }
  
  final void a(ilf paramilf, String paramString, int paramInt)
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext()) {
      ((ilc)localIterator.next()).a(paramilf, paramString, paramInt);
    }
  }
  
  public final void a(String paramString, ild paramild)
  {
    int i1 = this.d.a(paramString);
    if ((i1 != -1) && (this.d.a(i1).c("logged_out"))) {
      throw new ikm("refreshAccount called for a logged out account");
    }
    if (a(i1, paramild)) {
      a(paramString, null, null, paramild.c);
    }
  }
  
  final boolean a()
  {
    ild localild = b();
    HashSet localHashSet = new HashSet();
    for (;;)
    {
      int i2;
      try
      {
        gjj[] arrayOfgjj = this.m.a();
        int i1 = arrayOfgjj.length;
        i2 = 0;
        if (i2 >= i1) {
          break;
        }
        String str = arrayOfgjj[i2].a;
        localHashSet.add(str);
        int i4 = this.d.a(str);
        if (a(i4, localild))
        {
          new StringBuilder(68).append("Account ").append(i4).append(" is not ready for login because it needs refresh.");
          return false;
        }
      }
      catch (gjo localgjo)
      {
        if (Log.isLoggable("LoginManager", 6)) {
          Log.e("LoginManager", "Failed to obtain device accounts when checking if accounts are ready for login", localgjo);
        }
        return false;
      }
      i2++;
    }
    Iterator localIterator = this.d.a().iterator();
    while (localIterator.hasNext())
    {
      int i3 = ((Integer)localIterator.next()).intValue();
      if (!localHashSet.contains(this.d.a(i3).b("account_name")))
      {
        new StringBuilder(87).append("Account ").append(i3).append(" is not ready for login because account store has a removed account.");
        return false;
      }
    }
    return true;
  }
  
  public final boolean a(ilf paramilf, int paramInt)
  {
    boolean bool = paramilf.d;
    if (!this.d.c(paramInt)) {}
    while ((b(paramilf, paramInt) != null) || ((bool) && (!this.d.a(paramInt).c("logged_in")))) {
      return false;
    }
    return true;
  }
  
  final ilh b(ilf paramilf, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    gjb localgjb = this.d.a(paramInt);
    if (this.g != null) {
      this.g.a(localgjb.b("account_name"), localArrayList);
    }
    localArrayList.addAll(paramilf.u);
    Iterator localIterator = a(localArrayList).iterator();
    while (localIterator.hasNext())
    {
      ilh localilh = (ilh)localIterator.next();
      if (!localilh.a(localgjb)) {
        return localilh;
      }
    }
    return null;
  }
  
  final ilx b(ild paramild)
  {
    this.k.a();
    for (;;)
    {
      int i2;
      ilx localilx;
      synchronized (this.j)
      {
        efj.l();
        gjj[] arrayOfgjj = this.m.a();
        ArrayList localArrayList = new ArrayList(arrayOfgjj.length);
        int i1 = arrayOfgjj.length;
        i2 = 0;
        if (i2 < i1)
        {
          gjj localgjj = arrayOfgjj[i2];
          String str = localgjj.a;
          int i3 = this.d.a(str);
          boolean bool1 = a(i3, paramild);
          new StringBuilder(40).append("Account ").append(i3).append(" needs refresh: ").append(bool1);
          if (!bool1) {
            break label271;
          }
          localArrayList.add(new imw(this, localgjj, null, null, paramild.c));
          break label271;
        }
        localilx = new ilx();
        b(localArrayList);
        localilx.a = true;
        Iterator localIterator = localArrayList.iterator();
        if (localIterator.hasNext())
        {
          ((imw)localIterator.next()).a(localilx);
          int i4 = localilx.d;
          boolean bool2 = localilx.a;
          new StringBuilder(45).append("Account update for ").append(i4).append(" success: ").append(bool2);
        }
      }
      return localilx;
      label271:
      i2++;
    }
  }
  
  public final void b(int paramInt)
  {
    if (!this.d.d(paramInt)) {
      return;
    }
    synchronized (this.j)
    {
      d(paramInt);
      return;
    }
  }
  
  public final void b(ilc paramilc)
  {
    this.i.remove(paramilc);
  }
  
  final boolean c(int paramInt)
  {
    if (paramInt == -1) {}
    gjb localgjb;
    do
    {
      return true;
      localgjb = this.d.a(paramInt);
    } while (!TextUtils.equals(this.f.a(), localgjb.b("LoginManager.build_version")));
    return false;
  }
  
  final void d(int paramInt)
  {
    if ((!this.d.d(paramInt)) && (this.d.e(paramInt))) {
      return;
    }
    gjb localgjb1 = this.d.a(paramInt);
    if (!localgjb1.c("is_managed_account"))
    {
      String str = localgjb1.b("account_name");
      List localList = this.d.a();
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        Integer localInteger = (Integer)localList.get(i2);
        gjb localgjb2 = this.d.a(localInteger.intValue());
        if ((localgjb2.a()) && (localgjb2.c("is_managed_account")) && (localgjb2.b("account_name").equals(str))) {
          d(localInteger.intValue());
        }
      }
    }
    this.d.b(paramInt).b("logged_out", true).b("logged_in", false).d();
    e(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     imt
 * JD-Core Version:    0.7.0.1
 */