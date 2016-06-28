import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class jlv
  extends gzf
{
  jlv(jlu paramjlu, Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  protected final hae a()
  {
    jlu localjlu = this.a;
    List localList1 = localjlu.a.a();
    kl localkl = localjlu.a.d();
    if ((localList1 == null) || (localkl == null))
    {
      jlw localjlw = new jlw(this);
      efj.m().post(localjlw);
      return new hae(true);
    }
    localjlu.f = new ArrayList();
    Iterator localIterator = localList1.iterator();
    label76:
    jgw localjgw;
    List localList2;
    while (localIterator.hasNext())
    {
      localjgw = (jgw)localIterator.next();
      if (localjlu.d.a(localjgw))
      {
        localList2 = (List)localkl.get(localjgw.b());
        if (localList2 == null) {
          break label183;
        }
      }
    }
    label183:
    for (List localList3 = localList2.subList(0, Math.min(localjlu.c, localList2.size()));; localList3 = Collections.emptyList())
    {
      localjlu.f.add(new Pair(localjgw, localList3));
      break label76;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlv
 * JD-Core Version:    0.7.0.1
 */