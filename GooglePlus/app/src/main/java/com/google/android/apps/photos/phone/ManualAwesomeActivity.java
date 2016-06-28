package com.google.android.apps.photos.phone;

import aau;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import anf;
import atd;
import ate;
import atf;
import bj;
import bmw;
import bnz;
import bp;
import bsz;
import btc;
import bu;
import bv;
import bw;
import cl;
import dct;
import dcu;
import gxw;
import gxx;
import gxz;
import gzi;
import gzj;
import haa;
import hae;
import hue;
import hug;
import ipa;
import ixf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mbb;
import mcc;
import mfj;

public class ManualAwesomeActivity
  extends mcc
  implements dcu, gzi
{
  public final anf d = new anf(this, this.k);
  private int e;
  private int f;
  private ArrayList<btc> g;
  private final gzj h = new gzj(this, this.k);
  private hue i = new hue(this.k);
  private final Runnable l = new atd(this);
  private hug m;
  private hug n;
  private final Runnable o = new atf(this);
  
  private final void a(gxz paramgxz)
  {
    int j = getIntent().getIntExtra("account_id", -1);
    if (j != -1)
    {
      gxx localgxx = (gxx)this.j.a(gxx.class);
      gxw localgxw = new gxw(this, j);
      localgxw.c = paramgxz;
      localgxx.a(localgxw);
    }
  }
  
  private final void g()
  {
    setResult(0, new Intent());
    finish();
  }
  
  private final void h()
  {
    if ((this.i != null) && (this.n != null)) {
      this.i.a(this.n);
    }
  }
  
  public final void a(int paramInt)
  {
    this.e = 1;
    bj localbj = (bj)this.b.a.d.a("manual_awesome_selector");
    if (localbj != null) {
      localbj.a(false);
    }
    if (paramInt == 8)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("manual_awesome_activity_return", 1);
      setResult(-1, localIntent);
      finish();
      return;
    }
    a(bsz.a(this.f));
    this.f = paramInt;
    Toast.makeText(this, bsz.a(this, this.g, this.f), 1).show();
    int j = getIntent().getIntExtra("account_id", -1);
    if (getIntent().hasExtra("cluster_id"))
    {
      startActivityForResult(bsz.a(this, j, getIntent().getStringExtra("cluster_id"), this.g, this.f), 1);
      return;
    }
    startActivityForResult(bsz.a(this, j, this.g, this.f), 1);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.j.a(gzj.class, this.h);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    e();
    if (paramString.equals("CreateMediaBundleTask"))
    {
      boolean bool = paramhae.a().containsKey("hint_message");
      String str = null;
      if (bool) {
        str = paramhae.a().getString("hint_message");
      }
      if (!TextUtils.isEmpty(str)) {
        Toast.makeText(this, str, 1).show();
      }
      if (hae.a(paramhae))
      {
        if (TextUtils.isEmpty(str))
        {
          if (!((ixf)mbb.a(this, ixf.class)).a()) {
            break label125;
          }
          Toast.makeText(this, bsz.b(this, this.g, this.f), 1).show();
        }
        for (;;)
        {
          a(gxz.ec);
          g();
          return;
          label125:
          Toast.makeText(this, aau.jD, 1).show();
        }
      }
      if (paramhae.a().containsKey("result_media"))
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("manual_awesome_activity_return", 2);
        localIntent.putExtra("result_media", paramhae.a().getParcelable("result_media"));
        a(gxz.eb);
        setResult(-1, localIntent);
        finish();
      }
    }
    else if (paramString.equals("ReadPhotosFeaturesTask"))
    {
      h();
      f();
      return;
    }
    g();
  }
  
  public final void d()
  {
    if (this.e == 0)
    {
      this.e = 2;
      g();
    }
    while (this.e != 1) {
      return;
    }
    this.e = 2;
  }
  
  public final void e()
  {
    if ((this.i != null) && (this.l != null))
    {
      this.i.a(this.l);
      if (this.m != null) {
        this.i.a(this.m);
      }
    }
  }
  
  public final void f()
  {
    if ((this.e != 2) && (this.b.a.d.a("manual_awesome_selector") == null) && (bsz.a(getIntent().getBooleanExtra("show_movie", false)) != null))
    {
      this.g = bsz.a(getIntent().getBooleanExtra("show_movie", false));
      dct localdct = dct.a(this.g);
      cl localcl = this.b.a.d.a();
      localcl.a(localdct, "manual_awesome_selector");
      localcl.c();
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1)
    {
      g();
      return;
    }
    if ((paramInt1 == 1) && (paramIntent != null) && (paramIntent.hasExtra("shareables")))
    {
      a(gxz.ea);
      int j = getIntent().getIntExtra("account_id", -1);
      ArrayList localArrayList1 = paramIntent.getParcelableArrayListExtra("shareables");
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = localArrayList1.iterator();
      while (localIterator.hasNext()) {
        localArrayList2.add(((ipa)localIterator.next()).e());
      }
      bmw localbmw = new bmw(this, j, localArrayList2, this.f);
      this.h.b(localbmw);
      String str = bsz.c(this, this.g, this.f);
      this.m = this.i.a(new ate(this, str), 300L);
      return;
    }
    g();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.h.a.add(this);
    this.e = 0;
    if (paramBundle != null)
    {
      this.e = paramBundle.getInt("selection_dialog");
      this.f = paramBundle.getInt("render_type", 0);
      this.g = paramBundle.getParcelableArrayList("manual_awesome_types");
    }
  }
  
  public void onPause()
  {
    h();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if ((bsz.a(getIntent().getBooleanExtra("show_movie", false)) == null) && (!this.h.a("ReadPhotosFeaturesTask")))
    {
      this.n = this.i.a(this.o, 1000L);
      int j = getIntent().getIntExtra("account_id", -1);
      this.h.b(new bnz(this, j, new int[] { 2 }));
      this.m = this.i.a(new ate(this, getString(aau.jp)), 300L);
    }
    f();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("selection_dialog", this.e);
    paramBundle.putInt("render_type", this.f);
    if (this.g != null) {
      paramBundle.putParcelableArrayList("manual_awesome_types", this.g);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.phone.ManualAwesomeActivity
 * JD-Core Version:    0.7.0.1
 */