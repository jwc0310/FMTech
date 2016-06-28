import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;

public final class hij
  extends mca
  implements cw<Cursor>, gpq, gzi, hhm, lvy
{
  gzj Z;
  String a;
  private git aa;
  private ListView ab;
  private int ac;
  private hhn ad;
  private int ae = 0;
  private Uri af;
  private final gpk ag = new gpk(this, this.bp, this);
  private final hwq ah;
  private final lvz ai;
  hik b;
  int c;
  String d;
  
  public hij()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aaw.op;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.ah = localhwq;
    this.ai = new lvz(this, this.bp);
    new gxj(this.bp, (byte)0);
  }
  
  private final void a(boolean paramBoolean)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.b.isEmpty()) {
      if (paramBoolean)
      {
        hwq localhwq3 = this.ah;
        hwt localhwt3 = hwt.a;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
        if (!paramBoolean)
        {
          lvz locallvz = this.ai;
          if (locallvz.a != null)
          {
            localSwipeRefreshLayoutWithUpScroll = locallvz.a;
            if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
              break label195;
            }
            localSwipeRefreshLayoutWithUpScroll.a(false);
          }
        }
      }
    }
    for (;;)
    {
      this.ag.a();
      return;
      hwq localhwq2 = this.ah;
      hwt localhwt2 = hwt.c;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      this.ab.setVisibility(8);
      break;
      hwq localhwq1 = this.ah;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      this.ab.setVisibility(0);
      break;
      label195:
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
  
  private void x()
  {
    lvz locallvz1 = this.ai;
    if (locallvz1.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll2 = locallvz1.a;
      if ((!localSwipeRefreshLayoutWithUpScroll2.b) && (localSwipeRefreshLayoutWithUpScroll2.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll2.a(true);
      }
    }
    int i;
    if (f() != null)
    {
      if (this.ae != 1) {
        break label129;
      }
      i = 1;
      if (i == 0)
      {
        this.d = null;
        hld.a(this.bn, this.c, this.Z, this.a, true, this.d);
      }
    }
    lvz locallvz2 = this.ai;
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll1;
    if (locallvz2.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll1 = locallvz2.a;
      if (localSwipeRefreshLayoutWithUpScroll1.isEnabled()) {
        break label135;
      }
      localSwipeRefreshLayoutWithUpScroll1.a(false);
    }
    for (;;)
    {
      this.ag.a();
      return;
      label129:
      i = 0;
      break;
      label135:
      if (localSwipeRefreshLayoutWithUpScroll1.m != null)
      {
        if ((localSwipeRefreshLayoutWithUpScroll1.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll1.b)) {
          localSwipeRefreshLayoutWithUpScroll1.a(true);
        }
        if (!localSwipeRefreshLayoutWithUpScroll1.m.O_())
        {
          Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll1.n;
          long l = localSwipeRefreshLayoutWithUpScroll1.o;
          efj.m().postDelayed(localRunnable, l);
        }
      }
    }
  }
  
  public final void A_()
  {
    this.ai.b();
    x();
  }
  
  public final boolean O_()
  {
    return this.ae == 1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(ehr.aR, paramViewGroup, false);
    this.ab = ((ListView)localView.findViewById(16908298));
    this.ab.setAdapter(this.b);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(ehr.aM)).a = this.ab;
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
      return new hly(this.bn, this.aa.c(), this.a, hma.a);
    }
    return new hly(this.bn, this.aa.c(), this.a, hma.b);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ac = this.m.getInt("refreshMenuId");
    this.a = this.m.getString("clx_id");
    this.b = new hik(this, this.bn);
    mbf localmbf = this.bn;
    String str = this.a;
    this.af = ((hho)mbb.a(localmbf, hho.class)).c(str);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.ac);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if ("GetCollexionFollowers".equals(paramString))
    {
      if (Log.isLoggable("CollexionFollowerList", 3))
      {
        String str = String.valueOf(paramhae);
        new StringBuilder(26 + String.valueOf(str).length()).append("onFetchFollowersComplete: ").append(str);
      }
      this.d = paramhae.a().getString("continuation_token");
      lvz locallvz = this.ai;
      if (locallvz.a != null)
      {
        localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
          break label118;
        }
        localSwipeRefreshLayoutWithUpScroll.a(false);
      }
    }
    for (;;)
    {
      this.ag.a();
      paramhaa.c = false;
      return;
      label118:
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
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
    paramtp.b(aaw.ol);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.ac)
    {
      x();
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp)
  {
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
  }
  
  public final void c(int paramInt)
  {
    int i = 1;
    if (this.ae == paramInt) {
      return;
    }
    this.ae = paramInt;
    if (paramInt == 2)
    {
      bp localbp = f();
      int k = aaw.oH;
      Toast.makeText(localbp, g().getString(k), 0).show();
    }
    if (this.ae == i) {}
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
    this.aa = ((git)this.bo.a(git.class));
    new gxl(new kuu(pjn.i, this.m.getString("clx_id"))).a(this.bo);
    this.c = ((git)this.bo.a(git.class)).c();
    this.Z = ((gzj)this.bo.a(gzj.class));
    this.Z.a.add(this);
    this.ad = ((hhn)this.bo.a(hhn.class));
  }
  
  public final void d_()
  {
    super.d_();
    this.ab = null;
  }
  
  public final void m()
  {
    int i = 1;
    super.m();
    if (this.ae == i) {}
    for (;;)
    {
      a(i);
      this.ad.a(this.af, this);
      return;
      int j = 0;
    }
  }
  
  public final void n()
  {
    super.n();
    this.ad.b(this.af, this);
  }
  
  final void v()
  {
    lvz locallvz = this.ai;
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (locallvz.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
        break label37;
      }
      localSwipeRefreshLayoutWithUpScroll.a(false);
    }
    for (;;)
    {
      this.ag.a();
      return;
      label37:
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
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hij
 * JD-Core Version:    0.7.0.1
 */