package com.google.android.libraries.social.collexions.impl.share;

import aau;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import ehr;
import git;
import gjp;
import gxj;
import gxl;
import gxt;
import gzi;
import gzj;
import haa;
import hae;
import hhg;
import hlm;
import hou;
import hox;
import hoz;
import hpo;
import java.util.ArrayList;
import jyj;
import kvj;
import mbb;
import mcc;
import pjn;

public final class MovePostToCollexionActivity
  extends mcc
  implements gzi, hoz
{
  private gzj d;
  private hpo e;
  private final git f = new gjp(this, this.k).a(this.j);
  private boolean g;
  private hou h;
  private String i;
  private String l;
  private boolean m;
  private byte[] n;
  private boolean o;
  
  public MovePostToCollexionActivity()
  {
    new jyj(this, this.k);
    new gxj(this.k);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = ((gzj)this.j.a(gzj.class));
    this.d.a.add(this);
    this.e = ((hpo)this.j.a(hpo.class));
    gxt localgxt = pjn.N;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.i;
    new gxl(new kvj(localgxt, arrayOfString)).a(this.j);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("moveposttoclx".equals(paramString))
    {
      if (hae.a(paramhae)) {
        Toast.makeText(this, ehr.bI, 1).show();
      }
    }
    else {
      return;
    }
    Toast.makeText(this, getString(ehr.bG), 1).show();
    setResult(-1);
    finish();
  }
  
  public final void aA_()
  {
    hou localhou = this.h;
    String str = null;
    if (localhou != null) {
      str = this.h.c;
    }
    if (TextUtils.isEmpty(str)) {
      return;
    }
    hlm localhlm = new hlm(this.f.c(), this.i, this.l, str);
    this.d.c(localhlm);
  }
  
  public final void aB_()
  {
    startActivity(this.e.a(this.f.c(), null, this.g, this.n, this.o));
  }
  
  public final void b()
  {
    hlm localhlm = new hlm(this.f.c(), this.i, this.l, null);
    this.d.c(localhlm);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle1 = getIntent().getExtras();
    if (localBundle1 != null)
    {
      this.i = localBundle1.getString("clx_activity_id");
      this.g = localBundle1.getBoolean("restrict_to_domain");
      this.o = localBundle1.getBoolean("is_limited");
      this.l = localBundle1.getString("from_collexion_id");
      this.n = localBundle1.getByteArray("promoted_post_data");
      this.m = localBundle1.getBoolean("show_reshare_shortcut", false);
    }
    setContentView(aau.zC);
    setTitle(ehr.bH);
    bz localbz = this.b.a.d;
    this.h = ((hou)localbz.a(efj.JS));
    hhg localhhg;
    if (this.h == null)
    {
      localhhg = new hhg();
      if (!this.g) {
        break label331;
      }
      localhhg.a.putBoolean("allowDomain", true);
    }
    for (Bundle localBundle2 = localhhg.a;; localBundle2 = localhhg.a)
    {
      hox localhox = new hox().a(true);
      localhox.a.putBoolean("show_quick_collect_header", false);
      boolean bool1 = this.g;
      localhox.a.putBoolean("restrict_to_domain", bool1);
      localhox.a.putBundle("collexion_visibility_type", localBundle2);
      String str1 = this.l;
      localhox.a.putString("from_collexion_id", str1);
      String str2 = getString(ehr.bQ);
      localhox.a.putCharSequence("custom_list_title", str2);
      boolean bool2 = this.m;
      localhox.a.putBoolean("show_reshare_shortcut", bool2);
      String str3 = getString(ehr.bM);
      localhox.a.putCharSequence("custom_reshare_label", str3);
      this.h = localhox.a();
      localbz.a().a(efj.JS, this.h).b();
      this.h.aa = this;
      return;
      label331:
      localhhg.a.putBoolean("allowPublic", true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.share.MovePostToCollexionActivity
 * JD-Core Version:    0.7.0.1
 */