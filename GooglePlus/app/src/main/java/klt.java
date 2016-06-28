import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class klt
  implements kim
{
  klt(klg paramklg) {}
  
  public final void a(List<kip> paramList1, List<kip> paramList2)
  {
    ArrayList localArrayList = new ArrayList(paramList2.size());
    Iterator localIterator1 = paramList2.iterator();
    while (localIterator1.hasNext())
    {
      kip localkip2 = (kip)localIterator1.next();
      jjd localjjd2 = efj.b(localkip2.a, localkip2.b);
      this.a.M.b(localjjd2);
      this.a.M.a(localjjd2);
      localArrayList.add(localjjd2);
    }
    Iterator localIterator2 = paramList1.iterator();
    while (localIterator2.hasNext())
    {
      kip localkip1 = (kip)localIterator2.next();
      jjd localjjd1 = efj.b(localkip1.a, localkip1.b);
      if (!efj.a(localjjd1, localArrayList)) {
        this.a.M.b(localjjd1);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     klt
 * JD-Core Version:    0.7.0.1
 */