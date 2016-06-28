import java.util.Iterator;

final class fpm<T>
  implements Iterator<T>
{
  private int a = 0;
  private int b;
  private int c;
  private boolean d = false;
  
  fpm(fpl paramfpl, int paramInt)
  {
    this.b = paramfpl.a();
  }
  
  public final boolean hasNext()
  {
    return this.c < this.b;
  }
  
  public final T next()
  {
    Object localObject = this.e.a(this.c);
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
    this.e.b(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpm
 * JD-Core Version:    0.7.0.1
 */