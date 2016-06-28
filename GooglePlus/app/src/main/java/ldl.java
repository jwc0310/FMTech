import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public final class ldl
  extends mca
  implements ahn, gpq, gxv, led, leh, lep, lfm
{
  RecyclerView Z;
  final hwq a;
  String aa;
  String ab;
  int ac;
  String ad;
  String ae;
  lhj af;
  private final gpk ag;
  private final lfk ah;
  private EditText ai;
  private aep aj;
  private int ak;
  private int al;
  private final cw<lhi> am;
  private final cw<Cursor> an;
  lef b;
  int c;
  SearchView d;
  
  public ldl()
  {
    hwq localhwq = new hwq(this.bp);
    int i = et.R;
    localhwq.f = null;
    localhwq.e = i;
    localhwq.e();
    int j = et.S;
    localhwq.d = null;
    localhwq.c = j;
    localhwq.e();
    this.a = localhwq;
    this.ag = new gpk(this, this.bp, this);
    this.ah = new lfk(this, this.bp, this);
    this.ak = 0;
    this.ac = 0;
    this.ad = null;
    this.am = new ldm(this);
    this.an = new ldn(this);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Xt, paramViewGroup, false);
    this.Z = ((RecyclerView)localView.findViewById(da.ah));
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    this.aj = new aep(this.bn, i);
    this.aj.a = new ldo(this, i);
    this.Z.a(this.aj);
    this.Z.a(this.b);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.b = new lef(this.bn, this, null);
    this.b.d = this;
    this.af = new lhj(lej.a);
    if (paramBundle != null)
    {
      this.aa = paramBundle.getString("query");
      this.ac = paramBundle.getInt("restorePosition", -1);
      if (paramBundle.containsKey("squareSearchResults"))
      {
        this.af = ((lhj)paramBundle.getParcelable("squareSearchResults"));
        this.ak = paramBundle.getInt("loadPosition");
        this.ab = paramBundle.getString("continuationToken");
        this.ae = paramBundle.getString("lastQuery");
        this.b.a(this.af.c);
      }
    }
    for (;;)
    {
      this.a.a(hwt.b);
      return;
      this.aa = this.m.getString("query");
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    efj.a(this.bn, this.Z, paramView, paramInt, this.al, this);
    if (paramInt - this.ak > 8)
    {
      this.ak = paramInt;
      k().b(0, Bundle.EMPTY, this.am);
      ldp localldp = new ldp(this);
      efj.m().post(localldp);
    }
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(this.c, paramString1, null);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    this.ad = paramString;
    this.al = efj.a(this.Z, paramString);
    k().b(1, null, this.an);
  }
  
  public final void a(kxg paramkxg, String paramString, int paramInt)
  {
    this.ah.a(paramkxg, paramString, paramInt);
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    bp localbp = f();
    this.d = new SearchView(paramtp.g());
    efj.a(localbp, this.d, lse.b);
    SearchView localSearchView = this.d;
    localSearchView.k = g().getString(et.U);
    localSearchView.d();
    this.d.a(false);
    this.d.f = this;
    this.d.a(this.aa, false);
    this.d.setFocusable(false);
    this.ai = ((EditText)this.d.findViewById(da.af));
    paramtp.c(true);
    efj.a(paramtp, true);
    paramtp.d(true);
    paramtp.a(this.d);
    paramtp.e(true);
    paramtp.d(false);
    if (TextUtils.isEmpty(this.aa))
    {
      this.ai.requestFocus();
      this.d.postDelayed(new ldq(this), 50L);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final boolean a(String paramString)
  {
    this.aa = paramString;
    efj.k(this.N);
    this.ai.clearFocus();
    return true;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp)
  {
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
  }
  
  public final boolean b(String paramString)
  {
    if (this.b == null) {}
    while ((paramString != null) && (paramString.equals(this.aa)) && (this.b.a() > 0)) {
      return true;
    }
    if (paramString == null) {}
    cv localcv;
    for (String str = null;; str = paramString.trim())
    {
      this.aa = str;
      localcv = k();
      this.af = new lhj(lej.a);
      this.ak = 0;
      this.ae = null;
      this.ad = null;
      this.ab = null;
      this.b.h = false;
      this.b.a(null);
      if (!TextUtils.isEmpty(this.aa)) {
        break;
      }
      localcv.a(0);
      this.a.a(hwt.b);
      Bundle localBundle = gxy.a("extra_search_type", 6);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.b = this.c;
      localgxw.c = gxz.ee;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      return true;
    }
    if (this.aa.length() < 2)
    {
      localcv.a(0);
      hwq localhwq = this.a;
      int i = et.T;
      localhwq.d = null;
      localhwq.c = i;
      localhwq.e();
      this.a.a(hwt.c);
      return true;
    }
    k().b(0, Bundle.EMPTY, this.am);
    this.a.a(hwt.a);
    return true;
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((git)this.bo.a(git.class)).c();
    this.bo.a(lfy.class, this.ah);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.aa != null) {
      paramBundle.putString("query", this.aa);
    }
    int i;
    if (this.af.a())
    {
      paramBundle.putParcelable("squareSearchResults", this.af);
      paramBundle.putInt("loadPosition", this.ak);
      paramBundle.putString("continuationToken", this.ab);
      paramBundle.putString("lastQuery", this.ae);
      i = this.aj.i();
      if (i < 0) {
        break label92;
      }
    }
    for (;;)
    {
      paramBundle.putInt("restorePosition", i);
      return;
      label92:
      i = -1;
    }
  }
  
  public final void m()
  {
    super.m();
    this.ag.a();
  }
  
  public final gya r_()
  {
    return gya.F;
  }
  
  public final void x()
  {
    this.al = -1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldl
 * JD-Core Version:    0.7.0.1
 */