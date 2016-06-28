import android.os.SystemClock;

public final class ejq
{
  private final long a;
  private final int b;
  private final la<String, Long> c;
  
  public ejq()
  {
    this.a = 60000L;
    this.b = 10;
    this.c = new la(10);
  }
  
  public ejq(int paramInt, long paramLong)
  {
    this.a = paramLong;
    this.b = 1024;
    this.c = new la();
  }
  
  public final Long a(String paramString)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = this.a;
    long l3 = l2;
    for (;;)
    {
      int i;
      try
      {
        if (this.c.size() >= this.b)
        {
          i = -1 + this.c.size();
          if (i >= 0)
          {
            if (l1 - ((Long)this.c.b[(1 + (i << 1))]).longValue() > l3) {
              this.c.b(i);
            }
          }
          else
          {
            long l4 = l3 / 2L;
            new StringBuilder("The max capacity ").append(this.b).append(" is not enough. Current durationThreshold is: ").append(l4);
            l3 = l4;
          }
        }
        else
        {
          Long localLong = (Long)this.c.put(paramString, Long.valueOf(l1));
          return localLong;
        }
      }
      finally {}
      i--;
    }
  }
  
  public final boolean b(String paramString)
  {
    for (;;)
    {
      try
      {
        if (this.c.remove(paramString) != null)
        {
          bool = true;
          return bool;
        }
      }
      finally {}
      boolean bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejq
 * JD-Core Version:    0.7.0.1
 */