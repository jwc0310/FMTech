import java.util.Iterator;
import java.util.Set;

final class bff
  implements Runnable
{
  bff(bfd parambfd, Set paramSet, aip paramaip) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((bfg)localIterator.next()).a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bff
 * JD-Core Version:    0.7.0.1
 */