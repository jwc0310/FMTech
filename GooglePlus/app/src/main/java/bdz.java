import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bdz
  implements bej
{
  private final List<bek> a = new ArrayList();
  private boolean b;
  
  public final void a(bek parambek)
  {
    this.a.add(parambek);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((bek)localIterator.next()).a(paramBoolean);
    }
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final void b(bek parambek)
  {
    this.a.remove(parambek);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdz
 * JD-Core Version:    0.7.0.1
 */