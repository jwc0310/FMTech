import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class bsf
{
  HashMap<String, ArrayList<String>> a = new HashMap();
  ArrayList<String> b = new ArrayList();
  LinkedHashMap<String, String> c = new LinkedHashMap();
  HashMap<String, Integer> d = new HashMap();
  HashMap<String, Integer> e = new HashMap();
  int f = 0;
  private final Context g;
  private final SQLiteDatabase h;
  private LinkedHashMap<String, String> i = new LinkedHashMap();
  
  public bsf(Context paramContext, int paramInt)
  {
    String[] arrayOfString = { jrf.a(paramContext, paramInt) };
    this.g = paramContext;
    this.h = bqj.a(this.g, paramInt).getWritableDatabase();
    a(paramContext, paramInt);
    this.c = a("view_id = ? AND media_attr & 512 == 0 AND type IN (1, 2, 3)", arrayOfString);
    this.i = a("type = 2", new String[0]);
  }
  
  private final LinkedHashMap<String, String> a(String paramString, String[] paramArrayOfString)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Cursor localCursor = this.h.query(true, "all_tiles", bry.b, paramString, paramArrayOfString, null, null, "view_order", null);
    for (;;)
    {
      try
      {
        if (!localCursor.moveToNext()) {
          break;
        }
        String str1 = jrf.e(localCursor.getString(0));
        if ((str1 != null) && (!str1.isEmpty()))
        {
          if ((Log.isLoggable("EsTileSync", 5)) && (localLinkedHashMap.containsKey(str1)))
          {
            String str2 = String.valueOf(str1);
            if (str2.length() != 0) {
              "We already found an equivalence token for collection ".concat(str2);
            }
          }
          else
          {
            localLinkedHashMap.put(str1, localCursor.getString(1));
            continue;
          }
          new String("We already found an equivalence token for collection ");
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    return localLinkedHashMap;
  }
  
  private final void a(Context paramContext, int paramInt)
  {
    String[] arrayOfString = { jrf.a(paramContext, paramInt) };
    Cursor localCursor = this.h.query(false, "all_tiles", bry.a, "view_id = ? AND media_attr & 512 == 0", arrayOfString, null, null, "view_order", null);
    for (;;)
    {
      String str1;
      Object localObject2;
      String str2;
      try
      {
        if (!localCursor.moveToNext()) {
          break label260;
        }
        this.f = (1 + this.f);
        str1 = localCursor.getString(0);
        localObject2 = localCursor.getString(1);
        str2 = localCursor.getString(2);
        String str3 = localCursor.getString(4);
        int j = localCursor.getInt(5);
        int k = localCursor.getInt(6);
        if (k > 0) {
          this.d.put(str3, Integer.valueOf(k));
        }
        if (j <= 0) {
          break label268;
        }
        this.e.put(str3, Integer.valueOf(j));
      }
      finally
      {
        label160:
        String str4;
        ArrayList localArrayList;
        localCursor.close();
      }
      if (localObject2 != null)
      {
        str4 = jrf.e((String)localObject2);
        if (str4 != null)
        {
          localArrayList = (ArrayList)this.a.get(str4);
          if (localArrayList == null)
          {
            localArrayList = new ArrayList();
            this.a.put(str4, localArrayList);
          }
          localArrayList.add(str1);
          continue;
        }
      }
      label260:
      label268:
      do
      {
        localObject2 = str2;
        break label160;
        this.b.add(str1);
        break;
        localCursor.close();
        return;
      } while (str2 != null);
    }
  }
  
  public final ArrayList<String> a(HashSet<String> paramHashSet)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramHashSet.contains(str)) {
        localArrayList.addAll((Collection)this.a.get(str));
      }
    }
    localArrayList.addAll(this.b);
    return localArrayList;
  }
  
  public final boolean a(String paramString1, String paramString2)
  {
    return (paramString2 != null) && (paramString2.equals(this.c.get(paramString1))) && (paramString2.equals(this.i.get(paramString1)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsf
 * JD-Core Version:    0.7.0.1
 */