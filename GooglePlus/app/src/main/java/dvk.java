import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils.TruncateAt;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

public final class dvk
  extends ViewGroup
  implements lxx
{
  TextView a;
  TextView b;
  TextView c;
  dwb d;
  private Point e;
  private Point f = new Point();
  private Point g;
  
  public dvk(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = new TextView(paramContext, paramAttributeSet, paramInt);
    this.b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.b.setTextAppearance(paramContext, efj.yr);
    this.b.setSingleLine();
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.b);
    this.e = new Point();
    this.a = new TextView(paramContext, paramAttributeSet, paramInt);
    this.a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.a.setTextAppearance(paramContext, efj.yD);
    this.a.setSingleLine();
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.a);
    this.g = new Point();
    this.c = new TextView(paramContext, paramAttributeSet, paramInt);
    this.c.setTextAppearance(paramContext, efj.yo);
    this.c.setMovementMethod(lxy.a());
    addView(this.c);
  }
  
  public final void a(URLSpan paramURLSpan)
  {
    if (this.d != null) {
      this.d.c(paramURLSpan.getURL());
    }
  }
  
  public final void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, boolean paramBoolean)
  {
    this.b.setText(paramCharSequence1);
    this.a.setText(paramCharSequence2);
    if (paramCharSequence3 != null)
    {
      this.c.setContentDescription(paramCharSequence3.toString());
      this.c.setText(lxw.a(paramCharSequence3.toString(), this));
      if (paramBoolean) {
        this.c.setEllipsize(TextUtils.TruncateAt.END);
      }
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b.layout(this.f.x, this.f.y, this.f.x + this.b.getMeasuredWidth(), this.f.y + this.b.getMeasuredHeight());
    this.a.layout(this.e.x, this.e.y, this.e.x + this.a.getMeasuredWidth(), this.e.y + this.a.getMeasuredHeight());
    this.c.layout(this.g.x, this.g.y, this.g.x + this.c.getMeasuredWidth(), this.g.y + this.c.getMeasuredHeight());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getMode(paramInt2);
    this.a.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(j, k));
    int m = this.a.getMeasuredWidth();
    int n = this.a.getMeasuredHeight();
    this.e.x = (i - m);
    this.e.y = 0;
    this.b.measure(View.MeasureSpec.makeMeasureSpec(this.e.x, -2147483648), View.MeasureSpec.makeMeasureSpec(j, k));
    int i1 = this.b.getMeasuredHeight();
    this.f.x = 0;
    this.f.y = 0;
    Point localPoint1 = this.f;
    localPoint1.y += Math.max(0, n - i1);
    Point localPoint2 = this.e;
    localPoint2.y += Math.max(0, i1 - n);
    int i2 = 0 + (i1 + this.f.y);
    if (this.c.getText().length() > 0)
    {
      this.c.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(j - i2, k));
      int i3 = this.c.getMeasuredHeight();
      this.g.x = 0;
      this.g.y = i2;
      i2 += i3;
    }
    setMeasuredDimension(resolveSize(i, paramInt1), resolveSize(i2, paramInt2));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvk
 * JD-Core Version:    0.7.0.1
 */