import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class hvc
  implements hum
{
  private final Map<String, huu> a = new kl();
  private final Map<String, huu> b = new kl();
  private final Map<String, huu> c = new kl();
  
  private static void a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4)
  {
    ArrayList localArrayList1 = new ArrayList(1);
    localArrayList1.add(paramString1);
    ArrayList localArrayList2 = new ArrayList(1);
    localArrayList2.add(paramString2);
    gzj.a(paramContext, new hve(paramContext, paramInt1, new hus(paramInt2, localArrayList1, localArrayList2, paramInt3, System.currentTimeMillis(), paramInt4)));
  }
  
  private static void a(Context paramContext, int paramInt1, int paramInt2, Map<String, huu> paramMap, int paramInt3)
  {
    if (!paramMap.isEmpty())
    {
      SparseArray localSparseArray = new SparseArray();
      ArrayList localArrayList1 = new ArrayList();
      Iterator localIterator1 = paramMap.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        int m = ((huu)localEntry.getValue()).c;
        Object localObject = (List)localSparseArray.get(m);
        if (localObject == null)
        {
          localObject = new ArrayList();
          localSparseArray.put(m, localObject);
        }
        ((List)localObject).add(localEntry.getValue());
      }
      for (int i = 0; i < localSparseArray.size(); i++)
      {
        int j = localSparseArray.keyAt(i);
        List localList = (List)localSparseArray.valueAt(i);
        ArrayList localArrayList2 = new ArrayList(localList.size());
        ArrayList localArrayList3 = new ArrayList(localList.size());
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          huu localhuu = (huu)localIterator2.next();
          localArrayList2.add(localhuu.a);
          localArrayList3.add(localhuu.b);
        }
        if (Log.isLoggable("SuggestionLoggerService", 3))
        {
          int k = localArrayList2.size();
          new StringBuilder(61).append("Insert ").append(k).append(paramInt3).append(" suggestion events into database");
        }
        localArrayList1.add(new hus(paramInt3, localArrayList2, localArrayList3, paramInt2, System.currentTimeMillis(), j));
      }
      if (!localArrayList1.isEmpty()) {
        gzj.a(paramContext, new hvf(paramContext, paramInt1, localArrayList1));
      }
    }
  }
  
  private static void a(Map<String, huu> paramMap, String paramString1, String paramString2, int paramInt)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      paramMap.put(paramString1, new huu(paramString1, paramString2, paramInt));
    }
  }
  
  public final void a(Context paramContext, int paramInt)
  {
    ((hvi)mbb.a(paramContext, hvi.class)).a(paramContext, paramInt);
  }
  
  public final void a(Context paramContext, int paramInt1, int paramInt2)
  {
    a(paramContext, paramInt1, paramInt2, this.a, 1);
    a(paramContext, paramInt1, paramInt2, this.b, 3);
    a(paramContext, paramInt1, paramInt2, this.c, 5);
    this.a.clear();
    this.b.clear();
    this.c.clear();
  }
  
  public final void a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    a(paramContext, paramInt1, 2, paramString1, paramString2, paramInt2, paramInt3);
  }
  
  public final void a(huv paramhuv, View paramView)
  {
    Iterator localIterator = paramhuv.a(paramView).iterator();
    while (localIterator.hasNext())
    {
      huu localhuu = (huu)localIterator.next();
      Map localMap = this.a;
      if ((!TextUtils.isEmpty(localhuu.a)) && (!TextUtils.isEmpty(localhuu.b))) {
        localMap.put(localhuu.a, localhuu);
      }
      if (Log.isLoggable("SuggestionLoggerService", 3))
      {
        String str1 = String.valueOf("Record the SHOW suggestion event - personId: ");
        String str2 = String.valueOf(localhuu.a);
        String str3 = String.valueOf(localhuu.b);
        int i = localhuu.c;
        new StringBuilder(43 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str1).append(str2).append(", suggestionId: ").append(str3).append(", actionSource: ").append(i);
      }
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    a(this.b, paramString1, paramString2, paramInt);
  }
  
  public final boolean a(Context paramContext, int paramInt1, int paramInt2, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, int paramInt3, int paramInt4, long paramLong)
  {
    hvd localhvd = new hvd(paramContext, paramInt1, 34, paramArrayList1, null, 3, paramLong, 216);
    localhvd.i();
    return !localhvd.n();
  }
  
  public final void b(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    a(paramContext, paramInt1, 4, paramString1, paramString2, paramInt2, paramInt3);
  }
  
  public final void b(String paramString1, String paramString2, int paramInt)
  {
    a(this.c, paramString1, paramString2, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvc
 * JD-Core Version:    0.7.0.1
 */