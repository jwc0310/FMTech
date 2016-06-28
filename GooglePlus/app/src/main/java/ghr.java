import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.common.proguard.UsedByNative;

public final class ghr
  extends View
{
  public float a;
  public Bitmap b;
  public int c = 3;
  public int d = 3;
  public float e;
  boolean f;
  private final Paint g;
  private final Paint h;
  private final gfv i;
  private final Matrix j = new Matrix();
  private final RectF k = new RectF();
  private int l = ght.a;
  private final Matrix m = new Matrix();
  private final Matrix n = new Matrix();
  
  public ghr(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private ghr(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private ghr(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    setBackgroundColor(0);
    this.i = new gfv(paramContext, 0);
    this.i.d = true;
    this.g = new Paint();
    this.g.setAntiAlias(true);
    this.g.setFilterBitmap(true);
    this.h = new Paint(this.g);
    this.h.setColorFilter(new PorterDuffColorFilter(this.i.b, PorterDuff.Mode.SRC_OVER));
  }
  
  private static float a(float paramFloat)
  {
    if (paramFloat < 0.0F) {
      return paramFloat + 360 * (1 + (int)(paramFloat / 360.0F));
    }
    return paramFloat % 360.0F;
  }
  
  public static float a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 < 1.0F) {}
    for (double d1 = paramFloat1;; d1 = 1.0F / paramFloat1)
    {
      double d2 = Math.atan(d1);
      return (float)(Math.sin(3.141592653589793D - Math.toRadians(Math.abs(paramFloat2)) - d2) / Math.sin(d2));
    }
  }
  
  @UsedByNative
  private final float getIntermediateRotation()
  {
    return this.e;
  }
  
  @UsedByNative
  private final void setIntermediateRotation(float paramFloat)
  {
    this.e = paramFloat;
    invalidate();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    float f1 = 1.0F;
    if (this.b == null) {}
    int i2;
    int i3;
    int i4;
    int i5;
    Point localPoint1;
    int i6;
    int i7;
    Point localPoint2;
    label184:
    int i8;
    do
    {
      return;
      int i1 = this.i.c;
      i2 = paramInt1 - getPaddingLeft() - getPaddingRight() - i1;
      i3 = paramInt2 - getPaddingTop() - getPaddingBottom() - i1;
      if ((i2 <= 0) || (i3 <= 0))
      {
        this.k.setEmpty();
        this.j.reset();
        return;
      }
      i4 = this.b.getWidth();
      i5 = this.b.getHeight();
      localPoint1 = new Point();
      if ((i2 > 0) && (i3 > 0) && (i4 > 0) && (i5 > 0)) {
        break;
      }
      localPoint1.set(0, 0);
      i6 = this.b.getWidth();
      i7 = this.b.getHeight();
      localPoint2 = new Point();
      if ((i3 > 0) && (i2 > 0) && (i6 > 0) && (i7 > 0)) {
        break label524;
      }
      localPoint2.set(0, 0);
      localPoint1.x = Math.min(localPoint1.x, localPoint2.x);
      localPoint1.y = Math.min(localPoint1.y, localPoint2.y);
      this.k.set(0.0F, 0.0F, localPoint1.x, localPoint1.y);
      this.k.offsetTo((paramInt1 - localPoint1.x) / 2, (paramInt2 - localPoint1.y) / 2);
      float f2 = localPoint1.x / this.b.getWidth();
      this.j.setScale(f2, f2);
      this.j.postTranslate(this.k.left, this.k.top);
      i8 = this.l;
    } while (this.b == null);
    float f3 = this.b.getWidth() / 2.0F;
    float f4 = this.b.getHeight() / 2.0F;
    Matrix localMatrix = this.m;
    if ((i8 == ght.b) || (i8 == ght.d)) {}
    for (float f5 = -1.0F;; f5 = f1)
    {
      if ((i8 == ght.c) || (i8 == ght.d)) {
        f1 = -1.0F;
      }
      localMatrix.setScale(f5, f1, f3, f4);
      return;
      if ((i4 <= i2) && (i5 <= i3))
      {
        localPoint1.set(i4, i5);
        break;
      }
      if (i4 / i5 >= i2 / i3)
      {
        localPoint1.x = Math.min(i4, i2);
        localPoint1.y = (i5 * localPoint1.x / i4);
        break;
      }
      localPoint1.y = Math.min(i5, i3);
      localPoint1.x = (i4 * localPoint1.y / i5);
      break;
      label524:
      if ((i6 <= i3) && (i7 <= i2))
      {
        localPoint2.set(i6, i7);
        break label184;
      }
      if (i6 / i7 >= i3 / i2)
      {
        localPoint2.x = Math.min(i6, i3);
        localPoint2.y = (i7 * localPoint2.x / i6);
        break label184;
      }
      localPoint2.y = Math.min(i7, i2);
      localPoint2.x = (i6 * localPoint2.y / i7);
      break label184;
    }
  }
  
  public final boolean a(float paramFloat, boolean paramBoolean)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        if (!this.f)
        {
          float f1 = this.e;
          if (paramFloat != f1) {}
        }
        else
        {
          bool = false;
          return bool;
        }
        if (paramFloat % 90.0F != 0.0F) {
          throw new IllegalArgumentException("Rotation angle must be aligned to 90 degrees");
        }
      }
      finally {}
      if (paramBoolean) {
        break;
      }
      this.e = paramFloat;
      invalidate();
    }
    float f2 = a(this.e);
    float f3 = a(paramFloat);
    if (Math.abs(f2 - f3) > 180.0F)
    {
      if (f2 >= f3) {
        break label171;
      }
      f2 += 360.0F;
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this, "intermediateRotation", new float[] { f2, f3 });
      localObjectAnimator.setInterpolator(new DecelerateInterpolator());
      localObjectAnimator.addListener(new ghs(this, paramFloat));
      localObjectAnimator.start();
      break;
      label171:
      f3 += 360.0F;
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if ((this.b == null) || (this.k.isEmpty())) {
      return;
    }
    paramCanvas.rotate(this.e, this.k.centerX(), this.k.centerY());
    float f1 = this.b.getWidth() / 2.0F;
    float f2 = this.b.getHeight() / 2.0F;
    float f3 = a(this.b.getWidth() / this.b.getHeight(), -this.a);
    this.n.set(this.m);
    this.n.postScale(f3, f3, f1, f2);
    this.n.postRotate(-this.a, f1, f2);
    this.n.postConcat(this.j);
    paramCanvas.drawBitmap(this.b, this.n, this.h);
    paramCanvas.save();
    paramCanvas.clipRect(this.k);
    paramCanvas.drawBitmap(this.b, this.n, this.g);
    paramCanvas.restore();
    this.i.a(paramCanvas, this.k, this.c, this.d, gfv.a);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramInt3 - paramInt1, paramInt4 - paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghr
 * JD-Core Version:    0.7.0.1
 */