import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hsj
  extends SQLiteOpenHelper
{
  private static mcq a = new mcq("debug.social.database");
  private static final hsh b = hsh.a;
  private final List<hsa> c;
  private boolean d;
  private final Context e;
  private final int f;
  private final String g;
  private final kpb h;
  
  public hsj(Context paramContext, String paramString, int paramInt1, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt2) {}
  
  private final void a(SQLiteDatabase paramSQLiteDatabase, hsa paramhsa)
  {
    if (Log.isLoggable("PartitionedDatabase", 4))
    {
      String str = String.valueOf(paramhsa.a());
      if (str.length() == 0) {
        break label58;
      }
      "Rebuilding partition: ".concat(str);
    }
    for (;;)
    {
      a(paramSQLiteDatabase, paramhsa.a());
      paramhsa.a(paramSQLiteDatabase);
      paramhsa.b(paramSQLiteDatabase);
      return;
      label58:
      new String("Rebuilding partition: ");
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    if (Log.isLoggable("PartitionedDatabase", 4))
    {
      String str3 = String.valueOf(paramString);
      if (str3.length() == 0) {
        break label76;
      }
      "Dropping partition: ".concat(str3);
    }
    String[] arrayOfString1;
    String[] arrayOfString2;
    for (;;)
    {
      arrayOfString1 = hsh.a(paramSQLiteDatabase, paramString);
      hsb.a(paramSQLiteDatabase, arrayOfString1);
      arrayOfString2 = hsh.b(paramSQLiteDatabase, paramString);
      hsb.b(paramSQLiteDatabase, arrayOfString2);
      if (!TextUtils.equals(paramString, "__master_partition__")) {
        break;
      }
      throw new IllegalArgumentException("Cannot delete the master partition");
      label76:
      new String("Dropping partition: ");
    }
    String[] arrayOfString3 = { paramString };
    paramSQLiteDatabase.delete("partition_versions", "partition_name=?", arrayOfString3);
    paramSQLiteDatabase.delete("partition_tables", "partition_name=?", arrayOfString3);
    if (Log.isLoggable("PartitionedDatabase", 3))
    {
      String str1 = String.valueOf(Arrays.toString(arrayOfString1));
      if (str1.length() == 0) {
        break label181;
      }
      "Dropped tables: ".concat(str1);
    }
    for (;;)
    {
      String str2 = String.valueOf(Arrays.toString(arrayOfString2));
      if (str2.length() == 0) {
        break;
      }
      "Dropped views: ".concat(str2);
      return;
      label181:
      new String("Dropped tables: ");
    }
    new String("Dropped views: ");
  }
  
  private final boolean a(SQLiteDatabase paramSQLiteDatabase, hsa paramhsa, int paramInt)
  {
    int i = paramhsa.b();
    if (paramInt == i) {
      return false;
    }
    if (paramInt == 0)
    {
      paramhsa.a(paramSQLiteDatabase);
      paramhsa.b(paramSQLiteDatabase);
    }
    for (;;)
    {
      hsh localhsh = b;
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("partition_name", paramhsa.a());
      localContentValues.put("version", Integer.valueOf(paramhsa.b()));
      paramSQLiteDatabase.replace("partition_versions", null, localContentValues);
      localhsh.a(paramSQLiteDatabase, paramhsa);
      localhsh.b(paramSQLiteDatabase, paramhsa);
      return true;
      if (paramInt > i) {
        a(paramSQLiteDatabase, paramhsa);
      } else {
        try
        {
          if (!paramhsa.a(paramSQLiteDatabase, paramInt, i)) {
            a(paramSQLiteDatabase, paramhsa);
          }
        }
        catch (SQLiteException localSQLiteException)
        {
          new kpx(this.g, paramhsa.a(), paramInt, i, paramInt).b(this.e);
          if (this.h != null) {
            kpb.a(this.h.a, localSQLiteException, "Database Upgrade Failures");
          }
          String str = String.valueOf(paramhsa.a());
          Log.e("PartitionedDatabase", 57 + String.valueOf(str).length() + "Failed to upgrade partition: " + str + " " + paramInt + " --> " + i, localSQLiteException);
          a(paramSQLiteDatabase, paramhsa);
        }
      }
    }
  }
  
  private final void c()
  {
    if (this.d)
    {
      int i = this.f;
      throw new hsk(38 + "Database deleted. Account: " + i);
    }
  }
  
  public void a()
  {
    try
    {
      if (this.d) {
        return;
      }
      this.d = true;
      SQLiteDatabase localSQLiteDatabase = super.getWritableDatabase();
      int i = 0;
      for (;;)
      {
        if (i >= 3) {}
      }
    }
    finally
    {
      try
      {
        localSQLiteDatabase.beginTransaction();
        localSQLiteDatabase.endTransaction();
        localSQLiteDatabase.close();
        new File(localSQLiteDatabase.getPath()).delete();
        return;
      }
      catch (Throwable localThrowable)
      {
        Log.e("PartitionedDatabase", "Cannot close database", localThrowable);
        i++;
      }
      localObject = finally;
    }
  }
  
  public void a(SQLiteDatabase paramSQLiteDatabase)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((hsa)localIterator.next()).b(paramSQLiteDatabase);
    }
  }
  
  public final void b()
  {
    try
    {
      this.d = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void b(SQLiteDatabase paramSQLiteDatabase)
  {
    hsb.b(paramSQLiteDatabase);
    hsb.c(paramSQLiteDatabase);
    onCreate(paramSQLiteDatabase);
  }
  
  public final void c(SQLiteDatabase paramSQLiteDatabase)
  {
    hsb.c(paramSQLiteDatabase);
    a(paramSQLiteDatabase);
  }
  
  public final boolean d(SQLiteDatabase paramSQLiteDatabase)
  {
    Map localMap = hsh.c(paramSQLiteDatabase);
    int i = efj.a((Integer)localMap.get("__master_partition__"));
    if (a(paramSQLiteDatabase, b, i)) {
      localMap = hsh.c(paramSQLiteDatabase);
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      localMap.remove("__master_partition__");
      if (Log.isLoggable("PartitionedDatabase", 4))
      {
        int j = this.c.size();
        int k = localMap.size();
        new StringBuilder(70).append("Partitions in Binder: ").append(j).append(", Partitions in database: ").append(k);
      }
      Iterator localIterator1 = this.c.iterator();
      boolean bool2 = bool1;
      while (localIterator1.hasNext())
      {
        hsa localhsa = (hsa)localIterator1.next();
        bool2 |= a(paramSQLiteDatabase, localhsa, efj.a((Integer)localMap.remove(localhsa.a())));
      }
      Iterator localIterator2 = localMap.keySet().iterator();
      while (localIterator2.hasNext()) {
        a(paramSQLiteDatabase, (String)localIterator2.next());
      }
      if (!localMap.isEmpty()) {
        return true;
      }
      return bool2;
    }
  }
  
  public SQLiteDatabase getReadableDatabase()
  {
    try
    {
      c();
      SQLiteDatabase localSQLiteDatabase = super.getReadableDatabase();
      return localSQLiteDatabase;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    try
    {
      c();
      SQLiteDatabase localSQLiteDatabase = super.getWritableDatabase();
      return localSQLiteDatabase;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, b, 0);
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      a(paramSQLiteDatabase, (hsa)localIterator.next(), 0);
    }
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    b(paramSQLiteDatabase);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.beginTransaction();
    try
    {
      if (d(paramSQLiteDatabase))
      {
        hsb.c(paramSQLiteDatabase);
        a(paramSQLiteDatabase);
      }
      paramSQLiteDatabase.setTransactionSuccessful();
      paramSQLiteDatabase.endTransaction();
      hsb.a(paramSQLiteDatabase);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Log.e("PartitionedDatabase", "Failed to init database partitions", localSQLiteException);
        b(paramSQLiteDatabase);
      }
    }
    finally
    {
      paramSQLiteDatabase.endTransaction();
    }
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsj
 * JD-Core Version:    0.7.0.1
 */