import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
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
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;

public final class hjd
  extends mca
  implements cw<Cursor>, gpq, gxs, gzi, hgz, lvy
{
  private boolean Z;
  private hhr a;
  private boolean aa;
  private int ab;
  private jyw ac;
  private git ad;
  private hho ae;
  private final gpk af = new gpk(this, this.bp, this);
  private hgv ag;
  private final lvz ah = new lvz(this, this.bp);
  private final hwq ai = new hwq(this.bp);
  private gzj b;
  private int c;
  private String d;
  
  public hjd()
  {
    new gxj(this.bp, (byte)0);
    hph localhph = new hph(this.bp, false);
    this.bo.a(hhp.class, localhph);
    ((hph)localhph);
  }
  
  private final void a(boolean paramBoolean)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.a.a() == 0) {
      if (paramBoolean)
      {
        hwq localhwq3 = this.ai;
        hwt localhwt3 = hwt.a;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
        if (!paramBoolean)
        {
          lvz locallvz = this.ah;
          if (locallvz.a != null)
          {
            localSwipeRefreshLayoutWithUpScroll = locallvz.a;
            if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
              break label178;
            }
            localSwipeRefreshLayoutWithUpScroll.a(false);
          }
        }
      }
    }
    for (;;)
    {
      this.af.a();
      return;
      hwq localhwq2 = this.ai;
      hwt localhwt2 = hwt.c;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      break;
      hwq localhwq1 = this.ai;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      break;
      label178:
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
  
  private final void x()
  {
    if (f() != null)
    {
      this.a.a(null);
      gzf localgzf = this.ac.b(this.c, this.d, this.Z);
      this.aa = true;
      this.b.b(localgzf);
      lvz locallvz = this.ah;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
    }
  }
  
  public final void A_()
  {
    this.ah.b();
    x();
  }
  
  public final boolean O_()
  {
    return this.aa;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(ehr.aT, paramViewGroup, false);
    RecyclerView localRecyclerView = (RecyclerView)localView.findViewById(ehr.aE);
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    aep localaep = new aep(this.bn, i);
    localRecyclerView.a(localaep);
    localaep.a = new hhs(this.a, i);
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
    }
    this.aa = true;
    a(true);
    if (this.Z) {
      return new hmo(this.bn, this.c);
    }
    return new hmt(this.bn, this.c, this.d);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.ab = localBundle.getInt("refreshMenuId");
    this.c = this.ad.c();
    this.d = localBundle.getString("clx_gaiaId");
    this.Z = TextUtils.equals(this.d, this.ad.f().b("gaia_id"));
    this.a = new hht(this.bn).a();
    hwq localhwq = this.ai;
    int i = aaw.oo;
    localhwq.f = null;
    localhwq.e = i;
    localhwq.e();
    localhwq.d = this.bn.getString(aaw.oy);
    localhwq.c = 0;
    localhwq.e();
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
    gqe localgqe = (gqe)paramgpr.a(this.ab);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, int paramInt)
  {
    hgv localhgv = this.ag;
    if (this.Z) {}
    for (Uri localUri = this.ae.e();; localUri = this.ae.e(this.d))
    {
      localhgv.a(paramString, paramInt, localUri);
      return;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (this.ac.a().equals(paramString))
    {
      if (hae.a(paramhae)) {
        break label35;
      }
      k().b(0, null, this);
    }
    label35:
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    do
    {
      do
      {
        lvz locallvz;
        do
        {
          return;
          this.aa = false;
          locallvz = this.ah;
        } while (locallvz.a == null);
        localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if (!localSwipeRefreshLayoutWithUpScroll.isEnabled())
        {
          localSwipeRefreshLayoutWithUpScroll.a(false);
          return;
        }
      } while (localSwipeRefreshLayoutWithUpScroll.m == null);
      if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    } while (localSwipeRefreshLayoutWithUpScroll.m.O_());
    Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
    long l = localSwipeRefreshLayoutWithUpScroll.o;
    efj.m().postDelayed(localRunnable, l);
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.ab)
    {
      x();
      return true;
    }
    return false;
  }
  
  public final void b(String paramString1, String paramString2)
  {
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).a(this.c, paramString1, paramString2);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ag = new hjl(this, this.bp);
    mbb localmbb = this.bo;
    localmbb.a(hgz.class, this);
    localmbb.a(gxs.class, this);
    localmbb.a(hgv.class, this.ag);
    localmbb.a(hgw.class, this.ag);
    this.ad = ((git)this.bo.a(git.class));
    this.ac = ((jyw)this.bo.a(jyw.class));
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    localgzj.a.add(this);
    this.b = localgzj;
    this.ae = ((hho)this.bo.a(hho.class));
  }
  
  public final gxq v()
  {
    return new gxq(pjn.ai);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjd
 * JD-Core Version:    0.7.0.1
 */