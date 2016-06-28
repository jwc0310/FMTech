import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class lnq
  implements llm
{
  private static final String[] a = { "context_specific_data" };
  private static final Integer[] b;
  
  static
  {
    Integer[] arrayOfInteger = new Integer[19];
    arrayOfInteger[0] = Integer.valueOf(391);
    arrayOfInteger[1] = Integer.valueOf(410);
    arrayOfInteger[2] = Integer.valueOf(355);
    arrayOfInteger[3] = Integer.valueOf(356);
    arrayOfInteger[4] = Integer.valueOf(365);
    arrayOfInteger[5] = Integer.valueOf(379);
    arrayOfInteger[6] = Integer.valueOf(337);
    arrayOfInteger[7] = Integer.valueOf(344);
    arrayOfInteger[8] = Integer.valueOf(349);
    arrayOfInteger[9] = Integer.valueOf(354);
    arrayOfInteger[10] = Integer.valueOf(357);
    arrayOfInteger[11] = Integer.valueOf(401);
    arrayOfInteger[12] = Integer.valueOf(405);
    arrayOfInteger[13] = Integer.valueOf(404);
    arrayOfInteger[14] = Integer.valueOf(399);
    arrayOfInteger[15] = Integer.valueOf(393);
    arrayOfInteger[16] = Integer.valueOf(408);
    arrayOfInteger[17] = Integer.valueOf(353);
    arrayOfInteger[18] = Integer.valueOf(335);
    b = arrayOfInteger;
  }
  
  private static String a(oqw paramoqw, opo paramopo)
  {
    if (paramopo == null) {
      return paramoqw.b.b;
    }
    return paramopo.af;
  }
  
  private static opo a(oqw paramoqw)
  {
    opo localopo;
    if ((paramoqw == null) || (paramoqw.a != 1002)) {
      localopo = null;
    }
    do
    {
      return localopo;
      localopo = (opo)paramoqw.b(opo.a);
    } while ((localopo != null) && (!TextUtils.isEmpty(localopo.af)));
    return null;
  }
  
  public final String a(int paramInt, oqw paramoqw)
  {
    return a(paramoqw, a(paramoqw));
  }
  
  public final ArrayList<Integer> a(Context paramContext, int paramInt)
  {
    return null;
  }
  
  public final void a(Context paramContext, int paramInt1, SQLiteDatabase paramSQLiteDatabase, oqw paramoqw, int paramInt2, boolean paramBoolean)
  {
    opo localopo = a(paramoqw);
    if (localopo == null)
    {
      if (Log.isLoggable("UpdateItemStoreExt", 4))
      {
        String str = String.valueOf(paramoqw.b.b);
        if (str.length() != 0) {
          "Activity id with empty update data: ".concat(str);
        }
      }
      else
      {
        return;
      }
      new String("Activity id with empty update data: ");
      return;
    }
    lmp.a(paramContext, paramInt1, paramSQLiteDatabase, new opo[] { localopo }, paramInt2, paramBoolean);
  }
  
  public final boolean a(int paramInt)
  {
    return true;
  }
  
  /* Error */
  public final boolean a(Context paramContext, int paramInt1, SQLiteDatabase paramSQLiteDatabase, oqw paramoqw, String paramString1, long paramLong, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    // Byte code:
    //   0: aload 4
    //   2: invokestatic 65	lnq:a	(Loqw;)Lopo;
    //   5: astore 12
    //   7: aload 4
    //   9: aload 12
    //   11: invokestatic 67	lnq:a	(Loqw;Lopo;)Ljava/lang/String;
    //   14: astore 13
    //   16: aload 13
    //   18: invokestatic 61	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   21: ifeq +13 -> 34
    //   24: ldc 71
    //   26: ldc 104
    //   28: invokestatic 108	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   31: pop
    //   32: iconst_0
    //   33: ireturn
    //   34: new 110	android/content/ContentValues
    //   37: dup
    //   38: iconst_4
    //   39: invokespecial 113	android/content/ContentValues:<init>	(I)V
    //   42: astore 14
    //   44: aload 14
    //   46: ldc 115
    //   48: aload 5
    //   50: invokevirtual 119	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: aload 14
    //   55: ldc 121
    //   57: aload 13
    //   59: invokevirtual 119	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   62: aload 14
    //   64: ldc 123
    //   66: iload 8
    //   68: invokestatic 24	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   71: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   74: aload 14
    //   76: ldc 128
    //   78: lload 6
    //   80: invokestatic 133	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   83: invokevirtual 136	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   86: aload 12
    //   88: ifnull +37 -> 125
    //   91: aload 14
    //   93: ldc 16
    //   95: new 138	llr
    //   98: dup
    //   99: aload_1
    //   100: aload 12
    //   102: invokespecial 141	llr:<init>	(Landroid/content/Context;Lopo;)V
    //   105: invokestatic 144	llr:a	(Lllr;)[B
    //   108: invokevirtual 147	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   111: aload_3
    //   112: ldc 149
    //   114: ldc 121
    //   116: aload 14
    //   118: iconst_3
    //   119: invokevirtual 155	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   122: pop2
    //   123: iconst_1
    //   124: ireturn
    //   125: aload_3
    //   126: ldc 149
    //   128: getstatic 18	lnq:a	[Ljava/lang/String;
    //   131: ldc 157
    //   133: iconst_2
    //   134: anewarray 14	java/lang/String
    //   137: dup
    //   138: iconst_0
    //   139: aload 11
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: aload 13
    //   146: aastore
    //   147: aconst_null
    //   148: aconst_null
    //   149: aconst_null
    //   150: invokevirtual 161	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   153: astore 17
    //   155: aload 17
    //   157: astore 16
    //   159: aload 16
    //   161: invokeinterface 167 1 0
    //   166: ifeq +18 -> 184
    //   169: aload 14
    //   171: ldc 16
    //   173: aload 16
    //   175: iconst_0
    //   176: invokeinterface 171 2 0
    //   181: invokevirtual 147	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   184: aload 16
    //   186: ifnull -75 -> 111
    //   189: aload 16
    //   191: invokeinterface 174 1 0
    //   196: goto -85 -> 111
    //   199: astore 15
    //   201: aconst_null
    //   202: astore 16
    //   204: aload 16
    //   206: ifnull +10 -> 216
    //   209: aload 16
    //   211: invokeinterface 174 1 0
    //   216: aload 15
    //   218: athrow
    //   219: astore 18
    //   221: new 176	kpu
    //   224: dup
    //   225: bipush 6
    //   227: invokespecial 177	kpu:<init>	(I)V
    //   230: aload_1
    //   231: invokevirtual 180	kpu:b	(Landroid/content/Context;)V
    //   234: aload 13
    //   236: invokestatic 80	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   239: astore 19
    //   241: aload 19
    //   243: invokevirtual 84	java/lang/String:length	()I
    //   246: ifeq +22 -> 268
    //   249: ldc 182
    //   251: aload 19
    //   253: invokevirtual 90	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   256: astore 20
    //   258: ldc 71
    //   260: aload 20
    //   262: invokestatic 108	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   265: pop
    //   266: iconst_0
    //   267: ireturn
    //   268: new 14	java/lang/String
    //   271: dup
    //   272: ldc 182
    //   274: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   277: astore 20
    //   279: goto -21 -> 258
    //   282: astore 15
    //   284: goto -80 -> 204
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	this	lnq
    //   0	287	1	paramContext	Context
    //   0	287	2	paramInt1	int
    //   0	287	3	paramSQLiteDatabase	SQLiteDatabase
    //   0	287	4	paramoqw	oqw
    //   0	287	5	paramString1	String
    //   0	287	6	paramLong	long
    //   0	287	8	paramInt2	int
    //   0	287	9	paramBoolean1	boolean
    //   0	287	10	paramBoolean2	boolean
    //   0	287	11	paramString2	String
    //   5	96	12	localopo	opo
    //   14	221	13	str1	String
    //   42	128	14	localContentValues	android.content.ContentValues
    //   199	18	15	localObject1	Object
    //   282	1	15	localObject2	Object
    //   157	53	16	localCursor1	android.database.Cursor
    //   153	3	17	localCursor2	android.database.Cursor
    //   219	1	18	localSQLiteConstraintException	android.database.sqlite.SQLiteConstraintException
    //   239	13	19	str2	String
    //   256	22	20	str3	String
    // Exception table:
    //   from	to	target	type
    //   125	155	199	finally
    //   111	123	219	android/database/sqlite/SQLiteConstraintException
    //   159	184	282	finally
  }
  
  public final ArrayList<Integer> b(Context paramContext, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(Arrays.asList(b));
    Iterator localIterator = mbb.c(paramContext, lpo.class).iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((lpo)localIterator.next()).a());
    }
    return localArrayList;
  }
  
  public final ArrayList<Integer> c(Context paramContext, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = mbb.c(paramContext, lpo.class).iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((lpo)localIterator.next()).b());
    }
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnq
 * JD-Core Version:    0.7.0.1
 */