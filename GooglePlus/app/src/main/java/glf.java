import android.content.Context;
import android.os.Bundle;

public final class glf
  implements gle, mbo, mfd
{
  Context a;
  private git b;
  private gzj c;
  
  public glf(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a()
  {
    if (!this.b.d()) {
      return;
    }
    gzj localgzj = this.c;
    glg localglg = new glg(this, this.a, this.b.c());
    localgzj.d.a(localglg, false);
    localgzj.b(localglg);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
    this.b = ((git)parammbb.a(git.class));
    this.c = ((gzj)parammbb.a(gzj.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glf
 * JD-Core Version:    0.7.0.1
 */