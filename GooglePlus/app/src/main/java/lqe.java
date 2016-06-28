import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class lqe
  extends ViewGroup
{
  TextView a;
  MediaView b;
  ColorDrawable c = new ColorDrawable();
  boolean d;
  
  public lqe(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.d) {
      throw new IllegalStateException("Resources must be bound before layout.");
    }
    if (this.a != null) {
      this.a.layout(0, 0, this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }
    if (this.b != null) {
      this.b.layout(0, 0, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (!this.d) {
      throw new IllegalStateException("Resources must be bound before measure.");
    }
    if (View.MeasureSpec.getMode(paramInt1) == 0) {}
    for (int i = efj.K(getContext()).widthPixels;; i = View.MeasureSpec.getSize(paramInt1))
    {
      int j = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      if (this.a != null) {
        this.a.measure(j, j);
      }
      if (this.b != null) {
        this.b.measure(j, j);
      }
      setMeasuredDimension(i, i);
      return;
    }
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.a.setOnClickListener(paramOnClickListener);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqe
 * JD-Core Version:    0.7.0.1
 */