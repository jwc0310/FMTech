import java.util.concurrent.TimeUnit;

public final class eem
{
  private int a = 0;
  
  public final void a()
  {
    try
    {
      this.a = (1 + this.a);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final boolean a(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = System.currentTimeMillis();
    long l2 = TimeUnit.MILLISECONDS.convert(paramLong, paramTimeUnit);
    for (;;)
    {
      try
      {
        if (this.a == 0) {
          return true;
        }
        if (l2 <= 0L) {
          return false;
        }
      }
      finally {}
      wait(l2);
      long l3 = System.currentTimeMillis();
      l2 -= l3 - l1;
    }
  }
  
  public final void b()
  {
    try
    {
      if (this.a == 0) {
        throw new RuntimeException("too many decrements");
      }
    }
    finally {}
    this.a = (-1 + this.a);
    if (this.a == 0) {
      notifyAll();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eem
 * JD-Core Version:    0.7.0.1
 */