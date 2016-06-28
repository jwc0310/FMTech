public final class kva
  extends gxq
{
  public final int b;
  
  public kva(gxt paramgxt, int paramInt)
  {
    super(paramgxt);
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = super.equals(paramObject);
    boolean bool2 = false;
    if (bool1)
    {
      kva localkva = (kva)paramObject;
      int i = this.b;
      int j = localkva.b;
      bool2 = false;
      if (i == j) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    return this.b + 31 * super.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kva
 * JD-Core Version:    0.7.0.1
 */