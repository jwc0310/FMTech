public final class eew<O extends eey>
{
  final String a;
  private final eex<?, O> b;
  private final x c;
  private final efc<?> d;
  private final efj e;
  
  public <C extends efb> eew(String paramString, eex<C, O> parameex, efc<C> paramefc)
  {
    efj.b(parameex, "Cannot construct an Api with a null ClientBuilder");
    efj.b(paramefc, "Cannot construct an Api with a null ClientKey");
    this.a = paramString;
    this.b = parameex;
    this.c = null;
    this.d = paramefc;
    this.e = null;
  }
  
  public final eex<?, O> a()
  {
    if (this.b != null) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.b;
    }
  }
  
  public final efc<?> b()
  {
    if (this.d != null) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
      return this.d;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eew
 * JD-Core Version:    0.7.0.1
 */