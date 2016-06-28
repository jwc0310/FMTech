import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class luk
{
  public Context a;
  public View b;
  public WindowManager c;
  public final Set<luo> d = new HashSet();
  public final Handler e = new Handler();
  public final WindowManager.LayoutParams f = new WindowManager.LayoutParams();
  public final Runnable g = new lul(this);
  public final View.OnTouchListener h = new lum(this);
  public final lui i = new lui(this);
  
  public luk(Context paramContext)
  {
    this.a = paramContext;
    this.f.height = -2;
    this.f.width = -1;
    this.f.format = -3;
    WindowManager.LayoutParams localLayoutParams = this.f;
    if (Build.VERSION.SDK_INT < 19) {}
    for (int j = 1003;; j = 2005)
    {
      localLayoutParams.type = j;
      this.f.setTitle("ActionableToast");
      this.f.gravity = 80;
      Resources localResources = paramContext.getResources();
      this.f.y = localResources.getDimensionPixelOffset(efj.Zy);
      this.f.flags = 262184;
      this.c = ((WindowManager)paramContext.getSystemService("window"));
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e.removeCallbacks(this.g);
    if (this.b != null)
    {
      if (this.b.getParent() != null) {
        this.c.removeView(this.b);
      }
      this.b = null;
      if (paramBoolean)
      {
        Iterator localIterator = this.d.iterator();
        while (localIterator.hasNext()) {
          ((luo)localIterator.next()).d();
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     luk
 * JD-Core Version:    0.7.0.1
 */