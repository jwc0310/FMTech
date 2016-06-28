import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ehm<T>
  implements Iterator<T>
{
  private ehi<T> a;
  private int b;
  
  public ehm(ehi<T> paramehi)
  {
    this.a = ((ehi)efj.a(paramehi));
    this.b = -1;
  }
  
  public final boolean hasNext()
  {
    return this.b < -1 + this.a.c();
  }
  
  public final T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }
    ehi localehi = this.a;
    int i = 1 + this.b;
    this.b = i;
    return localehi.a(i);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehm
 * JD-Core Version:    0.7.0.1
 */