public final class bux
{
  public long a = 0L;
  public long b = 0L;
  
  public bux(String paramString)
  {
    int i = paramString.indexOf(':');
    if (i != -1)
    {
      this.a = Long.valueOf(paramString.substring(0, i)).longValue();
      this.b = Long.valueOf(paramString.substring(i + 1)).longValue();
    }
  }
  
  public final bux a()
  {
    this.b = (1L + this.b);
    this.a = System.currentTimeMillis();
    return this;
  }
  
  public final String toString()
  {
    return this.a + ':' + this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bux
 * JD-Core Version:    0.7.0.1
 */