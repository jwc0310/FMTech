import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public final class jxo
  extends jwv
{
  private static boolean J;
  private static int K;
  private static int L;
  private View M;
  
  public jxo(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void a(Context paramContext)
  {
    super.a(paramContext);
    if (!J)
    {
      Resources localResources = paramContext.getResources();
      int i = (int)localResources.getDimension(efj.TB);
      K = localResources.getColor(eyg.aO);
      L = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      J = true;
    }
    this.M = new View(paramContext);
    this.M.setBackgroundColor(K);
  }
  
  public final void b()
  {
    super.b();
    addView(this.M);
    b(getContext());
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = a.m;
    int j = this.c.k;
    int k = ((MediaView)this.g.get(0)).getMeasuredHeight();
    this.l.layout(0, i + k - this.l.getMeasuredHeight(), 0 + this.l.getMeasuredWidth(), i + k);
    int m = 0;
    int n = 0;
    if (m < this.y)
    {
      MediaView localMediaView = (MediaView)this.g.get(m);
      localMediaView.layout(n, i, n + localMediaView.getMeasuredWidth(), i + localMediaView.getMeasuredHeight());
      if (m == 0) {
        this.M.layout(n + localMediaView.getMeasuredWidth(), i, n + localMediaView.getMeasuredWidth() + this.M.getMeasuredWidth(), i + this.M.getMeasuredHeight());
      }
      TextView localTextView = (TextView)this.p.get(m);
      int i1 = i + k - localTextView.getMeasuredHeight() - m;
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
        int i3 = n + localMediaView.getMeasuredWidth();
        m++;
        n = i3;
        break;
        c(m);
      }
    }
    if (j != -1) {
      d(j);
    }
    super.e();
    this.F = (((MediaView)this.g.get(0)).getMeasuredWidth() / ((View)this.r.get(0)).getWidth());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.t.measure(b, b);
    int i = View.MeasureSpec.makeMeasureSpec(this.d / 2, 1073741824);
    int j = this.d / 2 - (m << 1);
    int k = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
    int m = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
    this.M.measure(L, this.f);
    this.l.measure(m, this.k);
    int n = this.t.getMeasuredWidth();
    int i1 = 0;
    int i2 = 0;
    while (i1 < this.y)
    {
      TextView localTextView2 = (TextView)this.p.get(i1);
      localTextView2.measure(View.MeasureSpec.makeMeasureSpec(j - n - o / 2, 1073741824), b);
      if (localTextView2.getMeasuredHeight() > i2) {
        i2 = localTextView2.getMeasuredHeight();
      }
      i1++;
    }
    for (int i3 = 0; i3 < this.y; i3++)
    {
      ((MediaView)this.g.get(i3)).measure(i, this.f);
      TextView localTextView1 = (TextView)this.p.get(i3);
      int i5 = View.MeasureSpec.makeMeasureSpec(localTextView1.getMeasuredWidth(), 1073741824);
      int i6 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
      localTextView1.measure(i5, i6);
      ((View)this.r.get(i3)).measure(k, i6);
      ((View)this.s.get(i3)).measure(b, i6);
    }
    int i4 = ((MediaView)this.g.get(0)).getMeasuredHeight() + a.m;
    setMeasuredDimension(this.d, i4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxo
 * JD-Core Version:    0.7.0.1
 */