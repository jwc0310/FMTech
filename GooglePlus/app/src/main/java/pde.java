public final class pde
{
  public final pdl a;
  
  pde(pdl parampdl)
  {
    this.a = parampdl;
  }
  
  public final void a(Class<?> paramClass, String paramString)
  {
    pdl localpdl = this.a;
    String str = String.valueOf(paramClass.getSimpleName());
    localpdl.a(2 + String.valueOf(str).length() + String.valueOf(paramString).length() + str + ": " + paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pde
 * JD-Core Version:    0.7.0.1
 */