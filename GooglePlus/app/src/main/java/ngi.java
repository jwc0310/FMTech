public final class ngi
  extends qan<ngi>
{
  public qbe[] a = qbe.b();
  public qbe[] b = qbe.b();
  public qbe[] c = qbe.b();
  public qbu[] d = qbu.a;
  private qbv[] e = qbv.a;
  private qbv[] f = qbv.a;
  private qbv[] g = qbv.a;
  private String h = null;
  private qbv[] i = qbv.a;
  
  public ngi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    if ((this.i != null) && (this.i.length > 0))
    {
      int i28 = j;
      for (int i29 = 0; i29 < this.i.length; i29++)
      {
        qbv localqbv4 = this.i[i29];
        if (localqbv4 != null)
        {
          int i30 = qal.d(8);
          int i31 = localqbv4.a();
          localqbv4.ak = i31;
          i28 += i30 + (i31 + qal.d(i31));
        }
      }
      j = i28;
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i24 = j;
      for (int i25 = 0; i25 < this.e.length; i25++)
      {
        qbv localqbv3 = this.e[i25];
        if (localqbv3 != null)
        {
          int i26 = qal.d(16);
          int i27 = localqbv3.a();
          localqbv3.ak = i27;
          i24 += i26 + (i27 + qal.d(i27));
        }
      }
      j = i24;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i20 = j;
      for (int i21 = 0; i21 < this.f.length; i21++)
      {
        qbv localqbv2 = this.f[i21];
        if (localqbv2 != null)
        {
          int i22 = qal.d(24);
          int i23 = localqbv2.a();
          localqbv2.ak = i23;
          i20 += i22 + (i23 + qal.d(i23));
        }
      }
      j = i20;
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i16 = j;
      for (int i17 = 0; i17 < this.g.length; i17++)
      {
        qbv localqbv1 = this.g[i17];
        if (localqbv1 != null)
        {
          int i18 = qal.d(32);
          int i19 = localqbv1.a();
          localqbv1.ak = i19;
          i16 += i18 + (i19 + qal.d(i19));
        }
      }
      j = i16;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i12 = j;
      for (int i13 = 0; i13 < this.d.length; i13++)
      {
        qbu localqbu = this.d[i13];
        if (localqbu != null)
        {
          int i14 = qal.d(40);
          int i15 = localqbu.a();
          localqbu.ak = i15;
          i12 += i14 + (i15 + qal.d(i15));
        }
      }
      j = i12;
    }
    if (this.h != null)
    {
      String str = this.h;
      int i10 = qal.d(48);
      int i11 = qal.a(str);
      j += i10 + (i11 + qal.d(i11));
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int i6 = j;
      for (int i7 = 0; i7 < this.a.length; i7++)
      {
        qbe localqbe3 = this.a[i7];
        if (localqbe3 != null)
        {
          int i8 = qal.d(56);
          int i9 = localqbe3.a();
          localqbe3.ak = i9;
          i6 += i8 + (i9 + qal.d(i9));
        }
      }
      j = i6;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i2 = j;
      for (int i3 = 0; i3 < this.b.length; i3++)
      {
        qbe localqbe2 = this.b[i3];
        if (localqbe2 != null)
        {
          int i4 = qal.d(64);
          int i5 = localqbe2.a();
          localqbe2.ak = i5;
          i2 += i4 + (i5 + qal.d(i5));
        }
      }
      j = i2;
    }
    if (this.c != null)
    {
      int k = this.c.length;
      int m = 0;
      if (k > 0) {
        while (m < this.c.length)
        {
          qbe localqbe1 = this.c[m];
          if (localqbe1 != null)
          {
            int n = qal.d(72);
            int i1 = localqbe1.a();
            localqbe1.ak = i1;
            j += n + (i1 + qal.d(i1));
          }
          m++;
        }
      }
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.i != null) && (this.i.length > 0)) {
      for (int i5 = 0; i5 < this.i.length; i5++)
      {
        qbv localqbv4 = this.i[i5];
        if (localqbv4 != null)
        {
          paramqal.c(10);
          if (localqbv4.ak < 0) {
            localqbv4.ak = localqbv4.a();
          }
          paramqal.c(localqbv4.ak);
          localqbv4.a(paramqal);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i4 = 0; i4 < this.e.length; i4++)
      {
        qbv localqbv3 = this.e[i4];
        if (localqbv3 != null)
        {
          paramqal.c(18);
          if (localqbv3.ak < 0) {
            localqbv3.ak = localqbv3.a();
          }
          paramqal.c(localqbv3.ak);
          localqbv3.a(paramqal);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i3 = 0; i3 < this.f.length; i3++)
      {
        qbv localqbv2 = this.f[i3];
        if (localqbv2 != null)
        {
          paramqal.c(26);
          if (localqbv2.ak < 0) {
            localqbv2.ak = localqbv2.a();
          }
          paramqal.c(localqbv2.ak);
          localqbv2.a(paramqal);
        }
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i2 = 0; i2 < this.g.length; i2++)
      {
        qbv localqbv1 = this.g[i2];
        if (localqbv1 != null)
        {
          paramqal.c(34);
          if (localqbv1.ak < 0) {
            localqbv1.ak = localqbv1.a();
          }
          paramqal.c(localqbv1.ak);
          localqbv1.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i1 = 0; i1 < this.d.length; i1++)
      {
        qbu localqbu = this.d[i1];
        if (localqbu != null)
        {
          paramqal.c(42);
          if (localqbu.ak < 0) {
            localqbu.ak = localqbu.a();
          }
          paramqal.c(localqbu.ak);
          localqbu.a(paramqal);
        }
      }
    }
    if (this.h != null)
    {
      String str = this.h;
      paramqal.c(50);
      paramqal.a(str);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        qbe localqbe3 = this.a[n];
        if (localqbe3 != null)
        {
          paramqal.c(58);
          if (localqbe3.ak < 0) {
            localqbe3.ak = localqbe3.a();
          }
          paramqal.c(localqbe3.ak);
          localqbe3.a(paramqal);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        qbe localqbe2 = this.b[m];
        if (localqbe2 != null)
        {
          paramqal.c(66);
          if (localqbe2.ak < 0) {
            localqbe2.ak = localqbe2.a();
          }
          paramqal.c(localqbe2.ak);
          localqbe2.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      int j = this.c.length;
      int k = 0;
      if (j > 0) {
        while (k < this.c.length)
        {
          qbe localqbe1 = this.c[k];
          if (localqbe1 != null)
          {
            paramqal.c(74);
            if (localqbe1.ak < 0) {
              localqbe1.ak = localqbe1.a();
            }
            paramqal.c(localqbe1.ak);
            localqbe1.a(paramqal);
          }
          k++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngi
 * JD-Core Version:    0.7.0.1
 */