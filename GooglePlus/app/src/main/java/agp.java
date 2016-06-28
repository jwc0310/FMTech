import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class agp
{
  int a = -1;
  RecyclerView b;
  agh c;
  boolean d;
  boolean e;
  View f;
  private final agq g = new agq(0, 0);
  
  protected abstract void a();
  
  protected abstract void a(int paramInt1, int paramInt2, agq paramagq);
  
  protected abstract void a(View paramView, agq paramagq);
  
  public final void b()
  {
    if (!this.e) {
      return;
    }
    a();
    this.b.y.a = -1;
    this.f = null;
    this.a = -1;
    this.d = false;
    this.e = false;
    agh localagh = this.c;
    if (localagh.h == this) {
      localagh.h = null;
    }
    this.c = null;
    this.b = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agp
 * JD-Core Version:    0.7.0.1
 */