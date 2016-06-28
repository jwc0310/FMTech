import android.content.Context;
import android.os.AsyncTask;

final class hbx
  extends AsyncTask<Void, Void, Void>
{
  private final Context a;
  private final int b;
  private final giz c;
  
  public hbx(hbw paramhbw, Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.c = ((giz)mbb.a(paramContext, giz.class));
  }
  
  /* Error */
  private Void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	hbx:c	Lgiz;
    //   4: aload_0
    //   5: getfield 24	hbx:b	I
    //   8: invokeinterface 37 2 0
    //   13: ifeq +131 -> 144
    //   16: aload_0
    //   17: getfield 33	hbx:c	Lgiz;
    //   20: aload_0
    //   21: getfield 24	hbx:b	I
    //   24: invokeinterface 40 2 0
    //   29: ldc 42
    //   31: invokeinterface 47 2 0
    //   36: astore 4
    //   38: new 49	kcg
    //   41: dup
    //   42: aload_0
    //   43: getfield 22	hbx:a	Landroid/content/Context;
    //   46: aload_0
    //   47: getfield 24	hbx:b	I
    //   50: invokespecial 52	kcg:<init>	(Landroid/content/Context;I)V
    //   53: astore 5
    //   55: new 54	jru
    //   58: dup
    //   59: aload_0
    //   60: getfield 22	hbx:a	Landroid/content/Context;
    //   63: aload 5
    //   65: aload 4
    //   67: getstatic 59	hbw:a	Lojl;
    //   70: invokespecial 62	jru:<init>	(Landroid/content/Context;Lkcg;Ljava/lang/String;Lojl;)V
    //   73: astore 6
    //   75: aload 6
    //   77: invokevirtual 65	jru:i	()V
    //   80: aload 6
    //   82: invokevirtual 69	jru:n	()Z
    //   85: ifne +46 -> 131
    //   88: aload 6
    //   90: getfield 72	jru:a	Lojj;
    //   93: astore 7
    //   95: aload 7
    //   97: ifnull +34 -> 131
    //   100: aload 7
    //   102: getfield 78	ojj:e	Lojo;
    //   105: ifnull +26 -> 131
    //   108: aload 7
    //   110: getfield 78	ojj:e	Lojo;
    //   113: invokestatic 83	iuk:a	(Lojo;)Liuk;
    //   116: astore 8
    //   118: aload_0
    //   119: getfield 22	hbx:a	Landroid/content/Context;
    //   122: aload_0
    //   123: getfield 24	hbx:b	I
    //   126: aload 8
    //   128: invokestatic 88	com/google/android/libraries/social/autobackup/AutoBackupProvider:a	(Landroid/content/Context;ILiuk;)V
    //   131: aload_0
    //   132: getfield 17	hbx:d	Lhbw;
    //   135: aload_0
    //   136: getfield 24	hbx:b	I
    //   139: invokevirtual 91	hbw:a	(I)V
    //   142: aconst_null
    //   143: areturn
    //   144: ldc 93
    //   146: bipush 6
    //   148: invokestatic 99	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   151: ifeq -20 -> 131
    //   154: aload_0
    //   155: getfield 24	hbx:b	I
    //   158: istore_2
    //   159: ldc 93
    //   161: new 101	java/lang/StringBuilder
    //   164: dup
    //   165: bipush 50
    //   167: invokespecial 103	java/lang/StringBuilder:<init>	(I)V
    //   170: ldc 105
    //   172: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: iload_2
    //   176: invokevirtual 112	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   179: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: invokestatic 119	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   185: pop
    //   186: goto -55 -> 131
    //   189: astore_1
    //   190: aload_0
    //   191: getfield 17	hbx:d	Lhbw;
    //   194: aload_0
    //   195: getfield 24	hbx:b	I
    //   198: invokevirtual 91	hbw:a	(I)V
    //   201: aload_1
    //   202: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	this	hbx
    //   189	13	1	localObject	java.lang.Object
    //   158	18	2	i	int
    //   36	30	4	str	java.lang.String
    //   53	11	5	localkcg	kcg
    //   73	16	6	localjru	jru
    //   93	16	7	localojj	ojj
    //   116	11	8	localiuk	iuk
    // Exception table:
    //   from	to	target	type
    //   0	95	189	finally
    //   100	131	189	finally
    //   144	186	189	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbx
 * JD-Core Version:    0.7.0.1
 */