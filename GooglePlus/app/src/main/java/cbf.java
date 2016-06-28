import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.AutoAwesomeMovieTileView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.HashSet;
import java.util.Map;

public final class cbf
  extends cff
  implements View.OnClickListener, View.OnLongClickListener, cw<Cursor>
{
  private boolean Z;
  ColumnGridView a;
  private final dme aa = new cbg(this);
  private final hwq ab;
  private cxy b;
  private Integer c;
  private boolean d;
  
  public cbf()
  {
    hwq localhwq = new hwq(this.bp);
    localhwq.h = new cbh(this);
    this.ab = localhwq;
  }
  
  private final void C()
  {
    this.c = Integer.valueOf(EsService.a(this.bn, this.am.c(), "#autoawesome", 1, null, jrf.a(5, new String[] { "#autoawesome" })));
  }
  
  private final void a(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {
      return;
    }
    if ((v()) || (!this.d)) {
      if (this.c == null)
      {
        hwq localhwq2 = this.ab;
        if (this.d) {}
        hwq localhwq3;
        hwt localhwt2;
        for (int i = aau.lH;; i = aau.jn)
        {
          localhwq2.d = null;
          localhwq2.c = i;
          localhwq2.e();
          localhwq3 = this.ab;
          localhwt2 = hwt.c;
          if (localhwt2 != null) {
            break;
          }
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt2);
        localhwq3.a();
      }
    }
    for (;;)
    {
      a(this.ab);
      G();
      return;
      hwq localhwq1 = this.ab;
      hwt localhwt1 = hwt.a;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      continue;
      hwq localhwq4 = this.ab;
      hwt localhwt3 = hwt.b;
      if (localhwt3 == null) {
        throw new NullPointerException();
      }
      localhwq4.g = ((hwt)localhwt3);
      localhwq4.a();
      if (paramBoolean)
      {
        ColumnGridView localColumnGridView = this.a;
        localColumnGridView.removeAllViews();
        localColumnGridView.d();
        localColumnGridView.a();
      }
    }
  }
  
  private final boolean b(int paramInt)
  {
    if (((iwb)this.bo.a(iwb.class)).a(paramInt)) {
      ((ivl)this.bo.a(ivl.class)).b();
    }
    return false;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.uk);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    this.b = new cxy(this.bn, this.am.c());
    this.b.k = this;
    this.b.l = this;
    cxy localcxy = this.b;
    String str = jrf.a(5, new String[] { "#autoawesome" });
    localcxy.d = 1;
    localcxy.f = str;
    this.b.e = "#autoawesome";
    this.b.i = true;
    this.b.j = true;
    this.a = ((ColumnGridView)localView.findViewById(aaw.dS));
    this.a.b(i);
    this.a.a(new jrh(this.bn).a);
    this.a.c = true;
    ColumnGridView localColumnGridView1 = this.a;
    cbi localcbi = new cbi();
    localColumnGridView1.e.c = localcbi;
    this.a.a(this.b);
    this.a.d(efj.qM);
    ColumnGridView localColumnGridView2 = this.a;
    localColumnGridView2.s = this;
    localColumnGridView2.c(0);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(aaw.it)).a = this.a;
    this.Z = b(this.am.c());
    if ((this.am.e()) && (this.Z)) {
      k().a(0, null, this);
    }
    k().a(1, null, this);
    a(localView, false);
    bua.c(this.bn, this.am.c(), false);
    if (paramBundle == null) {
      C();
    }
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new cxz(this.bn, this.am.c(), this.aC);
    }
    return new del(this.bn, this.am.c(), jrf.a(5, new String[] { "#autoawesome" }), null, this.aC);
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    if ((this.c == null) || (this.c.intValue() != paramInt) || (!(paramdmx instanceof dmu))) {}
    dmu localdmu;
    do
    {
      return;
      localdmu = (dmu)paramdmx;
    } while (!TextUtils.equals(localdmu.b, "#autoawesome"));
    this.c = null;
    if (localdmu.c != 200) {}
    for (boolean bool = true;; bool = false)
    {
      this.aB = bool;
      if (this.aB)
      {
        String str = g().getString(aau.rQ);
        Toast.makeText(f(), str, 0).show();
      }
      this.d = true;
      a(this.N, true);
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("photo_search_request")) {
        this.c = Integer.valueOf(paramBundle.getInt("photo_search_request"));
      }
      if (paramBundle.containsKey("results_present")) {
        this.d = paramBundle.getBoolean("results_present");
      }
    }
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    cxy localcxy;
    if (paramfu.i == 0)
    {
      localcxy = this.b;
      localcxy.a(1, null);
      if ((localcxy.i) && (0 != 0) && (null.getCount() != 0)) {
        break label53;
      }
      localcxy.g = null;
    }
    for (;;)
    {
      localcxy.a(0, localcxy.g);
      return;
      label53:
      if (localcxy.g == null)
      {
        localcxy.g = new hqr(new String[0]);
        Object[] arrayOfObject = new Object[0];
        localcxy.g.a(arrayOfObject);
      }
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
    if (((paramView instanceof PhotoTileView)) && (a(((PhotoTileView)paramView).t))) {
      return true;
    }
    Long localLong = (Long)paramView.getTag(aaw.la);
    long l;
    int i;
    Intent localIntent;
    if (localLong == null)
    {
      l = 0L;
      i = this.am.c();
      if (!(paramView instanceof AutoAwesomeMovieTileView)) {
        break label172;
      }
      String str2 = (String)paramView.getTag(aaw.kX);
      localIntent = ((anz)mbb.a(this.bn, anz.class)).a(str2, false);
    }
    for (;;)
    {
      efj.k(paramView);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.dm;
      localgxx.a(localgxw);
      b(localIntent);
      return true;
      l = localLong.longValue();
      break;
      label172:
      if ((l & 0x40000) != 0L)
      {
        ipf localipf = ((PhotoTileView)paramView).t;
        isq localisq = new isq();
        localisq.a(new jpu(localipf));
        bdo localbdo2 = new bdo(f(), i);
        localbdo2.c = localipf;
        localbdo2.g = localisq;
        localbdo2.w = this.aA.c();
        localbdo2.l = Boolean.valueOf(true);
        localbdo2.r = Boolean.valueOf(false);
        localbdo2.p = Integer.valueOf(3);
        localIntent = localbdo2.a();
      }
      else
      {
        String str1 = (String)paramView.getTag(aaw.ln);
        if (TextUtils.isEmpty(str1)) {
          return false;
        }
        bdo localbdo1 = new bdo(f(), i);
        localbdo1.b = str1;
        localbdo1.e = jrf.a(5, new String[] { "#autoawesome" });
        localbdo1.g = this.az.b;
        localbdo1.w = this.aA.c();
        localbdo1.r = Boolean.valueOf(false);
        localbdo1.p = Integer.valueOf(this.aA.b);
        localIntent = localbdo1.a();
      }
    }
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    paramgpr.d(aau.od);
    efj.k(this.N);
    a(paramgpr, 0);
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("results_present", this.d);
    if (this.c != null) {
      paramBundle.putInt("photo_search_request", this.c.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.aa);
    boolean bool = this.Z;
    this.Z = b(this.am.c());
    if (bool != this.Z)
    {
      if (!this.Z) {
        break label128;
      }
      k().a(0, null, this);
    }
    hwq localhwq;
    hwt localhwt;
    for (;;)
    {
      C();
      if (this.c == null) {
        break label154;
      }
      int i = this.c.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        break label169;
      }
      if (!v()) {
        break label154;
      }
      localhwq = this.ab;
      localhwt = hwt.a;
      if (localhwt != null) {
        break;
      }
      throw new NullPointerException();
      label128:
      k().a(0);
    }
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
    for (;;)
    {
      label154:
      this.N.findViewById(aaw.dC).requestFocus();
      return;
      label169:
      dmx localdmx = EsService.a(this.c.intValue());
      a(this.c.intValue(), localdmx);
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.aa;
    EsService.d.remove(localdme);
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
    lwo.c(this.a);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.a);
  }
  
  public final gya r_()
  {
    return gya.aj;
  }
  
  protected final boolean v()
  {
    return (this.b != null) && (this.b.getCount() == 0);
  }
  
  public final boolean y_()
  {
    return (this.c != null) || (super.y_());
  }
  
  public final boolean z()
  {
    return true;
  }
  
  public final void z_()
  {
    super.z_();
    if (this.c != null) {
      return;
    }
    this.aB = false;
    C();
    a(this.N, false);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dx;
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbf
 * JD-Core Version:    0.7.0.1
 */