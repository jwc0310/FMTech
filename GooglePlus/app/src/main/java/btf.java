import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class btf
{
  List<btg> a = new ArrayList();
  private int b;
  private int c;
  private int d;
  
  private bth c()
  {
    do
    {
      int i = 1 + this.b;
      this.b = i;
      if (i == this.a.size())
      {
        this.b = 0;
        this.c = (1 + this.c);
      }
    } while ((d() == null) && (this.c <= this.d));
    return d();
  }
  
  private final bth d()
  {
    btg localbtg = (btg)this.a.get(this.b);
    int i = this.c;
    if (i >= localbtg.d.size()) {
      return null;
    }
    return (bth)localbtg.d.get(i);
  }
  
  public final bth a(String paramString, int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    Object localObject1 = null;
    btg localbtg;
    Integer localInteger;
    Object localObject2;
    if (localIterator.hasNext())
    {
      localbtg = (btg)localIterator.next();
      localInteger = (Integer)localbtg.e.remove(btg.a(paramString, paramInt));
      if (localInteger == null)
      {
        localObject2 = null;
        label61:
        if (localObject2 == null) {
          break label132;
        }
      }
    }
    for (;;)
    {
      localObject1 = localObject2;
      break;
      localbtg.f = (-1 + localbtg.f);
      bth localbth = (bth)localbtg.d.set(localInteger.intValue(), null);
      localbtg.g -= localbth.e;
      localObject2 = localbth;
      break label61;
      return localObject1;
      label132:
      localObject2 = localObject1;
    }
  }
  
  public final void a()
  {
    this.b = -1;
    this.c = 0;
    this.d = 0;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      int i = -1 + ((btg)localIterator.next()).d.size();
      this.d = Math.max(this.d, i);
    }
  }
  
  public final void a(long paramLong)
  {
    a();
    while (paramLong > 0L)
    {
      bth localbth = c();
      if (localbth == null) {
        break;
      }
      paramLong -= localbth.e;
    }
    while (b() != null) {}
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      btg localbtg = (btg)localIterator.next();
      for (int i = -1 + localbtg.d.size(); (i >= 0) && (localbtg.d.get(i) == null); i--) {}
      if (i < -1 + localbtg.d.size()) {
        localbtg.d = new ArrayList(localbtg.d.subList(0, i + 1));
      }
    }
  }
  
  public final bth b()
  {
    bth localbth = c();
    if (localbth != null) {
      a(localbth.b, localbth.c);
    }
    return localbth;
  }
  
  public final String toString()
  {
    Iterator localIterator1 = this.a.iterator();
    int i = 0;
    while (localIterator1.hasNext()) {
      i += ((btg)localIterator1.next()).f;
    }
    long l = 0L;
    Iterator localIterator2 = this.a.iterator();
    while (localIterator2.hasNext()) {
      l += ((btg)localIterator2.next()).g;
    }
    return 76 + "{CacheEvictionPlan numEntries: " + i + ", totalBytes:" + l + "}";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btf
 * JD-Core Version:    0.7.0.1
 */