import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import android.transition.Transition;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import com.google.android.apps.plus.phone.PeopleListActivity;
import com.google.android.apps.plus.phone.ProfileEditActivity;
import com.google.android.apps.plus.phone.ProfileSquareListActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.OneProfileHeader;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import com.google.android.libraries.social.ui.tabbar.TabBar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class cdo
  extends cge
  implements View.OnClickListener, att, auc, cpa, cqa, cw<Cursor>, dgy, dhc, dhf, dxq, dxs, dza, gii, gqk, gzi, hgh, hgz, hhm, jfc, jfm, jfp, jfr, jfs, jgb, jgc, jgk, jgl, jhs, lea, lgo, lgp, luu, lwa
{
  public static final mcr a = new mcr("enable_profile_photo_highlights");
  private static int aQ;
  private static final Cursor aR = new hqr(cyd.r);
  long Z;
  private final Handler aS = new Handler();
  private final cpv aT;
  private hqr aU;
  private Cursor aV;
  private long aW;
  private Cursor aX;
  private Integer aY;
  private boolean aZ;
  Cursor aa;
  Integer ab;
  Integer ac;
  int ad;
  boolean ae;
  String af;
  boolean ag;
  boolean ah;
  boolean ai;
  boolean aj;
  boolean ak;
  int al;
  boolean am;
  lta an;
  bot ao;
  boolean ap;
  final dha aq;
  ddo b;
  private final DataSetObserver bA;
  private Integer ba;
  private Integer bb;
  private Integer bc;
  private boolean bd;
  private Integer be;
  private int bf;
  private boolean bg;
  private jly bh;
  private boolean bi;
  private boolean bj;
  private gxq bk;
  private int bl;
  private hho bm;
  private jia bq;
  private Drawable br;
  private dsr bs;
  private jov bt;
  private final jpe bu;
  private lpr bv;
  private lpr bw;
  private final dme bx;
  private final cw<Cursor> by;
  private final cw<bru> bz;
  int c;
  long d;
  
  public cdo()
  {
    cpv localcpv = new cpv(this, this.bp, this, 102);
    localcpv.c = true;
    this.aT = localcpv;
    this.ae = true;
    this.al = -1;
    this.am = true;
    this.bl = -2147483648;
    this.ap = false;
    this.aq = new cye(this, this.bp);
    this.bu = new cdp(this);
    new jie(this.bp).c = this;
    new gzc(this, new cec(this));
    this.bx = new cds(this);
    this.by = new cdt(this);
    this.bz = new cdu(this);
    this.bA = new cdx(this);
  }
  
  private final void a(int paramInt, dmx paramdmx)
  {
    if ((this.ac == null) || (this.ac.intValue() != paramInt)) {
      return;
    }
    ah();
    int j;
    if (paramdmx != null)
    {
      if (paramdmx.c != 200)
      {
        j = 1;
        if ((j == 0) && (paramdmx.d == null)) {
          break label102;
        }
      }
    }
    else if (!this.aJ)
    {
      bp localbp = f();
      int i = aau.uV;
      efj.a(localbp, localbp.getResources().getText(i), 0).show();
    }
    for (;;)
    {
      this.ac = null;
      N_();
      return;
      j = 0;
      break;
      label102:
      this.ab = EsService.c(f(), this.at.c(), this.af, true);
      N_();
    }
  }
  
  private final void a(int paramInt, boolean paramBoolean, dmx paramdmx)
  {
    if ((this.bc == null) || (this.bc.intValue() != paramInt)) {
      return;
    }
    ah();
    this.bc = null;
    N_();
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int k = 1; k != 0; k = 0)
      {
        bp localbp3 = f();
        int m = aau.uV;
        efj.a(localbp3, localbp3.getResources().getText(m), 0).show();
        return;
      }
    }
    if (paramBoolean)
    {
      bp localbp2 = f();
      int j = aau.sv;
      efj.a(localbp2, localbp2.getResources().getText(j), 0).show();
      return;
    }
    bp localbp1 = f();
    int i = aau.sw;
    efj.a(localbp1, localbp1.getResources().getText(i), 0).show();
  }
  
  private final void a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = this.at.c();
    a(efj.a(f(), i, paramInt, paramArrayOfByte1, paramArrayOfByte2), 106);
    g(paramInt);
  }
  
  private final void a(gxz paramgxz, Intent paramIntent)
  {
    Bundle localBundle2;
    if (paramIntent != null)
    {
      int j = paramIntent.getIntExtra("profile_data_id", 0);
      if (j > 0)
      {
        localBundle2 = new Bundle();
        localBundle2.putInt("extra_profile_edit_field", j);
      }
    }
    for (Bundle localBundle1 = localBundle2;; localBundle1 = null)
    {
      int i = this.at.c();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = paramgxz;
      if (localBundle1 != null) {
        localgxw.h.putAll(localBundle1);
      }
      localgxx.a(localgxw);
      return;
    }
  }
  
  private final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    bp localbp = f();
    if (!this.av.a())
    {
      localbp.startActivity(this.av.b());
      return;
    }
    if (this.bq.d(localbp, this.at.c()))
    {
      Bundle localBundle2 = b(paramBoolean1, paramBoolean2);
      this.bq.a(this, this.at.c(), "first_circle_add", localBundle2);
      return;
    }
    String str1 = null;
    if (paramBoolean2) {
      str1 = brn.a(localbp, this.aO, paramBoolean1);
    }
    boolean bool1 = this.bj;
    boolean bool2 = false;
    if (bool1)
    {
      bool2 = false;
      if (paramBoolean1)
      {
        bool2 = false;
        if (str1 != null)
        {
          bool2 = true;
          if (this.bq.e(localbp, this.at.c()))
          {
            String str2 = brn.a(localbp, paramBoolean1);
            Bundle localBundle1 = b(paramBoolean1, paramBoolean2);
            this.bq.a(this, this.at.c(), "first_circle_add_one_click", this.b.Z, str2, localBundle1);
            return;
          }
        }
      }
    }
    if (str1 == null)
    {
      kat localkat = (kat)this.bo.b(kat.class);
      if (localkat != null) {
        localkat.a(localkat.a(3, 2));
      }
      int i = this.at.c();
      a(efj.a(f(), i, this.af, null, null, null, null, true), 101);
      return;
    }
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(str1);
    a(new ArrayList(0), localArrayList, this.af, this.b.Z, null, null, 0, bool2, false);
  }
  
  private final lpr an()
  {
    if (this.bv != null) {
      return this.bv;
    }
    this.bv = new lpr(this.bw);
    this.bv.a = (this.bw.a << 1);
    this.bv.b = (this.bw.b / 2);
    this.bv.c = this.ao.d();
    return this.bv;
  }
  
  private final void ao()
  {
    int i = this.at.c();
    a(efj.g(f(), i, this.aD));
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.bV;
    localgxx.a(localgxw);
  }
  
  private final void ap()
  {
    this.ab = EsService.c(this.bn, this.at.c(), this.af, true);
    N_();
  }
  
  private final void aq()
  {
    mbf localmbf = this.bn;
    int i = this.at.c();
    String str = jjf.c(this.af);
    if (!this.ax.a()) {}
    for (boolean bool = true;; bool = false)
    {
      this.ba = Integer.valueOf(EsService.a(localmbf, i, str, null, bool));
      N_();
      return;
    }
  }
  
  private final void ar()
  {
    if (this.ah) {
      ((hgx)this.bo.a(hgx.class)).a();
    }
  }
  
  private static Bundle b(boolean paramBoolean1, boolean paramBoolean2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("for_sharing", paramBoolean1);
    localBundle.putBoolean("prefer_default_circle", paramBoolean2);
    return localBundle;
  }
  
  private final void b(int paramInt, dmx paramdmx)
  {
    if ((this.ab == null) || (this.ab.intValue() != paramInt)) {
      return;
    }
    ah();
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label96;
      }
    }
    label96:
    for (int j = 1;; j = 0)
    {
      if ((j != 0) || (paramdmx.d != null)) {
        if (!this.aJ)
        {
          bp localbp = f();
          int i = aau.uV;
          efj.a(localbp, localbp.getResources().getText(i), 0).show();
        }
      }
      this.ab = null;
      N_();
      return;
    }
  }
  
  private final void b(int paramInt, boolean paramBoolean, dmx paramdmx)
  {
    if ((this.be == null) || (this.be.intValue() != paramInt)) {
      return;
    }
    ah();
    this.be = null;
    N_();
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        bp localbp = f();
        int j = aau.uV;
        efj.a(localbp, localbp.getResources().getText(j), 0).show();
        c(false, paramBoolean);
        return;
      }
    }
    c(true, paramBoolean);
  }
  
  private final void b(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = this.at.c();
    a(efj.b(f(), i, paramInt, paramArrayOfByte1, paramArrayOfByte2), 106);
    g(paramInt);
  }
  
  private final void c(int paramInt, dmx paramdmx)
  {
    if ((this.bb == null) || (this.bb.intValue() != paramInt)) {
      return;
    }
    ah();
    this.bb = null;
    N_();
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int j = 1; j != 0; j = 0)
      {
        bp localbp2 = f();
        int k = aau.uV;
        efj.a(localbp2, localbp2.getResources().getText(k), 0).show();
        return;
      }
    }
    bp localbp1 = f();
    int i = aau.sf;
    efj.a(localbp1, localbp1.getResources().getText(i), 0).show();
  }
  
  private final void c(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = this.at.c();
    Intent localIntent = new Intent(f(), ProfileEditActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("profile_edit_view_type", paramInt);
    localIntent.putExtra("profile_edit_items_proto", paramArrayOfByte1);
    localIntent.putExtra("profile_edit_roster_proto", paramArrayOfByte2);
    localIntent.putExtra("profile_data_id", paramInt);
    a(localIntent, 106);
    g(paramInt);
  }
  
  private final void c(boolean paramBoolean1, boolean paramBoolean2)
  {
    ddo localddo = this.b;
    localddo.s = false;
    if (paramBoolean1) {
      localddo.G = paramBoolean2;
    }
    localddo.p();
    localddo.o();
    this.as.a();
  }
  
  private final void d(int paramInt, dmx paramdmx)
  {
    if ((this.ba == null) || (this.ba.intValue() != paramInt)) {
      return;
    }
    this.ba = null;
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label103;
      }
    }
    label103:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        Resources localResources = g();
        if ((paramdmx.c != 404) && (!this.aJ)) {
          efj.a(f(), localResources.getString(aau.rR), 0).show();
        }
        k().b(101, null, this);
      }
      N_();
      return;
    }
  }
  
  private final void f(Intent paramIntent)
  {
    try
    {
      a(paramIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (!Log.isLoggable("HostedProfileFragment", 6)) {}
      String str = String.valueOf(paramIntent);
      Log.e("HostedProfileFragment", 24 + String.valueOf(str).length() + "Cannot launch activity: " + str, localActivityNotFoundException);
    }
  }
  
  private final void g(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_profile_edit_field", paramInt);
    int i = this.at.c();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.w;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
  }
  
  private final void j(boolean paramBoolean)
  {
    this.be = EsService.b(this.bn, this.at.c(), this.af, this.b.Z, paramBoolean);
    ddo localddo = this.b;
    localddo.s = true;
    localddo.p();
    localddo.o();
    if (paramBoolean)
    {
      if (this.b.B) {}
      for (i = aau.cE;; i = aau.cF)
      {
        gxx localgxx2 = (gxx)this.bo.a(gxx.class);
        gxw localgxw2 = new gxw(this.bn);
        localgxw2.c = gxz.bD;
        localgxx2.a(localgxw2);
        e(i);
        return;
      }
    }
    if (this.b.B) {}
    for (int i = aau.va;; i = aau.vb)
    {
      gxx localgxx1 = (gxx)this.bo.a(gxx.class);
      gxw localgxw1 = new gxw(this.bn);
      localgxw1.c = gxz.bE;
      localgxx1.a(localgxw1);
      break;
    }
  }
  
  private final void k(boolean paramBoolean)
  {
    boolean bool1 = true;
    if (o("change_photo")) {
      return;
    }
    dgz localdgz1 = ((dhd)this.bo.a(dhd.class)).e().a(aI_().getString(aau.dn));
    bp localbp = f();
    Intent localIntent = efj.b("camera-photo.jpg");
    boolean bool2;
    label105:
    dgz localdgz3;
    if (localbp.getPackageManager().queryIntentActivities(localIntent, 65536).size() > 0)
    {
      bool2 = bool1;
      dgz localdgz2 = localdgz1.a(bool2).b(bool1);
      if (this.b.L == null) {
        break label166;
      }
      localdgz3 = localdgz2.d(bool1);
      if (!this.b.J) {
        break label171;
      }
    }
    label166:
    label171:
    for (long l = this.b.q().longValue();; l = 0L)
    {
      localdgz3.a(l).c(paramBoolean).a().a(h(), "change_photo");
      return;
      bool2 = false;
      break;
      bool1 = false;
      break label105;
    }
  }
  
  private final boolean o(String paramString)
  {
    return (bj)this.x.a(paramString) != null;
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final Integer B()
  {
    return null;
  }
  
  public final Integer C()
  {
    return null;
  }
  
  protected final boolean K()
  {
    return this.ah;
  }
  
  public final void L()
  {
    String str = jrf.a(null, jjf.c(this.af), "profile", "ALBUM");
    int i = this.at.c();
    jqa localjqa = new jqa(f(), HostStreamSingleAlbumTileActivity.class, i);
    localjqa.a = jrf.a(3, new String[] { str });
    a(localjqa.a());
  }
  
  public final void M()
  {
    String str = jrf.a(null, this.aD, this.b.L, "ALBUM");
    int i = this.at.c();
    bdo localbdo = new bdo(f(), i);
    localbdo.e = jrf.a(3, new String[] { str });
    localbdo.d = this.b.M;
    localbdo.c = ipf.a(f(), this.b.N, ipm.a);
    localbdo.k = Boolean.valueOf(true);
    Intent localIntent = localbdo.a();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dm;
    localgxx.a(localgxw);
    a(localIntent);
  }
  
  public final void N()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label29:
    boolean bool4;
    if (!this.b.B)
    {
      bool2 = bool1;
      if (TextUtils.isEmpty(this.b.F)) {
        break label64;
      }
      bool3 = bool1;
      if (bool3) {
        break label69;
      }
      bool4 = bool1;
      label36:
      if ((!bool4) || ((!this.bj) && (bool2))) {
        break label75;
      }
    }
    for (;;)
    {
      a(bool2, bool1);
      return;
      bool2 = false;
      break;
      label64:
      bool3 = false;
      break label29;
      label69:
      bool4 = false;
      break label36;
      label75:
      bool1 = false;
    }
  }
  
  protected final void N_()
  {
    super.N_();
    if ((!this.ax.a()) && (this.am))
    {
      lvz locallvz = this.ax;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
    }
  }
  
  public final boolean O()
  {
    if (this.bj)
    {
      if (!this.b.B) {}
      for (boolean bool = true;; bool = false)
      {
        a(bool, false);
        return true;
      }
    }
    return false;
  }
  
  public final void P()
  {
    ao();
  }
  
  public final void Q()
  {
    ao();
  }
  
  public final void R()
  {
    int i = this.at.c();
    bp localbp = f();
    String str = this.af;
    Intent localIntent = new Intent(localbp, ProfileSquareListActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("person_id", str);
    a(localIntent);
  }
  
  public final int R_()
  {
    return 138;
  }
  
  public final void S()
  {
    a(this.bs.a(this.at.c()));
  }
  
  public final void T()
  {
    new con().a(this.x, "zagat_explanation");
  }
  
  final Bundle U()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("person_id", this.af);
    return localBundle;
  }
  
  protected final int V()
  {
    return super.V() + aQ;
  }
  
  public final void W()
  {
    super.W();
    ap();
    int i = this.at.c();
    if (this.al == 2) {
      aq();
    }
    for (;;)
    {
      ad();
      return;
      if (this.al == 5)
      {
        this.ao.a(i, this.ah, this.aD);
      }
      else if (this.al == 1)
      {
        this.ao.a(i, this.aD);
        ar();
      }
    }
  }
  
  protected final boolean X()
  {
    return (this.az == null) || (this.az.getCount() == 1);
  }
  
  protected final void Y()
  {
    int i = efj.y(this.bn) + aQ;
    this.ax.b = i;
  }
  
  public final boolean Z_()
  {
    if ((!super.Z_()) && (!this.am) && (this.ab == null) && (this.bb == null) && (this.bc == null) && (this.be == null) && (this.ac == null) && (this.ba == null))
    {
      if (this.ao != null)
      {
        bot localbot = this.ao;
        this.at.c();
        if (!localbot.a(this.ah, this.aD)) {}
      }
    }
    else {
      return true;
    }
    return false;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.bn);
    if (aQ == 0) {
      aQ = g().getDimensionPixelSize(efj.nt);
    }
    ViewGroup localViewGroup1 = (ViewGroup)super.a(localLayoutInflater, paramViewGroup, paramBundle);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.findViewById(aaw.fC);
    TabBar localTabBar = new TabBar(this.bn);
    localTabBar.b();
    localTabBar.setVisibility(4);
    localTabBar.b = this;
    localTabBar.a(this.al);
    localViewGroup2.addView(localTabBar, new FrameLayout.LayoutParams(-1, aQ));
    this.b = ((ddo)this.az);
    ddo localddo1 = this.b;
    String str = this.af;
    boolean bool1 = this.ah;
    boolean bool2 = this.ag;
    jly localjly1 = this.bh;
    cpv localcpv = this.aT;
    localddo1.p = str;
    localddo1.q = bool1;
    localddo1.r = bool2;
    localddo1.am = localjly1;
    jly localjly2 = localddo1.am;
    DataSetObserver localDataSetObserver = localddo1.ao;
    localjly2.b.registerObserver(localDataSetObserver);
    int i = localddo1.aM.getResources().getDimensionPixelOffset(efj.kM);
    localddo1.a = new cya(localddo1.aM, null, localddo1.ar, jjf.c(localddo1.p), true, localcpv, localcpv, false, false, null);
    localddo1.a.i = i;
    cya localcya = localddo1.a;
    localcya.q = null;
    localcya.r = true;
    localcya.notifyDataSetChanged();
    localddo1.a.s = false;
    ddo localddo2 = this.b;
    localddo2.b = this;
    localddo2.c = this;
    localddo2.d = this;
    localddo2.e = this;
    localddo2.f = this;
    localddo2.g = this;
    localddo2.h = this;
    localddo2.i = this;
    localddo2.j = this;
    localddo2.l = this;
    localddo2.m = this;
    localddo2.n = this;
    localddo2.k = this;
    localddo2.o = this;
    this.b.a.w = this;
    if (this.be != null)
    {
      ddo localddo3 = this.b;
      localddo3.s = true;
      localddo3.p();
      localddo3.o();
    }
    this.b.af = localTabBar;
    this.b.c(this.al);
    cob localcob;
    int j;
    Resources localResources;
    if ((this.aZ) && (Build.VERSION.SDK_INT != 21))
    {
      localcob = new cob(f(), this.bn, this.b, this.au, (FrameLayout)localViewGroup1.findViewById(aaw.av), localViewGroup1.findViewById(aaw.lV));
      if (Build.VERSION.SDK_INT < 21) {
        break label775;
      }
      j = 1;
      if (j != 0)
      {
        localResources = localcob.a.getResources();
        if (localResources.getConfiguration().getLayoutDirection() != 1) {
          break label781;
        }
      }
    }
    label775:
    label781:
    for (boolean bool3 = true;; bool3 = false)
    {
      Window localWindow = localcob.a.getWindow();
      localWindow.setSharedElementsUseOverlay(false);
      localcob.a.setEnterSharedElementCallback(new coc(localcob, localResources, bool3, localWindow));
      Transition localTransition = localWindow.getSharedElementEnterTransition();
      if (localTransition != null)
      {
        localcob.h = new cod(localcob);
        localTransition.addListener(localcob.h);
      }
      localcob.c.a(new coe(localcob));
      localcob.e = new cof(localcob);
      lvi locallvi = localcob.d;
      lvh locallvh = localcob.e;
      locallvi.a.add(locallvh);
      hwq localhwq = this.aw;
      localhwq.a = false;
      localhwq.b = false;
      localhwq.h = new cea(this);
      this.br = localViewGroup1.getBackground();
      if (this.al == 5)
      {
        this.ay.a = an();
        ad();
        this.b.a(true, -1);
        ae();
      }
      return localViewGroup1;
      j = 0;
      break;
    }
  }
  
  protected final dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    return new ddo(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, new cgn(this), null, paramlob);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    case 102: 
    default: 
      if (Log.isLoggable("HostedProfileFragment", 3)) {
        if (paramInt != 3) {
          break label186;
        }
      }
      break;
    }
    label186:
    for (Object localObject = "POSTS_LOADER_ID";; localObject = Integer.valueOf(paramInt))
    {
      String str = String.valueOf(localObject);
      new StringBuilder(35 + String.valueOf(str).length()).append("Loader<Cursor> onCreateLoader() -- ").append(str);
      return super.a(paramInt, paramBundle);
      mbf localmbf = this.bn;
      int i = this.at.c();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = jjf.c(this.af);
      return new cyd(localmbf, i, jrf.a(0, arrayOfString), null, false, 32);
      return ((hhh)mbb.a(this.bn, hhh.class)).a(this.bn, this.at.c(), this.aD, this.ah);
    }
  }
  
  protected final lpr a(hfa paramhfa)
  {
    this.bw = super.a(paramhfa);
    return this.bw;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      if (paramInt1 == 106) {
        a(gxz.y, paramIntent);
      }
    }
    int i;
    do
    {
      byte[] arrayOfByte;
      do
      {
        do
        {
          return;
          i = this.at.c();
          switch (paramInt1)
          {
          default: 
            super.a(paramInt1, paramInt2, paramIntent);
            return;
          case 101: 
            new kqf(105).b(this.bn);
            kat localkat = (kat)this.bo.b(kat.class);
            if (localkat != null) {
              localkat.a(localkat.a(3, 3));
            }
            this.an.a(this.at.c(), "AddToCircleFromProfile", 9L, 1L);
            a(paramIntent.getExtras().getStringArrayList("original_circle_ids"), paramIntent.getExtras().getStringArrayList("selected_circle_ids"), this.af, this.b.Z, null, null, -1, false, false);
            return;
          }
        } while (paramIntent == null);
        arrayOfByte = paramIntent.getByteArrayExtra("data");
      } while (arrayOfByte == null);
      this.aS.post(new ceb(this, arrayOfByte));
      return;
    } while (paramIntent == null);
    cee localcee = new cee();
    localcee.c = ((RectF)paramIntent.getParcelableExtra("coordinates"));
    localcee.d = paramIntent.getIntExtra("photo_picker_rotation", 0);
    if (paramInt1 == 109) {}
    for (boolean bool = true;; bool = false)
    {
      localcee.b = bool;
      if (!paramIntent.hasExtra("photo_id")) {
        break;
      }
      localcee.e = Long.valueOf(paramIntent.getLongExtra("photo_id", 0L));
      a(localcee);
      return;
    }
    if (paramIntent.hasExtra("tile_id"))
    {
      localcee.a = paramIntent.getStringExtra("tile_id");
      cef localcef = new cef(f(), this.at.c(), localcee, this, 104);
      e(aau.te);
      localcef.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
      return;
    }
    String str3 = paramIntent.getStringExtra("photo_url");
    if (str3 != null)
    {
      RectF localRectF2 = (RectF)paramIntent.getParcelableExtra("coordinates");
      gzj localgzj = (gzj)this.bo.a(gzj.class);
      boq localboq = new boq(this.at.c(), jjf.c(this.af), str3, localRectF2);
      localgzj.d.a(localboq, false);
      localgzj.b(localboq);
    }
    gxx localgxx2 = (gxx)this.bo.a(gxx.class);
    gxw localgxw2 = new gxw(this.bn, i);
    localgxw2.c = gxz.E;
    localgxx2.a(localgxw2);
    return;
    int j = paramIntent.getIntExtra("photo_picker_crop_mode", 0);
    long l = paramIntent.getLongExtra("photo_id", 0L);
    if (j == 3)
    {
      localRectF1 = (RectF)paramIntent.getParcelableExtra("coordinates");
      a(this.b.R, Long.toString(l), localRectF1, this.b.V);
    }
    while (j != 2)
    {
      RectF localRectF1;
      gxx localgxx1 = (gxx)this.bo.a(gxx.class);
      gxw localgxw1 = new gxw(this.bn, i);
      localgxw1.c = gxz.C;
      localgxx1.a(localgxw1);
      return;
    }
    int k = paramIntent.getIntExtra("top_offset", 0);
    int m = this.b.R;
    String str1 = Long.toString(l);
    String str2;
    switch (this.b.K)
    {
    default: 
      str2 = "COVER";
    }
    for (;;)
    {
      bp localbp = f();
      int n = this.at.c();
      Intent localIntent = EsService.e.a(localbp, EsService.class);
      localIntent.putExtra("op", 718);
      localIntent.putExtra("account_id", n);
      localIntent.putExtra("cover_photo_owner_type", m);
      localIntent.putExtra("photo_id", str1);
      localIntent.putExtra("top_offset", k);
      localIntent.putExtra("layout", str2);
      this.ac = Integer.valueOf(EsService.a(localbp, localIntent));
      e(aau.te);
      break;
      str2 = "FULL_BLEED";
      continue;
      str2 = "COVER";
    }
    this.ab = EsService.c(this.bn, this.at.c(), this.af, true);
    N_();
    a(gxz.x, paramIntent);
    return;
    ap();
    return;
    this.b.a(true, -1);
    this.b.c();
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, String paramString)
  {
    if (this.aW != this.Z)
    {
      this.aW = this.Z;
      cih.a(f(), this.aD);
    }
    int i = this.at.c();
    Intent localIntent = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (localIntent != null) {
        a(localIntent);
      }
      return;
      localIntent = efj.d(f(), i, paramString, this.aD, true);
      continue;
      localIntent = efj.c(f(), i, paramString, this.aD, true);
      continue;
      bp localbp = f();
      String str = this.aD;
      localIntent = new Intent(localbp, PeopleListActivity.class);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("people_view_type", 11);
      localIntent.putExtra("title", paramString);
      localIntent.putExtra("owner_id", str);
      localIntent.putExtra("use_cached_data", true);
    }
  }
  
  final void a(int paramInt1, String paramString, RectF paramRectF, int paramInt2)
  {
    mbf localmbf = this.bn;
    int i = this.at.c();
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 718);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("cover_photo_owner_type", paramInt1);
    localIntent.putExtra("photo_id", paramString);
    localIntent.putExtra("coordinates", paramRectF);
    localIntent.putExtra("rotation", paramInt2);
    this.ac = Integer.valueOf(EsService.a(localmbf, localIntent));
    e(aau.te);
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      new kqf(59).b(this.bn);
      kat localkat = (kat)this.bo.b(kat.class);
      if (localkat != null) {
        localkat.a(localkat.a(3, 1));
      }
      this.ap = true;
    }
    super.a(paramBundle);
    int i = this.at.c();
    this.an.a(i, "ProfileLoad", 1L, 1L);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("profile_request_id")) {
        this.ab = Integer.valueOf(paramBundle.getInt("profile_request_id"));
      }
      if (paramBundle.containsKey("abuse_request_id")) {
        this.bb = Integer.valueOf(paramBundle.getInt("abuse_request_id"));
      }
      if (paramBundle.containsKey("mute_request_id"))
      {
        this.bc = Integer.valueOf(paramBundle.getInt("mute_request_id"));
        this.bd = paramBundle.getBoolean("mute_state");
      }
      if (paramBundle.containsKey("cover_photo_request_id")) {
        this.ac = Integer.valueOf(paramBundle.getInt("cover_photo_request_id"));
      }
      if (paramBundle.containsKey("albums_request_id")) {
        this.ba = Integer.valueOf(paramBundle.getInt("albums_request_id"));
      }
      if (paramBundle.containsKey("set_blocked_request_id")) {
        this.be = Integer.valueOf(paramBundle.getInt("set_blocked_request_id"));
      }
      if (paramBundle.containsKey("choose_photo_target"))
      {
        this.ad = paramBundle.getInt("choose_photo_target");
        this.bf = paramBundle.getInt("choose_photo_album_hint");
      }
      this.bg = paramBundle.getBoolean("already_tried_refresh");
      this.d = paramBundle.getLong("contact_update");
      this.Z = paramBundle.getLong("profile_update");
      this.al = paramBundle.getInt("active_tab");
      this.aZ = false;
    }
    Intent localIntent;
    do
    {
      k().a(100, U(), this.bz);
      if (this.ag)
      {
        k().a(103, null, this);
        k().a(105, null, this.by);
        ar();
      }
      this.bh = new jly(this.bn, k(), i);
      jly localjly1 = this.bh;
      DataSetObserver localDataSetObserver = this.bA;
      localjly1.b.registerObserver(localDataSetObserver);
      jly localjly2 = this.bh;
      localjly2.a.a(localjly2.d, null, localjly2);
      k().a(2, null, this);
      if (paramBundle == null) {
        i(true);
      }
      this.bt.a(aaw.iU, this.bu);
      return;
      this.aZ = true;
      localIntent = f().getIntent();
    } while (!localIntent.hasExtra("add_profile_photo_message_id"));
    int j = localIntent.getIntExtra("add_profile_photo_message_id", aau.tc);
    gxz localgxz;
    if (j != aau.ta) {
      if (j == aau.sZ) {
        localgxz = gxz.L;
      }
    }
    for (;;)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = localgxz;
      localgxw.d = gya.w;
      localgxx.a(localgxw);
      break;
      if (j == aau.tb) {
        localgxz = gxz.M;
      } else {
        localgxz = gxz.K;
      }
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("cover_photo_upgrade".equals(paramString)) {
      k(this.m.getBoolean("local_folders_only", false));
    }
    while ((!"first_circle_add".equals(paramString)) && (!"first_circle_add_one_click".equals(paramString))) {
      return;
    }
    a(paramBundle.getBoolean("for_sharing"), paramBundle.getBoolean("prefer_default_circle"));
  }
  
  public final void a(Parcelable paramParcelable)
  {
    j(true);
  }
  
  final void a(cee paramcee)
  {
    Long localLong = this.b.q();
    if ((localLong != null) && (localLong.equals(paramcee.e))) {
      this.aS.post(new cdq(this, paramcee, localLong));
    }
    int i;
    for (;;)
    {
      i = this.at.c();
      if (!paramcee.b) {
        break;
      }
      gxx localgxx2 = (gxx)this.bo.a(gxx.class);
      gxw localgxw2 = new gxw(this.bn, i);
      localgxw2.c = gxz.F;
      localgxx2.a(localgxw2);
      return;
      this.aS.post(new cdr(this, paramcee));
    }
    gxx localgxx1 = (gxx)this.bo.a(gxx.class);
    gxw localgxw1 = new gxw(this.bn, i);
    localgxw1.c = gxz.E;
    localgxx1.a(localgxw1);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    switch (paramfu.i)
    {
    default: 
      super.a(paramfu, paramCursor);
      this.b.am_();
    case 101: 
      do
      {
        return;
        if ((paramCursor != null) && ((paramCursor.getCount() != 0) || (this.bg))) {
          break;
        }
      } while (this.ba != null);
      this.bg = true;
      aq();
      return;
      do
      {
        if (!paramCursor.moveToNext()) {
          break;
        }
      } while (paramCursor.getInt(2) != 4);
    }
    for (int i = 1;; i = 0)
    {
      if ((this.aX != null) && (this.aY != null) && (this.aY.intValue() != 17)) {}
      this.aY = Integer.valueOf(17);
      if (i != 0) {}
      hwq localhwq2;
      hwt localhwt2;
      for (;;)
      {
        this.b.a.b(paramCursor);
        this.aX = this.b.a.c;
        if (this.al != 2) {
          break;
        }
        boolean bool2 = this.az.J_();
        this.b.aQ = false;
        this.b.b(w());
        this.b.b(this.aX, 1);
        this.b.aQ = bool2;
        this.b.h();
        localhwq2 = this.aw;
        localhwt2 = hwt.b;
        if (localhwt2 != null) {
          break label295;
        }
        throw new NullPointerException();
        if (this.ba == null) {
          paramCursor = aR;
        } else {
          paramCursor = null;
        }
      }
      label295:
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      N_();
      break;
      this.aa = paramCursor;
      if ((this.aa != null) && (this.aa.getCount() != 0)) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        ddo localddo = this.b;
        localddo.aq = bool1;
        if (localddo.ad != null) {
          localddo.ad.z.a(5, bool1);
        }
        this.b.am_();
        if (this.al != 5) {
          break;
        }
        if (bool1) {
          break label414;
        }
        b(0);
        break;
      }
      label414:
      ad();
      this.b.b(w());
      this.b.b(this.aa, 1);
      this.b.h();
      this.b.a(true, -1);
      ae();
      hwq localhwq1 = this.aw;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      N_();
      break;
      super.a(paramfu, paramCursor);
      break;
      this.aV = paramCursor;
      if (this.al == 0)
      {
        super.a(paramfu, paramCursor);
        if (!this.bi) {
          break;
        }
        this.az.a(true, 1);
        this.b.c();
        this.b.I_();
        this.b.am_();
        this.bi = false;
        break;
      }
      if (this.ay == null) {
        break;
      }
      StreamGridView localStreamGridView = this.ay;
      localStreamGridView.c = this.au;
      localStreamGridView.a(0);
      break;
    }
  }
  
  public final void a(gpr paramgpr)
  {
    int i = 1;
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(i, localgqe.b);
    if (Z_()) {
      localgqe.a = i;
    }
    if (this.b != null) {
      paramgpr.a(this.b.Z);
    }
    int j;
    int i4;
    label101:
    int k;
    label119:
    int m;
    label184:
    int n;
    label229:
    int i1;
    label287:
    int i2;
    if ((this.ag) && (this.ah))
    {
      j = i;
      if ((j == 0) || (this.b == null)) {
        break label533;
      }
      if (this.b.t == null) {
        break label527;
      }
      i4 = i;
      if ((i4 == 0) || (this.b.C)) {
        break label533;
      }
      k = i;
      if ((!this.ag) || (this.ah) || (this.b == null) || (TextUtils.isEmpty(this.b.Z)) || (this.bc != null) || (this.be != null) || (this.bb != null) || (this.ak)) {
        break label539;
      }
      m = i;
      if ((!this.ag) || (this.ah) || (this.bc != null) || (this.be != null) || (this.bb != null) || (!this.ak)) {
        break label545;
      }
      n = i;
      if ((!this.ag) || (this.ah) || (this.b == null) || (TextUtils.isEmpty(this.b.Z)) || (this.be != null) || (this.bb != null) || (this.aj)) {
        break label551;
      }
      i1 = i;
      if ((!this.ag) || (this.ah) || (this.be != null) || (this.bb != null) || (!this.aj)) {
        break label557;
      }
      i2 = i;
      label325:
      if ((!this.ag) || (this.ah) || (this.bb != null)) {
        break label563;
      }
    }
    for (;;)
    {
      int i3 = aaw.jP;
      gqj localgqj = new gqj(this);
      localgqj.a = aau.kP;
      paramgpr.a(i3, localgqj);
      if (j != 0)
      {
        paramgpr.b(aaw.cW);
        paramgpr.b(aaw.cR);
      }
      if (k != 0) {
        paramgpr.b(aaw.cU);
      }
      if (m != 0) {
        paramgpr.b(aaw.ft);
      }
      if (n != 0) {
        paramgpr.b(aaw.mb);
      }
      if (i1 != 0) {
        paramgpr.b(aaw.aF);
      }
      if (i2 != 0) {
        paramgpr.b(aaw.lZ);
      }
      if (i != 0) {
        paramgpr.b(aaw.iy);
      }
      paramgpr.a(aaw.jH, new dpq(107));
      this.b.am_();
      return;
      j = 0;
      break;
      label527:
      i4 = 0;
      break label101;
      label533:
      k = 0;
      break label119;
      label539:
      m = 0;
      break label184;
      label545:
      n = 0;
      break label229;
      label551:
      i1 = 0;
      break label287;
      label557:
      i2 = 0;
      break label325;
      label563:
      i = 0;
    }
  }
  
  public final void a(isp paramisp) {}
  
  public final void a(String paramString)
  {
    int i = this.at.c();
    jqa localjqa = new jqa(f(), HostStreamSingleAlbumTileActivity.class, i);
    localjqa.a = paramString;
    Intent localIntent = localjqa.a();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.do;
    localgxx.a(localgxw);
    a(localIntent);
  }
  
  public final void a(String paramString, int paramInt)
  {
    hgv localhgv = (hgv)this.bo.a(hgv.class);
    ad();
    localhgv.a(paramString, paramInt, this.bm.a());
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    super.a(paramString, paramhae, paramhaa);
    if ("UploadCoverPhotoTask".equals(paramString)) {
      if (!hae.a(paramhae))
      {
        this.ab = EsService.c(this.bn, this.at.c(), this.af, true);
        N_();
      }
    }
    do
    {
      kat localkat;
      do
      {
        return;
        if (!"ModifyCircleMembershipsTask".equals(paramString)) {
          break;
        }
        this.an.a(this.at.c(), new String[] { "AddToCircleFromProfile" });
        new kqf(106).b(this.bn);
        localkat = (kat)this.bo.b(kat.class);
      } while (localkat == null);
      localkat.a(null);
      return;
    } while ((this.ao == null) || (!this.ao.a(paramString)) || (!hae.a(paramhae)));
    ad();
    k().b(103, null, this);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a(((kyp)this.bo.a(kyp.class)).a(this.at.c(), paramString1, null));
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    efj.a(paramtp, true);
    paramtp.c(true);
    if (this.b != null) {
      this.b.ae = paramtp;
    }
  }
  
  protected final boolean a(Cursor paramCursor)
  {
    return (paramCursor != null) && (paramCursor.getCount() > 1);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.cU)
    {
      d(16);
      return true;
    }
    if (i == aaw.cR)
    {
      g(false);
      return true;
    }
    if (i == aaw.cW)
    {
      b(false);
      return true;
    }
    if (i == aaw.ft)
    {
      if (this.ai) {}
      for (String str2 = this.b.Z;; str2 = this.b.aa)
      {
        ((dhd)this.bo.a(dhd.class)).b().a(str2).a(this.b.ab).a(true).a().a(h(), "mute_profile");
        return true;
      }
    }
    if (i == aaw.mb)
    {
      if (this.ai) {}
      for (String str1 = this.b.Z;; str1 = this.b.aa)
      {
        ((dhd)this.bo.a(dhd.class)).b().a(str1).a(this.b.ab).a(false).a().a(h(), "unmute_profile");
        return true;
      }
    }
    if (i == aaw.aF)
    {
      ((dhd)this.bo.a(dhd.class)).c().a(this.b.B).a().a(h(), "block_person");
      return true;
    }
    if (i == aaw.lZ)
    {
      ((dhd)this.bo.a(dhd.class)).d().a(this.b.B).a(this.af).a().a(h(), "unblock_person");
      return true;
    }
    if (i == aaw.iy)
    {
      ((dhd)this.bo.a(dhd.class)).f().a(h(), "report_abuse");
      return true;
    }
    return super.a(paramMenuItem);
  }
  
  public final void a_(View paramView) {}
  
  public final void aa_() {}
  
  public final void ab_()
  {
    jly localjly = this.bh;
    localjly.a.b(localjly.d, null, localjly);
  }
  
  protected final hgh b(int paramInt1, int paramInt2)
  {
    return hvj.a(-1, 138, Integer.valueOf(-1));
  }
  
  public final void b(int paramInt)
  {
    lpr locallpr;
    Cursor localCursor;
    if (this.al != paramInt)
    {
      if (this.al == 5) {
        this.N.setBackgroundDrawable(this.br);
      }
      this.al = paramInt;
      this.bi = true;
      if (this.b != null)
      {
        this.b.c(paramInt);
        switch (paramInt)
        {
        default: 
          locallpr = this.bw;
          localCursor = null;
          this.b.aQ = false;
          this.b.b(w());
          this.b.b(localCursor, this.aA);
          this.b.aQ = true;
          if (this.ay.a != locallpr)
          {
            ad();
            this.ay.a = locallpr;
            this.b.a(true, -1);
            ae();
          }
          break;
        }
      }
    }
    for (;;)
    {
      this.b.c();
      this.b.I_();
      this.b.am_();
      if (this.ag)
      {
        efj.b(this);
        efj.a(this);
      }
      return;
      locallpr = this.bw;
      if ((this.aV != null) && (this.aV.isClosed())) {
        this.aV = null;
      }
      localCursor = this.aV;
      k().a(2, null, this);
      break;
      locallpr = this.bw;
      localCursor = this.b.b(this.Z);
      this.aA = -1;
      break;
      locallpr = this.bw;
      if ((this.aX != null) && (this.aX.isClosed())) {
        this.aX = null;
      }
      localCursor = this.aX;
      if ((!this.ag) || (this.aX != null)) {
        break;
      }
      k().a(101, null, this);
      break;
      locallpr = an();
      this.N.setBackgroundColor(g().getColor(efj.kb));
      if ((this.aa != null) && (this.aa.isClosed())) {
        this.aa = null;
      }
      localCursor = this.aa;
      if ((!this.ag) || (this.aa != null)) {
        break;
      }
      k().b(103, null, this);
      break;
      locallpr = this.bw;
      localCursor = this.b.g();
      this.aA = -1;
      break;
      locallpr = this.bw;
      localCursor = this.b.e();
      this.aA = -1;
      break;
      ae();
      if (this.al != 0) {
        this.b.a(true, 1);
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    if (!TextUtils.isEmpty(this.aD)) {
      paramBundle.putString("extra_gaia_id", this.aD);
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(String paramString)
  {
    Rfc822Token[] arrayOfRfc822Token = null;
    if (paramString != null) {
      arrayOfRfc822Token = Rfc822Tokenizer.tokenize(paramString);
    }
    if ((arrayOfRfc822Token == null) || (arrayOfRfc822Token.length == 0)) {
      return;
    }
    Rfc822Token localRfc822Token = arrayOfRfc822Token[0];
    if ((TextUtils.isEmpty(localRfc822Token.getName())) && (!TextUtils.isEmpty(this.b.Z))) {
      localRfc822Token.setName(this.b.Z);
    }
    String str1 = String.valueOf(Uri.encode(localRfc822Token.toString()));
    if (str1.length() != 0) {}
    for (String str2 = "mailto:".concat(str1);; str2 = new String("mailto:"))
    {
      f(new Intent("android.intent.action.SENDTO", Uri.parse(str2)));
      return;
    }
  }
  
  public final void b(String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      ay.a(f(), ((hpo)this.bo.a(hpo.class)).a(this.at.c(), paramString1, paramString2), ((gvj)this.bo.a(gvj.class)).a());
    }
  }
  
  public final void b(tp paramtp)
  {
    super.b(paramtp);
    if (this.b != null) {
      this.b.ae = null;
    }
  }
  
  final void b(boolean paramBoolean)
  {
    this.ad = 1;
    dgz localdgz;
    if (!o("change_photo"))
    {
      localdgz = ((dhd)this.bo.a(dhd.class)).e().a(aI_().getString(aau.do));
      bp localbp = f();
      Intent localIntent = efj.b("camera-photo.jpg");
      if (localbp.getPackageManager().queryIntentActivities(localIntent, 65536).size() <= 0) {
        break label107;
      }
    }
    label107:
    for (boolean bool = true;; bool = false)
    {
      localdgz.a(bool).c(paramBoolean).a().a(h(), "change_photo");
      return;
    }
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == 2)
    {
      bp localbp = f();
      int i = aau.uV;
      efj.a(localbp, localbp.getResources().getText(i), 0).show();
    }
    N_();
  }
  
  public final void c(Intent paramIntent)
  {
    a(paramIntent);
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(dxl.class, new aty(this, this.bp, this));
    this.bo.a(cpa.class, this);
    this.bo.a(hei.class, new ced(this));
    this.bo.a(lea.class, this);
    this.bo.a(lgp.class, this);
    this.bo.a(lgo.class, this);
    this.bo.a(gii.class, this);
    this.bo.a(dhc.class, this);
    this.bo.a(dgy.class, this);
    this.bo.a(dhf.class, this);
    this.bo.a(dha.class, this.aq);
    this.an = ((lta)this.bo.a(lta.class));
    this.ao = ((bot)this.bo.a(bot.class));
    this.bm = ((hho)this.bo.a(hho.class));
    this.bj = ((hul)this.bo.a(hul.class)).a(this.at.c());
    this.bq = ((jia)this.bo.a(jia.class));
    ((lfr)this.bo.a(lfr.class)).b = false;
    this.bo.a(hgz.class, this);
    this.ao.a(this.bp).a(this.bo);
    this.bo.a(hgx.class, this.ao.b(this, this.bp));
    this.bt = ((jov)this.bo.a(jov.class));
    this.bs = ((dsr)this.bo.a(dsr.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void c(String paramString)
  {
    String str1;
    if (!TextUtils.isEmpty(paramString))
    {
      str1 = String.valueOf(Uri.encode(paramString));
      if (str1.length() == 0) {
        break label49;
      }
    }
    label49:
    for (String str2 = "tel:".concat(str1);; str2 = new String("tel:"))
    {
      f(new Intent("android.intent.action.DIAL", Uri.parse(str2)));
      return;
    }
  }
  
  public final void c_(int paramInt)
  {
    if (paramInt == 5)
    {
      int j = aau.sg;
      String str2 = g().getString(j);
      int k = aau.su;
      lut.a(str2, g().getString(k), g().getString(17039370), null, 0, 0).a(this.x, "dialog_warning");
      return;
    }
    bp localbp = f();
    int i = this.at.c();
    String str1 = this.aD;
    Intent localIntent = EsService.e.a(localbp, EsService.class);
    localIntent.putExtra("op", 707);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("gaia_id", str1);
    localIntent.putExtra("abuse_type", paramInt);
    this.bb = Integer.valueOf(EsService.a(localbp, localIntent));
    e(aau.sk);
  }
  
  public final void d() {}
  
  public final void d(int paramInt)
  {
    int i = this.at.c();
    if (paramInt == 8) {
      a(efj.e(f(), i), 107);
    }
    ddo localddo1 = this.b;
    if ((localddo1.t == null) || (localddo1.t.h == null)) {}
    for (byte[] arrayOfByte1 = new byte[0];; arrayOfByte1 = qat.a(localddo1.t.h)) {
      switch (paramInt)
      {
      case 8: 
      default: 
        return;
      }
    }
    b(1, brn.a(this.b.t), arrayOfByte1);
    return;
    ddo localddo11 = this.b;
    mua localmua = localddo11.v;
    byte[] arrayOfByte11 = null;
    if (localmua != null)
    {
      nys localnys = localddo11.v.a;
      arrayOfByte11 = null;
      if (localnys != null)
      {
        nxx localnxx = localddo11.v.a.b;
        arrayOfByte11 = null;
        if (localnxx != null) {
          break label281;
        }
      }
    }
    for (;;)
    {
      int j = this.at.c();
      a(efj.b(f(), j, 26, arrayOfByte11, arrayOfByte1), 106);
      g(26);
      return;
      label281:
      arrayOfByte11 = qat.a(localddo11.v.a.b);
    }
    a(((hpo)mbb.a(this.bn, hpo.class)).e(i), 108);
    return;
    ddo localddo9 = this.b;
    byte[] arrayOfByte9;
    ddo localddo10;
    if (localddo9.A != null)
    {
      arrayOfByte9 = qat.a(localddo9.A);
      localddo10 = this.b;
      if (localddo10.z == null) {
        break label429;
      }
    }
    label429:
    for (byte[] arrayOfByte10 = qat.a(localddo10.z);; arrayOfByte10 = null)
    {
      Intent localIntent = efj.b(this.bn, this.at.c(), 36, arrayOfByte9, null);
      localIntent.putExtra("squares_data_proto", arrayOfByte10);
      a(localIntent, 106);
      g(36);
      return;
      arrayOfByte9 = null;
      break;
    }
    b(15, this.b.d(15), arrayOfByte1);
    return;
    b(12, this.b.d(12), arrayOfByte1);
    return;
    b(13, this.b.d(13), arrayOfByte1);
    return;
    b(38, this.b.d(38), arrayOfByte1);
    return;
    ddo localddo8 = this.b;
    if ((localddo8.t == null) || (localddo8.t.e == null) || (localddo8.t.e.g == null)) {}
    for (byte[] arrayOfByte8 = new byte[0];; arrayOfByte8 = qat.a(localddo8.t.e.g))
    {
      a(4, arrayOfByte8, arrayOfByte1);
      return;
    }
    ddo localddo7 = this.b;
    if ((localddo7.t == null) || (localddo7.t.e == null) || (localddo7.t.e.h == null)) {}
    for (byte[] arrayOfByte7 = new byte[0];; arrayOfByte7 = qat.a(localddo7.t.e.h))
    {
      a(3, arrayOfByte7, arrayOfByte1);
      return;
    }
    ddo localddo6 = this.b;
    if ((localddo6.t == null) || (localddo6.t.e == null) || (localddo6.t.e.i == null)) {}
    for (byte[] arrayOfByte6 = new byte[0];; arrayOfByte6 = qat.a(localddo6.t.e.i))
    {
      a(5, arrayOfByte6, arrayOfByte1);
      return;
    }
    ddo localddo5 = this.b;
    if ((localddo5.t == null) || (localddo5.t.e == null) || (localddo5.t.e.e == null)) {}
    for (byte[] arrayOfByte5 = new byte[0];; arrayOfByte5 = qat.a(localddo5.t.e.e))
    {
      c(10, arrayOfByte5, arrayOfByte1);
      return;
    }
    ddo localddo4 = this.b;
    if ((localddo4.t == null) || (localddo4.t.e == null) || (localddo4.t.e.m == null)) {}
    for (byte[] arrayOfByte4 = new byte[0];; arrayOfByte4 = qat.a(localddo4.t.e.m))
    {
      c(19, arrayOfByte4, arrayOfByte1);
      return;
    }
    ddo localddo3 = this.b;
    if ((localddo3.t == null) || (localddo3.t.e == null) || (localddo3.t.e.l == null)) {}
    for (byte[] arrayOfByte3 = new byte[0];; arrayOfByte3 = qat.a(localddo3.t.e.l))
    {
      c(8, arrayOfByte3, arrayOfByte1);
      return;
    }
    ddo localddo2 = this.b;
    if ((localddo2.t == null) || (localddo2.t.e == null) || (localddo2.t.e.b == null)) {}
    for (byte[] arrayOfByte2 = new byte[0];; arrayOfByte2 = qat.a(localddo2.t.e.b))
    {
      a(14, arrayOfByte2, arrayOfByte1);
      return;
    }
    a(6, this.b.r(), arrayOfByte1);
    return;
    a(7, this.b.r(), arrayOfByte1);
  }
  
  public final void d(String paramString)
  {
    String str1;
    if (!TextUtils.isEmpty(paramString))
    {
      str1 = String.valueOf(Uri.encode(paramString));
      if (str1.length() == 0) {
        break label46;
      }
    }
    label46:
    for (String str2 = "geo:0,0?q=".concat(str1);; str2 = new String("geo:0,0?q="))
    {
      Uri localUri = Uri.parse(str2);
      efj.b(f(), localUri);
      return;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ab != null) {
      paramBundle.putInt("profile_request_id", this.ab.intValue());
    }
    if (this.bb != null) {
      paramBundle.putInt("abuse_request_id", this.bb.intValue());
    }
    if (this.bc != null)
    {
      paramBundle.putInt("mute_request_id", this.bc.intValue());
      paramBundle.putBoolean("mute_state", this.bd);
    }
    if (this.be != null) {
      paramBundle.putInt("set_blocked_request_id", this.be.intValue());
    }
    if (this.ac != null) {
      paramBundle.putInt("cover_photo_request_id", this.ac.intValue());
    }
    if (this.ba != null) {
      paramBundle.putInt("albums_request_id", this.ba.intValue());
    }
    paramBundle.putBoolean("already_tried_refresh", this.bg);
    paramBundle.putInt("choose_photo_target", this.ad);
    paramBundle.putInt("choose_photo_album_hint", this.bf);
    paramBundle.putLong("contact_update", this.d);
    paramBundle.putLong("profile_update", this.Z);
    paramBundle.putInt("active_tab", this.al);
  }
  
  public final void e(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      localIntent.addFlags(524288);
      f(localIntent);
    }
  }
  
  public final void f(String paramString)
  {
    int i = this.at.c();
    bp localbp = f();
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      a(efj.b(localbp, i, str2, null, false));
      return;
    }
  }
  
  public final void g(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      efj.b(f(), Uri.parse(paramString));
    }
  }
  
  final void g(boolean paramBoolean)
  {
    this.ad = 2;
    int i = this.at.c();
    if (!this.b.J)
    {
      ddo localddo = this.b;
      if ((localddo.O != null) || (localddo.M != null)) {
        break label105;
      }
    }
    label105:
    for (int j = 1; j != 0; j = 0)
    {
      gxx localgxx1 = (gxx)this.bo.a(gxx.class);
      gxw localgxw1 = new gxw(this.bn, i);
      localgxw1.c = gxz.B;
      localgxx1.a(localgxw1);
      k(paramBoolean);
      return;
    }
    gxx localgxx2 = (gxx)this.bo.a(gxx.class);
    gxw localgxw2 = new gxw(this.bn, i);
    localgxw2.c = gxz.D;
    localgxx2.a(localgxw2);
    int k = aau.vl;
    String str1 = g().getString(k);
    int m = aau.vk;
    String str2 = g().getString(m);
    int n = aau.vj;
    String str3 = g().getString(n);
    int i1 = aau.cM;
    lut locallut = lut.a(str1, str2, str3, g().getString(i1), 0, 0);
    locallut.n = this;
    locallut.p = 1;
    locallut.a(this.x, "cover_photo_upgrade");
  }
  
  public final void h(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      efj.b(f(), Uri.parse(paramString));
    }
  }
  
  public final void h(boolean paramBoolean)
  {
    mbf localmbf = this.bn;
    int i = this.at.c();
    String str = this.aD;
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 705);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("person_id", str);
    localIntent.putExtra("muted", paramBoolean);
    this.bc = Integer.valueOf(EsService.a(localmbf, localIntent));
    this.bd = paramBoolean;
    e(aau.lg);
  }
  
  public final void i(String paramString)
  {
    e(paramString);
  }
  
  public final void j(String paramString)
  {
    e(paramString);
  }
  
  public final void k(String paramString)
  {
    j(false);
  }
  
  protected final boolean l(String paramString)
  {
    return TextUtils.equals(this.aD, paramString);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.bx);
    if (this.ag) {
      this.ao.a(this.ah, this.aD, this);
    }
    if (this.ab != null)
    {
      int i1 = this.ab.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i1)))
      {
        dmx localdmx6 = EsService.a(this.ab.intValue());
        b(this.ab.intValue(), localdmx6);
        this.ab = null;
      }
    }
    if (this.bb != null)
    {
      int n = this.bb.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(n)))
      {
        dmx localdmx5 = EsService.a(this.bb.intValue());
        c(this.bb.intValue(), localdmx5);
        this.bb = null;
      }
    }
    if (this.bc != null)
    {
      int m = this.bc.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(m)))
      {
        dmx localdmx4 = EsService.a(this.bc.intValue());
        a(this.bc.intValue(), this.bd, localdmx4);
        this.bc = null;
      }
    }
    if (this.be != null)
    {
      int k = this.be.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(k)))
      {
        dmx localdmx3 = EsService.a(this.be.intValue());
        b(this.be.intValue(), false, localdmx3);
        this.be = null;
      }
    }
    if (this.ac != null)
    {
      int j = this.ac.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(j)))
      {
        dmx localdmx2 = EsService.a(this.ac.intValue());
        a(this.ac.intValue(), localdmx2);
        this.ac = null;
      }
    }
    if (this.ba != null)
    {
      int i = this.ba.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx1 = EsService.a(this.ba.intValue());
        d(this.ba.intValue(), localdmx1);
        this.ba = null;
      }
    }
    if ((this.ah) && (this.aZ)) {
      ap();
    }
    this.aZ = false;
    N_();
    if (this.al == 5) {
      this.N.setBackgroundColor(g().getColor(efj.kb));
    }
  }
  
  public final void n()
  {
    super.n();
    this.az.t();
    dme localdme = this.bx;
    EsService.d.remove(localdme);
    if (this.ag) {
      this.ao.b(this.ah, this.aD, this);
    }
  }
  
  public final void o()
  {
    cih.a(f(), this.aD);
    super.o();
  }
  
  public final void onClick(View paramView)
  {
    int j;
    int i;
    cya localcya;
    int m;
    ArrayList localArrayList1;
    if (this.al != 2)
    {
      j = 0;
      if (j == 0) {}
    }
    else
    {
      i = this.at.c();
      if (paramView.getId() == aaw.jO)
      {
        gxx localgxx3 = (gxx)this.bo.a(gxx.class);
        gxw localgxw3 = new gxw(this.bn);
        localgxw3.c = gxz.dV;
        localgxx3.a(localgxw3);
        String str3 = (String)paramView.getTag(aaw.kX);
        localcya = this.b.a;
        m = ((Integer)paramView.getTag(aaw.kY)).intValue();
        Cursor localCursor = (Cursor)localcya.getItem(m);
        localArrayList1 = new ArrayList();
        int n = localcya.j * localcya.p;
        int i1 = 0;
        while (localCursor.moveToNext()) {
          if ((i1 < n) || (cya.e(localCursor)))
          {
            long l1 = localCursor.getLong(14);
            if ((0x20000000 & l1) != 0L)
            {
              long l2 = localCursor.getLong(15);
              ipf localipf2 = localcya.g(localCursor);
              String[] arrayOfString2 = new String[1];
              arrayOfString2[0] = localcya.f;
              localArrayList1.add(new jpu(jrf.a(0, arrayOfString2), str3, localipf2, l2, l1));
            }
            i1++;
          }
          else
          {
            if (!cya.f(localCursor)) {
              break;
            }
          }
        }
      }
    }
    for (int i2 = 1;; i2 = 0)
    {
      int i5;
      if (localcya.h)
      {
        int i3 = i2 + localArrayList1.size();
        int i4 = i3 % localcya.j;
        i5 = i3 / localcya.j;
        if ((i5 <= 0) || ((localcya.m.get(m) <= i3) && (i4 == 0))) {}
      }
      for (ArrayList localArrayList2 = new ArrayList(localArrayList1.subList(0, -1 + i5 * localcya.j));; localArrayList2 = localArrayList1)
      {
        a(efj.b(this.bn, i, localArrayList2));
        f().overridePendingTransition(efj.iK, 0);
        j = 1;
        break;
      }
      String str1 = (String)paramView.getTag(aaw.ln);
      if (TextUtils.isEmpty(str1))
      {
        j = 0;
        break;
      }
      int k = ((Integer)paramView.getTag(aaw.lo)).intValue();
      String str2 = (String)paramView.getTag(aaw.kX);
      Boolean localBoolean = (Boolean)paramView.getTag(aaw.le);
      boolean bool;
      label478:
      Intent localIntent2;
      if (localBoolean == null)
      {
        bool = false;
        if ((k != 1) || (bool)) {
          break label676;
        }
        ipf localipf1 = (ipf)paramView.getTag(aaw.lc);
        bdo localbdo = new bdo(f(), i);
        localbdo.b = str1;
        localbdo.c = localipf1;
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = jjf.c(this.af);
        localbdo.e = jrf.a(0, arrayOfString1);
        localbdo.r = Boolean.valueOf(false);
        localbdo.q = Integer.valueOf(32);
        localIntent2 = localbdo.a();
        ((ipb)mbb.a(this.bn, ipb.class)).b(localipf1, 5, 4160);
        gxx localgxx2 = (gxx)this.bo.a(gxx.class);
        gxw localgxw2 = new gxw(this.bn);
        localgxw2.c = gxz.dm;
        localgxx2.a(localgxw2);
      }
      label676:
      Intent localIntent1;
      for (Object localObject = localIntent2;; localObject = localIntent1)
      {
        a((Intent)localObject);
        j = 1;
        break;
        bool = localBoolean.booleanValue();
        break label478;
        jqa localjqa = new jqa(f(), HostStreamSingleAlbumTileActivity.class, i);
        localjqa.a = str2;
        localIntent1 = localjqa.a();
        gxx localgxx1 = (gxx)this.bo.a(gxx.class);
        gxw localgxw1 = new gxw(this.bn);
        localgxw1.c = gxz.do;
        localgxx1.a(localgxw1);
      }
      super.onClick(paramView);
      return;
    }
  }
  
  public final void p_()
  {
    super.p_();
    if (this.b != null) {
      this.b.j();
    }
  }
  
  public final void q_()
  {
    super.q_();
    if (this.b != null)
    {
      ddo localddo = this.b;
      if (localddo.ad != null) {
        localddo.ad.a(null, null, 0, false, false);
      }
    }
  }
  
  public final gya r_()
  {
    switch (this.al)
    {
    default: 
      return gya.i;
    case 1: 
      return gya.f;
    case 2: 
      return gya.g;
    case 4: 
      return gya.k;
    }
    return gya.h;
  }
  
  public final gxq v()
  {
    if (this.al != this.bl) {
      switch (this.al)
      {
      default: 
        this.bk = new kvk(pka.y, this.aD);
      }
    }
    for (;;)
    {
      this.bl = this.al;
      return this.bk;
      this.bk = new kvk(pka.q, this.aD);
      continue;
      this.bk = new kvk(pka.w, this.aD);
      continue;
      this.bk = new kvk(pka.z, this.aD);
      continue;
      this.bk = new kvk(pka.u, this.aD);
      continue;
      this.bk = new kvk(pka.r, this.aD);
    }
  }
  
  public final void v_() {}
  
  protected final hqr w()
  {
    if (this.aU == null) {
      this.aU = dfz.x();
    }
    return this.aU;
  }
  
  public final void w_() {}
  
  public final void x_() {}
  
  public final CharSequence z()
  {
    ddo localddo = this.b;
    if (localddo.t != null) {}
    for (int i = 1; (i == 0) || (localddo.t.c == null); i = 0) {
      return null;
    }
    return localddo.t.c.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdo
 * JD-Core Version:    0.7.0.1
 */