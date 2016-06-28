import android.content.Context;
import android.util.Log;
import java.io.File;

public class bsr
{
  public final File a;
  
  protected bsr(File paramFile)
  {
    this.a = paramFile;
  }
  
  protected static File a(Context paramContext, String paramString)
  {
    File localFile = new File(paramContext.getApplicationContext().getCacheDir(), paramString);
    if ((!localFile.exists()) && (!localFile.mkdir()))
    {
      String str = String.valueOf(localFile);
      Log.e("GenericFileCache", 31 + String.valueOf(str).length() + "Cannot create cache directory: " + str);
    }
    return localFile;
  }
  
  public final void a()
  {
    File[] arrayOfFile = this.a.listFiles();
    if (arrayOfFile != null) {
      for (int i = 0; i < arrayOfFile.length; i++) {
        if (!arrayOfFile[i].delete())
        {
          String str = String.valueOf(arrayOfFile[i].getName());
          Log.e("GenericFileCache", 20 + String.valueOf(str).length() + "Unable to delete '" + str + "'.");
        }
      }
    }
  }
  
  public final void a(String paramString, qat paramqat)
  {
    a(paramString, qat.a(paramqat));
  }
  
  /* Error */
  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 98	java/io/FileOutputStream
    //   5: dup
    //   6: new 16	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: getfield 13	bsr:a	Ljava/io/File;
    //   14: aload_1
    //   15: invokespecial 29	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   18: invokespecial 100	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   21: astore 4
    //   23: aload 4
    //   25: aload_2
    //   26: invokevirtual 104	java/io/FileOutputStream:write	([B)V
    //   29: aload 4
    //   31: invokevirtual 107	java/io/FileOutputStream:close	()V
    //   34: return
    //   35: astore 11
    //   37: aconst_null
    //   38: astore 4
    //   40: aload 4
    //   42: ifnull -8 -> 34
    //   45: aload 4
    //   47: invokevirtual 107	java/io/FileOutputStream:close	()V
    //   50: return
    //   51: astore 6
    //   53: return
    //   54: astore 8
    //   56: aload_3
    //   57: ifnull +7 -> 64
    //   60: aload_3
    //   61: invokevirtual 107	java/io/FileOutputStream:close	()V
    //   64: aload 8
    //   66: athrow
    //   67: astore 10
    //   69: return
    //   70: astore 9
    //   72: goto -8 -> 64
    //   75: astore 7
    //   77: aload 4
    //   79: astore_3
    //   80: aload 7
    //   82: astore 8
    //   84: goto -28 -> 56
    //   87: astore 5
    //   89: goto -49 -> 40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	bsr
    //   0	92	1	paramString	String
    //   0	92	2	paramArrayOfByte	byte[]
    //   1	79	3	localObject1	Object
    //   21	57	4	localFileOutputStream	java.io.FileOutputStream
    //   87	1	5	localException1	java.lang.Exception
    //   51	1	6	localIOException1	java.io.IOException
    //   75	6	7	localObject2	Object
    //   54	11	8	localObject3	Object
    //   82	1	8	localObject4	Object
    //   70	1	9	localIOException2	java.io.IOException
    //   67	1	10	localIOException3	java.io.IOException
    //   35	1	11	localException2	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   2	23	35	java/lang/Exception
    //   45	50	51	java/io/IOException
    //   2	23	54	finally
    //   29	34	67	java/io/IOException
    //   60	64	70	java/io/IOException
    //   23	29	75	finally
    //   23	29	87	java/lang/Exception
  }
  
  /* Error */
  public final byte[] a(String paramString, long paramLong)
  {
    // Byte code:
    //   0: new 16	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: getfield 13	bsr:a	Ljava/io/File;
    //   8: aload_1
    //   9: invokespecial 29	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   12: astore 4
    //   14: aload 4
    //   16: invokevirtual 33	java/io/File:exists	()Z
    //   19: ifne +5 -> 24
    //   22: aconst_null
    //   23: areturn
    //   24: invokestatic 116	java/lang/System:currentTimeMillis	()J
    //   27: aload 4
    //   29: invokevirtual 119	java/io/File:lastModified	()J
    //   32: lsub
    //   33: lload_2
    //   34: lcmp
    //   35: ifge -13 -> 22
    //   38: new 121	java/io/FileInputStream
    //   41: dup
    //   42: aload 4
    //   44: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: astore 5
    //   49: aload 4
    //   51: invokevirtual 124	java/io/File:length	()J
    //   54: l2i
    //   55: istore 14
    //   57: iload 14
    //   59: newarray byte
    //   61: astore 15
    //   63: iconst_0
    //   64: istore 16
    //   66: iload 14
    //   68: ifle +95 -> 163
    //   71: aload 5
    //   73: aload 15
    //   75: iload 16
    //   77: iload 14
    //   79: invokevirtual 128	java/io/FileInputStream:read	([BII)I
    //   82: istore 17
    //   84: iload 17
    //   86: ifge +60 -> 146
    //   89: new 96	java/io/IOException
    //   92: dup
    //   93: new 46	java/lang/StringBuilder
    //   96: dup
    //   97: bipush 47
    //   99: invokespecial 53	java/lang/StringBuilder:<init>	(I)V
    //   102: ldc 130
    //   104: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: iload 14
    //   109: invokevirtual 133	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   112: ldc 135
    //   114: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: invokespecial 138	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   123: athrow
    //   124: astore 11
    //   126: aload 5
    //   128: astore 12
    //   130: aload 12
    //   132: ifnull -110 -> 22
    //   135: aload 12
    //   137: invokevirtual 139	java/io/FileInputStream:close	()V
    //   140: aconst_null
    //   141: areturn
    //   142: astore 13
    //   144: aconst_null
    //   145: areturn
    //   146: iload 16
    //   148: iload 17
    //   150: iadd
    //   151: istore 16
    //   153: iload 14
    //   155: iload 17
    //   157: isub
    //   158: istore 14
    //   160: goto -94 -> 66
    //   163: aload 5
    //   165: invokevirtual 139	java/io/FileInputStream:close	()V
    //   168: aload 15
    //   170: areturn
    //   171: astore 6
    //   173: aconst_null
    //   174: astore 5
    //   176: ldc 44
    //   178: ldc 141
    //   180: aload 6
    //   182: invokestatic 144	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   185: pop
    //   186: aload 5
    //   188: ifnull -166 -> 22
    //   191: aload 5
    //   193: invokevirtual 139	java/io/FileInputStream:close	()V
    //   196: aconst_null
    //   197: areturn
    //   198: astore 10
    //   200: aconst_null
    //   201: areturn
    //   202: astore 20
    //   204: aconst_null
    //   205: astore 5
    //   207: aload 20
    //   209: astore 7
    //   211: aload 5
    //   213: ifnull +8 -> 221
    //   216: aload 5
    //   218: invokevirtual 139	java/io/FileInputStream:close	()V
    //   221: aload 7
    //   223: athrow
    //   224: astore 18
    //   226: goto -58 -> 168
    //   229: astore 8
    //   231: goto -10 -> 221
    //   234: astore 7
    //   236: goto -25 -> 211
    //   239: astore 6
    //   241: goto -65 -> 176
    //   244: astore 19
    //   246: aconst_null
    //   247: astore 12
    //   249: goto -119 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	bsr
    //   0	252	1	paramString	String
    //   0	252	2	paramLong	long
    //   12	38	4	localFile	File
    //   47	170	5	localFileInputStream1	java.io.FileInputStream
    //   171	10	6	localException1	java.lang.Exception
    //   239	1	6	localException2	java.lang.Exception
    //   209	13	7	localObject1	Object
    //   234	1	7	localObject2	Object
    //   229	1	8	localIOException1	java.io.IOException
    //   198	1	10	localIOException2	java.io.IOException
    //   124	1	11	localFileNotFoundException1	java.io.FileNotFoundException
    //   128	120	12	localFileInputStream2	java.io.FileInputStream
    //   142	1	13	localIOException3	java.io.IOException
    //   55	104	14	i	int
    //   61	108	15	arrayOfByte	byte[]
    //   64	88	16	j	int
    //   82	76	17	k	int
    //   224	1	18	localIOException4	java.io.IOException
    //   244	1	19	localFileNotFoundException2	java.io.FileNotFoundException
    //   202	6	20	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   49	63	124	java/io/FileNotFoundException
    //   71	84	124	java/io/FileNotFoundException
    //   89	124	124	java/io/FileNotFoundException
    //   135	140	142	java/io/IOException
    //   38	49	171	java/lang/Exception
    //   191	196	198	java/io/IOException
    //   38	49	202	finally
    //   163	168	224	java/io/IOException
    //   216	221	229	java/io/IOException
    //   49	63	234	finally
    //   71	84	234	finally
    //   89	124	234	finally
    //   176	186	234	finally
    //   49	63	239	java/lang/Exception
    //   71	84	239	java/lang/Exception
    //   89	124	239	java/lang/Exception
    //   38	49	244	java/io/FileNotFoundException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsr
 * JD-Core Version:    0.7.0.1
 */