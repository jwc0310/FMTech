import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
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
import java.util.Map;

public final class lcp
  extends mca
  implements cw<Cursor>, gpq, gzi, lec, led, leh, lep, lfm, lvy
{
  private final lfi Z;
  lef a;
  private gzj aa;
  private hum ab;
  private lfr ac;
  private int ad;
  private boolean ae;
  private int af;
  private RecyclerView ag;
  private aep ah;
  private int ai;
  private boolean aj;
  private int ak;
  private final lvz b;
  private final hwq c;
  private final lfk d;
  
  public lcp()
  {
    new gpk(this, this.bp, this);
    new gxl(pjo.aJ).a(this.bo);
    new gxj(this.bp, (byte)0);
    this.b = new lvz(this, this.bp);
    hwq localhwq = new hwq(this.bp);
    int i = do.A;
    localhwq.f = null;
    localhwq.e = i;
    localhwq.e();
    int j = do.D;
    localhwq.d = null;
    localhwq.c = j;
    localhwq.e();
    this.c = localhwq;
    this.d = new lfk(this, this.bp, this);
    this.Z = new lfi(this, this.bp);
    this.ai = 0;
  }
  
  private final void a(boolean paramBoolean)
  {
    kzj localkzj;
    if (f() != null)
    {
      if (this.a.a() == 0) {
        this.c.a(hwt.a);
      }
      localkzj = new kzj(this.bn, this.ad, true);
      localkzj.f = "fetch_newer_squares";
      if (paramBoolean) {
        break label75;
      }
    }
    label75:
    for (boolean bool = true;; bool = false)
    {
      localkzj.a = bool;
      this.ae = true;
      this.aa.b(localkzj);
      return;
    }
  }
  
  public static int v()
  {
    return do.J;
  }
  
  public final void A_()
  {
    this.b.b();
    this.ai = 0;
    a(true);
  }
  
  public final boolean O_()
  {
    return this.ae;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Xl, paramViewGroup, false);
    this.ag = ((RecyclerView)localView.findViewById(az.O));
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    this.ah = new aep(this.bn, i);
    this.ah.a = new lcq(this, i);
    this.ag.a(this.ah);
    this.ag.a(this.a);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(az.L)).a = this.ag;
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    this.ae = true;
    kzp localkzp = new kzp(this.bn, this.ad, lej.a).a(8);
    localkzp.h = "(membership_status=5) DESC, sort_index ASC";
    return localkzp;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ak = this.m.getInt("refreshMenuId");
    this.ac = new lfr(this.bn, this, this.ad);
    this.a = new lef(this.bn, this, null);
    this.a.i = true;
    this.a.e = this;
    this.a.d = this;
    if (paramBundle != null) {
      this.ai = paramBundle.getInt("restorePosition", -1);
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    efj.a(this.bn, this.ag, paramView, paramInt, this.af, this);
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.a.a(null);
  }
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(this.ak);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString)
  {
    this.Z.b(paramString);
  }
  
  public final void a(String paramString, int paramInt)
  {
    this.d.a(kxg.e, paramString, paramInt);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("fetch_newer_squares".equals(paramString))
    {
      if (hae.a(paramhae)) {
        Toast.makeText(this.bn, this.bn.getString(do.G), 0).show();
      }
      this.ae = false;
      paramhaa.c = false;
      if ((this.aj) && (i()))
      {
        k().b(0, null, this);
        this.aj = false;
      }
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(this.ad, paramString1, null);
    localIntent.putExtra("suggestion_id", paramString2);
    hum localhum;
    mbf localmbf;
    int i;
    String str1;
    if (!TextUtils.isEmpty(paramString2))
    {
      localhum = this.ab;
      localmbf = this.bn;
      i = this.ad;
      str1 = String.valueOf(paramString1);
      if (str1.length() == 0) {
        break label126;
      }
    }
    label126:
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      localhum.b(localmbf, i, str2, paramString2, 27, 111);
      ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
      return;
    }
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    lfr locallfr = this.ac;
    String str1;
    hum localhum;
    mbf localmbf;
    int j;
    String str4;
    if (locallfr.a.containsKey(paramString))
    {
      str1 = ((lft)locallfr.a.get(paramString)).b;
      if (!TextUtils.isEmpty(str1))
      {
        localhum = this.ab;
        localmbf = this.bn;
        j = this.ad;
        str4 = String.valueOf(paramString);
        if (str4.length() == 0) {
          break label244;
        }
      }
    }
    label244:
    for (String str5 = "g:".concat(str4);; str5 = new String("g:"))
    {
      localhum.a(localmbf, j, str5, str1, 27, 111);
      this.af = efj.a(this.ag, paramString);
      if (paramkxg == kxg.e)
      {
        lef locallef = this.a;
        int i = this.af;
        locallef.f.moveToPosition(locallef.b(i, 3));
        String str2 = locallef.f.getString(locallef.f.getColumnIndex("square_name"));
        String str3 = this.bn.getString(do.I);
        Toast.makeText(this.bn, this.bn.getString(do.B, new Object[] { str2, str3 }), 1).show();
      }
      this.a.a.b();
      return;
      str1 = null;
      break;
    }
  }
  
  public final void a(kxg paramkxg, String paramString, int paramInt)
  {
    this.d.a(paramkxg, paramString, paramInt);
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.ak)
    {
      lvz locallvz = this.b;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
      this.ai = 0;
      a(true);
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ad = ((git)this.bo.a(git.class)).c();
    gzj localgzj = (gzj)mbb.a(f(), gzj.class);
    localgzj.a.add(this);
    this.aa = localgzj;
    this.ab = ((hum)this.bo.a(hum.class));
    mbb localmbb = this.bo;
    localmbb.a(lfy.class, this.d);
    localmbb.a(lfh.class, this.Z);
  }
  
  public final void d(Bundle paramBundle)
  {
    boolean bool = true;
    super.d(paramBundle);
    if (paramBundle == null)
    {
      this.aj = bool;
      if (!this.aa.a("fetch_newer_squares")) {}
      for (;;)
      {
        a(bool);
        return;
        bool = false;
      }
    }
    k().a(0, null, this);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    int i;
    if (this.ah != null)
    {
      i = this.ah.i();
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
    this.af = -1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcp
 * JD-Core Version:    0.7.0.1
 */