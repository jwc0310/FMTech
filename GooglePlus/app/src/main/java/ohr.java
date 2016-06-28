import java.nio.ByteBuffer;

public final class ohr
  extends qan<ohr>
{
  private String[] a = qay.f;
  private Boolean b = null;
  
  public ohr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int m;
    int n;
    if ((this.a != null) && (this.a.length > 0))
    {
      m = 0;
      n = 0;
      while (i < this.a.length)
      {
        String str = this.a[i];
        if (str != null)
        {
          n++;
          int i1 = qal.a(str);
          m += i1 + qal.d(i1);
        }
        i++;
      }
    }
    for (int k = j + m + n * 1;; k = j)
    {
      if (this.b != null)
      {
        this.b.booleanValue();
        k += 1 + qal.d(24);
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        String str = this.a[j];
        if (str != null)
        {
          paramqal.c(18);
          paramqal.a(str);
        }
      }
    }
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
      paramqal.c(24);
      int i = 0;
      if (bool) {
        i = 1;
      }
      byte b1 = (byte)i;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohr
 * JD-Core Version:    0.7.0.1
 */