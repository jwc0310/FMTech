public final class lsq<T>
  extends lsp
{
  private final Object c = new Object();
  
  public lsq(int paramInt)
  {
    super(64);
  }
  
  public final T a()
  {
    synchronized (this.c)
    {
      Object localObject3 = super.a();
      return localObject3;
    }
  }
  
  public final boolean a(T paramT)
  {
    synchronized (this.c)
    {
      boolean bool = super.a(paramT);
      return bool;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsq
 * JD-Core Version:    0.7.0.1
 */