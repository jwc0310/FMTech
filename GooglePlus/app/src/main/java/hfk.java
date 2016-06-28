import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public final class hfk
  extends ViewGroup
  implements lxj
{
  static final Interpolator a = new DecelerateInterpolator();
  final hfm b;
  int c;
  public int d;
  public int e;
  public heq f;
  private final Paint g;
  private boolean h;
  private final Runnable i;
  
  public hfk(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.b = new hfm(localContext);
    this.b.a(1);
    hfm localhfm = this.b;
    localhfm.d = false;
    localhfm.setWillNotDraw(true);
    localhfm.invalidate();
    this.b.setBackgroundColor(0);
    addView(this.b);
    Resources localResources = localContext.getResources();
    this.g = new Paint();
    this.g.setColor(localResources.getColor(aau.yk));
    this.g.setStyle(Paint.Style.STROKE);
    this.g.setStrokeWidth(localResources.getDimension(aau.yy));
    setWillNotDraw(true);
    setBackgroundColor(localResources.getColor(aau.ym));
    this.i = new hfl(this);
    this.c = -1;
    this.d = 0;
    this.h = true;
    setVisibility(8);
  }
  
  private final void c()
  {
    if ((this.h) && (this.c == -1)) {
      if (Build.VERSION.SDK_INT < 14) {
        break label46;
      }
    }
    label46:
    for (int j = 1;; j = 0)
    {
      if ((j != 0) && (this.e > 1)) {
        efj.a(this.i, true);
      }
      return;
    }
  }
  
  public final void D_()
  {
    this.f = null;
    this.b.D_();
  }
  
  public final void a(heq paramheq, int paramInt)
  {
    efj.e(paramheq, "CardCommentsData was never initialized.");
    String str = paramheq.b(paramInt);
    this.b.a(paramheq.c(paramInt));
    this.b.a(str, paramheq.a(paramInt));
    this.b.a(paramheq.d(paramInt), 0, false);
    this.b.c(true);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.h == paramBoolean) {
      return;
    }
    this.h = paramBoolean;
    if (this.h)
    {
      c();
      return;
    }
    b();
  }
  
  @TargetApi(11)
  public final void b()
  {
    if (this.c != -1)
    {
      Runnable localRunnable = this.i;
      efj.m().removeCallbacks(localRunnable);
      clearAnimation();
      if (Build.VERSION.SDK_INT < 14) {
        break label53;
      }
    }
    label53:
    for (int j = 1;; j = 0)
    {
      if (j != 0)
      {
        lwo.h(this);
        setAlpha(1.0F);
      }
      this.c = -1;
      return;
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    c();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b.layout(0, 0, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if ((getVisibility() == 8) || (this.b.getVisibility() == 8))
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int j = aau.a(getContext(), paramInt1);
    this.b.measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    setMeasuredDimension(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfk
 * JD-Core Version:    0.7.0.1
 */