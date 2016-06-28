public final class ezc
{
  public static final int[] a = new int[0];
  public static final Object[] b = new Object[0];
  
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
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ezc
 * JD-Core Version:    0.7.0.1
 */