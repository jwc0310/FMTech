import android.content.Context;
import android.util.Log;
import java.util.List;

public final class kbr
  implements kbu
{
  private final Context a;
  private kbz[] b;
  
  public kbr(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final void a()
  {
    try
    {
      List localList = mbb.c(this.a, kbz.class);
      this.b = ((kbz[])localList.toArray(new kbz[localList.size()]));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(kbw paramkbw)
  {
    if (this.b == null) {
      a();
    }
    kbz[] arrayOfkbz = this.b;
    int i = arrayOfkbz.length;
    for (int j = 0; j < i; j++) {
      paramkbw = arrayOfkbz[j].a(paramkbw.j, paramkbw);
    }
    paramkbw.n = paramkbw.k.f;
    if (Log.isLoggable("HttpOperation", 3))
    {
      String str3 = String.valueOf(paramkbw.c());
      if (str3.length() == 0) {
        break label376;
      }
      "Starting op: ".concat(str3);
    }
    for (;;)
    {
      if (paramkbw.k.e) {
        paramkbw.r = 2;
      }
      paramkbw.a();
      if (paramkbw.n != null) {
        paramkbw.n.a(paramkbw.k(), paramkbw.l());
      }
      paramkbw.o();
      paramkbw.p();
      if (paramkbw.n != null)
      {
        paramkbw.n.a(paramkbw.v);
        paramkbw.v.a();
        kbx localkbx = paramkbw.n;
        if (localkbx.d != 0L)
        {
          kby localkby2 = localkbx.a;
          localkby2.c += System.currentTimeMillis() - localkbx.d;
          localkbx.d = 0L;
        }
        localkbx.e = System.currentTimeMillis();
        kby localkby1 = localkbx.a;
        localkby1.b += System.currentTimeMillis() - localkbx.b;
        paramkbw.r();
        if (paramkbw.k.f == null) {
          paramkbw.n.a("HttpOperation", "");
        }
      }
      if ((paramkbw.n()) && (Log.isLoggable("HttpOperation", 4)))
      {
        String str1 = String.valueOf(paramkbw.k());
        int k = paramkbw.o;
        String str2 = String.valueOf(paramkbw.q);
        new StringBuilder(36 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("[").append(str1).append("] failed due to error: ").append(k).append(" ").append(str2);
      }
      return;
      label376:
      new String("Starting op: ");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbr
 * JD-Core Version:    0.7.0.1
 */