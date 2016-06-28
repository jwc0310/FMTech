import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.SortedSet;

final class igc
  implements ifx
{
  private static final ifz a = new igd();
  
  public final ify a(int paramInt1, int paramInt2)
  {
    return new ify(paramInt1, paramInt2, a);
  }
  
  public final ify a(Bitmap paramBitmap)
  {
    return new ify(paramBitmap.getWidth(), paramBitmap.getHeight(), a);
  }
  
  public final ify a(ify paramify, SortedSet<ify> paramSortedSet, iga paramiga)
  {
    Iterator localIterator = paramSortedSet.iterator();
    while (localIterator.hasNext())
    {
      ify localify = (ify)localIterator.next();
      if ((localify.b >= paramify.b) && (localify.a >= paramify.a) && ((paramiga == iga.b) || ((localify.b == paramify.b) && (localify.a == paramify.a)))) {
        return localify;
      }
    }
    return null;
  }
  
  public final void a(ify paramify, Bitmap paramBitmap) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igc
 * JD-Core Version:    0.7.0.1
 */