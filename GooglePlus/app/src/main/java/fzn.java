import java.util.Iterator;
import java.util.NoSuchElementException;

public final class fzn<T>
  implements Iterator<T>
{
  private final fzm<T> a;
  private int b;
  
  public fzn(fzm<T> paramfzm)
  {
    if (paramfzm == null) {
      throw new IllegalArgumentException("null dataBuffer");
    }
    this.a = paramfzm;
    this.b = -1;
  }
  
  public final boolean hasNext()
  {
    return this.b < -1 + this.a.b();
  }
  
  public final T next()
  {
    if (!hasNext())
    {
      int j = this.b;
      throw new NoSuchElementException(46 + "Cannot advance the iterator beyond " + j);
    }
    fzm localfzm = this.a;
    int i = 1 + this.b;
    this.b = i;
    return localfzm.a(i);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fzn
 * JD-Core Version:    0.7.0.1
 */