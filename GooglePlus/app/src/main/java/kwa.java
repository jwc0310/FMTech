import android.os.Binder;
import com.google.android.libraries.social.socialcast.impl.CastService;
import java.util.HashSet;

public final class kwa
  extends Binder
  implements kwd
{
  public kwa(CastService paramCastService) {}
  
  public final void a(kvw paramkvw)
  {
    this.a.a.add(paramkvw);
  }
  
  public final boolean a()
  {
    return this.a.q;
  }
  
  public final void b(kvw paramkvw)
  {
    this.a.a.remove(paramkvw);
  }
  
  public final boolean b()
  {
    return ((this.a.C != null) && (!this.a.q)) || (this.a.e != null);
  }
  
  public final boolean c()
  {
    return this.a.r;
  }
  
  public final boolean d()
  {
    return this.a.s;
  }
  
  public final boolean e()
  {
    return this.a.t;
  }
  
  public final boolean f()
  {
    return this.a.u;
  }
  
  public final boolean g()
  {
    return this.a.v;
  }
  
  public final ipf h()
  {
    return this.a.y;
  }
  
  public final String i()
  {
    return this.a.w;
  }
  
  public final String j()
  {
    return this.a.z;
  }
  
  public final String k()
  {
    return this.a.A;
  }
  
  public final String l()
  {
    return this.a.B;
  }
  
  public final int m()
  {
    return this.a.n;
  }
  
  public final String n()
  {
    if (this.a.C != null) {
      return this.a.C.a();
    }
    return null;
  }
  
  public final void o()
  {
    this.a.a("prev");
  }
  
  public final void p()
  {
    this.a.a("next");
  }
  
  public final void q()
  {
    this.a.a("play");
  }
  
  public final void r()
  {
    this.a.a("pause");
  }
  
  public final void s()
  {
    this.a.a("expand");
  }
  
  public final void t()
  {
    this.a.a("collapse");
  }
  
  public final boolean u()
  {
    return ((giz)mbb.a(this.a.getApplicationContext(), giz.class)).a(this.a.n).a("socialcast_private_posts", false);
  }
  
  public final void v()
  {
    CastService.c(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwa
 * JD-Core Version:    0.7.0.1
 */