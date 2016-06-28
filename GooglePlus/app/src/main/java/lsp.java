public class lsp<T>
{
  final Object[] a;
  int b;
  
  public lsp(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("The max pool size must be > 0");
    }
    this.a = new Object[paramInt];
  }
  
  public T a()
  {
    if (this.b > 0)
    {
      int i = -1 + this.b;
      Object localObject = this.a[i];
      this.a[i] = null;
      this.b = (-1 + this.b);
      return localObject;
    }
    return null;
  }
  
  public boolean a(T paramT)
  {
    if (b(paramT)) {
      throw new IllegalStateException("Already in the pool!");
    }
    if (this.b < this.a.length)
    {
      this.a[this.b] = paramT;
      this.b = (1 + this.b);
      return true;
    }
    return false;
  }
  
  boolean b(T paramT)
  {
    for (int i = 0;; i++)
    {
      int j = this.b;
      boolean bool = false;
      if (i < j)
      {
        if (this.a[i] == paramT) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsp
 * JD-Core Version:    0.7.0.1
 */