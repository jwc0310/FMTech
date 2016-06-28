import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import java.util.Set;

public final class auz
{
  static final String[] a = { "local_content_uri" };
  private static final String[] k = { "_id", "_data", "mime_type" };
  final Context b;
  final int c;
  final Uri d;
  final hco e;
  final ContentResolver f;
  final SQLiteDatabase g;
  final ContentValues h;
  final aut i;
  volatile boolean j;
  
  public auz(Context paramContext, int paramInt, Uri paramUri, hco paramhco, aut paramaut)
  {
    this.b = paramContext;
    this.c = paramInt;
    this.d = paramUri;
    this.e = paramhco;
    this.i = paramaut;
    this.f = paramContext.getContentResolver();
    this.g = bqj.a(paramContext, paramInt).getWritableDatabase();
    this.h = new ContentValues();
  }
  
  private final void a(int paramInt, ava paramava)
  {
    int m = 0;
    for (;;)
    {
      Cursor localCursor;
      if (!this.j)
      {
        localCursor = paramava.a(3000, m);
        if (localCursor != null) {}
      }
      else
      {
        return;
      }
      try
      {
        paramava.a(localCursor);
        if (localCursor.getCount() < 3000)
        {
          if (Log.isLoggable("MediaUriSync", 3))
          {
            int n = m / 3000;
            new StringBuilder(45).append("Reached cursor limit total pages: ").append(n);
          }
          return;
        }
        m += 3000;
        localCursor.close();
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  final int a(Set<String> paramSet)
  {
    this.g.beginTransaction();
    try
    {
      avd localavd = new avd(this, paramSet);
      a(3000, localavd);
      int m = localavd.a;
      this.g.setTransactionSuccessful();
      return m;
    }
    finally
    {
      this.g.endTransaction();
    }
  }
  
  /* Error */
  final Set<String> a()
  {
    // Byte code:
    //   0: invokestatic 149	android/os/SystemClock:currentThreadTimeMillis	()J
    //   3: lstore_1
    //   4: aload_0
    //   5: getfield 74	auz:g	Landroid/database/sqlite/SQLiteDatabase;
    //   8: invokevirtual 127	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   11: new 151	java/util/HashSet
    //   14: dup
    //   15: iconst_0
    //   16: invokespecial 152	java/util/HashSet:<init>	(I)V
    //   19: pop
    //   20: aload_0
    //   21: getfield 51	auz:d	Landroid/net/Uri;
    //   24: astore 5
    //   26: getstatic 41	auz:k	[Ljava/lang/String;
    //   29: arraylength
    //   30: istore 6
    //   32: iload 6
    //   34: iconst_3
    //   35: iadd
    //   36: anewarray 29	java/lang/String
    //   39: astore 7
    //   41: getstatic 41	auz:k	[Ljava/lang/String;
    //   44: iconst_0
    //   45: aload 7
    //   47: iconst_0
    //   48: iload 6
    //   50: invokestatic 158	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   53: aload 5
    //   55: ldc 160
    //   57: ldc 160
    //   59: invokestatic 165	efj:a	(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   62: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   65: astore 8
    //   67: ldc 171
    //   69: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   72: astore 9
    //   74: aload 7
    //   76: iload 6
    //   78: new 106	java/lang/StringBuilder
    //   81: dup
    //   82: iconst_4
    //   83: aload 8
    //   85: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   88: invokevirtual 174	java/lang/String:length	()I
    //   91: iadd
    //   92: aload 9
    //   94: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   97: invokevirtual 174	java/lang/String:length	()I
    //   100: iadd
    //   101: invokespecial 109	java/lang/StringBuilder:<init>	(I)V
    //   104: aload 8
    //   106: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: ldc 176
    //   111: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload 9
    //   116: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: aastore
    //   123: iload 6
    //   125: iconst_1
    //   126: iadd
    //   127: istore 10
    //   129: aload 5
    //   131: invokestatic 185	mfq:c	(Landroid/net/Uri;)Z
    //   134: ifeq +273 -> 407
    //   137: ldc 187
    //   139: astore 11
    //   141: aload 11
    //   143: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   146: astore 12
    //   148: ldc 189
    //   150: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   153: astore 13
    //   155: aload 7
    //   157: iload 10
    //   159: new 106	java/lang/StringBuilder
    //   162: dup
    //   163: iconst_4
    //   164: aload 12
    //   166: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   169: invokevirtual 174	java/lang/String:length	()I
    //   172: iadd
    //   173: aload 13
    //   175: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   178: invokevirtual 174	java/lang/String:length	()I
    //   181: iadd
    //   182: invokespecial 109	java/lang/StringBuilder:<init>	(I)V
    //   185: aload 12
    //   187: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc 176
    //   192: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: aload 13
    //   197: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   203: aastore
    //   204: iload 6
    //   206: iconst_2
    //   207: iadd
    //   208: istore 14
    //   210: aload 5
    //   212: ldc 191
    //   214: ldc 191
    //   216: invokestatic 165	efj:a	(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   219: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   222: astore 15
    //   224: ldc 193
    //   226: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   229: astore 16
    //   231: aload 7
    //   233: iload 14
    //   235: new 106	java/lang/StringBuilder
    //   238: dup
    //   239: iconst_4
    //   240: aload 15
    //   242: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   245: invokevirtual 174	java/lang/String:length	()I
    //   248: iadd
    //   249: aload 16
    //   251: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   254: invokevirtual 174	java/lang/String:length	()I
    //   257: iadd
    //   258: invokespecial 109	java/lang/StringBuilder:<init>	(I)V
    //   261: aload 15
    //   263: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: ldc 176
    //   268: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: aload 16
    //   273: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   279: aastore
    //   280: aload_0
    //   281: getfield 51	auz:d	Landroid/net/Uri;
    //   284: invokestatic 185	mfq:c	(Landroid/net/Uri;)Z
    //   287: pop
    //   288: new 195	avb
    //   291: dup
    //   292: aload_0
    //   293: aload 7
    //   295: ldc 191
    //   297: invokespecial 198	avb:<init>	(Lauz;[Ljava/lang/String;Ljava/lang/String;)V
    //   300: astore 18
    //   302: aload_0
    //   303: sipush 3000
    //   306: aload 18
    //   308: invokespecial 134	auz:a	(ILava;)V
    //   311: aload 18
    //   313: getfield 201	avb:a	Ljava/util/Set;
    //   316: astore 19
    //   318: aload_0
    //   319: getfield 74	auz:g	Landroid/database/sqlite/SQLiteDatabase;
    //   322: invokevirtual 139	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   325: aload_0
    //   326: getfield 74	auz:g	Landroid/database/sqlite/SQLiteDatabase;
    //   329: invokevirtual 142	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   332: ldc 98
    //   334: iconst_3
    //   335: invokestatic 104	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   338: ifeq +66 -> 404
    //   341: ldc 203
    //   343: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   346: astore 20
    //   348: invokestatic 149	android/os/SystemClock:currentThreadTimeMillis	()J
    //   351: lload_1
    //   352: lsub
    //   353: invokestatic 206	efj:a	(J)Ljava/lang/String;
    //   356: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   359: astore 21
    //   361: new 106	java/lang/StringBuilder
    //   364: dup
    //   365: bipush 31
    //   367: aload 20
    //   369: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   372: invokevirtual 174	java/lang/String:length	()I
    //   375: iadd
    //   376: aload 21
    //   378: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   381: invokevirtual 174	java/lang/String:length	()I
    //   384: iadd
    //   385: invokespecial 109	java/lang/StringBuilder:<init>	(I)V
    //   388: aload 20
    //   390: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: aload 21
    //   395: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: ldc 208
    //   400: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: pop
    //   404: aload 19
    //   406: areturn
    //   407: ldc 210
    //   409: astore 11
    //   411: goto -270 -> 141
    //   414: astore 4
    //   416: aload_0
    //   417: getfield 74	auz:g	Landroid/database/sqlite/SQLiteDatabase;
    //   420: invokevirtual 142	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   423: aload 4
    //   425: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	426	0	this	auz
    //   3	349	1	l	long
    //   414	10	4	localObject	Object
    //   24	187	5	localUri	Uri
    //   30	178	6	m	int
    //   39	255	7	arrayOfString	String[]
    //   65	40	8	str1	String
    //   72	43	9	str2	String
    //   127	31	10	n	int
    //   139	271	11	str3	String
    //   146	40	12	str4	String
    //   153	43	13	str5	String
    //   208	26	14	i1	int
    //   222	40	15	str6	String
    //   229	43	16	str7	String
    //   300	12	18	localavb	avb
    //   316	89	19	localSet	Set
    //   346	43	20	str8	String
    //   359	35	21	str9	String
    // Exception table:
    //   from	to	target	type
    //   20	123	414	finally
    //   129	137	414	finally
    //   141	204	414	finally
    //   210	325	414	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     auz
 * JD-Core Version:    0.7.0.1
 */