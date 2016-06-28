import java.nio.ByteBuffer;

public final class ntr
  extends qan<ntr>
{
  public ojf[] a = ojf.b();
  public String b = null;
  private ojf[] c = ojf.b();
  private Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  
  public ntr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.c != null) && (this.c.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.c.length; i4++)
      {
        ojf localojf2 = this.c[i4];
        if (localojf2 != null)
        {
          int i5 = qal.d(8);
          int i6 = localojf2.a();
          localojf2.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.a != null)
    {
      int m = this.a.length;
      int n = 0;
      if (m > 0) {
        while (n < this.a.length)
        {
          ojf localojf1 = this.a[n];
          if (localojf1 != null)
          {
            int i1 = qal.d(24);
            int i2 = localojf1.a();
            localojf1.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(32);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(40);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i += 1 + qal.d(48);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if ((this.c != null) && (this.c.length > 0)) {
      for (int n = 0; n < this.c.length; n++)
      {
        ojf localojf2 = this.c[n];
        if (localojf2 != null)
        {
          paramqal.c(10);
          if (localojf2.ak < 0) {
            localojf2.ak = localojf2.a();
          }
          paramqal.c(localojf2.ak);
          localojf2.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int m = i;; m = 0)
      {
        b3 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        ojf localojf1 = this.a[k];
        if (localojf1 != null)
        {
          paramqal.c(26);
          if (localojf1.ak < 0) {
            localojf1.ak = localojf1.a();
          }
          paramqal.c(localojf1.ak);
          localojf1.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(40);
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
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
      paramqal.c(48);
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
 * Qualified Name:     ntr
 * JD-Core Version:    0.7.0.1
 */