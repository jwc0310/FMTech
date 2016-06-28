import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hsh
  implements hsa
{
  static final hsh a = new hsh();
  
  static String[] a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    Cursor localCursor = paramSQLiteDatabase.query("partition_tables", new String[] { "table_name" }, "partition_name=?", new String[] { paramString }, null, null, null);
    String[] arrayOfString = new String[localCursor.getCount()];
    int i = 0;
    try
    {
      while (localCursor.moveToNext())
      {
        int j = i + 1;
        arrayOfString[i] = localCursor.getString(0);
        i = j;
      }
      return arrayOfString;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  static String[] b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    Cursor localCursor = paramSQLiteDatabase.query("partition_views", new String[] { "view_name" }, "partition_name=?", new String[] { paramString }, null, null, null);
    String[] arrayOfString = new String[localCursor.getCount()];
    int i = 0;
    try
    {
      while (localCursor.moveToNext())
      {
        int j = i + 1;
        arrayOfString[i] = localCursor.getString(0);
        i = j;
      }
      return arrayOfString;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  static Map<String, Integer> c(SQLiteDatabase paramSQLiteDatabase)
  {
    localHashMap = new HashMap();
    Cursor localCursor = paramSQLiteDatabase.query("partition_versions", new String[] { "partition_name", "version" }, null, null, null, null, null);
    try
    {
      if (localCursor.moveToNext()) {
        localHashMap.put(localCursor.getString(0), Integer.valueOf(localCursor.getInt(1)));
      }
      return localHashMap;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final String a()
  {
    return "__master_partition__";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase) {}
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    if (Log.isLoggable("PartitionedDatabase", 3))
    {
      String str = String.valueOf("__master_partition__");
      if (str.length() == 0) {
        break label48;
      }
      "onCreate: ".concat(str);
    }
    for (;;)
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE partition_versions (partition_name TEXT NOT NULL PRIMARY KEY,version INT NOT NULL DEFAULT(0));");
      paramSQLiteDatabase.execSQL("CREATE TABLE partition_tables (partition_name TEXT NOT NULL,table_name TEXT NOT NULL,UNIQUE (partition_name,table_name));");
      paramSQLiteDatabase.execSQL("CREATE TABLE partition_views (partition_name TEXT NOT NULL,view_name TEXT NOT NULL,UNIQUE (partition_name,view_name));");
      return;
      label48:
      new String("onCreate: ");
    }
  }
  
  final void a(SQLiteDatabase paramSQLiteDatabase, hsa paramhsa)
  {
    List localList1 = Arrays.asList(a(paramSQLiteDatabase, paramhsa.a()));
    List localList2 = Arrays.asList(paramhsa.c());
    HashSet localHashSet1 = new HashSet(localList1);
    localHashSet1.removeAll(localList2);
    HashSet localHashSet2 = new HashSet(localList2);
    localHashSet2.removeAll(localList1);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramhsa.a();
    Iterator localIterator1 = localHashSet1.iterator();
    while (localIterator1.hasNext())
    {
      arrayOfString[1] = ((String)localIterator1.next());
      paramSQLiteDatabase.delete("partition_tables", "partition_name=? AND table_name=?", arrayOfString);
    }
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("partition_name", paramhsa.a());
    Iterator localIterator2 = localHashSet2.iterator();
    while (localIterator2.hasNext())
    {
      localContentValues.put("table_name", (String)localIterator2.next());
      paramSQLiteDatabase.insert("partition_tables", null, localContentValues);
    }
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("PartitionedDatabase", 4)) {
      new StringBuilder(53).append("Upgrade master partition: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    return true;
  }
  
  public final int b()
  {
    return 1;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase) {}
  
  final void b(SQLiteDatabase paramSQLiteDatabase, hsa paramhsa)
  {
    List localList1 = Arrays.asList(b(paramSQLiteDatabase, paramhsa.a()));
    List localList2 = Arrays.asList(paramhsa.d());
    HashSet localHashSet1 = new HashSet(localList1);
    localHashSet1.removeAll(localList2);
    HashSet localHashSet2 = new HashSet(localList2);
    localHashSet2.removeAll(localList1);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramhsa.a();
    Iterator localIterator1 = localHashSet1.iterator();
    while (localIterator1.hasNext())
    {
      arrayOfString[1] = ((String)localIterator1.next());
      paramSQLiteDatabase.delete("partition_views", "partition_name=? AND view_name=?", arrayOfString);
    }
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("partition_name", paramhsa.a());
    Iterator localIterator2 = localHashSet2.iterator();
    while (localIterator2.hasNext())
    {
      localContentValues.put("view_name", (String)localIterator2.next());
      paramSQLiteDatabase.insert("partition_views", null, localContentValues);
    }
  }
  
  public final String[] c()
  {
    return new String[] { "partition_versions", "partition_tables", "partition_views" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsh
 * JD-Core Version:    0.7.0.1
 */