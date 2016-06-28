package com.google.android.apps.photos.phone;

import aaw;
import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.view.MenuItem;
import anw;
import anx;
import anz;
import asl;
import aso;
import asr;
import atx;
import bhp;
import bk;
import bp;
import bu;
import bv;
import bw;
import bz;
import cey;
import cfp;
import cij;
import cl;
import cpb;
import dpq;
import efj;
import giu;
import giv;
import gpl;
import gpm;
import gpq;
import gpr;
import gxv;
import gya;
import idy;
import ikt;
import ilf;
import java.util.ArrayList;
import java.util.List;
import lzw;
import mbb;
import mbp;
import tp;

@TargetApi(18)
public class GetContentActivity
  extends mbp
  implements giv, gpq, gxv
{
  private final ikt d;
  private final bhp e;
  private gpl f;
  
  public GetContentActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new atx(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    ikt localikt = new ikt(this, this.n).a(this.m);
    localikt.d = "active-photos-account";
    localikt.g.add(this);
    this.d = ((ikt)localikt);
    this.e = new bhp(this, aaw.dM);
  }
  
  private static int a(String paramString)
  {
    int j;
    if (paramString == null) {
      j = 0;
    }
    do
    {
      return j;
      String[] arrayOfString = paramString.split(",");
      int i = -1 + arrayOfString.length;
      j = 0;
      if (i >= 0)
      {
        String str = arrayOfString[i].trim();
        if (str.startsWith("image/")) {
          j |= 0x1;
        }
        for (;;)
        {
          i--;
          break;
          if (str.startsWith("video/")) {
            j |= 0x2;
          }
        }
      }
    } while (((j & 0x1) == 0) || ((j & 0x2) == 0));
    return 0;
  }
  
  private final boolean g()
  {
    Intent localIntent = getIntent();
    boolean bool1 = false;
    if (localIntent != null)
    {
      boolean bool2 = localIntent.getBooleanExtra("is_for_movie_maker_launch", false);
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private final int h()
  {
    int i = 1;
    Intent localIntent = getIntent();
    if (localIntent == null) {
      return 0;
    }
    String str1 = localIntent.getAction();
    String str2 = localIntent.getType();
    Uri localUri = localIntent.getData();
    if ("android.intent.action.PICK".equalsIgnoreCase(str1)) {
      if ((str2 != null) && (str2.startsWith("vnd.android.cursor.dir/"))) {
        if (!str2.endsWith("/image")) {}
      }
    }
    for (;;)
    {
      return i;
      if (str2.endsWith("/video"))
      {
        i = 2;
        continue;
        if (localUri != null)
        {
          if ((localUri.equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) || (localUri.equals(MediaStore.Images.Media.INTERNAL_CONTENT_URI)) || (localUri.toString().endsWith("/image"))) {
            continue;
          }
          if ((localUri.equals(MediaStore.Video.Media.EXTERNAL_CONTENT_URI)) || (localUri.equals(MediaStore.Video.Media.INTERNAL_CONTENT_URI)) || (localUri.toString().endsWith("/video"))) {
            i = 2;
          }
        }
        else
        {
          i = 0x0 | a(str2);
          continue;
          if ("android.intent.action.SEND".equalsIgnoreCase(str1))
          {
            i = 0x0 | a(str2);
            continue;
          }
          if ("android.intent.action.SEND_MULTIPLE".equalsIgnoreCase(str1))
          {
            i = 0x0 | a(str2);
            continue;
          }
          if (str2 != null)
          {
            i = 0x0 | a(str2);
            continue;
          }
        }
      }
      i = 0;
    }
  }
  
  private final String i()
  {
    Intent localIntent = getIntent();
    String str2;
    String str1;
    if (localIntent != null)
    {
      str2 = localIntent.getAction();
      str1 = localIntent.getType();
    }
    for (;;)
    {
      String str3;
      if (("android.intent.action.PICK".equalsIgnoreCase(str2)) || ("android.intent.action.SEND".equalsIgnoreCase(str2)) || ("android.intent.action.SEND_MULTIPLE".equalsIgnoreCase(str2)) || ("android.intent.action.SEND_MULTIPLE".equalsIgnoreCase(str2))) {
        str3 = str2;
      }
      do
      {
        return str3;
        str3 = null;
      } while (str1 == null);
      return "android.intent.action.GET_CONTENT";
      str1 = null;
      str2 = null;
    }
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
    this.f = ((gpm)localgpm);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    localmbb.a(gpl.class, this.f);
    localmbb.a(cij.class, new cij(this, this.n, new cpb()));
    localmbb.a(asl.class, new asl(this, this.n));
    localmbb.a(asr.class, new aso(this, this.n));
    if (!g()) {
      this.m.a(anw.class, new anx(this, this.n, i(), h()));
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    paramtp.b(true);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    bhp localbhp;
    Bundle localBundle1;
    Intent localIntent;
    String str1;
    boolean bool1;
    boolean bool2;
    label69:
    int i;
    boolean bool3;
    boolean bool4;
    String str2;
    boolean bool11;
    boolean bool6;
    int j;
    if (paramBoolean)
    {
      localbhp = this.e;
      localBundle1 = new Bundle();
      localIntent = getIntent();
      str1 = i();
      if (this.d.e()) {
        break label488;
      }
      bool1 = true;
      if ((getIntent() == null) || (!"android.intent.action.SEND_MULTIPLE".equals(getIntent().getAction()))) {
        break label494;
      }
      bool2 = true;
      i = h();
      bool3 = g();
      if (localIntent == null) {
        break label759;
      }
      bool4 = bool1 | localIntent.getBooleanExtra("android.intent.extra.LOCAL_ONLY", false);
      boolean bool10 = localIntent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false);
      str2 = localIntent.getAction();
      bool11 = localIntent.getBooleanExtra("exclude_tab_auto_awesome", false);
      int i1 = localIntent.getIntExtra("filter", i);
      bool6 = bool10;
      j = i1;
    }
    for (boolean bool7 = bool11;; bool7 = false)
    {
      anz localanz = (anz)mbb.a(this, anz.class);
      label212:
      boolean bool9;
      label231:
      Object localObject1;
      label298:
      boolean bool8;
      label362:
      int n;
      Object localObject2;
      Bundle localBundle2;
      if ((j & 0x2) != 0)
      {
        localanz.b = "PhotoSearch";
        localanz.c = 7;
        cey localcey = new cey();
        if (!bool4)
        {
          localBundle1.putString("query", "#videos");
          localBundle1.putBoolean("hide_search_view", true);
          if ((j & 0x4) != 0) {
            break label512;
          }
          bool9 = true;
          localBundle1.putBoolean("search_local_videos", bool9);
          localObject1 = localcey;
          int m = j | 0x10;
          if (this.d.e())
          {
            ikt localikt = this.d;
            efj.k();
            localBundle1.putInt("account_id", localikt.e);
          }
          if (!bool6) {
            break label688;
          }
          localBundle1.putInt("photo_picker_mode", 2);
          localBundle1.putBoolean("external", true);
          localBundle1.putBoolean("is_for_get_content", true);
          localBundle1.putBoolean("is_for_movie_maker_launch", bool3);
          localBundle1.putBoolean("finish_on_back", true);
          localBundle1.putInt("filter", m);
          localBundle1.putString("get_content_action", str2);
          if (bool3) {
            break label700;
          }
          bool8 = true;
          localBundle1.putBoolean("disable_up_button", bool8);
          ((bk)localObject1).f(localBundle1);
          n = localbhp.b;
          localObject2 = localbhp.a.getIntent().getExtras();
          localBundle2 = ((bk)localObject1).m;
          if (localBundle2 != null) {
            break label706;
          }
          if (localObject2 == null) {
            localObject2 = new Bundle();
          }
        }
      }
      for (;;)
      {
        ((bk)localObject1).f((Bundle)localObject2);
        bz localbz = localbhp.a.b.a.d;
        cl localcl = localbz.a();
        localcl.b(n, (bk)localObject1, "default");
        localcl.a(0);
        localcl.c();
        localbz.b();
        return;
        label488:
        bool1 = false;
        break;
        label494:
        bool2 = false;
        break label69;
        localBundle1.putBoolean("local_folders_only", true);
        break label212;
        label512:
        bool9 = false;
        break label231;
        localanz.b = "Photos";
        localanz.c = 1;
        cfp localcfp = new cfp();
        int k = 2;
        if ((!bool7) && (this.d.e())) {
          k = 18;
        }
        if ((this.d.e()) && (!bool4))
        {
          k |= 0x4;
          if ((j & 0x1) == 0) {
            k |= 0x8;
          }
        }
        localBundle1.putInt("tabs", k);
        Integer localInteger;
        switch (localIntent.getIntExtra("source_id", -1))
        {
        default: 
          localInteger = null;
        }
        for (;;)
        {
          if (localInteger != null) {
            localBundle1.putInt("starting_tab_index", localInteger.intValue());
          }
          localObject1 = localcfp;
          break;
          localInteger = Integer.valueOf(16);
          continue;
          localInteger = Integer.valueOf(8);
        }
        label688:
        localBundle1.putInt("photo_picker_mode", 1);
        break label298;
        label700:
        bool8 = false;
        break label362;
        label706:
        if (localObject2 == null)
        {
          localObject2 = localBundle2;
        }
        else
        {
          Bundle localBundle3 = new Bundle(((Bundle)localObject2).size() + localBundle2.size());
          localBundle3.putAll((Bundle)localObject2);
          localBundle3.putAll(localBundle2);
          localObject2 = localBundle3;
        }
      }
      label759:
      str2 = str1;
      bool4 = bool1;
      boolean bool5 = bool2;
      j = i;
      bool6 = bool5;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.tT);
    if (paramBundle == null)
    {
      ikt localikt = this.d;
      ilf localilf = new ilf();
      localilf.f = true;
      localilf.g = true;
      localilf.h = true;
      localikt.a(localilf);
    }
  }
  
  public final gya r_()
  {
    return gya.g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.phone.GetContentActivity
 * JD-Core Version:    0.7.0.1
 */