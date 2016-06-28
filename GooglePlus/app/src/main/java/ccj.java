import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.apps.plus.phone.NewEventActivity;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.ArrayList;
import java.util.List;

public final class ccj
  extends mca
  implements View.OnClickListener, cw<Cursor>, gpq, gxv, gzi, lvy, lxx
{
  private gzj Z;
  ColumnGridView a;
  private final lvz aa = new lvz(this, this.bp);
  private dap ab;
  private boolean ac;
  private boolean ad;
  private boolean ae;
  private cyq af;
  private final hwq ag;
  private final gpk b = new gpk(this, this.bp, this);
  private git c;
  private final lvi d = new lvi();
  
  public ccj()
  {
    gxl localgxl = new gxl(new gxq(pjq.a));
    this.bo.a(gxs.class, localgxl);
    hwq localhwq = new hwq(this.bp);
    int i = aau.lC;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    int j = aau.jn;
    localhwq.f = null;
    localhwq.e = j;
    localhwq.e();
    this.ag = localhwq;
  }
  
  private final void a(int paramInt)
  {
    this.N.findViewById(aaw.ce).setVisibility(paramInt);
    this.N.findViewById(aaw.cf).setVisibility(paramInt);
  }
  
  private final void v()
  {
    this.b.a();
    lvz locallvz = this.aa;
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (locallvz.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
        break label37;
      }
      localSwipeRefreshLayoutWithUpScroll.a(false);
    }
    label37:
    do
    {
      do
      {
        return;
      } while (localSwipeRefreshLayoutWithUpScroll.m == null);
      if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    } while (localSwipeRefreshLayoutWithUpScroll.m.O_());
    Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
    long l = localSwipeRefreshLayoutWithUpScroll.o;
    efj.m().postDelayed(localRunnable, l);
  }
  
  private final void x()
  {
    lvz locallvz = this.aa;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
    a(8);
    y();
  }
  
  private final void y()
  {
    bp localbp = f();
    if ((localbp != null) && (!this.Z.a("fetch_newer")))
    {
      if ((!this.ae) && (z()))
      {
        hwq localhwq = this.ag;
        hwt localhwt = hwt.a;
        if (localhwt == null) {
          throw new NullPointerException();
        }
        localhwq.g = ((hwt)localhwt);
        localhwq.a();
      }
      bna localbna = new bna(localbp, this.c.c());
      localbna.f = "fetch_newer";
      this.Z.b(localbna);
      v();
    }
  }
  
  private final boolean z()
  {
    return (this.ab == null) || (this.ab.isEmpty());
  }
  
  public final void A_()
  {
    this.aa.b();
    x();
  }
  
  public final boolean O_()
  {
    return this.Z.a("fetch_newer");
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = paramLayoutInflater.inflate(efj.uf, paramViewGroup, false);
    this.af = new cyq(localView1.findViewById(aaw.bH));
    cyq localcyq1 = this.af;
    int i = aaw.bH;
    View localView2 = localcyq1.h.findViewById(i);
    if (localView2 != null)
    {
      localView2.setVisibility(0);
      localView2.setOnClickListener(this);
    }
    this.a = ((ColumnGridView)localView1.findViewById(aaw.dS));
    this.aa.b = (efj.y(this.bn) + g().getDimensionPixelSize(efj.ny));
    lvi locallvi = this.d;
    cyq localcyq2 = this.af;
    locallvi.a.add(localcyq2);
    ColumnGridView localColumnGridView = this.a;
    localColumnGridView.s = new lyf(this.d);
    localColumnGridView.c(0);
    this.ab = new dap(this.bn, this.c.c(), null, this, this, this.a, f() instanceof HomeActivity);
    this.a.a(this.ab);
    Button localButton = (Button)localView1.findViewById(aaw.ce);
    localButton.setClickable(true);
    localButton.setOnClickListener(this);
    bp localbp = f();
    if ((localbp instanceof iww)) {
      ((iww)localbp).a("events", 0L);
    }
    this.ag.h = new ccl(this);
    return localView1;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new ccm(this.bn, this.c.c());
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ac = paramBundle.getBoolean("events_refresh", false);
      this.ad = paramBundle.getBoolean("events_initialload", false);
      this.ae = paramBundle.getBoolean("events_datapresent", false);
    }
    for (;;)
    {
      k().a(0, null, this);
      return;
      this.ac = this.m.getBoolean("refresh", false);
    }
  }
  
  public final void a(URLSpan paramURLSpan) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
    paramgpr.d(aau.iR);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    paramhaa.c = false;
    if ("fetch_newer".equals(paramString))
    {
      this.ac = false;
      v();
      cck localcck = new cck(this);
      efj.m().post(localcck);
    }
  }
  
  public final void a(tp paramtp)
  {
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.iq)
    {
      x();
      return true;
    }
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.c = ((git)this.bo.a(git.class));
    lvj locallvj = (lvj)this.bo.b(lvj.class);
    if (locallvj != null)
    {
      lvi locallvi = this.d;
      lvh locallvh = locallvj.b;
      locallvi.a.add(locallvh);
    }
    this.bo.a(hdf.class, new dgd(this.bn));
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    localgzj.a.add(this);
    this.Z = localgzj;
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putBoolean("events_refresh", this.ac);
    paramBundle.putBoolean("events_initialload", this.ad);
    paramBundle.putBoolean("events_datapresent", this.ae);
    super.e(paramBundle);
  }
  
  public final void m()
  {
    super.m();
    if ((this.Z.a("fetch_newer")) && (z()))
    {
      hwq localhwq = this.ag;
      hwt localhwt = hwt.a;
      if (localhwt == null) {
        throw new NullPointerException();
      }
      localhwq.g = ((hwt)localhwt);
      localhwq.a();
    }
    if (this.ac) {
      y();
    }
    if (this.af != null) {
      this.af.a();
    }
  }
  
  public final void onClick(View paramView)
  {
    int i = this.c.c();
    if ((paramView instanceof dwi))
    {
      localhxj = ((dwi)paramView).k;
      if (localhxj != null)
      {
        str1 = localhxj.a();
        str2 = localhxj.c();
        a(efj.a(f(), i, str1, str2, 0, null, -2147483648, null, false, 1));
      }
    }
    while ((paramView.getId() != aaw.ce) && (paramView.getId() != aaw.bH))
    {
      hxj localhxj;
      String str1;
      String str2;
      return;
    }
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.ar;
    localgxx.a(localgxw);
    Intent localIntent = new Intent(f().getApplicationContext(), NewEventActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", i);
    a(localIntent);
  }
  
  public final gya r_()
  {
    return gya.y;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccj
 * JD-Core Version:    0.7.0.1
 */