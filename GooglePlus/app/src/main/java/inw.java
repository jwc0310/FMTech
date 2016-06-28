import android.content.Context;
import java.util.List;

public final class inw
  implements ilp
{
  final Context a;
  final List<inj> b;
  private final iuv c;
  
  inw(Context paramContext)
  {
    this.a = paramContext;
    this.b = mbb.c(paramContext, inj.class);
    this.c = ((iuv)mbb.a(paramContext, iuv.class));
  }
  
  public final int a()
  {
    return ils.b;
  }
  
  public final ilq a(gjb paramgjb, boolean paramBoolean)
  {
    boolean bool = paramgjb.c("is_managed_account");
    if (((!bool) && (this.c.a())) || ((bool) && (this.c.b()))) {
      return null;
    }
    if ((!paramBoolean) && (!paramgjb.c("PlusiAccountUpdateExtension.wants_full_update"))) {
      return new inz(this);
    }
    return new inx(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     inw
 * JD-Core Version:    0.7.0.1
 */