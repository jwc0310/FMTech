import java.util.AbstractList;
import java.util.List;

final class gwe<T>
  extends AbstractList<List<T>>
{
  private List<T> a;
  private int b;
  
  public gwe(List<T> paramList, int paramInt)
  {
    this.a = paramList;
    this.b = 500;
  }
  
  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }
  
  public final int size()
  {
    return (int)Math.ceil(this.a.size() / this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwe
 * JD-Core Version:    0.7.0.1
 */