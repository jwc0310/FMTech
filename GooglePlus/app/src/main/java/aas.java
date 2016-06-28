import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class aas
  implements abt, acf
{
  final Context a;
  final ArrayList<WeakReference<aao>> b = new ArrayList();
  public final ArrayList<aay> c = new ArrayList();
  final ArrayList<aax> d = new ArrayList();
  final aat e = new aat(this);
  final abv f;
  abq g;
  public aay h;
  public aaj i;
  private final ArrayList<aaw> j = new ArrayList();
  private final abu k = new abu();
  private final aav l = new aav(this);
  private final boolean m;
  private aay n;
  private aae o;
  
  aas(Context paramContext)
  {
    new ii(this);
    this.a = paramContext;
    gy.a(paramContext);
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    boolean bool;
    Object localObject;
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool = localActivityManager.isLowRamDevice();
      this.m = bool;
      if (Build.VERSION.SDK_INT < 18) {
        break label174;
      }
      localObject = new acb(paramContext, this);
    }
    for (;;)
    {
      this.f = ((abv)localObject);
      a(this.f);
      return;
      bool = false;
      break;
      label174:
      if (Build.VERSION.SDK_INT >= 17) {
        localObject = new aca(paramContext, this);
      } else if (Build.VERSION.SDK_INT >= 16) {
        localObject = new abw(paramContext, this);
      } else {
        localObject = new acc(paramContext);
      }
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    if ((this.n != null) && (!a(this.n)))
    {
      new StringBuilder("Clearing the default route because it is no longer selectable: ").append(this.n);
      this.n = null;
    }
    int i1;
    if ((this.n == null) && (!this.c.isEmpty()))
    {
      Iterator localIterator = this.c.iterator();
      if (localIterator.hasNext())
      {
        aay localaay = (aay)localIterator.next();
        aax localaax = localaay.a;
        aao.a();
        if ((localaax.a != this.f) || (!localaay.b.equals("DEFAULT_ROUTE"))) {
          break label215;
        }
        i1 = 1;
        label122:
        if ((i1 == 0) || (!a(localaay))) {
          break label219;
        }
        this.n = localaay;
        new StringBuilder("Found default route: ").append(this.n);
      }
    }
    if ((this.h != null) && (!a(this.h)))
    {
      new StringBuilder("Unselecting the current route because it is no longer selectable: ").append(this.h);
      b(null, 0);
    }
    if (this.h == null) {
      b(d(), 0);
    }
    label215:
    label219:
    while (!paramBoolean)
    {
      return;
      i1 = 0;
      break label122;
      break;
    }
    e();
  }
  
  private static boolean a(aay paramaay)
  {
    return (paramaay.p != null) && (paramaay.f);
  }
  
  private final int b(String paramString)
  {
    int i1 = this.c.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((aay)this.c.get(i2)).c.equals(paramString)) {
        return i2;
      }
    }
    return -1;
  }
  
  private final void b(aay paramaay, int paramInt)
  {
    if (this.h != paramaay)
    {
      if (this.h != null)
      {
        if (aao.a) {
          new StringBuilder("Route unselected: ").append(this.h).append(" reason: ").append(paramInt);
        }
        this.e.obtainMessage(263, this.h).sendToTarget();
        if (this.i != null)
        {
          this.i.a(paramInt);
          this.i.a();
          this.i = null;
        }
      }
      this.h = paramaay;
      if (this.h != null)
      {
        aax localaax = paramaay.a;
        aao.a();
        this.i = localaax.a.a(paramaay.b);
        if (this.i != null) {
          this.i.b();
        }
        if (aao.a) {
          new StringBuilder("Route selected: ").append(this.h);
        }
        this.e.obtainMessage(262, this.h).sendToTarget();
      }
      e();
    }
  }
  
  private final aay d()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      aay localaay = (aay)localIterator.next();
      if (localaay != this.n)
      {
        aax localaax = localaay.a;
        aao.a();
        if ((localaax.a == this.f) && (localaay.a("android.media.intent.category.LIVE_AUDIO")) && (!localaay.a("android.media.intent.category.LIVE_VIDEO"))) {}
        for (int i1 = 1; (i1 != 0) && (a(localaay)); i1 = 0) {
          return localaay;
        }
      }
    }
    return this.n;
  }
  
  private final void e()
  {
    if (this.h != null)
    {
      this.k.a = this.h.l;
      this.k.b = this.h.m;
      this.k.c = this.h.k;
      this.k.d = this.h.j;
      int i1 = this.j.size();
      for (int i2 = 0; i2 < i1; i2++) {
        this.j.get(i2);
      }
    }
  }
  
  public final aao a(Context paramContext)
  {
    int i1 = this.b.size();
    for (;;)
    {
      int i2 = i1 - 1;
      if (i2 >= 0)
      {
        aao localaao2 = (aao)((WeakReference)this.b.get(i2)).get();
        if (localaao2 == null)
        {
          this.b.remove(i2);
          i1 = i2;
          continue;
        }
        if (localaao2.c == paramContext) {
          return localaao2;
        }
      }
      else
      {
        aao localaao1 = new aao(paramContext);
        this.b.add(new WeakReference(localaao1));
        return localaao1;
      }
      i1 = i2;
    }
  }
  
  public final aay a()
  {
    if (this.n == null) {
      throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }
    return this.n;
  }
  
  public final aay a(String paramString)
  {
    int i1 = c(this.f);
    if (i1 >= 0)
    {
      aax localaax = (aax)this.d.get(i1);
      int i2 = localaax.a(paramString);
      if (i2 >= 0) {
        return (aay)localaax.b.get(i2);
      }
    }
    return null;
  }
  
  public final void a(aaf paramaaf)
  {
    if (c(paramaaf) < 0)
    {
      aax localaax = new aax(paramaaf);
      this.d.add(localaax);
      if (aao.a) {
        new StringBuilder("Provider added: ").append(localaax);
      }
      this.e.obtainMessage(513, localaax).sendToTarget();
      a(localaax, paramaaf.g);
      aav localaav = this.l;
      aao.a();
      paramaaf.d = localaav;
      paramaaf.a(this.o);
    }
  }
  
  final void a(aax paramaax, aak paramaak)
  {
    int i1;
    boolean bool1;
    int i2;
    int i6;
    label58:
    aac localaac;
    int i7;
    String str2;
    Object localObject;
    int i10;
    boolean bool2;
    if (paramaax.d != paramaak)
    {
      paramaax.d = paramaak;
      i1 = 1;
      if (i1 == 0) {
        break label750;
      }
      bool1 = false;
      i2 = 0;
      if (paramaak == null) {
        break label579;
      }
      if (!paramaak.c()) {
        break label564;
      }
      paramaak.b();
      List localList = paramaak.a;
      int i5 = localList.size();
      i6 = 0;
      if (i6 >= i5) {
        break label579;
      }
      localaac = (aac)localList.get(i6);
      String str1 = localaac.a.getString("id");
      i7 = paramaax.a(str1);
      if (i7 >= 0) {
        break label330;
      }
      str2 = paramaax.c.a.flattenToShortString() + ":" + str1;
      if (b(str2) >= 0) {
        break label267;
      }
      localObject = str2;
      aay localaay4 = new aay(paramaax, str1, (String)localObject);
      ArrayList localArrayList2 = paramaax.b;
      i10 = i2 + 1;
      localArrayList2.add(i2, localaay4);
      this.c.add(localaay4);
      localaay4.a(localaac);
      if (aao.a) {
        new StringBuilder("Route added: ").append(localaay4);
      }
      this.e.obtainMessage(257, localaay4).sendToTarget();
      bool2 = bool1;
    }
    label267:
    label564:
    label579:
    for (;;)
    {
      i6++;
      bool1 = bool2;
      i2 = i10;
      break label58;
      i1 = 0;
      break;
      for (int i11 = 2;; i11++)
      {
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = str2;
        arrayOfObject[1] = Integer.valueOf(i11);
        String str3 = String.format(localLocale, "%s_%d", arrayOfObject);
        if (b(str3) < 0)
        {
          localObject = str3;
          break;
        }
      }
      label330:
      if (i7 < i2)
      {
        new StringBuilder("Ignoring route descriptor with duplicate id: ").append(localaac);
        bool2 = bool1;
        i10 = i2;
      }
      else
      {
        aay localaay3 = (aay)paramaax.b.get(i7);
        ArrayList localArrayList1 = paramaax.b;
        int i8 = i2 + 1;
        Collections.swap(localArrayList1, i7, i2);
        int i9 = localaay3.a(localaac);
        if (i9 != 0)
        {
          if ((i9 & 0x1) != 0)
          {
            if (aao.a) {
              new StringBuilder("Route changed: ").append(localaay3);
            }
            this.e.obtainMessage(259, localaay3).sendToTarget();
          }
          if ((i9 & 0x2) != 0)
          {
            if (aao.a) {
              new StringBuilder("Route volume changed: ").append(localaay3);
            }
            this.e.obtainMessage(260, localaay3).sendToTarget();
          }
          if ((i9 & 0x4) != 0)
          {
            if (aao.a) {
              new StringBuilder("Route presentation display changed: ").append(localaay3);
            }
            this.e.obtainMessage(261, localaay3).sendToTarget();
          }
          if (localaay3 == this.h)
          {
            bool2 = true;
            i10 = i8;
            continue;
            new StringBuilder("Ignoring invalid provider descriptor: ").append(paramaak);
            for (int i3 = -1 + paramaax.b.size(); i3 >= i2; i3--)
            {
              aay localaay2 = (aay)paramaax.b.get(i3);
              localaay2.a(null);
              this.c.remove(localaay2);
            }
            a(bool1);
            for (int i4 = -1 + paramaax.b.size(); i4 >= i2; i4--)
            {
              aay localaay1 = (aay)paramaax.b.remove(i4);
              if (aao.a) {
                new StringBuilder("Route removed: ").append(localaay1);
              }
              this.e.obtainMessage(258, localaay1).sendToTarget();
            }
            if (aao.a) {
              new StringBuilder("Provider changed: ").append(paramaax);
            }
            this.e.obtainMessage(515, paramaax).sendToTarget();
            label750:
            return;
          }
        }
        bool2 = bool1;
        i10 = i8;
      }
    }
  }
  
  public final void a(aay paramaay, int paramInt)
  {
    if (!this.c.contains(paramaay))
    {
      new StringBuilder("Ignoring attempt to select removed route: ").append(paramaay);
      return;
    }
    if (!paramaay.f)
    {
      new StringBuilder("Ignoring attempt to select disabled route: ").append(paramaay);
      return;
    }
    b(paramaay, paramInt);
  }
  
  public final boolean a(aam paramaam, int paramInt)
  {
    paramaam.a();
    if (paramaam.b.isEmpty()) {
      return false;
    }
    if (((paramInt & 0x2) == 0) && (this.m)) {
      return true;
    }
    int i1 = this.c.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      aay localaay = (aay)this.c.get(i2);
      if ((((paramInt & 0x1) == 0) || (!localaay.b())) && (localaay.a(paramaam))) {
        return true;
      }
    }
    return false;
  }
  
  public final aay b()
  {
    if (this.h == null) {
      throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }
    return this.h;
  }
  
  public final void b(aaf paramaaf)
  {
    int i1 = c(paramaaf);
    if (i1 >= 0)
    {
      aao.a();
      paramaaf.d = null;
      paramaaf.a(null);
      aax localaax = (aax)this.d.get(i1);
      a(localaax, null);
      if (aao.a) {
        new StringBuilder("Provider removed: ").append(localaax);
      }
      this.e.obtainMessage(514, localaax).sendToTarget();
      this.d.remove(i1);
    }
  }
  
  final int c(aaf paramaaf)
  {
    int i1 = this.d.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((aax)this.d.get(i2)).a == paramaaf) {
        return i2;
      }
    }
    return -1;
  }
  
  public final void c()
  {
    aan localaan = new aan();
    int i1 = this.b.size();
    boolean bool = false;
    int i2 = 0;
    for (;;)
    {
      int i3 = i1 - 1;
      if (i3 < 0) {
        break;
      }
      aao localaao = (aao)((WeakReference)this.b.get(i3)).get();
      if (localaao == null)
      {
        this.b.remove(i3);
        i1 = i3;
      }
      else
      {
        int i6 = localaao.d.size();
        for (int i7 = 0; i7 < i6; i7++)
        {
          aaq localaaq = (aaq)localaao.d.get(i7);
          localaan.a(localaaq.c);
          if ((0x1 & localaaq.d) != 0)
          {
            bool = true;
            i2 = 1;
          }
          if (((0x4 & localaaq.d) != 0) && (!this.m)) {
            i2 = 1;
          }
          if ((0x8 & localaaq.d) != 0) {
            i2 = 1;
          }
        }
        i1 = i3;
      }
    }
    aam localaam;
    if (i2 != 0)
    {
      localaam = localaan.a();
      if (this.o == null) {
        break label246;
      }
      aae localaae = this.o;
      localaae.a();
      if ((!localaae.b.equals(localaam)) || (this.o.a.getBoolean("activeScan") != bool)) {
        break label246;
      }
    }
    label246:
    do
    {
      return;
      localaam = aam.c;
      break;
      localaam.a();
      if ((!localaam.b.isEmpty()) || (bool)) {
        break label351;
      }
    } while (this.o == null);
    label351:
    for (this.o = null;; this.o = new aae(localaam, bool))
    {
      if (aao.a) {
        new StringBuilder("Updated discovery request: ").append(this.o);
      }
      int i4 = this.d.size();
      for (int i5 = 0; i5 < i4; i5++) {
        ((aax)this.d.get(i5)).a.a(this.o);
      }
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aas
 * JD-Core Version:    0.7.0.1
 */