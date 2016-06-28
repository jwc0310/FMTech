import android.content.Context;

public final class lez
  extends gzf
{
  private final int a;
  private final kcg b;
  private final String c;
  private final int d;
  private final String l;
  private final int m;
  private final kyn n;
  
  public lez(Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
  {
    super(paramContext, "ReadSquareMembersTask");
    this.a = paramInt1;
    this.b = new kcg(paramContext, this.a);
    this.c = paramString1;
    this.d = paramInt2;
    this.l = paramString2;
    this.m = paramInt3;
    this.n = ((kyn)mbb.a(paramContext, kyn.class));
  }
  
  /* Error */
  protected final hae a()
  {
    // Byte code:
    //   0: new 53	ley
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual 57	lez:g	()Landroid/content/Context;
    //   8: aload_0
    //   9: getfield 31	lez:b	Lkcg;
    //   12: aload_0
    //   13: getfield 33	lez:c	Ljava/lang/String;
    //   16: aload_0
    //   17: getfield 35	lez:d	I
    //   20: aload_0
    //   21: getfield 37	lez:l	Ljava/lang/String;
    //   24: aload_0
    //   25: getfield 39	lez:m	I
    //   28: invokespecial 60	ley:<init>	(Landroid/content/Context;Lkcg;Ljava/lang/String;ILjava/lang/String;I)V
    //   31: astore_1
    //   32: aload_1
    //   33: invokevirtual 64	ley:i	()V
    //   36: aload_1
    //   37: invokevirtual 67	ley:n	()Z
    //   40: ifne +101 -> 141
    //   43: aload_0
    //   44: getfield 48	lez:n	Lkyn;
    //   47: astore_2
    //   48: aload_1
    //   49: getfield 73	kct:x	Z
    //   52: ifeq +106 -> 158
    //   55: aload_1
    //   56: getfield 77	kct:w	Lqat;
    //   59: astore_3
    //   60: aload_3
    //   61: checkcast 79	mzo
    //   64: getfield 82	mzo:a	Lofl;
    //   67: astore 4
    //   69: aload 4
    //   71: getfield 87	ofl:b	Loed;
    //   74: ifnull +26 -> 100
    //   77: aload_2
    //   78: aload_0
    //   79: getfield 24	lez:a	I
    //   82: new 89	kyf
    //   85: dup
    //   86: aload 4
    //   88: getfield 87	ofl:b	Loed;
    //   91: invokespecial 92	kyf:<init>	(Loed;)V
    //   94: invokeinterface 95 3 0
    //   99: pop
    //   100: aload 4
    //   102: getfield 98	ofl:a	[Lodl;
    //   105: astore 6
    //   107: aload 6
    //   109: ifnonnull +8 -> 117
    //   112: invokestatic 103	odl:b	()[Lodl;
    //   115: astore 6
    //   117: aload_0
    //   118: getfield 37	lez:l	Ljava/lang/String;
    //   121: ifnonnull +42 -> 163
    //   124: aload_2
    //   125: aload_0
    //   126: getfield 24	lez:a	I
    //   129: aload_0
    //   130: getfield 33	lez:c	Ljava/lang/String;
    //   133: aload 6
    //   135: invokeinterface 106 4 0
    //   140: pop
    //   141: new 108	hae
    //   144: dup
    //   145: aload_1
    //   146: getfield 113	kbw:o	I
    //   149: aload_1
    //   150: getfield 117	kbw:q	Ljava/lang/Exception;
    //   153: aconst_null
    //   154: invokespecial 120	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   157: areturn
    //   158: aconst_null
    //   159: astore_3
    //   160: goto -100 -> 60
    //   163: aload_2
    //   164: aload_0
    //   165: getfield 24	lez:a	I
    //   168: aload_0
    //   169: getfield 33	lez:c	Ljava/lang/String;
    //   172: aload 6
    //   174: invokeinterface 122 4 0
    //   179: pop
    //   180: goto -39 -> 141
    //   183: astore 5
    //   185: new 108	hae
    //   188: dup
    //   189: iconst_0
    //   190: aload 5
    //   192: aconst_null
    //   193: invokespecial 120	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   196: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	lez
    //   31	119	1	localley	ley
    //   47	117	2	localkyn	kyn
    //   59	101	3	localqat	qat
    //   67	34	4	localofl	ofl
    //   183	8	5	localIOException	java.io.IOException
    //   105	68	6	arrayOfodl	odl[]
    // Exception table:
    //   from	to	target	type
    //   69	100	183	java/io/IOException
    //   100	107	183	java/io/IOException
    //   112	117	183	java/io/IOException
    //   117	141	183	java/io/IOException
    //   163	180	183	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lez
 * JD-Core Version:    0.7.0.1
 */