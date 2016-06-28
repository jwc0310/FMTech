import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

public final class kgn
  implements khj
{
  final Context a;
  final bk b;
  final kgw c;
  final lkg d;
  final lje e;
  final pec f;
  final rgq<PreferenceScreen> g;
  final oxz h;
  final kez i;
  final Executor j;
  final Executor k;
  final String l;
  oxp<Boolean> m = new kgo(this);
  private final khq n;
  private final khk o;
  private final ArrayList<rac> p;
  private final kgt q = new kgt(this);
  private oxr<pfk<kx>> r = new kgp(this);
  
  kgn(Context paramContext, bk parambk, lkg paramlkg, kgw paramkgw, lje paramlje, pec parampec, oxz paramoxz, khq paramkhq, rgq<PreferenceScreen> paramrgq, khk paramkhk, kez paramkez, Executor paramExecutor1, Executor paramExecutor2, String paramString)
  {
    this.a = paramContext;
    this.b = parambk;
    this.c = paramkgw;
    this.e = paramlje;
    this.j = paramExecutor1;
    this.k = paramExecutor2;
    this.c.e = this;
    this.d = paramlkg;
    this.f = parampec;
    this.h = paramoxz;
    this.g = paramrgq;
    this.n = paramkhq;
    this.o = paramkhk;
    this.i = paramkez;
    this.l = paramString;
    if (!TextUtils.isEmpty(paramString)) {
      paramkhq.a = paramString;
    }
    this.p = new ArrayList(paramkgw.b.keySet());
  }
  
  final void a()
  {
    owp localowp = this.d.a(this.n, this.p);
    this.h.a(localowp, this.q);
    this.h.a(new khn(this.o), this.r);
    this.h.a(new lky(this.d), this.m);
  }
  
  final void a(String paramString)
  {
    if ((bj)this.b.h().a("progress_dialog_tag") == null)
    {
      luv.a(null, paramString, null, false, false, null).a(this.b.h(), "progress_dialog_tag");
      this.b.h().b();
    }
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    bk localbk = this.b;
    int i1 = da.ae;
    a(localbk.g().getString(i1));
    this.h.a(new khl(this.o, paramString, paramBoolean), this.r);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgn
 * JD-Core Version:    0.7.0.1
 */