import java.util.Iterator;

public final class bmg
  implements Iterator<String>
{
  private nrp a;
  private int b = -1;
  
  public bmg(nrp paramnrp)
  {
    this.a = paramnrp;
  }
  
  public final boolean hasNext()
  {
    return this.a.d.length > 1 + this.b;
  }
  
  public final void remove() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bmg
 * JD-Core Version:    0.7.0.1
 */