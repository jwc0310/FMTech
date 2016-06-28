import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public final class jie
  implements mbo, mdz, meu, mew, mez, mfd
{
  jgu a;
  jil b;
  public jhs c;
  public jjc d;
  private jiw e;
  private int f;
  private boolean g;
  
  public jie(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(Activity paramActivity)
  {
    this.g = true;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = ((jiw)parammbb.a(jiw.class));
    this.f = ((git)parammbb.a(git.class)).c();
  }
  
  public final void b()
  {
    this.e.a(new jif(this), this.f, jgx.a);
    this.e.a(new jig(this), this.f, 0, 2147483647, jjh.a);
  }
  
  public final void c()
  {
    if (this.a != null) {
      this.a.b();
    }
    if (this.b != null) {
      this.b.b();
    }
  }
  
  public final void m_()
  {
    this.g = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jie
 * JD-Core Version:    0.7.0.1
 */