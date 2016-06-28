import android.content.Intent;
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
import java.util.ArrayList;

public final class lcu
  extends mca
  implements cw<Cursor>, djg, gpq, gzi, leb, led, lfm, lvy
{
  private lef Z;
  int a;
  private gzj aa;
  private boolean ab;
  private RecyclerView ac;
  private aep ad;
  private View ae;
  private int af;
  private int ag;
  private boolean ah;
  private final lvz b;
  private final hwq c;
  private final lfk d;
  
  public lcu()
  {
    new gpk(this, this.bp, this);
    new gxl(pjo.aY).a(this.bo);
    new gxj(this.bp, (byte)0);
    this.b = new lvz(this, this.bp);
    hwq localhwq = new hwq(this.bp);
    int i = do.A;
    localhwq.f = null;
    localhwq.e = i;
    localhwq.e();
    int j = do.E;
    localhwq.d = null;
    localhwq.c = j;
    localhwq.e();
    this.c = localhwq;
    this.d = new lfk(this, this.bp, this);
    this.af = 0;
  }
  
  private final void a(boolean paramBoolean)
  {
    if (f() != null)
    {
      if (this.Z.a() == 0) {
        this.c.a(hwt.a);
      }
      kzj localkzj = new kzj(this.bn, this.a, false);
      localkzj.f = "fetch_newer_squares";
      boolean bool = false;
      if (!paramBoolean) {
        bool = true;
      }
      localkzj.a = bool;
      this.ab = true;
      this.aa.b(localkzj);
    }
  }
  
  public static int v()
  {
    return do.K;
  }
  
  public final void A_()
  {
    this.b.b();
    this.af = 0;
    a(true);
  }
  
  public final boolean O_()
  {
    return this.ab;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Xl, paramViewGroup, false);
    this.ae = localView.findViewById(az.I);
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    this.ad = new aep(this.bn, i);
    this.ad.a = new leg(this.Z, i);
    this.ac = ((RecyclerView)localView.findViewById(az.O));
    this.ac.a(this.ad);
    this.ac.a(this.Z);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(az.L)).a = this.ac;
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    this.ab = true;
    return new kzp(this.bn, this.a, lej.a).a(4);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.ag = localBundle.getInt("refreshMenuId");
    this.ah = localBundle.getBoolean("showMoreButton", false);
    this.Z = new lef(this.bn, this, this);
    if (paramBundle != null) {
      this.af = paramBundle.getInt("restorePosition", -1);
    }
  }
  
  public final void a(Button paramButton)
  {
    paramButton.setOnClickListener(new lcv(this));
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.Z.a(null);
  }
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.ag);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if ("fetch_newer_squares".equals(paramString))
    {
      if (hae.a(paramhae)) {
        Toast.makeText(this.bn, this.bn.getString(do.H), 0).show();
      }
      this.ab = false;
      lvz locallvz = this.b;
      if (locallvz.a != null)
      {
        localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
          break label83;
        }
        localSwipeRefreshLayoutWithUpScroll.a(false);
      }
    }
    for (;;)
    {
      paramhaa.c = false;
      return;
      label83:
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
  
  public final void a(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(this.a, paramString1, null);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    this.Z.a.b();
  }
  
  public final void a(kxg paramkxg, String paramString, int paramInt)
  {
    this.d.a(paramkxg, paramString, paramInt);
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.ag)
    {
      lvz locallvz = this.b;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
      this.af = 0;
      a(true);
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class)).c();
    gzj localgzj = (gzj)mbb.a(f(), gzj.class);
    localgzj.a.add(this);
    this.aa = localgzj;
    this.bo.a(lfy.class, this.d);
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    k().a(0, null, this);
    if ((paramBundle == null) && (!this.aa.a("fetch_newer_squares"))) {
      a(false);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    int i;
    if (this.ad != null)
    {
      i = this.ad.i();
      if (i < 0) {
        break label38;
      }
    }
    for (;;)
    {
      paramBundle.putInt("restorePosition", i);
      return;
      i = -1;
      break;
      label38:
      i = -1;
    }
  }
  
  public final void x()
  {
    a(((kxy)this.bo.a(kxy.class)).a(this.a));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcu
 * JD-Core Version:    0.7.0.1
 */