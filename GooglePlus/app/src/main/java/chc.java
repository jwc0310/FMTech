import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.apps.plus.views.StreamOneUpViewGroup;

final class chc
  extends FrameLayout
{
  public boolean a = true;
  
  public chc(cgr paramcgr, Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.a)
    {
      int i = this.b.J();
      int j = View.MeasureSpec.getSize(paramInt2);
      if (this.b.ba[i] != -1) {}
      for (int k = j - this.b.ba[i];; k = j - this.b.bf)
      {
        int m = View.MeasureSpec.makeMeasureSpec(k, -2147483648);
        this.b.aZ.measure(paramInt1, m);
        setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
        return;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chc
 * JD-Core Version:    0.7.0.1
 */