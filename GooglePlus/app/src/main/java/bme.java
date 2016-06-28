import android.content.Context;
import java.util.LinkedHashSet;

public final class bme
  extends cun<nbp, nbq>
{
  public String a = null;
  public boolean b = false;
  public boolean c = false;
  public Integer d = null;
  public Integer e = null;
  public Long f = null;
  public nrp g;
  
  public bme(Context paramContext, kcg paramkcg, int paramInt)
  {
    super(paramContext, paramkcg, paramInt, "syncuserhighlights", new nbp(), new nbq());
  }
  
  public final String a(String paramString)
  {
    for (int i = 0; i < this.g.d.length; i++) {
      if ((paramString.equals(this.g.d[i].a)) && (this.g.d[i].c != null)) {
        return this.g.d[i].c.a;
      }
    }
    return null;
  }
  
  public final LinkedHashSet<String> b(String paramString)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    for (int i = 0; i < this.g.c.length; i++)
    {
      pss localpss = this.g.c[i];
      if ((localpss.c != null) && (localpss.c.a.length > 0) && (paramString.equals(this.g.c[i].c.a[0].a))) {
        localLinkedHashSet.add(localpss.a);
      }
    }
    return localLinkedHashSet;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bme
 * JD-Core Version:    0.7.0.1
 */