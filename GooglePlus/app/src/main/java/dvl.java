import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

public abstract class dvl
  extends View
  implements kbb, lxj
{
  public static int a;
  public static int b;
  public static int c;
  public static int d;
  public static int e;
  private static boolean j;
  private static NinePatchDrawable k;
  private static Drawable l;
  private static int m;
  private static int n;
  private static int o;
  public final List<lwu> f = new ArrayList();
  public View.OnClickListener g;
  public Rect h;
  public boolean i = true;
  private lwu p;
  
  static
  {
    new Paint(2);
  }
  
  public dvl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!j)
    {
      j = true;
      Resources localResources = paramContext.getResources();
      k = (NinePatchDrawable)localResources.getDrawable(efj.ov);
      l = localResources.getDrawable(efj.qM);
      a = (int)localResources.getDimension(efj.kU);
      b = (int)localResources.getDimension(efj.kV);
      c = (int)localResources.getDimension(efj.kW);
      d = (int)localResources.getDimension(efj.kT);
      int i1 = (int)localResources.getDimension(efj.Zp);
      m = i1;
      n = i1 << 1;
      int i2 = (int)localResources.getDimension(efj.Zq);
      e = i2;
      o = i2 << 1;
      new Rect();
    }
    this.h = new Rect();
    setClickable(true);
    setFocusable(true);
  }
  
  public void D_()
  {
    e();
    this.f.clear();
    this.p = null;
    this.g = null;
    this.h.setEmpty();
    clearAnimation();
  }
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  protected abstract int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public final void ap_()
  {
    e();
  }
  
  public final void b()
  {
    if (lwo.a(this)) {
      d();
    }
  }
  
  protected void d() {}
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }
  
  protected void e() {}
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (lwo.a(this)) {
      d();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    e();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getWidth();
    int i2 = getHeight();
    int i8;
    int i4;
    int i3;
    int i5;
    if (this.i)
    {
      int i7 = m;
      i8 = e;
      i4 = n;
      i3 = o;
      i5 = i7;
    }
    for (int i6 = i8;; i6 = 0)
    {
      k.setBounds(this.h);
      k.draw(paramCanvas);
      a(paramCanvas, i5 + a, i6 + c, i1 - (i4 + a + b), i2 - (i3 + c + d));
      if (((isPressed()) || (isFocused())) && (this.p == null))
      {
        l.setBounds(0, 0, i1, i2);
        l.draw(paramCanvas);
      }
      return;
      i3 = 0;
      i4 = 0;
      i5 = 0;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    if (i2 <= 0) {
      i2 = i1;
    }
    int i6;
    int i5;
    int i4;
    int i3;
    if (this.i)
    {
      i6 = m;
      i5 = e;
      i4 = n;
      i3 = o;
    }
    for (;;)
    {
      setMeasuredDimension(i1, i2);
      this.h.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
      a(i6 + a, i5 + c, i1 - (i4 + a + b), i2 - (i3 + c + d));
      return;
      i3 = 0;
      i4 = 0;
      i5 = 0;
      i6 = 0;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      for (int i5 = -1 + this.f.size();; i5--) {
        if (i5 >= 0)
        {
          lwu locallwu = (lwu)this.f.get(i5);
          if (locallwu.a(i1, i2, 0)) {
            this.p = locallwu;
          }
        }
        else
        {
          invalidate();
          break;
        }
      }
      if (this.p != null)
      {
        this.p = null;
        setPressed(false);
        invalidate();
      }
      int i3 = -1 + this.f.size();
      boolean bool = false;
      for (int i4 = i3; i4 >= 0; i4--) {
        bool |= ((lwu)this.f.get(i4)).a(i1, i2, 1);
      }
      if ((!bool) && (this.g != null))
      {
        this.g.onClick(this);
        continue;
        if (this.p != null)
        {
          this.p.a(i1, i2, 3);
          this.p = null;
          invalidate();
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvl
 * JD-Core Version:    0.7.0.1
 */