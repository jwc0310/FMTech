import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.HorizontalScrollView;

final class akq
  implements View.OnLayoutChangeListener
{
  akq(akl paramakl, HorizontalScrollView paramHorizontalScrollView) {}
  
  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a.fullScroll(66);
    this.a.removeOnLayoutChangeListener(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akq
 * JD-Core Version:    0.7.0.1
 */