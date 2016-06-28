public final class rkb
  extends qan<rkb>
{
  public rke[] a = rke.b();
  private int b = -2147483648;
  private rki c = null;
  private rkh d = null;
  private rkd e = null;
  private Long f = null;
  
  public rkb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != -2147483648) {
      i += qal.e(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.a.length; k++)
      {
        rke localrke = this.a[k];
        if (localrke != null) {
          j += qal.c(2, localrke);
        }
      }
      i = j;
    }
    if (this.c != null) {
      i += qal.c(3, this.c);
    }
    if (this.d != null) {
      i += qal.c(4, this.d);
    }
    if (this.e != null) {
      i += qal.c(5, this.e);
    }
    if (this.f != null) {
      i += qal.e(6, this.f.longValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648) {
      paramqal.a(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        rke localrke = this.a[i];
        if (localrke != null) {
          paramqal.a(2, localrke);
        }
      }
    }
    if (this.c != null) {
      paramqal.a(3, this.c);
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    if (this.e != null) {
      paramqal.a(5, this.e);
    }
    if (this.f != null) {
      paramqal.b(6, this.f.longValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rkb
 * JD-Core Version:    0.7.0.1
 */