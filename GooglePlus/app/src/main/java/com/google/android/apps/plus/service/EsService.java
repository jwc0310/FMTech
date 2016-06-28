package com.google.android.apps.plus.service;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import bgp;
import bhr;
import bhu;
import bhv;
import bhx;
import bhy;
import bhz;
import bid;
import bie;
import bif;
import big;
import bih;
import bii;
import bij;
import bik;
import bil;
import bin;
import bio;
import biw;
import bix;
import bjb;
import bjh;
import bjq;
import bju;
import bjx;
import bka;
import bkg;
import bkh;
import bki;
import bkj;
import bkk;
import bkq;
import bkr;
import bks;
import bkt;
import bku;
import bkv;
import bkw;
import bky;
import bkz;
import bla;
import blf;
import bli;
import blj;
import blk;
import blp;
import blq;
import bls;
import blt;
import blv;
import blx;
import blz;
import bmh;
import bmo;
import bmp;
import bmr;
import bms;
import bmt;
import bmv;
import brd;
import brg;
import bul;
import bum;
import com.google.android.apps.plus.content.EsProvider;
import dhd;
import djy;
import dkm;
import dld;
import dle;
import dlf;
import dlg;
import dlh;
import dli;
import dlj;
import dlk;
import dll;
import dlm;
import dln;
import dlo;
import dlp;
import dlq;
import dlr;
import dls;
import dlt;
import dlu;
import dlv;
import dlw;
import dlx;
import dly;
import dlz;
import dma;
import dmc;
import dme;
import dmm;
import dmp;
import dmr;
import dmx;
import dmy;
import dnb;
import duk;
import dun;
import efj;
import giz;
import gjb;
import gnb;
import gxw;
import gxx;
import gxz;
import gya;
import hxj;
import iis;
import ipf;
import ivn;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import jrf;
import kbu;
import kbw;
import kcg;
import kch;
import kcp;
import kde;
import kpu;
import llu;
import lnj;
import lnk;
import mbb;
import nvn;
import nxg;
import nxh;
import nxi;
import nxj;
import nxl;
import nxx;
import oih;
import ojj;
import qas;
import qat;
import qdj;
import qdt;

