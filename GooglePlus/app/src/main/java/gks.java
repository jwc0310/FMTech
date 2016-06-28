import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gks
  implements gkr
{
  private final giz a;
  private final gjm b;
  
  gks(Context paramContext)
  {
    this.a = ((giz)mbb.a(paramContext, giz.class));
    this.b = ((gjm)mbb.a(paramContext, gjm.class));
  }
  
  private final void a(int paramInt, List<Integer> paramList)
  {
    gjb localgjb1 = this.a.a(paramInt);
    if (localgjb1.c("is_managed_account")) {}
    for (;;)
    {
      return;
      String str = localgjb1.b("account_name");
      List localList = this.a.a();
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        Integer localInteger = (Integer)localList.get(j);
        gjb localgjb2 = this.a.a(localInteger.intValue());
        if ((localgjb2.c("is_managed_account")) && (localgjb2.b("account_name").equals(str))) {
          paramList.add(localInteger);
        }
      }
    }
  }
  
  public final void a()
  {
    ArrayList localArrayList;
    for (;;)
    {
      int m;
      try
      {
        HashMap localHashMap = new HashMap();
        gjj[] arrayOfgjj = this.b.a();
        int i = arrayOfgjj.length;
        int j = 0;
        if (j < i)
        {
          gjj localgjj = arrayOfgjj[j];
          localHashMap.put(localgjj.a, Integer.valueOf(localgjj.b));
          j++;
          continue;
        }
        localArrayList = new ArrayList();
        Iterator localIterator1 = this.a.a().iterator();
        if (!localIterator1.hasNext()) {
          break;
        }
        m = ((Integer)localIterator1.next()).intValue();
        gjb localgjb = this.a.a(m);
        if (localgjb.b("effective_gaia_id") != null) {
          continue;
        }
        String str = localgjb.b("account_name");
        if (localHashMap.containsKey(str))
        {
          if (((Integer)localHashMap.get(str)).intValue() == localgjb.a("device_index", -1)) {
            continue;
          }
          this.a.b(m).b("device_index", ((Integer)localHashMap.get(str)).intValue()).d();
          continue;
        }
        localArrayList.add(Integer.valueOf(m));
      }
      finally {}
      a(m, localArrayList);
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      int k = ((Integer)localIterator2.next()).intValue();
      this.a.f(k);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gks
 * JD-Core Version:    0.7.0.1
 */