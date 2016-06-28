import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.HorizontalScrollView;

final class alz
  implements View.OnLayoutChangeListener
{
  alz(alw paramalw) {}
  
  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a.b.fullScroll(66);
    this.a.b.removeOnLayoutChangeListener(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alz
 * JD-Core Version:    0.7.0.1
 */