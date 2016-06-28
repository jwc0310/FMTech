import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class hsy
  implements hsv
{
  private final List<hsu> a;
  
  public hsy(Context paramContext)
  {
    this.a = mbb.c(paramContext, hsu.class);
  }
  
  public final void a(Context paramContext, int paramInt, Object paramObject)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((hsu)localIterator.next()).a(paramContext, paramInt, paramObject);
    }
  }
  
  public final void a(Context paramContext, int paramInt, Object paramObject, Class<? extends hsu> paramClass)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      hsu localhsu = (hsu)localIterator.next();
      if (localhsu.getClass() != paramClass) {
        localhsu.a(paramContext, paramInt, paramObject);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsy
 * JD-Core Version:    0.7.0.1
 */