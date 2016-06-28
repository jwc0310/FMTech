import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class bd
  implements ViewTreeObserver.OnPreDrawListener
{
  bd(bb parambb, View paramView, rhn paramrhn, int paramInt, Object paramObject) {}
  
  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    bb.a(this.e, this.b, this.c, this.d);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bd
 * JD-Core Version:    0.7.0.1
 */