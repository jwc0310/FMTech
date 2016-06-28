import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class jsd<T>
  implements Iterator<T>
{
  int a = jse.b;
  final CharSequence b;
  final boolean c;
  int d;
  private T e;
  
  jsd() {}
  
  protected jsd(jsa paramjsa, CharSequence paramCharSequence)
  {
    this();
    this.d = 0;
    this.c = paramjsa.a;
    this.b = paramCharSequence;
  }
  
  abstract int a(int paramInt);
  
  abstract int b(int paramInt);
  
  protected String b()
  {
    if (this.d != -1)
    {
      int i = this.d;
      int j = a(this.d);
      if (j == -1) {
        j = this.b.length();
      }
      for (this.d = -1; (!this.c) || (i != j); this.d = b(j)) {
        return this.b.subSequence(i, j).toString();
      }
    }
    this.a = jse.c;
    return null;
  }
  
  public final boolean hasNext()
  {
    if (this.a == jse.d) {
      throw new IllegalStateException();
    }
    int i = jry.a[(-1 + this.a)];
    boolean bool = false;
    switch (i)
    {
    default: 
      this.a = jse.d;
      this.e = a();
      int j = this.a;
      int k = jse.c;
      bool = false;
      if (j != k)
      {
        this.a = jse.a;
        bool = true;
      }
    case 1: 
      return bool;
    }
    return true;
  }
  
  public final T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    this.a = jse.b;
    return this.e;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsd
 * JD-Core Version:    0.7.0.1
 */