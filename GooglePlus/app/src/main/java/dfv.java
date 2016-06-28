import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

public final class dfv
  extends hqe<dfw>
{
  private static final String[] d = { "data", "comment_count", "media_attr", "user_actions", "last_refresh_time", "acl" };
  private final fv e = new fv(this);
  private final int f;
  private final String h;
  private final String r;
  private String s;
  
  public dfv(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    super(paramContext);
    this.f = paramInt;
    this.h = paramString1;
    this.r = paramString2;
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    if (bool1) {
      label11:
      return bool2;
    }
    Cursor localCursor1;
    try
    {
      Cursor localCursor2 = paramSQLiteDatabase.query("shared_collections", new String[] { "_id" }, "_id = ?", new String[] { paramString }, null, null, null);
      localCursor1 = localCursor2;
    }
    finally
    {
      try
      {
        boolean bool3 = localCursor1.moveToFirst();
        bool2 = bool3;
        if (localCursor1 == null) {
          break label11;
        }
        localCursor1.close();
        return bool2;
      }
      finally {}
      localObject1 = finally;
      localCursor1 = null;
    }
    if (localCursor1 != null) {
      localCursor1.close();
    }
    throw localObject1;
  }
  
  /* Error */
  private dfw r()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 85	dfv:s	Ljava/lang/String;
    //   5: aload_0
    //   6: getfield 91	fu:l	Landroid/content/Context;
    //   9: aload_0
    //   10: getfield 47	dfv:f	I
    //   13: invokestatic 96	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   16: invokevirtual 100	bqj:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   19: astore_1
    //   20: iconst_2
    //   21: anewarray 19	java/lang/String
    //   24: astore 6
    //   26: aload 6
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield 49	dfv:h	Ljava/lang/String;
    //   33: aastore
    //   34: aload 6
    //   36: iconst_1
    //   37: aload_0
    //   38: getfield 51	dfv:r	Ljava/lang/String;
    //   41: aastore
    //   42: aload_1
    //   43: ldc 102
    //   45: getstatic 33	dfv:d	[Ljava/lang/String;
    //   48: ldc 104
    //   50: aload 6
    //   52: aconst_null
    //   53: aconst_null
    //   54: aconst_null
    //   55: invokevirtual 71	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   58: astore 7
    //   60: aload 7
    //   62: astore_3
    //   63: aload_3
    //   64: invokeinterface 77 1 0
    //   69: ifeq +238 -> 307
    //   72: new 106	ojf
    //   75: dup
    //   76: invokespecial 108	ojf:<init>	()V
    //   79: astore 9
    //   81: aload_3
    //   82: iconst_0
    //   83: invokeinterface 112 2 0
    //   88: astore 10
    //   90: aload 9
    //   92: aload 10
    //   94: iconst_0
    //   95: aload 10
    //   97: arraylength
    //   98: invokestatic 118	qat:b	(Lqat;[BII)Lqat;
    //   101: checkcast 106	ojf
    //   104: astore 11
    //   106: aload 11
    //   108: aload_3
    //   109: iconst_1
    //   110: invokeinterface 122 2 0
    //   115: invokestatic 128	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   118: putfield 132	ojf:j	Ljava/lang/Integer;
    //   121: aload_3
    //   122: iconst_2
    //   123: invokeinterface 136 2 0
    //   128: lstore 12
    //   130: aload_3
    //   131: iconst_3
    //   132: invokeinterface 136 2 0
    //   137: lstore 14
    //   139: aload_3
    //   140: iconst_4
    //   141: invokeinterface 136 2 0
    //   146: lstore 16
    //   148: aload_3
    //   149: iconst_5
    //   150: invokeinterface 140 2 0
    //   155: ifeq +130 -> 285
    //   158: iconst_m1
    //   159: istore 18
    //   161: aload 11
    //   163: getfield 144	ojf:x	[Loif;
    //   166: ifnull +51 -> 217
    //   169: aload 11
    //   171: getfield 144	ojf:x	[Loif;
    //   174: arraylength
    //   175: ifeq +42 -> 217
    //   178: aload 11
    //   180: getfield 144	ojf:x	[Loif;
    //   183: iconst_0
    //   184: aaload
    //   185: getfield 148	oif:b	Ljava/lang/String;
    //   188: ifnull +29 -> 217
    //   191: iload 18
    //   193: iconst_2
    //   194: if_icmpeq +9 -> 203
    //   197: iload 18
    //   199: iconst_m1
    //   200: if_icmpne +17 -> 217
    //   203: aload_0
    //   204: aload 11
    //   206: getfield 144	ojf:x	[Loif;
    //   209: iconst_0
    //   210: aaload
    //   211: getfield 148	oif:b	Ljava/lang/String;
    //   214: putfield 85	dfv:s	Ljava/lang/String;
    //   217: aload_0
    //   218: invokevirtual 151	dfv:q	()V
    //   221: aload_0
    //   222: getfield 155	hqe:g	Z
    //   225: ifne +140 -> 365
    //   228: aload_0
    //   229: aload_0
    //   230: invokevirtual 158	hqe:o	()Z
    //   233: putfield 155	hqe:g	Z
    //   236: goto +129 -> 365
    //   239: aload_1
    //   240: aload_0
    //   241: getfield 85	dfv:s	Ljava/lang/String;
    //   244: invokestatic 160	dfv:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Z
    //   247: ifeq +54 -> 301
    //   250: goto +130 -> 380
    //   253: new 162	dfw
    //   256: dup
    //   257: aload 11
    //   259: lload 12
    //   261: lload 14
    //   263: lload 16
    //   265: iload 19
    //   267: invokespecial 165	dfw:<init>	(Lojf;JJJZ)V
    //   270: astore 20
    //   272: aload_3
    //   273: ifnull +9 -> 282
    //   276: aload_3
    //   277: invokeinterface 80 1 0
    //   282: aload 20
    //   284: areturn
    //   285: aload_3
    //   286: iconst_5
    //   287: invokeinterface 122 2 0
    //   292: istore 21
    //   294: iload 21
    //   296: istore 18
    //   298: goto -137 -> 161
    //   301: iconst_0
    //   302: istore 19
    //   304: goto -51 -> 253
    //   307: aload_3
    //   308: ifnull +9 -> 317
    //   311: aload_3
    //   312: invokeinterface 80 1 0
    //   317: aconst_null
    //   318: areturn
    //   319: astore 4
    //   321: aconst_null
    //   322: astore 5
    //   324: aload 5
    //   326: ifnull +10 -> 336
    //   329: aload 5
    //   331: invokeinterface 80 1 0
    //   336: aconst_null
    //   337: areturn
    //   338: astore_2
    //   339: aconst_null
    //   340: astore_3
    //   341: aload_3
    //   342: ifnull +9 -> 351
    //   345: aload_3
    //   346: invokeinterface 80 1 0
    //   351: aload_2
    //   352: athrow
    //   353: astore_2
    //   354: goto -13 -> 341
    //   357: astore 8
    //   359: aload_3
    //   360: astore 5
    //   362: goto -38 -> 324
    //   365: iload 18
    //   367: iconst_2
    //   368: if_icmpeq -129 -> 239
    //   371: iload 18
    //   373: iconst_m1
    //   374: if_icmpne +6 -> 380
    //   377: goto -138 -> 239
    //   380: iconst_1
    //   381: istore 19
    //   383: goto -130 -> 253
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	386	0	this	dfv
    //   19	221	1	localSQLiteDatabase	SQLiteDatabase
    //   338	14	2	localObject1	Object
    //   353	1	2	localObject2	Object
    //   62	298	3	localCursor1	Cursor
    //   319	1	4	localqas1	qas
    //   322	39	5	localCursor2	Cursor
    //   24	27	6	arrayOfString	String[]
    //   58	3	7	localCursor3	Cursor
    //   357	1	8	localqas2	qas
    //   79	12	9	localojf1	ojf
    //   88	8	10	arrayOfByte	byte[]
    //   104	154	11	localojf2	ojf
    //   128	132	12	l1	long
    //   137	125	14	l2	long
    //   146	118	16	l3	long
    //   159	216	18	i	int
    //   265	117	19	bool	boolean
    //   270	13	20	localdfw	dfw
    //   292	3	21	j	int
    // Exception table:
    //   from	to	target	type
    //   20	60	319	qas
    //   20	60	338	finally
    //   63	158	353	finally
    //   161	191	353	finally
    //   203	217	353	finally
    //   217	236	353	finally
    //   239	250	353	finally
    //   253	272	353	finally
    //   285	294	353	finally
    //   63	158	357	qas
    //   161	191	357	qas
    //   203	217	357	qas
    //   217	236	357	qas
    //   239	250	357	qas
    //   253	272	357	qas
    //   285	294	357	qas
  }
  
  protected final boolean o()
  {
    ContentResolver localContentResolver1 = this.l.getContentResolver();
    String str1 = this.r;
    localContentResolver1.registerContentObserver(jrf.b.buildUpon().appendEncodedPath(str1).build(), false, this.e);
    if (!TextUtils.isEmpty(this.s))
    {
      ContentResolver localContentResolver2 = this.l.getContentResolver();
      String str2 = this.s;
      localContentResolver2.registerContentObserver(jqx.b.buildUpon().appendEncodedPath(str2).build(), false, this.e);
    }
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.e);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfv
 * JD-Core Version:    0.7.0.1
 */