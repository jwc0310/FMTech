final class jsx
  implements jta<Object>
{
  private long a;
  private String b;
  private jsw c;
  
  public jsx(jss paramjss, long paramLong, String paramString, jsw paramjsw)
  {
    this.a = paramLong;
    this.b = paramString;
    this.c = paramjsw;
  }
  
  /* Error */
  public final void a(android.os.ParcelFileDescriptor paramParcelFileDescriptor, Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	jsx:a	J
    //   4: invokestatic 35	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   7: invokestatic 40	iaw:b	(Ljava/lang/Object;)Ljava/lang/String;
    //   10: invokestatic 44	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual 48	java/lang/String:length	()I
    //   18: ifeq +113 -> 131
    //   21: ldc 50
    //   23: aload_3
    //   24: invokevirtual 54	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   27: astore 4
    //   29: aload 4
    //   31: invokestatic 59	jsm:a	(Ljava/lang/String;)I
    //   34: istore 5
    //   36: aconst_null
    //   37: astore 6
    //   39: new 61	android/os/ParcelFileDescriptor$AutoCloseOutputStream
    //   42: dup
    //   43: aload_1
    //   44: invokespecial 64	android/os/ParcelFileDescriptor$AutoCloseOutputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   47: astore 7
    //   49: aload_0
    //   50: getfield 24	jsx:c	Ljsw;
    //   53: astore 8
    //   55: sipush 2048
    //   58: newarray byte
    //   60: astore 17
    //   62: invokestatic 70	android/os/SystemClock:elapsedRealtime	()J
    //   65: lstore 18
    //   67: aload_0
    //   68: getfield 22	jsx:b	Ljava/lang/String;
    //   71: invokestatic 75	jsi:a	(Ljava/lang/String;)Ljava/io/InputStream;
    //   74: astore 6
    //   76: aload 6
    //   78: aload 17
    //   80: invokevirtual 81	java/io/InputStream:read	([B)I
    //   83: istore 21
    //   85: iload 21
    //   87: ifle +58 -> 145
    //   90: aload 7
    //   92: aload 17
    //   94: iconst_0
    //   95: iload 21
    //   97: invokevirtual 87	java/io/OutputStream:write	([BII)V
    //   100: aload 8
    //   102: ifnull +13 -> 115
    //   105: aload 8
    //   107: aload 17
    //   109: iconst_0
    //   110: iload 21
    //   112: invokevirtual 91	jsw:a	([BII)V
    //   115: aload 6
    //   117: aload 17
    //   119: invokevirtual 81	java/io/InputStream:read	([B)I
    //   122: istore 22
    //   124: iload 22
    //   126: istore 21
    //   128: goto -43 -> 85
    //   131: new 42	java/lang/String
    //   134: dup
    //   135: ldc 50
    //   137: invokespecial 94	java/lang/String:<init>	(Ljava/lang/String;)V
    //   140: astore 4
    //   142: goto -113 -> 29
    //   145: invokestatic 70	android/os/SystemClock:elapsedRealtime	()J
    //   148: lload 18
    //   150: lsub
    //   151: invokestatic 97	jsm:a	(J)V
    //   154: aload 8
    //   156: ifnull +8 -> 164
    //   159: aload 8
    //   161: invokevirtual 99	jsw:a	()V
    //   164: aload 7
    //   166: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   169: aload 6
    //   171: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   174: iload 5
    //   176: ldc 104
    //   178: invokestatic 107	jsm:a	(ILjava/lang/String;)V
    //   181: return
    //   182: astore 20
    //   184: invokestatic 70	android/os/SystemClock:elapsedRealtime	()J
    //   187: lload 18
    //   189: lsub
    //   190: invokestatic 97	jsm:a	(J)V
    //   193: aload 20
    //   195: athrow
    //   196: astore 14
    //   198: aload 6
    //   200: invokestatic 110	jsi:a	(Ljava/io/InputStream;)V
    //   203: aload 14
    //   205: invokestatic 44	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   208: astore 15
    //   210: new 112	java/lang/StringBuilder
    //   213: dup
    //   214: bipush 29
    //   216: aload 15
    //   218: invokestatic 44	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   221: invokevirtual 48	java/lang/String:length	()I
    //   224: iadd
    //   225: invokespecial 115	java/lang/StringBuilder:<init>	(I)V
    //   228: ldc 117
    //   230: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: aload 15
    //   235: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: aload 7
    //   241: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   244: aload 6
    //   246: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   249: iload 5
    //   251: ldc 104
    //   253: invokestatic 107	jsm:a	(ILjava/lang/String;)V
    //   256: return
    //   257: astore 10
    //   259: aload 6
    //   261: invokestatic 110	jsi:a	(Ljava/io/InputStream;)V
    //   264: aload_0
    //   265: getfield 22	jsx:b	Ljava/lang/String;
    //   268: invokestatic 40	iaw:b	(Ljava/lang/Object;)Ljava/lang/String;
    //   271: invokestatic 44	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   274: astore 11
    //   276: aload 11
    //   278: invokevirtual 48	java/lang/String:length	()I
    //   281: ifeq +29 -> 310
    //   284: ldc 123
    //   286: aload 11
    //   288: invokevirtual 54	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   291: pop
    //   292: aload 7
    //   294: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   297: aload 6
    //   299: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   302: iload 5
    //   304: ldc 104
    //   306: invokestatic 107	jsm:a	(ILjava/lang/String;)V
    //   309: return
    //   310: new 42	java/lang/String
    //   313: dup
    //   314: ldc 123
    //   316: invokespecial 94	java/lang/String:<init>	(Ljava/lang/String;)V
    //   319: pop
    //   320: goto -28 -> 292
    //   323: astore 9
    //   325: aload 7
    //   327: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   330: aload 6
    //   332: invokestatic 102	iaw:a	(Ljava/io/Closeable;)V
    //   335: iload 5
    //   337: ldc 104
    //   339: invokestatic 107	jsm:a	(ILjava/lang/String;)V
    //   342: aload 9
    //   344: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	jsx
    //   0	345	1	paramParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   0	345	2	paramObject	Object
    //   13	11	3	str1	String
    //   27	114	4	str2	String
    //   34	302	5	i	int
    //   37	294	6	localInputStream	java.io.InputStream
    //   47	279	7	localAutoCloseOutputStream	android.os.ParcelFileDescriptor.AutoCloseOutputStream
    //   53	107	8	localjsw	jsw
    //   323	20	9	localObject1	Object
    //   257	1	10	localThrowable	java.lang.Throwable
    //   274	13	11	str3	String
    //   196	8	14	localIOException	java.io.IOException
    //   208	26	15	str4	String
    //   60	58	17	arrayOfByte	byte[]
    //   65	123	18	l	long
    //   182	12	20	localObject2	Object
    //   83	44	21	j	int
    //   122	3	22	k	int
    // Exception table:
    //   from	to	target	type
    //   67	85	182	finally
    //   90	100	182	finally
    //   105	115	182	finally
    //   115	124	182	finally
    //   55	67	196	java/io/IOException
    //   145	154	196	java/io/IOException
    //   159	164	196	java/io/IOException
    //   184	196	196	java/io/IOException
    //   55	67	257	java/lang/Throwable
    //   145	154	257	java/lang/Throwable
    //   159	164	257	java/lang/Throwable
    //   184	196	257	java/lang/Throwable
    //   55	67	323	finally
    //   145	154	323	finally
    //   159	164	323	finally
    //   184	196	323	finally
    //   198	239	323	finally
    //   259	292	323	finally
    //   310	320	323	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsx
 * JD-Core Version:    0.7.0.1
 */