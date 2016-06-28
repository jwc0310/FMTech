import java.nio.ByteBuffer;

public final class nvd
  extends qan<nvd>
{
  public nvv[] a = nvv.b();
  public Boolean b = null;
  public Boolean c = null;
  
  public nvd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        nvv localnvv = this.a[j];
        if (localnvv != null)
        {
          int k = qal.d(8);
          int m = localnvv.a();
          localnvv.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        nvv localnvv = this.a[k];
        if (localnvv != null)
        {
          paramqal.c(10);
          if (localnvv.ak < 0) {
            localnvv.ak = localnvv.a();
          }
          paramqal.c(localnvv.ak);
          localnvv.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      boolean bool2 = this.b.booleanValue();
      paramqal.c(16);
      if (bool2) {}
      byte b2;
      for (int j = i;; j = 0)
      {
        b2 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(24);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvd
 * JD-Core Version:    0.7.0.1
 */