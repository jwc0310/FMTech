import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.FastScrollContainer;
import com.google.android.apps.plus.views.FastScrollListView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cbq
  extends cff
  implements atp, ave<List<atq>>, cmh<ipf, iph>, cw<Cursor>, dty, dxg
{
  private static mcs a = new mcs("compilation_list_view", (byte)0);
  private boolean Z;
  private final dme aJ;
  private boolean aa;
  private Integer ab;
  private boolean ac;
  private boolean ad;
  private ipb ae;
  private Uri af;
  private cmg<ipf, iph> ag;
  private Float ah;
  private avf<Cursor, List<atq>> ai;
  private Rect aj = new Rect();
  private final hwq ak;
  private FastScrollListView b;
  private FastScrollContainer c;
  private are d;
  
  public cbq()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.ak = localhwq;
    new ash(this, this.bp, 0);
    this.aJ = new cbr(this);
  }
  
  public static boolean A()
  {
    return false;
  }
  
  private final String C()
  {
    String str = this.m.getString("owner_id");
    if ((str == null) && (this.am.c() != -1)) {
      str = this.am.f().b("gaia_id");
    }
    return jrf.a(2, new String[] { str });
  }
  
  private final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if ((!this.Z) || (this.ac) || (this.ab != null))
      {
        hwq localhwq2 = this.ak;
        hwt localhwt2 = hwt.a;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq2.g = ((hwt)localhwt2);
        localhwq2.a();
        if ((v()) || (this.ah == null) || (this.ah.floatValue() <= 0.0D)) {
          break label216;
        }
        this.b.setSelection(this.d.a(this.ah.floatValue()));
        this.ah = null;
      }
    }
    for (;;)
    {
      a(this.ak);
      G();
      return;
      hwq localhwq3 = this.ak;
      hwt localhwt3 = hwt.c;
      if (localhwt3 == null) {
        throw new NullPointerException();
      }
      localhwq3.g = ((hwt)localhwt3);
      localhwq3.a();
      break;
      hwq localhwq1 = this.ak;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      break;
      label216:
      if (this.af != null)
      {
        this.b.setSelection(this.d.a(this.af));
        this.af = null;
      }
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.ud);
    Bundle localBundle = this.m;
    this.c = ((FastScrollContainer)localView.findViewById(aaw.lI));
    this.c.a(this);
    this.d = new are();
    this.b = ((FastScrollListView)localView.findViewById(aaw.lH));
    this.b.setAdapter(this.d);
    this.ag = new cmg(2, this.d, this);
    N().a(this.b, this, this.c);
    if (paramBundle == null) {
      k().a(0);
    }
    k().a(0, null, this);
    this.af = ((Uri)localBundle.getParcelable("scroll_to_uri"));
    if (paramBundle != null)
    {
      this.aa = paramBundle.getBoolean("first_refresh_finished");
      this.ad = paramBundle.getBoolean("accessibility_enabled");
      if (paramBundle.containsKey("scroll_pos"))
      {
        this.ah = Float.valueOf(paramBundle.getFloat("scroll_pos"));
        this.af = null;
      }
    }
    c(localView);
    this.c.a.a();
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new cxt(this.bn, this.am.c(), C());
  }
  
  public final List<iph> a(List<ipf> paramList)
  {
    if (this.aj.isEmpty()) {
      return new ArrayList();
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      ipf localipf = (ipf)localIterator.next();
      localArrayList.add(this.ae.a(localipf, this.aj.width(), this.aj.height(), 64));
    }
    return localArrayList;
  }
  
  public final void a(int paramInt) {}
  
  final void a(int paramInt, dmx paramdmx)
  {
    boolean bool = true;
    if ((this.ab == null) || (this.ab.intValue() != paramInt)) {
      return;
    }
    this.ab = null;
    this.aa = bool;
    int i;
    if (paramdmx != null) {
      if (paramdmx.c != 200)
      {
        i = bool;
        if (i == 0) {
          break label113;
        }
      }
    }
    for (;;)
    {
      this.aB = bool;
      if (this.aB)
      {
        String str = g().getString(aau.rR);
        Toast.makeText(f(), str, 0).show();
      }
      c(this.N);
      this.b.setSelection(0);
      return;
      i = 0;
      break;
      label113:
      bool = false;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("refresh_request"))) {
      this.ab = Integer.valueOf(paramBundle.getInt("refresh_request"));
    }
    HandlerThread localHandlerThread = new HandlerThread("collectionlist-fragment", 10);
    localHandlerThread.start();
    this.ai = new avf(localHandlerThread.getLooper(), new avh(this.bn, C(), this.aj), this);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, Long paramLong)
  {
    int i;
    int j;
    label57:
    jqa localjqa2;
    if ((paramLong != null) && ((0x40000 & paramLong.longValue()) != 0L))
    {
      i = 1;
      j = this.m.getInt("photo_picker_crop_mode", 0);
      if (i == 0) {
        break label250;
      }
      mbf localmbf = this.bn;
      int k = this.am.c();
      if (paramString == null) {
        break label243;
      }
      localjqa2 = efj.c(localmbf, k, paramString);
      localjqa2.c = Integer.valueOf(this.aA.b);
      localjqa2.d = Integer.valueOf(this.aC);
      localjqa2.f = this.az.b;
      localjqa2.g = Boolean.valueOf(this.aD);
      localjqa2.h = Boolean.valueOf(this.aE);
      localjqa2.i = Boolean.valueOf(this.aG);
      localjqa2.j = this.aH;
      localjqa2.e = Integer.valueOf(j);
      localjqa2.p = Boolean.valueOf(this.m.getBoolean("show_autobackup_status"));
    }
    label243:
    label250:
    jqa localjqa1;
    for (Intent localIntent = localjqa2.a();; localIntent = localjqa1.a())
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.do;
      localgxx.a(localgxw);
      b(localIntent);
      return;
      i = 0;
      break;
      paramString = jrf.a();
      break label57;
      localjqa1 = new jqa(f(), HostStreamSingleAlbumTileActivity.class, this.am.c());
      localjqa1.a = paramString;
      localjqa1.c = Integer.valueOf(this.aA.b);
      localjqa1.d = Integer.valueOf(this.aC);
      localjqa1.f = this.az.b;
      localjqa1.g = Boolean.valueOf(this.aD);
      localjqa1.h = Boolean.valueOf(this.aE);
      localjqa1.i = Boolean.valueOf(this.aG);
      localjqa1.j = this.aH;
      localjqa1.e = Integer.valueOf(j);
      localjqa1.t = Integer.valueOf(this.aC);
      localjqa1.q = this.m.getString("button_title_res_id", null);
      if (this.m.containsKey("max_selection_count")) {
        localjqa1.s = Integer.valueOf(this.m.getInt("max_selection_count"));
      }
      if (this.m.containsKey("min_selection_count")) {
        localjqa1.r = Integer.valueOf(this.m.getInt("min_selection_count"));
      }
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return super.a(paramMenuItem);
  }
  
  protected final boolean a(View paramView)
  {
    return false;
  }
  
  public final void a_(boolean paramBoolean)
  {
    this.ac = false;
    if ((paramBoolean) && (f() != null)) {
      z_();
    }
    c(this.N);
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    if (this.am.e())
    {
      a(paramgpr, 0);
      gqe localgqe = (gqe)paramgpr.a(aaw.iq);
      localgqe.b = Math.max(1, localgqe.b);
    }
  }
  
  public final void b(List<iph> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      iph localiph = (iph)localIterator.next();
      this.ae.a.d(localiph);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(atp.class, this);
    this.ae = ((ipb)this.bo.a(ipb.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ab != null) {
      paramBundle.putInt("refresh_request", this.ab.intValue());
    }
    if ((this.d != null) && (!this.d.isEmpty()))
    {
      are localare = this.d;
      int i = this.b.getFirstVisiblePosition();
      arg localarg = new arg();
      ((atq)localare.a.get(i)).a(localarg);
      paramBundle.putFloat("scroll_pos", localarg.a);
    }
    paramBundle.putBoolean("first_refresh_finished", this.aa);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.aJ);
    if (this.ab != null)
    {
      int i = this.ab.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        break label130;
      }
      if (v())
      {
        hwq localhwq = this.ak;
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
      boolean bool = efj.B(this.bn);
      if (bool != this.ad)
      {
        this.ad = bool;
        this.d.notifyDataSetChanged();
      }
      this.c.a.a();
      return;
      label130:
      dmx localdmx = EsService.a(this.ab.intValue());
      a(this.ab.intValue(), localdmx);
    }
  }
  
  public final void n()
  {
    super.n();
    if (this.ag != null) {
      this.ag.a();
    }
    this.c.a.b();
    dme localdme = this.aJ;
    EsService.d.remove(localdme);
  }
  
  public final void o()
  {
    avf localavf = this.ai;
    localavf.getLooper().quit();
    localavf.a = null;
    super.o();
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    this.ag.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.b);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.b);
  }
  
  public final gya r_()
  {
    return gya.av;
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
    return (this.d == null) || (this.d.isEmpty());
  }
  
  public final boolean y_()
  {
    return (this.ab != null) || (super.y_());
  }
  
  public final boolean z()
  {
    return (super.z()) && (this.am.e());
  }
  
  public final void z_()
  {
    super.z_();
    if (this.ab != null) {
      return;
    }
    this.aB = false;
    this.ab = Integer.valueOf(EsService.b(this.bn, this.am.c(), this.am.f().b("gaia_id"), null));
    c(this.N);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dx;
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbq
 * JD-Core Version:    0.7.0.1
 */