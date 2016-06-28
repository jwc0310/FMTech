public final class nzf
  extends qan<nzf>
{
  public static final qao<rcy, nzf> a = new qao(11, nzf.class, (int)342261626L, false);
  public odg[] b = odg.b();
  
  public nzf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int j = 0; j < this.b.length; j++)
      {
        odg localodg = this.b[j];
        if (localodg != null)
        {
          int k = qal.d(8);
          int m = localodg.a();
          localodg.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        odg localodg = this.b[i];
        if (localodg != null)
        {
          paramqal.c(10);
          if (localodg.ak < 0) {
            localodg.ak = localodg.a();
          }
          paramqal.c(localodg.ak);
          localodg.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzf
 * JD-Core Version:    0.7.0.1
 */