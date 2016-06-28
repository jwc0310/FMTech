import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class izl
  extends mab
  implements izk
{
  private final Context a;
  private final boolean b;
  
  public izl(Context paramContext, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = true;
  }
  
  private final iyv a(int paramInt, Cursor paramCursor, iyn<iyq> paramiyn)
  {
    if (this.b) {
      efj.l();
    }
    if ((paramCursor != null) && (!paramCursor.isClosed()))
    {
      long l1 = paramCursor.getLong(0);
      long l2 = paramCursor.getLong(2);
      int i = paramCursor.getInt(3);
      byte[] arrayOfByte = paramCursor.getBlob(4);
      if (paramiyn != null) {
        try
        {
          iyq localiyq = paramiyn.a(paramInt, arrayOfByte);
          iyv localiyv = new iyv(i, new Date(l2), l1, localiyq);
          return localiyv;
        }
        catch (IOException localIOException)
        {
          Log.e("NetworkQueueSerializer", "Failed to deserialize request item.");
          return null;
        }
      }
      Log.e("NetworkQueueSerializer", "Found a serialized networkqueue item but can't find its deserializer");
    }
    return null;
  }
  
  /* Error */
  private final void a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	izl:b	Z
    //   4: ifeq +6 -> 10
    //   7: invokestatic 27	efj:l	()V
    //   10: aload_0
    //   11: getfield 17	izl:a	Landroid/content/Context;
    //   14: iload_1
    //   15: invokestatic 82	hsb:b	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 5
    //   20: aload 5
    //   22: invokevirtual 87	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   25: aload 5
    //   27: ldc 89
    //   29: ldc 91
    //   31: iconst_1
    //   32: anewarray 93	java/lang/String
    //   35: dup
    //   36: iconst_0
    //   37: aload_2
    //   38: aastore
    //   39: invokevirtual 97	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   42: pop
    //   43: aload 5
    //   45: invokevirtual 100	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   48: aload 5
    //   50: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   53: return
    //   54: astore 7
    //   56: aload 5
    //   58: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   61: return
    //   62: astore 6
    //   64: aload 5
    //   66: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   69: aload 6
    //   71: athrow
    //   72: astore 4
    //   74: return
    //   75: astore_3
    //   76: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	izl
    //   0	77	1	paramInt	int
    //   0	77	2	paramString	String
    //   75	1	3	localIllegalArgumentException	IllegalArgumentException
    //   72	1	4	localSQLiteException1	SQLiteException
    //   18	47	5	localSQLiteDatabase	SQLiteDatabase
    //   62	8	6	localObject	Object
    //   54	1	7	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   25	48	54	android/database/sqlite/SQLiteException
    //   25	48	62	finally
    //   10	20	72	android/database/sqlite/SQLiteException
    //   10	20	75	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public final long a(int paramInt, iyv paramiyv, iyn<iyq> paramiyn)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	izl:b	Z
    //   4: ifeq +6 -> 10
    //   7: invokestatic 27	efj:l	()V
    //   10: new 106	android/content/ContentValues
    //   13: dup
    //   14: invokespecial 107	android/content/ContentValues:<init>	()V
    //   17: astore 4
    //   19: aload 4
    //   21: ldc 109
    //   23: aload_3
    //   24: invokeinterface 112 1 0
    //   29: invokevirtual 116	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload 4
    //   34: ldc 118
    //   36: aload_2
    //   37: getfield 121	iyv:b	Ljava/util/Date;
    //   40: invokevirtual 125	java/util/Date:getTime	()J
    //   43: invokestatic 131	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   46: invokevirtual 134	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   49: aload 4
    //   51: ldc 136
    //   53: aload_2
    //   54: getfield 140	iyv:f	I
    //   57: invokestatic 145	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   60: invokevirtual 148	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   63: aload_3
    //   64: aload_2
    //   65: getfield 151	iyv:a	Liyq;
    //   68: invokeinterface 154 2 0
    //   73: astore 5
    //   75: ldc 62
    //   77: iconst_4
    //   78: invokestatic 158	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   81: ifeq +28 -> 109
    //   84: aload 5
    //   86: arraylength
    //   87: istore 21
    //   89: new 160	java/lang/StringBuilder
    //   92: dup
    //   93: bipush 40
    //   95: invokespecial 163	java/lang/StringBuilder:<init>	(I)V
    //   98: ldc 165
    //   100: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: iload 21
    //   105: invokevirtual 172	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload 4
    //   111: ldc 174
    //   113: aload 5
    //   115: invokevirtual 177	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   118: aconst_null
    //   119: astore 6
    //   121: aload_0
    //   122: getfield 17	izl:a	Landroid/content/Context;
    //   125: iload_1
    //   126: invokestatic 179	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   129: astore 13
    //   131: aload 13
    //   133: astore 8
    //   135: aload 8
    //   137: invokevirtual 87	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   140: aload_2
    //   141: getfield 182	iyv:e	J
    //   144: lstore 15
    //   146: lload 15
    //   148: ldc2_w 183
    //   151: lcmp
    //   152: ifne +34 -> 186
    //   155: aload 8
    //   157: ldc 89
    //   159: ldc 186
    //   161: aload 4
    //   163: invokevirtual 190	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   166: lstore 17
    //   168: aload 8
    //   170: invokevirtual 100	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   173: aload 8
    //   175: ifnull +8 -> 183
    //   178: aload 8
    //   180: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   183: lload 17
    //   185: lreturn
    //   186: aload 4
    //   188: ldc 186
    //   190: lload 15
    //   192: invokestatic 131	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   195: invokevirtual 134	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   198: aload 8
    //   200: ldc 89
    //   202: ldc 186
    //   204: aload 4
    //   206: invokevirtual 193	android/database/sqlite/SQLiteDatabase:replace	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   209: lstore 19
    //   211: lload 19
    //   213: lstore 17
    //   215: goto -47 -> 168
    //   218: astore 10
    //   220: ldc 62
    //   222: ldc 195
    //   224: invokestatic 70	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   227: pop
    //   228: aload 6
    //   230: ifnull +61 -> 291
    //   233: aload 6
    //   235: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   238: ldc2_w 183
    //   241: lreturn
    //   242: astore 7
    //   244: aconst_null
    //   245: astore 8
    //   247: aload 7
    //   249: astore 9
    //   251: aload 8
    //   253: ifnull +8 -> 261
    //   256: aload 8
    //   258: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   261: aload 9
    //   263: athrow
    //   264: astore 9
    //   266: goto -15 -> 251
    //   269: astore 11
    //   271: aload 6
    //   273: astore 8
    //   275: aload 11
    //   277: astore 9
    //   279: goto -28 -> 251
    //   282: astore 14
    //   284: aload 8
    //   286: astore 6
    //   288: goto -68 -> 220
    //   291: ldc2_w 183
    //   294: lreturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	295	0	this	izl
    //   0	295	1	paramInt	int
    //   0	295	2	paramiyv	iyv
    //   0	295	3	paramiyn	iyn<iyq>
    //   17	188	4	localContentValues	ContentValues
    //   73	41	5	arrayOfByte	byte[]
    //   119	168	6	localObject1	Object
    //   242	6	7	localObject2	Object
    //   133	152	8	localObject3	Object
    //   249	13	9	localObject4	Object
    //   264	1	9	localObject5	Object
    //   277	1	9	localObject6	Object
    //   218	1	10	localSQLiteException1	SQLiteException
    //   269	7	11	localObject7	Object
    //   129	3	13	localSQLiteDatabase	SQLiteDatabase
    //   282	1	14	localSQLiteException2	SQLiteException
    //   144	47	15	l1	long
    //   166	48	17	l2	long
    //   209	3	19	l3	long
    //   87	17	21	i	int
    // Exception table:
    //   from	to	target	type
    //   121	131	218	android/database/sqlite/SQLiteException
    //   121	131	242	finally
    //   135	146	264	finally
    //   155	168	264	finally
    //   168	173	264	finally
    //   186	211	264	finally
    //   220	228	269	finally
    //   135	146	282	android/database/sqlite/SQLiteException
    //   155	168	282	android/database/sqlite/SQLiteException
    //   168	173	282	android/database/sqlite/SQLiteException
    //   186	211	282	android/database/sqlite/SQLiteException
  }
  
  public final List<iyv> a(int paramInt, la<String, iyn<iyq>> paramla)
  {
    if (this.b) {
      efj.l();
    }
    ArrayList localArrayList1 = new ArrayList();
    SQLiteDatabase localSQLiteDatabase1;
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = hsb.b(this.a, paramInt);
      localSQLiteDatabase1 = localSQLiteDatabase2;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localSQLiteDatabase1 = null;
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        localSQLiteDatabase1 = null;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        localSQLiteDatabase1 = null;
      }
      localArrayList2 = new ArrayList();
    }
    if (localSQLiteDatabase1 == null) {
      return localArrayList1;
    }
    for (;;)
    {
      try
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("item_state", Integer.valueOf(0));
        localSQLiteDatabase1.beginTransaction();
        localSQLiteDatabase1.update("networkqueue_items", localContentValues, "item_state = ? ", new String[] { "2" });
        Cursor localCursor2 = localSQLiteDatabase1.query("networkqueue_items", izb.a, null, null, null, null, String.valueOf(izb.b).concat(" ASC"));
        localCursor1 = localCursor2;
        try
        {
          if (!localCursor1.moveToNext()) {
            continue;
          }
          iyn localiyn = (iyn)paramla.get(localCursor1.getString(1));
          l = localCursor1.getLong(0);
          if (localiyn == null) {
            continue;
          }
          iyv localiyv = a(paramInt, localCursor1, localiyn);
          if (localiyv == null) {
            continue;
          }
          localArrayList1.add(localiyv);
          continue;
          localSQLiteDatabase1.endTransaction();
        }
        finally {}
      }
      finally
      {
        ArrayList localArrayList2;
        long l;
        Iterator localIterator;
        Cursor localCursor1 = null;
        continue;
      }
      if (localCursor1 != null) {
        localCursor1.close();
      }
      throw localObject1;
      localArrayList2.add(String.valueOf(l));
    }
    localSQLiteDatabase1.endTransaction();
    if (localCursor1 != null) {
      localCursor1.close();
    }
    localIterator = localArrayList2.iterator();
    while (localIterator.hasNext()) {
      a(paramInt, (String)localIterator.next());
    }
    return localArrayList1;
  }
  
  /* Error */
  public final void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	izl:b	Z
    //   4: ifeq +6 -> 10
    //   7: invokestatic 27	efj:l	()V
    //   10: aload_0
    //   11: getfield 17	izl:a	Landroid/content/Context;
    //   14: iload_1
    //   15: invokestatic 82	hsb:b	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 4
    //   20: aload 4
    //   22: invokevirtual 87	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   25: aload 4
    //   27: ldc 89
    //   29: aconst_null
    //   30: aconst_null
    //   31: invokevirtual 97	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   34: pop
    //   35: aload 4
    //   37: invokevirtual 100	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   40: aload 4
    //   42: ifnull +8 -> 50
    //   45: aload 4
    //   47: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   50: return
    //   51: astore 6
    //   53: aload 4
    //   55: ifnull -5 -> 50
    //   58: aload 4
    //   60: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   63: return
    //   64: astore 5
    //   66: aload 4
    //   68: ifnull +8 -> 76
    //   71: aload 4
    //   73: invokevirtual 103	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   76: aload 5
    //   78: athrow
    //   79: astore_3
    //   80: return
    //   81: astore_2
    //   82: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	izl
    //   0	83	1	paramInt	int
    //   81	1	2	localIllegalArgumentException	IllegalArgumentException
    //   79	1	3	localSQLiteException	SQLiteException
    //   18	54	4	localSQLiteDatabase	SQLiteDatabase
    //   64	13	5	localObject	Object
    //   51	1	6	localException	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   20	40	51	java/lang/Exception
    //   20	40	64	finally
    //   10	20	79	android/database/sqlite/SQLiteException
    //   10	20	81	java/lang/IllegalArgumentException
  }
  
  public final void a(int paramInt, iyv paramiyv)
  {
    a(paramInt, String.valueOf(paramiyv.e));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izl
 * JD-Core Version:    0.7.0.1
 */