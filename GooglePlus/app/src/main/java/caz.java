import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.FastScrollContainer;
import com.google.android.apps.plus.views.FastScrollListView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class caz
  extends cff
  implements AbsListView.OnScrollListener, apb, ape, apy, aqh, cow, cqa, cw<apz>, dxg
{
  public static final mcs a = new mcs("debug.plus.all_photos_extended", (byte)0);
  private cpv Z;
  private cop[] aJ;
  private cbd aK;
  private boolean aL;
  private boolean aM;
  private aqf aN;
  private Map<aqi, aqc> aO;
  private aqi aP;
  private aos aQ;
  private aqk aR;
  private final hwq aS;
  private final dme aT;
  private final Runnable aU;
  private final Runnable aV;
  private FastScrollListView aa;
  private FastScrollContainer ab;
  private cmg<Long, Future> ac;
  private cmg<Long, iph> ad;
  private Integer ae;
  private Integer af;
  private aou ag;
  private Uri ah;
  private int ai;
  private buv aj;
  private coq ak;
  aol b;
  boolean c;
  boolean d;
  
  public caz()
  {
    cpv localcpv = new cpv(this, this.bp, this, 1);
    localcpv.c = true;
    this.Z = localcpv;
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.aS = localhwq;
    this.aT = new cba(this);
    this.aU = new cbb(this);
    this.aV = new cbc(this);
    new ash(this, this.bp, 0);
  }
  
  private final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if ((!this.aL) || (!this.aM) || (this.ae != null))
      {
        hwq localhwq2 = this.aS;
        hwt localhwt2 = hwt.a;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq2.g = ((hwt)localhwt2);
        localhwq2.a();
      }
    }
    for (;;)
    {
      if ((this.aL) && (this.aM) && (this.ag != null))
      {
        this.aa.setSelection(this.b.a(this.ag));
        this.ag = null;
      }
      a(this.aS);
      G();
      return;
      hwq localhwq3 = this.aS;
      hwt localhwt3 = hwt.c;
      if (localhwt3 == null) {
        throw new NullPointerException();
      }
      localhwq3.g = ((hwt)localhwt3);
      localhwq3.a();
      continue;
      hwq localhwq1 = this.aS;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
    }
  }
  
  public final boolean A()
  {
    Bundle localBundle = this.m;
    mbf localmbf = this.bn;
    int i = this.am.c();
    boolean bool1 = ((giz)mbb.a(localmbf, giz.class)).a(i).c("ab_status_bar_dismissed");
    int j;
    if (localBundle != null) {
      if ((this.ak != null) && (this.ak == coq.d))
      {
        j = 1;
        if ((j != 0) || (bool1)) {
          break label153;
        }
      }
    }
    label153:
    for (boolean bool2 = localBundle.getBoolean("show_autobackup_status", false);; bool2 = false)
    {
      boolean bool3 = this.am.e();
      boolean bool4 = false;
      if (bool3)
      {
        boolean bool5 = this.am.f().c("is_plus_page");
        bool4 = false;
        if (!bool5)
        {
          bool4 = false;
          if (bool2) {
            bool4 = true;
          }
        }
      }
      return bool4;
      j = 0;
      break;
    }
  }
  
  public final void C()
  {
    this.ak = null;
  }
  
  public final cop[] D()
  {
    return this.aJ;
  }
  
  public final void V_()
  {
    if (this.ae != null) {
      return;
    }
    mbf localmbf = this.bn;
    int i = this.am.c();
    long l = 20000 + this.ai;
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 106);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("all_photos_metadata_count", l);
    this.ae = Integer.valueOf(EsService.a(localmbf, localIntent));
    this.af = this.ae;
    this.b.a(true);
    c(this.N);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dN;
    localgxx.a(localgxw);
  }
  
  final void W_()
  {
    this.b.a(aow.e);
    cpv localcpv = this.Z;
    if (localcpv.d != null) {
      localcpv.d.a();
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.ub);
    Bundle localBundle = this.m;
    if (localBundle != null) {
      this.ah = ((Uri)localBundle.getParcelable("scroll_to_uri"));
    }
    this.aa = ((FastScrollListView)localView.findViewById(aaw.lH));
    this.ab = ((FastScrollContainer)localView.findViewById(aaw.lI));
    this.ab.a(this);
    this.Z.a(true);
    this.b = new aol(this.bn, this.am.c(), this.ab);
    this.b.notifyDataSetChanged();
    this.b.a(aow.d);
    lvz locallvz = this.at;
    if (locallvz.a != null) {
      locallvz.a.setEnabled(false);
    }
    aol localaol = this.b;
    if (this.ae != null) {}
    for (boolean bool = true;; bool = false)
    {
      localaol.a(bool);
      this.b.i = this.aQ;
      this.ac = new cmg(250 / this.b.b, this.b, this.b.f);
      this.ad = new cmg(2, this.b, this.b.g);
      if ("TRUE".equalsIgnoreCase(dun.k.a()))
      {
        mbf localmbf = this.bn;
        FastScrollListView localFastScrollListView = this.aa;
        View[] arrayOfView = new View[1];
        arrayOfView[0] = this.as;
        arv localarv = new arv(localmbf, localFastScrollListView, arrayOfView, this.b);
        this.b.h = localarv;
      }
      this.c = false;
      this.aa.setAdapter(this.b);
      this.aa.setRecyclerListener(new cbe());
      aqf localaqf1 = this.aN;
      aqi localaqi1 = aqi.b;
      aqd localaqd1 = new aqd(this.bn, this.b.b, this.bn.getResources().getDimensionPixelOffset(efj.kM), true);
      localaqf1.b.put(localaqi1, localaqd1);
      aqf localaqf2 = this.aN;
      aqi localaqi2 = aqi.a;
      aqd localaqd2 = new aqd(this.bn, this.b.b, this.bn.getResources().getDimensionPixelOffset(efj.kM), false);
      localaqf2.b.put(localaqi2, localaqd2);
      aqf localaqf3 = this.aN;
      aqi localaqi3 = aqi.c;
      aqe localaqe = new aqe(this.bn);
      localaqf3.b.put(localaqi3, localaqe);
      N().a(this.aa, this, this.ab);
      if (paramBundle == null) {
        k().a(0);
      }
      k().a(0, null, this);
      c(localView);
      this.aJ = buv.a(f(), this.am.c(), this, this);
      this.aj = new buv(this.bn, this, k(), 2, this.am.c(), this.aA.b);
      this.ab.a.a();
      return localView;
    }
  }
  
  public final fu<apz> a(int paramInt, Bundle paramBundle)
  {
    return new aqb(this.bn, this.am.c(), this.ah, null, this.ai, 10000, this.m.getInt("filter", 0));
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == dxh.b)
    {
      localgxx2 = (gxx)this.bo.a(gxx.class);
      localgxw2 = new gxw(this.bn);
      localgxw2.c = gxz.dP;
      localgxx2.a(localgxw2);
    }
    while (paramInt != dxh.c)
    {
      gxx localgxx2;
      gxw localgxw2;
      return;
    }
    gxx localgxx1 = (gxx)this.bo.a(gxx.class);
    gxw localgxw1 = new gxw(this.bn);
    localgxw1.c = gxz.dO;
    localgxx1.a(localgxw1);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("refresh_request")) {
        this.ae = Integer.valueOf(paramBundle.getInt("refresh_request"));
      }
      if (paramBundle.containsKey("scroll_position")) {
        this.ag = ((aou)paramBundle.getParcelable("scroll_position"));
      }
      if (paramBundle.containsKey("load_more_request")) {
        this.af = Integer.valueOf(paramBundle.getInt("load_more_request"));
      }
      if (paramBundle.containsKey("current_offset")) {
        this.ai = paramBundle.getInt("current_offset");
      }
      if (paramBundle.containsKey("waiting_for_loader")) {
        this.aK = cbd.valueOf(paramBundle.getString("waiting_for_loader"));
      }
    }
    switch (this.m.getInt("grid_type", 0))
    {
    }
    for (;;)
    {
      HandlerThread localHandlerThread = new HandlerThread("all-photos-list-transform", 10);
      localHandlerThread.start();
      this.aN = new aqf(localHandlerThread.getLooper(), this);
      return;
      this.aP = aqi.b;
      this.aQ = new aos(65600, 2);
      continue;
      this.aP = aqi.c;
      int i = (int)f().getResources().getDimension(efj.mr);
      this.aQ = new aos(65600, i, i);
    }
  }
  
  public final void a(PhotoTileView paramPhotoTileView, long paramLong)
  {
    ipf localipf = paramPhotoTileView.t;
    if (a(localipf)) {
      return;
    }
    int i = this.am.c();
    bdo localbdo = new bdo(f(), i);
    localbdo.c = localipf;
    localbdo.f = Long.valueOf(paramLong);
    localbdo.s = Integer.valueOf(this.ai);
    localbdo.e = jrf.a(1, new String[0]);
    localbdo.p = Integer.valueOf(this.aA.b);
    localbdo.g = this.az.b;
    localbdo.r = Boolean.valueOf(this.aI);
    localbdo.q = Integer.valueOf(this.aC);
    Intent localIntent = localbdo.a();
    if (localipf != null) {
      ((ipb)mbb.a(this.bn, ipb.class)).b(localipf, 5, 4160);
    }
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dm;
    localgxx.a(localgxw);
    b(localIntent);
  }
  
  public final void a(cop paramcop)
  {
    this.aM = true;
    if (paramcop != null)
    {
      this.ak = paramcop.e();
      this.b.a(paramcop.h());
    }
    for (;;)
    {
      c(this.N);
      if (paramcop != null) {
        paramcop.g();
      }
      return;
      this.ak = null;
      this.b.a(null);
    }
  }
  
  public final void a(fu<apz> paramfu) {}
  
  public final void a(isp paramisp)
  {
    if (!(paramisp instanceof bpr)) {
      return;
    }
    bpr localbpr = (bpr)paramisp;
    int i = this.am.c();
    bdo localbdo = new bdo(f(), i);
    localbdo.c = localbpr.b;
    localbdo.f = Long.valueOf(localbpr.a);
    localbdo.s = Integer.valueOf(this.ai);
    localbdo.e = jrf.a(1, new String[0]);
    localbdo.p = Integer.valueOf(this.aA.b);
    localbdo.g = this.az.b;
    localbdo.w = this.aA.c();
    localbdo.r = Boolean.valueOf(false);
    localbdo.h = Boolean.valueOf(this.aE);
    localbdo.i = Boolean.valueOf(this.aG);
    localbdo.j = this.aH;
    localbdo.m = Boolean.valueOf(this.aF);
    b(localbdo.a());
  }
  
  final void a(Integer paramInteger, dmx paramdmx)
  {
    if ((this.ae == null) || (this.ae != paramInteger)) {
      return;
    }
    this.ae = null;
    int i;
    boolean bool1;
    if (paramdmx != null) {
      if (paramdmx.c != 200)
      {
        i = 1;
        if (i == 0) {
          break label129;
        }
        String str = g().getString(aau.rR);
        Toast.makeText(f(), str, 0).show();
        boolean bool2 = Log.isLoggable("AllPhotosFragment", 6);
        bool1 = false;
        if (bool2) {
          Log.e("AllPhotosFragment", "unable to refresh photos", paramdmx.d);
        }
      }
    }
    for (;;)
    {
      this.af = null;
      c(this.N);
      this.b.a(bool1);
      return;
      i = 0;
      break;
      label129:
      Integer localInteger = this.af;
      bool1 = false;
      if (paramInteger == localInteger)
      {
        this.aK = cbd.a;
        this.ai = (10000 + this.ai);
        k().b(0, null, this);
        bool1 = true;
      }
    }
  }
  
  public final void a(Map<aqi, aqc> paramMap)
  {
    boolean bool1 = true;
    this.aO = paramMap;
    aqc localaqc;
    apz localapz;
    label41:
    int i;
    int j;
    label125:
    boolean bool2;
    if (this.aO != null)
    {
      localaqc = (aqc)this.aO.get(this.aP);
      if (localaqc == null) {
        break label364;
      }
      localapz = localaqc.c;
      this.aL = bool1;
      dka localdka = (dka)this.bo.a(dka.class);
      i = dux.a;
      if ((!this.am.e()) || (!localdka.d(this.am.c()))) {
        break label381;
      }
      if (!this.c) {
        break label370;
      }
      j = dux.b;
      Runnable localRunnable2 = this.aU;
      efj.m().postDelayed(localRunnable2, 5000L);
      if (this.at == null) {
        break label495;
      }
      lvz locallvz = this.at;
      if (locallvz.a != null) {
        locallvz.a.setEnabled(bool1);
      }
      bool2 = false;
    }
    for (;;)
    {
      label158:
      Object localObject;
      label178:
      Boolean localBoolean;
      boolean bool3;
      if (Log.isLoggable("AllPhotosFragment", 4))
      {
        if (localapz == null)
        {
          localObject = "null";
          String str = String.valueOf(localObject);
          int m = this.am.c();
          new StringBuilder(56 + String.valueOf(str).length()).append("Loaded ").append(str).append(" photos. Processing: ").append(bool2).append(" AccountId: ").append(m);
        }
      }
      else
      {
        if (localapz == null) {
          break label435;
        }
        localBoolean = localapz.d;
        if (localBoolean != null) {
          break label425;
        }
        bool3 = false;
        label268:
        if (localapz.c != null) {
          this.ai = localapz.c.intValue();
        }
        label288:
        aol localaol = this.b;
        if (this.ai == 0) {
          break label446;
        }
        label301:
        localaol.a(localaqc, j, bool3, bool1);
        if (this.aK == null) {
          break label468;
        }
        this.b.a(false);
        if (this.aK != cbd.a) {
          break label451;
        }
        this.aa.setSelection(0);
        label345:
        this.aK = null;
      }
      for (;;)
      {
        c(this.N);
        return;
        localaqc = null;
        break;
        label364:
        localapz = null;
        break label41;
        label370:
        W_();
        j = i;
        break label125;
        label381:
        this.c = bool1;
        Runnable localRunnable1 = this.aU;
        efj.m().removeCallbacks(localRunnable1);
        j = dux.a;
        bool2 = bool1;
        break label158;
        localObject = Integer.valueOf(localapz.a.length);
        break label178;
        label425:
        bool3 = localBoolean.booleanValue();
        break label268;
        label435:
        this.ai = 0;
        bool3 = false;
        break label288;
        label446:
        bool1 = false;
        break label301;
        label451:
        this.aa.setSelection(this.b.getCount());
        break label345;
        label468:
        int k = this.b.d;
        if (k != -1) {
          this.aa.setSelection(k);
        }
      }
      label495:
      bool2 = false;
    }
  }
  
  protected final boolean a(View paramView)
  {
    return false;
  }
  
  public final boolean a(PhotoTileView paramPhotoTileView)
  {
    ipf localipf = paramPhotoTileView.t;
    boolean bool = false;
    if (localipf != null)
    {
      b(paramPhotoTileView);
      c(0);
      bool = true;
    }
    return bool;
  }
  
  public final void aa_()
  {
    if ((this.b != null) && (!this.d))
    {
      this.d = true;
      Runnable localRunnable = this.aV;
      efj.m().postDelayed(localRunnable, 500L);
    }
  }
  
  public final void b()
  {
    if ((this.af != null) && (this.ae != null) && (this.af.equals(this.ae))) {
      this.ae = null;
    }
    this.af = null;
    this.ai = Math.max(0, -10000 + this.ai);
    this.aK = cbd.b;
    k().b(0, null, this);
    this.b.a(true);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    int i = this.am.c();
    mbb localmbb = this.bo;
    localmbb.a(apo.class, apo.a(i));
    localmbb.a(app.class, new app(this.bn, i));
    localmbb.a(cpu.class, this.Z);
    localmbb.a(apy.class, this);
    localmbb.a(apb.class, this);
    localmbb.a(ape.class, this);
    localmbb.a(bwn.class, this.Z);
    if ("TRUE".equalsIgnoreCase(dun.h.a())) {
      this.bo.a(cyr.class, new cyr(this.bn));
    }
    this.aR = ((aqk)this.bo.b(aqk.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ae != null) {
      paramBundle.putInt("refresh_request", this.ae.intValue());
    }
    if (this.af != null) {
      paramBundle.putInt("load_more_request", this.af.intValue());
    }
    if (this.aK != null) {
      paramBundle.putString("waiting_for_loader", this.aK.name());
    }
    if ((this.aa != null) && (this.b != null)) {
      paramBundle.putParcelable("scroll_position", this.b.a(this.aa.getFirstVisiblePosition()));
    }
    paramBundle.putInt("current_offset", this.ai);
  }
  
  public final void m()
  {
    super.m();
    if (f().isFinishing()) {
      return;
    }
    EsService.a(this.bn, this.aT);
    if (this.ae != null)
    {
      int i = this.ae.intValue();
      if (EsService.b.containsKey(Integer.valueOf(i)))
      {
        if (v())
        {
          hwq localhwq = this.aS;
          hwt localhwt = hwt.a;
          if (localhwt == null) {
            throw new NullPointerException();
          }
          localhwq.g = ((hwt)localhwt);
          localhwq.a();
        }
        this.b.a(true);
      }
    }
    for (;;)
    {
      this.aj.a();
      this.ab.a.a();
      return;
      dmx localdmx = EsService.a(this.ae.intValue());
      a(this.ae, localdmx);
      continue;
      if (this.af == null) {
        if (!((dka)mbb.a(this.bn, dka.class)).d(this.am.c()))
        {
          this.ae = Integer.valueOf(EsService.a(f(), this.am.c(), false));
          this.b.a(true);
        }
        else if (dka.a(this.bn))
        {
          ((gzj)this.bo.a(gzj.class)).b(new aok(this.bn));
        }
      }
    }
  }
  
  public final void n()
  {
    super.n();
    this.ac.a();
    this.ad.a();
    this.ab.a.b();
    Runnable localRunnable = this.aU;
    efj.m().removeCallbacks(localRunnable);
    dme localdme = this.aT;
    EsService.d.remove(localdme);
  }
  
  public final void o()
  {
    aqf localaqf = this.aN;
    localaqf.getLooper().quit();
    localaqf.a = null;
    localaqf.b = null;
    ((app)mbb.a(this.bn, app.class)).c.shutdown();
    super.o();
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    this.ad.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    this.ac.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((this.aR != null) && (paramInt == 0))
    {
      int i = paramAbsListView.getFirstVisiblePosition();
      aou localaou = this.b.a(i);
      if (localaou != null) {
        this.aR.a(this, localaou);
      }
    }
  }
  
  public final gya r_()
  {
    return gya.aa;
  }
  
  protected final boolean v()
  {
    return (this.b == null) || (this.b.e == 0);
  }
  
  public final boolean y_()
  {
    return (this.ae != null) || (super.y_());
  }
  
  public final boolean z()
  {
    return (super.z()) && (this.am.e());
  }
  
  public final void z_()
  {
    super.z_();
    if (this.ae != null) {
      return;
    }
    boolean bool1 = O();
    bp localbp = f();
    int i = this.am.c();
    if (!bool1) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      this.ae = Integer.valueOf(EsService.a(localbp, i, bool2));
      if (!bool1)
      {
        this.b.a(null, dux.a, false, false);
        this.b.a(aow.d);
        if (this.at != null)
        {
          lvz locallvz = this.at;
          if (locallvz.a != null) {
            locallvz.a.setEnabled(false);
          }
        }
      }
      this.af = null;
      this.b.a(true);
      c(this.N);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     caz
 * JD-Core Version:    0.7.0.1
 */