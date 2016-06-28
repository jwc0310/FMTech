import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public final class cld
  extends cjx
  implements ahm, ahn
{
  private static int c;
  private static int d;
  private cla Z;
  TextView a;
  private String aa;
  private String ab;
  private boolean at;
  private EditText au;
  SearchView b;
  
  public cld() {}
  
  public cld(String paramString, boolean paramBoolean)
  {
    this.aa = paramString;
    this.at = paramBoolean;
  }
  
  private final void M()
  {
    if (!TextUtils.isEmpty(this.aa)) {}
    while (this.b == null) {
      return;
    }
    this.au.requestFocus();
    this.b.postDelayed(new clf(this), 50L);
  }
  
  protected final void A()
  {
    jly localjly = this.Z.c;
    localjly.a.b(localjly.d, null, localjly);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(104);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  protected final boolean K()
  {
    return (this.Z == null) || (TextUtils.isEmpty(this.aa));
  }
  
  public final void R()
  {
    int i = this.am.c();
    a(efj.b(f(), i, this.aa, null));
    f().finish();
  }
  
  public final int R_()
  {
    return 70;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this.Z);
    RelativeLayout localRelativeLayout = (RelativeLayout)localView;
    Context localContext = paramLayoutInflater.getContext();
    this.a = new TextView(localContext);
    this.a.setVisibility(8);
    this.a.setPadding(c, 0, c, 0);
    this.a.setTextAppearance(localContext, efj.yM);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.topMargin = d;
    localLayoutParams.addRule(14);
    this.a.setLayoutParams(localLayoutParams);
    if (this.at) {
      this.a.setText(aau.vd);
    }
    for (;;)
    {
      localRelativeLayout.addView(this.a);
      J();
      hwq localhwq = this.ar;
      localhwq.a = false;
      localhwq.h = new cle(this);
      return localView;
      this.a.setText(aau.sI);
    }
  }
  
  protected final hgh a(int paramInt1, int paramInt2)
  {
    return new hvk(a(paramInt1), null, null);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (c == 0)
    {
      Resources localResources = g();
      c = localResources.getDimensionPixelSize(efj.ol);
      d = localResources.getDimensionPixelSize(efj.om);
    }
    if (paramBundle != null)
    {
      this.aa = paramBundle.getString("query");
      this.ab = paramBundle.getString("delayed_query");
      this.at = paramBundle.getBoolean("show_unified_search");
      if (paramBundle.containsKey("unblock_request_id")) {
        this.ah = Integer.valueOf(paramBundle.getInt("unblock_request_id"));
      }
    }
    for (;;)
    {
      cv localcv = k();
      this.Z = new cla(f(), this.x, localcv, this.am.c(), this.ak);
      this.Z.a(paramBundle);
      this.Z.z = this;
      this.Z.e = 2;
      this.Z.j = true;
      this.Z.c(true);
      this.Z.r = true;
      this.Z.l = true;
      if (!TextUtils.isEmpty(this.aa)) {
        this.Z.e(this.at);
      }
      return;
      this.ab = this.m.getString("query");
    }
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    bp localbp = f();
    SearchView localSearchView = new SearchView(paramtp.g());
    Bundle localBundle = this.m;
    if ((localBundle != null) && (localBundle.getBoolean("white_action_bar", false))) {}
    for (int i = lse.a;; i = lse.b)
    {
      efj.a(localbp, localSearchView, i);
      localSearchView.k = g().getString(aau.sG);
      localSearchView.d();
      localSearchView.a(false);
      paramtp.a(localSearchView);
      paramtp.e(true);
      paramtp.d(false);
      localSearchView.a(this.aa, false);
      localSearchView.f = this;
      localSearchView.j = this;
      localSearchView.setFocusable(false);
      this.b = localSearchView;
      this.au = ((EditText)this.b.findViewById(aaw.jq));
      M();
      return;
    }
  }
  
  public final boolean a(String paramString)
  {
    efj.k(this.N);
    this.b.clearFocus();
    if (this.at) {
      R();
    }
    return true;
  }
  
  public final boolean ag_()
  {
    this.Z.b(null);
    return true;
  }
  
  public final void b(tp paramtp)
  {
    super.b(paramtp);
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
  }
  
  public final boolean b(String paramString)
  {
    String str;
    cla localcla;
    if (paramString == null)
    {
      str = null;
      this.aa = str;
      if ((dun.b()) && (paramString != null)) {
        czf.a(f(), paramString);
      }
      int i = this.am.c();
      if (this.Z != null)
      {
        this.Z.b(this.aa);
        if (TextUtils.isEmpty(this.aa))
        {
          Bundle localBundle = gxy.a("extra_search_type", 1);
          gxx localgxx = (gxx)this.bo.a(gxx.class);
          gxw localgxw = new gxw(this.bn, i);
          localgxw.c = gxz.ee;
          if (localBundle != null) {
            localgxw.h.putAll(localBundle);
          }
          localgxx.a(localgxw);
        }
      }
      J();
      localcla = this.Z;
      if ((!this.at) || (TextUtils.isEmpty(this.aa))) {
        break label187;
      }
    }
    label187:
    for (boolean bool = true;; bool = false)
    {
      localcla.e(bool);
      return true;
      str = paramString.toString().trim();
      break;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.Z != null) {
      this.Z.b(paramBundle);
    }
    paramBundle.putString("query", this.aa);
    if (this.ab != null) {
      paramBundle.putString("delayed_query", this.ab);
    }
    paramBundle.putBoolean("show_unified_search", this.at);
  }
  
  public final void m()
  {
    super.m();
    if (this.ab != null)
    {
      this.aa = this.ab;
      this.ab = null;
      this.Z.b(this.aa);
      this.ac.a();
    }
    M();
  }
  
  public final void n()
  {
    super.n();
    if ((this.b != null) && (this.b.findFocus() != null)) {
      efj.k(this.b);
    }
  }
  
  public final void p_()
  {
    super.p_();
    this.Z.f();
  }
  
  public final void q_()
  {
    super.p_();
    this.Z.x.removeMessages(0);
  }
  
  protected final void z() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cld
 * JD-Core Version:    0.7.0.1
 */