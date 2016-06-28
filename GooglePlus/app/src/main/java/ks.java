import java.util.Iterator;

final class ks<T>
  implements Iterator<T>
{
  private int a;
  private int b;
  private int c;
  private boolean d = false;
  
  ks(kr paramkr, int paramInt)
  {
    this.a = paramInt;
    this.b = paramkr.a();
  }
  
  public final boolean hasNext()
  {
    return this.c < this.b;
  }
  
  public final T next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c = (1 + this.c);
    this.d = true;
    return localObject;
  }
  
  public final void remove()
  {
    if (!this.d) {
      throw new IllegalStateException();
    }
    this.c = (-1 + this.c);
    this.b = (-1 + this.b);
    this.d = false;
    this.e.a(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ks
 * JD-Core Version:    0.7.0.1
 */