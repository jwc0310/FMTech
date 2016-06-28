import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hco
{
  private static final String[] b = { "fingerprint" };
  private static final String[] c = { "content_uri" };
  private static hco d;
  public final Set<hcp> a = new HashSet();
  private SQLiteOpenHelper e;
  private Context f;
  
  private hco(Context paramContext, SQLiteOpenHelper paramSQLiteOpenHelper)
  {
    this.f = paramContext;
    this.e = paramSQLiteOpenHelper;
  }
  
  /* Error */
  public static hco a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 44	hco:d	Lhco;
    //   6: ifnull +14 -> 20
    //   9: getstatic 44	hco:d	Lhco;
    //   12: astore 4
    //   14: ldc 2
    //   16: monitorexit
    //   17: aload 4
    //   19: areturn
    //   20: ldc 2
    //   22: monitorexit
    //   23: aload_0
    //   24: ldc 46
    //   26: invokestatic 51	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   29: checkcast 46	hci
    //   32: astore_2
    //   33: ldc 2
    //   35: monitorenter
    //   36: getstatic 44	hco:d	Lhco;
    //   39: ifnonnull +15 -> 54
    //   42: new 2	hco
    //   45: dup
    //   46: aload_0
    //   47: aload_2
    //   48: invokespecial 53	hco:<init>	(Landroid/content/Context;Landroid/database/sqlite/SQLiteOpenHelper;)V
    //   51: putstatic 44	hco:d	Lhco;
    //   54: ldc 2
    //   56: monitorexit
    //   57: getstatic 44	hco:d	Lhco;
    //   60: areturn
    //   61: astore_1
    //   62: ldc 2
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    //   67: astore_3
    //   68: ldc 2
    //   70: monitorexit
    //   71: aload_3
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	paramContext	Context
    //   61	5	1	localObject1	Object
    //   32	16	2	localhci	hci
    //   67	5	3	localObject2	Object
    //   12	6	4	localhco	hco
    // Exception table:
    //   from	to	target	type
    //   3	17	61	finally
    //   20	23	61	finally
    //   62	65	61	finally
    //   36	54	67	finally
    //   54	57	67	finally
    //   68	71	67	finally
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE local_fingerprints (content_uri TEXT PRIMARY KEY NOT NULL, fingerprint TEXT NOT NULL);");
    paramSQLiteDatabase.execSQL("CREATE INDEX local_fingerprints_content_uri ON local_fingerprints(content_uri)");
    paramSQLiteDatabase.execSQL("CREATE INDEX local_fingerprints_fingerprint ON local_fingerprints(fingerprint)");
  }
  
  private final void a(String paramString1, String paramString2)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((hcp)localIterator.next()).a(paramString1, paramString2);
    }
  }
  
  public final String a(String paramString)
  {
    Cursor localCursor = this.e.getReadableDatabase().query("local_fingerprints", b, "content_uri=?", new String[] { paramString }, null, null, null, "1");
    try
    {
      if (localCursor.moveToFirst())
      {
        String str = localCursor.getString(0);
        return str;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final String a(String paramString, boolean paramBoolean)
  {
    String str1 = a(paramString);
    Object localObject;
    if ((!paramBoolean) && (str1 != null))
    {
      localObject = str1;
      return localObject;
    }
    for (;;)
    {
      try
      {
        localInputStream = this.f.getContentResolver().openInputStream(Uri.parse(paramString));
        if (localInputStream != null) {
          continue;
        }
        localObject = null;
        if ((localObject == null) || (((String)localObject).equals(str1))) {
          break;
        }
        SQLiteDatabase localSQLiteDatabase = this.e.getWritableDatabase();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("content_uri", paramString);
        localContentValues.put("fingerprint", (String)localObject);
        localSQLiteDatabase.replace("local_fingerprints", null, localContentValues);
        if (Log.isLoggable("LocalFingerprints", 3))
        {
          String str5 = String.valueOf(paramString);
          if (str5.length() == 0) {
            continue;
          }
          "replace fingerprint for: ".concat(str5);
        }
      }
      catch (Exception localException)
      {
        InputStream localInputStream;
        String str4;
        String str2 = String.valueOf(paramString);
        if (str2.length() == 0) {
          continue;
        }
        String str3 = "cannot compute fingerprint for: ".concat(str2);
        Log.e("LocalFingerprints", str3, localException);
        return null;
        str3 = new String("cannot compute fingerprint for: ");
        continue;
        new String("replace fingerprint for: ");
        continue;
      }
      a(paramString, (String)localObject);
      return localObject;
      str4 = irc.b(localInputStream).a();
      localObject = str4;
    }
  }
  
  public final Set<String> a()
  {
    localHashSet = new HashSet();
    Cursor localCursor = this.e.getReadableDatabase().query(true, "local_fingerprints", c, "content_uri NOT NULL", null, null, null, null, null);
    try
    {
      if (localCursor.moveToNext()) {
        localHashSet.add(localCursor.getString(0));
      }
      return localHashSet;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final void a(Collection<String> paramCollection)
  {
    SQLiteDatabase localSQLiteDatabase = this.e.getWritableDatabase();
    int i = Math.min(paramCollection.size(), 500);
    String[] arrayOfString = new String[i];
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramCollection.iterator();
    Object localObject1 = arrayOfString;
    int j = i;
    int k = 0;
    int m = 0;
    int n;
    int i3;
    int i2;
    Object localObject2;
    int i1;
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      n = m + 1;
      localObject1[m] = str1;
      localStringBuilder.append("?,");
      if (n != j) {
        break label249;
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      localStringBuilder.append(')');
      String str2 = String.valueOf("content_uri IN (");
      String str3 = String.valueOf(localStringBuilder);
      localSQLiteDatabase.delete("local_fingerprints", 0 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + str3, (String[])localObject1);
      i3 = j + k;
      i2 = Math.min(paramCollection.size() - i3, 500);
      localObject2 = new String[i2];
      localStringBuilder.setLength(0);
      i1 = 0;
    }
    for (;;)
    {
      k = i3;
      j = i2;
      localObject1 = localObject2;
      m = i1;
      break;
      return;
      label249:
      i1 = n;
      localObject2 = localObject1;
      i2 = j;
      i3 = k;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hco
 * JD-Core Version:    0.7.0.1
 */