import android.content.Context;
import android.os.Bundle;

public final class jja
  implements mbo, mew, mez, mfd
{
  boolean a = false;
  jil b;
  public jhx c;
  public jjm<jjg> d = jjh.a;
  private jiw e;
  private int f;
  private jhx g = new jjb(this);
  
  public jja(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = ((jiw)parammbb.a(jiw.class));
    this.f = ((git)parammbb.a(git.class)).c();
  }
  
  public final void b()
  {
    boolean bool = true;
    this.a = bool;
    if (this.c != null) {}
    while (!bool)
    {
      throw new IllegalStateException();
      bool = false;
    }
    this.e.a(this.g, this.f, 0, 2147483647, this.d);
  }
  
  public final void c()
  {
    if (this.b != null) {
      this.b.b();
    }
    this.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jja
 * JD-Core Version:    0.7.0.1
 */