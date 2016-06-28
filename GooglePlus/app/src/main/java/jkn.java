import android.os.Handler;
import java.util.Map;

final class jkn
  implements jgv, jkb
{
  final jhv a;
  private final jkg b;
  
  jkn(jkg paramjkg, jhv paramjhv)
  {
    this.b = paramjkg;
    this.a = paramjhv;
  }
  
  public final Map<String, jgw> a()
  {
    return this.b.b();
  }
  
  public final void b()
  {
    this.b.b(this);
  }
  
  public final void c()
  {
    jko localjko = new jko(this);
    efj.m().post(localjko);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkn
 * JD-Core Version:    0.7.0.1
 */