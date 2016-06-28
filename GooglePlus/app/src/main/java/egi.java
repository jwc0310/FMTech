import java.util.ArrayList;
import java.util.Iterator;

final class egi
  extends egj
{
  private final ArrayList<efb> a;
  
  public egi(ArrayList<efb> paramArrayList)
  {
    super(paramArrayList, (byte)0);
    Object localObject;
    this.a = localObject;
  }
  
  public final void a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((efb)localIterator.next()).a(this.b.g);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egi
 * JD-Core Version:    0.7.0.1
 */