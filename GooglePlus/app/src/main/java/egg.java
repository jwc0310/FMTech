import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

final class egg
  extends egj
{
  private final ArrayList<efb> a;
  
  public egg(ArrayList<efb> paramArrayList)
  {
    super(paramArrayList, (byte)0);
    Object localObject;
    this.a = localObject;
  }
  
  public final void a()
  {
    Set localSet1 = this.b.a.o;
    if (localSet1.isEmpty()) {}
    for (Set localSet2 = this.b.j();; localSet2 = localSet1)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((efb)localIterator.next()).a(this.b.g, localSet2);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egg
 * JD-Core Version:    0.7.0.1
 */