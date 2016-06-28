public final class gjj
{
  public final String a;
  public final int b;
  public final boolean c;
  
  public gjj(gjk paramgjk)
  {
    this.a = paramgjk.a;
    this.b = paramgjk.b;
    this.c = false;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    gjj localgjj;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localgjj = (gjj)paramObject;
    } while ((this.c == localgjj.c) && (efj.c(this.a, localgjj.a)));
    return false;
  }
  
  public final int hashCode()
  {
    int i = 31 * this.a.hashCode();
    if (this.c) {}
    for (int j = 1;; j = 0) {
      return j + i;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjj
 * JD-Core Version:    0.7.0.1
 */