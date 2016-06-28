final class dcg
{
  public int a;
  public int b;
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    dcg localdcg;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localdcg = (dcg)paramObject;
    } while ((this.b == localdcg.b) && (this.a == localdcg.a));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * this.a + this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcg
 * JD-Core Version:    0.7.0.1
 */