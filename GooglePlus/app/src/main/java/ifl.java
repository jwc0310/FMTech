import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.HttpUrlRequest;

public final class ifl
  extends kbf
  implements hta, ifj
{
  ifv b;
  private final igo f;
  private final int g;
  private final HashMap<kba, kaz> h = new HashMap();
  private final HashSet<ife> i = new HashSet();
  private final kq<kba, ife> j;
  private final igb k;
  private long l;
  private final iab m;
  private final iab n;
  private final int o;
  private final ifc[] p;
  private final iyf q;
  private float r;
  private int s;
  private int t;
  private int u;
  private int v;
  
  protected ifl(Context paramContext, igm paramigm)
  {
    super(paramContext);
    this.o = efj.M(paramContext);
    igk localigk1 = paramigm.b;
    this.m = new iab(paramContext, localigk1.a, localigk1.b, localigk1.c, localigk1.d, localigk1.e);
    igk localigk2 = paramigm.c;
    this.n = new iab(paramContext, localigk2.a, localigk2.b, localigk2.c, localigk2.d, localigk2.e);
    this.f = paramigm.a;
    this.g = ((int)(0.75D * this.f.a));
    this.j = new ifn(this, this.f.a);
    DisplayMetrics localDisplayMetrics = efj.K(paramContext);
    this.r = Math.min(240.0F / localDisplayMetrics.xdpi, 1.0F);
    this.s = Math.max(localDisplayMetrics.heightPixels, localDisplayMetrics.widthPixels);
    if (this.s == 0) {
      this.s = 640;
    }
    this.t = ((int)(0.2F * this.s * this.r));
    this.u = ((int)(0.5F * this.s));
    igb localigb;
    if (Build.VERSION.SDK_INT < 11) {
      localigb = null;
    }
    for (;;)
    {
      this.k = localigb;
      List localList = mbb.c(paramContext, ifc.class);
      this.p = ((ifc[])localList.toArray(new ifc[localList.size()]));
      Arrays.sort(this.p, new ifm(this));
      int i1 = paramContext.getApplicationContext().getResources().getInteger(efj.MN);
      if (this.o >= 256) {
        i1 = 16777216;
      }
      this.v = i1;
      this.q = ((iyf)mbb.b(paramContext, iyf.class));
      if (Log.isLoggable("ImageResourceManager", 3)) {
        s();
      }
      mbb localmbb = mbb.b(paramContext);
      localmbb.b(hta.class, this);
      if (this.k != null) {
        localmbb.b(hta.class, this.k);
      }
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      ifa localifa = new ifa();
      paramContext.getApplicationContext().registerReceiver(localifa, localIntentFilter);
      paramContext.registerComponentCallbacks(new ifk(paramContext));
      return;
      localigb = new igb(this.f.b);
      if (this.f.e)
      {
        this.b = new ifv(this.f, localigb, this.u, this.t);
        ifo localifo = new ifo(this);
        efj.m().post(localifo);
      }
    }
  }
  
  private final void s()
  {
    ifp localifp = new ifp(this, new StringWriter());
    a(localifp);
    efj.a(4, "ImageResourceManager", localifp.toString());
  }
  
  public final Object a(int paramInt1, int paramInt2)
  {
    if (this.k != null)
    {
      Bitmap localBitmap = this.k.a(paramInt1, paramInt2, iga.b);
      if (localBitmap == null) {
        localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      }
      return new iey(localBitmap, paramInt1, paramInt2);
    }
    return Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
  }
  
  public final Object a(ife paramife, ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    for (int i1 = 0; i1 < this.p.length; i1++)
    {
      Object localObject = this.p[i1].a(paramife, paramByteBuffer, paramBoolean);
      if (localObject != null) {
        return localObject;
      }
    }
    return null;
  }
  
  public final String a()
  {
    return "ImageResourceManager";
  }
  
  public final kaz a(kba paramkba)
  {
    ife localife = (ife)this.h.get(paramkba);
    if (localife != null) {
      return localife;
    }
    return (kaz)this.j.a(paramkba);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble)
  {
    if ((paramInt3 <= 0) || (this.k == null)) {
      return;
    }
    if ((paramDouble < 0.0D) || (paramDouble > 1.0D)) {
      throw new IllegalArgumentException("maxPercentOfPool must be between 0.0 and 1.0.");
    }
    int i1 = (int)Math.floor(paramDouble * this.f.b / (paramInt1 * paramInt2 << 2));
    this.k.a(paramInt1, paramInt2, Math.min(paramInt3, i1));
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt2, String paramString3)
  {
    if (this.q != null) {
      this.q.a(paramInt1, paramString1, paramString2, paramLong1, paramLong2, paramLong3, paramLong4, paramInt2, paramString3);
    }
  }
  
  public final void a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return;
    }
    if (this.k != null)
    {
      if (this.b != null)
      {
        ifv localifv = this.b;
        if ((localifv.b) && (localifv.a.d() > 0.85F)) {
          localifv.b = false;
        }
      }
      this.k.a(paramBitmap);
      return;
    }
    paramBitmap.recycle();
  }
  
  public final void a(ife paramife)
  {
    synchronized (this.i)
    {
      this.i.add(paramife);
      return;
    }
  }
  
  public final void a(PrintWriter paramPrintWriter)
  {
    Map localMap = this.j.f();
    int i1 = this.f.a;
    int i2 = this.j.a();
    int i3 = localMap.size();
    int i4 = this.j.d();
    int i5 = this.j.b();
    int i6 = this.j.c();
    int i7 = this.j.e();
    paramPrintWriter.println(186 + "Image cache size: " + i1 + "; cached size: " + i2 + "; cached bitmaps: " + i3 + "; put count: " + i4 + "; hit count: " + i5 + "; miss count: " + i6 + "; eviction count: " + i7);
    if (localMap.isEmpty()) {
      paramPrintWriter.println("Image cache is empty");
    }
    for (;;)
    {
      synchronized (this.i)
      {
        if (this.i.isEmpty()) {
          break;
        }
        Iterator localIterator3 = this.i.iterator();
        if (!localIterator3.hasNext()) {
          break;
        }
        String str2 = String.valueOf((ife)localIterator3.next());
        paramPrintWriter.println(13 + String.valueOf(str2).length() + "Downloading: " + str2);
      }
      Iterator localIterator1 = localMap.keySet().iterator();
      while (localIterator1.hasNext())
      {
        kba localkba = (kba)localIterator1.next();
        int i8 = ((ife)localMap.get(localkba)).l();
        String str1 = String.valueOf(localkba);
        paramPrintWriter.println(27 + String.valueOf(str1).length() + "Cached: " + i8 + " bytes, " + str1);
      }
    }
    if (this.h.isEmpty()) {
      paramPrintWriter.println("No active resources");
    }
    while (efj.j())
    {
      new ifq(this).execute(new Void[0]);
      return;
      paramPrintWriter.println("Active resources");
      Iterator localIterator2 = this.h.values().iterator();
      while (localIterator2.hasNext()) {
        efj.a(4, "ImageResourceManager", ((kaz)localIterator2.next()).toString());
      }
    }
    b(paramPrintWriter);
  }
  
  public final void a(kaz paramkaz)
  {
    if (!this.h.containsKey(paramkaz.o))
    {
      String str4 = String.valueOf(paramkaz.o);
      throw new IllegalStateException(24 + String.valueOf(str4).length() + "Resource is not active: " + str4);
    }
    ife localife = (ife)paramkaz;
    String str2;
    switch (localife.q)
    {
    case 2: 
    default: 
      str2 = String.valueOf(kaz.c(paramkaz.q));
      if (str2.length() == 0) {
        break;
      }
    }
    for (String str3 = "Illegal resource state: ".concat(str2);; str3 = new String("Illegal resource state: "))
    {
      throw new IllegalStateException(str3);
      if (localife.t)
      {
        String str1 = String.valueOf(localife.o);
        new StringBuilder(23 + String.valueOf(str1).length()).append("Requesting image load: ").append(str1);
      }
      localife.q = 2;
      if (this.e == null)
      {
        this.e = new kbl();
        this.e.start();
      }
      kbl localkbl = this.e;
      localkbl.a.sendMessage(localkbl.a.obtainMessage(0, paramkaz));
      return;
    }
  }
  
  public final void a(kaz paramkaz, int paramInt1, int paramInt2)
  {
    if ((!(paramkaz instanceof ife)) || (paramInt1 != 4))
    {
      super.a(paramkaz, paramInt1, paramInt2);
      return;
    }
    if (((ife)paramkaz).c.h <= 3) {}
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      if (paramkaz.t)
      {
        String str = String.valueOf(paramkaz.o);
        new StringBuilder(21 + String.valueOf(str).length()).append("Retrying image load: ").append(str);
      }
      paramkaz.q = 2;
      if (this.e == null)
      {
        this.e = new kbl();
        this.e.start();
      }
      kbl localkbl = this.e;
      localkbl.a.sendMessage(localkbl.a.obtainMessage(0, paramkaz));
      return;
    }
    paramkaz.q = 5;
    super.a(paramkaz, 5, paramInt2);
  }
  
  public final void a(kaz paramkaz, kbb paramkbb)
  {
    efj.k();
    kba localkba = paramkaz.o;
    kaz localkaz1 = (kaz)this.h.get(localkba);
    if (localkaz1 != null)
    {
      if (localkaz1 != paramkaz)
      {
        String str5 = String.valueOf(localkba);
        throw new IllegalStateException(80 + String.valueOf(str5).length() + "Duplicate resource: " + str5 + ". Check getManagedResource() prior to calling loadResource. ");
      }
      if (paramkaz.t)
      {
        String str4 = String.valueOf(localkba);
        new StringBuilder(25 + String.valueOf(str4).length()).append("Adding another consumer: ").append(str4);
      }
      paramkaz.a(paramkbb);
      return;
    }
    kaz localkaz2 = (kaz)this.j.a(localkba);
    if (localkaz2 != null)
    {
      if (localkaz2 != paramkaz)
      {
        String str3 = String.valueOf(localkba);
        throw new IllegalStateException(80 + String.valueOf(str3).length() + "Duplicate resource: " + str3 + ". Check getManagedResource() prior to calling loadResource. ");
      }
      if (paramkaz.t)
      {
        String str2 = String.valueOf(localkba);
        new StringBuilder(12 + String.valueOf(str2).length()).append("Activating: ").append(str2);
      }
      this.j.b(localkba);
      this.h.put(localkba, paramkaz);
      paramkaz.a(paramkbb);
      return;
    }
    this.h.put(localkba, paramkaz);
    if (paramkaz.t)
    {
      String str1 = String.valueOf(localkba);
      new StringBuilder(14 + String.valueOf(str1).length()).append("loadResource: ").append(str1);
    }
    paramkaz.a(paramkbb);
  }
  
  public final Bitmap b(int paramInt1, int paramInt2)
  {
    igb localigb = this.k;
    Bitmap localBitmap = null;
    if (localigb != null) {
      localBitmap = this.k.a(paramInt1, paramInt2, iga.a);
    }
    if (localBitmap == null) {
      localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    }
    return localBitmap;
  }
  
  public final String b()
  {
    return "Prints the entire contents of the resource manager to a String.";
  }
  
  public final void b(ife paramife)
  {
    synchronized (this.i)
    {
      this.i.remove(paramife);
      return;
    }
  }
  
  final void b(PrintWriter paramPrintWriter)
  {
    long l1 = this.m.c();
    long l2 = this.m.e();
    long l3 = Math.max(0L, l1 - l2);
    String str1 = String.valueOf(mfx.a(l1));
    String str2 = String.valueOf(mfx.a(l2));
    String str3 = String.valueOf(mfx.a(l3));
    paramPrintWriter.println(39 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + "Disk cache total size: " + str1 + "; used: " + str2 + "; free: " + str3);
    long l4 = this.n.d();
    long l5 = this.n.e();
    long l6 = Math.max(0L, l4 - l5);
    String str4 = String.valueOf(mfx.a(l4));
    String str5 = String.valueOf(mfx.a(l5));
    String str6 = String.valueOf(mfx.a(l6));
    paramPrintWriter.println(44 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + "Long-term cache total size: " + str4 + "; used: " + str5 + "; free: " + str6);
  }
  
  public final void b(kaz paramkaz)
  {
    ife localife = (ife)paramkaz;
    kba localkba = (kba)localife.o;
    if (localife.t)
    {
      String str = String.valueOf(localkba);
      new StringBuilder(29 + String.valueOf(str).length()).append("Deactivating image resource: ").append(str);
    }
    ift localift;
    if (localife.q == 2)
    {
      localife.q = 7;
      localift = localife.c;
      if (!localift.a.u) {}
    }
    for (;;)
    {
      int i1;
      try
      {
        HttpUrlRequest localHttpUrlRequest = localift.j;
        if (localHttpUrlRequest != null) {
          localHttpUrlRequest.g();
        }
        this.h.remove(localkba);
        b(localife);
        if (localife.q == 5)
        {
          i1 = 0;
          if ((i1 == 0) || (localife.l() >= this.g)) {
            break;
          }
          if ((this.l == 0L) || (this.l < System.currentTimeMillis()))
          {
            this.l = 0L;
            this.j.a(localkba, localife);
          }
          return;
        }
      }
      finally {}
      if ((0xA & ((kba)localife.o).j) != 0) {
        i1 = 0;
      } else {
        i1 = 1;
      }
    }
    localife.i();
  }
  
  public final int c()
  {
    return this.v;
  }
  
  public final igb d()
  {
    return this.k;
  }
  
  public final iab e()
  {
    return this.m;
  }
  
  public final iab f()
  {
    return this.n;
  }
  
  public final int g()
  {
    return this.s;
  }
  
  public final int h()
  {
    return this.t;
  }
  
  public final int i()
  {
    return this.u;
  }
  
  public final Bitmap.Config j()
  {
    if (this.o < 64) {
      return Bitmap.Config.ARGB_4444;
    }
    return Bitmap.Config.ARGB_8888;
  }
  
  public final long k()
  {
    return this.f.c;
  }
  
  public final long l()
  {
    return this.f.d;
  }
  
  public final void m()
  {
    if (this.h.isEmpty()) {}
    for (;;)
    {
      return;
      if (efj.J(this.a_))
      {
        Iterator localIterator = this.h.values().iterator();
        while (localIterator.hasNext())
        {
          kaz localkaz = (kaz)localIterator.next();
          if (localkaz.q == 4)
          {
            a(localkaz, 2);
            if (this.e == null)
            {
              this.e = new kbl();
              this.e.start();
            }
            kbl localkbl = this.e;
            localkbl.a.sendMessage(localkbl.a.obtainMessage(0, localkaz));
          }
        }
      }
    }
  }
  
  public final float n()
  {
    return this.r;
  }
  
  public final void o()
  {
    this.j.a(-1);
  }
  
  public final void p()
  {
    this.j.a(-1);
    this.l = (2000L + System.currentTimeMillis());
    if (this.k != null) {
      this.k.c();
    }
  }
  
  public final void q()
  {
    if (!this.h.isEmpty()) {
      s();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ifl
 * JD-Core Version:    0.7.0.1
 */