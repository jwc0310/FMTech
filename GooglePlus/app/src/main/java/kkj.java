import android.util.Log;
import java.util.Iterator;
import java.util.List;

final class kkj
  implements gvz
{
  final gwa a;
  
  public kkj(kkg paramkkg)
  {
    this.a = ((gwa)mbb.a(paramkkg.a, gwa.class));
  }
  
  private final void a()
  {
    ((iyl)mbb.a(this.b.a, iyl.class)).b(this.b.b);
  }
  
  public final void a(gvt paramgvt)
  {
    List localList = this.a.c(paramgvt.a);
    switch (kkh.a[paramgvt.b.ordinal()])
    {
    default: 
      return;
    case 1: 
      Iterator localIterator2 = localList.iterator();
      while (localIterator2.hasNext())
      {
        gvv localgvv2 = (gvv)localIterator2.next();
        this.b.g = Math.max(this.b.g, localgvv2.d);
        this.b.a(localgvv2.a);
      }
      switch (this.b.h.a)
      {
      default: 
        Log.e("NetworkQueueRequest", "Unknown state when media completed");
        return;
      }
      this.b.h.a = 2;
      a();
      return;
    }
    Iterator localIterator1 = this.a.c(paramgvt.a).iterator();
    while (localIterator1.hasNext())
    {
      gvv localgvv1 = (gvv)localIterator1.next();
      this.b.a(localgvv1.a);
    }
    Log.e("NetworkQueueRequest", "Album upload service reported an error");
    switch (this.b.h.a)
    {
    }
    for (;;)
    {
      this.b.h.a = 3;
      a();
      return;
      this.b.f = (this.b.e - paramgvt.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkj
 * JD-Core Version:    0.7.0.1
 */