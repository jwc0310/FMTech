import android.content.Context;
import android.util.Pair;
import java.util.List;

final class jlu
  implements jjr, jkb
{
  final jkg a;
  final jhy b;
  final int c;
  final jjm<jgw> d;
  boolean e;
  List<Pair<jgw, List<jjg>>> f;
  private final Context g;
  
  jlu(Context paramContext, jkg paramjkg, jhy paramjhy, int paramInt, jjm<jgw> paramjjm)
  {
    this.g = paramContext;
    this.a = paramjkg;
    this.b = paramjhy;
    this.c = paramInt;
    this.d = paramjjm;
    this.e = true;
  }
  
  public final List<Pair<jgw, List<jjg>>> a()
  {
    return this.f;
  }
  
  public final void b()
  {
    this.a.b(this);
  }
  
  public final void c()
  {
    gzj.a(this.g, new jlv(this, this.g, "TopPeopleInCirclesResourceImpl"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlu
 * JD-Core Version:    0.7.0.1
 */