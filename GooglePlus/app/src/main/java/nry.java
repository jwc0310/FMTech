import java.nio.ByteBuffer;

public final class nry
  extends qan<nry>
{
  private Boolean a = null;
  private int[] b = qay.a;
  
  public nry()
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
      this.a.booleanValue();
      j += 1 + qal.d(8);
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int k = 0;
      if (i < this.b.length)
      {
        int m = this.b[i];
        if (m >= 0) {}
        for (int n = qal.d(m);; n = 10)
        {
          k += n;
          i++;
          break;
        }
      }
      j = j + k + 1 * this.b.length;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      boolean bool = this.a.booleanValue();
      paramqal.c(8);
      if (bool) {}
      byte b1;
      for (int m = 1;; m = 0)
      {
        b1 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          int k = this.b[j];
          paramqal.c(16);
          paramqal.a(k);
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nry
 * JD-Core Version:    0.7.0.1
 */