public final class jxp<T>
  implements ky<T>
{
  private final jxq<T> a;
  private final ky<T> b;
  
  public jxp(ky<T> paramky, jxq<T> paramjxq)
  {
    this.a = paramjxq;
    this.b = paramky;
  }
  
  public final T a()
  {
    Object localObject = this.b.a();
    if (localObject == null) {
      localObject = this.a.a();
    }
    return localObject;
  }
  
  public final boolean a(T paramT)
  {
    this.a.a(paramT);
    return this.b.a(paramT);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxp
 * JD-Core Version:    0.7.0.1
 */