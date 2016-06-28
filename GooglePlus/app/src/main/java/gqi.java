import android.app.Activity;
import android.content.Context;
import java.util.List;

public final class gqi
  implements gqh
{
  private final Context a;
  private final gqh b;
  private final gxq c;
  private final gxq d;
  
  public gqi(Context paramContext, gxq paramgxq1, gxq paramgxq2, gqh paramgqh)
  {
    this.a = paramContext;
    this.b = paramgqh;
    this.c = paramgxq1;
    this.d = paramgxq2;
  }
  
  public final boolean a(Activity paramActivity)
  {
    Context localContext = this.a;
    gxr localgxr = new gxr();
    gxq localgxq1 = this.c;
    localgxr.b.add(localgxq1);
    gxq localgxq2 = this.d;
    localgxr.b.add(localgxq2);
    new gwz(4, localgxr.a(this.a)).b(localContext);
    return this.b.a(paramActivity);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqi
 * JD-Core Version:    0.7.0.1
 */