import com.google.android.gms.common.api.Scope;

public final class fpa
{
  public static final eex<fov, foh> a;
  public static final Scope b;
  public static final Scope c;
  private static efc<fov> d = new efc();
  private static efc<fov> e = new efc();
  private static eex<fov, eez> f;
  
  static
  {
    a = new fpb();
    f = new fpc();
    b = new Scope("profile");
    c = new Scope("email");
    new eew("SignIn.API", a, d);
    new eew("SignIn.INTERNAL_API", f, e);
    new fpd();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpa
 * JD-Core Version:    0.7.0.1
 */