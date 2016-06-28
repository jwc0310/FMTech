import android.content.Context;
import android.os.SystemClock;
import android.util.Log;

public final class kkn
{
  private Context a;
  private int b;
  private String c;
  private iyq d;
  private int e;
  private int f;
  private int g;
  private int h = 5000;
  private kpz i;
  
  public kkn(Context paramContext, int paramInt1, iyq paramiyq, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramContext;
    this.b = paramInt1;
    this.d = paramiyq;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramInt4;
    this.c = ((giz)mbb.a(paramContext, giz.class)).a(paramInt1).b("account_name");
  }
  
  public final hae a()
  {
    iyk localiyk = ((iyl)mbb.a(this.a, iyl.class)).a(this.b);
    int i1;
    long l1;
    hgs localhgs;
    label129:
    long l3;
    int i2;
    Exception localException2;
    label192:
    Exception localException1;
    int j;
    if (localiyk != null)
    {
      boolean bool = ((ixf)mbb.a(this.a, ixf.class)).a();
      if (localiyk.a() > 0)
      {
        i1 = 1;
        l1 = localiyk.a(this.d);
        this.i = new kpz(10, SystemClock.elapsedRealtime());
        this.i.d = this.c;
        if ((!bool) || (i1 != 0)) {
          break label364;
        }
        localhgs = (hgs)mbb.a(this.a, hgs.class);
        long l2 = localhgs.a();
        l3 = localhgs.a() - l2;
        if (localiyk.b(l1) != null) {
          break label277;
        }
        if (Log.isLoggable("NetworkRequestProcessor", 4)) {
          new StringBuilder(53).append("The item cleared the queue in ").append(l3).append("ms.");
        }
        i2 = 1;
        localException2 = null;
        kpz localkpz = this.i;
        localkpz.a();
        localkpz.b(this.a);
        localException1 = localException2;
        j = i2;
      }
    }
    for (;;)
    {
      int k;
      label225:
      int m;
      label233:
      Context localContext;
      int n;
      if (localException1 != null)
      {
        k = 1;
        if (k == 0) {
          break label379;
        }
        m = 0;
        localContext = this.a;
        if (k == 0) {
          break label387;
        }
        n = this.f;
      }
      for (;;)
      {
        return new hae(m, localException1, localContext.getApplicationContext().getString(n));
        i1 = 0;
        break;
        label277:
        iyr localiyr = localiyk.c(l1);
        if (localiyr.a != null) {}
        for (int i3 = 1;; i3 = 0)
        {
          if (i3 == 0) {
            break label331;
          }
          localException2 = localiyr.a;
          i2 = -1;
          localiyk.a(l1);
          break;
        }
        label331:
        if (l3 > this.h)
        {
          i2 = 2;
          localException2 = null;
          break label192;
        }
        localhgs.a(100L);
        break label129;
        label364:
        i2 = 2;
        localException2 = null;
        break label192;
        k = 0;
        break label225;
        label379:
        m = 200;
        break label233;
        label387:
        if (j == 2) {
          n = this.g;
        } else {
          n = this.e;
        }
      }
      j = 1;
      localException1 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkn
 * JD-Core Version:    0.7.0.1
 */