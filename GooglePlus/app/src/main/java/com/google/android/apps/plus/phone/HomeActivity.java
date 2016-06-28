package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import bk;
import bn;
import bop;
import bot;
import bp;
import bu;
import bv;
import bvo;
import bw;
import bwl;
import bz;
import ccj;
import cge;
import cl;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.views.EsDrawerLayout;
import com.google.android.libraries.social.onboarding.InterstitialsActivity;
import com.google.android.libraries.social.socialcast.impl.CastService;
import cqv;
import cre;
import cta;
import ctr;
import cts;
import ctw;
import cty;
import cua;
import cul;
import cv;
import cw;
import cyf;
import dbb;
import dbc;
import dbd;
import dbe;
import dbg;
import dbj;
import dfb;
import dfk;
import djp;
import duj;
import dun;
import efj;
import fu;
import git;
import giu;
import giv;
import giz;
import gjb;
import gjh;
import gpl;
import gpm;
import gpq;
import gpr;
import gwz;
import gxi;
import gxp;
import gxq;
import gxr;
import gxv;
import gxw;
import gxx;
import gxz;
import gya;
import gyx;
import gzj;
import hdr;
import hgg;
import hpo;
import hqj;
import idy;
import ifj;
import ikn;
import ikt;
import ilf;
import ill;
import ilm;
import iln;
import ine;
import iwi;
import iwj;
import iwt;
import iww;
import iyl;
import jag;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jeu;
import jew;
import jgw;
import jnh;
import jxu;
import jxz;
import jyj;
import jyl;
import kyj;
import kyt;
import lln;
import lvg;
import lvi;
import lvj;
import lvn;
import mbb;
import mbp;
import mcs;
import mfi;
import pjt;
import pkb;
import pkf;
import rf;
import rl;
import tp;
import tu;
import uo;
import uq;
import zv;

