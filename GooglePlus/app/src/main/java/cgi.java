final class cgi
  implements Runnable
{
  final String a;
  private boolean b;
  private final String c;
  
  public cgi(cge paramcge, String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.a = paramString2;
  }
  
  public final void run()
  {
    if (!this.b)
    {
      this.b = true;
      this.d.a(this.c, this.a, true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgi
 * JD-Core Version:    0.7.0.1
 */