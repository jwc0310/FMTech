import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.MediaRouteButton;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class jqh
  extends jqb
  implements jqr
{
  static Context a;
  Runnable b;
  jqp c;
  jqf d;
  fqg e;
  final List<jqc> f = new ArrayList();
  jqe g;
  private aao h;
  private aam i;
  private final List<jqd> j = new ArrayList();
  private jql k;
  
  public jqh(Context paramContext)
  {
    this(paramContext, new jql());
  }
  
  private jqh(Context paramContext, jql paramjql)
  {
    this.k = paramjql;
    a = paramContext;
    this.i = new aan().a(((fqn)mbb.a(a, fqn.class)).a("5FD0CDC9")).a();
    jqm localjqm = new jqm(this);
    Context localContext = a;
    aam localaam = this.i;
    aao localaao = aao.a(localContext);
    localaao.a(localaam, localjqm, 1);
    this.h = localaao;
    this.b = new jqi(this);
  }
  
  private final void a(Bundle paramBundle, jqf paramjqf, int paramInt, boolean paramBoolean)
  {
    this.d = paramjqf;
    Intent localIntent = new Intent(a, ((jqg)mbb.a(a, jqg.class)).getClass());
    localIntent.putExtra("notification_bundle", paramBundle);
    localIntent.putExtra("notification_media", paramjqf.a);
    localIntent.putExtra("notification_index", paramInt);
    localIntent.putExtra("notification_video_playing", paramBoolean);
    a.startService(localIntent);
  }
  
  private final String c(jqf paramjqf)
  {
    if ((paramjqf == null) || (TextUtils.isEmpty(paramjqf.a))) {
      return null;
    }
    if (paramjqf.b.equals(ipm.b)) {}
    for (int m = 16;; m = 0)
    {
      int i1;
      int n;
      if (this.c != null)
      {
        jqp localjqp = this.c;
        int i2 = localjqp.e;
        int i3 = 0;
        if (i2 != 0)
        {
          int i4 = localjqp.d;
          i3 = 0;
          if (i4 != 0) {
            i3 = 1;
          }
        }
        if (i3 != 0)
        {
          i1 = this.c.d;
          n = this.c.e;
        }
      }
      for (;;)
      {
        return iqw.a(paramjqf.a, m, i1, n);
        n = 720;
        i1 = 1280;
      }
    }
  }
  
  private final void l()
  {
    if ((this.g != null) && (this.c != null)) {
      this.g.a(this.d, this.c.c);
    }
    if ((this.c != null) && (this.c.c))
    {
      Runnable localRunnable2 = this.b;
      efj.m().removeCallbacks(localRunnable2);
      Runnable localRunnable3 = this.b;
      efj.m().postDelayed(localRunnable3, 33L);
      return;
    }
    Intent localIntent = new Intent(a, ((jqg)mbb.a(a, jqg.class)).getClass());
    localIntent.putExtra("notification_video_playing", false);
    a.startService(localIntent);
    Runnable localRunnable1 = this.b;
    efj.m().removeCallbacks(localRunnable1);
  }
  
  public final void a(double paramDouble)
  {
    if (paramDouble < 0.0D) {
      throw new IllegalArgumentException("newPosition must not be negative.");
    }
    if (this.c != null)
    {
      jqp localjqp = this.c;
      localjqp.a.a((1000.0D * paramDouble));
      localjqp.a(true);
      l();
    }
  }
  
  public final void a(Bundle paramBundle, int paramInt, jqf paramjqf1, jqf paramjqf2)
  {
    if ((paramjqf1 == null) || (this.c == null) || (TextUtils.isEmpty(paramjqf1.a))) {
      return;
    }
    jqp localjqp = this.c;
    String str1 = c(paramjqf1);
    String str2 = c(paramjqf2);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("asset", jqp.a(str1, "image", "remote"));
      if (str2 != null)
      {
        JSONArray localJSONArray = new JSONArray();
        localJSONArray.put(jqp.a(str2, "image", "remote"));
        localJSONObject.put("precache", localJSONArray);
      }
      localjqp.a("newAsset", localJSONObject);
      localjqp.b = null;
      localjqp.a(false);
    }
    catch (JSONException localJSONException)
    {
      label135:
      break label135;
    }
    a(paramBundle, paramjqf1, paramInt, false);
  }
  
  public final void a(MediaRouteButton paramMediaRouteButton)
  {
    paramMediaRouteButton.a(this.i);
    paramMediaRouteButton.a(wa.a);
  }
  
  public final void a(jqc paramjqc)
  {
    this.f.add(paramjqc);
    paramjqc.L();
  }
  
  public final void a(jqd paramjqd)
  {
    this.j.add(paramjqd);
    paramjqd.a(b());
  }
  
  public final void a(jqe paramjqe)
  {
    this.g = paramjqe;
  }
  
  public final void a(jqf paramjqf)
  {
    if ((this.c == null) || (TextUtils.isEmpty(paramjqf.a))) {
      return;
    }
    jqp localjqp = this.c;
    String str = c(paramjqf);
    try
    {
      JSONObject localJSONObject = new JSONObject();
      JSONArray localJSONArray = new JSONArray();
      localJSONArray.put(jqp.a(str, "image", "remote"));
      localJSONObject.put("precache", localJSONArray);
      localjqp.a("precacheAssets", localJSONObject);
      return;
    }
    catch (JSONException localJSONException) {}
  }
  
  final void a(boolean paramBoolean)
  {
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext()) {
      ((jqd)localIterator.next()).a(paramBoolean);
    }
  }
  
  public final boolean a()
  {
    return aao.a(this.i, 0);
  }
  
  public final boolean a(Bundle paramBundle, int paramInt, jqf paramjqf, ojx paramojx)
  {
    if ((!b()) || (paramojx.c == null) || (this.c == null)) {
      return false;
    }
    jqp localjqp1 = this.c;
    ojx localojx = localjqp1.b;
    int m = 0;
    if (localojx != null)
    {
      String str = paramojx.a;
      m = 0;
      if (str != null)
      {
        boolean bool = paramojx.a.equals(localjqp1.b.a);
        m = 0;
        if (bool) {
          m = 1;
        }
      }
    }
    if ((m != 0) && (!this.c.a.c()))
    {
      jqp localjqp2 = this.c;
      localjqp2.a.a();
      localjqp2.a(true);
    }
    for (;;)
    {
      a(paramBundle, paramjqf, paramInt, true);
      l();
      return true;
      this.c.a(paramojx);
    }
  }
  
  public final void b(jqc paramjqc)
  {
    this.f.remove(paramjqc);
  }
  
  public final void b(jqd paramjqd)
  {
    this.j.remove(paramjqd);
  }
  
  public final boolean b()
  {
    return (this.e != null) && (this.e.c());
  }
  
  public final boolean b(jqf paramjqf)
  {
    if ((this.c != null) && (this.d != null) && (TextUtils.equals(paramjqf.a, this.d.a))) {
      return this.c.c;
    }
    return false;
  }
  
  public final void c()
  {
    aao.a();
    aay localaay = aao.b.a();
    if (localaay == null) {
      throw new IllegalArgumentException("route must not be null");
    }
    aao.a();
    if (aao.a) {
      new StringBuilder("selectRoute: ").append(localaay);
    }
    aao.b.a(localaay, 3);
  }
  
  public final void d()
  {
    if ((this.c == null) || (this.d == null)) {
      return;
    }
    jqp localjqp = this.c;
    localjqp.a.b();
    localjqp.a(false);
    l();
  }
  
  public final String e()
  {
    if (this.h == null) {
      return null;
    }
    aao.a();
    return aao.b.b().d;
  }
  
  public final void f()
  {
    jqp localjqp = this.c;
    double d1 = localjqp.g.d();
    if (d1 < 1.0D) {}
    try
    {
      localjqp.g.a(d1 + 0.1D);
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public final void g()
  {
    jqp localjqp = this.c;
    double d1 = localjqp.g.d();
    if (d1 > 0.0D) {}
    try
    {
      localjqp.g.a(d1 - 0.1D);
      return;
    }
    catch (IOException localIOException) {}
  }
  
  final void h()
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext()) {
      ((jqc)localIterator.next()).L();
    }
  }
  
  final void i()
  {
    if (this.e != null) {}
    try
    {
      l();
      this.d = null;
      if (this.c != null)
      {
        this.c.a("invalidateSession", null);
        this.c = null;
      }
      this.e.b();
      a(false);
      a.stopService(new Intent(a, ((jqg)mbb.a(a, jqg.class)).getClass()));
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.e("CastApi", "Disconnecting from a device we are not connected to.", localIllegalStateException);
      return;
    }
    finally
    {
      this.e = null;
    }
  }
  
  final void j()
  {
    aao.a();
    aay localaay = aao.b.a();
    if (localaay == null) {
      throw new IllegalArgumentException("route must not be null");
    }
    aao.a();
    if (aao.a) {
      new StringBuilder("selectRoute: ").append(localaay);
    }
    aao.b.a(localaay, 3);
  }
  
  public final void k()
  {
    l();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqh
 * JD-Core Version:    0.7.0.1
 */