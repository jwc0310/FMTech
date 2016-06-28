import java.nio.ByteBuffer;

public final class nhf
  extends qan<nhf>
{
  public static final qao<rcy, nhf> a = new qao(11, nhf.class, (int)358367674L, false);
  public qbv[] b = qbv.a;
  public qbu[] c = qbu.a;
  private qbe[] d = qbe.b();
  private Boolean e = null;
  private qbv[] f = qbv.a;
  
  public nhf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0))
    {
      int i9 = i;
      for (int i10 = 0; i10 < this.b.length; i10++)
      {
        qbv localqbv2 = this.b[i10];
        if (localqbv2 != null)
        {
          int i11 = qal.d(8);
          int i12 = localqbv2.a();
          localqbv2.ak = i12;
          i9 += i11 + (i12 + qal.d(i12));
        }
      }
      i = i9;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.f.length; i6++)
      {
        qbv localqbv1 = this.f[i6];
        if (localqbv1 != null)
        {
          int i7 = qal.d(16);
          int i8 = localqbv1.a();
          localqbv1.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        qbe localqbe = this.d[i2];
        if (localqbe != null)
        {
          int i3 = qal.d(24);
          int i4 = localqbe.a();
          localqbe.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.c != null)
    {
      int j = this.c.length;
      int k = 0;
      if (j > 0) {
        while (k < this.c.length)
        {
          qbu localqbu = this.c[k];
          if (localqbu != null)
          {
            int m = qal.d(32);
            int n = localqbu.a();
            localqbu.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(40);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int n = 0; n < this.b.length; n++)
      {
        qbv localqbv2 = this.b[n];
        if (localqbv2 != null)
        {
          paramqal.c(10);
          if (localqbv2.ak < 0) {
            localqbv2.ak = localqbv2.a();
          }
          paramqal.c(localqbv2.ak);
          localqbv2.a(paramqal);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int m = 0; m < this.f.length; m++)
      {
        qbv localqbv1 = this.f[m];
        if (localqbv1 != null)
        {
          paramqal.c(18);
          if (localqbv1.ak < 0) {
            localqbv1.ak = localqbv1.a();
          }
          paramqal.c(localqbv1.ak);
          localqbv1.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        qbe localqbe = this.d[k];
        if (localqbe != null)
        {
          paramqal.c(26);
          if (localqbe.ak < 0) {
            localqbe.ak = localqbe.a();
          }
          paramqal.c(localqbe.ak);
          localqbe.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int j = 0; j < this.c.length; j++)
      {
        qbu localqbu = this.c[j];
        if (localqbu != null)
        {
          paramqal.c(34);
          if (localqbu.ak < 0) {
            localqbu.ak = localqbu.a();
          }
          paramqal.c(localqbu.ak);
          localqbu.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
      paramqal.c(40);
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
 * Qualified Name:     nhf
 * JD-Core Version:    0.7.0.1
 */