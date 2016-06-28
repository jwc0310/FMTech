import android.os.SystemClock;

public final class edq
{
  public static final Object b = new Object();
  private static final edm f = new edm("RequestTracker");
  long a = -1L;
  private long c = 86400000L;
  private long d = 0L;
  private edp e;
  
  public edq(long paramLong) {}
  
  final void a()
  {
    this.a = -1L;
    this.e = null;
    this.d = 0L;
  }
  
  public final void a(long paramLong, edp paramedp)
  {
    synchronized (b)
    {
      edp localedp = this.e;
      this.a = paramLong;
      this.e = paramedp;
      this.d = SystemClock.elapsedRealtime();
      if (localedp != null) {
        localedp.a();
      }
      return;
    }
  }
  
  public final boolean a(long paramLong)
  {
    for (;;)
    {
      synchronized (b)
      {
        if ((this.a != -1L) && (this.a == paramLong))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final boolean a(long paramLong, int paramInt)
  {
    for (boolean bool = true;; bool = false)
    {
      synchronized (b)
      {
        if ((this.a != -1L) && (paramLong - this.d >= this.c))
        {
          edm localedm = f;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.a);
          localedm.a("request %d timed out", arrayOfObject);
          localedp = this.e;
          a();
          if (localedp != null) {
            localedp.a(2102, null);
          }
          return bool;
        }
      }
      edp localedp = null;
    }
  }
  
  public final boolean a(long paramLong, int paramInt, Object paramObject)
  {
    for (boolean bool = true;; bool = false)
    {
      synchronized (b)
      {
        if ((this.a != -1L) && (this.a == paramLong))
        {
          edm localedm = f;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.a);
          localedm.a("request %d completed", arrayOfObject);
          localedp = this.e;
          a();
          if (localedp != null) {
            localedp.a(paramInt, paramObject);
          }
          return bool;
        }
      }
      edp localedp = null;
    }
  }
  
  public final boolean b()
  {
    for (;;)
    {
      synchronized (b)
      {
        if (this.a != -1L)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edq
 * JD-Core Version:    0.7.0.1
 */