final class asj
{
  final cv a;
  final int b;
  
  public asj(cv paramcv, int paramInt)
  {
    this.a = paramcv;
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    asj localasj;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localasj = (asj)paramObject;
      if (this.b != localasj.b) {
        return false;
      }
    } while (this.a.equals(localasj.a));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * this.a.hashCode() + this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     asj
 * JD-Core Version:    0.7.0.1
 */