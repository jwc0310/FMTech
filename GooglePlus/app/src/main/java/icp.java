import java.util.Map;

public final class icp
{
  private final Map<rac, rgq<ico>> a;
  
  icp(Map<rac, rgq<ico>> paramMap)
  {
    this.a = paramMap;
  }
  
  public final boolean a(qzz paramqzz1, qzz paramqzz2, Map<String, qzz> paramMap1, Map<String, qzz> paramMap2)
  {
    if ((paramqzz1 == paramqzz2) && (paramMap1 == paramMap2)) {
      return true;
    }
    if ((paramqzz1.o() == paramqzz2.o()) && (paramqzz1.c.equals(paramqzz2.c))) {}
    for (int i = 1; i == 0; i = 0) {
      return false;
    }
    rac localrac = paramqzz1.o();
    rgq localrgq = (rgq)this.a.get(localrac);
    if (localrgq == null) {
      return true;
    }
    localrgq.a();
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     icp
 * JD-Core Version:    0.7.0.1
 */