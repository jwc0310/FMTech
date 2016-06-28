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

public final class hit
  extends mca
  implements cw<Cursor>, dat, gpq, gxs, gzi, hgz, hhm, lvy
{
  private int Z;
  private hhr a;
  private int aa = 0;
  private final gpk ab = new gpk(this, this.bp, this);
  private gzj ac;
  private hhn ad;
  private hgv ae;
  private hho af;
  private final hwq ag = new hwq(this.bp);
  private final lvz ah = new lvz(this, this.bp);
  private int b;
  private String c;
  private String d;
  
  public hit()
  {
    new gxj(this.bp, (byte)0);
  }
  
  private final void a(boolean paramBoolean)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.a.a() == 0)
    {
      hwq localhwq2 = this.ag;
      if (paramBoolean) {}
      for (hwt localhwt2 = hwt.a; localhwt2 == null; localhwt2 = hwt.c) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      if (!paramBoolean)
      {
        lvz locallvz = this.ah;
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
      this.ab.a();
      return;
      hwq localhwq1 = this.ag;
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
    return aaw.ow;
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
      hlh.a(this.bn, this.ac, this.b, this.d, true, this.c);
    }
    lvz locallvz = this.ah;
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
    this.ah.b();
    y();
  }
  
  public final boolean O_()
  {
    return this.aa == 1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(ehr.aT, paramViewGroup, false);
    RecyclerView localRecyclerView = (RecyclerView)localView.findViewById(ehr.aE);
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    aep localaep = new aep(this.bn, i);
    localaep.a = new hhs(this.a, i);
    localRecyclerView.a(localaep);
    localRecyclerView.a(this.a);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(ehr.aM)).a = localRecyclerView;
    k().a(0, null, this);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return new hmf(this.bn, this.b, hmm.b, this.d);
    }
    return new hmf(this.bn, this.b, hmm.a, this.d);
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt > 0) && (!TextUtils.isEmpty(this.c)) && (paramInt >= -6 + this.a.a())) {
      hlh.a(this.bn, this.ac, this.b, this.d, false, this.c);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.Z = localBundle.getInt("refreshMenuId");
    this.d = localBundle.getString("clx_gaiaId");
    hht localhht = new hht(this.bn);
    localhht.a = this;
    this.a = localhht.a();
    hwq localhwq1 = this.ag;
    int i = aaw.oq;
    localhwq1.d = null;
    localhwq1.c = i;
    localhwq1.e();
    hwq localhwq2 = this.ag;
    int j = aaw.oo;
    localhwq2.f = null;
    localhwq2.e = j;
    localhwq2.e();
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.a.a(null);
  }
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.Z);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, int paramInt)
  {
    this.ae.a(paramString, paramInt, this.af.d(this.d));
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    hhr localhhr;
    if ("GetCollexionsFromCircles".equals(paramString))
    {
      this.c = paramhae.a().getString("continuation_token");
      localhhr = this.a;
      if (TextUtils.isEmpty(this.c)) {
        break label59;
      }
    }
    label59:
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
    if (paramMenuItem.getItemId() == this.Z)
    {
      y();
      return true;
    }
    return false;
  }
  
  public final void b(String paramString1, String paramString2)
  {
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).a(this.b, paramString1, paramString2);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void b(tp paramtp) {}
  
  public final void c(int paramInt)
  {
    int i = 1;
    if (this.aa == paramInt) {
      return;
    }
    this.aa = paramInt;
    if (paramInt == 2)
    {
      mbf localmbf = this.bn;
      int k = aaw.oH;
      Toast.makeText(localmbf, g().getString(k), 0).show();
    }
    if (this.aa == i) {}
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
    this.ae = new hjl(this, this.bp);
    mbb localmbb = this.bo;
    localmbb.a(hgz.class, this);
    localmbb.a(gxs.class, this);
    localmbb.a(hgv.class, this.ae);
    localmbb.a(hgw.class, this.ae);
    this.b = ((git)this.bo.a(git.class)).c();
    this.ac = ((gzj)this.bo.a(gzj.class));
    this.ac.a.add(this);
    this.ad = ((hhn)this.bo.a(hhn.class));
    this.af = ((hho)this.bo.a(hho.class));
  }
  
  public final void m()
  {
    super.m();
    hhn localhhn = this.ad;
    mbf localmbf = this.bn;
    String str = this.d;
    localhhn.a(((hho)mbb.a(localmbf, hho.class)).d(str), this);
  }
  
  public final void n()
  {
    super.n();
    hhn localhhn = this.ad;
    mbf localmbf = this.bn;
    String str = this.d;
    localhhn.b(((hho)mbb.a(localmbf, hho.class)).d(str), this);
  }
  
  public final gxq v()
  {
    return new kvk(pjn.t, this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hit
 * JD-Core Version:    0.7.0.1
 */