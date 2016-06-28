package com.google.android.libraries.social.acl;

import aau;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import bp;
import bu;
import bv;
import bw;
import cl;
import com.google.android.libraries.social.acl2.AclPickerActionBarView;
import efj;
import gjp;
import gnb;
import gnp;
import gnq;
import gnr;
import gns;
import gnt;
import gnu;
import goa;
import goh;
import goi;
import goj;
import gok;
import gor;
import gou;
import gpc;
import hhj;
import hrq;
import hrs;
import java.util.ArrayList;
import jgx;
import jiw;
import jjm;
import jjo;
import jkz;
import jme;
import kys;
import lzo;
import lzp;
import mbb;
import mbp;

public final class PlusAclPickerActivity
  extends mbp
  implements goi, lzp
{
  public static final ArrayList<String> d = new gnp();
  public static final ArrayList<String> e = new gnr();
  public static final ArrayList<String> f = new gns();
  public static final ArrayList<String> g = new gnt();
  private static final ArrayList<String> i = new gnq();
  private static boolean j;
  public final gpc h;
  private String k = null;
  private final hrs l;
  private final gor o;
  private final lzo p;
  private final goa q;
  
  public PlusAclPickerActivity()
  {
    new gjp(this, this.n).a(this.m);
    this.l = new hrq(this.n);
    this.o = new gor();
    this.p = new lzo();
    this.h = new gpc();
    this.q = new goa(this, this.n);
  }
  
  public static String a(gnb paramgnb)
  {
    if (paramgnb.d.length > 0) {
      return "Squares";
    }
    if (paramgnb.e.length > 0) {
      return "Clx";
    }
    return "CirclesAndPeople";
  }
  
  public final void a(int paramInt)
  {
    Intent localIntent;
    if (paramInt == -1)
    {
      localIntent = new Intent();
      if (!j) {
        break label70;
      }
      localIntent.putExtra("extra_acl", gnb.a(new ArrayList(this.l.c())));
      localIntent.putExtra("restrict_to_domain", this.o.a());
    }
    for (;;)
    {
      setResult(paramInt, localIntent);
      finish();
      return;
      label70:
      localIntent.putParcelableArrayListExtra("acl.PlusAclPickerActivity.SELECTION", new ArrayList(this.l.c()));
      localIntent.putExtra("acl.PlusAclPickerActivity.RESTRICT_TO_DOMAIN", this.o.a());
    }
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    j = ((Boolean)this.m.a("acl.PlusAclPickerActivity.RETURN_AUDIENCE_DATA", Boolean.valueOf(true))).booleanValue();
    this.q.c = getIntent().getBooleanExtra("acl.PlusAclPickerActivity.ALLOW_EMPTY_AUDIENCE", false);
    this.m.a(goa.class, this.q);
    this.m.a(lzo.class, this.p);
    this.p.b = true;
    this.p.a(this);
    mbb localmbb = this.m;
    localmbb.a(goi.class, this);
    localmbb.a(gor.class, this.o);
    localmbb.a(gpc.class, this.h);
    localmbb.a(hrs.class, this.l);
    localmbb.a(jiw.class, new jkz(this, this.n));
    Intent localIntent1 = getIntent();
    jme localjme = new jme();
    jjm localjjm;
    if (localIntent1.hasExtra("circle_usage_type"))
    {
      int m = localIntent1.getIntExtra("circle_usage_type", 5);
      switch (m)
      {
      case 6: 
      case 7: 
      case 8: 
      case 13: 
      case 15: 
      default: 
        throw new IllegalArgumentException(36 + "Invalid CircleUsageType: " + m);
      case 5: 
        localjjm = jgx.g;
      }
    }
    for (;;)
    {
      localjme.a = localjjm;
      if (localIntent1.hasExtra("acl.PlusAclPickerActivity.FILTER_NULL_GAIA_IDS")) {
        localjme.b = localIntent1.getBooleanExtra("acl.PlusAclPickerActivity.FILTER_NULL_GAIA_IDS", true);
      }
      this.m.a(jme.class, localjme);
      hhj localhhj = new hhj();
      localhhj.a = getIntent().getBooleanExtra("is_limited", false);
      this.m.a(hhj.class, localhhj);
      kys localkys = new kys();
      localkys.a = getIntent().getBooleanExtra("is_limited", false);
      this.m.a(kys.class, localkys);
      Intent localIntent2 = getIntent();
      jjo localjjo = new jjo();
      localjjo.b = localIntent2.getBooleanExtra("acl.PlusAclPickerActivity.INCLUDE_PLUS_PAGES", true);
      this.m.a(jjo.class, localjjo);
      this.m.a(goh.class, new gnu(this));
      return;
      localjjm = jgx.i;
      continue;
      localjjm = jgx.h;
      continue;
      localjjm = jgx.j;
      continue;
      localjjm = jgx.o;
      continue;
      localjjm = jgx.l;
      continue;
      localjjm = jgx.m;
    }
  }
  
  public final void a(String paramString)
  {
    if (TextUtils.equals(this.k, paramString)) {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.q.a.a.getWindowToken(), 0);
    }
    this.k = paramString;
  }
  
  public final void onBackPressed()
  {
    if (this.h.a)
    {
      this.h.a(false);
      goa localgoa = this.q;
      if (localgoa.a != null) {
        localgoa.a.a();
      }
      return;
    }
    super.onBackPressed();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    gok localgok;
    String str;
    if (paramBundle == null)
    {
      goj localgoj = new goj();
      Intent localIntent = getIntent();
      localgok = new gok();
      if (localIntent.hasExtra("acl.PlusAclPickerActivity.SHAREOUSEL_ORDER"))
      {
        ArrayList localArrayList3 = localIntent.getStringArrayListExtra("acl.PlusAclPickerActivity.SHAREOUSEL_ORDER");
        localgok.a.putStringArrayList("AclPickerFragment.SHAREOUSEL_ORDER", localArrayList3);
        if (localIntent.hasExtra("acl.PlusAclPickerActivity.RESTRICT_TO_DOMAIN"))
        {
          boolean bool3 = localIntent.getBooleanExtra("acl.PlusAclPickerActivity.RESTRICT_TO_DOMAIN", false);
          localgok.b.a.putBoolean("DomainRestrictionToggleMixin.RESTRICT_TO_DOMAIN", bool3);
        }
        if (localIntent.hasExtra("acl.PlusAclPickerActivity.DISABLE_DOMAIN_RESTRICTION_TOGGLE"))
        {
          boolean bool2 = localIntent.getBooleanExtra("acl.PlusAclPickerActivity.DISABLE_DOMAIN_RESTRICTION_TOGGLE", false);
          localgok.b.a.putBoolean("DomainRestrictionToggleMixin.DISABLE_DOMAIN_RESTRICTION_TOGGLE", bool2);
        }
        boolean bool1 = localIntent.hasExtra("acl.PlusAclPickerActivity.SELECTION");
        ArrayList localArrayList2 = null;
        if (bool1) {
          localArrayList2 = localIntent.getParcelableArrayListExtra("acl.PlusAclPickerActivity.SELECTION");
        }
        if ((!localIntent.hasExtra("acl.PlusAclPickerActivity.SELECTION_SLIDE")) || (TextUtils.isEmpty(localIntent.getStringExtra("acl.PlusAclPickerActivity.SELECTION_SLIDE")))) {
          break label293;
        }
        str = localIntent.getStringExtra("acl.PlusAclPickerActivity.SELECTION_SLIDE");
        label189:
        if (localArrayList2 != null) {
          localgok.a.putParcelableArrayList("AclPickerFragment.INITIAL_SELECTION", localArrayList2);
        }
        if (!TextUtils.isEmpty(str)) {
          localgok.a.putString("AclPickerFragment.INITIAL_SELECTION_SLIDE", str);
        }
        localgoj.f(localgok.a);
        this.b.a.d.a().b(aau.xI, localgoj, "ACL_PICKER_FRAGMENT_TAG").b();
      }
    }
    for (;;)
    {
      setContentView(efj.DH);
      return;
      ArrayList localArrayList1 = i;
      localgok.a.putStringArrayList("AclPickerFragment.SHAREOUSEL_ORDER", localArrayList1);
      break;
      label293:
      str = "";
      break label189;
      this.k = paramBundle.getString("query_text");
    }
  }
  
  protected final void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    lzo locallzo = this.p;
    SearchView localSearchView = this.q.a.a;
    locallzo.a = localSearchView;
    localSearchView.f = locallzo;
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (!TextUtils.isEmpty(this.k)) {
      paramBundle.putString("query_text", this.k);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.acl.PlusAclPickerActivity
 * JD-Core Version:    0.7.0.1
 */