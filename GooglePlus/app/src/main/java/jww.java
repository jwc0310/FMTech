import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.help.TooltipView;
import java.util.ArrayList;

public final class jww
  extends jxg
{
  public jww(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void b()
  {
    Context localContext = getContext();
    llz[] arrayOfllz = this.c.h;
    for (int i = 0; i < this.y; i++)
    {
      e(localContext, i);
      d(localContext, i);
      a(localContext, i, arrayOfllz[i].b);
      c(localContext, i);
    }
    addView(this.t);
    b(localContext);
  }
  
  final void b(int paramInt)
  {
    super.b(paramInt);
    View localView = (View)this.r.get(paramInt);
    int i = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
    TextView localTextView = (TextView)this.q.get(paramInt);
    localTextView.measure(b, i);
    b(localTextView, localView, o, 0);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = a.m;
    int j = m;
    int k = this.c.k;
    int m = 0;
    int n = i;
    if (m < this.y) {
      if (m <= 0) {
        break label282;
      }
    }
    label282:
    for (int i1 = jxg.n;; i1 = 0)
    {
      View localView1 = (View)this.r.get(m);
      localView1.layout(j, n + i1, j + localView1.getMeasuredWidth(), i1 + (n + localView1.getMeasuredHeight()));
      View localView2 = (View)this.s.get(m);
      localView2.layout(j, n + i1, j + localView2.getMeasuredWidth(), i1 + (n + localView2.getMeasuredHeight()));
      b(m);
      TextView localTextView = (TextView)this.p.get(m);
      if (!p()) {
        localTextView.layout(j, n + i1, j + localTextView.getMeasuredWidth(), i1 + (n + localTextView.getMeasuredHeight()));
      }
      for (;;)
      {
        n += i1 + localTextView.getMeasuredHeight();
        m++;
        break;
        c(m);
      }
      if (k != -1) {
        d(this.c.k);
      }
      e();
      this.F = (this.d / ((View)this.r.get(0)).getWidth());
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.t.measure(b, b);
    int i = this.d - (m << 1);
    int j = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    int k = h();
    int m = this.t.getMeasuredWidth();
    int n = 0;
    int i1 = 0;
    int i3;
    for (;;)
    {
      int i2 = this.y;
      i3 = 0;
      if (n >= i2) {
        break;
      }
      TextView localTextView2 = (TextView)this.p.get(n);
      localTextView2.measure(View.MeasureSpec.makeMeasureSpec(i - m - o / 2 - k, 1073741824), b);
      if (localTextView2.getMeasuredHeight() > i1) {
        i1 = localTextView2.getMeasuredHeight();
      }
      n++;
    }
    while (i3 < this.y)
    {
      TextView localTextView1 = (TextView)this.p.get(i3);
      int i5 = View.MeasureSpec.makeMeasureSpec(localTextView1.getMeasuredWidth(), 1073741824);
      int i6 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
      localTextView1.measure(i5, i6);
      ((View)this.r.get(i3)).measure(j, i6);
      ((View)this.s.get(i3)).measure(b, i6);
      i3++;
    }
    int i4 = 0 + i1 * this.y + (n * (-1 + this.y) + a.m);
    if (this.u != null) {
      i4 = Math.max(i4, this.u.getMeasuredHeight() + a.m);
    }
    setMeasuredDimension(this.d, i4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jww
 * JD-Core Version:    0.7.0.1
 */