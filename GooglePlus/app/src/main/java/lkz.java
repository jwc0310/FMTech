import java.util.Map;

public final class lkz
{
  private static final Map<otk, lkg> a = new kl();
  
  static lkg a(otk paramotk, pie parampie, rgq<oxb> paramrgq, rgq<lje> paramrgq1, rgq<ljc> paramrgq2)
  {
    synchronized (a)
    {
      if (a.containsKey(paramotk))
      {
        lkg locallkg2 = (lkg)a.get(paramotk);
        return locallkg2;
      }
      lkg locallkg1 = new lkg(paramotk, parampie, (oxb)paramrgq.a(), (lje)paramrgq1.a(), paramrgq2);
      a.put(paramotk, locallkg1);
      return locallkg1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lkz
 * JD-Core Version:    0.7.0.1
 */