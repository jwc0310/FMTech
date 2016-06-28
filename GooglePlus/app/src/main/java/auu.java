import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class auu
{
  private final Context a;
  private Map<auv, String> b = new HashMap();
  
  private auu(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static auu a(Context paramContext, auy paramauy, List<Integer> paramList)
  {
    auu localauu = new auu(paramContext);
    for (Uri localUri : itf.c)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        int k = ((Integer)localIterator.next()).intValue();
        String str = paramauy.a(k, localUri);
        localauu.b.put(new auv(localUri, k), str);
      }
    }
    return localauu;
  }
  
  public final List<dmn> a(auu paramauu)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator1 = this.b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      auv localauv = (auv)localIterator1.next();
      String str1 = (String)this.b.get(localauv);
      String str2 = (String)paramauu.b.get(localauv);
      if ((str2 == null) || (!TextUtils.equals(str1, str2)))
      {
        Object localObject = (List)localHashMap.get(Integer.valueOf(localauv.b));
        if (localObject == null)
        {
          localObject = new ArrayList();
          localHashMap.put(Integer.valueOf(localauv.b), localObject);
        }
        ((List)localObject).add(localauv.a);
      }
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = localHashMap.keySet().iterator();
    while (localIterator2.hasNext())
    {
      int i = ((Integer)localIterator2.next()).intValue();
      localArrayList.add(new dmn(i, (List)localHashMap.get(Integer.valueOf(i))));
    }
    return localArrayList;
  }
  
  public final void a()
  {
    ContentValues localContentValues = new ContentValues();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      auv localauv = (auv)localIterator.next();
      SQLiteDatabase localSQLiteDatabase = bqj.a(this.a, localauv.b).getWritableDatabase();
      localContentValues.clear();
      String str1 = (String)this.b.get(localauv);
      String str2 = localauv.a.toString();
      localContentValues.put("media_store_uri", str2);
      localContentValues.put("media_store_token", str1);
      if (localSQLiteDatabase.update("all_photos_local_sync", localContentValues, "media_store_uri = ?", new String[] { str2 }) == 0) {
        localSQLiteDatabase.insert("all_photos_local_sync", null, localContentValues);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     auu
 * JD-Core Version:    0.7.0.1
 */