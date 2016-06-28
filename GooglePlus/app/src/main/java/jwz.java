import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public final class jwz
  extends jwv
{
  public jwz(Context paramContext)
  {
    super(paramContext);
  }
  
  public final int b(View paramView)
  {
    for (int i = 0; i < this.y; i++) {
      if ((paramView == this.p.get(i)) || (paramView == this.s.get(i))) {
        return i;
      }
    }
    return -1;
  }
  
  public final void b()
  {
    super.b();
    b(getContext());
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = a.m;
    MediaView localMediaView = (MediaView)this.g.get(0);
    int j = localMediaView.getMeasuredHeight();
    localMediaView.layout(0, i, 0 + localMediaView.getMeasuredWidth(), i + localMediaView.getMeasuredHeight());
    this.l.layout(0, i + j - this.l.getMeasuredHeight(), 0 + this.l.getMeasuredWidth(), i + j);
    int k = this.c.k;
    int m = 0;
    int n = 0;
    if (m < this.y)
    {
      TextView localTextView = (TextView)this.p.get(m);
      int i1 = i + j - localTextView.getMeasuredHeight() - m;
      View localView1 = (View)this.r.get(m);
      int i2 = n + m;
      localView1.layout(i2, i1, i2 + localView1.getMeasuredWidth(), i1 + localView1.getMeasuredHeight());
      View localView2 = (View)this.s.get(m);
      localView2.layout(i2, i1, i2 + localView2.getMeasuredWidth(), i1 + localView2.getMeasuredHeight());
      b(m);
      if (!p()) {
        localTextView.layout(i2, i1, i2 + localTextView.getMeasuredWidth(), i1 + localTextView.getMeasuredHeight());
      }
      for (;;)
      {
        int i3 = this.d / 2;
        m++;
        n = i3;
        break;
        c(m);
      }
    }
    if (k != -1) {
      d(k);
    }
    super.e();
    this.F = (localMediaView.getMeasuredWidth() / 2.0F / ((View)this.r.get(0)).getWidth());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.t.measure(b, b);
    int i = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
    MediaView localMediaView = (MediaView)this.g.get(0);
    localMediaView.measure(i, this.f);
    this.l.measure(i, this.k);
    int j = this.d / 2 - (m << 1);
    int k = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
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
      localTextView2.measure(View.MeasureSpec.makeMeasureSpec(j - m - o / 2, 1073741824), b);
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
      ((View)this.r.get(i3)).measure(k, i6);
      ((View)this.s.get(i3)).measure(b, i6);
      i3++;
    }
    int i4 = localMediaView.getMeasuredHeight() + a.m;
    setMeasuredDimension(this.d, i4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwz
 * JD-Core Version:    0.7.0.1
 */