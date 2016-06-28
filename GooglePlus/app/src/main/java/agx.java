import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

final class agx
  extends Drawable
{
  static agy b;
  private static double h = Math.cos(Math.toRadians(45.0D));
  final int a;
  Paint c;
  float d;
  float e;
  boolean f = true;
  boolean g = true;
  private Paint i;
  private Paint j;
  private RectF k;
  private Path l;
  private float m;
  private float n;
  private final int o;
  private final int p;
  private boolean q = false;
  
  agx(Resources paramResources, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.o = paramResources.getColor(efj.bp);
    this.p = paramResources.getColor(efj.bo);
    this.a = paramResources.getDimensionPixelSize(efj.bq);
    this.c = new Paint(5);
    this.c.setColor(paramInt);
    this.i = new Paint(5);
    this.i.setStyle(Paint.Style.FILL);
    this.d = ((int)(paramFloat1 + 0.5F));
    this.k = new RectF();
    this.j = new Paint(this.i);
    this.j.setAntiAlias(false);
    if ((paramFloat2 < 0.0F) || (paramFloat3 < 0.0F)) {
      throw new IllegalArgumentException("invalid shadow size");
    }
    float f1 = a(paramFloat2);
    float f2 = a(paramFloat3);
    if (f1 > f2)
    {
      if (!this.q) {
        this.q = true;
      }
      f1 = f2;
    }
    if ((this.n != f1) || (this.e != f2))
    {
      this.n = f1;
      this.e = f2;
      this.m = ((int)(0.5F + (f1 * 1.5F + this.a)));
      this.f = true;
      invalidateSelf();
    }
  }
  
  static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (float)(1.5F * paramFloat1 + (1.0D - h) * paramFloat2);
    }
    return 1.5F * paramFloat1;
  }
  
  private static int a(float paramFloat)
  {
    int i1 = (int)(0.5F + paramFloat);
    if (i1 % 2 == 1) {
      i1--;
    }
    return i1;
  }
  
  static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramFloat1 = (float)(paramFloat1 + (1.0D - h) * paramFloat2);
    }
    return paramFloat1;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    float f1;
    float f2;
    int i2;
    if (this.f)
    {
      Rect localRect = getBounds();
      float f3 = 1.5F * this.e;
      this.k.set(localRect.left + this.e, f3 + localRect.top, localRect.right - this.e, localRect.bottom - f3);
      RectF localRectF1 = new RectF(-this.d, -this.d, this.d, this.d);
      RectF localRectF2 = new RectF(localRectF1);
      localRectF2.inset(-this.m, -this.m);
      if (this.l == null)
      {
        this.l = new Path();
        this.l.setFillType(Path.FillType.EVEN_ODD);
        this.l.moveTo(-this.d, 0.0F);
        this.l.rLineTo(-this.m, 0.0F);
        this.l.arcTo(localRectF2, 180.0F, 90.0F, false);
        this.l.arcTo(localRectF1, 270.0F, -90.0F, false);
        this.l.close();
        float f4 = this.d / (this.d + this.m);
        Paint localPaint1 = this.i;
        float f5 = this.d + this.m;
        int[] arrayOfInt1 = new int[3];
        arrayOfInt1[0] = this.o;
        arrayOfInt1[i1] = this.o;
        arrayOfInt1[2] = this.p;
        float[] arrayOfFloat = new float[3];
        arrayOfFloat[0] = 0.0F;
        arrayOfFloat[i1] = f4;
        arrayOfFloat[2] = 1.0F;
        localPaint1.setShader(new RadialGradient(0.0F, 0.0F, f5, arrayOfInt1, arrayOfFloat, Shader.TileMode.CLAMP));
        Paint localPaint2 = this.j;
        float f6 = -this.d + this.m;
        float f7 = -this.d - this.m;
        int[] arrayOfInt2 = new int[3];
        arrayOfInt2[0] = this.o;
        arrayOfInt2[i1] = this.o;
        arrayOfInt2[2] = this.p;
        localPaint2.setShader(new LinearGradient(0.0F, f6, 0.0F, f7, arrayOfInt2, new float[] { 0.0F, 0.5F, 1.0F }, Shader.TileMode.CLAMP));
        this.j.setAntiAlias(false);
        this.f = false;
      }
    }
    else
    {
      paramCanvas.translate(0.0F, this.n / 2.0F);
      f1 = -this.d - this.m;
      f2 = this.d + this.a + this.n / 2.0F;
      if (this.k.width() - f2 * 2.0F <= 0.0F) {
        break label895;
      }
      i2 = i1;
      label493:
      if (this.k.height() - f2 * 2.0F <= 0.0F) {
        break label901;
      }
    }
    for (;;)
    {
      int i3 = paramCanvas.save();
      paramCanvas.translate(f2 + this.k.left, f2 + this.k.top);
      paramCanvas.drawPath(this.l, this.i);
      if (i2 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.k.width() - f2 * 2.0F, -this.d, this.j);
      }
      paramCanvas.restoreToCount(i3);
      int i4 = paramCanvas.save();
      paramCanvas.translate(this.k.right - f2, this.k.bottom - f2);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.l, this.i);
      if (i2 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.k.width() - f2 * 2.0F, -this.d + this.m, this.j);
      }
      paramCanvas.restoreToCount(i4);
      int i5 = paramCanvas.save();
      paramCanvas.translate(f2 + this.k.left, this.k.bottom - f2);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.l, this.i);
      if (i1 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.k.height() - f2 * 2.0F, -this.d, this.j);
      }
      paramCanvas.restoreToCount(i5);
      int i6 = paramCanvas.save();
      paramCanvas.translate(this.k.right - f2, f2 + this.k.top);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.l, this.i);
      if (i1 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.k.height() - f2 * 2.0F, -this.d, this.j);
      }
      paramCanvas.restoreToCount(i6);
      paramCanvas.translate(0.0F, -this.n / 2.0F);
      b.a(paramCanvas, this.k, this.d, this.c);
      return;
      this.l.reset();
      break;
      label895:
      i2 = 0;
      break label493;
      label901:
      i1 = 0;
    }
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    int i1 = (int)Math.ceil(a(this.e, this.d, this.g));
    int i2 = (int)Math.ceil(b(this.e, this.d, this.g));
    paramRect.set(i2, i1, i2, i1);
    return true;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.f = true;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.c.setAlpha(paramInt);
    this.i.setAlpha(paramInt);
    this.j.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.c.setColorFilter(paramColorFilter);
    this.i.setColorFilter(paramColorFilter);
    this.j.setColorFilter(paramColorFilter);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agx
 * JD-Core Version:    0.7.0.1
 */