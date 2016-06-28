import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class kzu
  implements gzi, kxx, mbo, mfd
{
  public final bk a;
  public final bx b;
  public Context c;
  public kyb d;
  private final kye e;
  private gzj f;
  private git g;
  
  public kzu(bk parambk, mek parammek, kye paramkye, bx parambx)
  {
    this.a = parambk;
    parammek.a(this);
    this.e = paramkye;
    this.b = parambx;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = paramContext;
    this.g = ((git)parammbb.a(git.class));
    this.f = ((gzj)parammbb.a(gzj.class));
    this.f.a.add(this);
    this.d = ((kyb)parammbb.a(kyb.class));
  }
  
  public final void a(String paramString, Bundle paramBundle)
  {
    if ("delete_square_mixin_tag".equals(paramString))
    {
      kzx localkzx = new kzx(this.c, this.g.c(), this.e.N());
      this.f.c(localkzx);
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("DeleteSquareTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label48;
      }
    }
    label48:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        ((kzv)mbb.a(this.a.f(), kzv.class)).g();
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzu
 * JD-Core Version:    0.7.0.1
 */