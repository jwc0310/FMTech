package com.google.android.apps.photos.phone;

import aau;
import aaw;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import anz;
import asl;
import aso;
import asr;
import asw;
import asx;
import asy;
import ata;
import atc;
import atg;
import ati;
import atq;
import atx;
import aud;
import bfy;
import bk;
import bn;
import bw;
import caw;
import cbf;
import cbj;
import cbq;
import cdo;
import cey;
import cfp;
import cfs;
import chs;
import cij;
import cl;
import com.google.android.apps.photos.service.GooglePhotoDownsyncService;
import com.google.android.apps.photos.views.NavigationBarLayout;
import com.google.android.apps.photos.views.PhotosHostLayout;
import com.google.android.apps.photos.views.SelectedAccountNavigationView;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.views.EsDrawerLayout;
import cpb;
import crh;
import cv;
import cw;
import cxl;
import dka;
import dkb;
import dkc;
import dpq;
import duj;
import dun;
import efj;
import fu;
import gis;
import giu;
import giv;
import giz;
import gjb;
import gpl;
import gpm;
import gpq;
import gpr;
import gxv;
import gxw;
import gxx;
import gxz;
import gya;
import hqj;
import hwh;
import hyg;
import hyi;
import idy;
import ifj;
import ikn;
import ikt;
import ilf;
import ilm;
import iln;
import ine;
import inf;
import iot;
import iri;
import isq;
import iwb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import jjf;
import jov;
import jpd;
import jpe;
import jyj;
import mbb;
import mbp;
import ra;
import rf;
import rm;
import tp;
import tu;
import tv;

