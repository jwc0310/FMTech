public final class lnv
  extends mab
{
  public String[] a;
  public String[] b;
  public String[] c;
  
  public lnv() {}
  
  public lnv(nhj paramnhj)
  {
    if ((paramnhj == null) || (paramnhj.b == null))
    {
      this.a = new String[0];
      this.b = new String[0];
      this.c = new String[0];
    }
    for (;;)
    {
      return;
      int j = paramnhj.b.length;
      this.a = new String[j];
      this.b = new String[j];
      this.c = new String[j];
      while (i < j)
      {
        nhi localnhi = paramnhj.b[i];
        this.a[i] = localnhi.b;
        this.b[i] = localnhi.a;
        this.c[i] = localnhi.c;
        i++;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnv
 * JD-Core Version:    0.7.0.1
 */