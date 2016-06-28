import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public final class ldh
  extends mca
  implements ahn, gpq, gxs, gzi, kyd, kye, lzv
{
  private int Z;
  private git a;
  private ListView aa;
  private ldg ab;
  private SearchView ac;
  private final les b;
  private final let c;
  private String d;
  
  public ldh()
  {
    new gpk(this, this.bp, this);
    new lzx(this.bp, this);
    new gxj(this.bp, (byte)0);
    this.b = new les(this, this.bp);
    this.c = new let(this, this.bp, this.b);
  }
  
  public final String N()
  {
    return this.d;
  }
  
  public final int O()
  {
    return this.Z;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Xq, paramViewGroup, false);
    this.aa = ((ListView)localView.findViewById(16908298));
    this.aa.setAdapter(this.ab);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    int i = 1;
    super.a(paramBundle);
    this.d = this.m.getString("square_id");
    this.Z = this.m.getInt("membership_status");
    cv localcv = k();
    mbf localmbf = this.bn;
    bw localbw = h();
    int j = this.a.c();
    String str = this.d;
    int k = this.Z;
    if ((k == 2) || (k == i)) {}
    for (;;)
    {
      this.ab = new ldg(localmbf, localbw, localcv, j, str, i);
      ldg localldg = this.ab;
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(localldg.getClass().getClassLoader());
        localldg.g = paramBundle.getString("search_list_adapter.query");
        localldg.e = paramBundle.getBoolean("square_search_list_adapter.error");
        localldg.d = paramBundle.getBoolean("square+search_list_adapter.loading");
        localldg.f = paramBundle.getBoolean("square_search_list_adapter.not_found");
        if ((paramBundle.containsKey("search_list_adapter.results")) && (!localldg.j)) {
          localldg.i = ((lhj)paramBundle.getParcelable("search_list_adapter.results"));
        }
      }
      this.ab.a = ((lfc)this.bo.a(lfc.class));
      return;
      i = 0;
    }
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("EditSquareMembershipTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label61;
      }
    }
    label61:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.ab.b(null);
        this.ab.b(this.ac.a.getText().toString().trim());
      }
      return;
    }
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    SearchView localSearchView = new SearchView(paramtp.g());
    efj.a(this.bn, localSearchView, lse.b);
    localSearchView.a(false);
    localSearchView.k = g().getString(eb.m);
    localSearchView.d();
    localSearchView.f = this;
    this.ac = localSearchView;
    paramtp.a(localSearchView);
    paramtp.e(true);
    paramtp.d(false);
    paramtp.c(true);
    efj.a(paramtp, true);
    localSearchView.requestFocus();
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final boolean a(String paramString)
  {
    efj.k(this.N);
    this.ac.clearFocus();
    return true;
  }
  
  public final void b(tp paramtp)
  {
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
  }
  
  public final boolean b(String paramString)
  {
    ldg localldg;
    if (this.ab != null)
    {
      localldg = this.ab;
      if (paramString != null) {
        break label25;
      }
    }
    label25:
    for (String str = null;; str = paramString.toString().trim())
    {
      localldg.b(str);
      return true;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    this.bo.a(gxs.class, this);
    this.bo.a(lex.class, this.b);
    this.bo.a(lfc.class, this.c);
    this.bo.a(kye.class, this);
    this.bo.a(kyd.class, this);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ab != null)
    {
      ldg localldg = this.ab;
      paramBundle.putString("search_list_adapter.query", localldg.g);
      paramBundle.putBoolean("square_search_list_adapter.error", localldg.e);
      paramBundle.putBoolean("square+search_list_adapter.loading", localldg.d);
      paramBundle.putBoolean("square_search_list_adapter.not_found", localldg.f);
      if (localldg.i.a()) {
        paramBundle.putParcelable("search_list_adapter.results", localldg.i);
      }
    }
  }
  
  public final void m()
  {
    super.m();
    this.aa.setVisibility(0);
  }
  
  public final void p_()
  {
    super.p_();
    ldg localldg = this.ab;
    Bundle localBundle = new Bundle();
    localBundle.putString("query", localldg.g);
    localldg.b.a(localldg.h, localBundle, localldg);
    localldg.d();
  }
  
  public final void q_()
  {
    super.p_();
    this.ab.k.removeMessages(0);
  }
  
  public final boolean s_()
  {
    efj.k(this.N);
    return false;
  }
  
  public final gxq v()
  {
    return new kuw(pjo.w, this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldh
 * JD-Core Version:    0.7.0.1
 */