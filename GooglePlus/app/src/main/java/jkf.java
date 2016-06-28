import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class jkf
  extends gzf
{
  private final jkg a;
  private final fyu b;
  
  jkf(Context paramContext, jkg paramjkg, fyu paramfyu)
  {
    super(paramContext, "UpdatePeopleTask");
    this.a = paramjkg;
    this.b = paramfyu;
  }
  
  protected final hae a()
  {
    int i = 0;
    jkg localjkg = this.a;
    fyu localfyu = this.b;
    if (jid.a())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(localfyu.aN_().a());
      arrayOfObject[1] = Integer.valueOf(localfyu.a().b());
      jid.a("CachedPeopleData#onLoadPeopleCompleted", String.format("isSuccess: %s. People count: %s", arrayOfObject));
    }
    fzl localfzl;
    if (localfyu.aN_().a())
    {
      localfzl = localfyu.a();
      if (localfzl == null) {}
    }
    for (;;)
    {
      long l;
      ArrayList localArrayList;
      kl localkl;
      try
      {
        int j = localfzl.b();
        l = 17L;
        int k = 0;
        if (k < j)
        {
          fzp localfzp = (fzp)localfzl.a(k);
          l = l * 31L + localfzp.k();
          k++;
          continue;
        }
        if (l == localjkg.h)
        {
          if (jid.a()) {
            jid.a("CachedPeopleData#onLoadPeopleCompleted", "People fingerprint unchanged.");
          }
          return new hae(true);
        }
        int m = localfzl.b();
        localArrayList = new ArrayList(m);
        localkl = new kl();
        if (i >= m) {
          break label371;
        }
        jlr localjlr = new jlr((fzp)localfzl.a(i), localjkg.b);
        Iterator localIterator1 = localjlr.i().iterator();
        if (localIterator1.hasNext())
        {
          String str = ((jgw)localIterator1.next()).b();
          Object localObject2 = (List)localkl.get(str);
          if (localObject2 == null)
          {
            localObject2 = new ArrayList();
            localkl.put(str, localObject2);
          }
          ((List)localObject2).add(localjlr);
          continue;
        }
        localArrayList.add(localjlr);
      }
      finally
      {
        localfzl.a();
      }
      i++;
      continue;
      label371:
      Iterator localIterator2 = localkl.values().iterator();
      while (localIterator2.hasNext()) {
        Collections.sort((List)localIterator2.next(), jkt.b);
      }
      try
      {
        localjkg.c = localArrayList;
        localjkg.d = localkl;
        localjkg.h = l;
        localfzl.a();
        localjkg.f = true;
        localjkg.e = localjkg.j.b();
        localjkg.a(4);
      }
      finally {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkf
 * JD-Core Version:    0.7.0.1
 */