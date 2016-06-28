import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class dvn
  extends ViewGroup
  implements lxj
{
  private static boolean f;
  private static int g;
  private static int h;
  private static int i;
  private static int j;
  private static int k;
  private static int l;
  private static int m;
  private static int n;
  private static int o;
  private static float p;
  private static int q;
  private static int r;
  private static Drawable s;
  String a;
  String b;
  TextView c;
  AvatarView d;
  AvatarView[] e;
  private Context t;
  private int u;
  private int v;
  private Drawable w;
  
  public dvn(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dvn(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dvn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    this.t = paramContext;
    if (!f)
    {
      Resources localResources = paramContext.getResources();
      g = localResources.getDimensionPixelSize(efj.kU);
      h = localResources.getDimensionPixelSize(efj.kV);
      j = localResources.getDimensionPixelSize(efj.kW);
      k = localResources.getDimensionPixelSize(efj.kT);
      l = g + h;
      m = j + k;
      i = localResources.getDimensionPixelSize(efj.lb);
      n = localResources.getDimensionPixelSize(efj.kZ);
      o = localResources.getDimensionPixelSize(efj.kY);
      p = localResources.getDimension(efj.nL);
      q = localResources.getDimensionPixelSize(efj.la);
      r = localResources.getColor(efj.kn);
      s = localResources.getDrawable(efj.ow);
      f = true;
    }
    this.w = getResources().getDrawable(da.aY);
    this.w.setCallback(this);
    setBackgroundDrawable(s);
    setPadding(g + i, j + i, h + i, k);
    this.d = new AvatarView(paramContext);
    this.d.a(3);
    this.d.setId(100);
    addView(this.d);
    this.e = new AvatarView[4];
    for (int i1 = 0; i1 < 4; i1++)
    {
      this.e[i1] = new AvatarView(paramContext);
      this.e[i1].a(1);
      this.e[i1].setId(i1 + 101);
      addView(this.e[i1]);
    }
    this.c = new TextView(paramContext);
    this.c.setTextSize(0, p);
    this.c.setTextColor(r);
    this.c.setLines(2);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    this.c.setGravity(16);
    addView(this.c);
  }
  
  public final void D_()
  {
    this.a = null;
    this.b = null;
    this.c.setText(null);
    this.d.a();
    for (int i1 = 1; i1 < 4; i1++) {
      this.e[i1].a();
    }
  }
  
  protected final void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if ((isPressed()) || (isFocused())) {
      this.w.draw(paramCanvas);
    }
  }
  
  protected final void drawableStateChanged()
  {
    this.w.setState(getDrawableState());
    invalidate();
    super.drawableStateChanged();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = g + i;
    int i2 = i1 + this.u + o;
    int i3 = i2 + this.v + o;
    int i4 = i1 + this.u;
    int i5 = i2 + this.v;
    int i6 = i3 + this.v;
    int i7 = j + i;
    int i8 = i7 + this.v + o;
    int i9 = i7 + this.v;
    int i10 = i8 + this.v;
    int i11 = paramInt4 - paramInt2 - k;
    this.d.layout(i1, i7, i4, i10);
    this.e[0].layout(i2, i7, i5, i9);
    this.e[1].layout(i3, i7, i6, i9);
    this.e[2].layout(i2, i8, i5, i10);
    this.e[3].layout(i3, i8, i6, i10);
    this.c.layout(i1, i10, i6, i11 - q);
    this.w.setBounds(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = View.MeasureSpec.getSize(paramInt1);
    this.v = ((i2 - 2 * i - 3 * o - l) / 4);
    this.u = (2 * this.v + o);
    int i3 = i + this.u + n + m;
    this.d.measure(View.MeasureSpec.makeMeasureSpec(this.u, 1073741824), View.MeasureSpec.makeMeasureSpec(this.u, 1073741824));
    int i4 = this.v;
    int i5;
    if (i4 <= efj.g(this.t)) {
      i5 = 0;
    }
    while (i1 < 4)
    {
      this.e[i1].a(i5);
      this.e[i1].measure(View.MeasureSpec.makeMeasureSpec(this.v, 1073741824), View.MeasureSpec.makeMeasureSpec(this.v, 1073741824));
      i1++;
      continue;
      if (i4 <= efj.i(this.t))
      {
        i5 = 1;
        i1 = 0;
      }
      else if (i4 <= efj.k(this.t))
      {
        i5 = 2;
        i1 = 0;
      }
      else
      {
        efj.m(this.t);
        i5 = 3;
        i1 = 0;
      }
    }
    this.c.measure(View.MeasureSpec.makeMeasureSpec(i2 - 2 * i - g - h, 1073741824), View.MeasureSpec.makeMeasureSpec(n, 1073741824));
    setMeasuredDimension(i2, i3);
  }
  
  public final void requestLayout()
  {
    forceLayout();
  }
  
  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.w) {
      return true;
    }
    return super.verifyDrawable(paramDrawable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvn
 * JD-Core Version:    0.7.0.1
 */