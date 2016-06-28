import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;

public final class hiy
  extends mca
  implements cw<Cursor>, dat, gpq, gxs, gzi, hgz, hhm, lvy
{
  private int Z = 0;
  private hhr a;
  private int aa = -1;
  private boolean ab;
  private RecyclerView ac;
  private final gpk ad = new gpk(this, this.bp, this);
  private gzj ae;
  private hhn af;
  private hgv ag;
  private hho ah;
  private aep ai;
  private final lvz aj = new lvz(this, this.bp);
  private final hwq ak = new hwq(this.bp);
  private int b;
  private String c;
  private int d;
  
  public hiy()
  {
    new gxj(this.bp, (byte)0);
  }
  
  public static hiy a(int paramInt, boolean paramBoolean)
  {
    hiy localhiy = new hiy();
    Bundle localBundle = new Bundle();
    localBundle.putInt("refreshMenuId", paramInt);
    localBundle.putBoolean("clx_enable_search", paramBoolean);
    localhiy.f(localBundle);
    return localhiy;
  }
  
  private final void a(boolean paramBoolean)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.a.a() == 0)
    {
      hwq localhwq2 = this.ak;
      if (paramBoolean) {}
      for (hwt localhwt2 = hwt.a; localhwt2 == null; localhwt2 = hwt.c) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      if (!paramBoolean)
      {
        lvz locallvz = this.aj;
        if (locallvz.a != null)
        {
          localSwipeRefreshLayoutWithUpScroll = locallvz.a;
          if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
            break label144;
          }
          localSwipeRefreshLayoutWithUpScroll.a(false);
        }
      }
    }
    for (;;)
    {
      this.ad.a();
      return;
      hwq localhwq1 = this.ak;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      break;
      label144:
      if (localSwipeRefreshLayoutWithUpScroll.m != null)
      {
        if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
        if (!localSwipeRefreshLayoutWithUpScroll.m.O_())
        {
          Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
          long l = localSwipeRefreshLayoutWithUpScroll.o;
          efj.m().postDelayed(localRunnable, l);
        }
      }
    }
  }
  
  public static int x()
  {
    return aaw.oj;
  }
  
  private final void y()
  {
    if (f() != null)
    {
      this.c = null;
      this.a.a(null);
      hhr localhhr = this.a;
      localhhr.d = false;
      localhhr.a.b();
      hli.a(this.bn, this.ae, this.b, true, this.c);
    }
    lvz locallvz = this.aj;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
  }
  
  public final void A_()
  {
    this.aj.b();
    y();
  }
  
  public final boolean O_()
  {
    return this.Z == 1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(ehr.aT, paramViewGroup, false);
    this.ac = ((RecyclerView)localView.findViewById(ehr.aE));
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    this.ai = new aep(this.bn, i);
    this.ai.a = new hhs(this.a, i);
    this.ac.a(this.ai);
    this.ac.a(this.a);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(ehr.aM)).a = this.ac;
    k().a(0, null, this);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new hmi(this.bn, this.b, hmk.a);
    }
    return new hmi(this.bn, this.b, hmk.b);
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt > 0) && (!TextUtils.isEmpty(this.c)) && (paramInt >= -6 + this.a.a())) {
      hli.a(this.bn, this.ae, this.b, false, this.c);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.d = localBundle.getInt("refreshMenuId");
    hht localhht = new hht(this.bn);
    localhht.a = this;
    this.a = localhht.a();
    hwq localhwq = this.ak;
    int i = aaw.oi;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    int j = aaw.oo;
    localhwq.f = null;
    localhwq.e = j;
    localhwq.e();
    if (paramBundle != null) {
      this.aa = paramBundle.getInt("restorePosition", -1);
    }
    this.ab = localBundle.getBoolean("featured_clx_enable_open_detail_view", true);
    if (localBundle.getBoolean("clx_enable_search", true)) {
      new hos(ehr.aD, this, this.bp);
    }
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.a.a(null);
  }
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.d);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, int paramInt)
  {
    this.ag.a(paramString, paramInt, this.ah.b());
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (!"GetFeaturedCollexionsTask".equals(paramString)) {
      return;
    }
    this.c = paramhae.a().getString("continuation_token");
    hhr localhhr = this.a;
    if (!TextUtils.isEmpty(this.c)) {}
    for (boolean bool = true;; bool = false)
    {
      localhhr.d = bool;
      localhhr.a.b();
      return;
    }
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.d)
    {
      y();
      return true;
    }
    return false;
  }
  
  public final void b(String paramString1, String paramString2)
  {
    if (!this.ab) {
      return;
    }
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).a(this.b, paramString1, paramString2);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void b(tp paramtp) {}
  
  public final void c(int paramInt)
  {
    int i = 1;
    if (this.Z == paramInt) {
      return;
    }
    this.Z = paramInt;
    if (paramInt == 2)
    {
      bp localbp = f();
      int k = aaw.oH;
      Toast.makeText(localbp, g().getString(k), 0).show();
    }
    if (this.Z == i) {}
    for (;;)
    {
      a(i);
      return;
      int j = 0;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ag = new hjl(this, this.bp);
    mbb localmbb = this.bo;
    localmbb.a(hgz.class, this);
    localmbb.a(gxs.class, this);
    localmbb.a(hgv.class, this.ag);
    localmbb.a(hgw.class, this.ag);
    this.b = ((git)this.bo.a(git.class)).c();
    this.ae = ((gzj)this.bo.a(gzj.class));
    this.ae.a.add(this);
    this.af = ((hhn)this.bo.a(hhn.class));
    this.ah = ((hho)this.bo.a(hho.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ai != null) {
      paramBundle.putInt("restorePosition", this.ai.i());
    }
  }
  
  public final void m()
  {
    super.m();
    this.af.a(((hho)mbb.a(this.bn, hho.class)).b(), this);
  }
  
  public final void n()
  {
    super.n();
    this.af.b(((hho)mbb.a(this.bn, hho.class)).b(), this);
  }
  
  public final gxq v()
  {
    return new gxq(pjn.D);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hiy
 * JD-Core Version:    0.7.0.1
 */