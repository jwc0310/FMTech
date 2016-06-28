import android.os.Bundle;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;
import java.util.List;

final class bes
  implements beu
{
  bes(bem parambem) {}
  
  public final void a(bex parambex)
  {
    this.a.c.add(parambex);
  }
  
  public final void a(gxz paramgxz)
  {
    gxx localgxx = (gxx)this.a.bo.a(gxx.class);
    gxw localgxw = new gxw(this.a.bn);
    localgxw.c = paramgxz;
    localgxx.a(localgxw);
  }
  
  public final void a(gxz paramgxz, Bundle paramBundle)
  {
    gxx localgxx = (gxx)this.a.bo.a(gxx.class);
    gxw localgxw = new gxw(this.a.bn);
    localgxw.c = paramgxz;
    if (paramBundle != null) {
      localgxw.h.putAll(paramBundle);
    }
    localgxx.a(localgxw);
  }
  
  public final void a(ipf paramipf, String paramString)
  {
    this.a.b.a(paramipf, paramString);
  }
  
  public final boolean a()
  {
    return bem.a(this.a).b();
  }
  
  public final void b(bex parambex)
  {
    parambex.b();
    this.a.c.remove(parambex);
  }
  
  public final boolean b()
  {
    return !bem.b(this.a).a();
  }
  
  public final TiledImageView c()
  {
    return this.a.b.x();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bes
 * JD-Core Version:    0.7.0.1
 */