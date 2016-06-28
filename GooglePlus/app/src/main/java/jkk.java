import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class jkk
  implements jgu, jkb
{
  final jkg a;
  final jjm<jgw> b;
  final jhw c;
  boolean d;
  List<jgw> e;
  private final Context f;
  
  jkk(Context paramContext, jkg paramjkg, jhw paramjhw, jjm<jgw> paramjjm)
  {
    this.f = paramContext;
    this.a = paramjkg;
    this.b = paramjjm;
    this.c = paramjhw;
    this.d = true;
    this.e = new ArrayList();
  }
  
  public final List<jgw> a()
  {
    return this.e;
  }
  
  public final void b()
  {
    this.a.b(this);
  }
  
  public final void c()
  {
    gzj.a(this.f, new jkl(this, this.f, "CircleListResourceImpl"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkk
 * JD-Core Version:    0.7.0.1
 */