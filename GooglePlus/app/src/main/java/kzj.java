import android.content.Context;
import android.database.sqlite.SQLiteDiskIOException;
import android.util.Log;
import java.io.IOException;

public final class kzj
  extends gzf
{
  public boolean a;
  private final int b;
  private final kcg c;
  private final kyn d;
  private final kzr l;
  private final int[] m;
  private final boolean n;
  
  public kzj(Context paramContext, int paramInt, boolean paramBoolean)
  {
    super("GetSquaresTask");
    this.b = paramInt;
    this.c = new kch().a(paramContext, this.b).a();
    this.d = ((kyn)mbb.a(paramContext, kyn.class));
    this.n = paramBoolean;
    int[] arrayOfInt;
    if (paramBoolean)
    {
      arrayOfInt = new int[3];
      arrayOfInt[0] = 1;
      arrayOfInt[1] = 2;
      arrayOfInt[2] = 3;
    }
    for (;;)
    {
      this.m = arrayOfInt;
      this.l = ((kzr)mbb.a(paramContext, kzr.class));
      return;
      arrayOfInt = new int[] { 1, 2 };
    }
  }
  
  private final hae f(Context paramContext)
  {
    kzi localkzi = new kzi(paramContext, this.c, this.m);
    localkzi.i();
    Object localObject1;
    Object localObject2;
    kyf[] arrayOfkyf1;
    if (!localkzi.n())
    {
      if (localkzi.x) {}
      ofg localofg;
      for (qat localqat = localkzi.w;; localqat = null)
      {
        localofg = ((muu)localqat).a;
        if (localofg != null) {
          break;
        }
        if (Log.isLoggable("GetSquaresTask", 6)) {
          Log.e("GetSquaresTask", "Got unexpected empty, but successful response from server.");
        }
        return new hae(false);
      }
      localObject1 = new kyf[0];
      if (localofg.c != null)
      {
        kyf[] arrayOfkyf3 = new kyf[localofg.c.length];
        for (int k = 0; k < arrayOfkyf3.length; k++) {
          arrayOfkyf3[k] = new kyf(localofg.c[k]);
        }
        localObject1 = arrayOfkyf3;
      }
      localObject2 = new kyf[0];
      if (localofg.a != null)
      {
        kyf[] arrayOfkyf2 = new kyf[localofg.a.length];
        for (int j = 0; j < arrayOfkyf2.length; j++) {
          arrayOfkyf2[j] = new kyf(localofg.a[j]);
        }
        localObject2 = arrayOfkyf2;
      }
      arrayOfkyf1 = new kyf[localofg.b.length];
      for (int i = 0; i < arrayOfkyf1.length; i++) {
        arrayOfkyf1[i] = new kyf(localofg.b[i]);
      }
    }
    try
    {
      this.d.a(this.b, (kyf[])localObject1, (kyf[])localObject2, arrayOfkyf1);
      return new hae(localkzi.o, localkzi.q, null);
    }
    catch (IOException localIOException)
    {
      return new hae(0, localIOException, null);
    }
    catch (SQLiteDiskIOException localSQLiteDiskIOException)
    {
      return new hae(0, localSQLiteDiskIOException, null);
    }
  }
  
  private final hae g(Context paramContext)
  {
    kzh localkzh = new kzh(paramContext, this.c, this.n);
    localkzh.e.i();
    localkzh.e.c("GetSquaresOperation");
    kyf[] arrayOfkyf1;
    label69:
    label82:
    label90:
    label98:
    kyf[] arrayOfkyf4;
    label115:
    label375:
    kyf[] arrayOfkyf5;
    if (!localkzh.e.n())
    {
      kyf[] arrayOfkyf2;
      kyf[] arrayOfkyf3;
      int i1;
      int i2;
      int i4;
      if (localkzh.e.n())
      {
        arrayOfkyf1 = null;
        if (!localkzh.e.n()) {
          break label217;
        }
        arrayOfkyf2 = null;
        if (!localkzh.e.n()) {
          break label288;
        }
        arrayOfkyf3 = null;
        if (arrayOfkyf2 != null) {
          break label359;
        }
        i1 = 0;
        if (arrayOfkyf3 != null) {
          break label367;
        }
        i2 = 0;
        int i3 = i1 + i2;
        arrayOfkyf4 = new kyf[i3];
        i4 = 0;
        if (i4 >= i3) {
          break label388;
        }
        if (i4 >= i1) {
          break label375;
        }
      }
      for (kyf localkyf = arrayOfkyf2[i4];; localkyf = arrayOfkyf3[(i4 - i1)])
      {
        arrayOfkyf4[i4] = localkyf;
        i4++;
        break label115;
        int i = localkzh.e.a(kzh.a);
        if (i == -1)
        {
          arrayOfkyf1 = null;
          break;
        }
        qyo localqyo = (qyo)localkzh.e.a(i, qyo.a);
        if (localqyo.b == null)
        {
          arrayOfkyf1 = null;
          break;
        }
        arrayOfkyf1 = kzh.a(localqyo.b.a);
        break;
        label217:
        int j = localkzh.e.a(kzh.b);
        if (j == -1)
        {
          arrayOfkyf2 = null;
          break label69;
        }
        qyq localqyq = (qyq)localkzh.e.a(j, qyq.a);
        if (localqyq.b == null)
        {
          arrayOfkyf2 = null;
          break label69;
        }
        arrayOfkyf2 = kzh.a(localqyq.b.a);
        break label69;
        label288:
        int k = localkzh.e.a(kzh.d);
        if (k == -1)
        {
          arrayOfkyf3 = null;
          break label82;
        }
        qzi localqzi = (qzi)localkzh.e.a(k, qzi.a);
        if (localqzi.b == null)
        {
          arrayOfkyf3 = null;
          break label82;
        }
        arrayOfkyf3 = kzh.a(localqzi.b.a);
        break label82;
        label359:
        i1 = arrayOfkyf2.length;
        break label90;
        label367:
        i2 = arrayOfkyf3.length;
        break label98;
      }
      label388:
      if ((!localkzh.e.n()) && (localkzh.f)) {
        break label451;
      }
      arrayOfkyf5 = null;
    }
    for (;;)
    {
      try
      {
        this.d.a(this.b, arrayOfkyf1, arrayOfkyf4, arrayOfkyf5);
        return new hae(localkzh.e.o, localkzh.e.q, null);
      }
      catch (IOException localIOException)
      {
        int i5;
        qym localqym;
        return new hae(0, localIOException, null);
      }
      catch (SQLiteDiskIOException localSQLiteDiskIOException)
      {
        label451:
        return new hae(0, localSQLiteDiskIOException, null);
      }
      i5 = localkzh.e.a(kzh.c);
      if (i5 == -1)
      {
        arrayOfkyf5 = null;
      }
      else
      {
        localqym = (qym)localkzh.e.a(i5, qym.a);
        if (localqym.b == null) {
          arrayOfkyf5 = null;
        } else {
          arrayOfkyf5 = kzh.a(localqym.b.a);
        }
      }
    }
  }
  
  protected final hae a(Context paramContext)
  {
    try
    {
      if ((this.a) && (!this.l.a(this.b)) && ((!this.n) || (!this.l.b(this.b))))
      {
        hae localhae3 = new hae(true);
        return localhae3;
      }
      if (kyo.a(paramContext, this.b))
      {
        hae localhae2 = g(paramContext);
        return localhae2;
      }
    }
    finally {}
    hae localhae1 = f(paramContext);
    return localhae1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzj
 * JD-Core Version:    0.7.0.1
 */