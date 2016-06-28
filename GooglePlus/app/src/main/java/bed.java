import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bed
  implements bbv
{
  private final List<bbw> a = new ArrayList();
  private boolean b;
  private boolean c;
  
  bed(bdp parambdp) {}
  
  public final void a(bbw parambbw)
  {
    this.a.add(parambbw);
    a(this.b);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((bbw)localIterator.next()).a(paramBoolean);
    }
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final void b(bbw parambbw)
  {
    this.a.remove(parambbw);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public final boolean b()
  {
    return this.c;
  }
  
  public final clc c()
  {
    return this.d.Z;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bed
 * JD-Core Version:    0.7.0.1
 */