public final class itt
  extends Exception
{
  private static final long serialVersionUID = -2575549139581664777L;
  public final String a;
  public final boolean b;
  
  public itt(Exception paramException, String paramString)
  {
    super(paramException);
    this.a = paramString;
    this.b = false;
  }
  
  public itt(String paramString)
  {
    this(paramString, null);
  }
  
  public itt(String paramString1, String paramString2)
  {
    super(paramString1);
    this.a = paramString2;
    this.b = false;
  }
  
  public itt(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.b = true;
    this.a = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     itt
 * JD-Core Version:    0.7.0.1
 */