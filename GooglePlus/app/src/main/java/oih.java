import java.nio.ByteBuffer;

public final class oih
  extends qan<oih>
{
  public qmg a = null;
  public Boolean b = null;
  public ply c = null;
  private String d = null;
  private String[] e = qay.f;
  
  public oih()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      qmg localqmg = this.a;
      int i5 = qal.d(8);
      int i6 = localqmg.a();
      localqmg.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      j += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      ply localply = this.c;
      int i3 = qal.d(24);
      int i4 = localply.a();
      localply.ak = i4;
      j += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i1 = qal.d(32);
      int i2 = qal.a(str2);
      j += i1 + (i2 + qal.d(i2));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.e.length)
      {
        String str1 = this.e[i];
        if (str1 != null)
        {
          m++;
          int n = qal.a(str1);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      qmg localqmg = this.a;
      paramqal.c(10);
      if (localqmg.ak < 0) {
        localqmg.ak = localqmg.a();
      }
      paramqal.c(localqmg.ak);
      localqmg.a(paramqal);
    }
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
      paramqal.c(16);
      if (bool) {}
      byte b1;
      for (int k = 1;; k = 0)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.c != null)
    {
      ply localply = this.c;
      paramqal.c(26);
      if (localply.ak < 0) {
        localply.ak = localply.a();
      }
      paramqal.c(localply.ak);
      localply.a(paramqal);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          String str1 = this.e[j];
          if (str1 != null)
          {
            paramqal.c(42);
            paramqal.a(str1);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oih
 * JD-Core Version:    0.7.0.1
 */