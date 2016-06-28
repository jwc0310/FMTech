import android.annotation.TargetApi;

@TargetApi(12)
public final class ihh
  implements Comparable<ihh>
{
  public final ihw a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  
  public ihh(ihw paramihw, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramihw;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ihh localihh;
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (!(paramObject instanceof ihh)) {
          return false;
        }
        localihh = (ihh)paramObject;
        if (this.a != null) {
          break;
        }
      } while (localihh.a == null);
      return false;
    } while (this.a.equals(localihh.a));
    return false;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihh
 * JD-Core Version:    0.7.0.1
 */