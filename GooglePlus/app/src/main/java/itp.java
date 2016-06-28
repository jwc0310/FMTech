public final class itp
  extends itm
{
  private static final long serialVersionUID = 9057565284386560711L;
  public final boolean a;
  public final String b;
  
  public itp(String paramString, boolean paramBoolean)
  {
    super(40 + String.valueOf(paramString).length() + "Invalid content-type: " + paramString + ", permanent: " + paramBoolean);
    this.a = paramBoolean;
    this.b = paramString;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     itp
 * JD-Core Version:    0.7.0.1
 */