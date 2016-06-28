import java.nio.ByteBuffer;

public final class oln
  extends qan<oln>
{
  public Boolean a = null;
  public ooa[] b = ooa.b();
  public qbe[] c = qbe.b();
  public String[] d = qay.f;
  private String[] e = qay.f;
  private String[] f = qay.f;
  
  public oln()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    this.a.booleanValue();
    int k = j + (1 + qal.d(8));
    int i15;
    int i16;
    if ((this.e != null) && (this.e.length > 0))
    {
      int i14 = 0;
      i15 = 0;
      i16 = 0;
      while (i14 < this.e.length)
      {
        String str3 = this.e[i14];
        if (str3 != null)
        {
          i16++;
          int i17 = qal.a(str3);
          i15 += i17 + qal.d(i17);
        }
        i14++;
      }
    }
    for (int m = i15 + k + i16 * 1;; m = k)
    {
      if ((this.f != null) && (this.f.length > 0))
      {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < this.f.length)
        {
          String str2 = this.f[i10];
          if (str2 != null)
          {
            i12++;
            int i13 = qal.a(str2);
            i11 += i13 + qal.d(i13);
          }
          i10++;
        }
        m = m + i11 + i12 * 1;
      }
      if ((this.b != null) && (this.b.length > 0)) {
        for (int i7 = 0; i7 < this.b.length; i7++)
        {
          ooa localooa = this.b[i7];
          if (localooa != null)
          {
            int i8 = qal.d(32);
            int i9 = localooa.a();
            localooa.ak = i9;
            m += i8 + (i9 + qal.d(i9));
          }
        }
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int i3 = m;
        for (int i4 = 0; i4 < this.c.length; i4++)
        {
          qbe localqbe = this.c[i4];
          if (localqbe != null)
          {
            int i5 = qal.d(40);
            int i6 = localqbe.a();
            localqbe.ak = i6;
            i3 += i5 + (i6 + qal.d(i6));
          }
        }
        m = i3;
      }
      if ((this.d != null) && (this.d.length > 0))
      {
        int n = 0;
        int i1 = 0;
        while (i < this.d.length)
        {
          String str1 = this.d[i];
          if (str1 != null)
          {
            i1++;
            int i2 = qal.a(str1);
            n += i2 + qal.d(i2);
          }
          i++;
        }
        m = m + n + i1 * 1;
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    boolean bool = this.a.booleanValue();
    paramqal.c(8);
    if (bool) {}
    byte b1;
    for (int i = 1;; i = 0)
    {
      b1 = (byte)i;
      if (paramqal.a.hasRemaining()) {
        break;
      }
      throw new qam(paramqal.a.position(), paramqal.a.limit());
    }
    paramqal.a.put(b1);
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i2 = 0; i2 < this.e.length; i2++)
      {
        String str3 = this.e[i2];
        if (str3 != null)
        {
          paramqal.c(18);
          paramqal.a(str3);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i1 = 0; i1 < this.f.length; i1++)
      {
        String str2 = this.f[i1];
        if (str2 != null)
        {
          paramqal.c(26);
          paramqal.a(str2);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int n = 0; n < this.b.length; n++)
      {
        ooa localooa = this.b[n];
        if (localooa != null)
        {
          paramqal.c(34);
          if (localooa.ak < 0) {
            localooa.ak = localooa.a();
          }
          paramqal.c(localooa.ak);
          localooa.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int m = 0; m < this.c.length; m++)
      {
        qbe localqbe = this.c[m];
        if (localqbe != null)
        {
          paramqal.c(42);
          if (localqbe.ak < 0) {
            localqbe.ak = localqbe.a();
          }
          paramqal.c(localqbe.ak);
          localqbe.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      int j = this.d.length;
      int k = 0;
      if (j > 0) {
        while (k < this.d.length)
        {
          String str1 = this.d[k];
          if (str1 != null)
          {
            paramqal.c(50);
            paramqal.a(str1);
          }
          k++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oln
 * JD-Core Version:    0.7.0.1
 */