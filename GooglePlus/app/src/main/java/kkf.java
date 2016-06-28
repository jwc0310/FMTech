import android.util.Log;
import java.util.Iterator;
import java.util.List;

final class kkf
  implements gvz
{
  kkf(kkc paramkkc) {}
  
  public final void a(gvt paramgvt)
  {
    List localList = this.a.b.c(paramgvt.a);
    switch (kkd.a[paramgvt.b.ordinal()])
    {
    default: 
      return;
    case 1: 
      Iterator localIterator2 = localList.iterator();
      while (localIterator2.hasNext())
      {
        gvv localgvv2 = (gvv)localIterator2.next();
        this.a.f = Math.max(this.a.f, localgvv2.d);
        this.a.a(localgvv2.a);
      }
      this.a.d = this.a.c;
      return;
    }
    if (this.a.c > 0)
    {
      this.a.d = (this.a.c - paramgvt.c);
      this.a.e = true;
    }
    Iterator localIterator1 = this.a.b.c(paramgvt.a).iterator();
    while (localIterator1.hasNext())
    {
      gvv localgvv1 = (gvv)localIterator1.next();
      this.a.a(localgvv1.a);
    }
    Log.e("NetworkQueueRequest", "Album upload service reported an error");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkf
 * JD-Core Version:    0.7.0.1
 */