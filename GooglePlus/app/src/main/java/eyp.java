import java.util.Arrays;

public final class eyp
  extends eyf<eyp>
{
  private byte[] c = eym.e;
  private byte[][] d = eym.d;
  private boolean e = false;
  
  public eyp()
  {
    this.a = null;
    this.b = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (!Arrays.equals(this.c, eym.e)) {
      j += eyd.b(1, this.c);
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.d.length)
      {
        byte[] arrayOfByte = this.d[i];
        if (arrayOfByte != null)
        {
          m++;
          k += eyd.b(arrayOfByte.length) + arrayOfByte.length;
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(eyd parameyd)
  {
    if (!Arrays.equals(this.c, eym.e)) {
      parameyd.a(1, this.c);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        byte[] arrayOfByte = this.d[i];
        if (arrayOfByte != null) {
          parameyd.a(2, arrayOfByte);
        }
      }
    }
    super.a(parameyd);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    eyp localeyp;
    boolean bool4;
    do
    {
      boolean bool3;
      do
      {
        boolean bool1;
        do
        {
          return bool2;
          bool1 = paramObject instanceof eyp;
          bool2 = false;
        } while (!bool1);
        localeyp = (eyp)paramObject;
        bool3 = Arrays.equals(this.c, localeyp.c);
        bool2 = false;
      } while (!bool3);
      bool4 = eyj.a(this.d, localeyp.d);
      bool2 = false;
    } while (!bool4);
    return a(localeyp);
  }
  
  public final int hashCode()
  {
    return 31 * (1237 + 31 * (31 * (527 + Arrays.hashCode(this.c)) + eyj.a(this.d))) + b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyp
 * JD-Core Version:    0.7.0.1
 */