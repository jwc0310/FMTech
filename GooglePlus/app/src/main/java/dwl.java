import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;

public final class dwl
  extends lxd
  implements View.OnClickListener, lxj
{
  static int h;
  private static boolean j;
  private static int k;
  private static int l;
  private static float m;
  private static NinePatchDrawable n;
  private static int o;
  private static int p;
  private static int q;
  private static int r;
  public dwn a;
  public dwo b;
  public dwr c;
  public boolean d;
  public boolean e;
  public boolean f;
  public boolean g;
  private dwm i;
  
  public dwl(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dwl(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dwl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    if (!j)
    {
      Resources localResources = paramContext.getResources();
      k = localResources.getDimensionPixelSize(efj.lG);
      l = localResources.getDimensionPixelSize(efj.lH);
      m = localResources.getDimension(efj.lJ);
      n = (NinePatchDrawable)localResources.getDrawable(efj.ov);
      o = (int)localResources.getDimension(efj.kU);
      p = (int)localResources.getDimension(efj.kW);
      q = (int)localResources.getDimension(efj.kV);
      h = (int)localResources.getDimension(efj.kT);
      r = (int)localResources.getDimension(efj.lL);
      j = true;
    }
    boolean bool;
    int i1;
    if (paramContext.getResources().getConfiguration().orientation == 2)
    {
      bool = true;
      this.d = bool;
      this.e = efj.b(efj.K(paramContext));
      this.i = new dwm(paramContext, paramAttributeSet, 0);
      dwm localdwm = this.i;
      if (!this.d) {
        break label377;
      }
      i1 = -2;
      label195:
      localdwm.setLayoutParams(new FrameLayout.LayoutParams(-1, i1));
      addView(this.i);
      this.a = new dwn(paramContext, paramAttributeSet, 0);
      this.a.setId(aaw.dn);
      this.i.addView(this.a);
      this.f = this.d;
      this.b = new dwo(paramContext, paramAttributeSet, 0);
      if (this.f) {
        this.i.addView(this.b);
      }
      this.b.setId(aaw.do);
      this.c = new dwr(paramContext, paramAttributeSet, 0);
      if (this.f) {
        this.i.addView(this.c);
      }
      if (!this.e) {
        break label383;
      }
    }
    label377:
    label383:
    for (int i2 = 2;; i2 = 1)
    {
      if (!this.d) {
        break label389;
      }
      setLayoutParams(new lyc(1, -2, i2, i2));
      return;
      bool = false;
      break;
      i1 = -1;
      break label195;
    }
    label389:
    setLayoutParams(new lyc(2, -2, i2, i2));
  }
  
  public final void D_()
  {
    this.a.D_();
    dwo localdwo = this.b;
    localdwo.c.b();
    localdwo.d.b();
    dwr localdwr = this.c;
    dws localdws = localdwr.b;
    localdws.d = 0;
    localdws.e = 0;
    localdwr.a = null;
  }
  
  public final void b()
  {
    boolean bool = true;
    if (!this.f)
    {
      this.i.addView(this.b);
      this.i.addView(this.c);
      this.a.a(bool);
      if (this.f) {
        break label85;
      }
    }
    for (;;)
    {
      this.f = bool;
      return;
      this.i.removeView(this.b);
      this.i.removeView(this.c);
      this.a.a(false);
      break;
      label85:
      bool = false;
    }
  }
  
  public final void onClick(View paramView)
  {
    b();
    this.g = true;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    n.setBounds(0, 0, getMeasuredWidth(), this.i.getMeasuredHeight());
    n.draw(paramCanvas);
    super.onDraw(paramCanvas);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i1 = getMeasuredWidth();
    this.i.layout(0, 0, i1, this.i.getMeasuredHeight());
    int i2 = this.a.getMeasuredHeight();
    int i3 = i2 + r;
    this.a.layout(o, 0, i1, i2);
    int i4;
    int i5;
    TextView localTextView;
    if (this.f)
    {
      i4 = o + this.b.getMeasuredWidth();
      i5 = i3 + this.b.getMeasuredHeight();
      this.b.layout(o, i3, i4, i5);
      dwn localdwn = this.a;
      boolean bool = this.e;
      localTextView = localdwn.r;
      if (!bool) {
        break label222;
      }
    }
    label222:
    for (int i6 = 0;; i6 = 8)
    {
      localTextView.setVisibility(i6);
      if (!this.e) {
        break;
      }
      dwm localdwm = this.i;
      localdwm.a = true;
      localdwm.b = i4;
      localdwm.c = i3;
      this.c.layout(i4 + k, i3, i4 + k + this.c.getMeasuredWidth(), i3 + this.c.getMeasuredHeight());
      return;
    }
    this.i.a = false;
    int i7 = i5 + l;
    this.c.layout(o + k, i7, o + k + this.c.getMeasuredWidth(), i7 + this.c.getMeasuredHeight());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    if (i1 == 0) {
      i1 = i2;
    }
    int i3 = p;
    int i4 = i1 - (o + q);
    this.a.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
    int i5 = i3 + (this.a.getMeasuredHeight() + r);
    int i9;
    int i8;
    int i6;
    if (this.f) {
      if (this.e)
      {
        i9 = (int)(i4 * m);
        i8 = i4 - i9 - 2 * k;
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
        if (!this.e) {
          break label250;
        }
        i6 = i5 + Math.max(this.b.getMeasuredHeight(), this.c.getMeasuredHeight());
      }
    }
    for (;;)
    {
      int i7 = i6 + h;
      this.i.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
      setMeasuredDimension(i4 + o + q, i7);
      return;
      i8 = i4 - 2 * k;
      i9 = i4;
      break;
      label250:
      i6 = i5 + (this.b.getMeasuredHeight() + this.c.getMeasuredHeight() + l);
      continue;
      i6 = i5;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwl
 * JD-Core Version:    0.7.0.1
 */