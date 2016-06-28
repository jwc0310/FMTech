import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public final class jwx
  extends jwu
{
  private static int J;
  private static int K;
  private static int L;
  private static int M;
  private static int N;
  private static int O;
  private static int P;
  private static boolean k;
  private static int l;
  private ArrayList<View> Q;
  private int R;
  
  public jwx(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void D_()
  {
    super.D_();
    if (this.Q.size() == 5) {
      this.Q.clear();
    }
  }
  
  public final int a(View paramView)
  {
    for (int i = 0; i < this.y; i++) {
      if ((paramView == this.g.get(i)) || (paramView == this.h.get(i))) {
        return i;
      }
    }
    return -1;
  }
  
  final TextView a(Context paramContext, int paramInt, String paramString)
  {
    TextView localTextView = super.a(paramContext, paramInt, paramString);
    localTextView.setMinHeight(P);
    return localTextView;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    ((TextView)this.p.get(paramInt1)).measure(paramInt2, this.R);
  }
  
  protected final void a(Context paramContext)
  {
    super.a(paramContext);
    if (!k)
    {
      Resources localResources = paramContext.getResources();
      l = (int)localResources.getDimension(efj.Tv);
      P = (int)localResources.getDimension(efj.Tw);
      int i = (int)localResources.getDimension(efj.Tu);
      J = localResources.getColor(eyg.aO);
      K = localResources.getColor(eyg.aQ);
      L = View.MeasureSpec.makeMeasureSpec(l, 1073741824);
      M = View.MeasureSpec.makeMeasureSpec(l, 1073741824);
      N = View.MeasureSpec.makeMeasureSpec(l, 1073741824);
      O = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      k = true;
    }
    this.Q = new ArrayList();
  }
  
  public final void b()
  {
    int i = 0;
    Context localContext1 = getContext();
    llz[] arrayOfllz = this.c.h;
    for (int j = 0; j < this.y; j++)
    {
      llx localllx = arrayOfllz[j].d;
      if ((localllx != null) && (!TextUtils.isEmpty(localllx.e)))
      {
        a(localContext1, j);
        b(localContext1, j).setBackgroundColor(K);
      }
      e(localContext1, j);
      d(localContext1, j);
      a(localContext1, j, arrayOfllz[j].b);
      c(localContext1, j);
    }
    addView(this.t);
    if (i < this.y)
    {
      Context localContext2 = getContext();
      View localView;
      if (i < this.Q.size()) {
        localView = (View)this.Q.get(i);
      }
      for (;;)
      {
        addView(localView);
        i++;
        break;
        localView = new View(localContext2);
        localView.setBackgroundColor(J);
        this.Q.add(localView);
      }
    }
    b(localContext1);
  }
  
  final void b(int paramInt)
  {
    super.b(paramInt);
    TextView localTextView = (TextView)this.q.get(paramInt);
    localTextView.measure(b, this.R);
    b(localTextView, (View)this.r.get(paramInt), o, 0);
  }
  
  final int d()
  {
    return l;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = a.m;
    int j = this.c.k;
    int m = 0;
    int n = i;
    if (m < this.y)
    {
      MediaView localMediaView1 = (MediaView)this.g.get(m);
      localMediaView1.layout(0, n, 0 + localMediaView1.getMeasuredWidth(), n + localMediaView1.getMeasuredHeight());
      View localView1 = (View)this.Q.get(m);
      localView1.layout(0, n + localMediaView1.getMeasuredHeight(), 0 + localView1.getMeasuredWidth(), n + localMediaView1.getMeasuredHeight() + localView1.getMeasuredHeight());
      int i1 = localMediaView1.getMeasuredWidth();
      MediaView localMediaView2 = (MediaView)this.h.get(m);
      localMediaView2.layout(i1 + 0, n, i1 + 0 + localMediaView2.getMeasuredWidth(), n + localMediaView2.getMeasuredHeight());
      TextView localTextView = (TextView)this.p.get(m);
      int i2 = n + (localMediaView2.getMeasuredHeight() - localTextView.getMeasuredHeight()) / 2;
      int i3 = i1 + m;
      View localView2 = (View)this.r.get(m);
      localView2.layout(i3, i2, i3 + localView2.getMeasuredWidth(), i2 + localView2.getMeasuredHeight());
      View localView3 = (View)this.s.get(m);
      localView3.layout(i3, i2, i3 + localView3.getMeasuredWidth(), i2 + localView3.getMeasuredHeight());
      b(m);
      if (!p()) {
        localTextView.layout(i3, i2, i3 + localTextView.getMeasuredWidth(), i2 + localTextView.getMeasuredHeight());
      }
      for (;;)
      {
        int i4 = n + localMediaView1.getMeasuredHeight();
        m++;
        n = i4;
        break;
        c(m);
      }
    }
    if (j != -1) {
      d(j);
    }
    e();
    this.F = (((MediaView)this.h.get(0)).getMeasuredWidth() / ((View)this.r.get(0)).getWidth());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    super.onMeasure(paramInt1, paramInt2);
    this.t.measure(b, b);
    int j = View.MeasureSpec.makeMeasureSpec(this.d - l, 1073741824);
    int m = View.MeasureSpec.makeMeasureSpec(this.d - l - (m << 1), 1073741824);
    int n = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
    int i1 = 0;
    int i2 = 0;
    while (i1 < this.y)
    {
      TextView localTextView = (TextView)this.p.get(i1);
      localTextView.measure(m, b);
      if (localTextView.getMeasuredHeight() > i2) {
        i2 = localTextView.getMeasuredHeight();
      }
      i1++;
    }
    this.R = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    int i5;
    for (int i3 = 0; i < this.y; i3 = i5)
    {
      MediaView localMediaView = (MediaView)this.g.get(i);
      localMediaView.measure(L, M);
      ((MediaView)this.h.get(i)).measure(j, N);
      ((TextView)this.p.get(i)).measure(m, this.R);
      ((View)this.r.get(i)).measure(m, this.R);
      ((View)this.s.get(i)).measure(b, this.R);
      ((View)this.Q.get(i)).measure(n, O);
      i5 = i3 + localMediaView.getMeasuredHeight();
      i++;
    }
    int i4 = i3 + a.m;
    setMeasuredDimension(this.d, i4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwx
 * JD-Core Version:    0.7.0.1
 */