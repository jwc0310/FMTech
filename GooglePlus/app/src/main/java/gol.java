import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public final class gol
  extends LinearLayout
{
  public static int a;
  public static int b;
  private static int h = -1;
  public final View c;
  public final TextView d;
  public boolean e;
  public boolean f = true;
  public boolean g;
  private final int i;
  private final int j;
  private final int k;
  private ImageView l;
  
  public gol(Context paramContext, gom paramgom)
  {
    super(paramContext);
    Resources localResources = getResources();
    if (h == -1)
    {
      h = localResources.getDimensionPixelSize(efj.DT);
      a = localResources.getDimensionPixelSize(efj.DU);
      b = localResources.getDimensionPixelSize(efj.DW);
    }
    setOrientation(0);
    this.d = new TextView(paramContext);
    this.d.setMaxLines(1);
    this.d.setEllipsize(TextUtils.TruncateAt.END);
    this.c = paramgom.a();
    boolean bool;
    if (this.c != null)
    {
      bool = true;
      this.g = bool;
      this.i = paramgom.c();
      this.j = 1;
      this.f = paramgom.f();
      this.k = paramgom.d();
      if (this.g)
      {
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(h, h);
        addView(this.c, localLayoutParams);
      }
      this.d.setContentDescription(paramgom.e());
      this.d.setText(paramgom.b());
      this.d.setTextAppearance(paramContext, this.k);
      this.d.setGravity(16);
      a();
      addView(this.d);
      if (this.j != 1) {
        break label333;
      }
      setBackgroundResource(efj.Ej);
    }
    for (;;)
    {
      ((GradientDrawable)getBackground()).setColor(this.i);
      LayoutTransition localLayoutTransition = new LayoutTransition();
      localLayoutTransition.setDuration(150L);
      localLayoutTransition.setStartDelay(0, 0L);
      localLayoutTransition.setStartDelay(1, 0L);
      localLayoutTransition.setStartDelay(4, 0L);
      localLayoutTransition.setStartDelay(2, 0L);
      localLayoutTransition.setStartDelay(3, 0L);
      setLayoutTransition(localLayoutTransition);
      return;
      bool = false;
      break;
      label333:
      if (this.j != 2) {
        break label351;
      }
      setBackgroundResource(efj.Ek);
    }
    label351:
    throw new IllegalArgumentException("drawableItem.getShape() returned an invalid value");
  }
  
  @TargetApi(17)
  public final void a()
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 16;
    if (this.g) {}
    for (int m = b / 2;; m = b)
    {
      localLayoutParams.setMargins(m, a, b, a);
      if (Build.VERSION.SDK_INT >= 17)
      {
        localLayoutParams.setMarginStart(m);
        localLayoutParams.setMarginEnd(b);
      }
      this.d.setLayoutParams(localLayoutParams);
      return;
    }
  }
  
  public final View b()
  {
    if (this.l == null)
    {
      this.l = new ImageView(getContext());
      this.l.setImageResource(efj.Ei);
      this.l.setColorFilter(this.d.getCurrentTextColor(), PorterDuff.Mode.SRC_ATOP);
      this.l.setScaleType(ImageView.ScaleType.FIT_CENTER);
      int m = getResources().getDimensionPixelSize(efj.DS);
      this.l.setPadding(m, m, m, m);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(h, h);
      this.l.setLayoutParams(localLayoutParams);
    }
    return this.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gol
 * JD-Core Version:    0.7.0.1
 */