import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public final class cey
  extends cff
  implements ahn, View.OnClickListener, View.OnFocusChangeListener, View.OnLongClickListener, cw<Cursor>
{
  private dej Z;
  View a;
  private jpd aJ;
  private final hwq aK;
  private final dme aL;
  private final jpe aM;
  private Integer aa;
  private SearchView ab;
  private int ac = 1;
  private CharSequence ad;
  private CharSequence ae;
  private boolean af;
  private HashSet<Integer> ag;
  private boolean ah;
  private String ai;
  private boolean aj = true;
  private jov ak;
  boolean b;
  public boolean c;
  private ColumnGridView d;
  
  public cey()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.jn;
    localhwq.f = null;
    localhwq.e = i;
    localhwq.e();
    localhwq.h = new cez(this);
    this.aK = localhwq;
    this.aL = new cfa(this);
    this.aM = new cfb(this);
  }
  
  private final void C()
  {
    Bundle localBundle = this.m;
    if (localBundle == null) {
      return;
    }
    this.ah = localBundle.getBoolean("hide_search_view");
    this.b = localBundle.getBoolean("search_local_videos");
  }
  
  private final void a(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {
      return;
    }
    if ((v()) || (!this.af)) {
      if (this.aa == null) {
        if ((!this.af) && (!this.c)) {
          if (this.ah)
          {
            hwq localhwq4 = this.aK;
            hwt localhwt3 = hwt.a;
            if (localhwt3 == null) {
              throw new NullPointerException();
            }
            localhwq4.g = ((hwt)localhwt3);
            localhwq4.a();
            this.d.setVisibility(8);
          }
        }
      }
    }
    for (;;)
    {
      a(this.aK);
      G();
      return;
      View localView = this.N;
      if (localView == null) {
        break;
      }
      localView.findViewById(16908292).setVisibility(8);
      this.a.setVisibility(0);
      break;
      String str;
      if (this.ah) {
        if (this.b)
        {
          int k = aau.lO;
          str = g().getString(k);
        }
      }
      hwq localhwq3;
      hwt localhwt2;
      for (;;)
      {
        hwq localhwq2 = this.aK;
        localhwq2.d = Html.fromHtml(str);
        localhwq2.c = 0;
        localhwq2.e();
        localhwq3 = this.aK;
        localhwt2 = hwt.c;
        if (localhwt2 != null) {
          break;
        }
        throw new NullPointerException();
        int j = aau.lF;
        str = g().getString(j);
        continue;
        Resources localResources = g();
        int i = aau.nR;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.ae;
        str = localResources.getString(i, arrayOfObject);
      }
      localhwq3.g = ((hwt)localhwt2);
      localhwq3.a();
      break;
      hwq localhwq1 = this.aK;
      hwt localhwt1 = hwt.a;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      break;
      hwq localhwq5 = this.aK;
      hwt localhwt4 = hwt.b;
      if (localhwt4 == null) {
        throw new NullPointerException();
      }
      localhwq5.g = ((hwt)localhwt4);
      localhwq5.a();
      this.d.setVisibility(0);
      if (paramBoolean)
      {
        ColumnGridView localColumnGridView = this.d;
        localColumnGridView.removeAllViews();
        localColumnGridView.d();
        localColumnGridView.a();
      }
    }
  }
  
  private void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    boolean bool;
    dej localdej;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.ab != null) {
        this.ab.a(paramCharSequence, false);
      }
      this.aa = Integer.valueOf(EsService.a(this.bn, this.am.c(), paramCharSequence.toString(), this.ac, null, this.ai));
      if (paramBoolean)
      {
        bool = this.Z.J_();
        this.Z.aQ = false;
        localdej = this.Z;
        localdej.a(1, null);
        if ((localdej.i) && (0 != 0) && (null.getCount() != 0)) {
          break label154;
        }
        localdej.g = null;
      }
    }
    for (;;)
    {
      localdej.a(0, localdej.g);
      this.Z.a(null);
      this.Z.aQ = bool;
      this.af = false;
      return;
      label154:
      if (localdej.g == null)
      {
        localdej.g = new hqr(new String[0]);
        Object[] arrayOfObject = new Object[0];
        localdej.g.a(arrayOfObject);
      }
    }
  }
  
  protected final boolean X_()
  {
    return (this.aE) && (!this.aG) && ((this.az.b == null) || (this.az.b.b <= 0));
  }
  
  protected final void Y_()
  {
    super.Y_();
    View localView = this.N;
    if ((y_()) && (localView != null)) {
      this.a.setVisibility(8);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.uk);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    this.Z = new dej(this.bn, this.am.c());
    this.Z.k = this;
    this.Z.l = this;
    dej localdej = this.Z;
    String str = this.ai;
    localdej.d = this.ac;
    localdej.f = str;
    this.Z.j = true;
    this.Z.i = this.b;
    this.d = ((ColumnGridView)localView.findViewById(aaw.dS));
    this.d.b(i);
    this.d.a(new jrh(this.bn).a);
    this.d.c = true;
    ColumnGridView localColumnGridView1 = this.d;
    cfe localcfe = new cfe();
    localColumnGridView1.e.c = localcfe;
    this.d.a(this.Z);
    this.d.d(efj.qM);
    ColumnGridView localColumnGridView2 = this.d;
    localColumnGridView2.s = this;
    localColumnGridView2.c(0);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(aaw.it)).a = this.d;
    this.a = localView.findViewById(aaw.jo);
    jov localjov = this.ak;
    jpd localjpd = this.aJ;
    int j = aaw.iR;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
    localjov.a(localjpd, j, Arrays.asList(arrayOfString));
    a(localView, false);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new cfd(this.bn, null);
    }
    return new del(this.bn, this.am.c(), this.ai, null, this.aC);
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    boolean bool1 = true;
    if ((this.aa == null) || (this.aa.intValue() != paramInt) || (!(paramdmx instanceof dmu))) {}
    dmu localdmu;
    do
    {
      return;
      localdmu = (dmu)paramdmx;
    } while (!TextUtils.equals(localdmu.b, this.ae));
    this.aa = null;
    boolean bool2;
    View localView;
    if (localdmu.c != 200)
    {
      bool2 = bool1;
      this.aB = bool2;
      if (this.aB)
      {
        String str = g().getString(aau.rQ);
        Toast.makeText(f(), str, 0).show();
      }
      this.ag.add(Integer.valueOf(localdmu.a));
      this.af = bool1;
      localView = this.N;
      if (this.aj) {
        break label159;
      }
    }
    for (;;)
    {
      a(localView, bool1);
      this.aj = false;
      return;
      bool2 = false;
      break;
      label159:
      bool1 = false;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.c = this.m.getBoolean("local_folders_only");
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("photo_search_request")) {
        this.aa = Integer.valueOf(paramBundle.getInt("photo_search_request"));
      }
      if (paramBundle.containsKey("search_mode")) {
        this.ac = paramBundle.getInt("search_mode");
      }
      if (paramBundle.containsKey("query")) {
        this.ae = paramBundle.getCharSequence("query");
      }
      if (paramBundle.containsKey("delayed_query")) {
        this.ad = paramBundle.getCharSequence("delayed_query");
      }
      if (paramBundle.containsKey("results_present")) {
        this.af = paramBundle.getBoolean("results_present");
      }
      if (paramBundle.containsKey("is_first_request")) {
        this.aj = paramBundle.getBoolean("is_first_request");
      }
      if (paramBundle.containsKey("seen_search_modes")) {
        this.ag = ((HashSet)paramBundle.getSerializable("seen_search_modes"));
      }
      if (!TextUtils.isEmpty(this.ae)) {
        break label255;
      }
    }
    label255:
    String[] arrayOfString;
    for (this.ai = jrf.a(5, this.ac);; this.ai = jrf.a(5, arrayOfString))
    {
      C();
      if (this.ag == null) {
        this.ag = new HashSet();
      }
      this.ak.a(aaw.iR, this.aM);
      return;
      this.ad = this.m.getString("query");
      break;
      arrayOfString = new String[1];
      arrayOfString[0] = this.ae.toString();
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(isp paramisp)
  {
    if (!(paramisp instanceof jpu))
    {
      super.a(paramisp);
      return;
    }
    jpu localjpu = (jpu)paramisp;
    String str = localjpu.c;
    if ((str != null) && (jrf.m(str)))
    {
      ipf localipf = localjpu.b;
      int i = this.am.c();
      bdo localbdo = new bdo(this.bn, i);
      localbdo.b = localipf.a;
      localbdo.c = localipf;
      localbdo.e = jrf.b();
      localbdo.p = Integer.valueOf(this.aA.b);
      localbdo.g = this.az.b;
      localbdo.w = this.aA.c();
      localbdo.q = Integer.valueOf(2);
      localbdo.m = Boolean.valueOf(this.aF);
      b(localbdo.a());
      return;
    }
    super.a(paramisp);
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    if (!this.ah)
    {
      SearchView localSearchView = new SearchView(paramtp.g());
      localSearchView.a(false);
      if (this.ae != null) {
        localSearchView.a(this.ae, false);
      }
      localSearchView.k = g().getString(aau.sL);
      localSearchView.d();
      localSearchView.f = this;
      localSearchView.a(this.ae, false);
      if ((!this.ah) && (TextUtils.isEmpty(this.ae)) && (TextUtils.isEmpty(this.ad))) {
        localSearchView.requestFocus();
      }
      this.ab = localSearchView;
      paramtp.a(localSearchView);
      paramtp.e(true);
      paramtp.d(false);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return super.a(paramMenuItem);
  }
  
  public final boolean a(View paramView)
  {
    if ((paramView == null) || (paramView.getTag(aaw.la) == null)) {
      return false;
    }
    Long localLong = (Long)paramView.getTag(aaw.la);
    if (localLong == null) {}
    ipf localipf;
    for (long l = 0L;; l = localLong.longValue())
    {
      localipf = ((PhotoTileView)paramView).t;
      if (!a(localipf)) {
        break;
      }
      return true;
    }
    int i = this.am.c();
    bdo localbdo1;
    if ((l & 0x40000) != 0L)
    {
      localbdo1 = new bdo(f(), i);
      localbdo1.c = localipf;
      localbdo1.e = jrf.b();
      localbdo1.g = this.az.b;
      localbdo1.w = this.aA.c();
      localbdo1.p = Integer.valueOf(this.aA.b);
      localbdo1.q = Integer.valueOf(2);
    }
    bdo localbdo2;
    for (Intent localIntent = localbdo1.a();; localIntent = localbdo2.a())
    {
      efj.k(paramView);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.dm;
      localgxx.a(localgxw);
      b(localIntent);
      return true;
      String str = (String)paramView.getTag(aaw.ln);
      if (TextUtils.isEmpty(str)) {
        return false;
      }
      localbdo2 = new bdo(f(), i);
      localbdo2.b = str;
      localbdo2.e = this.ai;
      localbdo2.g = this.az.b;
      localbdo2.w = this.aA.c();
      localbdo2.p = Integer.valueOf(this.aA.b);
    }
  }
  
  public final boolean a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      efj.k(this.N);
      this.ab.clearFocus();
      if (!TextUtils.equals(paramString, this.ae)) {
        this.ag.clear();
      }
      this.ae = paramString;
      this.Z.e = this.ae.toString();
      if (this.ac != 2) {
        break label130;
      }
    }
    label130:
    for (gxz localgxz = gxz.dH;; localgxz = gxz.dI)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = localgxz;
      localgxx.a(localgxw);
      a(paramString, true);
      a(this.N, false);
      return true;
    }
  }
  
  public final boolean a_(int paramInt)
  {
    if (!super.a_(paramInt)) {
      return false;
    }
    if (this.c) {
      k().b(0, null, this);
    }
    for (;;)
    {
      return true;
      if (this.b) {
        k().b(0, null, this);
      }
      k().b(1, null, this);
    }
  }
  
  public final void b(int paramInt)
  {
    if (paramInt != this.ac)
    {
      this.ac = paramInt;
      this.ai = jrf.a(5, this.ac);
      if (this.Z != null)
      {
        dej localdej = this.Z;
        String str = this.ai;
        localdej.d = this.ac;
        localdej.f = str;
        this.d.a(this.Z);
        ColumnGridView localColumnGridView = this.d;
        localColumnGridView.removeAllViews();
        localColumnGridView.d();
        localColumnGridView.a();
        k().b(1, null, this);
        if (!this.ag.contains(Integer.valueOf(this.ac)))
        {
          a(this.ae, true);
          a(this.N, false);
        }
      }
    }
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    C();
    if (this.ah)
    {
      efj.k(this.N);
      Bundle localBundle = this.m;
      if ((localBundle != null) && (localBundle.getBoolean("is_videos_destination", false))) {
        paramgpr.d(aau.oi);
      }
      a(paramgpr, 0);
    }
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
    if ((!v()) && (this.af)) {
      if (this.aA.b != 0) {
        break label127;
      }
    }
    label127:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        paramgpr.b(aaw.jv);
      }
      return;
    }
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
    String str1;
    dej localdej;
    if (paramString == null)
    {
      str1 = null;
      this.ae = str1;
      if (this.Z != null)
      {
        localdej = this.Z;
        if (this.ae != null) {
          break label51;
        }
      }
    }
    label51:
    for (String str2 = "";; str2 = this.ae.toString())
    {
      localdej.e = str2;
      return true;
      str1 = paramString.trim();
      break;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ak = ((jov)this.bo.a(jov.class));
    this.aJ = ((jpd)this.bo.a(jpd.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("search_mode", this.ac);
    paramBundle.putBoolean("results_present", this.af);
    paramBundle.putBoolean("is_first_request", this.aj);
    if (this.aa != null) {
      paramBundle.putInt("photo_search_request", this.aa.intValue());
    }
    paramBundle.putCharSequence("query", this.ae);
    if (!TextUtils.isEmpty(this.ad)) {
      paramBundle.putCharSequence("delayed_query", this.ad);
    }
    paramBundle.putSerializable("seen_search_modes", this.ag);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.aL);
    if (this.aa != null)
    {
      int i = this.aa.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        break label203;
      }
      if (v())
      {
        hwq localhwq = this.aK;
        hwt localhwt = hwt.a;
        if (localhwt == null) {
          throw new NullPointerException();
        }
        localhwq.g = ((hwt)localhwt);
        localhwq.a();
      }
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.ad))
      {
        this.ae = this.ad;
        this.ad = null;
        this.Z.e = this.ae.toString();
        a(this.ae, false);
        this.al.a();
      }
      if ((!TextUtils.isEmpty(this.ae)) || (this.ah))
      {
        View localView = this.N.findViewById(aaw.dC);
        if (localView != null)
        {
          localView.requestFocus();
          localView.postDelayed(new cfc(this, localView), 50L);
        }
      }
      return;
      label203:
      dmx localdmx = EsService.a(this.aa.intValue());
      a(this.aa.intValue(), localdmx);
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.aL;
    EsService.d.remove(localdme);
    if ((this.ab != null) && (this.ab.findFocus() != null)) {
      efj.k(this.ab);
    }
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramView == this.ab)) {
      b(this.ab.a.getText().toString());
    }
  }
  
  public final boolean onLongClick(View paramView)
  {
    boolean bool1 = paramView instanceof PhotoTileView;
    boolean bool2 = false;
    if (bool1)
    {
      b((PhotoTileView)paramView);
      c(0);
      bool2 = true;
    }
    return bool2;
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.d);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.d);
  }
  
  public final gya r_()
  {
    Bundle localBundle = this.m;
    if ((localBundle != null) && (localBundle.getBoolean("is_videos_destination"))) {
      return gya.ak;
    }
    return gya.I;
  }
  
  public final boolean t_()
  {
    if (this.aE) {
      return super.s_();
    }
    return super.t_();
  }
  
  protected final boolean v()
  {
    return (this.Z != null) && (this.Z.getCount() == 0);
  }
  
  public final boolean y_()
  {
    return (this.aa != null) || (super.y_());
  }
  
  public final void z_()
  {
    super.z_();
    if (this.aa != null) {
      return;
    }
    this.aB = false;
    a(this.ae, false);
    a(this.N, false);
    Y_();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dx;
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cey
 * JD-Core Version:    0.7.0.1
 */