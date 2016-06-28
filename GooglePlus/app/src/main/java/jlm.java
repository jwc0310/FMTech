import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class jlm
  implements jil, jkb
{
  final jkg a;
  final jhx b;
  boolean c;
  final int d;
  final int e;
  final jjm<jjg> f;
  List<jjg> g;
  private final Context h;
  
  jlm(Context paramContext, jkg paramjkg, jhx paramjhx, int paramInt1, int paramInt2, jjm<jjg> paramjjm)
  {
    this.h = paramContext;
    this.a = paramjkg;
    this.b = paramjhx;
    this.c = true;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramjjm;
    this.g = new ArrayList();
  }
  
  public final List<jjg> a()
  {
    return this.g;
  }
  
  public final void b()
  {
    this.a.b(this);
  }
  
  public final void c()
  {
    gzj.a(this.h, new jln(this, this.h, "PeopleListResourceImpl"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlm
 * JD-Core Version:    0.7.0.1
 */