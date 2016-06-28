import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;

public final class hiz
  extends mca
  implements cw<Cursor>, djg, gpq, gxs, hgz, hhm, lvy
{
  private boolean Z;
  int a;
  private int aa;
  private int ab = 0;
  private final gpk ac = new gpk(this, this.bp, this);
  private gzj ad;
  private hhn ae;
  private View af;
  private final lvz ag = new lvz(this, this.bp);
  private final hwq ah = new hwq(this.bp);
  git b;
  hpo c;
  private hhr d;
  
  public hiz()
  {
    new gxj(this.bp, (byte)0);
    hph localhph = new hph(this.bp, false);
    this.bo.a(hhp.class, localhph);
    ((hph)localhph);
  }
  
  private final void a(int paramInt)
  {
    if (!this.Z) {
      return;
    }
    this.af.setVisibility(paramInt);
  }
  
  private final void a(boolean paramBoolean)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.d.a() == 0) {
      if (paramBoolean)
      {
        hwq localhwq3 = this.ah;
        hwt localhwt3 = hwt.a;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
        a(0);
        if (!paramBoolean)
        {
          lvz locallvz = this.ag;
          if (locallvz.a != null)
          {
            localSwipeRefreshLayoutWithUpScroll = locallvz.a;
            if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
              break label189;
            }
            localSwipeRefreshLayoutWithUpScroll.a(false);
          }
        }
      }
    }
    for (;;)
    {
      this.ac.a();
      return;
      hwq localhwq2 = this.ah;
      hwt localhwt2 = hwt.c;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      break;
      hwq localhwq1 = this.ah;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      a(8);
      break;
      label189:
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
    return aaw.ox;
  }
  
  private final void y()
  {
    if (f() != null)
    {
      this.d.a(null);
      this.d.a(false);
      hhr localhhr = this.d;
      localhhr.d = false;
      localhhr.a.b();
      a(8);
      hlj.a(this.bn, this.ad, this.a);
    }
    lvz locallvz = this.ag;
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
    this.ag.b();
    y();
  }
  
  public final boolean O_()
  {
    return this.ab == 1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(ehr.aT, paramViewGroup, false);
    this.af = localView.findViewById(ehr.aI);
    RecyclerView localRecyclerView = (RecyclerView)localView.findViewById(ehr.aE);
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    aep localaep = new aep(this.bn, i);
    localRecyclerView.a(localaep);
    localaep.a = new hhs(this.d, i);
    localRecyclerView.a(this.d);
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
    return new hmn(this.bn, this.a);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.aa = localBundle.getInt("refreshMenuId");
    this.Z = localBundle.getBoolean("enableViewMyFollowedCollexions", false);
    hht localhht = new hht(this.bn);
    localhht.b = this;
    this.d = localhht.a();
    hhr localhhr = this.d;
    localhhr.c = true;
    localhhr.a.b();
    hwq localhwq = this.ah;
    int i = aaw.oz;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    int j = aaw.oo;
    localhwq.f = null;
    localhwq.e = j;
    localhwq.e();
    if (localBundle.getBoolean("clx_enable_search", true)) {
      new hos(ehr.aD, this, this.bp);
    }
  }
  
  public final void a(Button paramButton)
  {
    paramButton.setText(aaw.ot);
    efj.a(paramButton, new gxq(pjn.aj));
    paramButton.setOnClickListener(new gxn(new hja(this)));
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.d.a(null);
  }
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.aa);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, int paramInt)
  {
    throw new UnsupportedOperationException("Following your own collection is not supported");
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.aa)
    {
      y();
      return true;
    }
    return false;
  }
  
  public final void b(String paramString1, String paramString2)
  {
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).a(this.a, paramString1, paramString2);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void b(tp paramtp) {}
  
  public final void c(int paramInt)
  {
    int i = 1;
    if (this.ab == paramInt) {
      return;
    }
    this.ab = paramInt;
    if (paramInt == 2)
    {
      mbf localmbf = this.bn;
      int k = aaw.oH;
      Toast.makeText(localmbf, g().getString(k), 0).show();
    }
    if (this.ab == i) {}
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
    mbb localmbb = this.bo;
    localmbb.a(hgz.class, this);
    localmbb.a(gxs.class, this);
    this.b = ((git)this.bo.a(git.class));
    this.a = this.b.c();
    this.ad = ((gzj)this.bo.a(gzj.class));
    this.c = ((hpo)this.bo.a(hpo.class));
    this.ae = ((hhn)this.bo.a(hhn.class));
  }
  
  public final void m()
  {
    super.m();
    this.ae.a(((hho)mbb.a(this.bn, hho.class)).d(), this);
  }
  
  public final void n()
  {
    super.n();
    this.ae.b(((hho)mbb.a(this.bn, hho.class)).d(), this);
  }
  
  public final gxq v()
  {
    return new gxq(pjn.O);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hiz
 * JD-Core Version:    0.7.0.1
 */