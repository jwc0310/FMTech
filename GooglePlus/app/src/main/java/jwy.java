import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public final class jwy
  extends jwu
{
  private static boolean k;
  private static int l;
  
  public jwy(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void a(Context paramContext)
  {
    super.a(paramContext);
    if (!k)
    {
      l = (int)paramContext.getResources().getDimension(efj.Ty);
      k = true;
    }
  }
  
  public final void b()
  {
    super.b();
    b(getContext());
  }
  
  final void b(int paramInt)
  {
    super.b(paramInt);
    View localView = (View)this.r.get(paramInt);
    int i = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
    TextView localTextView = (TextView)this.q.get(paramInt);
    localTextView.measure(b, i);
    int j = (localView.getMeasuredHeight() - localTextView.getMeasuredHeight()) / 2;
    b(localTextView, localView, o, j);
  }
  
  final int d()
  {
    return (int)(0.5625D * this.d);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = a.m;
    MediaView localMediaView1 = (MediaView)this.g.get(0);
    int j = i + localMediaView1.getMeasuredHeight() - ((View)this.r.get(0)).getMeasuredHeight() - l;
    localMediaView1.layout(0, i, 0 + localMediaView1.getMeasuredWidth(), i + localMediaView1.getMeasuredHeight());
    MediaView localMediaView2 = (MediaView)this.h.get(0);
    int m = i + localMediaView1.getMeasuredHeight() + localMediaView2.getMeasuredHeight() - a.m + m;
    localMediaView2.layout(0, i + localMediaView1.getMeasuredHeight(), 0 + localMediaView2.getMeasuredWidth(), m);
    int n = this.c.k;
    int i1 = m;
    int i2 = j;
    int i3 = 0;
    if (i3 < this.y)
    {
      View localView1 = (View)this.r.get(i3);
      localView1.layout(i1, i2 + l, i1 + localView1.getMeasuredWidth(), i2 + localView1.getMeasuredHeight() + l);
      View localView2 = (View)this.s.get(i3);
      localView2.layout(i1, i2 + l, i1 + localView2.getMeasuredWidth(), i2 + localView2.getMeasuredHeight() + l);
      b(i3);
      if (!p())
      {
        TextView localTextView = (TextView)this.p.get(i3);
        localTextView.layout(i1, i2 + l, i1 + localTextView.getMeasuredWidth(), i2 + localTextView.getMeasuredHeight() + l);
      }
      for (;;)
      {
        int i4 = i2 + (localView1.getMeasuredHeight() + l);
        i3++;
        i2 = i4;
        break;
        c(i3);
      }
    }
    if (n != -1) {
      d(n);
    }
    e();
    this.F = (this.d / ((View)this.r.get(0)).getWidth());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.t.measure(b, b);
    int i = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
    MediaView localMediaView1 = (MediaView)this.g.get(0);
    localMediaView1.measure(i, this.f);
    int j = this.d - (m << 1);
    int m = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
    int n = 0 + localMediaView1.getMeasuredHeight();
    int i1 = h();
    int i2 = this.t.getMeasuredWidth();
    int i3 = 0;
    int i4 = 0;
    while (i3 < this.y)
    {
      TextView localTextView2 = (TextView)this.p.get(i3);
      localTextView2.measure(View.MeasureSpec.makeMeasureSpec(j - i2 - o / 2 - i1, 1073741824), b);
      if (localTextView2.getMeasuredHeight() > i4) {
        i4 = localTextView2.getMeasuredHeight();
      }
      i3++;
    }
    for (int i5 = 0; i5 < this.y; i5++)
    {
      TextView localTextView1 = (TextView)this.p.get(i5);
      int i8 = View.MeasureSpec.makeMeasureSpec(localTextView1.getMeasuredWidth(), 1073741824);
      int i9 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
      localTextView1.measure(i8, i9);
      ((View)this.r.get(i5)).measure(m, i9);
      ((View)this.s.get(i5)).measure(b, i9);
    }
    int i6 = View.MeasureSpec.makeMeasureSpec(((TextView)this.p.get(0)).getMeasuredHeight() * (-1 + this.y) + l * this.y + m, 1073741824);
    MediaView localMediaView2 = (MediaView)this.h.get(0);
    localMediaView2.measure(i, i6);
    int i7 = n + (localMediaView2.getMeasuredHeight() + a.m);
    setMeasuredDimension(this.d, i7);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwy
 * JD-Core Version:    0.7.0.1
 */