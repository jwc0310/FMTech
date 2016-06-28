import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public final class kky
  extends gzf
{
  private final int a;
  private final List<ipf> b;
  
  public kky(int paramInt, List<ipf> paramList)
  {
    super("PrioritizeMediaByHashTask");
    this.a = paramInt;
    this.b = paramList;
  }
  
  protected final hae a(Context paramContext)
  {
    hco localhco = hco.a(paramContext);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < this.b.size())
    {
      ipf localipf = (ipf)this.b.get(i);
      String str = localhco.a(localipf.d.toString(), false);
      if (localipf.e == ipm.b) {}
      for (int j = 2;; j = 1)
      {
        localArrayList.add(new kjy(str, j));
        i++;
        break;
      }
    }
    kkw localkkw = new kkw(paramContext, this.a, localArrayList);
    localkkw.i();
    return new hae(localkkw.o, localkkw.q, "");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kky
 * JD-Core Version:    0.7.0.1
 */