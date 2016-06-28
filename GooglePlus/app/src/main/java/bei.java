import android.view.View;
import java.util.Iterator;
import java.util.List;

public class bei
{
  bei(bem parambem, List paramList) {}
  
  public void a(List<View> paramList)
  {
    if (this.b.N == null) {}
    for (Object localObject = null;; localObject = this.b.N.findViewById(aaw.hp))
    {
      if (localObject != null) {
        paramList.add(localObject);
      }
      bw localbw = this.b.h();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        Class localClass = (Class)localIterator.next();
        bk localbk = localbw.a(this.b.a(localClass));
        if ((localbk != null) && (localbk.N != null)) {
          paramList.add(localbk.N);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bei
 * JD-Core Version:    0.7.0.1
 */