import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class kca
{
  public static final AtomicInteger a = new AtomicInteger();
  private static final Map<String, Integer> b = new HashMap();
  
  public final int a(String paramString)
  {
    int i = 1;
    try
    {
      if (b.containsKey(paramString)) {
        i = 1 + ((Integer)b.get(paramString)).intValue();
      }
      b.put(paramString, Integer.valueOf(i));
      return i;
    }
    finally {}
  }
  
  /* Error */
  public final void a(android.content.Context paramContext, byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 53	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: invokevirtual 59	android/content/Context:getFilesDir	()Ljava/io/File;
    //   8: ldc 61
    //   10: invokespecial 64	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   13: astore 7
    //   15: aload_0
    //   16: monitorenter
    //   17: aload 7
    //   19: invokevirtual 68	java/io/File:exists	()Z
    //   22: ifne +313 -> 335
    //   25: aload 7
    //   27: invokevirtual 71	java/io/File:mkdirs	()Z
    //   30: istore 9
    //   32: aload_0
    //   33: monitorexit
    //   34: aload 5
    //   36: getstatic 77	java/util/Locale:US	Ljava/util/Locale;
    //   39: invokevirtual 83	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   42: ldc 85
    //   44: ldc 87
    //   46: invokevirtual 91	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   49: ldc 93
    //   51: ldc 87
    //   53: invokevirtual 91	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   56: ldc 95
    //   58: ldc 87
    //   60: invokevirtual 91	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   63: astore 10
    //   65: iload 9
    //   67: ifeq +145 -> 212
    //   70: new 97	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   77: astore 11
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: astore 12
    //   85: aload 12
    //   87: iconst_0
    //   88: iload_3
    //   89: invokestatic 44	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   92: aastore
    //   93: aload 11
    //   95: ldc 100
    //   97: aload 12
    //   99: invokestatic 104	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   102: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload 11
    //   108: bipush 95
    //   110: invokevirtual 111	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload 11
    //   116: aload 10
    //   118: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload 11
    //   124: aload 6
    //   126: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 11
    //   132: bipush 95
    //   134: invokevirtual 111	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: iconst_1
    //   139: anewarray 4	java/lang/Object
    //   142: astore 18
    //   144: aload 18
    //   146: iconst_0
    //   147: iload 4
    //   149: invokestatic 44	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   152: aastore
    //   153: aload 11
    //   155: ldc 113
    //   157: aload 18
    //   159: invokestatic 104	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   162: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload 11
    //   168: ldc 115
    //   170: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: new 53	java/io/File
    //   177: dup
    //   178: aload 7
    //   180: aload 11
    //   182: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   185: invokespecial 64	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   188: astore 21
    //   190: new 121	java/io/FileOutputStream
    //   193: dup
    //   194: aload 21
    //   196: invokespecial 124	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   199: astore 22
    //   201: aload 22
    //   203: aload_2
    //   204: invokevirtual 130	java/io/OutputStream:write	([B)V
    //   207: aload 22
    //   209: invokevirtual 133	java/io/OutputStream:close	()V
    //   212: return
    //   213: astore 8
    //   215: aload_0
    //   216: monitorexit
    //   217: aload 8
    //   219: athrow
    //   220: astore 31
    //   222: ldc 61
    //   224: ldc 135
    //   226: aload 31
    //   228: invokestatic 141	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   231: pop
    //   232: return
    //   233: astore 23
    //   235: aconst_null
    //   236: astore 22
    //   238: iconst_1
    //   239: anewarray 4	java/lang/Object
    //   242: astore 27
    //   244: aload 27
    //   246: iconst_0
    //   247: aload 21
    //   249: invokevirtual 144	java/io/File:getName	()Ljava/lang/String;
    //   252: aastore
    //   253: ldc 61
    //   255: ldc 146
    //   257: aload 27
    //   259: invokestatic 104	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   262: aload 23
    //   264: invokestatic 141	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   267: pop
    //   268: aload 22
    //   270: ifnull -58 -> 212
    //   273: aload 22
    //   275: invokevirtual 133	java/io/OutputStream:close	()V
    //   278: return
    //   279: astore 29
    //   281: ldc 61
    //   283: ldc 135
    //   285: aload 29
    //   287: invokestatic 141	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   290: pop
    //   291: return
    //   292: astore 24
    //   294: aconst_null
    //   295: astore 22
    //   297: aload 22
    //   299: ifnull +8 -> 307
    //   302: aload 22
    //   304: invokevirtual 133	java/io/OutputStream:close	()V
    //   307: aload 24
    //   309: athrow
    //   310: astore 25
    //   312: ldc 61
    //   314: ldc 135
    //   316: aload 25
    //   318: invokestatic 141	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   321: pop
    //   322: goto -15 -> 307
    //   325: astore 24
    //   327: goto -30 -> 297
    //   330: astore 23
    //   332: goto -94 -> 238
    //   335: iconst_1
    //   336: istore 9
    //   338: goto -306 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	341	0	this	kca
    //   0	341	1	paramContext	android.content.Context
    //   0	341	2	paramArrayOfByte	byte[]
    //   0	341	3	paramInt1	int
    //   0	341	4	paramInt2	int
    //   0	341	5	paramString1	String
    //   0	341	6	paramString2	String
    //   13	166	7	localFile1	java.io.File
    //   213	5	8	localObject1	Object
    //   30	307	9	bool	boolean
    //   63	54	10	str	String
    //   77	104	11	localStringBuilder	java.lang.StringBuilder
    //   83	15	12	arrayOfObject1	Object[]
    //   142	16	18	arrayOfObject2	Object[]
    //   188	60	21	localFile2	java.io.File
    //   199	104	22	localFileOutputStream	java.io.FileOutputStream
    //   233	30	23	localIOException1	java.io.IOException
    //   330	1	23	localIOException2	java.io.IOException
    //   292	16	24	localObject2	Object
    //   325	1	24	localObject3	Object
    //   310	7	25	localIOException3	java.io.IOException
    //   242	16	27	arrayOfObject3	Object[]
    //   279	7	29	localIOException4	java.io.IOException
    //   220	7	31	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   17	32	213	finally
    //   32	34	213	finally
    //   215	217	213	finally
    //   207	212	220	java/io/IOException
    //   190	201	233	java/io/IOException
    //   273	278	279	java/io/IOException
    //   190	201	292	finally
    //   302	307	310	java/io/IOException
    //   201	207	325	finally
    //   238	268	325	finally
    //   201	207	330	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kca
 * JD-Core Version:    0.7.0.1
 */