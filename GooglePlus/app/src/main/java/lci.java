import android.os.Build.VERSION;
import android.widget.ListView;

final class lci
  implements Runnable
{
  lci(lch paramlch) {}
  
  public final void run()
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      lcg locallcg2 = this.a.a;
      locallcg2.a.scrollListBy(locallcg2.c * locallcg2.e);
      return;
    }
    lcg locallcg1 = this.a.a;
    locallcg1.a.smoothScrollBy(locallcg1.c * locallcg1.e, (int)locallcg1.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lci
 * JD-Core Version:    0.7.0.1
 */