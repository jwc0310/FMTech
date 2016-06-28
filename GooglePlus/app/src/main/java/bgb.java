import android.app.Activity;
import android.content.Context;
import com.google.android.apps.plus.activitylog.impl.ActivityLogActivityPeer;
import com.google.android.apps.plus.settings.impl.GstsPhotosSettingsActivityPeer;
import com.google.android.libraries.social.sharekit.reshare.ReshareChooserActivity;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

final class bgb
  implements bhj
{
  private rgq<idx> A;
  private rgq<idy> B;
  private rgq<lzw> C;
  private rgq<ActivityLogActivityPeer> D;
  private rgq<GstsPhotosSettingsActivityPeer> E;
  rgq<Activity> a;
  rgq<bp> b;
  rgq<mek> c;
  rgq<git> d;
  rgq<gvh> e;
  rgq<gun> f;
  rgq<Context> g;
  private final ozg i;
  private rgq<Set<pac>> j;
  private rgq<Set<pac>> k;
  private rgq<Set<pac>> l;
  private rgq<pac> m;
  private rgq<Map<String, rgq<pac>>> n;
  private rgq<pad> o;
  private rgq<ReshareChooserActivity> p;
  private rgq<kon> q;
  private rgq<mek> r;
  private rgq<Set<rgq<mek>>> s;
  private rgq<Set<rgq<mek>>> t;
  private rgq<Class<? extends git>> u;
  private rgq<Class<? extends git>> v;
  private rgq<Map<String, rgq<Class<? extends git>>>> w;
  private rgq<gpm> x;
  private rgq<gpl> y;
  private rgq z;
  
  bgb(bga parambga, ozg paramozg)
  {
    if (paramozg == null) {
      throw new NullPointerException();
    }
    this.i = paramozg;
    this.a = rgo.a(new ozh(this.i));
    this.j = rgo.a(ozt.a);
    this.k = pag.a;
    rgq[] arrayOfrgq1 = new rgq[2];
    arrayOfrgq1[0] = this.j;
    arrayOfrgq1[1] = this.k;
    this.l = new rgp(Arrays.asList(arrayOfrgq1));
    this.m = paf.a;
    this.n = new rgl(new rgm(1).a("ignored", this.m).a);
    this.o = rgo.a(new pae(this.a, this.l, this.h.g, this.n));
    this.p = new kos(this.a);
    this.q = new koq(this.p, this.h.h);
    this.b = rgo.a(new ozi(this.i));
    this.r = rgo.a(new ozu(this.a));
    this.s = ozv.a;
    rgq[] arrayOfrgq2 = new rgq[1];
    arrayOfrgq2[0] = this.s;
    this.t = new rgp(Arrays.asList(arrayOfrgq2));
    this.c = new ozw(this.r, this.t);
    this.u = bhh.a;
    this.v = drx.a;
    this.w = new rgl(new rgm(2).a("com.google.android.apps.plus.activitylog.impl.ActivityLogActivity", this.u).a("com.google.android.apps.plus.settings.impl.GstsPhotosSettingsActivity", this.v).a);
    this.d = rgo.a(new otj(this.a, this.c, this.w, this.h.g, this.h.i, this.h.b));
    this.x = rgo.a(new gpp(this.a, this.c, this.h.j));
    this.y = new gqg(this.x);
    this.z = new ien(this.h.k);
    this.A = new ieu(this.z);
    this.B = new idz(this.a, this.c, hzq.a, this.d, this.y, this.A);
    this.C = rgo.a(new lzy(this.a, this.c, this.d));
    this.D = new bhg(this.b, this.B, this.y, this.C);
    this.E = new drw(this.a, this.B, this.C, this.y);
    this.e = rgo.a(new gur(this.c));
    this.f = rgo.a(new guq(this.a, this.c));
    this.g = new ovk(this.a);
  }
  
  public final pad a()
  {
    return (pad)this.o.a();
  }
  
  public final kon b()
  {
    return (kon)this.q.a();
  }
  
  public final ActivityLogActivityPeer c()
  {
    return (ActivityLogActivityPeer)this.D.a();
  }
  
  public final GstsPhotosSettingsActivityPeer d()
  {
    return (GstsPhotosSettingsActivityPeer)this.E.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgb
 * JD-Core Version:    0.7.0.1
 */