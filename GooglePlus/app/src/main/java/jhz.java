import android.content.Context;

public final class jhz
  extends kde<mvn, mvo>
{
  private final Integer a;
  private final String b;
  private final String c;
  private final int d;
  private final hrz e;
  
  public jhz(Context paramContext, kcg paramkcg, int paramInt, Integer paramInteger, String paramString)
  {
    super(paramContext, paramkcg, "getvolumecontrols", new mvn(), new mvo());
    this.d = paramInt;
    this.a = paramInteger;
    this.c = paramString;
    this.b = efj.s(paramString);
    this.e = ((hrz)mbb.a(paramContext, hrz.class));
  }
  
  /* Error */
  private final void a(int paramInt, String paramString, omv paramomv)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: getfield 52	jhz:e	Lhrz;
    //   7: aload_0
    //   8: getfield 57	jhz:j	Landroid/content/Context;
    //   11: iload_1
    //   12: invokevirtual 60	hrz:b	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteOpenHelper;
    //   15: invokevirtual 66	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 5
    //   20: aload 5
    //   22: invokevirtual 71	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   25: new 73	android/content/ContentValues
    //   28: dup
    //   29: invokespecial 74	android/content/ContentValues:<init>	()V
    //   32: astore 6
    //   34: aload_3
    //   35: getfield 78	omv:b	I
    //   38: iconst_2
    //   39: if_icmpne +180 -> 219
    //   42: aload 6
    //   44: ldc 80
    //   46: iload 4
    //   48: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: invokevirtual 90	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   54: aload 6
    //   56: ldc 92
    //   58: aload_3
    //   59: getfield 94	omv:a	I
    //   62: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: invokevirtual 90	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   68: aload 6
    //   70: ldc 96
    //   72: invokestatic 102	java/lang/System:currentTimeMillis	()J
    //   75: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   78: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   81: aload 5
    //   83: ldc 112
    //   85: aload 6
    //   87: ldc 114
    //   89: iconst_1
    //   90: anewarray 116	java/lang/String
    //   93: dup
    //   94: iconst_0
    //   95: aload_2
    //   96: aastore
    //   97: invokevirtual 120	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   100: pop
    //   101: aload 5
    //   103: invokevirtual 123	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   106: aload 5
    //   108: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   111: aload_0
    //   112: getfield 57	jhz:j	Landroid/content/Context;
    //   115: invokevirtual 132	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   118: astore 9
    //   120: aload_0
    //   121: getfield 57	jhz:j	Landroid/content/Context;
    //   124: ldc 134
    //   126: invokestatic 50	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   129: checkcast 134	jjz
    //   132: invokeinterface 137 1 0
    //   137: astore 10
    //   139: ldc 139
    //   141: invokestatic 142	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   144: astore 11
    //   146: aload 9
    //   148: new 144	java/lang/StringBuilder
    //   151: dup
    //   152: bipush 11
    //   154: aload 10
    //   156: invokestatic 142	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   159: invokevirtual 148	java/lang/String:length	()I
    //   162: iadd
    //   163: aload 11
    //   165: invokestatic 142	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   168: invokevirtual 148	java/lang/String:length	()I
    //   171: iadd
    //   172: invokespecial 151	java/lang/StringBuilder:<init>	(I)V
    //   175: ldc 153
    //   177: invokevirtual 157	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: aload 10
    //   182: invokevirtual 157	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: ldc 159
    //   187: invokevirtual 157	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: aload 11
    //   192: invokevirtual 157	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: invokestatic 168	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   201: aconst_null
    //   202: invokevirtual 174	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   205: aload 9
    //   207: aload_0
    //   208: getfield 57	jhz:j	Landroid/content/Context;
    //   211: invokestatic 178	efj:w	(Landroid/content/Context;)Landroid/net/Uri;
    //   214: aconst_null
    //   215: invokevirtual 174	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   218: return
    //   219: iconst_0
    //   220: istore 4
    //   222: goto -180 -> 42
    //   225: astore 7
    //   227: aload 5
    //   229: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   232: aload 7
    //   234: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	jhz
    //   0	235	1	paramInt	int
    //   0	235	2	paramString	String
    //   0	235	3	paramomv	omv
    //   1	220	4	i	int
    //   18	210	5	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   32	54	6	localContentValues	android.content.ContentValues
    //   225	8	7	localObject	java.lang.Object
    //   118	88	9	localContentResolver	android.content.ContentResolver
    //   137	44	10	str1	String
    //   144	47	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   25	42	225	finally
    //   42	106	225	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jhz
 * JD-Core Version:    0.7.0.1
 */