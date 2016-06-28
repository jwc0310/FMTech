import java.util.regex.Pattern;

public final class fmp
{
  public static final fmp a = new fmp();
  private Pattern[] b = new Pattern[0];
  private String[] c = new String[0];
  
  /* Error */
  public final String a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 33	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +11 -> 19
    //   11: aconst_null
    //   12: astore 5
    //   14: aload_0
    //   15: monitorexit
    //   16: aload 5
    //   18: areturn
    //   19: iconst_0
    //   20: istore 4
    //   22: aload_1
    //   23: astore 5
    //   25: iload 4
    //   27: aload_0
    //   28: getfield 22	fmp:b	[Ljava/util/regex/Pattern;
    //   31: arraylength
    //   32: if_icmpge -18 -> 14
    //   35: aload_0
    //   36: getfield 22	fmp:b	[Ljava/util/regex/Pattern;
    //   39: iload 4
    //   41: aaload
    //   42: aload 5
    //   44: invokevirtual 37	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   47: aload_0
    //   48: getfield 26	fmp:c	[Ljava/lang/String;
    //   51: iload 4
    //   53: aaload
    //   54: invokevirtual 42	java/util/regex/Matcher:replaceAll	(Ljava/lang/String;)Ljava/lang/String;
    //   57: astore 6
    //   59: iinc 4 1
    //   62: aload 6
    //   64: astore 5
    //   66: goto -41 -> 25
    //   69: astore_2
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_2
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	fmp
    //   0	74	1	paramString	String
    //   69	4	2	localObject1	Object
    //   6	2	3	bool	boolean
    //   20	40	4	i	int
    //   12	53	5	localObject2	Object
    //   57	6	6	str	String
    // Exception table:
    //   from	to	target	type
    //   2	7	69	finally
    //   25	59	69	finally
  }
  
  public final void a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        if (paramArrayOfString1.length == paramArrayOfString2.length)
        {
          j = 1;
          if (j != 0) {
            break;
          }
          throw new IllegalArgumentException();
        }
      }
      finally {}
      int j = 0;
    }
    this.b = new Pattern[paramArrayOfString1.length];
    this.c = paramArrayOfString2;
    while (i < paramArrayOfString1.length)
    {
      this.b[i] = Pattern.compile(paramArrayOfString1[i]);
      i++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmp
 * JD-Core Version:    0.7.0.1
 */