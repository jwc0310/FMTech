import java.util.Collections;
import java.util.List;

public final class lrf
  implements lrm
{
  private final String a;
  private final int b;
  private final int c;
  private final int d;
  private final Long e;
  private final boolean f;
  private final List<lrq> g;
  
  lrf(lrg paramlrg)
  {
    this.a = paramlrg.a;
    Integer localInteger = paramlrg.b;
    int i;
    if (localInteger == null)
    {
      i = 0;
      this.b = i;
      this.c = paramlrg.c.intValue();
      this.d = paramlrg.d.intValue();
      this.e = paramlrg.e;
      this.f = paramlrg.f;
      if (paramlrg.g != null) {
        break label93;
      }
    }
    label93:
    for (List localList = Collections.emptyList();; localList = Collections.unmodifiableList(paramlrg.g))
    {
      this.g = localList;
      return;
      i = localInteger.intValue();
      break;
    }
  }
  
  public final Long a(int paramInt)
  {
    return this.e;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final int d()
  {
    return this.d;
  }
  
  public final boolean e()
  {
    return this.f;
  }
  
  public final List<lrq> f()
  {
    return this.g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lrf
 * JD-Core Version:    0.7.0.1
 */