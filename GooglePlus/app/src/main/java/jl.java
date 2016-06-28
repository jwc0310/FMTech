import android.content.Context;
import android.graphics.BitmapFactory.Options;

final class jl
{
  final Context a;
  BitmapFactory.Options b = null;
  final Object c = new Object();
  int d = 2;
  int e = 2;
  int f = 1;
  
  jl(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  private final android.graphics.Bitmap a(android.net.Uri paramUri, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ifnull +10 -> 13
    //   6: aload_0
    //   7: getfield 31	jl:a	Landroid/content/Context;
    //   10: ifnonnull +13 -> 23
    //   13: new 36	java/lang/IllegalArgumentException
    //   16: dup
    //   17: ldc 38
    //   19: invokespecial 41	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   22: athrow
    //   23: aload_0
    //   24: getfield 31	jl:a	Landroid/content/Context;
    //   27: invokevirtual 47	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   30: aload_1
    //   31: invokevirtual 53	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   34: astore_3
    //   35: aload_3
    //   36: aconst_null
    //   37: aload_2
    //   38: invokestatic 59	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   41: astore 6
    //   43: aload_3
    //   44: ifnull +7 -> 51
    //   47: aload_3
    //   48: invokevirtual 64	java/io/InputStream:close	()V
    //   51: aload 6
    //   53: areturn
    //   54: astore 4
    //   56: aload_3
    //   57: ifnull +7 -> 64
    //   60: aload_3
    //   61: invokevirtual 64	java/io/InputStream:close	()V
    //   64: aload 4
    //   66: athrow
    //   67: astore 7
    //   69: aload 6
    //   71: areturn
    //   72: astore 5
    //   74: goto -10 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	jl
    //   0	77	1	paramUri	android.net.Uri
    //   0	77	2	paramOptions	BitmapFactory.Options
    //   1	60	3	localInputStream	java.io.InputStream
    //   54	11	4	localObject	Object
    //   72	1	5	localIOException1	java.io.IOException
    //   41	29	6	localBitmap	android.graphics.Bitmap
    //   67	1	7	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   23	43	54	finally
    //   47	51	67	java/io/IOException
    //   60	64	72	java/io/IOException
  }
  
  /* Error */
  final android.graphics.Bitmap a(android.net.Uri paramUri, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iload_2
    //   3: ifle +14 -> 17
    //   6: aload_1
    //   7: ifnull +10 -> 17
    //   10: aload_0
    //   11: getfield 31	jl:a	Landroid/content/Context;
    //   14: ifnonnull +13 -> 27
    //   17: new 36	java/lang/IllegalArgumentException
    //   20: dup
    //   21: ldc 147
    //   23: invokespecial 41	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    //   27: new 149	android/graphics/BitmapFactory$Options
    //   30: dup
    //   31: invokespecial 150	android/graphics/BitmapFactory$Options:<init>	()V
    //   34: astore 4
    //   36: aload 4
    //   38: iload_3
    //   39: putfield 154	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   42: aload_0
    //   43: aload_1
    //   44: aload 4
    //   46: invokespecial 156	jl:a	(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   49: pop
    //   50: aload 4
    //   52: getfield 159	android/graphics/BitmapFactory$Options:outWidth	I
    //   55: istore 6
    //   57: aload 4
    //   59: getfield 162	android/graphics/BitmapFactory$Options:outHeight	I
    //   62: istore 7
    //   64: iload 6
    //   66: ifle +8 -> 74
    //   69: iload 7
    //   71: ifgt +5 -> 76
    //   74: aconst_null
    //   75: areturn
    //   76: iload 6
    //   78: iload 7
    //   80: invokestatic 165	java/lang/Math:max	(II)I
    //   83: istore 8
    //   85: iload 8
    //   87: iload_2
    //   88: if_icmple +16 -> 104
    //   91: iload 8
    //   93: iconst_1
    //   94: iushr
    //   95: istore 8
    //   97: iload_3
    //   98: iconst_1
    //   99: ishl
    //   100: istore_3
    //   101: goto -16 -> 85
    //   104: iload_3
    //   105: ifle -31 -> 74
    //   108: iload 6
    //   110: iload 7
    //   112: invokestatic 167	java/lang/Math:min	(II)I
    //   115: iload_3
    //   116: idiv
    //   117: ifle -43 -> 74
    //   120: aload_0
    //   121: getfield 23	jl:c	Ljava/lang/Object;
    //   124: astore 9
    //   126: aload 9
    //   128: monitorenter
    //   129: aload_0
    //   130: new 149	android/graphics/BitmapFactory$Options
    //   133: dup
    //   134: invokespecial 150	android/graphics/BitmapFactory$Options:<init>	()V
    //   137: putfield 21	jl:b	Landroid/graphics/BitmapFactory$Options;
    //   140: aload_0
    //   141: getfield 21	jl:b	Landroid/graphics/BitmapFactory$Options;
    //   144: iconst_1
    //   145: putfield 170	android/graphics/BitmapFactory$Options:inMutable	Z
    //   148: aload_0
    //   149: getfield 21	jl:b	Landroid/graphics/BitmapFactory$Options;
    //   152: iload_3
    //   153: putfield 173	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   156: aload_0
    //   157: getfield 21	jl:b	Landroid/graphics/BitmapFactory$Options;
    //   160: astore 11
    //   162: aload 9
    //   164: monitorexit
    //   165: aload_0
    //   166: aload_1
    //   167: aload 11
    //   169: invokespecial 156	jl:a	(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   172: astore 15
    //   174: aload_0
    //   175: getfield 23	jl:c	Ljava/lang/Object;
    //   178: astore 16
    //   180: aload 16
    //   182: monitorenter
    //   183: aload_0
    //   184: aconst_null
    //   185: putfield 21	jl:b	Landroid/graphics/BitmapFactory$Options;
    //   188: aload 16
    //   190: monitorexit
    //   191: aload 15
    //   193: areturn
    //   194: astore 17
    //   196: aload 16
    //   198: monitorexit
    //   199: aload 17
    //   201: athrow
    //   202: astore 10
    //   204: aload 9
    //   206: monitorexit
    //   207: aload 10
    //   209: athrow
    //   210: astore 12
    //   212: aload_0
    //   213: getfield 23	jl:c	Ljava/lang/Object;
    //   216: astore 13
    //   218: aload 13
    //   220: monitorenter
    //   221: aload_0
    //   222: aconst_null
    //   223: putfield 21	jl:b	Landroid/graphics/BitmapFactory$Options;
    //   226: aload 13
    //   228: monitorexit
    //   229: aload 12
    //   231: athrow
    //   232: astore 14
    //   234: aload 13
    //   236: monitorexit
    //   237: aload 14
    //   239: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	jl
    //   0	240	1	paramUri	android.net.Uri
    //   0	240	2	paramInt	int
    //   1	152	3	i	int
    //   34	24	4	localOptions1	BitmapFactory.Options
    //   55	54	6	j	int
    //   62	49	7	k	int
    //   83	13	8	m	int
    //   124	81	9	localObject1	Object
    //   202	6	10	localObject2	Object
    //   160	8	11	localOptions2	BitmapFactory.Options
    //   210	20	12	localObject3	Object
    //   216	19	13	localObject4	Object
    //   232	6	14	localObject5	Object
    //   172	20	15	localBitmap	android.graphics.Bitmap
    //   178	19	16	localObject6	Object
    //   194	6	17	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   183	191	194	finally
    //   196	199	194	finally
    //   129	165	202	finally
    //   204	207	202	finally
    //   165	174	210	finally
    //   221	229	232	finally
    //   234	237	232	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jl
 * JD-Core Version:    0.7.0.1
 */