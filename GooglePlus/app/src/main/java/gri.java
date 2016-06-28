import android.content.Context;
import java.util.Map;

public final class gri
{
  private static final Map<otk, grc> a = new kl();
  
  static grc a(Context paramContext, otk paramotk, pbn parampbn, qrf paramqrf, qrl paramqrl, oyg<grr, qrq> paramoyg, oxb paramoxb, giz paramgiz, grb paramgrb)
  {
    synchronized (a)
    {
      if (a.containsKey(paramotk))
      {
        grc localgrc2 = (grc)a.get(paramotk);
        return localgrc2;
      }
      grc localgrc1 = new grc(paramContext, paramotk, parampbn, paramqrf, paramqrl, paramoyg, paramoxb, paramgiz, paramgrb);
      a.put(paramotk, localgrc1);
      return localgrc1;
    }
  }
  
  static oyi<grr, qrq> a()
  {
    oyj localoyj = new oyj();
    localoyj.a = 1024;
    if (localoyj.a > 0) {}
    for (boolean bool = true;; bool = false)
    {
      aau.a(bool, "The maximum cache size must be a positive integer");
      return new oyi(localoyj.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gri
 * JD-Core Version:    0.7.0.1
 */