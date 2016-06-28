import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.libraries.social.squares.impl.edit.ObservableScrollView;

final class lbk
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  lbk(lbi paramlbi) {}
  
  public final void onGlobalLayout()
  {
    this.a.b.onScrollChanged(0, this.a.b.getScrollY(), 0, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbk
 * JD-Core Version:    0.7.0.1
 */