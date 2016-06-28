import java.util.Map;

public final class kho
{
  private static final Map<otk, khk> a = new kl();
  
  static khk a(otk paramotk, pie parampie, pbn parampbn, oxb paramoxb, giz paramgiz, qux paramqux)
  {
    synchronized (a)
    {
      if (a.containsKey(paramotk))
      {
        khk localkhk2 = (khk)a.get(paramotk);
        return localkhk2;
      }
      khk localkhk1 = new khk(paramotk, parampie, parampbn, paramoxb, paramgiz, paramqux);
      a.put(paramotk, localkhk1);
      return localkhk1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kho
 * JD-Core Version:    0.7.0.1
 */