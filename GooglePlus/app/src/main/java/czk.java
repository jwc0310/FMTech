import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import java.io.File;

final class czk
  extends AsyncTask<Void, Void, Void>
{
  private String[] a = new String[4];
  private String[] b = new String[4];
  private long[] c = new long[4];
  private long d;
  
  czk(czf paramczf) {}
  
  /* Error */
  private final File a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 34	java/io/File
    //   5: dup
    //   6: invokestatic 40	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   9: aload_2
    //   10: invokespecial 43	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   13: astore 4
    //   15: aload 4
    //   17: invokevirtual 47	java/io/File:exists	()Z
    //   20: ifeq +9 -> 29
    //   23: aload 4
    //   25: invokevirtual 50	java/io/File:delete	()Z
    //   28: pop
    //   29: aload_0
    //   30: getfield 18	czk:e	Lczf;
    //   33: getfield 55	czf:a	Landroid/content/Context;
    //   36: aload_1
    //   37: invokevirtual 61	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   40: astore 5
    //   42: aload 4
    //   44: invokevirtual 64	java/io/File:createNewFile	()Z
    //   47: pop
    //   48: new 66	java/io/BufferedOutputStream
    //   51: dup
    //   52: new 68	java/io/FileOutputStream
    //   55: dup
    //   56: aload 4
    //   58: invokespecial 71	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   61: invokespecial 74	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   64: astore 12
    //   66: new 76	java/io/BufferedInputStream
    //   69: dup
    //   70: new 78	java/io/FileInputStream
    //   73: dup
    //   74: aload 5
    //   76: invokespecial 79	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   79: invokespecial 82	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   82: astore 7
    //   84: sipush 16384
    //   87: newarray byte
    //   89: astore 18
    //   91: aload 7
    //   93: aload 18
    //   95: invokevirtual 86	java/io/BufferedInputStream:read	([B)I
    //   98: istore 19
    //   100: iload 19
    //   102: ifle +92 -> 194
    //   105: aload 12
    //   107: aload 18
    //   109: iconst_0
    //   110: iload 19
    //   112: invokevirtual 90	java/io/BufferedOutputStream:write	([BII)V
    //   115: aload_0
    //   116: aload_0
    //   117: getfield 92	czk:d	J
    //   120: iload 19
    //   122: i2l
    //   123: ladd
    //   124: putfield 92	czk:d	J
    //   127: aload_0
    //   128: getfield 18	czk:e	Lczf;
    //   131: getfield 95	czf:c	Landroid/os/Handler;
    //   134: invokevirtual 101	android/os/Handler:obtainMessage	()Landroid/os/Message;
    //   137: astore 20
    //   139: aload 20
    //   141: aload_0
    //   142: getfield 92	czk:d	J
    //   145: l2i
    //   146: putfield 107	android/os/Message:arg1	I
    //   149: aload_0
    //   150: getfield 18	czk:e	Lczf;
    //   153: getfield 95	czf:c	Landroid/os/Handler;
    //   156: aload 20
    //   158: invokevirtual 111	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   161: pop
    //   162: goto -71 -> 91
    //   165: astore 17
    //   167: aload 12
    //   169: astore 8
    //   171: aload 8
    //   173: ifnull +8 -> 181
    //   176: aload 8
    //   178: invokevirtual 114	java/io/BufferedOutputStream:close	()V
    //   181: aload 7
    //   183: ifnull +8 -> 191
    //   186: aload 7
    //   188: invokevirtual 115	java/io/BufferedInputStream:close	()V
    //   191: aload 4
    //   193: areturn
    //   194: aload 12
    //   196: invokevirtual 114	java/io/BufferedOutputStream:close	()V
    //   199: aload 7
    //   201: invokevirtual 115	java/io/BufferedInputStream:close	()V
    //   204: aload 4
    //   206: areturn
    //   207: astore 23
    //   209: aload 4
    //   211: areturn
    //   212: astore 11
    //   214: aconst_null
    //   215: astore 12
    //   217: aload 12
    //   219: ifnull +8 -> 227
    //   222: aload 12
    //   224: invokevirtual 114	java/io/BufferedOutputStream:close	()V
    //   227: aload_3
    //   228: ifnull +7 -> 235
    //   231: aload_3
    //   232: invokevirtual 115	java/io/BufferedInputStream:close	()V
    //   235: aload 11
    //   237: athrow
    //   238: astore 22
    //   240: goto -41 -> 199
    //   243: astore 10
    //   245: goto -64 -> 181
    //   248: astore 9
    //   250: aload 4
    //   252: areturn
    //   253: astore 14
    //   255: goto -28 -> 227
    //   258: astore 13
    //   260: goto -25 -> 235
    //   263: astore 11
    //   265: aconst_null
    //   266: astore_3
    //   267: goto -50 -> 217
    //   270: astore 16
    //   272: aload 7
    //   274: astore_3
    //   275: aload 16
    //   277: astore 11
    //   279: goto -62 -> 217
    //   282: astore 6
    //   284: aconst_null
    //   285: astore 7
    //   287: aconst_null
    //   288: astore 8
    //   290: goto -119 -> 171
    //   293: astore 24
    //   295: aload 12
    //   297: astore 8
    //   299: aconst_null
    //   300: astore 7
    //   302: goto -131 -> 171
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	305	0	this	czk
    //   0	305	1	paramString1	String
    //   0	305	2	paramString2	String
    //   1	274	3	localObject1	java.lang.Object
    //   13	238	4	localFile1	File
    //   40	35	5	localFile2	File
    //   282	1	6	localIOException1	java.io.IOException
    //   82	219	7	localBufferedInputStream	java.io.BufferedInputStream
    //   169	129	8	localBufferedOutputStream1	java.io.BufferedOutputStream
    //   248	1	9	localIOException2	java.io.IOException
    //   243	1	10	localIOException3	java.io.IOException
    //   212	24	11	localObject2	java.lang.Object
    //   263	1	11	localObject3	java.lang.Object
    //   277	1	11	localObject4	java.lang.Object
    //   64	232	12	localBufferedOutputStream2	java.io.BufferedOutputStream
    //   258	1	13	localIOException4	java.io.IOException
    //   253	1	14	localIOException5	java.io.IOException
    //   270	6	16	localObject5	java.lang.Object
    //   165	1	17	localIOException6	java.io.IOException
    //   89	19	18	arrayOfByte	byte[]
    //   98	23	19	i	int
    //   137	20	20	localMessage	android.os.Message
    //   238	1	22	localIOException7	java.io.IOException
    //   207	1	23	localIOException8	java.io.IOException
    //   293	1	24	localIOException9	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   84	91	165	java/io/IOException
    //   91	100	165	java/io/IOException
    //   105	162	165	java/io/IOException
    //   199	204	207	java/io/IOException
    //   42	66	212	finally
    //   194	199	238	java/io/IOException
    //   176	181	243	java/io/IOException
    //   186	191	248	java/io/IOException
    //   222	227	253	java/io/IOException
    //   231	235	258	java/io/IOException
    //   66	84	263	finally
    //   84	91	270	finally
    //   91	100	270	finally
    //   105	162	270	finally
    //   42	66	282	java/io/IOException
    //   66	84	293	java/io/IOException
  }
  
  protected final void onPreExecute()
  {
    int i = bgp.a(this.e.a);
    this.a[0] = (16 + "es" + i + ".db");
    this.a[1] = "picasa.db";
    this.a[2] = "iu.picasa.db";
    this.a[3] = "iu.upload.db";
    this.b[0] = (22 + "es" + i + "_dump.bin");
    this.b[1] = "picasa_dump.bin";
    this.b[2] = "iu.picasa_dump.bin";
    this.b[3] = "iu.upload_dump.bin";
    long l = 0L;
    for (int j = 0; j < 4; j++)
    {
      String str = this.a[j];
      File localFile = this.e.a.getDatabasePath(str);
      if ((localFile.exists()) && (localFile.isFile()))
      {
        this.c[j] = localFile.length();
        l += this.c[j];
      }
    }
    this.e.b.setMax((int)l);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czk
 * JD-Core Version:    0.7.0.1
 */