final class jsa
{
  final boolean a;
  final jsf b;
  
  private jsa(jsf paramjsf)
  {
    this(paramjsf, false);
  }
  
  jsa(jsf paramjsf, boolean paramBoolean)
  {
    this.b = paramjsf;
    this.a = paramBoolean;
  }
  
  public static jsa a(String paramString)
  {
    if (paramString.length() == 0) {
      throw new IllegalArgumentException("separator may not be empty or null");
    }
    return new jsa(new jsf(paramString));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsa
 * JD-Core Version:    0.7.0.1
 */