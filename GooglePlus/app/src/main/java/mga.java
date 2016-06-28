import android.util.Log;
import java.lang.reflect.Method;

public final class mga
{
  private static final Method a;
  private static final Method b;
  private static final Method c;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc 14
    //   2: invokestatic 20	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   5: astore 4
    //   7: aload 4
    //   9: ldc 22
    //   11: iconst_2
    //   12: anewarray 16	java/lang/Class
    //   15: dup
    //   16: iconst_0
    //   17: ldc 24
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: ldc 24
    //   24: aastore
    //   25: invokevirtual 28	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   28: astore 5
    //   30: aload 5
    //   32: astore_2
    //   33: iconst_2
    //   34: anewarray 16	java/lang/Class
    //   37: astore 6
    //   39: aload 6
    //   41: iconst_0
    //   42: ldc 24
    //   44: aastore
    //   45: aload 6
    //   47: iconst_1
    //   48: getstatic 34	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   51: aastore
    //   52: aload 4
    //   54: ldc 36
    //   56: aload 6
    //   58: invokevirtual 28	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   61: astore 7
    //   63: aload 7
    //   65: astore_1
    //   66: iconst_2
    //   67: anewarray 16	java/lang/Class
    //   70: astore 8
    //   72: aload 8
    //   74: iconst_0
    //   75: ldc 24
    //   77: aastore
    //   78: aload 8
    //   80: iconst_1
    //   81: getstatic 39	java/lang/Long:TYPE	Ljava/lang/Class;
    //   84: aastore
    //   85: aload 4
    //   87: ldc 41
    //   89: aload 8
    //   91: invokevirtual 28	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   94: astore 9
    //   96: aload_2
    //   97: putstatic 43	mga:a	Ljava/lang/reflect/Method;
    //   100: aload_1
    //   101: putstatic 45	mga:b	Ljava/lang/reflect/Method;
    //   104: aload 9
    //   106: putstatic 47	mga:c	Ljava/lang/reflect/Method;
    //   109: return
    //   110: astore_3
    //   111: aconst_null
    //   112: astore_1
    //   113: aconst_null
    //   114: astore_2
    //   115: aload_3
    //   116: invokevirtual 50	java/lang/Exception:printStackTrace	()V
    //   119: aload_2
    //   120: putstatic 43	mga:a	Ljava/lang/reflect/Method;
    //   123: aload_1
    //   124: putstatic 45	mga:b	Ljava/lang/reflect/Method;
    //   127: aconst_null
    //   128: putstatic 47	mga:c	Ljava/lang/reflect/Method;
    //   131: return
    //   132: astore_0
    //   133: aconst_null
    //   134: astore_1
    //   135: aconst_null
    //   136: astore_2
    //   137: aload_2
    //   138: putstatic 43	mga:a	Ljava/lang/reflect/Method;
    //   141: aload_1
    //   142: putstatic 45	mga:b	Ljava/lang/reflect/Method;
    //   145: aconst_null
    //   146: putstatic 47	mga:c	Ljava/lang/reflect/Method;
    //   149: aload_0
    //   150: athrow
    //   151: astore_0
    //   152: aconst_null
    //   153: astore_1
    //   154: goto -17 -> 137
    //   157: astore_0
    //   158: goto -21 -> 137
    //   161: astore_3
    //   162: aconst_null
    //   163: astore_1
    //   164: goto -49 -> 115
    //   167: astore_3
    //   168: goto -53 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   132	18	0	localObject1	Object
    //   151	1	0	localObject2	Object
    //   157	1	0	localObject3	Object
    //   65	99	1	localMethod1	Method
    //   32	106	2	localMethod2	Method
    //   110	6	3	localException1	Exception
    //   161	1	3	localException2	Exception
    //   167	1	3	localException3	Exception
    //   5	81	4	localClass	java.lang.Class
    //   28	3	5	localMethod3	Method
    //   37	20	6	arrayOfClass1	java.lang.Class[]
    //   61	3	7	localMethod4	Method
    //   70	20	8	arrayOfClass2	java.lang.Class[]
    //   94	11	9	localMethod5	Method
    // Exception table:
    //   from	to	target	type
    //   0	30	110	java/lang/Exception
    //   0	30	132	finally
    //   33	63	151	finally
    //   66	96	157	finally
    //   115	119	157	finally
    //   33	63	161	java/lang/Exception
    //   66	96	167	java/lang/Exception
  }
  
  public static int a(String paramString, int paramInt)
  {
    try
    {
      if (b != null)
      {
        Method localMethod = b;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = Integer.valueOf(paramInt);
        int i = ((Integer)localMethod.invoke(null, arrayOfObject)).intValue();
        paramInt = i;
      }
      return paramInt;
    }
    catch (Exception localException)
    {
      Log.e("SystemProperties", "get error", localException);
    }
    return paramInt;
  }
  
  public static long a(String paramString, long paramLong)
  {
    try
    {
      if (c != null)
      {
        Method localMethod = c;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = Long.valueOf(100L);
        long l = ((Long)localMethod.invoke(null, arrayOfObject)).longValue();
        return l;
      }
    }
    catch (Exception localException)
    {
      Log.e("SystemProperties", "get error", localException);
    }
    return 100L;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    try
    {
      String str = (String)a.invoke(null, new Object[] { paramString1, paramString2 });
      if (paramString2 == null)
      {
        boolean bool = "".equals(str);
        if (bool) {
          str = null;
        }
      }
      return str;
    }
    catch (Exception localException)
    {
      Log.e("SystemProperties", "get error", localException);
    }
    return paramString2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mga
 * JD-Core Version:    0.7.0.1
 */