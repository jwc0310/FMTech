import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lvj
  implements lvm, mdp, mfd
{
  public lvi a = new lvi();
  public lvh b = new lvk(this);
  lvh c = this.a;
  public boolean d = true;
  private Activity e;
  private lvl f;
  private List<lvm> g = new ArrayList();
  
  public lvj(Activity paramActivity, mek parammek)
  {
    this.e = paramActivity;
    parammek.a(this);
  }
  
  public final void a(boolean paramBoolean)
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext()) {
      ((lvm)localIterator.next()).a(paramBoolean);
    }
  }
  
  public final void b_(Bundle paramBundle)
  {
    if (!this.d) {}
    while (!(this.e instanceof tt)) {
      return;
    }
    this.f = new lvl(((tt)this.e).e().a(), this.a);
    this.f.h = this;
    this.c = this.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvj
 * JD-Core Version:    0.7.0.1
 */