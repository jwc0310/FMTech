import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class aor
  implements cmh<Long, iph>
{
  aor(aol paramaol) {}
  
  public final List<iph> a(List<Long> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Long localLong = (Long)localIterator.next();
      apm localapm = ((apo)mbb.a(this.a.a, apo.class)).a(localLong.longValue(), apn.a);
      if (localapm != null)
      {
        int i;
        if (this.a.i.b == 0)
        {
          i = 1;
          label90:
          if (i == 0) {
            break label160;
          }
        }
        label160:
        for (iph localiph = this.a.c.a(localapm.f, this.a.i.c, this.a.i.d, this.a.i.a);; localiph = this.a.c.b(localapm.f, this.a.i.b, this.a.i.a))
        {
          localArrayList.add(localiph);
          break;
          i = 0;
          break label90;
        }
      }
    }
    return localArrayList;
  }
  
  public final void b(List<iph> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      iph localiph = (iph)localIterator.next();
      this.a.c.a.d(localiph);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aor
 * JD-Core Version:    0.7.0.1
 */