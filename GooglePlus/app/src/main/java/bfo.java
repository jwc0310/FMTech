import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class bfo
  implements bfh
{
  bfo(bfn parambfn) {}
  
  public final void a()
  {
    bfn localbfn = this.a;
    bfd localbfd = this.a.b;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localbfd.d.iterator();
    while (localIterator.hasNext())
    {
      aip localaip = (aip)localIterator.next();
      if (bfc.class.isInstance(localaip)) {
        localArrayList.add(bfc.class.cast(localaip));
      }
    }
    localbfn.c = localArrayList;
    this.a.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bfo
 * JD-Core Version:    0.7.0.1
 */