public final class iuk
{
  public final long a;
  public final long b;
  public final boolean c;
  public final boolean d;
  
  public iuk(long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
  }
  
  public static iuk a(ojo paramojo)
  {
    long l1 = -1L;
    long l3;
    boolean bool1;
    boolean bool2;
    long l2;
    if (paramojo != null) {
      if (paramojo.b != null)
      {
        l3 = paramojo.b.longValue() / 1048576L;
        if (paramojo.a != null) {
          l1 = paramojo.a.longValue() / 1048576L;
        }
        bool1 = efj.b(paramojo.d);
        bool2 = efj.b(paramojo.c);
        l2 = l1;
        l1 = l3;
      }
    }
    for (;;)
    {
      return new iuk(l1, l2, bool1, bool2);
      l3 = l1;
      break;
      l2 = l1;
      bool1 = false;
      bool2 = false;
    }
  }
  
  public final boolean a()
  {
    if ((this.a != -1L) && (this.b != -1L)) {}
    for (int i = 1; (i != 0) && (!this.c) && (this.a - this.b < 5L); i = 0) {
      return true;
    }
    return false;
  }
  
  public final String toString()
  {
    long l1 = this.a;
    long l2 = this.b;
    boolean bool1 = this.c;
    boolean bool2 = this.d;
    return 110 + "[QuotaInfo; limit: " + l1 + ", used: " + l2 + ", unlimited quota? " + bool1 + ", low quota? " + bool2 + "]";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iuk
 * JD-Core Version:    0.7.0.1
 */