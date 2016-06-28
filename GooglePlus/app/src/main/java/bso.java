import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

final class bso
{
  bsn a;
  String b;
  int c = 0;
  boolean d = false;
  LinkedHashMap<String, bme> e = new LinkedHashMap();
  HashMap<String, Integer> f = new HashMap();
  HashMap<String, Integer> g = new HashMap();
  private Context h;
  private int i;
  private int j = 0;
  private int k;
  
  bso(Context paramContext, int paramInt1, bup parambup, bsn parambsn, int paramInt2)
  {
    this.h = paramContext;
    this.i = paramInt1;
    this.a = parambsn;
    this.k = 4000;
    long l = bgp.a(this.h, paramInt1, dnn.b);
    this.b = null;
    int m = 0;
    int n = bsp.a(paramContext, paramInt1, parambsn);
    if (parambup != null) {
      parambup.f = (n + parambup.f);
    }
    ojb localojb = aum.b(this.h, this.i);
    boolean bool;
    switch (bsa.a[this.a.ordinal()])
    {
    case 3: 
    case 4: 
    default: 
      bool = false;
    }
    String str1;
    for (;;)
    {
      if ((parambup == null) || (!parambup.b()))
      {
        if (Log.isLoggable("EsTileSync", 4))
        {
          int i2 = this.k - this.j;
          new StringBuilder(80).append("Getting equivalence tokens, request ").append(m).append(" with maxItemsPerPage=").append(i2);
        }
        kcg localkcg = new kcg(this.h, this.i, parambup);
        bme localbme = new bme(this.h, localkcg, paramInt1);
        localbme.a = this.b;
        localbme.b = true;
        localbme.c = bool;
        localbme.d = Integer.valueOf(this.k - this.j);
        localbme.e = Integer.valueOf(paramInt2);
        localbme.f = Long.valueOf(l);
        localbme.i();
        localbme.d("EsTileSync");
        this.c = localbme.g.a;
        if ((this.c != 2) || (this.a == bsn.c))
        {
          if (parambup != null) {
            parambup.g = (1 + parambup.g);
          }
          Iterator localIterator = new bmf(localbme).iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              String str2 = (String)localIterator.next();
              this.e.put(str2, localbme);
              continue;
              bool = true;
              m = 0;
              break;
              if (localojb.e.booleanValue())
              {
                bool = true;
                m = 0;
                break;
              }
              bool = false;
              m = 0;
              break;
              if (localojb.d.booleanValue())
              {
                bool = true;
                m = 0;
                break;
              }
              bool = false;
              m = 0;
              break;
            }
          }
          this.j += localbme.g.c.length;
          a(localbme);
          str1 = localbme.g.b;
          if ((str1 != null) && (str1.length() > 0) && (str1.equals(this.b))) {
            if (!Log.isLoggable("EsTileSync", 5)) {
              break label675;
            }
          }
        }
      }
    }
    label675:
    for (int i1 = m;; i1 = m)
    {
      do
      {
        if (Log.isLoggable("EsTileSync", 4)) {
          new StringBuilder(68).append("Finished getting equivalence tokens with ").append(i1).append(" requests issued");
        }
        return;
        this.b = str1;
        i1 = m + 1;
      } while ((i1 >= n) || (this.b == null) || (this.b.length() <= 0) || (this.k - this.j <= 0));
      m = i1;
      break;
    }
  }
  
  private final void a(bme parambme)
  {
    nrp localnrp = parambme.g;
    for (int m = 0; m < localnrp.c.length; m++)
    {
      pss localpss = localnrp.c[m];
      if (localpss.d != null)
      {
        this.d = true;
        this.f.put(localpss.a, localpss.d.a);
      }
      if (localpss.e != null)
      {
        this.d = true;
        this.g.put(localpss.a, localpss.e.a);
      }
    }
  }
  
  public final int a(String paramString)
  {
    Integer localInteger = (Integer)this.f.get(paramString);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public final boolean a(bsf parambsf)
  {
    if (this.c == 2) {
      return true;
    }
    Iterator localIterator1 = parambsf.c.keySet().iterator();
    Iterator localIterator2 = this.e.keySet().iterator();
    while (localIterator2.hasNext())
    {
      String str = (String)localIterator2.next();
      if (!localIterator1.hasNext()) {
        return false;
      }
      if (!str.equals((String)localIterator1.next())) {
        return false;
      }
      if (!parambsf.a(str, ((bme)this.e.get(str)).a(str))) {
        return false;
      }
    }
    return !localIterator1.hasNext();
  }
  
  public final int b(String paramString)
  {
    Integer localInteger = (Integer)this.g.get(paramString);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public final ArrayList<String> b(bsf parambsf)
  {
    if (this.a == bsn.c)
    {
      ArrayList localArrayList1 = new ArrayList();
      Iterator localIterator1 = this.e.keySet().iterator();
      while (localIterator1.hasNext()) {
        localArrayList1.add((String)localIterator1.next());
      }
      return localArrayList1;
    }
    ArrayList localArrayList2 = new ArrayList();
    if (this.c == 2) {
      return localArrayList2;
    }
    Iterator localIterator2 = this.e.keySet().iterator();
    while (localIterator2.hasNext())
    {
      String str1 = (String)localIterator2.next();
      String str2 = ((bme)this.e.get(str1)).a(str1);
      if ((str2 != null) && (!parambsf.a(str1, str2))) {
        localArrayList2.add(str1);
      }
    }
    return localArrayList2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bso
 * JD-Core Version:    0.7.0.1
 */