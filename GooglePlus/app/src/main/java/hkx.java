import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;

final class hkx
  implements Runnable
{
  private final Uri a;
  
  public hkx(hkw paramhkw, Uri paramUri)
  {
    this.a = paramUri;
  }
  
  public final void run()
  {
    hkw localhkw = this.b;
    Uri localUri = this.a;
    HashSet localHashSet = (HashSet)localhkw.a.get(localUri);
    if (localHashSet != null)
    {
      int i = localhkw.b(localUri);
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext()) {
        ((hhm)localIterator.next()).c(i);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hkx
 * JD-Core Version:    0.7.0.1
 */