import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class jkg
  implements fyw
{
  volatile ArrayList<jgw> a;
  volatile kl<String, jgw> b;
  volatile ArrayList<jjg> c;
  volatile kl<String, List<jjg>> d;
  long e;
  boolean f;
  long g;
  long h;
  final fyy i;
  final hgs j;
  final jkc k;
  private final Handler l;
  private long m;
  private final giz n;
  private final fyw o;
  private final CopyOnWriteArrayList<jkb> p;
  private final int q;
  private final fym r;
  private final fyv s;
  
  public jkg(Context paramContext, int paramInt)
  {
    fyx localfyx = (fyx)mbb.a(paramContext, fyx.class);
    this.p = new CopyOnWriteArrayList();
    this.q = paramInt;
    this.n = ((giz)mbb.a(paramContext, giz.class));
    this.r = ((fym)mbb.a(paramContext, fym.class));
    this.s = ((fyv)mbb.a(paramContext, fyv.class));
    this.i = this.r.a();
    this.j = ((hgs)mbb.a(paramContext, hgs.class));
    this.k = ((jkc)mbb.a(paramContext, jkc.class));
    this.o = localfyx.a(this);
    this.m = 60000L;
    this.f = false;
    this.l = new jkh(this, Looper.getMainLooper());
  }
  
  static long a(fzl paramfzl)
  {
    int i1 = paramfzl.b();
    int i2 = 0;
    long l1 = 17L;
    if (i2 < i1)
    {
      fzk localfzk = (fzk)paramfzl.a(i2);
      long l2 = l1 * 31L;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = localfzk.b();
      arrayOfObject[1] = localfzk.c();
      if (localfzk.h()) {}
      for (int i3 = 1;; i3 = 0)
      {
        arrayOfObject[2] = Integer.valueOf(i3);
        arrayOfObject[3] = Integer.valueOf(localfzk.f());
        l1 = l2 + Arrays.hashCode(arrayOfObject);
        i2++;
        break;
      }
    }
    return l1;
  }
  
  private final void f()
  {
    if (!this.n.c(this.q)) {
      return;
    }
    gjb localgjb = this.n.a(this.q);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    fyp localfyp = new fyp();
    localfyp.b = null;
    localfyp.a = -999;
    localfyp.c = null;
    localfyp.d = false;
    this.r.a(this.i, str1, str2, localfyp).a(new jki(this));
  }
  
  public final List<jgw> a()
  {
    try
    {
      ArrayList localArrayList = this.a;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void a(int paramInt)
  {
    boolean bool1;
    boolean bool2;
    label18:
    boolean bool3;
    label43:
    Iterator localIterator;
    if ((paramInt & 0x2) == 2)
    {
      bool1 = true;
      if ((paramInt & 0x4) != 4) {
        break label220;
      }
      bool2 = true;
      if (((!bool1) && (!bool2)) || (this.a == null) || (this.c == null)) {
        break label225;
      }
      bool3 = true;
      if (jid.a())
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Boolean.valueOf(bool1);
        arrayOfObject[1] = Boolean.valueOf(bool2);
        arrayOfObject[2] = Boolean.valueOf(bool3);
        jid.a("CachedPeopleData#notifyListeners", String.format("circlesChanged: %b, peopleChanged: %b, topPeopleInCirclesChanged: %b.", arrayOfObject));
      }
      localIterator = this.p.iterator();
    }
    label101:
    label235:
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      jkb localjkb = (jkb)localIterator.next();
      if (((bool1) && ((localjkb instanceof jgu))) || ((bool1) && ((localjkb instanceof jgv))) || ((bool2) && ((localjkb instanceof jil))) || ((bool3) && ((localjkb instanceof jjr)))) {}
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 == 0) {
          break label235;
        }
        if (jid.a()) {
          jid.a("CachedPeopleData#notifyListeners", String.format("Notifying listener: %s.", new Object[] { localjkb }));
        }
        localjkb.c();
        break label101;
        bool1 = false;
        break;
        bool2 = false;
        break label18;
        bool3 = false;
        break label43;
      }
    }
    label220:
    label225:
    return;
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    int i1 = 1;
    if (!this.n.c(this.q)) {
      return;
    }
    int i2;
    if ((paramInt & 0x2) == 2)
    {
      i2 = i1;
      label31:
      if ((paramInt & 0x4) != 4) {
        break label110;
      }
    }
    for (;;)
    {
      gjb localgjb = this.n.a(this.q);
      if ((!mfx.a(localgjb.b("account_name"), paramString1)) || (!mfx.a(localgjb.b("effective_gaia_id"), paramString2))) {
        break;
      }
      if (i2 != 0) {
        f();
      }
      if (i1 == 0) {
        break;
      }
      e();
      return;
      i2 = 0;
      break label31;
      label110:
      i1 = 0;
    }
  }
  
  public final void a(jkb paramjkb)
  {
    int i1 = 1;
    label290:
    for (;;)
    {
      try
      {
        this.p.add(paramjkb);
        int i2;
        if (this.p.size() == i1)
        {
          this.l.removeMessages(1);
          if (!this.i.e())
          {
            if (jid.a()) {
              jid.a("CachedPeopleData#connect", "Connect client and register data changed listener.");
            }
            this.i.c();
            this.s.a(this.i, this.o, 7);
          }
          if (!this.f) {
            break label290;
          }
          if (this.e >= this.j.b() - 60000L) {
            continue;
          }
          break label290;
          if (i2 != 0)
          {
            if (jid.a())
            {
              Object[] arrayOfObject = new Object[2];
              arrayOfObject[0] = Boolean.valueOf(this.f);
              arrayOfObject[1] = Boolean.valueOf(true);
              jid.a("CachedPeopleData#register", String.format("isDataLoaded: %b, needsSync: %b.", arrayOfObject));
            }
            f();
          }
        }
        if ((((paramjkb instanceof jgu)) && (this.a != null)) || (((paramjkb instanceof jgv)) && (this.b != null)) || (((paramjkb instanceof jil)) && (this.c != null)) || (((paramjkb instanceof jjr)) && (this.a != null) && (this.c != null)))
        {
          if (i1 != 0)
          {
            if (jid.a()) {
              jid.a("CachedPeopleData#register", String.format("Notifying listener: %s.", new Object[] { paramjkb }));
            }
            paramjkb.c();
          }
          return;
          i2 = 0;
        }
        else
        {
          i1 = 0;
          continue;
          i2 = i1;
        }
      }
      finally {}
    }
  }
  
  public final kl<String, jgw> b()
  {
    try
    {
      kl localkl = this.b;
      return localkl;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void b(jkb paramjkb)
  {
    try
    {
      this.p.remove(paramjkb);
      if (this.p.isEmpty()) {
        this.l.sendEmptyMessageDelayed(1, this.m);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final List<jjg> c()
  {
    try
    {
      ArrayList localArrayList = this.c;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final kl<String, List<jjg>> d()
  {
    try
    {
      kl localkl = this.d;
      return localkl;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void e()
  {
    if (!this.n.c(this.q)) {
      return;
    }
    gjb localgjb = this.n.a(this.q);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    fyt localfyt = jjo.a.a();
    this.r.a(this.i, str1, str2, localfyt).a(new jkj(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkg
 * JD-Core Version:    0.7.0.1
 */