import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewDebug.ExportedProperty;

public final class loz
  extends View
  implements View.OnClickListener, lxj
{
  lob a;
  String b;
  int c;
  boolean d;
  private final loj e;
  private StaticLayout f;
  private final lwj g;
  
  public loz(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private loz(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private loz(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.e = loj.a(paramContext);
    this.g = ((lwj)mbb.a(paramContext, lwj.class));
    setFocusable(true);
    setClickable(true);
    setOnClickListener(this);
  }
  
  private final Bitmap b()
  {
    switch (this.c)
    {
    case 1: 
    default: 
      return this.e.ad;
    case 0: 
      return this.e.ac;
    }
    return this.e.ae;
  }
  
  public final void D_()
  {
    this.a = null;
    this.f = null;
    this.b = null;
    this.c = 0;
    this.d = false;
  }
  
  protected final void drawableStateChanged()
  {
    invalidate();
    super.drawableStateChanged();
  }
  
  @ViewDebug.ExportedProperty(category="accessibility")
  public final CharSequence getContentDescription()
  {
    return this.b;
  }
  
  public final void onClick(View paramView)
  {
    if (this.a != null) {
      this.a.m(this.b);
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    int k = this.e.m;
    if (this.f != null)
    {
      int i3 = (j - this.f.getHeight()) / 2;
      paramCanvas.translate(k, i3);
      this.f.draw(paramCanvas);
      paramCanvas.translate(-k, -i3);
    }
    Bitmap localBitmap = b();
    int m = i - localBitmap.getWidth() - this.e.m;
    int n = (j - localBitmap.getHeight()) / 2;
    paramCanvas.drawBitmap(localBitmap, m, n, this.e.F);
    if (this.d)
    {
      int i1 = i - this.e.m;
      int i2 = (int)this.e.u.getStrokeWidth();
      paramCanvas.drawLine(this.e.m, j - i2, i1, j - i2, this.e.u);
    }
    if ((isPressed()) || (isFocused()))
    {
      this.e.x.setBounds(0, 0, i, j);
      this.e.x.draw(paramCanvas);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    Bitmap localBitmap = b();
    lwj locallwj = this.g;
    TextPaint localTextPaint = efj.B(getContext(), az.aa);
    String str = this.b;
    int j = i - 3 * this.e.m - localBitmap.getWidth();
    Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
    TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.END;
    int k = Math.max(j, 0);
    this.f = new StaticLayout(locallwj.a(str, localTextPaint, k, localTruncateAt, null), localTextPaint, k, localAlignment, 1.0F, 0.0F, false);
    efj.i(this);
    setMeasuredDimension(i, Math.max(this.f.getHeight(), localBitmap.getHeight()) + (this.e.m << 1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     loz
 * JD-Core Version:    0.7.0.1
 */