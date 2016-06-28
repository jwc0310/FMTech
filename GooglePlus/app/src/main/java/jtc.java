import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class jtc
{
  final HashMap<String, jte> a = new HashMap();
  final LinkedBlockingQueue<Runnable> b = new LinkedBlockingQueue();
  final jtd c;
  private final Executor d = new ThreadPoolExecutor(0, 3, 60L, TimeUnit.SECONDS, this.b, new jtf("download-manager", 10));
  
  public jtc(jtd paramjtd)
  {
    if (paramjtd == null) {
      throw new NullPointerException();
    }
    this.c = ((jtd)paramjtd);
  }
  
  public final InputStream a(String paramString)
  {
    try
    {
      jte localjte = (jte)this.a.get(paramString);
      if (localjte == null)
      {
        localjte = new jte(this, paramString);
        this.a.put(paramString, localjte);
        this.d.execute(localjte);
      }
      jth localjth = new jth(this, localjte);
      return localjth;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jtc
 * JD-Core Version:    0.7.0.1
 */