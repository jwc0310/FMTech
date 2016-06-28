import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public final class afv
  implements xm, ya
{
  public xl a;
  public xx b;
  public afw c;
  private Context d;
  private View e;
  
  public afv(Context paramContext, View paramView)
  {
    this(paramContext, paramView, 0);
  }
  
  private afv(Context paramContext, View paramView, int paramInt)
  {
    this(paramContext, paramView, 0, aau.X, 0);
  }
  
  private afv(Context paramContext, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramContext;
    this.a = new xl(paramContext);
    this.a.a(this);
    this.e = paramView;
    this.b = new xx(paramContext, this.a, paramView, false, paramInt2, 0);
    this.b.i = paramInt1;
    this.b.g = this;
  }
  
  public final void a(int paramInt)
  {
    new wx(this.d).inflate(paramInt, this.a);
  }
  
  public final void a(xl paramxl) {}
  
  public final void a(xl paramxl, boolean paramBoolean) {}
  
  public final boolean a(xl paramxl, MenuItem paramMenuItem)
  {
    if (this.c != null) {
      return this.c.a(paramMenuItem);
    }
    return false;
  }
  
  public final boolean a_(xl paramxl)
  {
    boolean bool = true;
    if (paramxl == null) {
      bool = false;
    }
    while (!paramxl.hasVisibleItems()) {
      return bool;
    }
    new xx(this.d, paramxl, this.e).d();
    return bool;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afv
 * JD-Core Version:    0.7.0.1
 */