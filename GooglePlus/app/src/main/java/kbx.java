import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class kbx
{
  public kby a;
  public long b;
  long c;
  long d;
  public long e;
  private final kl<String, kby> f = new kl();
  
  public final void a(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList(this.f.keySet());
    Collections.sort(localArrayList);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = String.valueOf(this.f.get(str1));
      new StringBuilder(0 + String.valueOf(paramString2).length() + String.valueOf(str2).length()).append(paramString2).append(str2);
    }
  }
  
  public final void a(String paramString, String[] paramArrayOfString)
  {
    this.a = ((kby)this.f.get(paramString));
    if (this.a == null)
    {
      this.a = new kby();
      this.a.a = paramString;
      this.a.j = paramArrayOfString;
      this.f.put(paramString, this.a);
    }
    this.b = System.currentTimeMillis();
    this.d = 0L;
  }
  
  public final void a(kcc paramkcc)
  {
    kby localkby1 = this.a;
    localkby1.e += paramkcc.b;
    kby localkby2 = this.a;
    localkby2.f += paramkcc.a;
    kby localkby3 = this.a;
    localkby3.d += paramkcc.c;
    this.a.i = paramkcc.d;
    this.a.g = paramkcc.e;
    kl localkl = this.a.h;
    la localla = paramkcc.f;
    int i = localla.c;
    localkl.a(i + localkl.c);
    int j = localkl.c;
    int k = 0;
    if (j == 0) {
      if (i > 0)
      {
        System.arraycopy(localla.a, 0, localkl.a, 0, i);
        System.arraycopy(localla.b, 0, localkl.b, 0, i << 1);
        localkl.c = i;
      }
    }
    for (;;)
    {
      return;
      while (k < i)
      {
        localkl.put(localla.b[(k << 1)], localla.b[(1 + (k << 1))]);
        k++;
      }
    }
  }
  
  public final String[] a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.f.values().iterator();
    while (localIterator.hasNext()) {
      Collections.addAll(localArrayList, ((kby)localIterator.next()).j);
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  public final String b()
  {
    if (!this.f.isEmpty()) {
      return (String)this.f.keySet().iterator().next();
    }
    return "Unknown";
  }
  
  public final long c()
  {
    Iterator localIterator = new ArrayList(this.f.keySet()).iterator();
    String str;
    for (long l = 0L; localIterator.hasNext(); l += ((kby)this.f.get(str)).b) {
      str = (String)localIterator.next();
    }
    return l;
  }
  
  public final long d()
  {
    Iterator localIterator = new ArrayList(this.f.keySet()).iterator();
    String str;
    for (long l = 0L; localIterator.hasNext(); l += ((kby)this.f.get(str)).c) {
      str = (String)localIterator.next();
    }
    return l;
  }
  
  public final long e()
  {
    Iterator localIterator = new ArrayList(this.f.keySet()).iterator();
    String str;
    for (long l = 0L; localIterator.hasNext(); l += ((kby)this.f.get(str)).d) {
      str = (String)localIterator.next();
    }
    return l;
  }
  
  public final long f()
  {
    Iterator localIterator = new ArrayList(this.f.keySet()).iterator();
    String str;
    for (long l = 0L; localIterator.hasNext(); l += ((kby)this.f.get(str)).e) {
      str = (String)localIterator.next();
    }
    return l;
  }
  
  public final long g()
  {
    Iterator localIterator = new ArrayList(this.f.keySet()).iterator();
    String str;
    for (long l = 0L; localIterator.hasNext(); l += ((kby)this.f.get(str)).f) {
      str = (String)localIterator.next();
    }
    return l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbx
 * JD-Core Version:    0.7.0.1
 */