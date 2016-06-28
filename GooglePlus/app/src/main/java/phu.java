import java.util.List;
import java.util.concurrent.Executor;

public final class phu
  extends efj
{
  private static final phk<pic<Object>, Object> abj = new phv();
  
  public static <V> pic<V> a(pic<? extends pic<? extends V>> parampic)
  {
    return phd.a(parampic, abj);
  }
  
  public static <I, O> pic<O> a(pic<I> parampic, pfi<? super I, ? extends O> parampfi, Executor paramExecutor)
  {
    return phd.a(parampic, parampfi, paramExecutor);
  }
  
  @Deprecated
  public static <I, O> pic<O> a(pic<I> parampic, phk<? super I, ? extends O> paramphk, Executor paramExecutor)
  {
    return phd.a(parampic, paramphk, paramExecutor);
  }
  
  @SafeVarargs
  public static <V> pic<List<V>> a(pic<? extends V>... paramVarArgs)
  {
    return new phl(pfq.a(paramVarArgs), true);
  }
  
  public static <V> void a(pic<V> parampic, pht<? super V> parampht, Executor paramExecutor)
  {
    if (parampht == null) {
      throw new NullPointerException();
    }
    parampic.a(new phw(parampic, parampht), paramExecutor);
  }
  
  public static <V> pic<V> b(V paramV)
  {
    if (paramV == null) {
      return pia.a;
    }
    return new pia(paramV);
  }
  
  public static <V> pic<V> b(pic<V> parampic)
  {
    return new phx(parampic);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     phu
 * JD-Core Version:    0.7.0.1
 */