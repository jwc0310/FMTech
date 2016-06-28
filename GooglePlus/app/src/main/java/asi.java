import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class asi
  implements meu, mfd
{
  final Set<asj> a = new HashSet();
  
  public asi(mek parammek)
  {
    parammek.a(this);
  }
  
  final void b()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      asj localasj = (asj)localIterator.next();
      fu localfu = localasj.a.b(localasj.b);
      if (localfu != null) {
        localfu.j();
      }
    }
  }
  
  final void c()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      asj localasj = (asj)localIterator.next();
      fu localfu = localasj.a.b(localasj.b);
      if (localfu != null)
      {
        localfu.m = false;
        localfu.h();
      }
    }
  }
  
  public final void m_()
  {
    this.a.clear();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     asi
 * JD-Core Version:    0.7.0.1
 */