import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.service.SlideshowService;
import com.google.android.apps.plus.views.PhotoViewPager;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bdp
  extends cff
  implements ass, bxe, cw<Cursor>, dyk, dyv, hqn, ok
{
  clc Z;
  Integer a;
  private final bec aJ = new bec(this);
  private String aK;
  private hqo aL;
  private ipf aM;
  private boolean aN;
  private boolean aO;
  private clc aP;
  private final Set<bel> aQ = new HashSet();
  private final List<x> aR = new ArrayList();
  private final Set<x> aS;
  private final Set<bxf> aT;
  private final bbv aU;
  private final ayy aV;
  private TiledImageView aW;
  private String aX;
  private String aY;
  private int aZ;
  final bej aa;
  boolean ab;
  boolean ac;
  boolean ad;
  bea ae;
  View af;
  boolean ag;
  ObjectAnimator ah;
  Runnable ai;
  int aj;
  Runnable ak;
  int b = 0;
  private bdl ba;
  private final azq bb;
  private BroadcastReceiver bc;
  private int bd;
  private boolean be;
  PhotoViewPager c;
  int d;
  
  public bdp()
  {
    new HashSet();
    this.aS = new HashSet();
    this.aT = new HashSet();
    this.aU = new bed(this);
    this.aV = new bee(this);
    this.aa = new bdz();
    this.ba = new bdl();
    this.bb = new azq();
    this.bc = new bdq(this);
    this.bd = -1;
    this.ai = null;
    this.ak = new bdr(this);
    new ash(this, this.bp, 0);
  }
  
  private final void a(fu paramfu, int paramInt)
  {
    if ((paramInt >= 0) && ((paramfu instanceof dfx)) && (this.aL.d.b()))
    {
      Object localObject = this.aL.d.c();
      ((dfx)paramfu).a(localObject, paramInt);
    }
  }
  
  private static void a(boolean paramBoolean, View paramView)
  {
    View localView = paramView.findViewById(aaw.cY);
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      paramView.findViewById(aaw.cZ).setVisibility(8);
      return;
    }
  }
  
  private static boolean d(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 4) || (paramInt == 3);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.uj);
    Bundle localBundle = this.m;
    int i = this.am.c();
    RectF localRectF;
    label309:
    String str;
    boolean bool1;
    boolean bool2;
    label376:
    int k;
    int m;
    label414:
    label467:
    boolean bool3;
    if (paramBundle != null)
    {
      this.aU.a(paramBundle.getBoolean("show_shapes"));
      this.d = paramBundle.getInt("current_item");
      this.aa.a(paramBundle.getBoolean("full_screen"));
      if (paramBundle.containsKey("pending_request_id")) {
        this.a = Integer.valueOf(paramBundle.getInt("pending_request_id"));
      }
      this.b = paramBundle.getInt("operation_type", 0);
      this.aN = paramBundle.getBoolean("collection_refreshed");
      this.aO = paramBundle.getBoolean("loaded_not_empty");
      this.ac = paramBundle.getBoolean("slideshow_enabled");
      this.ad = paramBundle.getBoolean("local_slideshow");
      this.be = paramBundle.getBoolean("performed_in_animation");
      this.aK = paramBundle.getString("view_id");
      this.aj = paramBundle.getInt("all_photos_offset");
      if (!localBundle.getBoolean("com.google.android.libraries.social.notifications.FROM_NOTIFICATION"))
      {
        mbf localmbf = this.bn;
        localmbf.startService(SlideshowService.a(localmbf));
      }
      this.aW = ((TiledImageView)localView.findViewById(aaw.lG));
      this.af = localView.findViewById(aaw.ay);
      localRectF = (RectF)localBundle.getParcelable("thumbnail_view_bounds");
      if (localRectF != null) {
        break label816;
      }
      if (!this.be)
      {
        this.ag = true;
        this.be = true;
        this.aW.setVisibility(8);
        bds localbds = new bds(this);
        efj.m().postDelayed(localbds, 500L);
      }
      this.aX = localBundle.getString("auth_key");
      this.aY = localBundle.getString("event_id");
      str = this.aK;
      bool1 = localBundle.getBoolean("disable_photo_comments", false);
      if ((i == -1) || (!jrf.a(this.bn, i).equals(str))) {
        break label917;
      }
      bool2 = true;
      ipf localipf1 = (ipf)localBundle.getParcelable("photo_ref");
      k = localBundle.getInt("picker_mode", 0);
      if ((localipf1 == null) || (k != 3)) {
        break label923;
      }
      m = 1;
      if (m == 0) {
        break label929;
      }
      this.aL = new dfu(this.bn, h(), localipf1, localBundle.getBoolean("prevent_edit", false), localBundle.getBoolean("prevent_share", false), localBundle.getBoolean("prevent_delete", false));
      this.aL.a(this);
      this.c = ((PhotoViewPager)localView.findViewById(aaw.hx));
      this.c.a(this.aL);
      this.c.p = this;
      this.c.o = this;
      if (this.ag) {
        break label1253;
      }
      bool3 = true;
      label527:
      a(bool3, localView);
      if (m == 0)
      {
        if (!this.m.containsKey("all_photos_row_id")) {
          break label1259;
        }
        k().a(0, null, new bdw(this));
      }
    }
    for (;;)
    {
      if (this.am.e())
      {
        ContextThemeWrapper localContextThemeWrapper = new ContextThemeWrapper(this.bn, efj.yh);
        this.Z = new clc(localContextThemeWrapper, this.x, k(), i, 0);
        this.Z.r = false;
        this.Z.s = true;
        this.Z.j = true;
        this.Z.v = true;
        this.Z.e = -1;
        this.Z.m = false;
        this.Z.a(paramBundle);
        this.aP = new clc(localContextThemeWrapper, this.x, k(), i, 1);
        this.aP.j = true;
        this.aP.r = true;
      }
      if (paramBundle != null)
      {
        this.aM = ((ipf)paramBundle.getParcelable("auto_switch_ref"));
        if (paramBundle.getBoolean("reset_pager_after_zoom")) {
          this.ai = new beb(this, localView);
        }
      }
      return localView;
      this.d = -1;
      this.aU.a(false);
      this.aa.a(false);
      this.aK = localBundle.getString("view_id");
      this.aj = localBundle.getInt("all_photos_offset", 0);
      break;
      label816:
      if ((localRectF == null) || (this.be)) {
        break label309;
      }
      if (Build.VERSION.SDK_INT >= 14) {}
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label915;
        }
        this.ae = new bea(this, localRectF);
        this.ag = true;
        this.be = true;
        this.aW.setVisibility(8);
        a(true);
        this.af.setAlpha(0.0F);
        Runnable localRunnable = this.ak;
        efj.m().postDelayed(localRunnable, 500L);
        break;
      }
      label915:
      break label309;
      label917:
      bool2 = false;
      break label376;
      label923:
      m = 0;
      break label414;
      label929:
      if ((str != null) && (jrf.m(str))) {}
      for (int n = 1;; n = 0)
      {
        if (n == 0) {
          break label1032;
        }
        this.aL = new dco(this.bn, h(), null, this.am.c(), str, localBundle.getBoolean("force_return_edit_list", false), bool2, localBundle.getBoolean("prevent_edit", false), localBundle.getBoolean("prevent_share", false), localBundle.getBoolean("prevent_delete", false), this.aI);
        break;
      }
      label1032:
      if (this.m.containsKey("all_photos_row_id"))
      {
        ipf localipf2 = (ipf)localBundle.getParcelable("photo_ref");
        this.aL = new cxu(this.bn, h(), i, this.aI, localBundle.getLong("all_photos_row_id"), localBundle.getBoolean("force_return_edit_list", false), localipf2, localBundle.getInt("all_photos_offset", 0));
        break label467;
      }
      if (d(k))
      {
        this.aL = new den(this.bn, h(), null, i, localBundle.getBoolean("prevent_edit", false), localBundle.getBoolean("prevent_share", false), localBundle.getBoolean("prevent_delete", false), localBundle.getBoolean("force_return_edit_list", false), localBundle.getBoolean("selected_only", false), bool2);
        break label467;
      }
      this.aL = new cxw(this.bn, h(), null, str, i, bool1, this.aX, this.aY, this.aI, localBundle.getBoolean("show_oob_tile", false), localBundle.getBoolean("launch_comments_at_start", false));
      break label467;
      label1253:
      bool3 = false;
      break label527;
      label1259:
      k().a(0, null, this);
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    String str1 = localBundle.getString("tile_id");
    String str2 = localBundle.getString("photo_id");
    boolean bool1 = localBundle.getBoolean("oob_only", false);
    boolean bool2 = localBundle.getBoolean("show_oob_tile", false);
    boolean bool3 = localBundle.containsKey("shareables");
    ArrayList localArrayList = null;
    if (bool3) {
      localArrayList = localBundle.getParcelableArrayList("shareables");
    }
    Object localObject;
    if (localBundle.getBoolean("selected_only", false))
    {
      isq localisq = (isq)localBundle.getParcelable("photo_picker_selected");
      if ((localisq != null) && (localisq.b > 0))
      {
        ipf localipf3 = (ipf)localBundle.getParcelable("photo_ref");
        localObject = new dem(this.bn, this.am.c(), null, localisq.a(jpx.class), localipf3, localArrayList, this.aC);
        if ((localObject instanceof dfx))
        {
          if (this.aM == null) {
            break label435;
          }
          ((dfx)localObject).a(this.aM);
        }
      }
    }
    label435:
    while (this.d == -1)
    {
      return localObject;
      if (jrf.m(this.aK))
      {
        ipf localipf1 = (ipf)localBundle.getParcelable("photo_ref");
        mbf localmbf2 = this.bn;
        int k = localBundle.getInt("filter", 0);
        if (this.aM != null) {}
        for (ipf localipf2 = this.aM;; localipf2 = localipf1)
        {
          localObject = new dch(localmbf2, localArrayList, k, localipf2, this.aK, null);
          break;
        }
      }
      if (d(localBundle.getInt("picker_mode", 0)))
      {
        mbf localmbf1 = this.bn;
        int i = this.am.c();
        String str3 = this.aK;
        int j = this.aC;
        localObject = new dem(localmbf1, i, str3, str1, str2, bool1, localArrayList, j);
        break;
      }
      if (localBundle.containsKey("photos_id_array"))
      {
        String[] arrayOfString = localBundle.getStringArray("photos_id_array");
        localObject = new deb(this.bn, this.am.c(), this.aK, arrayOfString, bool1);
        break;
      }
      localObject = new def(this.bn, this.am.c(), this.aK, str1, str2, bool2, bool1, this.aC);
      break;
    }
    a((fu)localObject, this.d);
    return localObject;
  }
  
  public final void a(int paramInt)
  {
    this.d = paramInt;
    this.aL.g = paramInt;
    if (i()) {
      a(k().b(0), this.d);
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2) {}
  
  public final void a(Canvas paramCanvas)
  {
    if (this.ae != null) {
      this.ae.a(paramCanvas);
    }
  }
  
  public final void a(View paramView, Drawable paramDrawable, RectF paramRectF)
  {
    if (this.ae != null) {
      this.ae.a(paramView, paramDrawable, paramRectF);
    }
  }
  
  public final void a(bel parambel)
  {
    this.aQ.add(parambel);
  }
  
  public final void a(bk parambk, int paramInt)
  {
    bem localbem = (bem)parambk;
    this.bb.a = paramInt;
    if ((!this.ag) && (parambk == null)) {}
    for (boolean bool = true;; bool = false)
    {
      a(bool, this.N);
      if (localbem != null)
      {
        this.ba.a = localbem.ac;
        if (!this.ag)
        {
          localbem.ai = true;
          localbem.v();
        }
      }
      Iterator localIterator1 = this.aQ.iterator();
      while (localIterator1.hasNext()) {
        ((bel)localIterator1.next()).a(parambk);
      }
    }
    Iterator localIterator2 = this.aS.iterator();
    while (localIterator2.hasNext()) {
      localIterator2.next();
    }
  }
  
  public final void a(bxf parambxf)
  {
    this.aT.add(parambxf);
    parambxf.a(this.aZ);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(ipf paramipf, String paramString)
  {
    this.aM = paramipf;
    fu localfu = k().b(0);
    if ((localfu instanceof dfx)) {
      ((dfx)localfu).a(paramipf);
    }
    if ((!TextUtils.isEmpty(paramString)) && (!TextUtils.equals(paramString, this.aK)))
    {
      this.aK = paramString;
      Intent localIntent = new Intent();
      localIntent.putExtra("view_id", this.aK);
      f().setResult(-1, localIntent);
    }
    if (this.s) {
      if (!this.m.containsKey("all_photos_row_id")) {
        break label129;
      }
    }
    label129:
    for (Object localObject = new bdw(this);; localObject = this)
    {
      k().b(0, null, (cw)localObject);
      return;
    }
  }
  
  public final void a(List<Uri> paramList, bti parambti)
  {
    int i = 1;
    if ((parambti == null) || (parambti.a() != i)) {}
    ArrayList localArrayList;
    do
    {
      return;
      localArrayList = parambti.b();
    } while (localArrayList.size() != i);
    ipf localipf = (ipf)localArrayList.get(0);
    if (localipf.d != null) {
      if ((i == 0) || (paramList.isEmpty())) {
        break label132;
      }
    }
    label132:
    for (Uri localUri = (Uri)paramList.get(0);; localUri = localipf.d)
    {
      a(ipf.a(f(), localipf.a, localipf.b.b, localipf.b.a, localipf.c, localUri, localipf.e), this.aK);
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(tp paramtp)
  {
    if (this.m.getBoolean("disable_up_button")) {
      paramtp.c(false);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.aa.a() == paramBoolean) {
      return;
    }
    bp localbp = f();
    tp localtp;
    if ((localbp instanceof tt))
    {
      localtp = ((tt)localbp).e().a();
      label37:
      if (localtp != null)
      {
        if (!paramBoolean) {
          break label96;
        }
        localtp.e();
      }
    }
    for (;;)
    {
      this.aa.a(paramBoolean);
      Iterator localIterator = this.aS.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
      break;
      localtp = null;
      break label37;
      label96:
      localtp.d();
    }
  }
  
  final void a(boolean paramBoolean, int paramInt1, int paramInt2, hqs paramhqs)
  {
    boolean bool1 = true;
    if (!paramBoolean) {}
    for (boolean bool2 = bool1;; bool2 = false)
    {
      this.ab = bool2;
      if ((!this.aO) || (!paramBoolean)) {
        break;
      }
      f().finish();
      return;
    }
    boolean bool3 = this.m.getBoolean("refresh_collection", false);
    if ((!this.aN) && ((paramBoolean) || (bool3)))
    {
      this.aN = bool1;
      if (this.am.e()) {
        new bdx(f(), this.am.c(), this.m.getString("view_id"), this.aX, this.aY).execute(null);
      }
    }
    int j;
    if (paramBoolean)
    {
      a(bool3, this.N);
      if (!bool3)
      {
        View localView1 = this.N;
        View localView2 = localView1.findViewById(aaw.cZ);
        if (!bool1) {
          break label300;
        }
        j = 0;
        label174:
        localView2.setVisibility(j);
        localView1.findViewById(aaw.cY).setVisibility(8);
        this.bd = 0;
        this.aj = 0;
        label204:
        if (this.ag)
        {
          hqo localhqo = this.aL;
          localhqo.f = this.bd;
          localhqo.d();
        }
        if (this.d == -1) {
          break label326;
        }
      }
    }
    label300:
    label326:
    for (int i = this.d;; i = this.bd)
    {
      this.aL.a(paramhqs, i);
      this.c.a(i, false);
      if ((i == 0) && (!paramBoolean)) {
        a(0);
      }
      this.aM = null;
      this.al.a();
      return;
      bool1 = false;
      break;
      j = 8;
      break label174;
      this.aO = bool1;
      this.bd = paramInt1;
      this.aj = paramInt2;
      break label204;
    }
  }
  
  protected final boolean a(View paramView)
  {
    return false;
  }
  
  public final void b(int paramInt)
  {
    this.aZ = paramInt;
    Iterator localIterator = this.aT.iterator();
    while (localIterator.hasNext()) {
      ((bxf)localIterator.next()).a(paramInt);
    }
  }
  
  public final void b(bel parambel)
  {
    this.aQ.remove(parambel);
  }
  
  public final void b(bxf parambxf)
  {
    this.aT.remove(parambxf);
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    paramgpr.c(aaw.jv).setVisible(false);
    d(paramgpr);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    mbb localmbb = this.bo;
    localmbb.a(bxe.class, this);
    localmbb.a(avi.class, new bdy(this));
    localmbb.a(bbv.class, this.aU);
    localmbb.a(bej.class, this.aa);
    localmbb.a(azq.class, this.bb);
    localmbb.a(ayy.class, this.aV);
    localmbb.a(dyk.class, this);
    this.ba = ((bdl)this.bo.a(bdl.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("show_shapes", this.aU.a());
    paramBundle.putInt("current_item", this.c.d);
    paramBundle.putBoolean("full_screen", this.aa.a());
    paramBundle.putInt("operation_type", this.b);
    paramBundle.putBoolean("collection_refreshed", this.aN);
    paramBundle.putBoolean("loaded_not_empty", this.aO);
    paramBundle.putParcelable("auto_switch_ref", this.aM);
    paramBundle.putBoolean("slideshow_enabled", this.ac);
    paramBundle.putBoolean("local_slideshow", this.ad);
    paramBundle.putBoolean("performed_in_animation", this.be);
    if (this.ai != null) {}
    for (boolean bool = true;; bool = false)
    {
      paramBundle.putBoolean("reset_pager_after_zoom", bool);
      paramBundle.putString("view_id", this.aK);
      paramBundle.putInt("all_photos_offset", this.aj);
      if (this.a != null) {
        paramBundle.putInt("pending_request_id", this.a.intValue());
      }
      if (this.Z != null) {
        this.Z.b(paramBundle);
      }
      return;
    }
  }
  
  public final void m()
  {
    super.m();
    this.ax.a(this);
    TiledImageView localTiledImageView = this.aW;
    if (TiledImageView.a) {
      localTiledImageView.b.c.d();
    }
    EsService.a(this.bn, this.aJ);
    if (this.a != null)
    {
      int i = this.a.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.a.intValue());
        this.aJ.j(this.a.intValue(), localdmx);
      }
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.google.android.apps.photos.SLIDESHOW_STATE");
    fy.a(this.bn).a(this.bc, localIntentFilter);
    mbf localmbf1 = this.bn;
    Intent localIntent = new Intent(localmbf1, SlideshowService.class);
    localIntent.setAction("com.google.android.apps.photos.QUERY_STATE");
    localmbf1.startService(localIntent);
    if ((this.ad) && (this.ac))
    {
      mbf localmbf2 = this.bn;
      localmbf2.startService(SlideshowService.a(localmbf2, this.m, -1 + this.d));
    }
    if (this.aM != null) {
      if (!this.m.containsKey("all_photos_row_id")) {
        break label277;
      }
    }
    label277:
    for (Object localObject = new bdw(this);; localObject = this)
    {
      k().b(0, null, (cw)localObject);
      if (this.ai != null)
      {
        Runnable localRunnable = this.ai;
        efj.m().post(localRunnable);
      }
      return;
    }
  }
  
  @TargetApi(14)
  public final void n()
  {
    super.n();
    this.ax.b(this);
    TiledImageView localTiledImageView = this.aW;
    if (TiledImageView.a) {
      localTiledImageView.b.c.c();
    }
    bec localbec = this.aJ;
    EsService.d.remove(localbec);
    if (this.bc != null) {
      fy.a(this.bn).a(this.bc);
    }
    if (!((jqb)this.bo.a(jqb.class)).b())
    {
      mbf localmbf = this.bn;
      localmbf.startService(SlideshowService.a(localmbf));
    }
    if (this.ah != null)
    {
      this.ah.cancel();
      u_();
    }
    if (this.ai != null)
    {
      Runnable localRunnable = this.ai;
      efj.m().removeCallbacks(localRunnable);
    }
  }
  
  public final void o()
  {
    TiledImageView localTiledImageView = this.aW;
    if (TiledImageView.a) {
      localTiledImageView.h.g.a();
    }
    this.aW = null;
    this.aL.g = -1;
    super.o();
  }
  
  public final void p_()
  {
    super.p_();
    if (this.am.e())
    {
      if (this.Z != null) {
        this.Z.f();
      }
      if (this.aP != null) {
        this.aP.f();
      }
    }
  }
  
  public final void q_()
  {
    super.q_();
    if (this.am.e())
    {
      if (this.Z != null) {
        this.Z.x.removeMessages(0);
      }
      if (this.aP != null) {
        this.aP.x.removeMessages(0);
      }
    }
  }
  
  public final gya r_()
  {
    return gya.ad;
  }
  
  public final boolean s_()
  {
    if (this.aE) {
      return super.s_();
    }
    return false;
  }
  
  public final boolean t_()
  {
    if (this.aE) {
      return super.s_();
    }
    return super.t_();
  }
  
  @TargetApi(11)
  final void u_()
  {
    Runnable localRunnable1 = this.ak;
    efj.m().removeCallbacks(localRunnable1);
    this.ah = null;
    this.ag = false;
    a(false);
    View localView = this.N;
    if (localView == null) {
      return;
    }
    this.af.setAlpha(1.0F);
    this.ai = new beb(this, localView);
    Runnable localRunnable2 = this.ai;
    efj.m().post(localRunnable2);
  }
  
  protected final boolean v()
  {
    return false;
  }
  
  public final TiledImageView x()
  {
    return this.aW;
  }
  
  public final boolean y()
  {
    this.aV.a(false);
    int i = 0;
    boolean bool1 = false;
    while (i < this.aR.size())
    {
      bool1 |= ((x)this.aR.get(i)).a_();
      i++;
    }
    Iterator localIterator = this.aQ.iterator();
    while (localIterator.hasNext()) {
      bool1 |= ((bel)localIterator.next()).a();
    }
    boolean bool2;
    if (!this.aU.b())
    {
      bool2 = false;
      if (!bool1) {}
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdp
 * JD-Core Version:    0.7.0.1
 */