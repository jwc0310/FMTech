import android.content.Context;
import java.util.ArrayList;

final class fqv
  implements fqg
{
  efd a;
  
  public final void a()
  {
    this.a.b();
  }
  
  public final void a(double paramDouble)
  {
    ebm.b.a(this.a, paramDouble);
  }
  
  public final void a(Context paramContext, fql paramfql, fqi paramfqi)
  {
    ebs localebs = new ebs(((frd)paramfql).a, new fqw(this, paramfqi));
    efe localefe = new efe(paramContext).a(ebm.a, new ebr(localebs));
    fqy localfqy = new fqy(this, paramfqi);
    localefe.a.add(localfqy);
    fqx localfqx = new fqx(this, paramfqi);
    localefe.b.add(localfqx);
    this.a = localefe.a();
  }
  
  public final void a(String paramString)
  {
    ebm.b.a(this.a, paramString);
  }
  
  public final void a(String paramString, fqj paramfqj)
  {
    ebm.b.a(this.a, paramString, new fqz(this, paramfqj));
  }
  
  public final void a(String paramString1, String paramString2, apt paramapt)
  {
    ebm.b.a(this.a, paramString1, paramString2).a(new fra(this, paramapt));
  }
  
  public final void a(String paramString, boolean paramBoolean, apt paramapt)
  {
    ebm.b.a(this.a, paramString, true).a(new frb(this, paramapt));
  }
  
  public final void b()
  {
    this.a.d();
  }
  
  public final boolean c()
  {
    return this.a.e();
  }
  
  public final double d()
  {
    return ebm.b.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fqv
 * JD-Core Version:    0.7.0.1
 */