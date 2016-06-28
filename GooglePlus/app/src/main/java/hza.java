import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class hza
{
  final hyh a;
  private final List<hyz> b;
  
  public hza(Context paramContext)
  {
    this.a = ((hyh)mbb.a(paramContext, hyh.class));
    this.b = mbb.c(paramContext, hyz.class);
  }
  
  final void a()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((hyz)localIterator.next()).aC_();
    }
  }
  
  public final boolean a(hyf paramhyf)
  {
    return this.a.a(paramhyf) != null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hza
 * JD-Core Version:    0.7.0.1
 */