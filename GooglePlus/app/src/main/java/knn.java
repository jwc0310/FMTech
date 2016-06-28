import android.content.Context;
import android.widget.ImageView;

public final class knn
{
  final String a;
  final ImageView b;
  private final Context c;
  private final int d;
  private final int e;
  
  public knn(Context paramContext, String paramString, ImageView paramImageView, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.a = paramString;
    this.d = paramInt1;
    this.e = paramInt2;
    this.b = paramImageView;
  }
  
  /* Error */
  final android.graphics.Bitmap a(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +13 -> 14
    //   4: new 35	java/lang/IllegalArgumentException
    //   7: dup
    //   8: ldc 37
    //   10: invokespecial 40	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   13: athrow
    //   14: aload_1
    //   15: invokestatic 46	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   18: astore 5
    //   20: aload 5
    //   22: ifnonnull +66 -> 88
    //   25: aload_1
    //   26: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: astore 6
    //   31: aload 6
    //   33: invokevirtual 56	java/lang/String:length	()I
    //   36: ifeq +22 -> 58
    //   39: ldc 58
    //   41: aload 6
    //   43: invokevirtual 62	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   46: astore 7
    //   48: ldc 64
    //   50: aload 7
    //   52: invokestatic 69	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   55: pop
    //   56: aconst_null
    //   57: areturn
    //   58: new 48	java/lang/String
    //   61: dup
    //   62: ldc 58
    //   64: invokespecial 70	java/lang/String:<init>	(Ljava/lang/String;)V
    //   67: astore 7
    //   69: goto -21 -> 48
    //   72: astore_2
    //   73: ldc 64
    //   75: ldc 72
    //   77: aload_2
    //   78: invokestatic 75	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   81: pop
    //   82: aconst_null
    //   83: astore 4
    //   85: aload 4
    //   87: areturn
    //   88: aload_0
    //   89: getfield 20	knn:c	Landroid/content/Context;
    //   92: invokevirtual 81	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   95: aload 5
    //   97: invokestatic 86	mfq:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   100: astore 9
    //   102: aload 9
    //   104: ifnonnull +57 -> 161
    //   107: aconst_null
    //   108: astore 10
    //   110: aload 10
    //   112: ifnonnull +73 -> 185
    //   115: aload 5
    //   117: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   120: astore 11
    //   122: ldc 64
    //   124: new 88	java/lang/StringBuilder
    //   127: dup
    //   128: bipush 44
    //   130: aload 11
    //   132: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   135: invokevirtual 56	java/lang/String:length	()I
    //   138: iadd
    //   139: invokespecial 91	java/lang/StringBuilder:<init>	(I)V
    //   142: ldc 93
    //   144: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: aload 11
    //   149: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokestatic 69	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   158: pop
    //   159: aconst_null
    //   160: areturn
    //   161: aload 9
    //   163: invokestatic 104	mfq:c	(Ljava/lang/String;)Z
    //   166: ifeq +11 -> 177
    //   169: getstatic 109	ipm:b	Lipm;
    //   172: astore 10
    //   174: goto -64 -> 110
    //   177: getstatic 111	ipm:a	Lipm;
    //   180: astore 10
    //   182: goto -72 -> 110
    //   185: aload_0
    //   186: getfield 20	knn:c	Landroid/content/Context;
    //   189: aload 5
    //   191: aload 10
    //   193: invokestatic 116	ipf:a	(Landroid/content/Context;Landroid/net/Uri;Lipm;)Lipf;
    //   196: astore 13
    //   198: aload_0
    //   199: getfield 20	knn:c	Landroid/content/Context;
    //   202: ldc 118
    //   204: invokestatic 123	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   207: checkcast 118	ipb
    //   210: aload 13
    //   212: iconst_0
    //   213: aload_0
    //   214: getfield 24	knn:d	I
    //   217: aload_0
    //   218: getfield 26	knn:e	I
    //   221: sipush 256
    //   224: invokevirtual 126	ipb:a	(Lipf;IIII)Ljava/lang/Object;
    //   227: checkcast 128	android/graphics/Bitmap
    //   230: astore 4
    //   232: goto -147 -> 85
    //   235: astore_2
    //   236: goto -163 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	knn
    //   0	239	1	paramString	String
    //   72	6	2	localkbc	kbc
    //   235	1	2	localkbm	kbm
    //   83	148	4	localBitmap	android.graphics.Bitmap
    //   18	172	5	localUri	android.net.Uri
    //   29	13	6	str1	String
    //   46	22	7	str2	String
    //   100	62	9	str3	String
    //   108	84	10	localipm	ipm
    //   120	28	11	str4	String
    //   196	15	13	localipf	ipf
    // Exception table:
    //   from	to	target	type
    //   14	20	72	kbc
    //   25	48	72	kbc
    //   48	56	72	kbc
    //   58	69	72	kbc
    //   88	102	72	kbc
    //   115	159	72	kbc
    //   161	174	72	kbc
    //   177	182	72	kbc
    //   185	232	72	kbc
    //   14	20	235	kbm
    //   25	48	235	kbm
    //   48	56	235	kbm
    //   58	69	235	kbm
    //   88	102	235	kbm
    //   115	159	235	kbm
    //   161	174	235	kbm
    //   177	182	235	kbm
    //   185	232	235	kbm
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knn
 * JD-Core Version:    0.7.0.1
 */