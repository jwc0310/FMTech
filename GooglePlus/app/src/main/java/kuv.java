public final class kuv
  extends gxq
{
  public final String b;
  
  public kuv(gxt paramgxt, String paramString)
  {
    super(paramgxt);
    this.b = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (super.equals(paramObject))
    {
      kuv localkuv = (kuv)paramObject;
      return efj.c(this.b, localkuv.b);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return efj.a(this.b, super.hashCode());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kuv
 * JD-Core Version:    0.7.0.1
 */