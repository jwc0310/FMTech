import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public final class los
  extends View
  implements lxj
{
  public final loj a;
  public llo b;
  public String c;
  public boolean d;
  private StaticLayout e;
  
  public los(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private los(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private los(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.a = loj.a(paramContext);
  }
  
  public final void D_()
  {
    this.e = null;
    this.b = null;
    this.c = null;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    this.a.as.setBounds(0, 0, i, j);
    this.a.as.draw(paramCanvas);
    if (this.e != null)
    {
      int k = (j - this.e.getHeight()) / 2;
      paramCanvas.translate(this.a.m, k);
      this.e.draw(paramCanvas);
      paramCanvas.translate(-this.a.m, -k);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = i - 2 * this.a.m;
    this.e = new StaticLayout(this.c, efj.B(getContext(), aw.ei), j, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    setMeasuredDimension(i, Math.max(this.a.ah, this.e.getHeight() + 2 * this.a.m));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     los
 * JD-Core Version:    0.7.0.1
 */