public final class kn
{
  static final int[] a = new int[0];
  static final long[] b = new long[0];
  static final Object[] c = new Object[0];
  
  public static int a(int paramInt)
  {
    return c(paramInt << 2) / 4;
  }
  
  public static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt1 - 1;
    int j = 0;
    int k = i;
    while (j <= k)
    {
      m = j + k >>> 1;
      int n = paramArrayOfInt[m];
      if (n < paramInt2)
      {
        j = m + 1;
      }
      else
      {
        if (n <= paramInt2) {
          break label68;
        }
        k = m - 1;
      }
    }
    int m = j ^ 0xFFFFFFFF;
    label68:
    return m;
  }
  
  public static int a(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    int i = paramInt - 1;
    int j = 0;
    int k = i;
    while (j <= k)
    {
      m = j + k >>> 1;
      long l = paramArrayOfLong[m];
      if (l < paramLong)
      {
        j = m + 1;
      }
      else
      {
        if (l <= paramLong) {
          break label72;
        }
        k = m - 1;
      }
    }
    int m = j ^ 0xFFFFFFFF;
    label72:
    return m;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static int b(int paramInt)
  {
    return c(paramInt << 3) / 8;
  }
  
  public static int c(int paramInt)
  {
    for (int i = 4;; i++) {
      if (i < 32)
      {
        if (paramInt <= -12 + (1 << i)) {
          paramInt = -12 + (1 << i);
        }
      }
      else {
        return paramInt;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kn
 * JD-Core Version:    0.7.0.1
 */