public abstract class eyw<T>
{
  private static x c = null;
  private static int d = 0;
  public final String a;
  public final T b;
  private T e = null;
  
  static
  {
    new Object();
  }
  
  protected eyw(String paramString, T paramT)
  {
    this.a = paramString;
    this.b = paramT;
  }
  
  public static int a()
  {
    return 0;
  }
  
  public static eyw<Integer> a(String paramString, Integer paramInteger)
  {
    return new eyy(paramString, paramInteger);
  }
  
  public static eyw<Long> a(String paramString, Long paramLong)
  {
    return new eyx(paramString, paramLong);
  }
  
  public static eyw<String> a(String paramString1, String paramString2)
  {
    return new eyz(paramString1, paramString2);
  }
  
  public static boolean b()
  {
    return false;
  }
  
  public abstract T a(String paramString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyw
 * JD-Core Version:    0.7.0.1
 */