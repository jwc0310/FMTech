import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class pdc
  implements Closeable, Runnable
{
  private static final mcq b = new mcq("SpanEndSignal");
  final Throwable a;
  private final AtomicBoolean c = new AtomicBoolean(false);
  private pdd d;
  
  pdc(pdd parampdd)
  {
    this.d = parampdd;
    this.a = null;
  }
  
  public final void close()
  {
    if (!this.c.compareAndSet(false, true)) {
      throw new IllegalStateException("Span was already closed!");
    }
    this.d.a();
    this.d = null;
  }
  
  public final void finalize()
  {
    super.finalize();
  }
  
  public final void run()
  {
    close();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pdc
 * JD-Core Version:    0.7.0.1
 */