import java.util.ArrayList;
import java.util.Iterator;

final class aop
  extends atr
{
  public aou a;
  
  public final void a(ast paramast)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramast.a.iterator();
    while (localIterator.hasNext())
    {
      asu localasu = (asu)localIterator.next();
      localArrayList1.addAll(localasu.b);
      localArrayList2.addAll(localasu.a);
    }
    this.a = new aou(aow.j.ordinal(), localArrayList2, localArrayList1);
  }
  
  public final void a(asu paramasu)
  {
    this.a = new aou(aow.a.ordinal(), paramasu.a, paramasu.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aop
 * JD-Core Version:    0.7.0.1
 */