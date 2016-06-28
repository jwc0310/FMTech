import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

final class cvs
{
  final ArrayList<jdt> a = new ArrayList();
  final HashSet<String> b = new LinkedHashSet();
  
  public final jdt[] a(cvp paramcvp)
  {
    switch (cvt.a[paramcvp.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("Invalid MenutOption provided");
    }
    ArrayList localArrayList;
    for (jdt[] arrayOfjdt = (jdt[])this.a.toArray(new jdt[this.a.size()]); arrayOfjdt != null; arrayOfjdt = (jdt[])localArrayList.toArray(new jdt[localArrayList.size()]))
    {
      return arrayOfjdt;
      localArrayList = new ArrayList();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        jdt localjdt = (jdt)localIterator.next();
        if ((localjdt.d == 1) || (localjdt.d == 4) || (this.b.contains(localjdt.a))) {
          localArrayList.add(localjdt);
        }
      }
    }
    return new jdt[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvs
 * JD-Core Version:    0.7.0.1
 */