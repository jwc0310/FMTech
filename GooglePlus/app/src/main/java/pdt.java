import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class pdt
{
  private static Map<Integer, pdd> a = new HashMap();
  
  static
  {
    new AtomicInteger();
  }
  
  public static Runnable a(Runnable paramRunnable)
  {
    return new pdu((pdd)pea.b.get(), paramRunnable);
  }
  
  public static Runnable a(pdd parampdd, Runnable paramRunnable)
  {
    return new pdu(parampdd, paramRunnable);
  }
  
  public static <V> Callable<V> a(Callable<V> paramCallable)
  {
    return new pdv((pdd)pea.b.get(), paramCallable);
  }
  
  public static pdd a(Intent paramIntent)
  {
    if (paramIntent.hasExtra("tracing_intent_id"))
    {
      int i = paramIntent.getIntExtra("tracing_intent_id", -1);
      return (pdd)a.remove(Integer.valueOf(i));
    }
    return null;
  }
  
  public static <I, O> pfi<I, O> a(pfi<I, O> parampfi)
  {
    return new pdw((pdd)pea.b.get(), parampfi);
  }
  
  public static <I, O> phk<I, O> a(phk<I, O> paramphk)
  {
    return new pdx((pdd)pea.b.get(), paramphk);
  }
  
  public static <T> pht<T> a(pht<T> parampht)
  {
    return new pdy((pdd)pea.b.get(), parampht);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pdt
 * JD-Core Version:    0.7.0.1
 */