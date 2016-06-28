import android.content.Context;
import java.util.List;

public final class dpt
  implements iut
{
  public static final hyf a = new hyf("debug.settings.enable_feds", "false", "60cee7ab", hym.b);
  public static final hyf b = new hyf("debug.settings.enable_feds_page", "false", "af35508a", hym.b);
  private final giz c;
  private final hyi d;
  
  public dpt(Context paramContext)
  {
    this.c = ((giz)mbb.a(paramContext, giz.class));
    this.d = ((hyi)mbb.a(paramContext, hyi.class));
  }
  
  private final boolean a(hyf paramhyf)
  {
    List localList = this.c.a();
    int i = localList.size();
    for (int j = 0; j < i; j++)
    {
      Integer localInteger = (Integer)localList.get(j);
      if (this.d.b(paramhyf, localInteger.intValue())) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean a()
  {
    return a(a);
  }
  
  public final boolean b()
  {
    return a(b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpt
 * JD-Core Version:    0.7.0.1
 */