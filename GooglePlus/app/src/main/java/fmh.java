import java.util.Iterator;
import java.util.NoSuchElementException;

public final class fmh<T>
  implements Iterable<T>, Iterator<T>
{
  public final boolean hasNext()
  {
    return false;
  }
  
  public final Iterator<T> iterator()
  {
    return this;
  }
  
  public final T next()
  {
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmh
 * JD-Core Version:    0.7.0.1
 */