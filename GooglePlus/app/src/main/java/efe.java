import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class efe
{
  public final ArrayList<efg> a = new ArrayList();
  public final ArrayList<efi> b = new ArrayList();
  private final Set<Scope> c = new HashSet();
  private String d;
  private String e;
  private final Map<eew<?>, ehr> f = new eza();
  private final Context g;
  private final Map<eew<?>, eey> h = new eza();
  private int i = -1;
  private int j = -1;
  private Looper k;
  private eeo l = eeo.b;
  private eex<? extends fpe, foh> m = fpa.a;
  private foi n = new foi();
  
  public efe(Context paramContext)
  {
    this.g = paramContext;
    this.k = paramContext.getMainLooper();
    this.d = paramContext.getPackageName();
    this.e = paramContext.getClass().getName();
  }
  
  public efe(Context paramContext, efg paramefg, efi paramefi)
  {
    this(paramContext);
    efj.b(paramefg, "Must provide a connected listener");
    this.a.add(paramefg);
    efj.b(paramefi, "Must provide a connection failed listener");
    this.b.add(paramefi);
  }
  
  private ehq b()
  {
    Set localSet = this.c;
    Map localMap = this.f;
    String str1 = this.d;
    String str2 = this.e;
    return new ehq(null, localSet, localMap, 0, null, str1, str2, new foh(false, false, null, null));
  }
  
  public final efd a()
  {
    boolean bool1 = true;
    if (!this.h.isEmpty()) {}
    egl localegl;
    ehb localehb;
    Object localObject;
    for (boolean bool2 = bool1;; bool2 = false)
    {
      efj.b(bool2, "must call addApi() to add at least one API");
      if (this.i < 0) {
        break label230;
      }
      localegl = new egl(this.g.getApplicationContext(), this.k, b(), this.l, this.m, this.h, this.a, this.b, this.i, -1);
      localehb = ehb.a(null);
      if (localehb != null) {
        break;
      }
      new Handler(this.g.getMainLooper()).post(new eff(this, localegl));
      localObject = localegl;
      return localObject;
    }
    int i1 = this.i;
    efj.b(localegl, "GoogleApiClient instance cannot be null");
    if (localehb.c.indexOfKey(i1) < 0) {}
    for (;;)
    {
      efj.a(bool1, "Already managing a GoogleApiClient with id " + i1);
      ehc localehc = new ehc(localehb, i1, localegl, null);
      localehb.c.put(i1, localehc);
      if ((!localehb.a) || (localehb.b)) {
        break;
      }
      localegl.b();
      break;
      bool1 = false;
    }
    label230:
    if (this.j >= 0)
    {
      ehe localehe = ehe.a(null);
      int i2 = this.j;
      int i3;
      if (localehe.f() != null)
      {
        ehf localehf = localehe.a(i2);
        if (localehf != null)
        {
          localObject = localehf.a;
          if (localObject == null) {
            localObject = new egl(this.g.getApplicationContext(), this.k, b(), this.l, this.m, this.h, this.a, this.b, -1, this.j);
          }
          i3 = this.j;
          efj.b(localObject, "GoogleApiClient instance cannot be null");
          if (localehe.a.indexOfKey(i3) >= 0) {
            break label439;
          }
        }
      }
      for (;;)
      {
        efj.a(bool1, "Already managing a GoogleApiClient with id " + i3);
        ehg localehg = new ehg((efd)localObject, null);
        localehe.a.put(i3, localehg);
        if (localehe.f() == null) {
          break;
        }
        cx.a = false;
        localehe.k().a(i3, null, localehe);
        return localObject;
        localObject = null;
        break label278;
        bool1 = false;
      }
    }
    label278:
    label439:
    return new egl(this.g, this.k, b(), this.l, this.m, this.h, this.a, this.b, -1, -1);
  }
  
  public final efe a(eew<? extends efa> parameew)
  {
    this.h.put(parameew, null);
    this.c.addAll(parameew.a().a(null));
    return this;
  }
  
  public final <O extends efa> efe a(eew<O> parameew, O paramO)
  {
    efj.b(paramO, "Null options are not permitted for this Api");
    this.h.put(parameew, paramO);
    this.c.addAll(parameew.a().a(paramO));
    return this;
  }
  
  final void a(ehb paramehb, efd paramefd)
  {
    int i1 = this.i;
    efj.b(paramefd, "GoogleApiClient instance cannot be null");
    if (paramehb.c.indexOfKey(i1) < 0) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "Already managing a GoogleApiClient with id " + i1);
      ehc localehc = new ehc(paramehb, i1, paramefd, null);
      paramehb.c.put(i1, localehc);
      if ((paramehb.a) && (!paramehb.b)) {
        paramefd.b();
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efe
 * JD-Core Version:    0.7.0.1
 */