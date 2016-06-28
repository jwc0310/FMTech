import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

final class hyb
{
  static final int[] d = { 0, 1, 2, 3, 4 };
  final int a;
  final Map<Short, hya> b = new HashMap();
  int c = 0;
  
  hyb(int paramInt)
  {
    this.a = paramInt;
  }
  
  protected final hya a(hya paramhya)
  {
    paramhya.f = this.a;
    return (hya)this.b.put(Short.valueOf(paramhya.b), paramhya);
  }
  
  protected final hya a(short paramShort)
  {
    return (hya)this.b.get(Short.valueOf(paramShort));
  }
  
  protected final hya[] a()
  {
    return (hya[])this.b.values().toArray(new hya[this.b.size()]);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof hyb))
    {
      hyb localhyb = (hyb)paramObject;
      if ((localhyb.a == this.a) && (localhyb.b.size() == this.b.size()))
      {
        for (hya localhya : localhyb.a())
        {
          short s = localhya.b;
          if ((!hxp.u.contains(Short.valueOf(s))) && (!localhya.equals((hya)this.b.get(Short.valueOf(localhya.b))))) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (527 + this.a) + this.b.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyb
 * JD-Core Version:    0.7.0.1
 */