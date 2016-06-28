import android.content.Context;
import java.io.File;
import java.util.EnumMap;
import java.util.HashSet;

public final class jrp
{
  private static EnumMap<jrr, jrp> d;
  private HashSet<String> a;
  private final File b;
  private final String c;
  
  private jrp(Context paramContext, String paramString1, String paramString2)
  {
    this.b = new File(new File(paramContext.getCacheDir(), paramString1), paramString2);
    this.c = this.b.toString();
  }
  
  public static jrp a(Context paramContext, jrr paramjrr)
  {
    for (;;)
    {
      try
      {
        if (d == null) {
          d = new EnumMap(jrr.class);
        }
        jrp localjrp;
        if (d.containsKey(paramjrr))
        {
          localjrp = (jrp)d.get(paramjrr);
          return localjrp;
        }
        Context localContext = paramContext.getApplicationContext();
        switch (jrq.a[paramjrr.ordinal()])
        {
        case 1: 
          localjrp = new jrp(localContext, "local_media_meta_data", str);
          d.put(paramjrr, localjrp);
          continue;
          str = "pano_data";
        }
      }
      finally {}
      continue;
      String str = "pano_360_data";
      continue;
      str = null;
    }
  }
  
  /* Error */
  private final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 85	jrp:a	Ljava/util/HashSet;
    //   4: ifnull +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: new 87	java/util/HashSet
    //   12: dup
    //   13: invokespecial 88	java/util/HashSet:<init>	()V
    //   16: putfield 85	jrp:a	Ljava/util/HashSet;
    //   19: aload_0
    //   20: getfield 32	jrp:b	Ljava/io/File;
    //   23: invokevirtual 92	java/io/File:exists	()Z
    //   26: ifeq -19 -> 7
    //   29: aconst_null
    //   30: astore_1
    //   31: new 94	java/io/BufferedReader
    //   34: dup
    //   35: new 96	java/io/FileReader
    //   38: dup
    //   39: aload_0
    //   40: getfield 32	jrp:b	Ljava/io/File;
    //   43: invokespecial 99	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   46: invokespecial 102	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   49: astore_2
    //   50: aload_2
    //   51: invokevirtual 105	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   54: astore 8
    //   56: aload 8
    //   58: ifnull +26 -> 84
    //   61: aload_0
    //   62: getfield 85	jrp:a	Ljava/util/HashSet;
    //   65: aload 8
    //   67: invokevirtual 108	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   70: pop
    //   71: aload_2
    //   72: invokevirtual 105	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   75: astore 10
    //   77: aload 10
    //   79: astore 8
    //   81: goto -25 -> 56
    //   84: aload_2
    //   85: invokevirtual 111	java/io/BufferedReader:close	()V
    //   88: return
    //   89: astore 11
    //   91: return
    //   92: astore 12
    //   94: aconst_null
    //   95: astore_2
    //   96: aload_2
    //   97: invokevirtual 111	java/io/BufferedReader:close	()V
    //   100: return
    //   101: astore 4
    //   103: return
    //   104: astore 6
    //   106: aload_1
    //   107: invokevirtual 111	java/io/BufferedReader:close	()V
    //   110: aload 6
    //   112: athrow
    //   113: astore 7
    //   115: goto -5 -> 110
    //   118: astore 5
    //   120: aload_2
    //   121: astore_1
    //   122: aload 5
    //   124: astore 6
    //   126: goto -20 -> 106
    //   129: astore_3
    //   130: goto -34 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	jrp
    //   30	92	1	localObject1	Object
    //   49	72	2	localBufferedReader	java.io.BufferedReader
    //   129	1	3	localException1	java.lang.Exception
    //   101	1	4	localException2	java.lang.Exception
    //   118	5	5	localObject2	Object
    //   104	7	6	localObject3	Object
    //   124	1	6	localObject4	Object
    //   113	1	7	localException3	java.lang.Exception
    //   54	26	8	localObject5	Object
    //   75	3	10	str	String
    //   89	1	11	localException4	java.lang.Exception
    //   92	1	12	localException5	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   84	88	89	java/lang/Exception
    //   31	50	92	java/lang/Exception
    //   96	100	101	java/lang/Exception
    //   31	50	104	finally
    //   106	110	113	java/lang/Exception
    //   50	56	118	finally
    //   61	77	118	finally
    //   50	56	129	java/lang/Exception
    //   61	77	129	java/lang/Exception
  }
  
  /* Error */
  public final void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 118	jrp:a	()V
    //   6: aload_0
    //   7: getfield 85	jrp:a	Ljava/util/HashSet;
    //   10: aload_1
    //   11: invokevirtual 121	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   14: istore_3
    //   15: iload_3
    //   16: ifeq +6 -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: new 123	java/io/FileOutputStream
    //   25: dup
    //   26: aload_0
    //   27: getfield 38	jrp:c	Ljava/lang/String;
    //   30: iconst_1
    //   31: invokespecial 126	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   34: astore 4
    //   36: new 128	java/io/BufferedWriter
    //   39: dup
    //   40: new 130	java/io/OutputStreamWriter
    //   43: dup
    //   44: aload 4
    //   46: invokespecial 133	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   49: invokespecial 136	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   52: astore 5
    //   54: aload 5
    //   56: aload_1
    //   57: invokevirtual 139	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   60: aload 5
    //   62: invokevirtual 142	java/io/BufferedWriter:newLine	()V
    //   65: aload 5
    //   67: invokevirtual 143	java/io/BufferedWriter:close	()V
    //   70: aload_0
    //   71: getfield 85	jrp:a	Ljava/util/HashSet;
    //   74: aload_1
    //   75: invokevirtual 108	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   78: pop
    //   79: goto -60 -> 19
    //   82: astore 9
    //   84: new 21	java/io/File
    //   87: dup
    //   88: aload_0
    //   89: getfield 38	jrp:c	Ljava/lang/String;
    //   92: invokespecial 145	java/io/File:<init>	(Ljava/lang/String;)V
    //   95: invokevirtual 148	java/io/File:getParentFile	()Ljava/io/File;
    //   98: astore 10
    //   100: aload 10
    //   102: ifnull +48 -> 150
    //   105: aload 10
    //   107: invokevirtual 92	java/io/File:exists	()Z
    //   110: ifne +40 -> 150
    //   113: aload 10
    //   115: invokevirtual 151	java/io/File:mkdirs	()Z
    //   118: pop
    //   119: new 123	java/io/FileOutputStream
    //   122: dup
    //   123: aload_0
    //   124: getfield 38	jrp:c	Ljava/lang/String;
    //   127: invokespecial 152	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   130: astore 4
    //   132: goto -96 -> 36
    //   135: astore_2
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_2
    //   139: athrow
    //   140: astore 6
    //   142: aload 5
    //   144: invokevirtual 143	java/io/BufferedWriter:close	()V
    //   147: aload 6
    //   149: athrow
    //   150: aconst_null
    //   151: astore 4
    //   153: goto -117 -> 36
    //   156: astore 7
    //   158: goto -139 -> 19
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	jrp
    //   0	161	1	paramString	String
    //   135	4	2	localObject1	Object
    //   14	2	3	bool	boolean
    //   34	118	4	localFileOutputStream	java.io.FileOutputStream
    //   52	91	5	localBufferedWriter	java.io.BufferedWriter
    //   140	8	6	localObject2	Object
    //   156	1	7	localIOException	java.io.IOException
    //   82	1	9	localFileNotFoundException	java.io.FileNotFoundException
    //   98	16	10	localFile	File
    // Exception table:
    //   from	to	target	type
    //   22	36	82	java/io/FileNotFoundException
    //   2	15	135	finally
    //   22	36	135	finally
    //   36	54	135	finally
    //   65	79	135	finally
    //   84	100	135	finally
    //   105	132	135	finally
    //   142	150	135	finally
    //   54	65	140	finally
    //   22	36	156	java/io/IOException
    //   36	54	156	java/io/IOException
    //   65	79	156	java/io/IOException
    //   84	100	156	java/io/IOException
    //   105	132	156	java/io/IOException
    //   142	150	156	java/io/IOException
  }
  
  public final boolean b(String paramString)
  {
    try
    {
      a();
      boolean bool = this.a.contains(paramString);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jrp
 * JD-Core Version:    0.7.0.1
 */