import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class guh
  implements gva
{
  guh(gug paramgug) {}
  
  public final void a(int paramInt1, int paramInt2)
  {
    gux localgux = this.a.a.c;
    Integer localInteger = Integer.valueOf(paramInt2);
    List localList = (List)localgux.a.remove(localInteger);
    if (localList == null) {
      localList = Collections.emptyList();
    }
    if (!localList.isEmpty())
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        gud localgud = (gud)localIterator.next();
        gug.a(this.a, paramInt1, localgud);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     guh
 * JD-Core Version:    0.7.0.1
 */