import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class hsb
{
  private static final String[] a = { "name" };
  private static List<hsg> b;
  
  static
  {
    new hsc();
    new hsd();
    new hse();
    new hsf();
  }
  
  public static SQLiteDatabase a(Context paramContext, int paramInt)
  {
    return ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
  }
  
  public static List<hsg> a()
  {
    try
    {
      List localList = b;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    if (!paramSQLiteDatabase.isReadOnly()) {
      paramSQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, LinkedList<String> paramLinkedList)
  {
    Iterator localIterator = paramLinkedList.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = String.valueOf("DROP TABLE IF EXISTS ");
      String str3 = String.valueOf(str1);
      if (str3.length() != 0) {}
      for (String str4 = str2.concat(str3);; str4 = new String(str2))
      {
        paramSQLiteDatabase.execSQL(str4);
        break;
      }
    }
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str = paramArrayOfString[j];
      if (a(paramSQLiteDatabase, str)) {
        localLinkedList.addFirst(str);
      }
      for (;;)
      {
        j++;
        break;
        localLinkedList.addLast(str);
      }
    }
    a(paramSQLiteDatabase, localLinkedList);
  }
  
  public static void a(String paramString, Exception paramException)
  {
    try
    {
      if (b == null) {
        b = new ArrayList();
      }
      hsg localhsg = new hsg();
      localhsg.a = paramString;
      localhsg.b = paramException;
      b.add(localhsg);
      return;
    }
    finally {}
  }
  
  /* Error */
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: new 133	java/lang/StringBuilder
    //   6: dup
    //   7: bipush 25
    //   9: aload_1
    //   10: invokestatic 86	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: invokevirtual 90	java/lang/String:length	()I
    //   16: iadd
    //   17: invokespecial 136	java/lang/StringBuilder:<init>	(I)V
    //   20: ldc 138
    //   22: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_1
    //   26: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 144
    //   31: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: aconst_null
    //   38: invokevirtual 152	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   41: astore 7
    //   43: aload 7
    //   45: astore_2
    //   46: aload_2
    //   47: ifnull +28 -> 75
    //   50: aload_2
    //   51: invokeinterface 157 1 0
    //   56: istore 9
    //   58: iload 9
    //   60: ifle +15 -> 75
    //   63: aload_2
    //   64: ifnull +9 -> 73
    //   67: aload_2
    //   68: invokeinterface 160 1 0
    //   73: iconst_1
    //   74: ireturn
    //   75: aload_2
    //   76: ifnull +9 -> 85
    //   79: aload_2
    //   80: invokeinterface 160 1 0
    //   85: iconst_0
    //   86: ireturn
    //   87: astore 6
    //   89: aload_2
    //   90: ifnull -5 -> 85
    //   93: aload_2
    //   94: invokeinterface 160 1 0
    //   99: goto -14 -> 85
    //   102: astore_3
    //   103: aconst_null
    //   104: astore 4
    //   106: aload_3
    //   107: astore 5
    //   109: aload 4
    //   111: ifnull +10 -> 121
    //   114: aload 4
    //   116: invokeinterface 160 1 0
    //   121: aload 5
    //   123: athrow
    //   124: astore 8
    //   126: aload_2
    //   127: astore 4
    //   129: aload 8
    //   131: astore 5
    //   133: goto -24 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	136	1	paramString	String
    //   1	126	2	localObject1	Object
    //   102	5	3	localObject2	Object
    //   104	24	4	localObject3	Object
    //   107	25	5	localObject4	Object
    //   87	1	6	localException	Exception
    //   41	3	7	localCursor	Cursor
    //   124	6	8	localObject5	Object
    //   56	3	9	i	int
    // Exception table:
    //   from	to	target	type
    //   2	43	87	java/lang/Exception
    //   50	58	87	java/lang/Exception
    //   2	43	102	finally
    //   50	58	124	finally
  }
  
  public static boolean a(String[] paramArrayOfString1, String... paramVarArgs)
  {
    if (paramArrayOfString1 == null) {
      return true;
    }
    if (paramVarArgs.length == 1)
    {
      String str2 = paramVarArgs[0];
      int n = paramArrayOfString1.length;
      for (int i1 = 0;; i1++)
      {
        if (i1 >= n) {
          break label102;
        }
        if (str2.equals(paramArrayOfString1[i1])) {
          break;
        }
      }
    }
    int i = paramArrayOfString1.length;
    label96:
    for (int j = 0;; j++)
    {
      if (j >= i) {
        break label102;
      }
      String str1 = paramArrayOfString1[j];
      int k = paramVarArgs.length;
      for (int m = 0;; m++)
      {
        if (m >= k) {
          break label96;
        }
        if (paramVarArgs[m].equals(str1)) {
          break;
        }
      }
    }
    label102:
    return false;
  }
  
  public static SQLiteDatabase b(Context paramContext, int paramInt)
  {
    return ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase();
  }
  
  public static void b()
  {
    try
    {
      b = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void b(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("sqlite_master", a, "type='table' AND name NOT LIKE 'sqlite_%' AND name NOT LIKE 'android_%'", null, null, null, null);
    if (localCursor != null)
    {
      LinkedList localLinkedList = new LinkedList();
      for (;;)
      {
        try
        {
          if (!localCursor.moveToNext()) {
            break;
          }
          String str = localCursor.getString(0);
          if (a(paramSQLiteDatabase, str)) {
            localLinkedList.addFirst(str);
          } else {
            localLinkedList.addLast(str);
          }
        }
        finally
        {
          localCursor.close();
        }
      }
      localCursor.close();
      a(paramSQLiteDatabase, localLinkedList);
    }
  }
  
  public static void b(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str1 = paramArrayOfString[j];
      String str2 = String.valueOf("DROP VIEW IF EXISTS ");
      String str3 = String.valueOf(str1);
      if (str3.length() != 0) {}
      for (String str4 = str2.concat(str3);; str4 = new String(str2))
      {
        paramSQLiteDatabase.execSQL(str4);
        j++;
        break;
      }
    }
  }
  
  public static void c(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("sqlite_master", a, "type='view'", null, null, null, null);
    if (localCursor != null)
    {
      for (;;)
      {
        try
        {
          if (!localCursor.moveToNext()) {
            break;
          }
          String str1 = localCursor.getString(0);
          String str2 = String.valueOf("DROP VIEW IF EXISTS ");
          String str3 = String.valueOf(str1);
          String str4;
          if (str3.length() != 0)
          {
            str4 = str2.concat(str3);
            paramSQLiteDatabase.execSQL(str4);
          }
          else
          {
            str4 = new String(str2);
          }
        }
        finally
        {
          localCursor.close();
        }
      }
      localCursor.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsb
 * JD-Core Version:    0.7.0.1
 */