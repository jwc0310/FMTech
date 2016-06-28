import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class lqp
  implements mec, mes, mew, mfa, mfd
{
  private final pde A;
  private final agj B;
  private int C;
  private final lqy D = new lqy(this);
  private final oxr<pfk<lke>> E = new lqq(this);
  public final lkg a;
  public final oxz b;
  final List<idr> c;
  final idr d;
  final bp e;
  public final icp f;
  lqu g;
  SwipeRefreshLayout h;
  RecyclerView i;
  owx<idr, View> j;
  List<rac> k;
  public llf l;
  public int m;
  public int n;
  public int o;
  int p = -1;
  int q;
  final lqw r = new lqw(this);
  final lqx s = new lqx(this);
  public final oxr<Boolean> t = new lqr(this);
  lqv u;
  boolean v = true;
  llb w;
  public boolean x = false;
  private final otk y;
  private final idt z;
  
  lqp(lkg paramlkg, pde parampde, idt paramidt, oxz paramoxz, icp paramicp, otk paramotk, bp parambp, mek parammek, List<idr> paramList, Set<rac> paramSet, idr paramidr)
  {
    parammek.a(this);
    this.e = parambp;
    this.A = parampde;
    this.a = paramlkg;
    this.b = paramoxz;
    this.y = paramotk;
    this.z = paramidt;
    this.k = new ArrayList(paramSet);
    this.c = paramList;
    this.d = paramidr;
    this.f = paramicp;
    this.B = new lqs(this, parampde);
  }
  
  final kx a(int paramInt1, int paramInt2)
  {
    int i1;
    if (paramInt1 % 10 == 0)
    {
      i1 = paramInt1;
      if (this.y.a() == -1) {
        break label112;
      }
      lqu locallqu = this.g;
      if (1 + paramInt1 / 10 > locallqu.b) {
        break label106;
      }
    }
    label106:
    for (int i2 = 1;; i2 = 0)
    {
      if (i2 == 0) {
        break label112;
      }
      if (Log.isLoggable("StreamViewManager", 3)) {
        new StringBuilder(29).append("Loading new page: ").append(i1);
      }
      this.r.a(i1, paramInt2);
      return new kx(i1, paramInt2);
      i1 = 10 * (paramInt1 / 10);
      break;
    }
    label112:
    return null;
  }
  
  final void a()
  {
    if (this.y.a() != -1)
    {
      lqy locallqy = this.D;
      locallqy.c.b.a(locallqy.c.a.a(locallqy.c.l, locallqy.c.k), locallqy);
      locallqy.a = true;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.p = paramBundle.getInt("STREAM_VIEW_ID", -1);
      this.q = paramBundle.getInt("CURRENT_PAGE", 0);
      this.C = paramBundle.getInt("STREAM_PAGE");
    }
    if (this.p != -1)
    {
      int i1 = 10 * (this.q / 10);
      this.r.a(i1, 10);
      int i2 = paramBundle.getInt("WINDOW_OFFSET");
      int i3 = paramBundle.getInt("WINDOW_SIZE");
      this.s.a(i2, i3);
      lqy locallqy2 = this.D;
      if (!locallqy2.a)
      {
        locallqy2.a = true;
        locallqy2.c.b.a(locallqy2.c.a.a(locallqy2.c.l, locallqy2.c.k), oxx.c, locallqy2);
      }
      lqy locallqy3 = this.D;
      locallqy3.a = false;
      locallqy3.b = false;
      this.r.a = false;
    }
    for (;;)
    {
      this.w = new llb(this.a, -1, 0, 0);
      this.b.a(this.w, this.E);
      this.b.a(new lky(this.a), this.t);
      return;
      if (this.h != null) {
        this.h.a(true);
      }
      if (this.x)
      {
        a();
      }
      else if (this.y.a() != -1)
      {
        lqy locallqy1 = this.D;
        if (!locallqy1.a)
        {
          locallqy1.a = true;
          locallqy1.c.b.a(locallqy1.c.a.a(locallqy1.c.l, locallqy1.c.k), oxx.c, locallqy1);
        }
      }
    }
  }
  
  final void a(SparseArray<List<idr>> paramSparseArray, int paramInt, List<idr> paramList)
  {
    if ((List)paramSparseArray.get(paramInt) == this.c) {
      this.j.a(paramInt * 10, paramList.size());
    }
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    this.h = ((SwipeRefreshLayout)paramView.findViewById(aau.Dm));
    if (this.h != null) {
      this.h.a(new pdi(this.A, "Refresh", new lqt(this)));
    }
    this.i = ((RecyclerView)paramView.findViewById(aau.Dl));
    if (this.i == null) {
      throw new NullPointerException();
    }
    this.i.k = true;
    this.i.a(new ahp(this.n, 1));
    pfh localpfh = new pfh(this);
    owy localowy = new owy();
    localowy.a = new idu(this.z);
    localowy.b = localpfh;
    aau.b(localowy.a, "No ViewBinder");
    this.j = new owx(localowy.a, localowy.b, new owz());
    agi localagi = new agi(-2, -2);
    if (this.n > 1) {
      localagi.setMargins(this.o, this.m, this.o, this.m);
    }
    for (;;)
    {
      liw localliw = new liw(this.i);
      RecyclerView localRecyclerView1 = this.i;
      if (localRecyclerView1.w != null)
      {
        localRecyclerView1.w.c();
        localRecyclerView1.w.h = null;
      }
      localRecyclerView1.w = localliw;
      if (localRecyclerView1.w != null) {
        localRecyclerView1.w.h = localRecyclerView1.C;
      }
      owx localowx = this.j;
      aau.b(localagi, "Layout Params cannot be null.");
      localowx.c = localagi;
      this.i.a(this.j);
      RecyclerView localRecyclerView2 = this.i;
      agj localagj = this.B;
      if (localRecyclerView2.z == null) {
        localRecyclerView2.z = new ArrayList();
      }
      localRecyclerView2.z.add(localagj);
      if ((this.p != -1) && (paramBundle != null))
      {
        bz localbz = this.e.b.a.d;
        this.u = ((lqv)localbz.a("STREAM_CACHE_TAG"));
        if (this.u == null)
        {
          this.u = new lqv();
          localbz.a().a(this.u, "STREAM_CACHE_TAG").b();
        }
        this.g = new lqu(this, this.u);
        this.g.a(this.q, false);
        lqu locallqu = this.g;
        locallqu.a = this.C;
        locallqu.a();
        this.g.c = paramBundle.getBoolean("STREAM_SPINNER_CARD");
        this.j.a(this.g);
      }
      return;
      localagi.setMargins(0, this.m, 0, this.m);
    }
  }
  
  final void b(int paramInt1, int paramInt2)
  {
    if (this.y.a() != -1)
    {
      int i1 = Math.min(this.g.a, paramInt1 + paramInt2);
      if ((i1 - paramInt1 > 0) && (!this.s.a))
      {
        if (Log.isLoggable("StreamViewManager", 3))
        {
          int i2 = i1 - paramInt1;
          new StringBuilder(45).append("Loading pages: ").append(paramInt1).append(", size: ").append(i2);
        }
        this.s.a(paramInt1, i1 - paramInt1);
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putInt("STREAM_VIEW_ID", this.p);
    if (this.g != null)
    {
      paramBundle.putInt("STREAM_PAGE", this.g.a);
      paramBundle.putBoolean("STREAM_SPINNER_CARD", this.g.c);
    }
    paramBundle.putInt("CURRENT_PAGE", this.q);
    paramBundle.putInt("WINDOW_OFFSET", this.s.b);
    paramBundle.putInt("WINDOW_SIZE", this.s.c);
  }
  
  public final void c()
  {
    if (this.h != null) {
      this.h.a(false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqp
 * JD-Core Version:    0.7.0.1
 */