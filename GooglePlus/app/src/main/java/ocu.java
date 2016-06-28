public final class ocu
  extends qan<ocu>
{
  public ocr[] a = ocr.b();
  
  public ocu()
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
        ocr localocr = this.a[j];
        if (localocr != null)
        {
          int k = qal.d(8);
          int m = localocr.a();
          localocr.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        ocr localocr = this.a[i];
        if (localocr != null)
        {
          paramqal.c(10);
          if (localocr.ak < 0) {
            localocr.ak = localocr.a();
          }
          paramqal.c(localocr.ak);
          localocr.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocu
 * JD-Core Version:    0.7.0.1
 */