import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import java.text.NumberFormat;

public final class hfh
  extends ViewGroup
  implements gxs, lxj
{
  public int a;
  public int b;
  public ImageButton c;
  public int d;
  public boolean e;
  public ValueAnimator f;
  public ValueAnimator g;
  public ValueAnimator h;
  public boolean i;
  private Drawable j;
  private Drawable k;
  private final hfr l;
  private TextView m;
  private final NumberFormat n;
  private gxq o;
  
  public hfh(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    int i1 = localResources.getDimensionPixelOffset(aau.yq);
    this.a = localResources.getColor(aau.yi);
    this.b = localResources.getColor(aau.yj);
    setPadding(i1, i1, i1, i1);
    this.j = localResources.getDrawable(aau.yG);
    this.k = localResources.getDrawable(aau.yF);
    this.k.setAlpha(localResources.getInteger(efj.Gg));
    ArgbEvaluator localArgbEvaluator1 = new ArgbEvaluator();
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.b);
    arrayOfObject1[1] = Integer.valueOf(this.a);
    this.g = ValueAnimator.ofObject(localArgbEvaluator1, arrayOfObject1);
    ArgbEvaluator localArgbEvaluator2 = new ArgbEvaluator();
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(this.a);
    arrayOfObject2[1] = Integer.valueOf(this.b);
    this.h = ValueAnimator.ofObject(localArgbEvaluator2, arrayOfObject2);
    this.l = ((hfr)mbb.a(localContext, hfr.class));
    this.c = new ImageButton(localContext, null, 0);
    this.c.setBackgroundResource(aau.yI);
    this.c.getBackground().mutate();
    this.c.setPadding(i1, 0, i1, 0);
    this.c.setClickable(false);
    addView(this.c);
    ImageButton localImageButton = this.c;
    nj.a.c(localImageButton, 2);
    this.c.setFocusable(false);
    this.c.setFocusableInTouchMode(false);
    this.m = new TextView(localContext);
    this.m.setTextAppearance(localContext, aau.yO);
    this.m.setMaxLines(1);
    this.m.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.m);
    this.i = true;
    this.n = NumberFormat.getInstance();
    this.o = new gxq(pjy.a);
  }
  
  public final void D_()
  {
    this.i = true;
    if (this.f != null) {
      this.f.end();
    }
  }
  
  public final void a(int paramInt)
  {
    this.d = Math.max(0, paramInt);
    b();
    c();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    d();
    e();
    c();
  }
  
  public final void b()
  {
    if (this.d <= 0)
    {
      this.m.setVisibility(8);
      return;
    }
    this.m.setVisibility(0);
    this.m.setText(this.n.format(this.d));
    requestLayout();
  }
  
  public final void c()
  {
    Resources localResources = getResources();
    int i1;
    int i2;
    Object[] arrayOfObject;
    if (this.d > 0) {
      if (this.e)
      {
        i1 = efj.Gj;
        i2 = this.d;
        arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(this.d);
      }
    }
    for (String str = localResources.getQuantityString(i1, i2, arrayOfObject);; str = localResources.getString(efj.Gp))
    {
      setContentDescription(str);
      return;
      i1 = efj.Gi;
      break;
    }
  }
  
  public final void d()
  {
    GradientDrawable localGradientDrawable = (GradientDrawable)this.c.getBackground();
    if (this.e) {}
    for (int i1 = this.a;; i1 = this.b)
    {
      localGradientDrawable.setColor(i1);
      invalidate();
      return;
    }
  }
  
  public final void e()
  {
    ImageButton localImageButton = this.c;
    if (this.e) {}
    for (Drawable localDrawable = this.j;; localDrawable = this.k)
    {
      localImageButton.setImageDrawable(localDrawable);
      requestLayout();
      return;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.l.a(paramInt1, paramInt2, paramInt3, paramInt4, this, this.c, this.m);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.l.a(paramInt1, this, this.c, this.m);
    setMeasuredDimension(arrayOfInt[0], arrayOfInt[1]);
  }
  
  public final gxq v()
  {
    return this.o;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfh
 * JD-Core Version:    0.7.0.1
 */