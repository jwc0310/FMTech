import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class lnh
  implements llm
{
  private final Context a;
  private final lni b;
  
  lnh(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((lni)mbb.a(paramContext, lni.class));
  }
  
  private static String a(oqw paramoqw)
  {
    if ((paramoqw == null) || (paramoqw.b == null))
    {
      Log.e("BundleItemStoreExt", "Attempting to get ID of invalid StreamItem.");
      return null;
    }
    return paramoqw.b.b;
  }
  
  private static boolean a(ohx paramohx)
  {
    if ((paramohx == null) || (paramohx.b == 0))
    {
      Log.e("BundleItemStoreExt", "BundleItem is invalid.");
      return false;
    }
    return true;
  }
  
  private final List<llh> b()
  {
    ArrayList localArrayList1 = new ArrayList(this.b.a.keySet());
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    int i = localArrayList1.size();
    for (int j = 0; j < i; j++)
    {
      lni locallni = this.b;
      Object localObject = localArrayList1.get(j);
      localArrayList2.add((llh)locallni.a.get(localObject));
    }
    return localArrayList2;
  }
  
  private final llh b(int paramInt)
  {
    lni locallni = this.b;
    Integer localInteger = Integer.valueOf(paramInt);
    llh localllh = (llh)locallni.a.get(localInteger);
    if (localllh == null) {
      Log.e("BundleItemStoreExt", 61 + "Cannot find BundleStoreExtension for bundle type: " + paramInt);
    }
    return localllh;
  }
  
  private static ohx b(oqw paramoqw)
  {
    if ((paramoqw == null) || (paramoqw.a != 6))
    {
      Log.e("BundleItemStoreExt", "Attempting to extract BundleItem extension from non-BundleItem StreamItem.");
      return null;
    }
    return (ohx)paramoqw.b(ohx.a);
  }
  
  public final String a(int paramInt, oqw paramoqw)
  {
    String str = a(paramoqw);
    ohx localohx = b(paramoqw);
    if ((TextUtils.isEmpty(str)) || (!a(localohx))) {}
    llh localllh;
    do
    {
      return null;
      localllh = b(localohx.b);
    } while (localllh == null);
    return localllh.b();
  }
  
  public final ArrayList<Integer> a(Context paramContext, int paramInt)
  {
    List localList = b();
    HashSet localHashSet = new HashSet();
    int i = localList.size();
    for (int j = 0; j < i; j++)
    {
      ArrayList localArrayList = ((llh)localList.get(j)).d();
      if (localArrayList != null) {
        localHashSet.addAll(localArrayList);
      }
    }
    return new ArrayList(localHashSet);
  }
  
  public final void a(Context paramContext, int paramInt1, SQLiteDatabase paramSQLiteDatabase, oqw paramoqw, int paramInt2, boolean paramBoolean)
  {
    String str = a(paramoqw);
    ohx localohx = b(paramoqw);
    if ((TextUtils.isEmpty(str)) || (!a(localohx))) {}
    while (b(localohx.b) != null) {
      return;
    }
  }
  
  public final boolean a(int paramInt)
  {
    return ((lln)mbb.a(this.a, lln.class)).h(paramInt);
  }
  
  public final boolean a(Context paramContext, int paramInt1, SQLiteDatabase paramSQLiteDatabase, oqw paramoqw, String paramString1, long paramLong, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    String str = a(paramoqw);
    ohx localohx = b(paramoqw);
    if ((TextUtils.isEmpty(str)) || (!a(localohx))) {}
    llh localllh;
    do
    {
      return false;
      localllh = b(localohx.b);
    } while (localllh == null);
    return localllh.c();
  }
  
  public final ArrayList<Integer> b(Context paramContext, int paramInt)
  {
    List localList = b();
    HashSet localHashSet = new HashSet();
    int i = localList.size();
    for (int j = 0; j < i; j++)
    {
      ArrayList localArrayList = ((llh)localList.get(j)).e();
      if (localArrayList != null) {
        localHashSet.addAll(localArrayList);
      }
    }
    return new ArrayList(localHashSet);
  }
  
  public final ArrayList<Integer> c(Context paramContext, int paramInt)
  {
    List localList = b();
    HashSet localHashSet = new HashSet();
    int i = localList.size();
    for (int j = 0; j < i; j++)
    {
      ArrayList localArrayList = ((llh)localList.get(j)).f();
      if (localArrayList != null) {
        localHashSet.addAll(localArrayList);
      }
    }
    return new ArrayList(localHashSet);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnh
 * JD-Core Version:    0.7.0.1
 */