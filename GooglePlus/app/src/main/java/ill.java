import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class ill
{
  public final List<Class<? extends ilh>> a = new ArrayList();
  private Context b;
  private int c;
  
  public ill(Context paramContext, int paramInt)
  {
    this.b = paramContext;
    this.c = paramInt;
  }
  
  private final ilf c()
  {
    ilf localilf = new ilf();
    localilf.c = this.c;
    for (int i = 0; i < this.a.size(); i++)
    {
      Class localClass = (Class)this.a.get(i);
      localilf.u.add(localClass);
    }
    return localilf;
  }
  
  public final boolean a()
  {
    return ((ilb)mbb.a(this.b, ilb.class)).a(c(), this.c);
  }
  
  public final Intent b()
  {
    ikx localikx = new ikx(this.b);
    localikx.a = c();
    Intent localIntent = ((kbn)mbb.a(this.b, kbn.class)).a(this.b, this.c);
    localIntent.addFlags(268533760);
    localikx.b = localIntent;
    return localikx.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ill
 * JD-Core Version:    0.7.0.1
 */