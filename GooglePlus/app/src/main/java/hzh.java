import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public final class hzh
  extends hyj
  implements hyg, hyk
{
  private static final mcq c = new mcq("debug.experiments");
  final ArrayList<hyg> b = new ArrayList();
  private List<hyf> d;
  private List<hyf> e;
  private HashSet<String> f;
  private boolean g;
  private final la<String, Map<String, String>> h = new la(2);
  private final hze i;
  private final hyh j;
  private final hzb k;
  
  public hzh(Context paramContext, hze paramhze, hyh paramhyh)
  {
    super(paramContext);
    this.i = paramhze;
    this.j = paramhyh;
    this.i.a(this);
    this.k = new hzb(paramContext);
  }
  
  private final void c()
  {
    for (;;)
    {
      try
      {
        if (this.g) {
          return;
        }
        List localList = mbb.c(this.a, hyf.class);
        String str;
        try
        {
          if (this.g) {
            break label176;
          }
          this.d = localList;
          this.f = new HashSet(this.d.size());
          ListIterator localListIterator = this.d.listIterator();
          if (!localListIterator.hasNext()) {
            break;
          }
          hyf localhyf = (hyf)localListIterator.next();
          str = localhyf.d;
          if ("placeholder_id".equals(str))
          {
            if (this.e == null) {
              this.e = new ArrayList();
            }
            this.e.add(localhyf);
            localListIterator.remove();
            continue;
            localObject1 = finally;
          }
        }
        finally {}
        this.f.add(str);
      }
      finally {}
    }
    this.g = true;
    label176:
  }
  
  public final String a(hyf paramhyf, String paramString)
  {
    String str1 = paramhyf.b;
    c();
    String str2 = paramhyf.d;
    if (!this.f.contains(str2))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramhyf.d;
      Log.e("ExperimentServiceImpl", String.format("Experiment %s has not been registered", arrayOfObject));
    }
    for (;;)
    {
      synchronized (this.h)
      {
        Map localMap = (Map)this.h.get(paramString);
        if (localMap == null)
        {
          localMap = this.i.a(paramString);
          if (localMap != null) {
            this.h.put(paramString, localMap);
          }
        }
        if (localMap == null) {
          break label254;
        }
        localObject2 = (String)localMap.get(str2);
        if (localObject2 != null)
        {
          int m = paramhyf.c;
          switch (hzj.a[(m - 1)])
          {
          default: 
            n = 0;
            if (n != 0)
            {
              String str3 = paramhyf.e.a;
              if (str3 == null) {
                str3 = this.j.a(paramhyf);
              }
              if (str3 != null) {
                localObject2 = str3;
              }
            }
            return localObject2;
          }
        }
      }
      Object localObject2 = str1;
      continue;
      int n = 1;
      continue;
      n = 0;
      continue;
      n = 0;
      continue;
      label254:
      localObject2 = str1;
    }
  }
  
  public final List<hyf> a()
  {
    c();
    return Collections.unmodifiableList(this.d);
  }
  
  public final void a(hyg paramhyg)
  {
    this.b.add(paramhyg);
  }
  
  public final boolean a(String paramString)
  {
    List localList = a();
    int m = localList.size();
    ArrayList localArrayList = new ArrayList(m);
    for (int n = 0; n < m; n++) {
      localArrayList.add(((hyf)localList.get(n)).d);
    }
    return this.i.a(localArrayList, paramString);
  }
  
  public final long b(String paramString)
  {
    return this.k.c(paramString);
  }
  
  public final List<hyf> b()
  {
    c();
    if (this.e == null) {
      return Collections.unmodifiableList(this.d);
    }
    ArrayList localArrayList = new ArrayList(this.d);
    localArrayList.addAll(this.e);
    return Collections.unmodifiableList(localArrayList);
  }
  
  public final void b(hyg paramhyg)
  {
    this.b.remove(paramhyg);
  }
  
  public final void g()
  {
    synchronized (this.h)
    {
      this.h.clear();
      hzi localhzi = new hzi(this);
      efj.m().post(localhzi);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzh
 * JD-Core Version:    0.7.0.1
 */