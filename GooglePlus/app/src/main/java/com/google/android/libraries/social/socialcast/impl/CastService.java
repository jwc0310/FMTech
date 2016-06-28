package com.google.android.libraries.social.socialcast.impl;

import aam;
import aan;
import aao;
import aap;
import aas;
import aay;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import dk;
import dl;
import efj;
import fqg;
import fqk;
import fql;
import fqm;
import fqn;
import giz;
import gjb;
import gwz;
import gxq;
import gxr;
import gxt;
import ipb;
import ipf;
import iph;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kaz;
import kbb;
import kcm;
import kcn;
import kqf;
import kvt;
import kvu;
import kvw;
import kvx;
import kvy;
import kvz;
import kwa;
import kwb;
import kwc;
import mbb;
import mbe;
import org.json.JSONException;
import org.json.JSONObject;
import pjt;
import pke;

public final class CastService
  extends Service
  implements kbb, mbe
{
  public static boolean G = false;
  private static final gxq H = new gxq(pjt.e);
  private static mbb P;
  public String A;
  public String B;
  public fql C;
  public fqg D;
  public String E;
  public String F;
  private Handler I;
  private aao J;
  private aap K;
  private aam L;
  private aay M;
  private fqn N;
  private kcm O;
  private kvt Q;
  public HashSet<kvw> a;
  public kwa b;
  public kwc c;
  public String d;
  public Runnable e;
  public kvz f;
  public ipb g;
  public boolean h;
  public String i;
  public String j;
  public String k;
  public String l;
  public String m;
  public int n;
  public kcn o;
  public boolean p;
  public boolean q;
  public boolean r;
  public boolean s;
  public boolean t;
  public boolean u;
  public boolean v;
  public String w = "";
  public iph x;
  public ipf y;
  public String z;
  
  private final void a(gxt paramgxt)
  {
    gxr localgxr = new gxr();
    gxq localgxq1 = new gxq(paramgxt);
    localgxr.b.add(localgxq1);
    gxq localgxq2 = H;
    localgxr.b.add(localgxq2);
    gwz localgwz = new gwz(4, localgxr);
    localgwz.c = this.k;
    localgwz.b(this);
  }
  
  private final void g()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((kvw)localIterator.next()).a();
    }
  }
  
  private final void h()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((kvw)localIterator.next()).c();
    }
  }
  
  private final void i()
  {
    if (Log.isLoggable("CastService", 4))
    {
      String str = String.valueOf(this.d);
      if (str.length() == 0) {
        break label79;
      }
      "APP ID: ".concat(str);
    }
    for (;;)
    {
      this.L = new aan().a(this.N.a(this.d)).a();
      this.J.a(this.L, this.K, 1);
      return;
      label79:
      new String("APP ID: ");
    }
  }
  
  private final void j()
  {
    this.h = false;
    if (this.C == null) {
      return;
    }
    this.p = false;
    this.q = false;
    try
    {
      this.o.b(getApplicationContext(), this.k);
      if (this.D == null) {}
    }
    catch (Exception localException)
    {
      try
      {
        this.D.a("urn:x-cast:com.google.android.apps.socialcast");
        this.D.b();
        this.D = null;
        this.i = null;
        this.j = null;
        this.l = null;
        this.m = null;
        this.M = null;
        this.C = null;
        return;
        localException = localException;
        Log.e("CastService", "error invalidating auth token");
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("CastService", "error removing callback", localIOException);
        }
      }
    }
  }
  
  public final void a(aay paramaay)
  {
    if (Log.isLoggable("CastService", 4))
    {
      String str = String.valueOf(paramaay);
      new StringBuilder(34 + String.valueOf(str).length()).append("Starting cast session with route: ").append(str);
    }
    this.M = paramaay;
    this.C = ((fqm)mbb.a(getApplicationContext(), fqm.class)).a(paramaay.n);
    this.D = ((fqk)mbb.a(getApplicationContext(), fqk.class)).a();
    this.D.a(getApplicationContext(), this.C, new kvx(this));
    try
    {
      this.D.a();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.e("CastService", "Error connecting to API client", localIllegalStateException);
      e();
    }
  }
  
  public final void a(String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("command", paramString);
      localJSONObject.put("id", this.i);
      a(localJSONObject);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      throw new RuntimeException(localIllegalStateException);
    }
    catch (JSONException localJSONException)
    {
      label36:
      break label36;
    }
  }
  
  public final void a(kaz paramkaz)
  {
    int i1 = paramkaz.q;
    if (i1 == 2) {}
    while (i1 != 1) {
      return;
    }
    g();
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.toString();
    if ((this.D == null) || (!this.D.c()))
    {
      String str2 = String.valueOf("Cannot send message because not connected to Chromecast. message: ");
      String str3 = String.valueOf(str1);
      if (str3.length() != 0) {}
      for (String str4 = str2.concat(str3);; str4 = new String(str2))
      {
        Log.e("CastService", str4);
        Toast.makeText(this, dl.m, 0).show();
        return;
      }
    }
    String str5;
    if (Log.isLoggable("CastService", 3))
    {
      str5 = String.valueOf("Sending message: (ns=urn:x-cast:com.google.android.apps.socialcast) ");
      String str6 = String.valueOf(str1);
      if (str6.length() == 0) {
        break label148;
      }
      str5.concat(str6);
    }
    for (;;)
    {
      this.D.a("urn:x-cast:com.google.android.apps.socialcast", str1, new kvu(this, str1));
      return;
      label148:
      new String(str5);
    }
  }
  
  public final mbb aE_()
  {
    return P;
  }
  
  public final void ap_() {}
  
  public final void b() {}
  
  public final void d()
  {
    if (this.e != null)
    {
      this.I.removeCallbacks(this.e);
      this.e = null;
    }
  }
  
  public final void e()
  {
    if ((this.M != null) && (this.M.a()))
    {
      aao.a();
      aay localaay = aao.b.a();
      aao.a();
      aao.b.a(localaay, 3);
      return;
    }
    f();
  }
  
  public final void f()
  {
    if ((this.D != null) && (this.D.c())) {
      a("remove_user");
    }
    d();
    h();
    j();
    stopSelf();
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    this.F = null;
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle == null) {
      return this.b;
    }
    this.E = localBundle.getString("data_source", "stream");
    this.F = localBundle.getString("selected_route_id");
    boolean bool = localBundle.getBoolean("shutdown", false);
    Object[] arrayOfObject;
    if (Log.isLoggable("CastService", 4))
    {
      arrayOfObject = new Object[4];
      arrayOfObject[0] = this.E;
      arrayOfObject[1] = this.F;
      arrayOfObject[2] = Boolean.valueOf(bool);
      if (this.L != null) {
        break label139;
      }
    }
    label139:
    for (String str = "null";; str = "not null")
    {
      arrayOfObject[3] = str;
      String.format("onBind. circleName:%s routeId:%s, clientShutdown:%s mediaRouteSelector:%s", arrayOfObject);
      if ((!bool) && (this.F != null)) {
        break;
      }
      h();
      return this.b;
    }
    if (this.L == null)
    {
      i();
      Intent localIntent = new Intent(this, CastService.class);
      localIntent.putExtras(localBundle);
      localIntent.putExtra("account_id", this.n);
      startService(localIntent);
    }
    return this.b;
  }
  
  public final void onCreate()
  {
    this.a = new HashSet();
    this.I = new Handler();
    this.b = new kwa(this);
    this.J = aao.a(getApplicationContext());
    this.K = new kwb(this);
    this.c = new kwc(this);
    this.N = ((fqn)mbb.a(getApplicationContext(), fqn.class));
    giz localgiz = (giz)mbb.a(getApplicationContext(), giz.class);
    this.n = localgiz.c("active-plus-account");
    gjb localgjb = localgiz.a(this.n);
    String str1 = localgjb.b("effective_gaia_id");
    if (TextUtils.isEmpty(str1)) {
      str1 = localgjb.b("gaia_id");
    }
    this.i = str1;
    this.j = localgjb.b("display_name");
    this.k = localgjb.b("account_name");
    this.l = localgjb.b("profile_photo_url");
    this.d = efj.A(getApplicationContext(), this.n);
    this.g = ((ipb)mbb.a(getApplicationContext(), ipb.class));
    this.O = ((kcm)mbb.a(getApplicationContext(), kcm.class));
    kcm localkcm = this.O;
    if (this.b.u()) {}
    for (String str2 = "oauth2: https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.recentread";; str2 = "oauth2: https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.recentpublicread")
    {
      this.o = localkcm.a(str2);
      this.Q = new kvt(this, this.b);
      kwa localkwa = this.b;
      kvt localkvt = this.Q;
      localkwa.a.a.add(localkvt);
      P = new mbb(this, mbb.b(getApplicationContext()));
      return;
    }
  }
  
  public final void onDestroy()
  {
    G = false;
    kqf localkqf = new kqf(8);
    localkqf.b = this.k;
    localkqf.b(this);
    if (this.f != null)
    {
      this.f.cancel(true);
      this.f = null;
    }
    d();
    aao.a();
    if (aao.b.b().equals(this.M))
    {
      aao.a();
      aay localaay = aao.b.a();
      aao.a();
      aao.b.a(localaay, 3);
    }
    f();
    this.J.a(this.K);
    this.L = null;
    this.d = null;
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    G = true;
    if (this.L == null) {
      i();
    }
    if ((paramIntent != null) && (paramIntent.getAction() != null))
    {
      if (this.C == null)
      {
        Log.e("CastService", "Sent action when not connected. This shouldn't be possible. Make sure there is an intent filter and .CastService exported is true in Android Manifest");
        stopSelf();
        return 2;
      }
      String str1 = paramIntent.getAction();
      String str2;
      if (str1.equals("com.google.android.libraries.social.socialcast.action.next"))
      {
        a(pke.d);
        str2 = "next";
      }
      for (;;)
      {
        a(str2);
        label149:
        do
        {
          for (;;)
          {
            return 1;
            if (str1.equals("com.google.android.libraries.social.socialcast.action.prev"))
            {
              a(pke.h);
              str2 = "prev";
              break;
            }
            if (!str1.equals("com.google.android.libraries.social.socialcast.action.stop")) {
              break label149;
            }
            a(pke.b);
            if (this.b.a.q) {
              e();
            }
          }
        } while (!str1.equals("com.google.android.libraries.social.socialcast.action.toggle_playpause"));
        if (this.r) {}
        for (gxt localgxt = pke.e;; localgxt = pke.f)
        {
          a(localgxt);
          if (!this.r) {
            break label201;
          }
          str2 = "pause";
          break;
        }
        label201:
        str2 = "play";
      }
    }
    if (this.C != null) {
      j();
    }
    if (paramIntent != null)
    {
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle != null) {
        this.F = localBundle.getString("selected_route_id");
      }
    }
    if (TextUtils.isEmpty(this.F))
    {
      Log.e("CastService", "Started with no selected route ID.");
      stopSelf();
      return 2;
    }
    Iterator localIterator1 = this.a.iterator();
    while (localIterator1.hasNext()) {
      ((kvw)localIterator1.next()).b();
    }
    aao.a();
    Iterator localIterator2 = aao.b.c.iterator();
    while (localIterator2.hasNext())
    {
      aay localaay = (aay)localIterator2.next();
      if (localaay.c.equals(this.F)) {
        a(localaay);
      }
    }
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 == 0)
      {
        this.e = new kvy(this);
        this.I.postDelayed(this.e, 10000L);
      }
      startForeground(0, this.Q.d().b());
      return 1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.socialcast.impl.CastService
 * JD-Core Version:    0.7.0.1
 */