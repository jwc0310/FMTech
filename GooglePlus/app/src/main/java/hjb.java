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
import android.widget.Button;
import android.widget.Toast;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;

public final class hjb
  extends mca
  implements cw<Cursor>, dat, djg, gpq, gxs, gzi, hgz, hhm, lvy
{
  private String Z;
  int a;
  private boolean aa;
  private int ab;
  private int ac = 0;
  private final gpk ad = new gpk(this, this.bp, this);
  private gzj ae;
  private hhn af;
  private hgv ag;
  private hho ah;
  private View ai;
  private final lvz aj = new lvz(this, this.bp);
  private final hwq ak = new hwq(this.bp);
  hpo b;
  private hhr c;
  private String d;
  
  public hjb()
  {
    new gxj(this.bp, (byte)0);
  }
  
  public static hjb a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    hjb localhjb = new hjb();
    Bundle localBundle = new Bundle();
    localBundle.putInt("refreshMenuId", paramInt);
    localBundle.putString("clx_gaiaId", paramString);
    localBundle.putBoolean("disableViewCollexionsFromCircles", paramBoolean1);
    localBundle.putBoolean("clx_enable_search", paramBoolean2);
    localhjb.f(localBundle);
    return localhjb;
  }
  
  private final void a(boolean paramBoolean)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.c.a() == 0) {
      if (paramBoolean)
      {
        hwq localhwq3 = this.ak;
        hwt localhwt3 = hwt.a;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
        if (!paramBoolean)
        {
          lvz locallvz = this.aj;
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
      this.ad.a();
      return;
      hwq localhwq2 = this.ak;
      hwt localhwt2 = hwt.c;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      b(0);
      break;
      hwq localhwq1 = this.ak;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      b(8);
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
  
  private final void b(int paramInt)
  {
    if (this.aa) {
      return;
    }
    this.ai.setVisibility(paramInt);
  }
  
  public static int x()
  {
    return aaw.ov;
  }
  
  private final void y()
  {
    if (f() != null)
    {
      this.d = null;
      this.c.a(null);
      this.c.a(false);
      hhr localhhr = this.c;
      localhhr.d = false;
      localhhr.a.b();
      b(8);
      hlk.a(this.bn, this.ae, true, this.a, this.Z, this.d);
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
    return this.ac == 1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(ehr.aT, paramViewGroup, false);
    this.ai = localView.findViewById(ehr.aI);
    if (!this.aa) {
      a((Button)this.ai.findViewById(ehr.aH));
    }
    RecyclerView localRecyclerView = (RecyclerView)localView.findViewById(ehr.aE);
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    aep localaep = new aep(this.bn, i);
    localRecyclerView.a(localaep);
    localaep.a = new hhs(this.c, i);
    localRecyclerView.a(this.c);
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
      return new hmr(this.bn, this.a, this.Z, hmm.b);
    }
    return new hmr(this.bn, this.a, this.Z, hmm.a);
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt > 0) && (!TextUtils.isEmpty(this.d)) && (paramInt >= -6 + this.c.a())) {
      hlk.a(this.bn, this.ae, false, this.a, this.Z, this.d);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.ab = localBundle.getInt("refreshMenuId");
    this.Z = localBundle.getString("clx_gaiaId");
    this.aa = localBundle.getBoolean("disableViewCollexionsFromCircles", false);
    hht localhht = new hht(this.bn);
    localhht.a = this;
    localhht.b = this;
    this.c = localhht.a();
    hwq localhwq1 = this.ak;
    int i = aaw.ou;
    localhwq1.d = null;
    localhwq1.c = i;
    localhwq1.e();
    hwq localhwq2 = this.ak;
    int j = aaw.oo;
    localhwq2.f = null;
    localhwq2.e = j;
    localhwq2.e();
    if (localBundle.getBoolean("clx_enable_search", true)) {
      new hos(ehr.aD, this, this.bp);
    }
  }
  
  public final void a(Button paramButton)
  {
    efj.a(paramButton, new gxq(pjn.M));
    paramButton.setOnClickListener(new gxn(new hjc(this)));
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.ab);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, int paramInt)
  {
    this.ag.a(paramString, paramInt, this.ah.f(this.Z));
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (!"getuserfollowedclx".equals(paramString)) {
      return;
    }
    this.d = paramhae.a().getString("continuation_token");
    hhr localhhr = this.c;
    if (!TextUtils.isEmpty(this.d)) {}
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
    if (paramMenuItem.getItemId() == this.ab)
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
    if (this.ac == paramInt) {
      return;
    }
    this.ac = paramInt;
    if (paramInt == 2)
    {
      bp localbp = f();
      int k = aaw.oH;
      Toast.makeText(localbp, g().getString(k), 0).show();
    }
    if (this.ac == i) {}
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
    this.a = ((git)this.bo.a(git.class)).c();
    this.ae = ((gzj)this.bo.a(gzj.class));
    this.ae.a.add(this);
    this.b = ((hpo)this.bo.a(hpo.class));
    this.af = ((hhn)this.bo.a(hhn.class));
    this.ah = ((hho)this.bo.a(hho.class));
  }
  
  public final void m()
  {
    super.m();
    hhn localhhn = this.af;
    mbf localmbf = this.bn;
    String str = this.Z;
    localhhn.a(((hho)mbb.a(localmbf, hho.class)).f(str), this);
  }
  
  public final void n()
  {
    super.n();
    hhn localhhn = this.af;
    mbf localmbf = this.bn;
    String str = this.Z;
    localhhn.b(((hho)mbb.a(localmbf, hho.class)).f(str), this);
  }
  
  public final gxq v()
  {
    return new kvk(pjn.ah, this.Z);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjb
 * JD-Core Version:    0.7.0.1
 */