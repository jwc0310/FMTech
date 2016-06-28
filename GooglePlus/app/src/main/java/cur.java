public final class cur
  extends kdf
{
  private static final mfl a;
  private static final mfl b;
  private static final mfl c;
  
  static
  {
    mfn localmfn1 = new mfn("debug.plus.frontend.url", (byte)0);
    localmfn1.b = "www.googleapis.com/plusi/v3/ozInternal/";
    a = new mfl(localmfn1.a, localmfn1.b);
    mfn localmfn2 = new mfn("debug.plus.datamixer.url", (byte)0);
    localmfn2.b = "www.googleapis.com/plusdatamixer/v1/";
    b = new mfl(localmfn2.a, localmfn2.b);
    mfn localmfn3 = new mfn("debug.plus.tracing_level", (byte)0);
    c = new mfl(localmfn3.a, localmfn3.b);
  }
  
  public final String a()
  {
    return c.a;
  }
  
  public final String a(String paramString)
  {
    if ("plusi".equals(paramString)) {
      return a.a;
    }
    if ("plusdatamixer".equals(paramString)) {
      return b.a;
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cur
 * JD-Core Version:    0.7.0.1
 */