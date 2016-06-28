import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gwn
{
  private static final Collection<gvy> d;
  private static final SparseArray<Map<Long, Runnable>> e = new SparseArray();
  public final Context a;
  public final int b;
  public final gwg c;
  private final gwc f;
  
  static
  {
    gvy[] arrayOfgvy = new gvy[3];
    arrayOfgvy[0] = gvy.a;
    arrayOfgvy[1] = gvy.b;
    arrayOfgvy[2] = gvy.d;
    d = Collections.unmodifiableList(Arrays.asList(arrayOfgvy));
  }
  
  public gwn(Context paramContext, int paramInt)
  {
    efj.e(paramContext, "context must be non-null");
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "accountId must be valid.");
      this.a = paramContext.getApplicationContext();
      this.b = paramInt;
      this.c = ((gwg)mbb.a(paramContext, gwg.class));
      this.f = ((gwc)mbb.a(paramContext, gwc.class));
      return;
    }
  }
  
  private final int a()
  {
    for (;;)
    {
      int i;
      try
      {
        Map localMap = (Map)e.get(this.b);
        if (localMap == null)
        {
          j = 0;
          return j;
        }
        i = localMap.size();
        Iterator localIterator = localMap.values().iterator();
        if (localIterator.hasNext())
        {
          ((Runnable)localIterator.next()).run();
          continue;
        }
        e.remove(this.b);
      }
      finally {}
      int j = i;
    }
  }
  
  private static int a(Map<gvy, Integer> paramMap)
  {
    Iterator localIterator = d.iterator();
    int i = 0;
    gvy localgvy;
    if (localIterator.hasNext())
    {
      localgvy = (gvy)localIterator.next();
      if (!paramMap.containsKey(localgvy)) {
        break label65;
      }
    }
    label65:
    for (int j = i + ((Integer)paramMap.get(localgvy)).intValue();; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
  
  private final List<Long> a(SQLiteDatabase paramSQLiteDatabase, gvq paramgvq)
  {
    switch (gwo.a[paramgvq.a().ordinal()])
    {
    default: 
      String str2 = String.valueOf(paramgvq.a());
      throw new IllegalArgumentException(20 + String.valueOf(str2).length() + "Unknown Group type: " + str2);
    case 1: 
      Long[] arrayOfLong = new Long[1];
      arrayOfLong[0] = Long.valueOf(paramgvq.c);
      return Arrays.asList(arrayOfLong);
    case 2: 
      String str1 = paramgvq.b;
      hsn localhsn2 = new hsn(paramSQLiteDatabase);
      localhsn2.a = "album_upload_batch";
      localhsn2.b = new String[] { "_id" };
      localhsn2.c = "album_id = ?";
      localhsn2.d = new String[] { str1 };
      return gwc.a(localhsn2.a());
    }
    hsn localhsn1 = new hsn(paramSQLiteDatabase);
    localhsn1.a = "album_upload_batch";
    localhsn1.b = new String[] { "_id" };
    return gwc.a(localhsn1.a());
  }
  
  private final void a(long paramLong, Runnable paramRunnable)
  {
    if (paramRunnable != null) {}
    try
    {
      Object localObject2 = (Map)e.get(this.b);
      if (localObject2 == null)
      {
        localObject2 = new HashMap();
        e.put(this.b, localObject2);
      }
      ((Map)localObject2).put(Long.valueOf(paramLong), paramRunnable);
      return;
    }
    finally {}
  }
  
  private static gvy b(Map<gvy, Integer> paramMap)
  {
    if ((paramMap.containsKey(gvy.d)) || (paramMap.containsKey(gvy.b))) {
      return gvy.b;
    }
    if (paramMap.containsKey(gvy.a))
    {
      if ((paramMap.containsKey(gvy.c)) || (paramMap.containsKey(gvy.e))) {
        return gvy.b;
      }
      return gvy.a;
    }
    if (paramMap.containsKey(gvy.f)) {
      return gvy.f;
    }
    if (paramMap.containsKey(gvy.e)) {
      return gvy.e;
    }
    return gvy.c;
  }
  
  public final int a(gvq paramgvq)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, this.b);
    localSQLiteDatabase.beginTransaction();
    try
    {
      List localList1 = a(localSQLiteDatabase, paramgvq);
      boolean bool = localList1.isEmpty();
      if (bool) {
        return 0;
      }
      gwg localgwg = this.c;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status", gvy.f.h);
      localContentValues.put("update_time", Long.valueOf(localgwg.a.a()));
      Iterator localIterator = new gwe(localList1, 500).iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        List localList2 = (List)localIterator.next();
        String str1 = gwh.b;
        String str2 = String.valueOf("batch_id");
        String str3 = String.valueOf(efj.f(localList2.size()));
        i += localSQLiteDatabase.update("album_upload_media", localContentValues, 5 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + " AND " + str2 + str3, gwg.a(localList2));
      }
      localSQLiteDatabase.setTransactionSuccessful();
      int j = a();
      int k = j + i;
      return k;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final long a(Runnable paramRunnable)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, this.b);
    localSQLiteDatabase.beginTransaction();
    try
    {
      long l = gwg.a(localSQLiteDatabase);
      if (l != -1L)
      {
        this.c.a(localSQLiteDatabase, l, gvy.b);
        a(l, paramRunnable);
      }
      localSQLiteDatabase.setTransactionSuccessful();
      return l;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final long a(String paramString, Collection<String> paramCollection)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!TextUtils.isEmpty(paramString))
    {
      bool2 = bool1;
      efj.c(bool2, "AlbumId can not be empty.");
      if ((paramCollection == null) || (paramCollection.isEmpty())) {
        break label147;
      }
    }
    for (;;)
    {
      efj.c(bool1, "LocalMedia cannot be empty.");
      localSQLiteDatabase = hsb.a(this.a, this.b);
      localSQLiteDatabase.beginTransaction();
      try
      {
        gwc localgwc = this.f;
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("album_id", paramString);
        localContentValues.put("created_time", Long.valueOf(localgwc.a.a()));
        long l = localSQLiteDatabase.insert("album_upload_batch", null, localContentValues);
        this.c.a(localSQLiteDatabase, l, paramCollection);
        localSQLiteDatabase.setTransactionSuccessful();
        return l;
      }
      finally
      {
        label147:
        localSQLiteDatabase.endTransaction();
      }
      bool2 = false;
      break;
      bool1 = false;
    }
  }
  
  /* Error */
  public final gvy a(long paramLong, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 72	gwn:a	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 74	gwn:b	I
    //   8: invokestatic 243	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore 4
    //   13: aload 4
    //   15: invokevirtual 248	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   18: aload_0
    //   19: lload_1
    //   20: invokevirtual 351	gwn:b	(J)V
    //   23: aload_0
    //   24: getfield 83	gwn:c	Lgwg;
    //   27: aload 4
    //   29: lload_1
    //   30: invokevirtual 354	gwg:a	(Landroid/database/sqlite/SQLiteDatabase;J)Lgvv;
    //   33: getfield 358	gvv:c	I
    //   36: iload_3
    //   37: if_icmplt +45 -> 82
    //   40: getstatic 235	gvy:e	Lgvy;
    //   43: astore 6
    //   45: aload_0
    //   46: getfield 83	gwn:c	Lgwg;
    //   49: aload 4
    //   51: lload_1
    //   52: aload 6
    //   54: invokevirtual 322	gwg:a	(Landroid/database/sqlite/SQLiteDatabase;JLgvy;)V
    //   57: aload 4
    //   59: ldc_w 360
    //   62: lload_1
    //   63: invokestatic 363	gwh:a	(J)[Ljava/lang/String;
    //   66: invokevirtual 367	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload 4
    //   71: invokevirtual 311	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   74: aload 4
    //   76: invokevirtual 258	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   79: aload 6
    //   81: areturn
    //   82: getstatic 29	gvy:d	Lgvy;
    //   85: astore 6
    //   87: goto -42 -> 45
    //   90: astore 5
    //   92: aload 4
    //   94: invokevirtual 258	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   97: aload 5
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	gwn
    //   0	100	1	paramLong	long
    //   0	100	3	paramInt	int
    //   11	82	4	localSQLiteDatabase	SQLiteDatabase
    //   90	8	5	localObject	Object
    //   43	43	6	localgvy	gvy
    // Exception table:
    //   from	to	target	type
    //   23	45	90	finally
    //   45	74	90	finally
    //   82	87	90	finally
  }
  
  public final void a(long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, this.b);
    localSQLiteDatabase.beginTransaction();
    b(paramLong);
    try
    {
      this.c.a(localSQLiteDatabase, paramLong, gvy.f);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final void a(long paramLong, String paramString1, String paramString2)
  {
    efj.a(paramString1, "photoId must be non-empty.");
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, this.b);
    localSQLiteDatabase.beginTransaction();
    b(paramLong);
    try
    {
      gwg localgwg = this.c;
      efj.a(paramString1, "must specify valid photoId");
      localgwg.a(localSQLiteDatabase, paramLong, gvy.c, paramString1, paramString2);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final List<gvv> b(gvq paramgvq)
  {
    if (paramgvq.a == this.b) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramgvq.a);
      arrayOfObject[1] = Integer.valueOf(this.b);
      efj.b(bool, "Group accountId %d must match queue accountId %D.", arrayOfObject);
      SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, this.b);
      localSQLiteDatabase.beginTransaction();
      try
      {
        List localList1 = a(localSQLiteDatabase, paramgvq);
        List localList2 = this.c.a(localSQLiteDatabase, localList1);
        localSQLiteDatabase.setTransactionSuccessful();
        return localList2;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
  }
  
  final void b(long paramLong)
  {
    try
    {
      Map localMap = (Map)e.get(this.b);
      if (localMap != null)
      {
        localMap.remove(Long.valueOf(paramLong));
        if (localMap.size() == 0) {
          e.remove(this.b);
        }
      }
      return;
    }
    finally {}
  }
  
  public final gvt c(gvq paramgvq)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, this.b);
    localSQLiteDatabase.beginTransaction();
    try
    {
      List localList = a(localSQLiteDatabase, paramgvq);
      if (localList.isEmpty())
      {
        gvt localgvt1 = new gvt(paramgvq, b(new HashMap()), 0);
        return localgvt1;
      }
      HashMap localHashMap = this.c.b(localSQLiteDatabase, localList);
      localSQLiteDatabase.setTransactionSuccessful();
      gvt localgvt2 = new gvt(paramgvq, b(localHashMap), a(localHashMap));
      return localgvt2;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwn
 * JD-Core Version:    0.7.0.1
 */