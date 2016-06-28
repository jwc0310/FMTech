import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class jox
  implements gva
{
  jox(jow paramjow) {}
  
  public final void a(int paramInt1, int paramInt2)
  {
    gux localgux = this.a.a.b;
    Integer localInteger = Integer.valueOf(paramInt2);
    List localList = (List)localgux.a.remove(localInteger);
    if (localList == null) {
      localList = Collections.emptyList();
    }
    if (!localList.isEmpty())
    {
      int i = localList.size();
      new StringBuilder(64).append("handleRequestCodes: ").append(paramInt1).append("/").append(paramInt2).append(", ").append(i).append(" pending");
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        jpb localjpb = (jpb)localIterator.next();
        jow.a(this.a, paramInt1, localjpb);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jox
 * JD-Core Version:    0.7.0.1
 */