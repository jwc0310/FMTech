import android.content.Intent;
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
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;

public final class lda
  extends mca
  implements cw<Cursor>, gpq, gzi, led, lfm, lvy
{
  private gzj Z;
  private final lvz a;
  private int aa;
  private String ab;
  private boolean ac;
  private boolean ad;
  private RecyclerView ae;
  private aep af;
  private int ag;
  private int ah;
  private jyw ai;
  private git aj;
  private final hwq b;
  private final lfk c;
  private lef d;
  
  public lda()
  {
    new gpk(this, this.bp, this);
    new gxl(pjo.aS).a(this.bo);
    new gxj(this.bp, (byte)0);
    this.a = new lvz(this, this.bp);
    this.b = new hwq(this.bp);
    this.c = new lfk(this, this.bp, this);
    this.ag = 0;
  }
  
  private final void v()
  {
    this.ag = 0;
    if (f() != null)
    {
      gzf localgzf = this.ai.b(this.aa, this.ab, this.ac);
      this.ad = true;
      this.Z.b(localgzf);
    }
  }
  
  public final void A_()
  {
    this.a.b();
    v();
  }
  
  public final boolean O_()
  {
    return this.ad;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Xl, paramViewGroup, false);
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    this.af = new aep(this.bn, i);
    this.af.a = new leg(this.d, i);
    this.ae = ((RecyclerView)localView.findViewById(az.O));
    this.ae.a(this.af);
    this.ae.a(this.d);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(az.L)).a = this.ae;
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    this.ad = true;
    if (this.ac) {
      return new kzn(this.bn, this.aa);
    }
    return new kzt(this.bn, this.aa, this.ab);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    if (localBundle != null) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "Can't create this fragment without arguments. Use UserVisibleSquaresFragment.Builder to create fragment instance");
      this.ah = localBundle.getInt("refreshMenuId");
      this.ab = localBundle.getString("gaiaId");
      this.ac = TextUtils.equals(this.ab, this.aj.f().b("gaia_id"));
      this.d = new lef(this.bn, this, null);
      hwq localhwq = this.b;
      int i = do.A;
      localhwq.f = null;
      localhwq.e = i;
      localhwq.e();
      localhwq.d = this.bn.getString(do.N);
      localhwq.c = 0;
      localhwq.e();
      if (paramBundle != null) {
        this.ag = paramBundle.getInt("restorePosition", -1);
      }
      return;
    }
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.d.a(null);
  }
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.ah);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (this.ai.a().equals(paramString))
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
          this.ad = false;
          locallvz = this.a;
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
  
  public final void a(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(this.aa, paramString1, null);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    this.d.a.b();
  }
  
  public final void a(kxg paramkxg, String paramString, int paramInt)
  {
    this.c.a(paramkxg, paramString, paramInt);
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.ah)
    {
      lvz locallvz = this.a;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
      v();
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aj = ((git)this.bo.a(git.class));
    this.aa = this.aj.c();
    mbb localmbb = this.bo;
    localmbb.a(lfy.class, this.c);
    localmbb.a(lgb.class, new lgb());
    this.ai = ((jyw)this.bo.a(jyw.class));
    gzj localgzj = (gzj)mbb.a(f(), gzj.class);
    localgzj.a.add(this);
    this.Z = localgzj;
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    k().a(0, null, this);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.af != null) {}
    for (int i = this.af.i();; i = -1)
    {
      paramBundle.putInt("restorePosition", i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lda
 * JD-Core Version:    0.7.0.1
 */