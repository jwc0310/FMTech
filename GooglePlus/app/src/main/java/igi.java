import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

final class igi
{
  final NavigableMap<ify, Integer> a = new ConcurrentSkipListMap(new igj(this));
  
  public final void a(ify paramify)
  {
    Integer localInteger = (Integer)this.a.get(paramify);
    if (localInteger.intValue() == 1)
    {
      this.a.remove(paramify);
      return;
    }
    this.a.put(paramify, Integer.valueOf(-1 + localInteger.intValue()));
  }
  
  public final String toString()
  {
    String str1 = "SizeTracker(";
    if (!this.a.isEmpty())
    {
      Iterator localIterator = this.a.keySet().iterator();
      String str3;
      String str4;
      String str5;
      for (String str2 = str1; localIterator.hasNext(); str2 = 5 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + str3 + "{" + str4 + ", " + str5 + "} ")
      {
        ify localify = (ify)localIterator.next();
        str3 = String.valueOf(str2);
        str4 = String.valueOf(localify);
        str5 = String.valueOf(this.a.get(localify));
      }
      str1 = str2.substring(0, -1 + str2.length());
    }
    return String.valueOf(str1).concat(")");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igi
 * JD-Core Version:    0.7.0.1
 */