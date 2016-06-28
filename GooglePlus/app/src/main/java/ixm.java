import android.content.Context;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

final class ixm
  implements ixs
{
  private static final mcq d = new mcq("visual_debug_network_req", true);
  final Context a;
  fsc b;
  long c;
  private final List<ixt> e = Collections.synchronizedList(new LinkedList());
  private final ixo f;
  private int g;
  private fux h;
  private fus i;
  private int j = 0;
  private double k = 0.0D;
  private double l;
  private long m = 0L;
  private long n = 0L;
  private long o = 0L;
  
  ixm(Context paramContext)
  {
    this.a = paramContext;
    this.f = new ixg(paramContext);
  }
  
  private final void a(double paramDouble1, double paramDouble2)
  {
    try
    {
      this.l += paramDouble2 * (paramDouble1 - this.l);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private final void a(long paramLong)
  {
    for (;;)
    {
      try
      {
        if (this.k == 0.0D)
        {
          List localList = ((giz)mbb.a(this.a, giz.class)).a();
          hyi localhyi = (hyi)mbb.a(this.a, hyi.class);
          int i1 = 0;
          if (i1 < localList.size())
          {
            if (localhyi.b(ixh.a, ((Integer)localList.get(i1)).intValue()))
            {
              i2 = 1;
              if (i2 != 0)
              {
                d();
                ((fvd)mbb.a(this.a, fvd.class)).a().a(this.a, this.b).a(new ixn(this));
              }
              this.l = paramLong;
              this.k = (1.0D + this.k);
              e();
              return;
            }
            i1++;
            continue;
          }
          int i2 = 0;
          continue;
        }
        if (this.k <= 5.0D)
        {
          double d2 = 1.0D / this.k;
          a(paramLong, d2);
          this.k = (1.0D + this.k);
          continue;
        }
        d1 = this.l - paramLong;
      }
      finally {}
      double d1;
      if (d1 >= 0.0D)
      {
        if (d1 > 1500000.0D)
        {
          a(paramLong, 0.5D);
          continue;
        }
        if (d1 > 400000.0D)
        {
          a(paramLong, 0.3D);
          continue;
        }
        if (d1 > 100000.0D)
        {
          a(paramLong, 0.2D);
          continue;
        }
      }
      a(paramLong, 0.1D);
    }
  }
  
  private final void b(ixt paramixt)
  {
    for (;;)
    {
      try
      {
        boolean bool = Log.isLoggable("NetworkSpeedPredictor", 3);
        if (!bool) {
          return;
        }
        Locale localLocale = Locale.getDefault();
        Object[] arrayOfObject = new Object[9];
        switch (paramixt.a)
        {
        case 1: 
          arrayOfObject[0] = str1;
          arrayOfObject[1] = Integer.valueOf(paramixt.b.length);
          arrayOfObject[2] = Double.valueOf((paramixt.f - paramixt.e) / 1000.0D);
          arrayOfObject[3] = Long.valueOf(paramixt.e);
          arrayOfObject[4] = Long.valueOf(paramixt.f);
          arrayOfObject[5] = Long.valueOf(paramixt.h);
          arrayOfObject[6] = Long.valueOf((paramixt.h / ((paramixt.f - paramixt.e) / 1000.0D)));
          arrayOfObject[7] = Double.valueOf(this.l);
          switch (this.j)
          {
          case -2: 
            arrayOfObject[8] = str2;
            String.format(localLocale, "Type: %s (%d), Time: %f (start: %d, end: %d), Bytes down %d, New network speed: %d,Average network speed: %f, Network classification: %s", arrayOfObject);
            continue;
            str1 = "image download";
          }
          break;
        }
      }
      finally {}
      continue;
      String str2 = "Very low speed";
      continue;
      String str1 = "unknown";
      continue;
      str2 = "Unknown";
      continue;
      str1 = "image upload";
      continue;
      str1 = "remote api call";
      continue;
      str1 = "video download";
      continue;
      str1 = "video upload";
      continue;
      str2 = "Unknown speed";
      continue;
      str2 = "High speed";
      continue;
      str2 = "Average speed";
      continue;
      str2 = "Low speed";
    }
  }
  
  private final fuw c()
  {
    if (this.h == null)
    {
      this.h = ((fux)mbb.a(this.a, fux.class));
      this.i = ((fus)mbb.a(this.a, fus.class));
    }
    d();
    return this.h.a();
  }
  
  private final void d()
  {
    if (this.b == null)
    {
      localfse = (fse)mbb.a(this.a, fse.class);
      localfuv = (fuv)mbb.a(this.a, fuv.class);
      localfut = (fut)mbb.a(this.a, fut.class);
      this.b = localfse.a(this.a.getApplicationContext()).a(localfuv).a(localfut).a();
      this.b.b();
    }
    while (this.b.d())
    {
      fse localfse;
      fuv localfuv;
      fut localfut;
      return;
    }
    this.b.b();
  }
  
  /* Error */
  private final void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 79	ixm:l	D
    //   6: ldc2_w 277
    //   9: dcmpl
    //   10: ifle +21 -> 31
    //   13: iconst_2
    //   14: istore_2
    //   15: iload_2
    //   16: aload_0
    //   17: getfield 60	ixm:j	I
    //   20: if_icmpeq +8 -> 28
    //   23: aload_0
    //   24: iload_2
    //   25: putfield 60	ixm:j	I
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: aload_0
    //   32: getfield 79	ixm:l	D
    //   35: ldc2_w 279
    //   38: dcmpl
    //   39: ifle +8 -> 47
    //   42: iconst_1
    //   43: istore_2
    //   44: goto -29 -> 15
    //   47: aload_0
    //   48: getfield 79	ixm:l	D
    //   51: dstore_3
    //   52: dload_3
    //   53: ldc2_w 281
    //   56: dcmpl
    //   57: ifle +8 -> 65
    //   60: iconst_m1
    //   61: istore_2
    //   62: goto -47 -> 15
    //   65: bipush 254
    //   67: istore_2
    //   68: goto -53 -> 15
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	ixm
    //   71	4	1	localObject	Object
    //   14	54	2	i1	int
    //   51	2	3	d1	double
    // Exception table:
    //   from	to	target	type
    //   2	13	71	finally
    //   15	28	71	finally
    //   31	42	71	finally
    //   47	52	71	finally
  }
  
  private final void f()
  {
    int i1 = 0;
    for (;;)
    {
      synchronized (this.e)
      {
        if (this.e.isEmpty()) {
          return;
        }
        ixt localixt1 = (ixt)this.e.get(0);
        if ((localixt1 == null) || (!localixt1.a(7200))) {
          break label274;
        }
        i2 = 1;
        if (this.e.size() >= 25) {
          i2 = 1;
        }
        if (i2 != 0)
        {
          this.n = 0L;
          this.o = 0L;
          this.m = 0L;
          int i3 = this.e.size();
          if (i1 < i3)
          {
            ixt localixt2 = (ixt)this.e.get(i1);
            if (localixt2.a(7200)) {
              break label280;
            }
            this.o += localixt2.g;
            this.n += localixt2.h;
            this.m += localixt2.f - localixt2.d;
            break label280;
          }
          if (this.m == 0L) {
            break label286;
          }
          if (this.n == 0L)
          {
            break label286;
            Object localObject2;
            if (localObject2 > 0L) {
              this.f.a(localObject2);
            }
            this.e.clear();
          }
        }
        else
        {
          return;
        }
      }
      double d1 = this.n;
      long l2 = this.m;
      long l1 = (d1 / (l2 / 1000.0D));
      continue;
      label274:
      int i2 = 0;
      continue;
      label280:
      i1++;
      continue;
      label286:
      l1 = 0L;
    }
  }
  
  final int a()
  {
    try
    {
      double d1 = this.l;
      int i1 = (int)d1;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void a(fuy paramfuy)
  {
    for (;;)
    {
      long l1;
      try
      {
        double d1 = this.k;
        if (d1 > 5.0D) {
          return;
        }
        l1 = paramfuy.a();
        if (l1 <= 0L)
        {
          if (!Log.isLoggable("NetworkSpeedPredictor", 3)) {
            continue;
          }
          new StringBuilder(61).append("Herrevad did not return a valid speed : ").append(l1).append(".");
          continue;
        }
        if (!Log.isLoggable("NetworkSpeedPredictor", 3)) {
          break label111;
        }
      }
      finally {}
      new StringBuilder(41).append("Herrevad returned : ").append(l1).append(".");
      label111:
      this.k = 6.0D;
      this.l = l1;
      this.c = l1;
      e();
    }
  }
  
  public final void a(ixt paramixt)
  {
    int i1;
    if (((paramixt.h != 0L) || (paramixt.g != 0L)) && (paramixt.d != paramixt.f))
    {
      i1 = 1;
      if (i1 == 0) {}
    }
    for (;;)
    {
      int i2;
      synchronized (this.e)
      {
        ListIterator localListIterator = this.e.listIterator();
        if (!localListIterator.hasNext()) {
          break label762;
        }
        ixt localixt = (ixt)localListIterator.next();
        if (localixt.d > paramixt.f) {
          break label762;
        }
        if (Math.max(paramixt.d, localixt.d) >= Math.min(paramixt.f, localixt.f)) {
          continue;
        }
        if (paramixt.d < localixt.d)
        {
          long l11 = localixt.d;
          localixt.d = paramixt.d;
          this.m += l11 - paramixt.d;
        }
        if (paramixt.f > localixt.f)
        {
          long l10 = localixt.f;
          localixt.f = paramixt.f;
          this.m += paramixt.f - l10;
        }
        localixt.g += paramixt.g;
        localixt.h += paramixt.h;
        i4 = 1;
        break label765;
        if (localListIterator.hasPrevious())
        {
          if (((ixt)localListIterator.previous()).d >= paramixt.d) {
            continue;
          }
          localListIterator.next();
        }
        localListIterator.add(paramixt);
        this.m += paramixt.f - paramixt.d;
        this.o += paramixt.g;
        this.n += paramixt.h;
        f();
        List localList1 = ((giz)mbb.a(this.a, giz.class)).a();
        hyi localhyi = (hyi)mbb.a(this.a, hyi.class);
        i2 = 0;
        if (i2 >= localList1.size()) {
          break label756;
        }
        long l9 = localhyi.c(ixh.b, ((Integer)localList1.get(i2)).intValue()).longValue();
        if (l9 != -1L)
        {
          i3 = (int)l9;
          if (i3 != -1)
          {
            long l3 = paramixt.h;
            long l4 = paramixt.g;
            if (l3 > 10000L)
            {
              this.g = (1 + this.g);
              if (this.g >= i3)
              {
                fuw localfuw2 = c();
                localfuw2.a(1000 * (int)(paramixt.f - paramixt.e)).b(l3);
                if (l4 < 1000L)
                {
                  long l7 = 1000L * (paramixt.e - paramixt.d);
                  long l8 = 1000L * paramixt.k;
                  localfuw2.a((int)(l7 - l8)).a("serverTime", String.valueOf(l8));
                }
                this.i.a().a(this.b, localfuw2);
                this.g = 0;
              }
            }
            if (l4 > 10000L)
            {
              fuw localfuw1 = c();
              long l5 = 1000 * (int)(paramixt.f - paramixt.e);
              long l6 = 1000L * paramixt.k;
              localfuw1.c(l4).a(l5 - l6).a("serverTime", String.valueOf(l6));
              this.i.a().a(this.b, localfuw1);
            }
          }
          if (paramixt.h > 15000L)
          {
            long l1 = paramixt.e;
            long l2 = paramixt.f;
            if (l1 != l2)
            {
              a((paramixt.h / ((l2 - l1) / 1000.0D)));
              b(paramixt);
            }
          }
          return;
          i1 = 0;
        }
      }
      i2++;
      continue;
      label756:
      int i3 = -1;
      continue;
      label762:
      int i4 = 0;
      label765:
      if (i4 != 0) {}
    }
  }
  
  final int b()
  {
    try
    {
      int i1 = this.j;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixm
 * JD-Core Version:    0.7.0.1
 */