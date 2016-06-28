import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class jiy
  implements mbo, mew, mez, mfd
{
  public jih a;
  jil b;
  private jiw c;
  private int d;
  private jjm<jjg> e = jjh.a;
  private Map<String, List<jgw>> f;
  private jhx g = new jiz(this);
  
  public jiy(mek parammek)
  {
    parammek.a(this);
    this.f = new HashMap();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((jiw)parammbb.a(jiw.class));
    this.d = ((git)parammbb.a(git.class)).c();
  }
  
  public final void b()
  {
    if (this.g != null) {}
    for (int i = 1; i == 0; i = 0) {
      throw new IllegalStateException();
    }
    this.c.a(this.g, this.d, 0, 2147483647, this.e);
  }
  
  public final void c()
  {
    if (this.b != null) {
      this.b.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jiy
 * JD-Core Version:    0.7.0.1
 */