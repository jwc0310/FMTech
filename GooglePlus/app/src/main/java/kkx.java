import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class kkx
  implements gzi
{
  private final gzj a;
  private final int b;
  private final Set<ipf> c = new HashSet();
  private final List<ipf> d = new ArrayList();
  private boolean e = false;
  
  kkx(gzj paramgzj, int paramInt)
  {
    this.a = paramgzj;
    this.b = paramInt;
    paramgzj.a.add(this);
  }
  
  private final void a()
  {
    this.a.b(new kky(this.b, new ArrayList(this.d)));
    this.d.clear();
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    for (;;)
    {
      try
      {
        boolean bool = "PrioritizeMediaByHashTask".equals(paramString);
        if (!bool) {
          return;
        }
        if (!this.d.isEmpty())
        {
          a();
          this.e = true;
        }
        else
        {
          this.e = false;
        }
      }
      finally {}
    }
  }
  
  public final void a(List<ipa> paramList)
  {
    for (;;)
    {
      try
      {
        if (this.d.size() > 50)
        {
          Log.e("PrtzMediaByHashQueue", "Queue full, skipping PrioritizedMediaByHash request");
          return;
        }
        int i = 0;
        if (i < paramList.size())
        {
          ipf localipf = ((ipa)paramList.get(i)).e();
          if ((localipf.e == ipm.b) && (localipf.d != null) && (!this.c.contains(localipf)))
          {
            this.d.add(localipf);
            this.c.add(localipf);
          }
        }
        else
        {
          if ((this.d.isEmpty()) || (this.e)) {
            continue;
          }
          a();
          this.e = true;
          continue;
        }
        i++;
      }
      finally {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkx
 * JD-Core Version:    0.7.0.1
 */