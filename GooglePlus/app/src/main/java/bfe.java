import java.util.Iterator;
import java.util.Set;

final class bfe
  implements Runnable
{
  bfe(bfd parambfd) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.c.iterator();
    while (localIterator.hasNext()) {
      ((bfh)localIterator.next()).a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bfe
 * JD-Core Version:    0.7.0.1
 */