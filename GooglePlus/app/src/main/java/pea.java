import android.annotation.TargetApi;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class pea
{
  static final AtomicLong a = new AtomicLong(1L);
  public static final ThreadLocal<pdd> b = new ThreadLocal();
  static final List<pdd> c = new ArrayList();
  static pdd d;
  private static final mcs e = new mcs("tiktok_systrace", (byte)0);
  private static final Runnable f = new peb();
  private static boolean g;
  
  public static pdc a(String paramString)
  {
    pdd localpdd1 = (pdd)b.get();
    if (localpdd1 == null) {
      throw new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See http://go/tiktok-tracing for more details.");
    }
    pdd localpdd2 = localpdd1.a(paramString);
    b(localpdd2);
    return new pdc(localpdd2);
  }
  
  @TargetApi(18)
  public static void a()
  {
    if (!g) {}
    for (boolean bool = true;; bool = false)
    {
      aau.a(bool, "async trace was not properly paused");
      if ((b.get() != null) || (d == null)) {
        break;
      }
      b.set(d);
      g = true;
      return;
    }
    g = false;
  }
  
  public static void a(pdd parampdd)
  {
    if (parampdd == null) {
      throw new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See http://go/tiktok-tracing for more details.");
    }
  }
  
  private static void a(pdd parampdd, boolean paramBoolean)
  {
    b.set(parampdd);
    if ((paramBoolean) && (efj.j()))
    {
      c.add(parampdd);
      Runnable localRunnable = f;
      efj.m().post(localRunnable);
    }
  }
  
  public static boolean a(ovl paramovl)
  {
    if (paramovl == null) {
      throw new NullPointerException();
    }
    return (pdd)b.get() != null;
  }
  
  @TargetApi(18)
  public static void b()
  {
    if (g)
    {
      aau.b(d, "current async trace should not be null");
      b.set(null);
      g = false;
    }
  }
  
  public static void b(String paramString)
  {
    pdd localpdd = (pdd)b.get();
    if (localpdd == null) {
      throw new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See http://go/tiktok-tracing for more details.");
    }
    localpdd.b(paramString);
    a(localpdd.b(), localpdd.d());
  }
  
  public static void b(pdd parampdd)
  {
    if ((parampdd == null) || (parampdd.d())) {}
    for (boolean bool = true;; bool = false)
    {
      a(parampdd, bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pea
 * JD-Core Version:    0.7.0.1
 */