import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

final class aoo
  implements cmh<Long, Future>
{
  aoo(aol paramaol) {}
  
  public final List<Future> a(List<Long> paramList)
  {
    Future localFuture = ((app)mbb.a(this.a.a, app.class)).a(paramList, null);
    ArrayList localArrayList = new ArrayList(1);
    if (localFuture != null) {
      localArrayList.add(localFuture);
    }
    return localArrayList;
  }
  
  public final void b(List<Future> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      ((Future)localIterator.next()).cancel(false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aoo
 * JD-Core Version:    0.7.0.1
 */