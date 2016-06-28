import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;

public final class lpc
  extends ViewGroup
  implements View.OnClickListener, View.OnLongClickListener, lxj
{
  public boolean a;
  public String b;
  public boolean c;
  public int d;
  public CirclesButton e;
  public CirclesButton f;
  public lpd g;
  private final loj h;
  private lxi i;
  private Path j;
  private Paint k;
  private int l;
  private final lwj m;
  private final int n;
  
  public lpc(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    int i1 = ((git)mbb.a(localContext, git.class)).c();
    this.h = loj.a(localContext);
    setClickable(false);
    this.k = new Paint();
    this.k.setColor(getResources().getColor(da.au));
    this.k.setStyle(Paint.Style.FILL_AND_STROKE);
    this.k.setStrokeWidth(1.0F);
    this.k.setAntiAlias(true);
    this.j = new Path();
    this.m = ((lwj)mbb.a(localContext, lwj.class));
    boolean bool = ((hul)mbb.a(localContext, hul.class)).a(i1);
    this.e = new CirclesButton(localContext);
    this.e.b(bool);
    this.e.a(5);
    this.e.a(getResources().getString(do.ar));
    this.e.setContentDescription(getResources().getString(do.al));
    this.f = new CirclesButton(localContext);
    this.f.b(bool);
    this.f.a(2);
    this.n = localContext.getResources().getInteger(aau.CT);
    setWillNotDraw(false);
  }
  
  public final void D_()
  {
    setClickable(false);
    this.a = false;
    this.b = null;
    this.i = null;
    this.l = 0;
  }
  
  public final void onClick(View paramView)
  {
    if (this.g == null) {}
    do
    {
      return;
      if (paramView == this.e)
      {
        this.g.n();
        return;
      }
    } while (paramView != this.f);
    this.g.o();
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getWidth();
    int i2 = getHeight() - this.h.m;
    int i3 = this.h.m;
    if (this.c) {}
    for (ShapeDrawable localShapeDrawable = this.h.ag;; localShapeDrawable = this.h.af)
    {
      localShapeDrawable.getPaint().setColor(getResources().getColor(da.au));
      localShapeDrawable.setBounds(0, 0, i1, i2);
      localShapeDrawable.draw(paramCanvas);
      if (this.i != null)
      {
        int i4 = 0 + (i2 - this.i.getHeight()) / 2;
        paramCanvas.translate(i3, i4);
        this.i.draw(paramCanvas);
        paramCanvas.translate(-i3, -i4);
        this.i.a(i3, i4);
      }
      paramCanvas.drawLine(0.0F, this.l, i1 + 0, this.l, this.h.u);
      if (!this.a) {
        paramCanvas.drawPath(this.j, this.k);
      }
      return;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i3;
    int i4;
    if (this.a)
    {
      int i1 = paramInt3 - paramInt1;
      int i2 = paramInt4 - paramInt2;
      i3 = i1 - this.h.m;
      i4 = (i2 - this.h.aV - this.e.getMeasuredHeight()) / 2;
      if (this.e.getVisibility() == 0) {
        this.e.layout(i3 - this.e.getMeasuredWidth(), i4, i3, i4 + this.e.getMeasuredHeight());
      }
    }
    else
    {
      return;
    }
    this.f.layout(i3 - this.f.getMeasuredWidth(), i4, i3, i4 + this.f.getMeasuredHeight());
  }
  
  public final boolean onLongClick(View paramView)
  {
    if (this.g == null) {}
    while ((paramView != this.e) && (paramView != this.f)) {
      return false;
    }
    return this.g.p();
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = i1 - this.h.m - this.h.m;
    if (this.a) {
      i2 -= this.d + this.h.m;
    }
    TextPaint localTextPaint = efj.B(getContext(), aw.ei);
    boolean bool = TextUtils.isEmpty(this.b);
    int i3 = 0;
    if (!bool)
    {
      lwj locallwj = this.m;
      String str = this.b;
      int i10 = this.n;
      Point localPoint = new Point();
      lxi locallxi = (lxi)locallwj.a(0, 0, i2, 0, null, null, 0, str, localPoint, localTextPaint, true, i10, true, null);
      locallxi.a(localPoint.x, localPoint.y);
      this.i = locallxi;
      i3 = this.i.getHeight();
    }
    int i4 = i3 + 3 * this.h.m;
    this.l = (i4 - this.h.m);
    if (!this.a)
    {
      int i5 = i1 - this.h.m - this.h.m / 2;
      int i6 = i5 - this.h.aU;
      int i7 = i6 + (i5 - i6) / 2;
      int i8 = this.l - (int)this.h.u.getStrokeWidth();
      int i9 = i8 + this.h.aV;
      this.j.setFillType(Path.FillType.EVEN_ODD);
      this.j.moveTo(i6, i8);
      this.j.lineTo(i5, i8);
      this.j.lineTo(i7, i9);
      this.j.lineTo(i6, i8);
      this.j.close();
    }
    setMeasuredDimension(i1, i4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpc
 * JD-Core Version:    0.7.0.1
 */