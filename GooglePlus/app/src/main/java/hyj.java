import android.content.Context;

public abstract class hyj
  implements hyi
{
  public final Context a;
  private giz b;
  
  public hyj(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final String a(int paramInt)
  {
    return ((giz)mbb.a(this.a, giz.class)).a(paramInt).b("account_name");
  }
  
  public final String a(hyf paramhyf, int paramInt)
  {
    if (this.b.c(paramInt)) {
      return a(paramhyf, a(paramInt));
    }
    return null;
  }
  
  public abstract String a(hyf paramhyf, String paramString);
  
  public final boolean b(hyf paramhyf, int paramInt)
  {
    return (this.b.c(paramInt)) && ("true".equalsIgnoreCase(a(paramhyf, a(paramInt))));
  }
  
  public final boolean b(hyf paramhyf, String paramString)
  {
    return "true".equalsIgnoreCase(a(paramhyf, paramString));
  }
  
  public final Long c(hyf paramhyf, int paramInt)
  {
    if (this.b.c(paramInt)) {
      return c(paramhyf, a(paramInt));
    }
    return null;
  }
  
  public final Long c(hyf paramhyf, String paramString)
  {
    try
    {
      Long localLong = Long.valueOf(Long.parseLong(a(paramhyf, paramString)));
      return localLong;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyj
 * JD-Core Version:    0.7.0.1
 */