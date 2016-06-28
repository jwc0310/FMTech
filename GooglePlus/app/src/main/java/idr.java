import java.util.Map;

public final class idr
{
  public qzz a;
  public Map<String, qzz> b;
  
  idr(qzz paramqzz, Map<String, qzz> paramMap, int paramInt)
  {
    if (paramqzz == null) {
      throw new NullPointerException();
    }
    this.a = ((qzz)paramqzz);
    if (paramMap == null) {
      throw new NullPointerException();
    }
    this.b = ((Map)paramMap);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof idr)) {
      return false;
    }
    idr localidr = (idr)paramObject;
    return this.a.c.equals(localidr.a.c);
  }
  
  public final int hashCode()
  {
    return this.a.c.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     idr
 * JD-Core Version:    0.7.0.1
 */