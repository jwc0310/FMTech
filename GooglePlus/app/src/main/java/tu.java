import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class tu
  implements rl
{
  public final tv a;
  public Drawable b;
  public boolean c = true;
  private final rf d;
  private tx e;
  private final int f;
  private final int g;
  private boolean h = false;
  
  private <T extends Drawable,  extends tx> tu(Activity paramActivity, Toolbar paramToolbar, rf paramrf, T paramT, int paramInt1, int paramInt2)
  {
    if ((paramActivity instanceof tw)) {
      this.a = ((tw)paramActivity).d();
    }
    for (;;)
    {
      this.d = paramrf;
      this.f = paramInt1;
      this.g = paramInt2;
      this.e = new we(paramActivity, this.a.b());
      this.b = this.a.a();
      return;
      if (Build.VERSION.SDK_INT >= 18) {
        this.a = new ua(paramActivity);
      } else if (Build.VERSION.SDK_INT >= 11) {
        this.a = new tz(paramActivity);
      } else {
        this.a = new ty(paramActivity);
      }
    }
  }
  
  public tu(Activity paramActivity, rf paramrf, int paramInt1, int paramInt2)
  {
    this(paramActivity, null, paramrf, null, paramInt1, paramInt2);
  }
  
  public final void a()
  {
    Drawable localDrawable;
    if (this.d.d(8388611))
    {
      this.e.a(1.0F);
      if (this.c)
      {
        localDrawable = (Drawable)this.e;
        if (!this.d.d(8388611)) {
          break label74;
        }
      }
    }
    label74:
    for (int i = this.g;; i = this.f)
    {
      a(localDrawable, i);
      return;
      this.e.a(0.0F);
      break;
    }
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    if ((!this.h) && (!this.a.c())) {
      this.h = true;
    }
    this.a.a(paramDrawable, paramInt);
  }
  
  public void a(View paramView)
  {
    this.e.a(1.0F);
    if (this.c)
    {
      int i = this.g;
      this.a.a(i);
    }
  }
  
  public void a(View paramView, float paramFloat)
  {
    this.e.a(Math.min(1.0F, Math.max(0.0F, paramFloat)));
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (this.c))
    {
      b();
      return true;
    }
    return false;
  }
  
  final void b()
  {
    rf localrf = this.d;
    View localView = localrf.a(8388611);
    if (localView != null) {}
    for (boolean bool = localrf.h(localView); bool; bool = false)
    {
      this.d.c(8388611);
      return;
    }
    this.d.b(8388611);
  }
  
  public void b(View paramView)
  {
    this.e.a(0.0F);
    if (this.c)
    {
      int i = this.f;
      this.a.a(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     tu
 * JD-Core Version:    0.7.0.1
 */