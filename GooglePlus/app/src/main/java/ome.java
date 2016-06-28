public final class ome
  extends qan<ome>
{
  public omf[] a = omf.b();
  public oku[] b = oku.b();
  public omm[] c = omm.b();
  public olc d = null;
  
  public ome()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i7 = i;
      for (int i8 = 0; i8 < this.a.length; i8++)
      {
        omf localomf = this.a[i8];
        if (localomf != null)
        {
          int i9 = qal.d(8);
          int i10 = localomf.a();
          localomf.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      i = i7;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.b.length; i4++)
      {
        oku localoku = this.b[i4];
        if (localoku != null)
        {
          int i5 = qal.d(16);
          int i6 = localoku.a();
          localoku.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.c != null)
    {
      int m = this.c.length;
      int n = 0;
      if (m > 0) {
        while (n < this.c.length)
        {
          omm localomm = this.c[n];
          if (localomm != null)
          {
            int i1 = qal.d(24);
            int i2 = localomm.a();
            localomm.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.d != null)
    {
      olc localolc = this.d;
      int j = qal.d(32);
      int k = localolc.a();
      localolc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        omf localomf = this.a[m];
        if (localomf != null)
        {
          paramqal.c(10);
          if (localomf.ak < 0) {
            localomf.ak = localomf.a();
          }
          paramqal.c(localomf.ak);
          localomf.a(paramqal);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        oku localoku = this.b[k];
        if (localoku != null)
        {
          paramqal.c(18);
          if (localoku.ak < 0) {
            localoku.ak = localoku.a();
          }
          paramqal.c(localoku.ak);
          localoku.a(paramqal);
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
          omm localomm = this.c[j];
          if (localomm != null)
          {
            paramqal.c(26);
            if (localomm.ak < 0) {
              localomm.ak = localomm.a();
            }
            paramqal.c(localomm.ak);
            localomm.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.d != null)
    {
      olc localolc = this.d;
      paramqal.c(34);
      if (localolc.ak < 0) {
        localolc.ak = localolc.a();
      }
      paramqal.c(localolc.ak);
      localolc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ome
 * JD-Core Version:    0.7.0.1
 */