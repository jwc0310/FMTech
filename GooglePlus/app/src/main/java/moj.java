import java.nio.ByteBuffer;

public final class moj
  extends qan<moj>
{
  private Boolean a = null;
  private mol[] b = mol.b();
  private String[] c = qay.f;
  
  public moj()
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
      int i1 = j;
      for (int i2 = 0; i2 < this.b.length; i2++)
      {
        mol localmol = this.b[i2];
        if (localmol != null)
        {
          int i3 = qal.d(16);
          int i4 = localmol.a();
          localmol.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      j = i1;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.c.length)
      {
        String str = this.c[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        mol localmol = this.b[k];
        if (localmol != null)
        {
          paramqal.c(18);
          if (localmol.ak < 0) {
            localmol.ak = localmol.a();
          }
          paramqal.c(localmol.ak);
          localmol.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          String str = this.c[j];
          if (str != null)
          {
            paramqal.c(26);
            paramqal.a(str);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     moj
 * JD-Core Version:    0.7.0.1
 */