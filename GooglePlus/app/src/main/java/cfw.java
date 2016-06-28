import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;

public class cfw
  extends cge
  implements ahn
{
  private String Z;
  public int a;
  private boolean aa;
  private EditText ab;
  private int ac;
  private String[] ad;
  private hhh ae;
  private boolean af;
  private boolean ag;
  SearchView b;
  public String c;
  private String d;
  
  private void M()
  {
    this.aI = true;
    M_();
    k().b(2, null, this);
    a(true);
  }
  
  private final boolean N()
  {
    return (TextUtils.isEmpty(this.c)) && (this.af);
  }
  
  private final boolean O()
  {
    return (TextUtils.isEmpty(this.c)) && (this.ag) && (!this.af);
  }
  
  protected final boolean G()
  {
    return O();
  }
  
  protected final void M_()
  {
    if (O())
    {
      super.M_();
      return;
    }
    if (N())
    {
      this.aH = efj.a(this.at.f().b("gaia_id"), null, false, null, null, 5, "collection_explore_stream");
      return;
    }
    if (TextUtils.isEmpty(this.c))
    {
      this.aH = "com.google.android.apps.plus.INVALID_SEARCH_QUERY";
      return;
    }
    this.aH = efj.a(this.c, this.a);
  }
  
  protected dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    return super.a(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, null, paramlob);
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.c = paramBundle.getString("query");
      this.d = paramBundle.getString("delayed_query");
      this.a = paramBundle.getInt("search_mode");
      this.Z = paramBundle.getString("injected_item_blob");
      this.aa = paramBundle.getBoolean("show_search_view", true);
      M_();
      k().a(2, null, this);
    }
    for (;;)
    {
      if (this.d != null)
      {
        this.c = this.d;
        this.d = null;
        M();
      }
      return;
      this.d = this.m.getString("query");
      this.Z = this.m.getString("injected_item_blob");
      this.aa = this.m.getBoolean("show_search_view", true);
    }
  }
  
  public final void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    switch (paramfu.i)
    {
    default: 
    case 2: 
      do
      {
        do
        {
          return;
          super.a(paramfu, paramCursor);
        } while ((this.c == null) || (!this.c.equals(this.m.getString("query"))));
        efj.k(this.N);
      } while (this.b == null);
      this.b.clearFocus();
      return;
    }
    this.az.b(paramCursor, -1);
    ac();
    this.aM = false;
    this.aN = false;
    if (this.aJ)
    {
      hwq localhwq6 = this.aw;
      int j = aau.eD;
      localhwq6.d = null;
      localhwq6.c = j;
      localhwq6.e();
      hwq localhwq7 = this.aw;
      hwt localhwt5 = hwt.c;
      if (localhwt5 == null) {
        throw new NullPointerException();
      }
      localhwq7.g = ((hwt)localhwt5);
      localhwq7.a();
      N_();
      return;
    }
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    if ((paramCursor != null) && (paramCursor.getCount() > 0))
    {
      hwq localhwq5 = this.aw;
      hwt localhwt4 = hwt.b;
      if (localhwt4 == null) {
        throw new NullPointerException();
      }
      localhwq5.g = ((hwt)localhwt4);
      localhwq5.a();
      this.aM = TextUtils.isEmpty(this.aB);
    }
    for (;;)
    {
      this.aI = false;
      break;
      if ((localgzj.a("fetch_newer")) || (localgzj.a("fetch_older")))
      {
        if (L_())
        {
          hwq localhwq1 = this.aw;
          hwt localhwt1 = hwt.a;
          if (localhwt1 == null) {
            throw new NullPointerException();
          }
          localhwq1.g = ((hwt)localhwt1);
          localhwq1.a();
        }
      }
      else if (!TextUtils.isEmpty(this.c))
      {
        if (this.aI)
        {
          a(true);
        }
        else if (L_())
        {
          hwq localhwq3 = this.aw;
          int i = aau.lL;
          localhwq3.d = null;
          localhwq3.c = i;
          localhwq3.e();
          hwq localhwq4 = this.aw;
          hwt localhwt3 = hwt.c;
          if (localhwt3 == null) {
            throw new NullPointerException();
          }
          localhwq4.g = ((hwt)localhwt3);
          localhwq4.a();
        }
      }
      else
      {
        hwq localhwq2 = this.aw;
        hwt localhwt2 = hwt.b;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq2.g = ((hwt)localhwt2);
        localhwq2.a();
      }
    }
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
  }
  
  public void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (O())
    {
      super.a(paramString, paramhae, paramhaa);
      return;
    }
    if (("fetch_newer".equals(paramString)) || ("fetch_older".equals(paramString)))
    {
      if (this.af) {
        this.ad = paramhae.a().getStringArray("clx_obfuscated_collexion_ids");
      }
      paramhaa.c = false;
      this.aJ = hae.a(paramhae);
      af();
      k().b(2, null, this);
      return;
    }
    super.a(paramString, paramhae, paramhaa);
  }
  
  public final void a(tp paramtp)
  {
    if (this.aa)
    {
      bp localbp = f();
      this.b = new SearchView(paramtp.g());
      efj.a(localbp, this.b, this.ac);
      SearchView localSearchView = this.b;
      localSearchView.k = g().getString(aau.sG);
      localSearchView.d();
      this.b.a(false);
      this.b.a(this.c, false);
      this.b.f = this;
      this.b.setFocusable(false);
      this.ab = ((EditText)this.b.findViewById(aaw.jq));
      efj.a(paramtp, true);
      paramtp.c(true);
      paramtp.a(this.b);
      paramtp.e(true);
      paramtp.d(false);
    }
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (O())
    {
      super.a(paramBoolean);
      return;
    }
    int i = this.at.c();
    if (N())
    {
      gzf localgzf = this.ae.a(i, this.at.f().b("gaia_id"), this.aB, this.ad);
      if (paramBoolean) {}
      for (String str2 = "fetch_newer";; str2 = "fetch_older")
      {
        localgzf.f = str2;
        ((gzj)this.bo.a(gzj.class)).b(localgzf);
        N_();
        return;
      }
    }
    if (TextUtils.isEmpty(this.c))
    {
      N_();
      return;
    }
    Bundle localBundle = gxy.a("extra_search_query", this.c);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.bT;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    if ((paramBoolean) && (L_()))
    {
      hwq localhwq = this.aw;
      hwt localhwt = hwt.a;
      if (localhwt == null) {
        throw new NullPointerException();
      }
      localhwq.g = ((hwt)localhwt);
      localhwq.a();
    }
    bof localbof = new bof(f(), i, this.c, this.Z, this.a, paramBoolean);
    if (paramBoolean) {}
    for (String str1 = "fetch_newer";; str1 = "fetch_older")
    {
      localbof.f = str1;
      ((gzj)this.bo.a(gzj.class)).b(localbof);
      N_();
      return;
    }
  }
  
  public final boolean a(String paramString)
  {
    efj.k(this.N);
    this.ab.clearFocus();
    String str = paramString.toString().trim();
    if (!TextUtils.equals(str, this.c)) {
      this.aK = true;
    }
    this.c = str;
    z();
    return true;
  }
  
  protected final void ac_() {}
  
  public final void b(int paramInt)
  {
    if (paramInt != this.a)
    {
      this.a = paramInt;
      this.aK = true;
      M();
    }
  }
  
  public final void b(tp paramtp)
  {
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
  }
  
  public boolean b(String paramString)
  {
    return true;
  }
  
  protected void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ae = ((hhh)this.bo.a(hhh.class));
    int i = this.at.c();
    this.af = this.ae.h(i);
    this.ag = ((djp)this.bo.a(djp.class)).b(i);
    if (((djp)this.bo.a(djp.class)).a(this.at.c()))
    {
      this.ac = lse.a;
      return;
    }
    this.ac = lse.b;
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("query", this.c);
    paramBundle.putString("delayed_query", this.d);
    paramBundle.putInt("search_mode", this.a);
    paramBundle.putBoolean("show_search_view", this.aa);
  }
  
  public final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
  }
  
  public void m()
  {
    super.m();
    if ((this.b != null) && (!L_())) {
      this.b.postDelayed(new cfx(this), 50L);
    }
  }
  
  public void n()
  {
    super.n();
    if ((this.b != null) && (this.b.findFocus() != null)) {
      efj.k(this.b);
    }
  }
  
  public gxq v()
  {
    return new gxq(pkb.e);
  }
  
  protected void z()
  {
    M();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfw
 * JD-Core Version:    0.7.0.1
 */