@Deprecated
public class EsService
  extends Service
  implements dnb
{
  public static String a;
  @SuppressLint({"UseSparseArrays"})
  public static final Map<Integer, Intent> b = new HashMap();
  public static final Map<Integer, dmx> c = Collections.synchronizedMap(new dly());
  public static final HashSet<dme> d = new HashSet();
  public static final dmm e = new dmm(8);
  public static Handler f;
  private static File g;
  private static Integer h = Integer.valueOf(0);
  private static dlz i;
  private static bum j;
  private static bkk k;
  private static bhv l;
  private static final dlx m = new dlx();
  private dmy n;
  private int o;
  private final dmc p = new dmc(this);
  private final Runnable q = new dld(this);
  
  public static int a(Context paramContext, int paramInt, long paramLong, Long paramLong1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, RectF paramRectF)
  {
    if ((paramLong1 == null) && (paramRectF == null)) {
      throw new IllegalArgumentException("Must have shapeId or relativeBounds");
    }
    Intent localIntent = a(paramContext, paramInt, paramString1, paramLong, paramLong1, paramString5, paramString6);
    localIntent.putExtra("op", 83);
    localIntent.putExtra("taggee_name", paramString2);
    localIntent.putExtra("taggee_id", paramString4);
    localIntent.putExtra("taggee_email", paramString3);
    localIntent.putExtra("collection_id", paramString7);
    if (paramRectF != null) {
      localIntent.putExtra("bounds", paramRectF);
    }
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, long paramLong1, String paramString1, long paramLong2, String paramString2, String paramString3, boolean paramBoolean)
  {
    Intent localIntent = a(paramContext, paramInt, paramString1, paramLong1, Long.valueOf(paramLong2), paramString3, paramString2);
    localIntent.putExtra("op", 82);
    localIntent.putExtra("retain_shape", paramBoolean);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 84);
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("search_query", paramString1);
    localIntent.putExtra("search_mode", paramInt2);
    localIntent.putExtra("resumetoken", null);
    localIntent.putExtra("view_id", paramString3);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString, long paramLong)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 76);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("gaia_id", paramString);
    localIntent.putExtra("photo_id", paramLong);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5)
  {
    Intent localIntent = a(paramContext, paramInt, paramString1, paramLong1, Long.valueOf(paramLong2), paramString2, paramString3);
    localIntent.putExtra("op", 81);
    localIntent.putExtra("suggested_gaia_id", paramString4);
    localIntent.putExtra("approved", paramBoolean1);
    localIntent.putExtra("is_suggested", paramBoolean2);
    localIntent.putExtra("collection_id", paramString5);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 19);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("aid", paramString1);
    localIntent.putExtra("source_stream_id", paramString2);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    if (jrf.n(paramString2))
    {
      String str = jrf.d(paramString2);
      Intent localIntent2 = e.a(paramContext, EsService.class);
      localIntent2.putExtra("op", 72);
      localIntent2.putExtra("account_id", paramInt);
      localIntent2.putExtra("gaia_id", paramString1);
      localIntent2.putExtra("album_id", str);
      return a(paramContext, localIntent2);
    }
    if ((TextUtils.isEmpty(paramString2)) && (dun.b())) {
      throw new IllegalArgumentException("getCollectionTiles: collectionId is null");
    }
    Intent localIntent1 = e.a(paramContext, EsService.class);
    localIntent1.putExtra("op", 73);
    localIntent1.putExtra("account_id", paramInt);
    localIntent1.putExtra("collection_id", paramString2);
    localIntent1.putExtra("auth_key", paramString3);
    return a(paramContext, localIntent1);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, gnb paramgnb)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 907);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("event_id", paramString1);
    localIntent.putExtra("auth_key", paramString2);
    localIntent.putExtra("gaia_id", paramString3);
    localIntent.putExtra("audience", paramgnb);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 909);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("event_id", paramString1);
    localIntent.putExtra("pollingtoken", paramString2);
    localIntent.putExtra("resumetoken", paramString3);
    localIntent.putExtra("invitationtoken", paramString4);
    localIntent.putExtra("event_auth_key", paramString5);
    localIntent.putExtra("fetchnewer", paramBoolean);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 35);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("aid", paramString1);
    localIntent.putExtra("comment_id", paramString2);
    localIntent.putExtra("plusone_id", paramString3);
    localIntent.putExtra("plus_oned", paramBoolean);
    localIntent.putExtra("tile_id", paramString4);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 91);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("photo_id", paramString1);
    localIntent.putExtra("gaia_id", paramString2);
    localIntent.putExtra("tile_id", paramString3);
    localIntent.putExtra("edit_info", paramArrayOfByte);
    localIntent.putExtra("set_edit_list_data", paramBoolean);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 68);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("gaia_id", paramString1);
    localIntent.putExtra("resumetoken", null);
    localIntent.putExtra("highlights_force_refresh", paramBoolean);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 1009);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("event_id", paramString1);
    localIntent.putExtra("auth_key", paramString2);
    localIntent.putExtra("blacklist", paramBoolean);
    localIntent.putExtra("gaia_id", paramString3);
    localIntent.putExtra("email", paramString4);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 30);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("aid", paramString1);
    localIntent.putExtra("content", paramString2);
    localIntent.putExtra("promoted_post_data", paramArrayOfByte);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 29);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("gaia_id", paramString);
    localIntent.putExtra("is_stranger_post", paramBoolean);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, String paramString, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    return a(paramContext, b(paramContext, paramInt, paramString, paramBoolean, paramArrayOfByte));
  }
  
  public static int a(Context paramContext, int paramInt, ojj paramojj)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 88);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("photos_settings", qat.a(paramojj));
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 105);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("all_photos_force_refresh", paramBoolean);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, int paramInt, byte[] paramArrayOfByte)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 713);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("data", paramArrayOfByte);
    return a(paramContext, localIntent);
  }
  
  public static int a(Context paramContext, Intent paramIntent)
  {
    efj.k();
    a(paramContext);
    int i1 = b();
    paramIntent.putExtra("rid", i1);
    Bundle localBundle1 = paramIntent.getExtras();
    Iterator localIterator1 = b.values().iterator();
    label141:
    label321:
    label347:
    for (;;)
    {
      Intent localIntent;
      Bundle localBundle2;
      String str;
      int i2;
      if (localIterator1.hasNext())
      {
        localIntent = (Intent)localIterator1.next();
        localBundle2 = localIntent.getExtras();
        if (localBundle1.size() == localBundle2.size())
        {
          Iterator localIterator2 = localBundle2.keySet().iterator();
          for (;;)
          {
            if (localIterator2.hasNext())
            {
              str = (String)localIterator2.next();
              if (!"rid".equals(str)) {
                if (!localBundle1.containsKey(str)) {
                  i2 = 0;
                }
              }
            }
          }
        }
      }
      else
      {
        for (;;)
        {
          if (i2 == 0) {
            break label347;
          }
          if (Log.isLoggable("EsService", 2))
          {
            int i3 = localIntent.getIntExtra("op", -1);
            new StringBuilder(27).append("Op was pending: ").append(i3);
          }
          for (Integer localInteger = Integer.valueOf(localIntent.getIntExtra("rid", -1));; localInteger = null)
          {
            if (localInteger == null) {
              break label321;
            }
            e.a(paramIntent);
            return localInteger.intValue();
            Object localObject1 = localBundle2.get(str);
            Object localObject2 = localBundle1.get(str);
            if (localObject1 == null)
            {
              if (Log.isLoggable("EsService", 3)) {
                new StringBuilder(41 + String.valueOf(str).length()).append("pending request id key [").append(str).append("] has value null!");
              }
              if (localObject2 == null) {
                break;
              }
              i2 = 0;
              break label141;
            }
            if (localObject1.equals(localObject2)) {
              break;
            }
            i2 = 0;
            break label141;
          }
          b.put(Integer.valueOf(i1), paramIntent);
          paramContext.startService(paramIntent);
          return i1;
          i2 = 1;
        }
      }
    }
  }
  
  public static PendingIntent a(Context paramContext, int paramInt, String paramString1, String paramString2, long paramLong)
  {
    Intent localIntent = b(paramContext, paramInt, paramString1, false, null);
    String str1 = String.valueOf(paramString1);
    if (str1.length() != 0) {}
    for (String str2 = "plusone:".concat(str1);; str2 = new String("plusone:"))
    {
      localIntent.setData(Uri.parse(str2));
      localIntent.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", true);
      localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramString2);
      localIntent.putExtra("com.google.android.libraries.social.notifications.updated_version", paramLong);
      return PendingIntent.getService(paramContext, 0, localIntent, 134217728);
    }
  }
  
  public static PendingIntent a(Context paramContext, int paramInt1, String paramString1, llu paramllu, int paramInt2, long paramLong, String paramString2, ArrayList<String> paramArrayList)
  {
    Object localObject = e.a(paramContext, EsService.class);
    ArrayList localArrayList2;
    boolean bool;
    Intent localIntent;
    label91:
    label95:
    String str1;
    if ((paramllu.a != null) && (!paramllu.a.isEmpty()) && (!TextUtils.isEmpty(paramllu.b)))
    {
      localArrayList2 = paramllu.a;
      String str3 = paramllu.b;
      if (!TextUtils.isEmpty(paramllu.d))
      {
        bool = true;
        String str4 = efj.c(paramContext, localArrayList2);
        if (TextUtils.isEmpty(str4)) {
          break label193;
        }
        localIntent = efj.a(paramContext, str4, str3, bool);
        localObject = localIntent;
        ArrayList localArrayList1 = new ArrayList();
        localArrayList1.add(paramString2);
        dmr.a(paramContext, paramInt1, (Intent)localObject, null, paramInt2, paramLong, false, false, false, true, localArrayList1, paramArrayList);
        str1 = String.valueOf(paramString1);
        if (str1.length() == 0) {
          break label227;
        }
      }
    }
    label193:
    label227:
    for (String str2 = "interactive:".concat(str1);; str2 = new String("interactive:"))
    {
      ((Intent)localObject).setData(Uri.parse(str2));
      ((Intent)localObject).putExtra("aid", paramString1);
      return PendingIntent.getActivity(paramContext, 0, (Intent)localObject, 134217728);
      bool = false;
      break;
      localIntent = efj.d(localArrayList2);
      break label91;
      if (TextUtils.isEmpty(paramllu.c)) {
        break label95;
      }
      localObject = iis.b(paramContext, paramInt1, paramllu.c);
      break label95;
    }
  }
  
  public static PendingIntent a(Context paramContext, int paramInt, ArrayList<String> paramArrayList, long[] paramArrayOfLong, String paramString)
  {
    Intent localIntent = new Intent(paramContext, EsService.class);
    localIntent.putExtra("op", 216);
    localIntent.putExtra("notif_version", paramArrayOfLong);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("view_id", paramString);
    if (!paramArrayList.isEmpty()) {
      localIntent.putStringArrayListExtra("notif_key", paramArrayList);
    }
    return PendingIntent.getService(paramContext, 1, localIntent, 268435456);
  }
  
  private static Intent a(Context paramContext, int paramInt, String paramString1, long paramLong, Long paramLong1, String paramString2, String paramString3)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("gaia_id", paramString1);
    localIntent.putExtra("photo_id", paramLong);
    localIntent.putExtra("tile_id", paramString2);
    localIntent.putExtra("view_id", paramString3);
    if (paramLong1 != null) {
      localIntent.putExtra("shape_id", paramLong1);
    }
    return localIntent;
  }
  
  public static dmx a(int paramInt)
  {
    if (c.isEmpty()) {
      c();
    }
    return (dmx)c.remove(Integer.valueOf(paramInt));
  }
  
  public static Integer a(Context paramContext, int paramInt)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 214);
    localIntent.putExtra("account_id", paramInt);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  public static Integer a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 202);
    localIntent.putExtra("account_id", paramInt1);
    localIntent.putExtra("read_state", paramInt2);
    localIntent.putExtra("high_priority", paramInt3);
    localIntent.putExtra("init_fetch_param", paramArrayOfByte);
    localIntent.putExtra("manually_initiated", paramBoolean);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  public static Integer a(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 1120);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("filename", paramString);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  public static Integer a(Context paramContext, int paramInt, Collection<djy> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      djy localdjy = (djy)localIterator.next();
      if (!localdjy.e)
      {
        localArrayList1.add(localdjy.a);
        localArrayList2.add(localdjy.b);
        Bundle localBundle = new Bundle();
        localBundle.putString("extra_activity_id", localdjy.a);
        localBundle.putString("extra_creation_source_id", localdjy.b);
        localBundle.putInt("extra_stream_explanation", localdjy.c);
        localBundle.putLong("extra_analytics_timestamp", localdjy.d);
        gxx localgxx = (gxx)mbb.a(paramContext, gxx.class);
        gxw localgxw = new gxw(paramContext, paramInt);
        localgxw.c = gxz.ab;
        localgxw.f = Long.valueOf(localdjy.d);
        localgxw.g = Long.valueOf(localdjy.d);
        if (localBundle != null) {
          localgxw.h.putAll(localBundle);
        }
        localgxx.a(localgxw);
        localdjy.e = true;
      }
    }
    if (localArrayList1.isEmpty()) {
      return null;
    }
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 25);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("activity_id_list", (String[])localArrayList1.toArray(new String[localArrayList1.size()]));
    localIntent.putExtra("creation_source_list", localArrayList2);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  private static void a(Context paramContext)
  {
    if (g == null) {
      g = new File(String.valueOf(paramContext.getApplicationContext().getDir(null, 0).getAbsolutePath()).concat("/serviceresults.bin"));
    }
  }
  
  public static void a(Context paramContext, int paramInt, Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("gaia_id");
    int i1 = paramIntent.getIntExtra("abuse_type", -1);
    kcg localkcg = new kch().a(paramContext, paramInt).a();
    kde localkde = ((dhd)mbb.a(paramContext, dhd.class)).a(paramContext, localkcg, str, i1);
    localkde.i();
    localkde.d("EsService");
  }
  
  public static void a(Context paramContext, dme paramdme)
  {
    a(paramContext);
    d.add(paramdme);
  }
  
  private final void a(kbw paramkbw, Intent paramIntent)
  {
    dlz localdlz = i;
    dmc localdmc = this.p;
    localdlz.b.execute(new dma(localdlz, paramkbw, localdmc, paramIntent));
  }
  
  private final boolean a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2)
  {
    mbb.a(paramContext, giz.class);
    int i1;
    switch (paramInt2)
    {
    default: 
      return false;
    case 901: 
      new Thread(new dli(this, paramContext, paramInt1, paramIntent.getStringExtra("event_id"), paramIntent.getStringExtra("auth_key"), paramIntent)).start();
    case 909: 
    case 910: 
    case 911: 
    case 500: 
    case 503: 
    case 5: 
    case 1120: 
    case 2001: 
    case 902: 
    case 903: 
      for (;;)
      {
        return true;
        String str4 = paramIntent.getStringExtra("event_id");
        String str5 = paramIntent.getStringExtra("pollingtoken");
        String str6 = paramIntent.getStringExtra("resumetoken");
        String str7 = paramIntent.getStringExtra("event_auth_key");
        String str8 = paramIntent.getStringExtra("invitationtoken");
        boolean bool3 = paramIntent.getBooleanExtra("fetchnewer", false);
        boolean bool4 = paramIntent.getBooleanExtra("resolvetokens", false);
        Thread localThread = new Thread(new dlj(this, paramContext, paramInt1, str4, str5, str6, str7, str8, bool3, bool4, paramIntent));
        localThread.start();
        continue;
        boolean bool2 = paramIntent.getBooleanExtra("include_blacklist", false);
        a(new bjb(paramContext, paramInt1, paramIntent.getStringExtra("event_id"), paramIntent.getStringExtra("auth_key"), bool2), paramIntent);
        continue;
        String str3 = paramIntent.getStringExtra("event_id");
        long[] arrayOfLong = paramIntent.getLongArrayExtra("photo_ids");
        Long[] arrayOfLong1 = new Long[arrayOfLong.length];
        for (int i2 = 0; i2 < arrayOfLong.length; i2++) {
          arrayOfLong1[i2] = Long.valueOf(arrayOfLong[i2]);
        }
        a(new blz(paramContext, paramInt1, arrayOfLong1, str3), paramIntent);
        continue;
        new Thread(new dlk(this, paramContext, paramInt1, paramIntent.getBooleanExtra("refresh", false), paramIntent)).start();
        continue;
        a(new bix(paramContext, paramInt1), paramIntent);
        continue;
        EsProvider.j(paramContext);
        b(paramIntent, new dmx(), null);
        continue;
        String str2 = paramIntent.getStringExtra("filename");
        try
        {
          a = efj.b(paramContext, str2);
          dmp localdmp = new dmp();
          localdmp.a = a;
          b(paramIntent, localdmp, null);
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          for (;;)
          {
            a = null;
          }
        }
        brd.a(paramContext, paramInt1);
        b(paramIntent, new dmx(), null);
        continue;
        new Thread(new dll(this, paramContext, paramInt1, paramIntent.getStringExtra("event_id"), paramIntent.getIntExtra("rsvp_type", -2147483648), paramIntent.getStringExtra("event_auth_key"), paramIntent.getByteArrayExtra("promoted_post_data"), paramIntent)).start();
        continue;
        try
        {
          qdt localqdt2 = new qdt();
          byte[] arrayOfByte3 = paramIntent.getByteArrayExtra("event");
          qdt localqdt4 = (qdt)qat.b(localqdt2, arrayOfByte3, 0, arrayOfByte3.length);
          localqdt3 = localqdt4;
        }
        catch (qas localqas2)
        {
          for (;;)
          {
            Log.e("EsService", "Could not deserialize PlusEvent from extras.", localqas2);
            qdt localqdt3 = null;
          }
        }
        a(new bhz(paramContext, paramInt1, localqdt3, (gnb)paramIntent.getParcelableExtra("audience"), paramIntent.getStringExtra("external_id")), paramIntent);
      }
    case 904: 
      i1 = paramIntent.getIntExtra("event_type", -1);
      if (i1 != 0) {
        break;
      }
    }
    for (;;)
    {
      try
      {
        qdt localqdt1 = new qdt();
        byte[] arrayOfByte2 = paramIntent.getByteArrayExtra("event");
        hxj localhxj2 = new hxj((qdt)qat.b(localqdt1, arrayOfByte2, 0, arrayOfByte2.length));
        localObject = localhxj2;
      }
      catch (qas localqas1)
      {
        qdj localqdj;
        byte[] arrayOfByte1;
        hxj localhxj1;
        Log.e("EsService", "Could not deserialize PlusEvent from extras.", localqas1);
        localObject = null;
        continue;
      }
      a(new bmo(paramContext, paramInt1, (hxj)localObject), paramIntent);
      break;
      if (i1 == 1)
      {
        localqdj = new qdj();
        arrayOfByte1 = paramIntent.getByteArrayExtra("event");
        localhxj1 = new hxj((qdj)qat.b(localqdj, arrayOfByte1, 0, arrayOfByte1.length));
        localObject = localhxj1;
        continue;
        a(new big(paramContext, paramInt1, paramIntent.getStringExtra("event_id"), paramIntent.getStringExtra("auth_key")), paramIntent);
        break;
        a(new bin(paramContext, paramInt1, paramIntent.getStringExtra("event_id"), paramIntent.getStringExtra("auth_key"), paramIntent.getStringExtra("gaia_id"), (gnb)paramIntent.getParcelableExtra("audience")), paramIntent);
        break;
        a(new bio(paramContext, paramInt1, paramIntent.getStringExtra("event_id"), paramIntent.getStringExtra("auth_key"), paramIntent.getBooleanExtra("blacklist", false), paramIntent.getStringExtra("gaia_id"), paramIntent.getStringExtra("email")), paramIntent);
        break;
        new Thread(new dlm(this, paramIntent, paramContext, paramInt1)).start();
        break;
        bgp.b(this, paramIntent.getIntExtra("account_id", -1), false);
        b(paramIntent, new dmx(), null);
        break;
        bgp.a(this, paramIntent.getIntExtra("account_id", -1), paramIntent.getLongExtra("timestamp", -1L));
        b(paramIntent, new dmx(), null);
        break;
        String str1 = paramIntent.getStringExtra("package_name");
        lnk locallnk = lnj.a(paramContext, paramInt1, str1);
        gxx localgxx;
        gxw localgxw;
        if (locallnk != null)
        {
          duk.a(paramContext, locallnk.b, locallnk.a, str1, locallnk.d, locallnk.c);
          lnj.b(paramContext, paramInt1, str1);
          boolean bool1 = "stream_install_interactive_post".equals(locallnk.c);
          localgxx = (gxx)mbb.a(this, gxx.class);
          localgxw = new gxw(paramContext, paramInt1);
          if (!bool1) {
            break label1247;
          }
        }
        label1247:
        for (gxz localgxz = gxz.bk;; localgxz = gxz.bd)
        {
          localgxw.c = localgxz;
          localgxw.d = gya.w;
          localgxx.a(localgxw);
          b(paramIntent, new dmx(), null);
          break;
        }
        a(new bks(paramContext, paramInt1, paramIntent.getStringExtra("owner_id"), paramIntent.getStringExtra("photo_id")), paramIntent);
        break;
        a(new blf(paramContext, paramInt1, paramIntent.getStringExtra("aid")), paramIntent);
        break;
        new Thread(new dln(this, paramContext, paramInt1, paramIntent.getStringExtra("gaia_id"), paramIntent.getBooleanExtra("is_stranger_post", false), paramIntent)).start();
        break;
      }
      Object localObject = null;
    }
  }
  
  public static boolean a(String paramString)
  {
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      Bundle localBundle = ((Intent)localIterator.next()).getExtras();
      int i1 = localBundle.getInt("op");
      if (((i1 == 16) || (i1 == 17)) && (localBundle.getString("aid").equals(paramString))) {
        return true;
      }
    }
    return false;
  }
  
  private static int b()
  {
    if (h.intValue() == 0) {}
    synchronized (g)
    {
      c();
      Integer localInteger = Integer.valueOf(1 + h.intValue());
      h = localInteger;
      return localInteger.intValue();
    }
  }
  
  public static int b(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 901);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("event_id", paramString);
    return a(paramContext, localIntent);
  }
  
  public static int b(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 70);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("gaia_id", paramString1);
    localIntent.putExtra("resumetoken", null);
    return a(paramContext, localIntent);
  }
  
  public static int b(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 18);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("aid", paramString);
    localIntent.putExtra("mute_state", paramBoolean);
    return a(paramContext, localIntent);
  }
  
  private static Intent b(Context paramContext, int paramInt, String paramString, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 16);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("aid", paramString);
    localIntent.putExtra("shown_plus_one_promo", paramBoolean);
    localIntent.putExtra("promoted_post_data", paramArrayOfByte);
    return localIntent;
  }
  
  public static Integer b(Context paramContext, int paramInt)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 212);
    localIntent.putExtra("account_id", paramInt);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  public static Integer b(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 706);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("person_id", paramString1);
    localIntent.putExtra("person_name", paramString2);
    localIntent.putExtra("blocked", paramBoolean);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  public static int c(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 2600);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("package_name", paramString);
    return a(paramContext, localIntent);
  }
  
  public static Integer c(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 703);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("person_id", paramString);
    localIntent.putExtra("refresh", true);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  /* Error */
  private static void c()
  {
    // Byte code:
    //   0: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   3: ifnull +12 -> 15
    //   6: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   9: invokevirtual 914	java/io/File:exists	()Z
    //   12: ifne +4 -> 16
    //   15: return
    //   16: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   19: astore_0
    //   20: aload_0
    //   21: monitorenter
    //   22: new 916	java/io/BufferedInputStream
    //   25: dup
    //   26: new 918	java/io/FileInputStream
    //   29: dup
    //   30: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   33: invokespecial 921	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   36: invokespecial 924	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_1
    //   40: new 926	java/io/ObjectInputStream
    //   43: dup
    //   44: aload_1
    //   45: invokespecial 927	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: astore_2
    //   49: aload_2
    //   50: invokevirtual 930	java/io/ObjectInputStream:readInt	()I
    //   53: invokestatic 84	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   56: putstatic 86	com/google/android/apps/plus/service/EsService:h	Ljava/lang/Integer;
    //   59: aload_2
    //   60: invokevirtual 930	java/io/ObjectInputStream:readInt	()I
    //   63: istore 21
    //   65: aload_2
    //   66: invokevirtual 933	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   69: checkcast 498	dmx
    //   72: astore 22
    //   74: getstatic 66	com/google/android/apps/plus/service/EsService:c	Ljava/util/Map;
    //   77: iload 21
    //   79: invokestatic 84	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: aload 22
    //   84: invokeinterface 387 3 0
    //   89: pop
    //   90: goto -31 -> 59
    //   93: astore 12
    //   95: aload_2
    //   96: astore 13
    //   98: aload_1
    //   99: astore 14
    //   101: getstatic 66	com/google/android/apps/plus/service/EsService:c	Ljava/util/Map;
    //   104: invokeinterface 934 1 0
    //   109: istore 16
    //   111: getstatic 86	com/google/android/apps/plus/service/EsService:h	Ljava/lang/Integer;
    //   114: invokestatic 373	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   117: astore 17
    //   119: new 350	java/lang/StringBuilder
    //   122: dup
    //   123: bipush 55
    //   125: aload 17
    //   127: invokestatic 373	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   130: invokevirtual 376	java/lang/String:length	()I
    //   133: iadd
    //   134: invokespecial 351	java/lang/StringBuilder:<init>	(I)V
    //   137: ldc_w 936
    //   140: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: iload 16
    //   145: invokevirtual 360	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   148: ldc_w 938
    //   151: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload 17
    //   156: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload 13
    //   162: ifnull +8 -> 170
    //   165: aload 13
    //   167: invokevirtual 941	java/io/ObjectInputStream:close	()V
    //   170: aload 14
    //   172: ifnull +8 -> 180
    //   175: aload 14
    //   177: invokevirtual 942	java/io/BufferedInputStream:close	()V
    //   180: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   183: invokevirtual 945	java/io/File:delete	()Z
    //   186: pop
    //   187: aload_0
    //   188: monitorexit
    //   189: return
    //   190: astore 5
    //   192: aload_0
    //   193: monitorexit
    //   194: aload 5
    //   196: athrow
    //   197: astore 29
    //   199: aconst_null
    //   200: astore_1
    //   201: aload 29
    //   203: astore_3
    //   204: aconst_null
    //   205: astore_2
    //   206: ldc_w 338
    //   209: ldc_w 947
    //   212: aload_3
    //   213: invokestatic 780	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   216: pop
    //   217: aload_2
    //   218: ifnull +7 -> 225
    //   221: aload_2
    //   222: invokevirtual 941	java/io/ObjectInputStream:close	()V
    //   225: aload_1
    //   226: ifnull -46 -> 180
    //   229: aload_1
    //   230: invokevirtual 942	java/io/BufferedInputStream:close	()V
    //   233: goto -53 -> 180
    //   236: astore 9
    //   238: goto -58 -> 180
    //   241: astore 28
    //   243: aconst_null
    //   244: astore_1
    //   245: aload 28
    //   247: astore 4
    //   249: aconst_null
    //   250: astore_2
    //   251: aload_2
    //   252: ifnull +7 -> 259
    //   255: aload_2
    //   256: invokevirtual 941	java/io/ObjectInputStream:close	()V
    //   259: aload_1
    //   260: ifnull +7 -> 267
    //   263: aload_1
    //   264: invokevirtual 942	java/io/BufferedInputStream:close	()V
    //   267: aload 4
    //   269: athrow
    //   270: astore 20
    //   272: goto -102 -> 170
    //   275: astore 19
    //   277: goto -97 -> 180
    //   280: astore 11
    //   282: goto -57 -> 225
    //   285: astore 7
    //   287: goto -28 -> 259
    //   290: astore 6
    //   292: goto -25 -> 267
    //   295: astore 26
    //   297: aload 26
    //   299: astore 4
    //   301: aconst_null
    //   302: astore_2
    //   303: goto -52 -> 251
    //   306: astore 4
    //   308: goto -57 -> 251
    //   311: astore 15
    //   313: aload 14
    //   315: astore_1
    //   316: aload 13
    //   318: astore_2
    //   319: aload 15
    //   321: astore 4
    //   323: goto -72 -> 251
    //   326: astore 25
    //   328: aload 25
    //   330: astore_3
    //   331: aconst_null
    //   332: astore_2
    //   333: goto -127 -> 206
    //   336: astore_3
    //   337: goto -131 -> 206
    //   340: astore 27
    //   342: aconst_null
    //   343: astore 13
    //   345: aconst_null
    //   346: astore 14
    //   348: goto -247 -> 101
    //   351: astore 24
    //   353: aload_1
    //   354: astore 14
    //   356: aconst_null
    //   357: astore 13
    //   359: goto -258 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   19	174	0	localFile	File
    //   39	315	1	localObject1	Object
    //   48	285	2	localObject2	Object
    //   203	128	3	localObject3	Object
    //   336	1	3	localException1	Exception
    //   247	53	4	localObject4	Object
    //   306	1	4	localObject5	Object
    //   321	1	4	localObject6	Object
    //   190	5	5	localObject7	Object
    //   290	1	6	localIOException1	java.io.IOException
    //   285	1	7	localIOException2	java.io.IOException
    //   236	1	9	localIOException3	java.io.IOException
    //   280	1	11	localIOException4	java.io.IOException
    //   93	1	12	localEOFException1	java.io.EOFException
    //   96	262	13	localObject8	Object
    //   99	256	14	localObject9	Object
    //   311	9	15	localObject10	Object
    //   109	35	16	i1	int
    //   117	38	17	str	String
    //   275	1	19	localIOException5	java.io.IOException
    //   270	1	20	localIOException6	java.io.IOException
    //   63	15	21	i2	int
    //   72	11	22	localdmx	dmx
    //   351	1	24	localEOFException2	java.io.EOFException
    //   326	3	25	localException2	Exception
    //   295	3	26	localObject11	Object
    //   340	1	27	localEOFException3	java.io.EOFException
    //   241	5	28	localObject12	Object
    //   197	5	29	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   49	59	93	java/io/EOFException
    //   59	90	93	java/io/EOFException
    //   165	170	190	finally
    //   175	180	190	finally
    //   180	189	190	finally
    //   192	194	190	finally
    //   221	225	190	finally
    //   229	233	190	finally
    //   255	259	190	finally
    //   263	267	190	finally
    //   267	270	190	finally
    //   22	40	197	java/lang/Exception
    //   229	233	236	java/io/IOException
    //   22	40	241	finally
    //   165	170	270	java/io/IOException
    //   175	180	275	java/io/IOException
    //   221	225	280	java/io/IOException
    //   255	259	285	java/io/IOException
    //   263	267	290	java/io/IOException
    //   40	49	295	finally
    //   49	59	306	finally
    //   59	90	306	finally
    //   206	217	306	finally
    //   101	160	311	finally
    //   40	49	326	java/lang/Exception
    //   49	59	336	java/lang/Exception
    //   59	90	336	java/lang/Exception
    //   22	40	340	java/io/EOFException
    //   40	49	351	java/io/EOFException
  }
  
  public static void c(Context paramContext, int paramInt)
  {
    new Thread(new dlo(paramContext, paramInt)).start();
  }
  
  public static Integer d(Context paramContext, int paramInt)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 206);
    localIntent.putExtra("account_id", paramInt);
    return Integer.valueOf(a(paramContext, localIntent));
  }
  
  public static int e(Context paramContext, int paramInt)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 2300);
    localIntent.putExtra("account_id", paramInt);
    return a(paramContext, localIntent);
  }
  
  public static int f(Context paramContext, int paramInt)
  {
    Intent localIntent = e.a(paramContext, EsService.class);
    localIntent.putExtra("op", 2301);
    localIntent.putExtra("account_id", paramInt);
    return a(paramContext, localIntent);
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   3: ifnull +172 -> 175
    //   6: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   9: astore_1
    //   10: aload_1
    //   11: monitorenter
    //   12: new 953	java/io/BufferedOutputStream
    //   15: dup
    //   16: new 955	java/io/FileOutputStream
    //   19: dup
    //   20: getstatic 598	com/google/android/apps/plus/service/EsService:g	Ljava/io/File;
    //   23: invokespecial 956	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   26: invokespecial 959	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   29: astore_2
    //   30: new 961	java/io/ObjectOutputStream
    //   33: dup
    //   34: aload_2
    //   35: invokespecial 962	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   38: astore_3
    //   39: aload_3
    //   40: getstatic 86	com/google/android/apps/plus/service/EsService:h	Ljava/lang/Integer;
    //   43: invokevirtual 366	java/lang/Integer:intValue	()I
    //   46: invokevirtual 965	java/io/ObjectOutputStream:writeInt	(I)V
    //   49: getstatic 66	com/google/android/apps/plus/service/EsService:c	Ljava/util/Map;
    //   52: invokeinterface 968 1 0
    //   57: invokeinterface 327 1 0
    //   62: astore 14
    //   64: aload 14
    //   66: invokeinterface 311 1 0
    //   71: ifeq +105 -> 176
    //   74: aload 14
    //   76: invokeinterface 315 1 0
    //   81: checkcast 970	java/util/Map$Entry
    //   84: astore 17
    //   86: aload 17
    //   88: invokeinterface 973 1 0
    //   93: checkcast 80	java/lang/Integer
    //   96: astore 18
    //   98: aload 17
    //   100: invokeinterface 976 1 0
    //   105: checkcast 498	dmx
    //   108: astore 19
    //   110: aload 19
    //   112: ifnull -48 -> 64
    //   115: aload_3
    //   116: aload 18
    //   118: invokevirtual 366	java/lang/Integer:intValue	()I
    //   121: invokevirtual 965	java/io/ObjectOutputStream:writeInt	(I)V
    //   124: aload_3
    //   125: aload 19
    //   127: invokevirtual 980	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   130: goto -66 -> 64
    //   133: astore 8
    //   135: aload_3
    //   136: astore 9
    //   138: aload_2
    //   139: astore 10
    //   141: ldc_w 338
    //   144: ldc_w 982
    //   147: aload 8
    //   149: invokestatic 780	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   152: pop
    //   153: aload 9
    //   155: ifnull +8 -> 163
    //   158: aload 9
    //   160: invokevirtual 983	java/io/ObjectOutputStream:close	()V
    //   163: aload 10
    //   165: ifnull +8 -> 173
    //   168: aload 10
    //   170: invokevirtual 984	java/io/BufferedOutputStream:close	()V
    //   173: aload_1
    //   174: monitorexit
    //   175: return
    //   176: aload_3
    //   177: invokevirtual 983	java/io/ObjectOutputStream:close	()V
    //   180: aload_2
    //   181: invokevirtual 984	java/io/BufferedOutputStream:close	()V
    //   184: goto -11 -> 173
    //   187: astore 16
    //   189: goto -16 -> 173
    //   192: astore 4
    //   194: aconst_null
    //   195: astore_3
    //   196: aconst_null
    //   197: astore_2
    //   198: aload_3
    //   199: ifnull +7 -> 206
    //   202: aload_3
    //   203: invokevirtual 983	java/io/ObjectOutputStream:close	()V
    //   206: aload_2
    //   207: ifnull +7 -> 214
    //   210: aload_2
    //   211: invokevirtual 984	java/io/BufferedOutputStream:close	()V
    //   214: aload 4
    //   216: athrow
    //   217: astore 5
    //   219: aload_1
    //   220: monitorexit
    //   221: aload 5
    //   223: athrow
    //   224: astore 15
    //   226: goto -46 -> 180
    //   229: astore 13
    //   231: goto -68 -> 163
    //   234: astore 12
    //   236: goto -63 -> 173
    //   239: astore 7
    //   241: goto -35 -> 206
    //   244: astore 6
    //   246: goto -32 -> 214
    //   249: astore 4
    //   251: aconst_null
    //   252: astore_3
    //   253: goto -55 -> 198
    //   256: astore 4
    //   258: goto -60 -> 198
    //   261: astore 4
    //   263: aload 10
    //   265: astore_2
    //   266: aload 9
    //   268: astore_3
    //   269: goto -71 -> 198
    //   272: astore 8
    //   274: aconst_null
    //   275: astore 9
    //   277: aconst_null
    //   278: astore 10
    //   280: goto -139 -> 141
    //   283: astore 8
    //   285: aload_2
    //   286: astore 10
    //   288: aconst_null
    //   289: astore 9
    //   291: goto -150 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	294	0	this	EsService
    //   9	211	1	localFile	File
    //   29	257	2	localObject1	Object
    //   38	231	3	localObject2	Object
    //   192	23	4	localObject3	Object
    //   249	1	4	localObject4	Object
    //   256	1	4	localObject5	Object
    //   261	1	4	localObject6	Object
    //   217	5	5	localObject7	Object
    //   244	1	6	localIOException1	java.io.IOException
    //   239	1	7	localIOException2	java.io.IOException
    //   133	15	8	localException1	Exception
    //   272	1	8	localException2	Exception
    //   283	1	8	localException3	Exception
    //   136	154	9	localObject8	Object
    //   139	148	10	localObject9	Object
    //   234	1	12	localIOException3	java.io.IOException
    //   229	1	13	localIOException4	java.io.IOException
    //   62	13	14	localIterator	Iterator
    //   224	1	15	localIOException5	java.io.IOException
    //   187	1	16	localIOException6	java.io.IOException
    //   84	15	17	localEntry	java.util.Map.Entry
    //   96	21	18	localInteger	Integer
    //   108	18	19	localdmx	dmx
    // Exception table:
    //   from	to	target	type
    //   39	64	133	java/lang/Exception
    //   64	110	133	java/lang/Exception
    //   115	130	133	java/lang/Exception
    //   180	184	187	java/io/IOException
    //   12	30	192	finally
    //   158	163	217	finally
    //   168	173	217	finally
    //   173	175	217	finally
    //   176	180	217	finally
    //   180	184	217	finally
    //   202	206	217	finally
    //   210	214	217	finally
    //   214	217	217	finally
    //   219	221	217	finally
    //   176	180	224	java/io/IOException
    //   158	163	229	java/io/IOException
    //   168	173	234	java/io/IOException
    //   202	206	239	java/io/IOException
    //   210	214	244	java/io/IOException
    //   30	39	249	finally
    //   39	64	256	finally
    //   64	110	256	finally
    //   115	130	256	finally
    //   141	153	261	finally
    //   12	30	272	java/lang/Exception
    //   30	39	283	java/lang/Exception
  }
  
  public final void a(Intent paramIntent)
  {
    Context localContext = getApplicationContext();
    int i1;
    int i2;
    giz localgiz;
    int i3;
    try
    {
      i1 = paramIntent.getIntExtra("op", -1);
      paramIntent.getIntExtra("rid", -1);
      i2 = paramIntent.getIntExtra("account_id", -1);
      label624:
      if (stopSelfResult(this.o)) {
        break label4527;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        localgiz = (giz)mbb.a(localContext, giz.class);
        switch (i1)
        {
        default: 
          i3 = 0;
          if (i3 == 0) {
            break label4483;
          }
          return;
        }
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
        b(paramIntent, new dmx(0, null, localException2), null);
        return;
      }
      localException1 = localException1;
      localException1.printStackTrace();
      return;
    }
    break label4527;
    a(new biw(localContext, i2, paramIntent.getStringExtra("aid")), paramIntent);
    break label4527;
    a(new bik(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getStringExtra("content"), paramIntent.getBooleanExtra("reshare", false)), paramIntent);
    break label4527;
    a(new bla(localContext, i2, paramIntent.getStringExtra("aid"), true, paramIntent.getBooleanExtra("shown_plus_one_promo", false), paramIntent.getByteArrayExtra("promoted_post_data")), paramIntent);
    break label4527;
    a(new bla(localContext, i2, paramIntent.getStringExtra("aid"), false, false, paramIntent.getByteArrayExtra("promoted_post_data")), paramIntent);
    break label4527;
    a(new bms(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getStringExtra("url"), true, paramIntent.getBooleanExtra("shown_plus_one_promo", false)), paramIntent);
    break label4527;
    a(new bms(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getStringExtra("url"), false, false), paramIntent);
    break label4527;
    a(new bid(localContext, i2, paramIntent.getStringExtra("aid")), paramIntent);
    break label4527;
    a(new bki(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getBooleanExtra("mute_state", true)), paramIntent);
    break label4527;
    a(new bii(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getBooleanExtra("disable_comments", true)), paramIntent);
    break label4527;
    a(new bij(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getBooleanExtra("disable_reshares", true)), paramIntent);
    break label4527;
    a(new bmh(localContext, i2, paramIntent.getStringExtra("aid")), paramIntent);
    break label4527;
    a(new bli(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getStringExtra("source_stream_id"), 1), paramIntent);
    break label4527;
    String[] arrayOfString = paramIntent.getStringArrayExtra("activity_id_list");
    ArrayList localArrayList2 = paramIntent.getStringArrayListExtra("creation_source_list");
    long l6 = paramIntent.getLongExtra("timestamp", 0L);
    a(new bka(localContext, i2, arrayOfString, localArrayList2, false, paramIntent.getIntExtra("mark_operation", 1), l6), paramIntent);
    break label4527;
    String str37 = paramIntent.getStringExtra("resumetoken");
    String str38 = paramIntent.getStringExtra("search_query");
    String str39 = paramIntent.getStringExtra("view_id");
    new Thread(new dlq(this, localContext, i2, str38, paramIntent.getIntExtra("search_mode", 0), str37, str39, paramIntent)).start();
    break label4527;
    new Thread(new dlr(this, paramIntent.getBooleanExtra("all_photos_force_refresh", false), localContext, i2, paramIntent)).start();
    break label4527;
    new Thread(new dls(this, localContext, i2, paramIntent.getLongExtra("all_photos_metadata_count", 0L), paramIntent)).start();
    break label4527;
    String str34 = ((giz)mbb.a(localContext, giz.class)).a(i2).b("gaia_id");
    String str35 = paramIntent.getStringExtra("gaia_id");
    String str36 = paramIntent.getStringExtra("resumetoken");
    Long localLong;
    label2094:
    int i5;
    int i6;
    byte[] arrayOfByte3;
    boolean bool3;
    if (("TRUE".equalsIgnoreCase(dun.f.a())) && (str36 == null) && ((str35 == null) || (str34.equals(str35))))
    {
      new Thread(new dlt(this, paramIntent.getBooleanExtra("highlights_force_refresh", false), localContext, i2, paramIntent)).start();
    }
    else
    {
      a(new bjq(localContext, i2, str35, str36), paramIntent);
      break label4527;
      a(new bhr(localContext, i2, paramIntent.getStringExtra("resumetoken")), paramIntent);
      break label4527;
      String str33 = paramIntent.getStringExtra("resumetoken");
      a(new bmt(localContext, i2, paramIntent.getStringExtra("gaia_id"), str33, true), paramIntent);
      break label4527;
      a(new bhx(localContext, i2, paramIntent.getStringExtra("collection_id"), paramIntent.getStringExtra("auth_key"), null, true), paramIntent);
      break label4527;
      a(new bie(localContext, i2, paramIntent.getStringExtra("collection_id"), paramIntent.getStringExtra("auth_key")), paramIntent);
      break label4527;
      a(new blp(localContext, i2, paramIntent.getStringExtra("album_tile_id"), paramIntent.getStringExtra("collection_id"), paramIntent.getStringExtra("tile_id")), paramIntent);
      break label4527;
      a(new bju(localContext, i2, paramIntent.getStringExtra("collection_id"), paramIntent.getStringExtra("auth_key"), paramIntent.getBooleanExtra("undo", false)), paramIntent);
      break label4527;
      String str32 = paramIntent.getStringExtra("text");
      a(new bkt(localContext, i2, paramIntent.getLongExtra("photo_id", 0L), paramIntent.getStringExtra("tile_id"), paramIntent.getStringExtra("view_id"), paramIntent.getStringExtra("gaia_id"), str32, paramIntent.getStringExtra("auth_key")), paramIntent);
      break label4527;
      a(new bif(localContext, i2, paramIntent.getStringExtra("comment_id"), paramIntent.getStringExtra("tile_id"), paramIntent.getStringExtra("view_id")), paramIntent);
      break label4527;
      String str29 = paramIntent.getStringExtra("aid");
      String str30 = paramIntent.getStringExtra("comment_id");
      boolean bool6 = paramIntent.getBooleanExtra("is_undo", false);
      String str31 = paramIntent.getStringExtra("tile_id");
      a(new bli(localContext, i2, str29, str30, paramIntent.getIntExtra("abuse_type", 1), bool6, str31), paramIntent);
      break label4527;
      String str25 = paramIntent.getStringExtra("comment_id");
      String str26 = paramIntent.getStringExtra("content");
      String str27 = paramIntent.getStringExtra("tile_id");
      int i11 = str25.indexOf('#');
      String str28 = null;
      if (i11 > 0) {
        str28 = str25.substring(0, i11);
      }
      a(new bil(localContext, i2, str28, str25, str26, str27), paramIntent);
      break label4527;
      String str22 = paramIntent.getStringExtra("gaia_id");
      String str23 = paramIntent.getStringExtra("tile_id");
      String str24 = paramIntent.getStringExtra("view_id");
      a(new bkw(localContext, i2, paramIntent.getLongExtra("photo_id", 0L), str22, str23, str24, paramIntent.getBooleanExtra("plus_oned", false)), paramIntent);
      break label4527;
      String str20 = paramIntent.getStringExtra("gaia_id");
      String str21 = paramIntent.getStringExtra("album_id");
      a(new bkv(localContext, i2, str20, jrf.a(3, new String[] { jrf.a(null, str20, str21, "ALBUM") }), str21, null, 0, true), paramIntent);
      break label4527;
      a(new kcp(localContext, i2, paramIntent.getStringExtra("gaia_id"), null, true), paramIntent);
      break label4527;
      String str19 = paramIntent.getStringExtra("gaia_id");
      long l4 = paramIntent.getLongExtra("photo_id", 0L);
      long l5 = paramIntent.getLongExtra("shape_id", 0L);
      boolean bool5 = paramIntent.getBooleanExtra("approved", false);
      a(new bku(localContext, i2, str19, paramIntent.getStringExtra("tile_id"), paramIntent.getStringExtra("view_id"), l4, l5, bool5, paramIntent.getStringExtra("suggested_gaia_id"), paramIntent.getBooleanExtra("is_suggested", false), paramIntent.getStringExtra("collection_id")), paramIntent);
      break label4527;
      String str18 = paramIntent.getStringExtra("gaia_id");
      long l3 = paramIntent.getLongExtra("photo_id", 0L);
      if (!paramIntent.hasExtra("shape_id")) {
        break label4533;
      }
      localLong = Long.valueOf(paramIntent.getLongExtra("shape_id", 0L));
      RectF localRectF3 = (RectF)paramIntent.getParcelableExtra("bounds");
      a(new bkq(localContext, i2, l3, localLong, str18, paramIntent.getStringExtra("taggee_name"), paramIntent.getStringExtra("taggee_email"), paramIntent.getStringExtra("taggee_id"), paramIntent.getStringExtra("tile_id"), paramIntent.getStringExtra("view_id"), paramIntent.getStringExtra("collection_id"), localRectF3), paramIntent);
      break label4527;
      String str17 = paramIntent.getStringExtra("gaia_id");
      a(new bkr(localContext, i2, paramIntent.getLongExtra("photo_id", 0L), paramIntent.getLongExtra("shape_id", 0L), str17, paramIntent.getStringExtra("view_id"), paramIntent.getStringExtra("tile_id"), paramIntent.getBooleanExtra("retain_shape", true)), paramIntent);
      break label4527;
      a(new bih(localContext, i2, (ArrayList)paramIntent.getSerializableExtra("tile_ids"), paramIntent.getBooleanExtra("delete_duplicates", false), paramIntent.getIntExtra("delete_type", 1)), paramIntent);
      break label4527;
      String str16 = paramIntent.getStringExtra("bucket_id");
      if (TextUtils.isEmpty(str16)) {
        efj.b(localContext);
      }
      for (;;)
      {
        b(paramIntent, new dmx(true), null);
        break;
        efj.a(localContext, str16);
      }
      a(new bjh(localContext, i2, paramIntent.getStringExtra("gaia_id"), paramIntent.getLongExtra("photo_id", 0L)), paramIntent);
      break label4527;
      byte[] arrayOfByte6 = paramIntent.getByteArrayExtra("photos_settings");
      a(new blv(localContext, i2, (ojj)qat.b(new ojj(), arrayOfByte6, 0, arrayOfByte6.length)), paramIntent);
      break label4527;
      byte[] arrayOfByte5 = paramIntent.getByteArrayExtra("edit_info");
      if (arrayOfByte5 == null) {}
      for (oih localoih = null;; localoih = (oih)qat.b(new oih(), arrayOfByte5, 0, arrayOfByte5.length))
      {
        String str14 = paramIntent.getStringExtra("photo_id");
        String str15 = paramIntent.getStringExtra("tile_id");
        a(new blt(localContext, i2, str14, paramIntent.getStringExtra("gaia_id"), str15, localoih, paramIntent.getBooleanExtra("set_edit_list_data", true)), paramIntent);
        break;
      }
      String str13 = paramIntent.getStringExtra("photo_id");
      RectF localRectF2 = (RectF)paramIntent.getParcelableExtra("coordinates");
      int i10 = paramIntent.getIntExtra("rotation", 0);
      boolean bool4 = paramIntent.getBooleanExtra("is_gallery_photo", false);
      a(new blx(localContext, new kch().a(localContext, i2).a(), ((giz)mbb.a(localContext, giz.class)).a(i2).b("gaia_id"), str13, localRectF2, i10, bool4), paramIntent);
      break label4527;
      int i7 = paramIntent.getIntExtra("cover_photo_owner_type", -2147483648);
      String str12 = paramIntent.getStringExtra("photo_id");
      int i8 = paramIntent.getIntExtra("top_offset", 0);
      RectF localRectF1 = (RectF)paramIntent.getParcelableExtra("coordinates");
      int i9 = paramIntent.getIntExtra("rotation", 0);
      nxl localnxl1;
      if (localRectF1 != null)
      {
        localnxl1 = new nxl();
        localnxl1.d = new nvn();
        localnxl1.d.h = new nxg();
        localnxl1.d.h.a = 3;
        localnxl1.d.h.b = new nxi();
        localnxl1.d.h.b.d = new nxh();
        localnxl1.d.h.b.d.b = Float.valueOf(localRectF1.left);
        localnxl1.d.h.b.d.a = Float.valueOf(localRectF1.top);
        localnxl1.d.h.b.d.d = Float.valueOf(localRectF1.right);
        localnxl1.d.h.b.d.c = Float.valueOf(localRectF1.bottom);
        localnxl1.d.h.b.a = str12;
        localnxl1.d.h.b.c = i7;
        localnxl1.d.h.b.e = Integer.valueOf(i9);
      }
      nxl localnxl2;
      for (bkg localbkg = new bkg(localContext, i2, localnxl1);; localbkg = new bkg(localContext, i2, localnxl2))
      {
        a(localbkg, paramIntent);
        break;
        paramIntent.getStringExtra("layout");
        localnxl2 = new nxl();
        localnxl2.d = new nvn();
        localnxl2.d.h = new nxg();
        localnxl2.d.h.a = 2;
        localnxl2.d.h.b = new nxi();
        localnxl2.d.h.b.a = str12;
        localnxl2.d.h.b.b = new nxj();
        localnxl2.d.h.b.b.a = Integer.valueOf(i8);
      }
      String str11 = localgiz.a(i2).b("gaia_id");
      byte[] arrayOfByte4 = paramIntent.getByteArrayExtra("data");
      a(new bmr(localContext, new kcg(localContext, i2), str11, "profile", arrayOfByte4), paramIntent);
      break label4527;
      String str10 = paramIntent.getStringExtra("url");
      a(new blk(localContext, new kcg(localContext, i2), str10), paramIntent);
      break label4527;
      new Thread(new dlu(this, localContext, (ipf)paramIntent.getParcelableExtra("media"), paramIntent)).start();
      break label4527;
      a(new bky(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getStringExtra("content"), paramIntent.getByteArrayExtra("promoted_post_data")), paramIntent);
      break label4527;
      String str7 = paramIntent.getStringExtra("aid");
      String str8 = paramIntent.getStringExtra("content");
      String str9 = paramIntent.getStringExtra("event_id");
      paramIntent.getStringExtra("auth_key");
      a(new bkz(localContext, i2, str7, str9, str8, paramIntent.getByteArrayExtra("promoted_post_data")), paramIntent);
      break label4527;
      a(new bil(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getStringExtra("comment_id"), paramIntent.getStringExtra("content"), null), paramIntent);
      break label4527;
      a(new bif(localContext, i2, paramIntent.getStringExtra("comment_id"), null, null), paramIntent);
      break label4527;
      a(new bhy(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getStringExtra("comment_id"), paramIntent.getBooleanExtra("plus_oned", false), paramIntent.getStringExtra("tile_id")), paramIntent);
      break label4527;
      a(new blq(localContext, i2, paramIntent.getStringExtra("aid"), paramIntent.getBooleanExtra("enabled", false)), paramIntent);
      break label4527;
      brg.a(localContext, i2, true);
      b(paramIntent, new dmx(), null);
      break label4527;
      brg.a(localContext, i2, paramIntent.getIntExtra("read_state", 0), null);
      b(paramIntent, new dmx(), null);
      break label4527;
      long l2 = paramIntent.getLongExtra("last_version", 0L);
      if (l2 > 0L)
      {
        brg.a(this, i2, Long.valueOf(0L), null, null, true);
        a(new bmp(localContext, i2, l2), paramIntent);
      }
      else
      {
        b(paramIntent, new dmx(), null);
        break label4527;
        brg.b(localContext, i2);
        if (paramIntent.hasExtra("notif_id")) {
          dmr.a(localContext, i2, paramIntent.getIntExtra("notif_id", 1));
        }
        for (;;)
        {
          b(paramIntent, new dmx(), null);
          break;
          dmr.a(localContext, i2);
        }
        ArrayList localArrayList1 = paramIntent.getStringArrayListExtra("notif_key");
        long[] arrayOfLong = paramIntent.getLongArrayExtra("notif_version");
        if (localArrayList1.size() != 0)
        {
          brg.a(localContext, i2, localArrayList1);
          a(new bls(localContext, i2, localArrayList1, arrayOfLong, 3, "AST"), paramIntent);
        }
        else
        {
          b(paramIntent, new dmx(), null);
          break label4527;
          i5 = paramIntent.getIntExtra("read_state", 0);
          i6 = paramIntent.getIntExtra("high_priority", 0);
          arrayOfByte3 = paramIntent.getByteArrayExtra("init_fetch_param");
          bool3 = paramIntent.getBooleanExtra("manually_initiated", false);
          if (brg.a(localContext, i2, i5, i6, bool3)) {
            break label4539;
          }
          b(paramIntent, new dmx(), null);
          new kpu(7).b(localContext);
        }
      }
    }
    for (;;)
    {
      label3766:
      brg.a(localContext, i2, i5, i6);
      label4483:
      label4527:
      label4533:
      label4539:
      do
      {
        new Thread(new dlv(this, localContext, i2, paramIntent, i5, i6, arrayOfByte3, bool3)).start();
        break label4527;
        new Thread(new dlw(this, localContext, i2, paramIntent, paramIntent.getIntExtra("read_state", 0), paramIntent.getIntExtra("high_priority", 0), paramIntent.getByteArrayExtra("next_fetch_param"))).start();
        break label4527;
        brg.a(this, i2, Long.valueOf(0L), null, null, true);
        b(paramIntent, new dmx(), null);
        break label4527;
        a(new bmv(localContext, i2, paramIntent.getStringExtra("place_cluster_id"), paramIntent.getIntExtra("star_rating", 0), paramIntent.getStringExtra("review_text"), paramIntent.getStringExtra("aid")), paramIntent);
        break label4527;
        new Thread(new dle(this, paramIntent, localContext, i2)).start();
        break label4527;
        byte[] arrayOfByte2 = paramIntent.getByteArrayExtra("profile");
        a(new bkg(localContext, i2, (nxl)qat.b(new nxl(), arrayOfByte2, 0, arrayOfByte2.length)), paramIntent);
        break label4527;
        String str6 = localgiz.a(i2).b("gaia_id");
        byte[] arrayOfByte1 = paramIntent.getByteArrayExtra("profile");
        a(new bkh(localContext, i2, str6, (nxx)qat.b(new nxx(), arrayOfByte1, 0, arrayOfByte1.length)), paramIntent);
        break label4527;
        String str5 = paramIntent.getStringExtra("person_id");
        boolean bool2 = paramIntent.getBooleanExtra("muted", false);
        bkj localbkj = new bkj(localContext, i2, bum.a(localContext, i2));
        localbkj.b = str5;
        localbkj.c = bool2;
        a(localbkj, paramIntent);
        break label4527;
        String str3 = paramIntent.getStringExtra("person_id");
        String str4 = paramIntent.getStringExtra("person_name");
        boolean bool1 = paramIntent.getBooleanExtra("blocked", false);
        bhu localbhu = new bhu(localContext, i2, bum.a(localContext, i2));
        localbhu.b = str3;
        localbhu.d = str4;
        localbhu.c = bool1;
        a(localbhu, paramIntent);
        break label4527;
        new Thread(new dlf(this, localContext, i2, paramIntent)).start();
        break label4527;
        String str1 = paramIntent.getStringExtra("owner_id");
        long l1 = paramIntent.getLongExtra("photo_id", 0L);
        int i4 = paramIntent.getIntExtra("abuse_type", 0);
        if ((i4 <= 0) || (l1 <= 0L) || (str1 == null))
        {
          if (Log.isLoggable("EsService", 5))
          {
            String str2 = String.valueOf("Invalid report abuse params. PhotoId:");
            if (str1 == null) {
              str1 = "null";
            }
            new StringBuilder(53 + String.valueOf(str2).length() + String.valueOf(str1).length()).append(str2).append(l1).append(", ownerId:").append(str1).append(", abuseType:").append(i4);
          }
          b(paramIntent, new dmx(), null);
        }
        else
        {
          a(new blj(localContext, i2, str1, l1, i4), paramIntent);
          break label4527;
          new Thread(new dlg(this, paramIntent, localContext, i2)).start();
          break label4527;
          new Thread(new dlh(this, paramIntent, localContext, i2)).start();
          break label4527;
          a(new bjx(localContext, i2, (ivn)paramIntent.getParcelableExtra("moviemaker_edits")), paramIntent);
          break label4527;
          if (a(localContext, i2, paramIntent, i1)) {
            break label624;
          }
          throw new IllegalArgumentException(32 + "Unsupported op code: " + i1);
        }
        i3 = 1;
        break;
        localLong = null;
        break label2094;
        if (i5 == 2) {
          break label3766;
        }
      } while (i6 != 2);
    }
  }
  
  public final void a(Intent paramIntent, dmx paramdmx, Object paramObject)
  {
    efj.k();
    int i1 = paramIntent.getIntExtra("op", -1);
    int i2 = paramIntent.getIntExtra("rid", -1);
    switch (i1)
    {
    default: 
      Log.e("EsService", 49 + "onIntentProcessed: Unhandled op code: " + i1);
    case 2300: 
    case 2301: 
    case 2400: 
    case 2600: 
    case 12: 
    case 14: 
    case 20: 
    case 18: 
    case 24: 
    case 37: 
    case 38: 
    case 19: 
    case 105: 
    case 106: 
    case 68: 
    case 84: 
    case 69: 
    case 70: 
    case 73: 
    case 64: 
    case 86: 
    case 89: 
    case 90: 
    case 79: 
    case 72: 
    case 78: 
    case 81: 
    case 83: 
      Iterator localIterator49;
      do
      {
        if (paramIntent.hasExtra("rid"))
        {
          Integer localInteger = Integer.valueOf(paramIntent.getIntExtra("rid", -1));
          b.remove(localInteger);
          if (paramdmx != null) {
            c.put(localInteger, paramdmx);
          }
          if (paramIntent.getBooleanExtra("from_pool", false)) {
            e.a(paramIntent);
          }
        }
        if (b.size() == 0)
        {
          f.removeCallbacks(this.q);
          f.postDelayed(this.q, 5000L);
        }
        return;
        gnb localgnb = null;
        if (paramObject != null) {
          localgnb = ((biw)paramObject).a;
        }
        Iterator localIterator72 = d.iterator();
        while (localIterator72.hasNext())
        {
          dme localdme48 = (dme)localIterator72.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("aid");
          localdme48.a(i2, localgnb, paramdmx);
        }
        Iterator localIterator71 = d.iterator();
        while (localIterator71.hasNext())
        {
          dme localdme47 = (dme)localIterator71.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("aid");
          localdme47.o(i2, paramdmx);
        }
        Iterator localIterator70 = d.iterator();
        while (localIterator70.hasNext())
        {
          dme localdme46 = (dme)localIterator70.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("aid");
          localdme46.S(i2, paramdmx);
        }
        bki localbki = (bki)paramObject;
        Iterator localIterator69 = d.iterator();
        while (localIterator69.hasNext())
        {
          dme localdme45 = (dme)localIterator69.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("aid");
          localdme45.b(i2, localbki.a, paramdmx);
        }
        Iterator localIterator68 = d.iterator();
        while (localIterator68.hasNext())
        {
          dme localdme44 = (dme)localIterator68.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("aid");
          localdme44.c(i2, paramIntent.getBooleanExtra("disable_comments", false), paramdmx);
        }
        Iterator localIterator67 = d.iterator();
        while (localIterator67.hasNext())
        {
          dme localdme43 = (dme)localIterator67.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("aid");
          localdme43.d(i2, paramIntent.getBooleanExtra("disable_reshares", false), paramdmx);
        }
        bmh localbmh = (bmh)paramObject;
        Iterator localIterator66 = d.iterator();
        while (localIterator66.hasNext())
        {
          dme localdme42 = (dme)localIterator66.next();
          paramIntent.getIntExtra("account_id", -1);
          Spanned localSpanned1 = localbmh.a;
          Spanned localSpanned2 = localbmh.b;
          HashMap localHashMap = localbmh.c;
          localdme42.a(i2, paramdmx, localSpanned1, localSpanned2, localHashMap);
        }
        Iterator localIterator65 = d.iterator();
        while (localIterator65.hasNext())
        {
          dme localdme41 = (dme)localIterator65.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("aid");
          localdme41.H(i2, paramdmx);
        }
        Iterator localIterator64 = d.iterator();
        while (localIterator64.hasNext())
        {
          dme localdme40 = (dme)localIterator64.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme40.w(i2, paramdmx);
        }
        Iterator localIterator63 = d.iterator();
        while (localIterator63.hasNext())
        {
          dme localdme39 = (dme)localIterator63.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme39.x(i2, paramdmx);
        }
        Iterator localIterator62 = d.iterator();
        while (localIterator62.hasNext())
        {
          dme localdme38 = (dme)localIterator62.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme38.z(i2, paramdmx);
        }
        Iterator localIterator61 = d.iterator();
        while (localIterator61.hasNext())
        {
          dme localdme37 = (dme)localIterator61.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme37.y(i2, paramdmx);
        }
        Iterator localIterator60 = d.iterator();
        while (localIterator60.hasNext())
        {
          dme localdme36 = (dme)localIterator60.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme36.M(i2, paramdmx);
        }
        Iterator localIterator59 = d.iterator();
        while (localIterator59.hasNext())
        {
          dme localdme35 = (dme)localIterator59.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme35.t(i2, paramdmx);
        }
        Iterator localIterator58 = d.iterator();
        while (localIterator58.hasNext())
        {
          dme localdme34 = (dme)localIterator58.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme34.v(i2, paramdmx);
        }
        Iterator localIterator57 = d.iterator();
        while (localIterator57.hasNext())
        {
          dme localdme33 = (dme)localIterator57.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme33.q(i2, paramdmx);
        }
        Iterator localIterator56 = d.iterator();
        while (localIterator56.hasNext())
        {
          dme localdme32 = (dme)localIterator56.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme32.a_(i2, paramdmx);
        }
        Iterator localIterator55 = d.iterator();
        while (localIterator55.hasNext())
        {
          dme localdme31 = (dme)localIterator55.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme31.b(i2, paramdmx);
        }
        Iterator localIterator54 = d.iterator();
        while (localIterator54.hasNext())
        {
          dme localdme30 = (dme)localIterator54.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("comment_id");
          paramIntent.getBooleanExtra("is_undo", false);
          localdme30.c(i2, paramdmx);
        }
        boolean bool4 = paramIntent.getBooleanExtra("plus_oned", false);
        int i4 = paramIntent.getIntExtra("account_id", -1);
        Iterator localIterator53 = d.iterator();
        while (localIterator53.hasNext()) {
          ((dme)localIterator53.next()).a(i2, i4, bool4, paramdmx);
        }
        Iterator localIterator52 = d.iterator();
        while (localIterator52.hasNext())
        {
          dme localdme29 = (dme)localIterator52.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme29.u(i2, paramdmx);
        }
        Iterator localIterator51 = d.iterator();
        while (localIterator51.hasNext())
        {
          dme localdme28 = (dme)localIterator51.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme28.N(i2, paramdmx);
        }
        Iterator localIterator50 = d.iterator();
        while (localIterator50.hasNext())
        {
          dme localdme27 = (dme)localIterator50.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme27.e(i2, paramdmx);
        }
        localIterator49 = d.iterator();
      } while (!localIterator49.hasNext());
      dme localdme26 = (dme)localIterator49.next();
      paramIntent.getIntExtra("account_id", -1);
      if (paramIntent.getLongExtra("shape_id", 0L) != 0L) {}
      for (Long localLong = Long.valueOf(paramIntent.getLongExtra("shape_id", 0L));; localLong = null)
      {
        localdme26.a(i2, paramdmx, localLong);
        break;
      }
    case 82: 
      Iterator localIterator48 = d.iterator();
      while (localIterator48.hasNext())
      {
        dme localdme25 = (dme)localIterator48.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme25.b_(i2, paramdmx);
      }
    case 102: 
      paramIntent.getIntExtra("account_id", -1);
      Iterator localIterator47 = d.iterator();
      while (localIterator47.hasNext()) {
        ((dme)localIterator47.next()).I(i2, paramdmx);
      }
    case 80: 
      paramIntent.getIntExtra("account_id", -1);
      if (paramObject == null) {
        break;
      }
    }
    for (int i3 = ((bih)paramObject).a;; i3 = 1)
    {
      Iterator localIterator46 = d.iterator();
      while (localIterator46.hasNext())
      {
        dme localdme24 = (dme)localIterator46.next();
        switch (i3)
        {
        default: 
          break;
        case 1: 
          localdme24.i(i2, paramdmx);
          break;
        case 2: 
          localdme24.h(i2, paramdmx);
          break;
        case 3: 
          localdme24.g(i2, paramdmx);
        }
      }
      paramIntent.getIntExtra("account_id", -1);
      paramIntent.getStringExtra("album_id");
      Iterator localIterator45 = d.iterator();
      while (localIterator45.hasNext()) {
        ((dme)localIterator45.next()).O(i2, paramdmx);
      }
      Iterator localIterator44 = d.iterator();
      while (localIterator44.hasNext())
      {
        dme localdme23 = (dme)localIterator44.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme23.P(i2, paramdmx);
      }
      Iterator localIterator43 = d.iterator();
      while (localIterator43.hasNext())
      {
        dme localdme22 = (dme)localIterator43.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme22.Q(i2, paramdmx);
      }
      paramIntent.getIntExtra("account_id", -1);
      paramIntent.getLongExtra("photo_id", 0L);
      Iterator localIterator42 = d.iterator();
      while (localIterator42.hasNext()) {
        ((dme)localIterator42.next()).f(i2, paramdmx);
      }
      paramIntent.getIntExtra("account_id", -1);
      ojj localojj = null;
      if (paramObject != null) {
        localojj = ((blv)paramObject).a;
      }
      Iterator localIterator41 = d.iterator();
      while (localIterator41.hasNext()) {
        ((dme)localIterator41.next()).a(i2, localojj, paramdmx);
      }
      dkm localdkm = null;
      if (paramObject != null)
      {
        blt localblt = (blt)paramObject;
        oih localoih = localblt.a;
        localdkm = new dkm(localblt.b);
        if (localoih != null) {
          localdkm.a = qat.a(localoih);
        }
      }
      Iterator localIterator40 = d.iterator();
      while (localIterator40.hasNext())
      {
        dme localdme21 = (dme)localIterator40.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme21.c_(i2, localdkm);
      }
      paramdmx = localdkm;
      break;
      Iterator localIterator39 = d.iterator();
      while (localIterator39.hasNext())
      {
        dme localdme20 = (dme)localIterator39.next();
        paramIntent.getIntExtra("account_id", -1);
        paramIntent.getStringExtra("aid");
        localdme20.R(i2, paramdmx);
      }
      Iterator localIterator38 = d.iterator();
      while (localIterator38.hasNext())
      {
        dme localdme19 = (dme)localIterator38.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme19.E(i2, paramdmx);
      }
      Iterator localIterator37 = d.iterator();
      while (localIterator37.hasNext())
      {
        dme localdme18 = (dme)localIterator37.next();
        paramIntent.getIntExtra("account_id", -1);
        paramIntent.getStringExtra("aid");
        paramIntent.getStringExtra("comment_id");
        localdme18.p(i2, paramdmx);
      }
      Iterator localIterator36 = d.iterator();
      while (localIterator36.hasNext())
      {
        dme localdme17 = (dme)localIterator36.next();
        paramIntent.getIntExtra("account_id", -1);
        paramIntent.getStringExtra("aid");
        paramIntent.getStringExtra("comment_id");
        localdme17.T(i2, paramdmx);
      }
      Iterator localIterator35 = d.iterator();
      while (localIterator35.hasNext())
      {
        dme localdme16 = (dme)localIterator35.next();
        paramIntent.getIntExtra("account_id", -1);
        paramIntent.getStringExtra("aid");
        paramIntent.getStringExtra("comment_id");
        paramIntent.getBooleanExtra("is_undo", false);
        localdme16.U(i2, paramdmx);
      }
      boolean bool3 = paramIntent.getBooleanExtra("plus_oned", true);
      Iterator localIterator34 = d.iterator();
      while (localIterator34.hasNext())
      {
        dme localdme15 = (dme)localIterator34.next();
        paramIntent.getIntExtra("account_id", -1);
        paramIntent.getStringExtra("aid");
        paramIntent.getStringExtra("comment_id");
        localdme15.a(bool3, paramdmx);
      }
      Iterator localIterator33 = d.iterator();
      while (localIterator33.hasNext()) {
        ((dme)localIterator33.next()).a(i2);
      }
      paramIntent.getIntExtra("account_id", -1);
      paramIntent.getStringExtra("aid");
      Iterator localIterator32 = d.iterator();
      while (localIterator32.hasNext()) {
        ((dme)localIterator32.next()).B(i2, paramdmx);
      }
      paramIntent.getIntExtra("account_id", -1);
      paramIntent.getStringExtra("aid");
      Iterator localIterator31 = d.iterator();
      while (localIterator31.hasNext()) {
        ((dme)localIterator31.next()).C(i2, paramdmx);
      }
      Iterator localIterator30 = d.iterator();
      while (localIterator30.hasNext()) {
        ((dme)localIterator30.next()).ab(i2, paramdmx);
      }
      Iterator localIterator29 = d.iterator();
      while (localIterator29.hasNext()) {
        ((dme)localIterator29.next()).A(i2, paramdmx);
      }
      Iterator localIterator28 = d.iterator();
      while (localIterator28.hasNext()) {
        ((dme)localIterator28.next()).ac(i2, paramdmx);
      }
      Iterator localIterator27 = d.iterator();
      while (localIterator27.hasNext()) {
        ((dme)localIterator27.next()).a(paramdmx);
      }
      paramdmx = null;
      break;
      paramdmx = null;
      break;
      Iterator localIterator26 = d.iterator();
      while (localIterator26.hasNext())
      {
        dme localdme14 = (dme)localIterator26.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme14.Z(i2, paramdmx);
      }
      paramdmx = null;
      break;
      Iterator localIterator25 = d.iterator();
      while (localIterator25.hasNext())
      {
        dme localdme13 = (dme)localIterator25.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme13.aa(i2, paramdmx);
      }
      paramdmx = null;
      break;
      paramdmx = null;
      break;
      paramdmx = null;
      break;
      Iterator localIterator24 = d.iterator();
      while (localIterator24.hasNext())
      {
        dme localdme12 = (dme)localIterator24.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme12.Y(i2, paramdmx);
      }
      Iterator localIterator23 = d.iterator();
      while (localIterator23.hasNext())
      {
        dme localdme11 = (dme)localIterator23.next();
        paramIntent.getIntExtra("account_id", -1);
        paramIntent.getStringExtra("person_id");
        localdme11.k(i2, paramdmx);
      }
      Iterator localIterator22 = d.iterator();
      while (localIterator22.hasNext())
      {
        dme localdme10 = (dme)localIterator22.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme10.W(i2, paramdmx);
      }
      Iterator localIterator21 = d.iterator();
      while (localIterator21.hasNext())
      {
        dme localdme9 = (dme)localIterator21.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme9.X(i2, paramdmx);
      }
      Iterator localIterator20 = d.iterator();
      while (localIterator20.hasNext())
      {
        localIterator20.next();
        paramIntent.getStringExtra("person_id");
        paramIntent.getStringExtra("suggestion_id");
        paramIntent.getStringExtra("aid");
        paramIntent.getIntExtra("account_id", -1);
      }
      Iterator localIterator19 = d.iterator();
      while (localIterator19.hasNext())
      {
        dme localdme8 = (dme)localIterator19.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme8.a(i2, paramIntent.getBooleanExtra("muted", false), paramdmx);
      }
      Iterator localIterator18 = d.iterator();
      while (localIterator18.hasNext())
      {
        dme localdme7 = (dme)localIterator18.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme7.a(i2, paramIntent.getStringExtra("person_id"), paramIntent.getBooleanExtra("blocked", false), paramdmx);
      }
      Iterator localIterator17 = d.iterator();
      while (localIterator17.hasNext())
      {
        dme localdme6 = (dme)localIterator17.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme6.J(i2, paramdmx);
      }
      Iterator localIterator16 = d.iterator();
      while (localIterator16.hasNext())
      {
        localIterator16.next();
        paramIntent.getIntExtra("account_id", -1);
      }
      Iterator localIterator15 = d.iterator();
      while (localIterator15.hasNext())
      {
        dme localdme5 = (dme)localIterator15.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme5.r(i2, paramdmx);
      }
      paramdmx = null;
      break;
      Iterator localIterator14 = d.iterator();
      while (localIterator14.hasNext()) {
        ((dme)localIterator14.next()).a(i2, paramIntent.getIntExtra("account_id", -1), paramdmx);
      }
      Iterator localIterator13 = d.iterator();
      while (localIterator13.hasNext())
      {
        dme localdme4 = (dme)localIterator13.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme4.K(i2, paramdmx);
      }
      Iterator localIterator12 = d.iterator();
      while (localIterator12.hasNext())
      {
        dme localdme3 = (dme)localIterator12.next();
        paramIntent.getIntExtra("account_id", -1);
        localdme3.L(i2, paramdmx);
      }
      boolean bool2 = paramIntent.getBooleanExtra("full_res", false);
      String str2 = paramIntent.getStringExtra("description");
      blk localblk;
      File localFile;
      if (paramObject != null)
      {
        localblk = (blk)paramObject;
        localFile = localblk.b;
      }
      for (String str3 = localblk.a;; str3 = null)
      {
        Iterator localIterator11 = d.iterator();
        while (localIterator11.hasNext()) {
          ((dme)localIterator11.next()).a(i2, localFile, bool2, str2, str3, paramdmx);
        }
        Iterator localIterator10 = d.iterator();
        while (localIterator10.hasNext()) {
          ((dme)localIterator10.next()).a(i2, paramdmx, (Bitmap)paramObject);
        }
        Iterator localIterator9 = d.iterator();
        while (localIterator9.hasNext())
        {
          dme localdme2 = (dme)localIterator9.next();
          paramIntent.getIntExtra("account_id", -1);
          localdme2.l(i2, paramdmx);
        }
        paramdmx = null;
        break;
        Iterator localIterator8 = d.iterator();
        while (localIterator8.hasNext()) {
          ((dme)localIterator8.next()).D(i2, paramdmx);
        }
        Iterator localIterator7 = d.iterator();
        while (localIterator7.hasNext()) {
          ((dme)localIterator7.next()).m(i2, paramdmx);
        }
        Iterator localIterator6 = d.iterator();
        while (localIterator6.hasNext()) {
          ((dme)localIterator6.next()).n(i2, paramdmx);
        }
        Iterator localIterator5 = d.iterator();
        while (localIterator5.hasNext()) {
          ((dme)localIterator5.next()).G(i2, paramdmx);
        }
        Iterator localIterator4 = d.iterator();
        while (localIterator4.hasNext()) {
          ((dme)localIterator4.next()).F(i2, paramdmx);
        }
        Iterator localIterator3 = d.iterator();
        while (localIterator3.hasNext()) {
          ((dme)localIterator3.next()).s(i2, paramdmx);
        }
        Iterator localIterator2 = d.iterator();
        while (localIterator2.hasNext())
        {
          dme localdme1 = (dme)localIterator2.next();
          paramIntent.getIntExtra("account_id", -1);
          paramIntent.getStringExtra("gaia_id");
          paramIntent.getStringExtra("aid");
          localdme1.V(i2, paramdmx);
        }
        bks localbks = (bks)paramObject;
        String str1 = localbks.a;
        boolean bool1 = localbks.b;
        Iterator localIterator1 = d.iterator();
        while (localIterator1.hasNext()) {
          ((dme)localIterator1.next()).a(i2, paramIntent.getIntExtra("account_id", -1), str1, bool1, paramdmx);
        }
        paramdmx = null;
        break;
        paramdmx = null;
        break;
        localFile = null;
      }
    }
  }
  
  public final void b(Intent paramIntent, dmx paramdmx, Object paramObject)
  {
    f.post(new dlp(this, paramIntent, paramdmx, paramObject));
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (f == null) {
      f = new Handler(Looper.getMainLooper());
    }
    if (i == null) {
      i = new dlz((kbu)mbb.a(this, kbu.class));
    }
    a(getApplicationContext());
    if (j == null)
    {
      j = bul.a;
      k = bkj.a;
      l = bhu.a;
    }
    this.n = new dmy(f, "ServiceThread", this);
    this.n.start();
  }
  
  public void onDestroy()
  {
    if (this.n != null)
    {
      this.n.a();
      this.n = null;
    }
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent != null) {
      this.n.a(paramIntent);
    }
    this.o = paramInt2;
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.EsService
 * JD-Core Version:    0.7.0.1
 */