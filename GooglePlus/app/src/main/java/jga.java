import android.content.Context;
import android.os.Build.VERSION;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;

public final class jga
  extends ViewGroup
{
  public TextView a;
  public TextView b;
  public int c;
  
  public jga(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-2, -2);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    int m;
    int i2;
    int i1;
    label71:
    int i8;
    int i5;
    if ((Build.VERSION.SDK_INT >= 17) && (getLayoutDirection() == 1))
    {
      i = 1;
      j = paramInt4 - paramInt2;
      int k = paramInt3 - paramInt1;
      m = this.a.getMeasuredWidth();
      int n = ((ViewGroup.MarginLayoutParams)this.a.getLayoutParams()).topMargin;
      if (i == 0) {
        break label166;
      }
      i2 = k - m;
      i1 = k;
      this.a.layout(i2, n, i1, n + j);
      if (this.b != null)
      {
        if (i == 0) {
          break label176;
        }
        i8 = i2 - this.c;
        i5 = i8 - this.b.getMeasuredWidth();
      }
    }
    label166:
    label176:
    int i4;
    for (int i6 = i8;; i6 = i4)
    {
      int i7 = ((ViewGroup.MarginLayoutParams)this.b.getLayoutParams()).topMargin;
      this.b.layout(i5, i7, i6, i7 + j);
      return;
      i = 0;
      break;
      i1 = m;
      i2 = 0;
      break label71;
      int i3 = m + this.c;
      i4 = i3 + this.b.getMeasuredWidth();
      i5 = i3;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    label79:
    int m;
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    default: 
      i = 2147483647;
      if (this.b != null)
      {
        int i3 = i - this.c;
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i3, -2147483648), paramInt2);
        j = this.b.getMeasuredWidth() + this.c;
        int k = Math.max(0, i - j);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(k, -2147483648), paramInt2);
        m = ((ViewGroup.MarginLayoutParams)this.a.getLayoutParams()).topMargin;
        if (this.b == null) {
          break label217;
        }
      }
      break;
    }
    label217:
    for (int n = ((ViewGroup.MarginLayoutParams)this.b.getLayoutParams()).topMargin;; n = 0)
    {
      int i1 = Math.max(m, n);
      TextView localTextView = this.b;
      int i2 = 0;
      if (localTextView != null) {
        i2 = this.b.getMeasuredHeight();
      }
      setMeasuredDimension(j + this.a.getMeasuredWidth(), i1 + Math.max(this.a.getMeasuredHeight(), i2));
      return;
      i = View.MeasureSpec.getSize(paramInt1);
      break;
      j = 0;
      break label79;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jga
 * JD-Core Version:    0.7.0.1
 */