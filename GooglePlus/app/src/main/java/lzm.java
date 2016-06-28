import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

public final class lzm
  extends LinearLayout
{
  int a;
  float b;
  private int c;
  private Paint d;
  private int e;
  private Paint f;
  private lzn g;
  
  public lzm(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    float f1 = getResources().getDisplayMetrics().density;
    int i = paramContext.getResources().getColor(aau.Dv);
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lzj.a);
      i = localTypedArray.getColor(lzj.b, i);
      this.e = ((int)localTypedArray.getDimension(lzj.c, 2.0F * f1));
      localTypedArray.recycle();
    }
    for (;;)
    {
      setWillNotDraw(false);
      setGravity(1);
      TypedValue localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(16842800, localTypedValue, true);
      int j = localTypedValue.data;
      int k = Color.argb(38, Color.red(j), Color.green(j), Color.blue(j));
      this.g = new lzn();
      this.g.a = new int[] { i };
      this.c = ((int)(0.0F * f1));
      this.d = new Paint();
      this.d.setColor(k);
      this.f = new Paint();
      return;
      this.e = ((int)(f1 * 2.0F));
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    int i = getHeight();
    int j;
    int k;
    int n;
    int i5;
    int i1;
    if (getChildCount() > 0)
    {
      View localView1 = getChildAt(this.a);
      j = localView1.getLeft();
      k = localView1.getRight();
      lzn locallzn1 = this.g;
      int m = this.a;
      n = locallzn1.a[(m % locallzn1.a.length)];
      if ((this.b <= 0.0F) || (this.a >= -1 + getChildCount())) {
        break label333;
      }
      lzn locallzn2 = this.g;
      int i3 = 1 + this.a;
      int i4 = locallzn2.a[(i3 % locallzn2.a.length)];
      if (n != i4)
      {
        float f1 = this.b;
        float f2 = 1.0F - f1;
        float f3 = f1 * Color.red(i4) + f2 * Color.red(n);
        float f4 = f1 * Color.green(i4) + f2 * Color.green(n);
        float f5 = f1 * Color.blue(i4) + f2 * Color.blue(n);
        n = Color.rgb((int)f3, (int)f4, (int)f5);
      }
      View localView2 = getChildAt(1 + this.a);
      i5 = (int)(this.b * localView2.getLeft() + (1.0F - this.b) * j);
      i1 = (int)(this.b * localView2.getRight() + (1.0F - this.b) * k);
    }
    for (int i2 = i5;; i2 = j)
    {
      this.f.setColor(n);
      paramCanvas.drawRect(i2, i - this.e, i1, i, this.f);
      paramCanvas.drawRect(0.0F, i - this.c, getWidth(), i, this.d);
      return;
      label333:
      i1 = k;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzm
 * JD-Core Version:    0.7.0.1
 */