public class PhotosHomeActivity
  extends mbp
  implements View.OnClickListener, AdapterView.OnItemClickListener, bfy, cw<Cursor>, giv, gpq, gxv, hyg
{
  public final ikt d;
  private jov e;
  private jpd f;
  private final jpe g;
  private final SparseArray<atc> h;
  private PhotosHostLayout i;
  private Bundle j;
  private SparseArray<Parcelable> k;
  private boolean l;
  private ListView o;
  private gpl p;
  private SelectedAccountNavigationView q;
  private asw r;
  private ListView s;
  private cxl t;
  private tu u;
  
  public PhotosHomeActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new jyj(this, this.n);
    new hwh(this, this.n);
    new atx(this, this.n);
    new crh(this, this.n);
    new iot(this, this.n, aaw.cM);
    ikt localikt = new ikt(this, this.n).a(this.m);
    localikt.d = "active-photos-account";
    localikt.g.add(this);
    this.d = ((ikt)localikt);
    this.g = new atg(this);
    this.h = new SparseArray();
    this.k = new SparseArray();
  }
  
  private final bk a(int paramInt)
  {
    if ((this.j != null) && (this.j.getInt("destination") == paramInt))
    {
      this.i.a();
      return this.i.e.a("hosted");
    }
    if (paramInt == 0)
    {
      ikt localikt3 = this.d;
      efj.k();
      Intent localIntent = efj.b(this, localikt3.e);
      localIntent.setFlags(335544320);
      startActivity(localIntent);
      this.i.a();
      return null;
    }
    if (paramInt == 9)
    {
      String str = jjf.a(this.d.f().b("gaia_id"));
      ikt localikt2 = this.d;
      efj.k();
      startActivity(efj.b(this, localikt2.e, str, null, false));
      this.i.a();
      return null;
    }
    l();
    this.j = new Bundle();
    Bundle localBundle = this.j;
    ikt localikt1 = this.d;
    efj.k();
    localBundle.putInt("account_id", localikt1.e);
    this.j.putInt("destination", paramInt);
    return a(paramInt, this.j, (bn)this.k.get(paramInt), true);
  }
  
  private final bk a(int paramInt, Bundle paramBundle, bn parambn, boolean paramBoolean)
  {
    aud localaud = (aud)mbb.a(this, aud.class);
    isq localisq = localaud.b;
    localisq.a.clear();
    localisq.b = 0;
    localisq.c = 0;
    localisq.d = 0;
    localisq.g = 0;
    localisq.h = 0;
    localisq.e = 0;
    localisq.i = 0;
    localisq.j = 0;
    localisq.k = 0;
    localaud.c();
    anz localanz = (anz)mbb.a(this, anz.class);
    this.i.a();
    String str = "Photos";
    Object localObject;
    switch (paramInt)
    {
    default: 
      this.h.get(paramInt);
      localObject = null;
    }
    for (;;)
    {
      localanz.b = str;
      localanz.c = paramInt;
      return localObject;
      localObject = new cdo();
      continue;
      Intent localIntent = getIntent();
      cfp localcfp = new cfp();
      int m = 6;
      if (cbq.A()) {
        m = 70;
      }
      paramBundle.putInt("tabs", m);
      paramBundle.putBoolean("show_promos", true);
      paramBundle.putBoolean("show_autobackup_status", true);
      if (localIntent.hasExtra("starting_tab_index")) {
        paramBundle.putInt("starting_tab_index", localIntent.getIntExtra("starting_tab_index", 1));
      }
      Uri localUri = (Uri)localIntent.getParcelableExtra("scroll_to_uri");
      if (localUri != null)
      {
        paramBundle.putParcelable("scroll_to_uri", localUri);
        paramBundle.putInt("starting_tab_index", 1);
      }
      localcfp.f(paramBundle);
      this.i.a(localcfp, parambn, paramBoolean);
      str = "Photos";
      localObject = localcfp;
      continue;
      str = "Albums";
      localObject = new caw();
      ((bk)localObject).f(paramBundle);
      this.i.a((bk)localObject, parambn, paramBoolean);
      continue;
      str = "AutoAwesomes";
      localObject = new cbf();
      paramBundle.putBoolean("hide_search_view", true);
      ((bk)localObject).f(paramBundle);
      this.i.a((bk)localObject, null, paramBoolean);
      continue;
      str = "PhotoSearch";
      localObject = new cey();
      paramBundle.putString("query", "#videos");
      paramBundle.putBoolean("is_videos_destination", true);
      paramBundle.putBoolean("hide_search_view", true);
      paramBundle.putBoolean("search_local_videos", true);
      ((bk)localObject).f(paramBundle);
      this.i.a((bk)localObject, null, paramBoolean);
      continue;
      str = "PhotosOfYou";
      localObject = new cfs();
      ((bk)localObject).f(paramBundle);
      this.i.a((bk)localObject, parambn, paramBoolean);
      continue;
      localObject = new cbj();
      paramBundle.putBoolean("local_folders_only", true);
      ((bk)localObject).f(paramBundle);
      this.i.a((bk)localObject, parambn, paramBoolean);
      continue;
      localObject = new chs();
      ((bk)localObject).f(paramBundle);
      this.i.a((bk)localObject, null, paramBoolean);
      continue;
      str = "PhotoSearch";
      localObject = new cey();
      ((bk)localObject).f(paramBundle);
      this.i.a((bk)localObject, null, paramBoolean);
    }
  }
  
  private final void h()
  {
    jov localjov = this.e;
    jpd localjpd = this.f;
    int m = aaw.iS;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
    localjov.a(localjpd, m, Arrays.asList(arrayOfString));
  }
  
  private final void i()
  {
    if (this.q == null) {
      return;
    }
    this.q.a(this.d);
    j();
    this.r.b.clear();
    this.r.a(1, efj.rP, aau.og);
    for (int m = 0; m < this.h.size(); m++)
    {
      atc localatc = (atc)this.h.get(this.h.keyAt(m));
      this.r.a(localatc.c(), localatc.a(), localatc.b());
    }
    if (this.d.e())
    {
      this.r.a(2, efj.rM, aau.oc);
      this.r.a(3, efj.ro, aau.od);
      this.r.a(4, efj.rR, aau.oi);
      this.r.a(5, efj.rZ, aau.of);
    }
    asw localasw = this.r;
    localasw.b.add(new ata(localasw.a));
    this.r.a(8, efj.rE, aau.oe);
    this.r.a(6, efj.rA, aau.oh);
    this.r.notifyDataSetChanged();
  }
  
  private final void j()
  {
    giz localgiz = (giz)this.m.a(giz.class);
    List localList = localgiz.a(new String[] { "logged_in" });
    Collections.sort(localList, new gis(localgiz));
    int m = localList.size();
    boolean bool;
    if (m != 0) {
      if (m == 1)
      {
        gjb localgjb = localgiz.a(((Integer)localList.get(0)).intValue());
        if (((localgjb.c("is_plus_page")) && (localgjb.c("is_managed_account"))) || (localgjb.a("page_count", 0) > 0)) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      SelectedAccountNavigationView localSelectedAccountNavigationView1 = this.q;
      if (localSelectedAccountNavigationView1.c != bool)
      {
        localSelectedAccountNavigationView1.c = bool;
        localSelectedAccountNavigationView1.a();
      }
      SelectedAccountNavigationView localSelectedAccountNavigationView2 = this.q;
      int n;
      if (this.d.e())
      {
        n = 0;
        label170:
        localSelectedAccountNavigationView2.setVisibility(n);
        if (!bool) {
          break label209;
        }
        this.t.b();
      }
      label209:
      while (this.i.c.a.d != 1)
      {
        return;
        bool = false;
        break;
        bool = true;
        break;
        n = 8;
        break label170;
      }
      NavigationBarLayout localNavigationBarLayout = this.i.c;
      localNavigationBarLayout.a.a(0);
      localNavigationBarLayout.a(false);
      return;
      bool = false;
    }
  }
  
  private final void k()
  {
    this.h.clear();
    if (this.d.e())
    {
      List localList = this.m.c(atc.class);
      Collections.sort(localList);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
    }
  }
  
  private final void l()
  {
    int m;
    SparseArray localSparseArray;
    PhotosHostLayout localPhotosHostLayout;
    bk localbk;
    if (this.j != null)
    {
      m = this.j.getInt("destination", -1);
      if (m != -1)
      {
        localSparseArray = this.k;
        localPhotosHostLayout = this.i;
        localbk = localPhotosHostLayout.e.a("hosted");
        if (localbk == null) {
          break label68;
        }
      }
    }
    label68:
    for (bn localbn = localPhotosHostLayout.e.a(localbk);; localbn = null)
    {
      localSparseArray.put(m, localbn);
      return;
    }
  }
  
  private final void m()
  {
    Intent localIntent = getIntent();
    Bundle localBundle1 = localIntent.getExtras();
    this.j = new Bundle();
    if (localBundle1 == null) {
      this.j.putInt("destination", 1);
    }
    for (;;)
    {
      Bundle localBundle2 = this.j;
      ikt localikt = this.d;
      efj.k();
      localBundle2.putInt("account_id", localikt.e);
      return;
      this.j.putAll(localBundle1);
      int m = localIntent.getIntExtra("destination", 1);
      this.j.putInt("destination", m);
    }
  }
  
  private final void n()
  {
    a(this.j.getInt("destination"), this.j, null, false);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.d.e()) {
      return null;
    }
    switch (paramInt)
    {
    default: 
      return null;
    }
    Uri localUri = EsProvider.c(this);
    ikt localikt = this.d;
    efj.k();
    return new hqj(this, EsProvider.a(localUri, localikt.e), ati.a, null, null, null);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, efj.wT);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    this.p = ((gpm)localgpm);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    localmbb.a(gpl.class, this.p);
    localmbb.a(asl.class, new asl(this, this.n));
    localmbb.a(asr.class, new aso(this, this.n));
    localmbb.a(cij.class, new cij(this, this.n, new cpb()));
    this.e = ((jov)this.m.a(jov.class));
    this.f = ((jpd)this.m.a(jpd.class));
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    paramtp.b(false);
    paramtp.c(true);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (!paramBoolean) {
      return;
    }
    if (paramgiu1 == giu.c)
    {
      this.i.a();
      PhotosHostLayout localPhotosHostLayout3 = this.i;
      bk localbk = localPhotosHostLayout3.e.a("hosted");
      if (localbk != null)
      {
        localPhotosHostLayout3.e.a().a(localbk).b();
        localPhotosHostLayout3.e.b();
      }
    }
    switch (ath.a[paramgiu2.ordinal()])
    {
    }
    EsDrawerLayout localEsDrawerLayout;
    NavigationBarLayout localNavigationBarLayout1;
    for (;;)
    {
      PhotosHostLayout localPhotosHostLayout1 = this.i;
      localPhotosHostLayout1.g = false;
      localEsDrawerLayout = localPhotosHostLayout1.d;
      localNavigationBarLayout1 = localPhotosHostLayout1.c;
      if (rf.d(localNavigationBarLayout1)) {
        break;
      }
      throw new IllegalArgumentException("View " + localNavigationBarLayout1 + " is not a drawer with appropriate layout_gravity");
      NavigationBarLayout localNavigationBarLayout2 = this.i.c;
      localNavigationBarLayout2.a.a(0);
      localNavigationBarLayout2.a(false);
      PhotosHostLayout localPhotosHostLayout2;
      if (getIntent().getBooleanExtra("show_navigation_bar", false))
      {
        localPhotosHostLayout2 = this.i;
        if (!localPhotosHostLayout2.d.g(localPhotosHostLayout2.c)) {
          break label393;
        }
      }
      for (;;)
      {
        k();
        if (this.j == null) {
          m();
        }
        n();
        if (dun.b()) {
          efj.a(this, getString(aau.oL), efj.wY, "photos_dogfood_dialog_version");
        }
        ikt localikt2 = this.d;
        efj.k();
        int m = localikt2.e;
        if (getIntent().hasExtra("com.google.android.libraries.social.notifications.notif_id"))
        {
          gxx localgxx2 = (gxx)mbb.a(this, gxx.class);
          gxw localgxw2 = new gxw(this, m);
          localgxw2.c = gxz.dK;
          localgxx2.a(localgxw2);
        }
        if (this.l) {
          break;
        }
        gxx localgxx1 = (gxx)mbb.a(this, gxx.class);
        gxw localgxw1 = new gxw(this, m);
        localgxw1.c = gxz.dM;
        localgxx1.a(localgxw1);
        break;
        label393:
        efj.k(localPhotosHostLayout2);
        localPhotosHostLayout2.c.setVisibility(0);
        localPhotosHostLayout2.d.e(localPhotosHostLayout2.c);
      }
      k();
      m();
      n();
      continue;
      ikt localikt1 = this.d;
      ilf localilf = new ilf();
      localilf.g = true;
      iln localiln = new iln();
      localiln.a = getString(aau.jB);
      localiln.b = false;
      ikn localikn = new ikn();
      localikn.b.add("logged_out");
      localiln.c = localikn;
      Bundle localBundle = localiln.a();
      localilf.s = ilm.class;
      localilf.t = localBundle;
      localikt1.a(localilf);
    }
    localEsDrawerLayout.a(0, ((rm)localNavigationBarLayout1.getLayoutParams()).a);
    i();
    cv localcv = c();
    if (localcv.b(0) == null)
    {
      c().a(0, null, this);
      return;
    }
    localcv.b(0, null, this);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (this.u.a(paramMenuItem)) {
      return true;
    }
    PhotosHostLayout localPhotosHostLayout = this.i;
    if (localPhotosHostLayout.d.g(localPhotosHostLayout.c)) {
      this.i.a();
    }
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  public final void b(boolean paramBoolean)
  {
    ikt localikt = this.d;
    efj.k();
    int m = localikt.e;
    gxz localgxz;
    gxx localgxx;
    if (paramBoolean)
    {
      localgxz = gxz.c;
      localgxx = (gxx)this.m.a(gxx.class);
      gxw localgxw1 = new gxw(this, m);
      localgxw1.c = localgxz;
      localgxx.a(localgxw1);
      if (!paramBoolean) {
        break label123;
      }
      gxw localgxw2 = new gxw(this, m);
      localgxw2.d = r_();
      localgxw2.e = gya.K;
      localgxx.a(localgxw2);
    }
    for (;;)
    {
      this.p.b();
      return;
      localgxz = gxz.d;
      break;
      label123:
      gxw localgxw3 = new gxw(this, m);
      localgxw3.d = gya.K;
      localgxw3.e = r_();
      localgxx.a(localgxw3);
    }
  }
  
  public final void g()
  {
    k();
    i();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.q)
    {
      if (this.i.c.a.d == 1)
      {
        NavigationBarLayout localNavigationBarLayout = this.i.c;
        localNavigationBarLayout.a.a(0);
        localNavigationBarLayout.a(false);
      }
      if (!this.d.e())
      {
        ikt localikt = this.d;
        ilf localilf = new ilf();
        localilf.g = true;
        localilf.u.add(ine.class);
        iln localiln = new iln();
        localiln.a = getString(aau.tE);
        Bundle localBundle = localiln.a();
        localilf.s = ilm.class;
        localilf.t = localBundle;
        localikt.a(localilf);
      }
    }
    else
    {
      return;
    }
    a(9);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    tu localtu = this.u;
    localtu.b = localtu.a.a();
    localtu.a();
  }
  
  @SuppressLint({"WrongViewCast"})
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      GooglePhotoDownsyncService.b(this);
      new Thread(new dkb((dka)this.m.a(dka.class)), "resume_in_progress_sync").start();
      dka localdka = (dka)this.m.a(dka.class);
      efj.k();
      new Thread(new dkc(localdka), "allphotos_localmedia_foreground_refresh").start();
    }
    boolean bool;
    label164:
    PhotosHostLayout localPhotosHostLayout2;
    if (paramBundle != null)
    {
      bool = true;
      this.l = bool;
      eaq.a = false;
      setContentView(efj.vV);
      this.i = ((PhotosHostLayout)findViewById(aaw.ej));
      this.i.f = this;
      this.e.a(aaw.iS, this.g);
      if (paramBundle == null) {
        break label460;
      }
      this.j = ((Bundle)paramBundle.getParcelable("destination"));
      this.o = this.i.c.b;
      this.r = new asw(this);
      this.o.setAdapter(this.r);
      this.o.setOnItemClickListener(this);
      this.s = this.i.c.c;
      this.t = new cxl(this);
      this.t.g = true;
      this.t.h = true;
      this.s.setAdapter(this.t);
      this.s.setOnItemClickListener(this);
      this.q = this.i.b;
      this.q.setOnClickListener(this);
      this.u = new tu(this, (rf)findViewById(aaw.cM), aau.ew, aau.ev);
      this.i.a = this.u;
      ((hyi)this.m.a(hyi.class)).a(this);
      if (paramBundle != null) {
        if (paramBundle.getBoolean("navigation_bar_visible"))
        {
          localPhotosHostLayout2 = this.i;
          if (!localPhotosHostLayout2.d.g(localPhotosHostLayout2.c)) {
            break label467;
          }
        }
      }
    }
    for (;;)
    {
      PhotosHostLayout localPhotosHostLayout1 = this.i;
      int m = paramBundle.getInt("navigation_bar_mode");
      NavigationBarLayout localNavigationBarLayout = localPhotosHostLayout1.c;
      localNavigationBarLayout.a.a(m);
      localNavigationBarLayout.a(false);
      ((iwb)this.m.a(iwb.class)).a(this);
      ((iri)this.m.a(iri.class)).a();
      return;
      bool = false;
      break;
      label460:
      h();
      break label164;
      label467:
      efj.k(localPhotosHostLayout2);
      localPhotosHostLayout2.c.setVisibility(0);
      localPhotosHostLayout2.d.e(localPhotosHostLayout2.c);
    }
  }
  
  protected void onDestroy()
  {
    ((hyi)this.m.a(hyi.class)).b(this);
    ((ifj)this.m.a(ifj.class)).q();
    eaq.a = true;
    super.onDestroy();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramAdapterView == this.o)
    {
      localasw = this.r;
      localasx = new asx();
      ((atq)localasw.b.get(paramInt)).a(localasx);
      if (localasx.a == null)
      {
        i2 = -1;
        if (i2 != -1) {
          a(i2);
        }
      }
    }
    while (paramAdapterView != this.s) {
      for (;;)
      {
        asw localasw;
        asx localasx;
        return;
        int i2 = localasx.a.a;
      }
    }
    Cursor localCursor1 = this.t.c;
    int m = 0;
    if (localCursor1 != null)
    {
      boolean bool = localCursor1.moveToPosition(paramInt);
      m = 0;
      if (bool)
      {
        int i1 = localCursor1.getInt(1);
        m = 0;
        if (i1 == -2) {
          m = 1;
        }
      }
    }
    if (m != 0)
    {
      ikt localikt2 = this.d;
      ilf localilf2 = new ilf();
      localilf2.g = true;
      localilf2.u.add(ine.class);
      localilf2.s = inf.class;
      localilf2.t = null;
      localikt2.a(localilf2);
      return;
    }
    Cursor localCursor2 = this.t.c;
    if ((localCursor2 != null) && (localCursor2.moveToPosition(paramInt))) {}
    for (int n = localCursor2.getInt(1); n == -1; n = -1)
    {
      j();
      return;
    }
    ikt localikt1 = this.d;
    ilf localilf1 = new ilf();
    localilf1.g = true;
    localilf1.u.add(ine.class);
    localilf1.c = n;
    localikt1.a(localilf1);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    h();
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.u.a();
  }
  
  public void onResume()
  {
    super.onResume();
    if (duj.a(this))
    {
      startActivity(duj.f(this));
      finish();
      return;
    }
    if ((dun.b()) && ("TRUE".equalsIgnoreCase(dun.d.a())) && (this.r != null) && (!this.r.isEmpty()) && (this.d.e())) {
      a(new Random().nextInt(this.r.b.size()));
    }
    k();
    i();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("destination", this.j);
    l();
    PhotosHostLayout localPhotosHostLayout = this.i;
    paramBundle.putBoolean("navigation_bar_visible", localPhotosHostLayout.d.g(localPhotosHostLayout.c));
    paramBundle.putInt("navigation_bar_mode", this.i.c.a.d);
  }
  
  public final gya r_()
  {
    if (this.i == null) {}
    for (bk localbk = null;; localbk = this.i.e.a("hosted"))
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
 * Qualified Name:     com.google.android.apps.photos.phone.PhotosHomeActivity
 * JD-Core Version:    0.7.0.1
 */