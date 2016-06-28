import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteCategory;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.media.MediaRouter.VolumeCallback;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class abw
  extends abv
  implements aaz, abd
{
  private static final ArrayList<IntentFilter> o;
  private static final ArrayList<IntentFilter> p;
  public final Object i;
  public final Object j;
  public int k;
  public boolean l;
  public boolean m;
  public final ArrayList<aby> n = new ArrayList();
  private final acf q;
  private Object r;
  private Object s;
  private ArrayList<abz> t = new ArrayList();
  private abc u;
  private abb v;
  
  static
  {
    IntentFilter localIntentFilter1 = new IntentFilter();
    localIntentFilter1.addCategory("android.media.intent.category.LIVE_AUDIO");
    ArrayList localArrayList1 = new ArrayList();
    o = localArrayList1;
    localArrayList1.add(localIntentFilter1);
    IntentFilter localIntentFilter2 = new IntentFilter();
    localIntentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
    ArrayList localArrayList2 = new ArrayList();
    p = localArrayList2;
    localArrayList2.add(localIntentFilter2);
  }
  
  public abw(Context paramContext, acf paramacf)
  {
    super(paramContext);
    this.q = paramacf;
    this.i = paramContext.getSystemService("media_router");
    this.j = c();
    this.r = new abe(this);
    Resources localResources = paramContext.getResources();
    Object localObject = this.i;
    String str = localResources.getString(efj.bF);
    this.s = ((MediaRouter)localObject).createRouteCategory(str, false);
    e();
  }
  
  private void a(aby paramaby)
  {
    aad localaad = new aad(paramaby.b, j(paramaby.a));
    a(paramaby, localaad);
    paramaby.c = localaad.a();
  }
  
  private int b(String paramString)
  {
    int i1 = this.n.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((aby)this.n.get(i2)).b.equals(paramString)) {
        return i2;
      }
    }
    return -1;
  }
  
  private int e(aay paramaay)
  {
    int i1 = this.t.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((abz)this.t.get(i2)).a == paramaay) {
        return i2;
      }
    }
    return -1;
  }
  
  private final void e()
  {
    MediaRouter localMediaRouter = (MediaRouter)this.i;
    int i1 = localMediaRouter.getRouteCount();
    ArrayList localArrayList = new ArrayList(i1);
    for (int i2 = 0; i2 < i1; i2++) {
      localArrayList.add(localMediaRouter.getRouteAt(i2));
    }
    Iterator localIterator = localArrayList.iterator();
    boolean bool = false;
    while (localIterator.hasNext()) {
      bool |= f(localIterator.next());
    }
    if (bool) {
      a();
    }
  }
  
  private final boolean f(Object paramObject)
  {
    if ((i(paramObject) == null) && (g(paramObject) < 0))
    {
      int i1;
      if (d() == paramObject)
      {
        i1 = 1;
        if (i1 == 0) {
          break label77;
        }
      }
      label77:
      Locale localLocale1;
      Object[] arrayOfObject1;
      for (Object localObject = "DEFAULT_ROUTE";; localObject = String.format(localLocale1, "ROUTE_%08x", arrayOfObject1))
      {
        if (b((String)localObject) >= 0) {
          break label115;
        }
        aby localaby = new aby(paramObject, (String)localObject);
        a(localaby);
        this.n.add(localaby);
        return true;
        i1 = 0;
        break;
        localLocale1 = Locale.US;
        arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(j(paramObject).hashCode());
      }
      label115:
      for (int i2 = 2;; i2++)
      {
        Locale localLocale2 = Locale.US;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = localObject;
        arrayOfObject2[1] = Integer.valueOf(i2);
        String str = String.format(localLocale2, "%s_%d", arrayOfObject2);
        if (b(str) < 0)
        {
          localObject = str;
          break;
        }
      }
    }
    return false;
  }
  
  private static abz i(Object paramObject)
  {
    Object localObject = ((MediaRouter.RouteInfo)paramObject).getTag();
    if ((localObject instanceof abz)) {
      return (abz)localObject;
    }
    return null;
  }
  
  private String j(Object paramObject)
  {
    Context localContext = this.a;
    CharSequence localCharSequence = ((MediaRouter.RouteInfo)paramObject).getName(localContext);
    if (localCharSequence != null) {
      return localCharSequence.toString();
    }
    return "";
  }
  
  public final aaj a(String paramString)
  {
    int i1 = b(paramString);
    if (i1 >= 0) {
      return new abx(this, ((aby)this.n.get(i1)).a);
    }
    return null;
  }
  
  protected final void a()
  {
    aal localaal = new aal();
    int i1 = this.n.size();
    for (int i2 = 0; i2 < i1; i2++) {
      localaal.a(((aby)this.n.get(i2)).c);
    }
    a(localaal.a());
  }
  
  public final void a(aay paramaay)
  {
    aax localaax = paramaay.a;
    aao.a();
    if (localaax.a != this)
    {
      Object localObject1 = this.i;
      Object localObject2 = this.s;
      MediaRouter.UserRouteInfo localUserRouteInfo = ((MediaRouter)localObject1).createUserRoute((MediaRouter.RouteCategory)localObject2);
      abz localabz = new abz(paramaay, localUserRouteInfo);
      ((MediaRouter.RouteInfo)localUserRouteInfo).setTag(localabz);
      Object localObject3 = this.r;
      ((MediaRouter.UserRouteInfo)localUserRouteInfo).setVolumeCallback((MediaRouter.VolumeCallback)localObject3);
      a(localabz);
      this.t.add(localabz);
      ((MediaRouter)this.i).addUserRoute((MediaRouter.UserRouteInfo)localUserRouteInfo);
    }
    int i1;
    do
    {
      return;
      i1 = g(((MediaRouter)this.i).getSelectedRoute(8388611));
    } while ((i1 < 0) || (!((aby)this.n.get(i1)).b.equals(paramaay.b)));
    aao.a();
    aao.b.a(paramaay, 3);
  }
  
  protected void a(aby paramaby, aad paramaad)
  {
    int i1 = ((MediaRouter.RouteInfo)paramaby.a).getSupportedTypes();
    if ((i1 & 0x1) != 0) {
      paramaad.a(o);
    }
    if ((i1 & 0x2) != 0) {
      paramaad.a(p);
    }
    int i2 = ((MediaRouter.RouteInfo)paramaby.a).getPlaybackType();
    paramaad.a.putInt("playbackType", i2);
    int i3 = ((MediaRouter.RouteInfo)paramaby.a).getPlaybackStream();
    paramaad.a.putInt("playbackStream", i3);
    int i4 = ((MediaRouter.RouteInfo)paramaby.a).getVolume();
    paramaad.a.putInt("volume", i4);
    int i5 = ((MediaRouter.RouteInfo)paramaby.a).getVolumeMax();
    paramaad.a.putInt("volumeMax", i5);
    int i6 = ((MediaRouter.RouteInfo)paramaby.a).getVolumeHandling();
    paramaad.a.putInt("volumeHandling", i6);
  }
  
  protected void a(abz paramabz)
  {
    Object localObject1 = paramabz.b;
    String str = paramabz.a.d;
    ((MediaRouter.UserRouteInfo)localObject1).setName(str);
    Object localObject2 = paramabz.b;
    int i1 = paramabz.a.i;
    ((MediaRouter.UserRouteInfo)localObject2).setPlaybackType(i1);
    Object localObject3 = paramabz.b;
    int i2 = paramabz.a.j;
    ((MediaRouter.UserRouteInfo)localObject3).setPlaybackStream(i2);
    Object localObject4 = paramabz.b;
    int i3 = paramabz.a.l;
    ((MediaRouter.UserRouteInfo)localObject4).setVolume(i3);
    Object localObject5 = paramabz.b;
    int i4 = paramabz.a.m;
    ((MediaRouter.UserRouteInfo)localObject5).setVolumeMax(i4);
    Object localObject6 = paramabz.b;
    int i5 = paramabz.a.k;
    ((MediaRouter.UserRouteInfo)localObject6).setVolumeHandling(i5);
  }
  
  public final void a(Object paramObject)
  {
    if (paramObject != ((MediaRouter)this.i).getSelectedRoute(8388611)) {}
    aay localaay1;
    do
    {
      int i1;
      do
      {
        return;
        abz localabz = i(paramObject);
        if (localabz != null)
        {
          aay localaay2 = localabz.a;
          aao.a();
          aao.b.a(localaay2, 3);
          return;
        }
        i1 = g(paramObject);
      } while (i1 < 0);
      aby localaby = (aby)this.n.get(i1);
      localaay1 = this.q.a(localaby.b);
    } while (localaay1 == null);
    aao.a();
    aao.b.a(localaay1, 3);
  }
  
  public final void a(Object paramObject, int paramInt)
  {
    abz localabz = i(paramObject);
    if (localabz != null) {
      localabz.a.a(paramInt);
    }
  }
  
  protected void b()
  {
    if (this.m)
    {
      this.m = false;
      Object localObject3 = this.i;
      Object localObject4 = this.j;
      ((MediaRouter)localObject3).removeCallback((MediaRouter.Callback)localObject4);
    }
    if (this.k != 0)
    {
      this.m = true;
      Object localObject1 = this.i;
      int i1 = this.k;
      Object localObject2 = this.j;
      ((MediaRouter)localObject1).addCallback(i1, (MediaRouter.Callback)localObject2);
    }
  }
  
  public final void b(aae paramaae)
  {
    int i1;
    boolean bool;
    if (paramaae != null)
    {
      paramaae.a();
      aam localaam = paramaae.b;
      localaam.a();
      List localList = localaam.b;
      int i2 = localList.size();
      int i3 = 0;
      i1 = 0;
      if (i3 < i2)
      {
        String str = (String)localList.get(i3);
        int i4;
        if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
          i4 = i1 | 0x1;
        }
        for (;;)
        {
          i3++;
          i1 = i4;
          break;
          if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
            i4 = i1 | 0x2;
          } else {
            i4 = 0x800000 | i1;
          }
        }
      }
      bool = paramaae.a.getBoolean("activeScan");
    }
    for (;;)
    {
      if ((this.k != i1) || (this.l != bool))
      {
        this.k = i1;
        this.l = bool;
        b();
        e();
      }
      return;
      bool = false;
      i1 = 0;
    }
  }
  
  public final void b(aay paramaay)
  {
    aax localaax = paramaay.a;
    aao.a();
    if (localaax.a != this)
    {
      int i1 = e(paramaay);
      if (i1 >= 0)
      {
        abz localabz = (abz)this.t.remove(i1);
        ((MediaRouter.RouteInfo)localabz.b).setTag(null);
        ((MediaRouter.UserRouteInfo)localabz.b).setVolumeCallback((MediaRouter.VolumeCallback)null);
        Object localObject1 = this.i;
        Object localObject2 = localabz.b;
        ((MediaRouter)localObject1).removeUserRoute((MediaRouter.UserRouteInfo)localObject2);
      }
    }
  }
  
  public final void b(Object paramObject)
  {
    if (f(paramObject)) {
      a();
    }
  }
  
  public final void b(Object paramObject, int paramInt)
  {
    abz localabz = i(paramObject);
    if (localabz != null) {
      localabz.a.b(paramInt);
    }
  }
  
  protected Object c()
  {
    return new aba(this);
  }
  
  public final void c(aay paramaay)
  {
    aax localaax = paramaay.a;
    aao.a();
    if (localaax.a != this)
    {
      int i1 = e(paramaay);
      if (i1 >= 0) {
        a((abz)this.t.get(i1));
      }
    }
  }
  
  public final void c(Object paramObject)
  {
    if (i(paramObject) == null)
    {
      int i1 = g(paramObject);
      if (i1 >= 0)
      {
        this.n.remove(i1);
        a();
      }
    }
  }
  
  protected Object d()
  {
    if (this.v == null) {
      this.v = new abb();
    }
    return this.v.a(this.i);
  }
  
  public final void d(aay paramaay)
  {
    if (!paramaay.a()) {}
    int i1;
    do
    {
      int i2;
      do
      {
        return;
        aax localaax = paramaay.a;
        aao.a();
        if (localaax.a == this) {
          break;
        }
        i2 = e(paramaay);
      } while (i2 < 0);
      h(((abz)this.t.get(i2)).b);
      return;
      i1 = b(paramaay.b);
    } while (i1 < 0);
    h(((aby)this.n.get(i1)).a);
  }
  
  public final void d(Object paramObject)
  {
    if (i(paramObject) == null)
    {
      int i1 = g(paramObject);
      if (i1 >= 0)
      {
        a((aby)this.n.get(i1));
        a();
      }
    }
  }
  
  public final void e(Object paramObject)
  {
    if (i(paramObject) == null)
    {
      int i1 = g(paramObject);
      if (i1 >= 0)
      {
        aby localaby = (aby)this.n.get(i1);
        int i2 = ((MediaRouter.RouteInfo)paramObject).getVolume();
        if (i2 != localaby.c.a.getInt("volume"))
        {
          aad localaad = new aad(localaby.c);
          localaad.a.putInt("volume", i2);
          localaby.c = localaad.a();
          a();
        }
      }
    }
  }
  
  protected final int g(Object paramObject)
  {
    int i1 = this.n.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((aby)this.n.get(i2)).a == paramObject) {
        return i2;
      }
    }
    return -1;
  }
  
  protected void h(Object paramObject)
  {
    if (this.u == null) {
      this.u = new abc();
    }
    abc localabc = this.u;
    MediaRouter localMediaRouter = (MediaRouter)this.i;
    MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramObject;
    if (((0x800000 & localRouteInfo.getSupportedTypes()) == 0) && (localabc.a != null)) {}
    try
    {
      Method localMethod = localabc.a;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(8388611);
      arrayOfObject[1] = localRouteInfo;
      localMethod.invoke(localMediaRouter, arrayOfObject);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localMediaRouter.selectRoute(8388611, localRouteInfo);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label96:
      break label96;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abw
 * JD-Core Version:    0.7.0.1
 */