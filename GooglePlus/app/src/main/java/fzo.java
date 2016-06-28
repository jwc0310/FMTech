public class fzo
{
  public fnp a;
  
  public fzo()
  {
    this.a = null;
  }
  
  public fzo(fnp paramfnp)
  {
    this.a = paramfnp;
  }
  
  public String a()
  {
    if (this.a != null) {
      return this.a.a();
    }
    return null;
  }
  
  public boolean b()
  {
    return (this.a != null) && (this.a.b());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fzo
 * JD-Core Version:    0.7.0.1
 */