import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public final class hop
  extends mca
  implements ahn, cw<hhf>, gpq, hgz, hoo
{
  private hhh Z;
  final hom a;
  private hhc aa;
  private hho ab;
  private int ac;
  private String ad;
  private boolean ae;
  SearchView b;
  private hwq c;
  private hgv d;
  
  public hop()
  {
    new gpk(this, this.bp, this);
    this.c = new hwq(this.bp);
    this.a = new hom(this.bn, this, this.bp);
  }
  
  private final void v()
  {
    this.ae = true;
    w();
    k().b(1, null, this);
  }
  
  private final void w()
  {
    if (this.a.a() != 0)
    {
      hwq localhwq6 = this.c;
      hwt localhwt4 = hwt.b;
      if (localhwt4 == null) {
        throw new NullPointerException();
      }
      localhwq6.g = ((hwt)localhwt4);
      localhwq6.a();
      return;
    }
    if (TextUtils.isEmpty(this.ad))
    {
      hwq localhwq4 = this.c;
      localhwq4.d = null;
      localhwq4.c = 0;
      localhwq4.e();
      hwq localhwq5 = this.c;
      hwt localhwt3 = hwt.c;
      if (localhwt3 == null) {
        throw new NullPointerException();
      }
      localhwq5.g = ((hwt)localhwt3);
      localhwq5.a();
      return;
    }
    if (this.ae)
    {
      hwq localhwq3 = this.c;
      hwt localhwt2 = hwt.a;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq3.g = ((hwt)localhwt2);
      localhwq3.a();
      return;
    }
    hwq localhwq1 = this.c;
    int i = az.l;
    localhwq1.d = null;
    localhwq1.c = i;
    localhwq1.e();
    hwq localhwq2 = this.c;
    hwt localhwt1 = hwt.c;
    if (localhwt1 == null) {
      throw new NullPointerException();
    }
    localhwq2.g = ((hwt)localhwt1);
    localhwq2.a();
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Js, paramViewGroup, false);
    RecyclerView localRecyclerView = (RecyclerView)localView.findViewById(ehr.bj);
    int i = efj.v(this.bn, efj.K(this.bn).widthPixels);
    aep localaep = new aep(this.bn, i);
    localRecyclerView.a(localaep);
    localaep.a = new hoq(this, i);
    localRecyclerView.a(this.a);
    return localView;
  }
  
  public final fu<hhf> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(29 + "Invalid loader id " + paramInt);
    }
    return this.Z.a(this.bn, this.ac, this.ad, this.a.b());
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt > 0) && (!this.ae) && (!TextUtils.isEmpty(this.a.b())) && (paramInt >= -6 + this.a.a())) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        v();
      }
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    hwq localhwq1 = this.c;
    int i = az.n;
    localhwq1.f = null;
    localhwq1.e = i;
    localhwq1.e();
    if (paramBundle != null)
    {
      this.ad = paramBundle.getString("query");
      k().a(1, null, this);
    }
    do
    {
      w();
      return;
      this.ad = this.m.getString("query");
    } while (TextUtils.isEmpty(this.ad));
    hwq localhwq2 = this.c;
    hwt localhwt = hwt.a;
    if (localhwt == null) {
      throw new NullPointerException();
    }
    localhwq2.g = ((hwt)localhwt);
    localhwq2.a();
    k().a(1, null, this);
  }
  
  public final void a(fu<hhf> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(ehr.bl, this.aa.a());
  }
  
  public final void a(String paramString, int paramInt)
  {
    this.d.a(paramString, paramInt, this.ab.c());
  }
  
  public final void a(tp paramtp)
  {
    bp localbp = f();
    this.b = new SearchView(paramtp.g());
    efj.a(localbp, this.b, lse.b);
    SearchView localSearchView = this.b;
    localSearchView.k = g().getString(az.k);
    localSearchView.d();
    this.b.a(false);
    this.b.a(this.ad, false);
    this.b.f = this;
    this.b.setFocusable(false);
    paramtp.c(true);
    efj.a(paramtp, true);
    paramtp.a(this.b);
    paramtp.e(true);
    paramtp.d(false);
    if (TextUtils.isEmpty(this.ad))
    {
      this.b.findViewById(ehr.bk).requestFocus();
      this.b.postDelayed(new hor(this), 50L);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final boolean a(String paramString)
  {
    this.ad = paramString;
    efj.k(this.N);
    this.b.clearFocus();
    return true;
  }
  
  public final void b(String paramString1, String paramString2)
  {
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).a(this.ac, paramString1, paramString2);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void b(tp paramtp)
  {
    paramtp.a(null);
  }
  
  public final boolean b(String paramString)
  {
    if (TextUtils.equals(this.ad, paramString)) {
      return true;
    }
    this.ad = paramString;
    this.a.a(null);
    if (TextUtils.isEmpty(paramString))
    {
      k().a(1);
      w();
      return true;
    }
    v();
    return true;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = new hjl(this, this.bp);
    mbb localmbb = this.bo;
    localmbb.a(hgz.class, this);
    localmbb.a(hgv.class, this.d);
    localmbb.a(hgw.class, this.d);
    this.ac = ((git)this.bo.a(git.class)).c();
    this.Z = ((hhh)this.bo.a(hhh.class));
    this.aa = ((hhc)this.bo.a(hhc.class));
    this.ab = ((hho)this.bo.a(hho.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("query", this.ad);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hop
 * JD-Core Version:    0.7.0.1
 */