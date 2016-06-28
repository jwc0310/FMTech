import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class ibk
  implements ThreadFactory
{
  final int a;
  private final AtomicInteger b = new AtomicInteger();
  private final String c;
  
  public ibk(String paramString, int paramInt)
  {
    this.c = paramString;
    this.a = 10;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    String str = this.c;
    int i = this.b.getAndIncrement();
    return new ibl(this, paramRunnable, 12 + String.valueOf(str).length() + str + "-" + i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibk
 * JD-Core Version:    0.7.0.1
 */