public final class HomeActivity
  extends mbp
  implements cre, cw<Cursor>, giv, gjh, gpq, gxv, iwt, iww, jnh, jxu, rl
{
  public static final mcs l = new mcs("debug.plus.enable_updated_notif", (byte)0);
  private int A;
  private tu B;
  private cul C;
  private lvn D;
  public final ikt d;
  public hdr e;
  public gpl f;
  public idy g;
  public HostLayout h;
  public jag i;
  public EsDrawerLayout j;
  public int k;
  private jeu o;
  private giz p;
  private hpo q;
  private kyj r;
  private lvj s;
  private ill t;
  private dbj u;
  private hgg v;
  private dfb w;
  private Toolbar x;
  private Bundle y;
  private SparseArray<Parcelable> z;
  
  public HomeActivity()
  {
    ikt localikt = new ikt(this, this.n).a(this.m);
    localikt.d = "active-plus-account";
    localikt.g.add(this);
    this.d = ((ikt)localikt);
    this.e = new hdr(this.n).a(new dbb(this));
    this.o = new jeu(this, this.n);
    this.g = new idy(this, this.n, "android_default_gmh");
    lvj locallvj = new lvj(this, this.n);
    this.m.a(lvj.class, locallvj);
    this.s = locallvj;
    new jyj(this, this.n);
    dfk localdfk = new dfk(this, this.n);
    localdfk.a = 0;
    localdfk.c = 172800000L;
    new bwl(new dbc(this)).a(this.m);
    new jxz(this, this.n, this).a(this.m);
    gxi localgxi = new gxi(this, this.n);
    this.m.a(gxp.class, localgxi);
    this.u = new dbj(this, this.n);
    this.z = new SparseArray();
  }
  
  private final bk a(int paramInt, Bundle paramBundle, bn parambn, boolean paramBoolean)
  {
    int m;
    if (this.D != null)
    {
      lvn locallvn = this.D;
      if ((locallvn.f) || ((locallvn.c != 2) && (locallvn.c != 1))) {
        break label164;
      }
      m = 1;
      if (m == 0) {
        this.D.c();
      }
    }
    Object localObject;
    switch (paramInt)
    {
    case 2: 
    case 3: 
    case 5: 
    case 6: 
    default: 
      localObject = null;
    }
    for (;;)
    {
      tp localtp = e().a();
      c(localtp);
      setTheme(d(paramInt));
      a(localtp, paramInt);
      this.u.a(false);
      return localObject;
      label164:
      m = 0;
      break;
      this.g.a = "android_default_gmh";
      localObject = new cge();
      ((bk)localObject).f(paramBundle);
      this.h.a((bk)localObject, null, paramBoolean);
      continue;
      this.g.a = "android_events_gmh";
      localObject = new ccj();
      paramBundle.putBoolean("refresh", true);
      ((bk)localObject).f(paramBundle);
      this.h.a((bk)localObject, parambn, paramBoolean);
      continue;
      this.g.a = "android_collections_gmh";
      localObject = ((bot)this.m.a(bot.class)).a();
      ((bk)localObject).f(paramBundle);
      this.h.a((bk)localObject, parambn, paramBoolean);
      continue;
      this.g.a = "android_collections_gmh";
      localObject = ((bot)this.m.a(bot.class)).h();
      this.h.a((bk)localObject, parambn, paramBoolean);
      continue;
      this.g.a = "android_communities_gmh";
      localObject = ((kyt)this.m.a(kyt.class)).a();
      this.h.a((bk)localObject, parambn, paramBoolean);
      continue;
      this.g.a = "android_communities_gmh";
      localObject = ((kyt)this.m.a(kyt.class)).b();
      this.h.a((bk)localObject, parambn, paramBoolean);
      continue;
      this.g.a = "android_communities_gmh";
      localObject = ((kyt)this.m.a(kyt.class)).c();
      this.h.a((bk)localObject, parambn, paramBoolean);
      continue;
      this.g.a = "android_location_gmh";
      localObject = new cta();
      ((bk)localObject).f(paramBundle);
      this.h.a((bk)localObject, parambn, paramBoolean);
      continue;
      this.g.a = "android_nots_gmh";
      localObject = new cqv();
      ((bk)localObject).f(paramBundle);
      this.h.a((bk)localObject, parambn, paramBoolean);
    }
  }
  
  private final void a(tp paramtp, int paramInt)
  {
    switch (paramInt)
    {
    case 10: 
    default: 
      paramtp.b(new ColorDrawable(getResources().getColor(efj.jh)));
      c(efj.kl);
      return;
    case 7: 
    case 8: 
      paramtp.b(new ColorDrawable(getResources().getColor(efj.ke)));
      c(efj.kf);
      return;
    }
    paramtp.b(new ColorDrawable(getResources().getColor(efj.kk)));
    c(efj.kj);
  }
  
  private static int c(Bundle paramBundle)
  {
    if (paramBundle != null) {
      return ((Bundle)paramBundle.getParcelable("destination")).getInt("destination", 0);
    }
    return 0;
  }
  
  @TargetApi(21)
  private final void c(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      EsDrawerLayout localEsDrawerLayout = this.j;
      localEsDrawerLayout.h = new ColorDrawable(getResources().getColor(paramInt));
      localEsDrawerLayout.invalidate();
    }
  }
  
  private final void c(tp paramtp)
  {
    this.x.animate().y(0.0F).setDuration(0L).start();
    paramtp.d();
  }
  
  private static int d(int paramInt)
  {
    switch (paramInt)
    {
    case 8: 
    case 10: 
    default: 
      return efj.yR;
    case 7: 
      return efj.yU;
    }
    return efj.yX;
  }
  
  private final void h()
  {
    int m;
    SparseArray localSparseArray;
    HostLayout localHostLayout;
    bk localbk;
    if (this.y != null)
    {
      m = this.y.getInt("destination", -1);
      if (m != -1)
      {
        localSparseArray = this.z;
        localHostLayout = this.h;
        localbk = localHostLayout.a.a("hosted");
        if (localbk == null) {
          break label70;
        }
      }
    }
    label70:
    for (bn localbn = localHostLayout.a.a(localbk);; localbn = null)
    {
      localSparseArray.put(m, localbn);
      return;
    }
  }
  
  private final void i()
  {
    Intent localIntent = getIntent();
    Bundle localBundle1 = localIntent.getExtras();
    this.y = new Bundle();
    if (localBundle1 == null) {
      this.y.putInt("destination", 0);
    }
    for (;;)
    {
      Bundle localBundle2 = this.y;
      ikt localikt = this.d;
      efj.k();
      localBundle2.putInt("account_id", localikt.e);
      return;
      this.y.putAll(localBundle1);
      int m = localIntent.getIntExtra("destination", 0);
      this.y.putInt("destination", m);
    }
  }
  
  private final Intent j()
  {
    if (!this.t.a()) {
      return this.t.b();
    }
    ikt localikt = this.d;
    efj.k();
    int m = localikt.e;
    djp localdjp = (djp)this.m.a(djp.class);
    if (localdjp.c(m)) {
      return efj.b(this, m, "", null);
    }
    if (this.y.getInt("destination") == 7) {
      return this.q.a(this, m, null);
    }
    if (this.y.getInt("destination") == 9) {
      return this.r.a(this, m);
    }
    if (localdjp.b(m)) {
      return efj.b(this, m, "", null);
    }
    Intent localIntent = new Intent(this, PeopleListActivity.class);
    localIntent.putExtra("account_id", m);
    localIntent.putExtra("people_view_type", 18);
    localIntent.putExtra("query", null);
    localIntent.putExtra("is_for_unified_search", true);
    return localIntent;
  }
  
  public final bk H_()
  {
    bk localbk = this.h.a.a("hosted");
    if ((localbk instanceof jxu)) {
      localbk = ((jxu)localbk).H_();
    }
    return localbk;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.d.e()) {}
    while (paramInt != 0) {
      return null;
    }
    Uri localUri = EsProvider.c(this);
    ikt localikt = this.d;
    efj.k();
    return new hqj(this, EsProvider.a(localUri, localikt.e), dbg.a, null, null, null);
  }
  
  public final void a(int paramInt) {}
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, efj.wT);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    this.f = ((gpm)localgpm);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a(gpl.class, this.f);
    localmbb.a(hdr.class, this.e);
    localmbb.b(jnh.class, this);
    this.v = ((hgg)this.m.a(hgg.class));
    this.p = ((giz)this.m.a(giz.class));
    this.q = ((hpo)this.m.a(hpo.class));
    this.r = ((kyj)this.m.a(kyj.class));
    this.C = new cul(this, this.n, aaw.fD, aaw.aK);
    setTheme(d(c(paramBundle)));
  }
  
  public final void a(View paramView)
  {
    tp localtp = e().a();
    if ((localtp != null) && (!localtp.f())) {
      c(localtp);
    }
    String str = getResources().getString(aau.lj);
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.announceForAccessibility(str);
    }
  }
  
  public final void a(View paramView, float paramFloat)
  {
    if (paramFloat > 0.0F)
    {
      tp localtp = e().a();
      if ((localtp != null) && (!localtp.f())) {
        c(localtp);
      }
    }
  }
  
  public final void a(bk parambk)
  {
    super.a(parambk);
    if ((parambk instanceof jag)) {
      this.i = ((jag)parambk);
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    giz localgiz = this.p;
    ikt localikt = this.d;
    efj.k();
    if (localgiz.c(localikt.e)) {
      paramgpr.b(aaw.J);
    }
  }
  
  public final void a(jgw paramjgw)
  {
    Intent localIntent = new Intent(this, HomeActivity.class);
    localIntent.putExtra("destination", 0);
    localIntent.putExtra("circle_info", new cyf(this, paramjgw.c(), paramjgw.b(), paramjgw.f(), paramjgw.a()));
    d(localIntent);
  }
  
  public final void a(tp paramtp)
  {
    paramtp.b(false);
    paramtp.c(true);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if ((!paramBoolean) && (this.y != null)) {
      return;
    }
    if (paramgiu1 == giu.c)
    {
      this.z.clear();
      if (this.y != null) {
        this.y.putInt("destination", 0);
      }
      HostLayout localHostLayout = this.h;
      bk localbk = localHostLayout.a.a("hosted");
      if (localbk != null)
      {
        cl localcl = localHostLayout.a.a();
        localcl.a(localbk);
        localcl.c();
        localHostLayout.a.b();
      }
      cv localcv = c();
      localcv.a(0);
      localcv.a(1);
      this.w.b();
      stopService(new Intent(this, CastService.class));
    }
    switch (dbf.a[paramgiu2.ordinal()])
    {
    }
    for (;;)
    {
      this.f.b();
      return;
      ill localill = new ill(this, paramInt2);
      localill.a.add(ine.class);
      this.t = localill;
      if (this.y == null) {
        i();
      }
      lln locallln = (lln)this.m.a(lln.class);
      ikt localikt2 = this.d;
      efj.k();
      if ((locallln.i(localikt2.e)) && (this.y.getInt("destination") == 0))
      {
        ikt localikt4 = this.d;
        efj.k();
        cge.a(this, localikt4.e);
      }
      a(this.y.getInt("destination"), this.y, null, false);
      c().b(0, null, this);
      if (dun.b()) {
        efj.a(this, getString(aau.cf), efj.wX, "gplus_dogfood_dialog_version");
      }
      jeu localjeu = this.o;
      int m = localjeu.c.c();
      if (m != -1) {
        if (jew.a(localjeu.a, m)) {
          break label560;
        }
      }
      label560:
      for (boolean bool = true;; bool = false)
      {
        localjeu.d = bool;
        if ((!jyl.a(localjeu.a, m)) && (!localjeu.a.getIntent().getBooleanExtra("skip_interstitials", false)) && (localjeu.a()))
        {
          Intent localIntent = new Intent(localjeu.a, InterstitialsActivity.class);
          localIntent.putExtra("account_id", localjeu.c.c());
          localjeu.a.startActivity(localIntent);
        }
        ikt localikt3 = this.d;
        efj.k();
        int n = localikt3.e;
        long l1 = ((giz)mbb.a(this, giz.class)).a(n).a("trending_topics_ts", 0L);
        if (System.currentTimeMillis() - l1 < 3600000L) {
          break;
        }
        gzj.a(this, new bop(this, n));
        break;
      }
      finish();
      continue;
      ikt localikt1 = this.d;
      ilf localilf = new ilf();
      localilf.g = true;
      iln localiln = new iln();
      localiln.a = getString(aau.tE);
      localiln.b = false;
      ikn localikn = new ikn();
      localikn.b.add("logged_out");
      localiln.c = localikn;
      Bundle localBundle = localiln.a();
      localilf.s = ilm.class;
      localilf.t = localBundle;
      localikt1.a(localilf);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int m = paramMenuItem.getItemId();
    ikt localikt = this.d;
    efj.k();
    int n = localikt.e;
    if (this.B.a(paramMenuItem)) {
      return true;
    }
    if (m == aaw.gZ) {
      return b(n);
    }
    if (m == aaw.gj)
    {
      gxr localgxr1 = new gxr();
      gxq localgxq1 = new gxq(pjt.a);
      localgxr1.b.add(localgxq1);
      new gwz(4, localgxr1.a(this)).b(this);
      this.u.a(true);
      return true;
    }
    if (m == aaw.J)
    {
      gxr localgxr2 = new gxr();
      gxq localgxq2 = new gxq(pkb.d);
      localgxr2.b.add(localgxq2);
      new gwz(4, localgxr2.a(this)).b(this);
      startActivity(j());
      return true;
    }
    return false;
  }
  
  public final boolean a(String paramString, long paramLong)
  {
    Object localObject;
    if (paramString.equals("virtual_circles")) {
      localObject = new cts(1);
    }
    for (;;)
    {
      cul localcul1 = this.C;
      if (localcul1.d == null) {
        break label190;
      }
      return localcul1.d.a((Parcelable)localObject);
      if (paramString.equals("clx"))
      {
        localObject = new cts(2);
      }
      else if (paramString.equals("squares"))
      {
        localObject = new cts(3);
      }
      else
      {
        if (paramString.equals("circles"))
        {
          cul localcul2 = this.C;
          if (localcul2.e != null) {
            localcul2.e.v();
          }
          return false;
        }
        if (paramString.equals("events"))
        {
          localObject = cua.a(7);
        }
        else if (paramString.equals("locations"))
        {
          localObject = cua.a(6);
        }
        else
        {
          if (!paramString.equals("notifications_legacy")) {
            break;
          }
          localObject = new cts(4);
        }
      }
    }
    return false;
    label190:
    return false;
  }
  
  public final void al_()
  {
    if (this.i != null)
    {
      this.C.a(this.i.B());
      return;
    }
    this.f.b();
  }
  
  public final void az_() {}
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(View paramView) {}
  
  public final void b(tp paramtp) {}
  
  public final boolean b(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_people_notification_count", this.A);
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pkf.v);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this)).b(this);
    gxx localgxx = (gxx)this.m.a(gxx.class);
    gxw localgxw = new gxw(this, paramInt);
    localgxw.c = gxz.bM;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxw.d = r_();
    localgxx.a(localgxw);
    startActivity(efj.m(this, paramInt));
    return true;
  }
  
  public final boolean d(Intent paramIntent)
  {
    if (paramIntent == null) {
      return false;
    }
    bk localbk1 = this.h.a.a("hosted");
    int m;
    Bundle localBundle1;
    Intent localIntent;
    bk localbk2;
    if (paramIntent.hasExtra("destination"))
    {
      m = paramIntent.getIntExtra("destination", 0);
      localBundle1 = paramIntent.getExtras();
      if (m == 6) {
        if (duj.a(this))
        {
          localIntent = duj.f(this);
          localIntent.addFlags(268435456);
          gxx localgxx = (gxx)this.m.a(gxx.class);
          gxw localgxw = new gxw(this);
          localgxw.c = gxz.dJ;
          localgxw.d = r_();
          localgxx.a(localgxw);
          startActivity(localIntent);
          localbk2 = null;
        }
      }
    }
    label134:
    for (boolean bool = true;; bool = false)
    {
      if ((localbk2 != null) && ((localbk2 instanceof iwt)))
      {
        return bool | ((iwt)localbk2).d(paramIntent);
        localIntent = efj.d(this);
        break;
        if (m == 5)
        {
          startActivity(j());
          localbk2 = null;
          break label134;
        }
        if (m == 2)
        {
          ikt localikt2 = this.d;
          efj.k();
          startActivity(efj.g(this, localikt2.e));
          localbk2 = null;
          break label134;
        }
        if ((this.y != null) && (this.y.getInt("destination") == m) && (m != 8))
        {
          localbk2 = this.h.a.a("hosted");
          break label134;
        }
        h();
        if (localBundle1 == null) {
          localBundle1 = new Bundle();
        }
        this.y = localBundle1;
        Bundle localBundle2 = this.y;
        ikt localikt1 = this.d;
        efj.k();
        localBundle2.putInt("account_id", localikt1.e);
        this.y.putInt("destination", m);
        localbk2 = a(m, this.y, (bn)this.z.get(m), true);
        break label134;
      }
      return bool;
      localbk2 = localbk1;
    }
  }
  
  public final void onBackPressed()
  {
    if (this.j.d(8388611))
    {
      this.j.c(8388611);
      return;
    }
    super.onBackPressed();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    gyx localgyx = (gyx)this.m.b(gyx.class);
    if (localgyx != null) {
      localgyx.b(SystemClock.elapsedRealtime());
    }
    if (isFinishing()) {
      return;
    }
    eaq.a = false;
    setContentView(efj.tS);
    this.x = ((Toolbar)findViewById(aaw.lM));
    Toolbar localToolbar1 = this.x;
    e().a(localToolbar1);
    this.D = new lvn(this.x, true);
    lvj locallvj = this.s;
    lvn locallvn = this.D;
    locallvj.a.a.add(locallvn);
    this.s.d = false;
    this.h = ((HostLayout)findViewById(aaw.ej));
    this.j = ((EsDrawerLayout)findViewById(aaw.cM));
    a(e().a(), c(paramBundle));
    cul localcul1 = this.C;
    bz localbz = localcul1.c.b.a.d;
    localcul1.e = ((ctr)localbz.a("navigation_bottom_bar_fragment_tag"));
    if (localcul1.e == null)
    {
      localcul1.e = new ctr();
      localbz.a().a(localcul1.b, localcul1.e, "navigation_bottom_bar_fragment_tag").b();
    }
    localcul1.d = ((ctw)localbz.a("navigation_drawer_fragment_tag"));
    if (localcul1.d == null)
    {
      localcul1.d = new ctw();
      localbz.a().a(localcul1.a, localcul1.d, "navigation_drawer_fragment_tag").b();
    }
    ctw localctw1 = localcul1.d;
    localctw1.b = localcul1.e;
    new cty(localctw1, localctw1.b.bp);
    this.B = new dbd(this, this, this.j, aau.lk, aau.li);
    tu localtu1 = this.B;
    if (localtu1.c)
    {
      localtu1.a(localtu1.b, 0);
      localtu1.c = false;
    }
    Toolbar localToolbar2 = this.x;
    dbe localdbe = new dbe(this);
    localToolbar2.g();
    localToolbar2.d.setOnClickListener(localdbe);
    cul localcul2 = this.C;
    tu localtu2 = this.B;
    ctw localctw2;
    if (localcul2.d != null)
    {
      localctw2 = localcul2.d;
      if (localctw2.a == null) {
        localctw2.ac = localtu2;
      }
    }
    else
    {
      label479:
      this.w = new dfb(this);
      if (paramBundle == null) {
        break label756;
      }
      this.y = ((Bundle)paramBundle.getParcelable("destination"));
      this.k = paramBundle.getInt("notification_count");
    }
    for (;;)
    {
      if (paramBundle == null)
      {
        ikt localikt2 = this.d;
        ilf localilf = new ilf();
        localilf.f = true;
        localilf.g = true;
        localilf.h = true;
        iln localiln = new iln();
        localiln.a = getString(aau.tE);
        Bundle localBundle = localiln.a();
        localilf.s = ilm.class;
        localilf.t = localBundle;
        localikt2.a(localilf);
        Set localSet = getIntent().getCategories();
        if ((localSet != null) && (localSet.contains("android.intent.category.LAUNCHER"))) {
          ((iyl)mbb.a(this, iyl.class)).a();
        }
      }
      if (!this.d.e()) {
        break;
      }
      c().a(0, null, this);
      ikt localikt1 = this.d;
      efj.k();
      ill localill = new ill(this, localikt1.e);
      localill.a.add(ine.class);
      this.t = localill;
      return;
      iwi localiwi = localctw2.a.p;
      if (localiwi.a.contains(localtu2)) {
        break label479;
      }
      localiwi.a.add(localtu2);
      break label479;
      label756:
      i();
    }
  }
  
  protected final void onDestroy()
  {
    ((ifj)this.m.a(ifj.class)).q();
    eaq.a = true;
    super.onDestroy();
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    Bundle localBundle1 = paramIntent.getExtras();
    int m = 0;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    cyf localcyf1;
    cyf localcyf2;
    int i2;
    if (localBundle1 != null)
    {
      Bundle localBundle2 = this.y;
      m = 0;
      if (localBundle2 != null)
      {
        int n = this.y.getInt("destination", -1);
        int i1 = localBundle1.getInt("destination", -1);
        str1 = this.y.getString("square_id");
        str2 = localBundle1.getString("square_id");
        str3 = this.y.getString("stream_id");
        str4 = localBundle1.getString("stream_id");
        str5 = this.y.getString("clx_id");
        str6 = localBundle1.getString("clx_id");
        localcyf1 = (cyf)this.y.getParcelable("circle_info");
        localcyf2 = (cyf)localBundle1.getParcelable("circle_info");
        if ((n == -1) || (i1 == -1)) {
          break label281;
        }
        if (n == i1) {
          break label275;
        }
        i2 = 1;
      }
    }
    for (;;)
    {
      int i3;
      if ((TextUtils.equals(str1, str2)) && (TextUtils.equals(str3, str4)) && (TextUtils.equals(str5, str6)))
      {
        boolean bool = efj.c(localcyf1, localcyf2);
        i3 = 0;
        if (bool) {}
      }
      else
      {
        i3 = 1;
      }
      m = i3 | i2;
      setIntent(paramIntent);
      if (m != 0) {
        this.y = null;
      }
      ikt localikt = this.d;
      ilf localilf = new ilf();
      localilf.f = true;
      localilf.g = true;
      localilf.h = true;
      localikt.a(localilf);
      return;
      label275:
      i2 = 0;
      continue;
      label281:
      i2 = 0;
    }
  }
  
  public final void onPause()
  {
    super.onPause();
    this.p.b(this);
    gyx localgyx = (gyx)this.m.b(gyx.class);
    if (localgyx != null) {
      if (!this.d.d()) {
        break label66;
      }
    }
    label66:
    for (String str = this.d.f().b("account_name");; str = null)
    {
      localgyx.a(str);
      return;
    }
  }
  
  public final void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    Toolbar localToolbar = this.x;
    int m = efj.rI;
    localToolbar.b(localToolbar.x.a(m, false));
    ((bvo)this.m.a(bvo.class)).a(this);
  }
  
  protected final void onResume()
  {
    super.onResume();
    if (isFinishing()) {}
    do
    {
      return;
      this.f.b();
      this.p.a(this);
    } while (this.i == null);
    this.C.a(this.i.B());
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("destination", this.y);
    paramBundle.putInt("notification_count", this.k);
    h();
  }
  
  public final gya r_()
  {
    if (this.h == null) {}
    for (bk localbk = null;; localbk = this.h.a.a("hosted"))
    {
      boolean bool = localbk instanceof gxv;
      gya localgya = null;
      if (bool) {
        localgya = ((gxv)localbk).r_();
      }
      return localgya;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.HomeActivity
 * JD-Core Version:    0.7.0.1
 */