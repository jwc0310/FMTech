import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;

public final class gfv
{
  public static final int[] a = new int[0];
  private static final int e = efj.CC;
  public final int b;
  public int c;
  public boolean d;
  private final int f;
  private final ColorStateList g;
  private final float h;
  private final ColorStateList i;
  private final float j;
  private final Paint k;
  private final Paint l;
  private final Paint m;
  private final Paint n;
  private final Paint o;
  private final RectF p = new RectF();
  private final Path q = new Path();
  
  public gfv(Context paramContext, int paramInt)
  {
    gge localgge = new gge(paramContext, gft.a, paramInt, e);
    int i1 = gft.i;
    this.f = localgge.a(i1).getInt(i1, -1);
    int i2 = gft.g;
    ColorStateList localColorStateList = localgge.a(i2).getColorStateList(i2);
    int i3 = gft.h;
    float f1 = localgge.a(i3).getDimensionPixelSize(i3, 0);
    int i4 = gft.c;
    this.g = localgge.a(i4).getColorStateList(i4);
    int i5 = gft.f;
    this.h = localgge.a(i5).getDimensionPixelSize(i5, 0);
    int i6 = gft.d;
    this.i = localgge.a(i6).getColorStateList(i6);
    int i7 = gft.e;
    this.j = localgge.a(i7).getDimensionPixelSize(i7, 0);
    int i8 = gft.b;
    this.b = localgge.a(i8).getColorStateList(i8).getDefaultColor();
    localgge.a();
    this.m = new Paint();
    this.m.setAntiAlias(true);
    this.m.setStyle(Paint.Style.STROKE);
    this.m.setStrokeWidth(this.h);
    this.m.setStrokeJoin(Paint.Join.MITER);
    this.n = new Paint(this.m);
    this.k = new Paint(this.m);
    this.k.setStrokeWidth(f1);
    this.k.setColor(localColorStateList.getDefaultColor());
    this.l = new Paint();
    this.l.setStyle(Paint.Style.STROKE);
    this.l.setStrokeWidth(f1 * 2.0F);
    this.l.setColor(1325400064);
    this.c = ((int)Math.ceil(Math.max(this.h, f1) / 2.0F));
    this.o = new Paint();
    this.o.setColor(this.b);
  }
  
  private static int a(ColorStateList paramColorStateList, int[] paramArrayOfInt)
  {
    int i1 = paramColorStateList.getDefaultColor();
    if (paramArrayOfInt != null) {
      i1 = paramColorStateList.getColorForState(paramArrayOfInt, i1);
    }
    return i1;
  }
  
  private final void a(Canvas paramCanvas, RectF paramRectF, int paramInt1, int paramInt2, Paint paramPaint)
  {
    float f1 = this.h / 2.0F;
    float f2 = paramRectF.width() / paramInt2;
    float f3 = paramRectF.height() / paramInt1;
    for (int i1 = 1; i1 <= -1 + Math.max(paramInt1, paramInt2); i1++)
    {
      if (i1 < paramInt1)
      {
        float f5 = paramRectF.top + f3 * i1;
        paramCanvas.drawLine(f1 + paramRectF.left, f5, paramRectF.right - f1, f5, paramPaint);
      }
      if (i1 < paramInt2)
      {
        float f4 = paramRectF.left + f2 * i1;
        paramCanvas.drawLine(f4, f1 + paramRectF.top, f4, paramRectF.bottom - f1, paramPaint);
      }
    }
  }
  
  public final void a(Canvas paramCanvas, RectF paramRectF, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramRectF.width() < 1.0F) || (paramRectF.height() < 1.0F)) {}
    do
    {
      int i1;
      int i2;
      float f3;
      do
      {
        do
        {
          return;
          i1 = Math.max(paramInt1, 1);
          i2 = Math.max(paramInt2, 1);
          if (this.f == 1) {
            break;
          }
          a(paramCanvas, paramRectF, i1, i2, this.l);
          a(paramCanvas, paramRectF, i1, i2, this.k);
          this.m.setColor(this.g.getDefaultColor());
          paramCanvas.drawRect(paramRectF, this.m);
        } while (this.d);
        this.n.setColor(this.i.getDefaultColor());
        float f1 = this.h;
        float f2 = this.h / 2.0F;
        paramCanvas.drawLine(f1 + paramRectF.left, f1 + paramRectF.top - f2 + this.j, f1 + paramRectF.left, f1 + paramRectF.top - f2, this.n);
        paramCanvas.drawLine(f1 + paramRectF.left - f2, f1 + paramRectF.top, f1 + paramRectF.left - f2 + this.j, f1 + paramRectF.top, this.n);
        paramCanvas.drawLine(paramRectF.right - f1, f1 + paramRectF.top - f2 + this.j, paramRectF.right - f1, f1 + paramRectF.top - f2, this.n);
        paramCanvas.drawLine(f2 + (paramRectF.right - f1), f1 + paramRectF.top, f2 + (paramRectF.right - f1) - this.j, f1 + paramRectF.top, this.n);
        paramCanvas.drawLine(paramRectF.right - f1, f2 + (paramRectF.bottom - f1) - this.j, paramRectF.right - f1, f2 + (paramRectF.bottom - f1), this.n);
        paramCanvas.drawLine(f2 + (paramRectF.right - f1), paramRectF.bottom - f1, f2 + (paramRectF.right - f1) - this.j, paramRectF.bottom - f1, this.n);
        paramCanvas.drawLine(f1 + paramRectF.left, f2 + (paramRectF.bottom - f1) - this.j, f1 + paramRectF.left, f2 + (paramRectF.bottom - f1), this.n);
        paramCanvas.drawLine(f1 + paramRectF.left - f2, paramRectF.bottom - f1, f1 + paramRectF.left - f2 + this.j, paramRectF.bottom - f1, this.n);
        f3 = this.h;
        if (paramRectF.height() >= 3.0F * this.j)
        {
          float f5 = paramRectF.centerY();
          paramCanvas.drawLine(f3 + paramRectF.left, f5 - this.j / 2.0F, f3 + paramRectF.left, f5 + this.j / 2.0F, this.n);
          paramCanvas.drawLine(paramRectF.right - f3, f5 - this.j / 2.0F, paramRectF.right - f3, f5 + this.j / 2.0F, this.n);
        }
      } while (paramRectF.width() < 3.0F * this.j);
      float f4 = paramRectF.centerX();
      paramCanvas.drawLine(f4 - this.j / 2.0F, f3 + paramRectF.top, f4 + this.j / 2.0F, f3 + paramRectF.top, this.n);
      paramCanvas.drawLine(f4 - this.j / 2.0F, paramRectF.bottom - f3, f4 + this.j / 2.0F, paramRectF.bottom - f3, this.n);
      return;
      this.p.set(paramRectF);
      this.p.inset(this.h / 2.0F, this.h / 2.0F);
      a(paramCanvas, this.p, i1, i2, this.k);
      this.m.setColor(a(this.g, paramArrayOfInt));
      paramCanvas.drawRect(this.p, this.m);
    } while (this.d);
    this.n.setColor(a(this.i, paramArrayOfInt));
    RectF localRectF = this.p;
    this.q.reset();
    this.q.moveTo(localRectF.left, localRectF.top + this.j);
    this.q.lineTo(localRectF.left, localRectF.top);
    this.q.lineTo(localRectF.left + this.j, localRectF.top);
    this.q.moveTo(localRectF.right - this.j, localRectF.top);
    this.q.lineTo(localRectF.right, localRectF.top);
    this.q.lineTo(localRectF.right, localRectF.top + this.j);
    this.q.moveTo(localRectF.right, localRectF.bottom - this.j);
    this.q.lineTo(localRectF.right, localRectF.bottom);
    this.q.lineTo(localRectF.right - this.j, localRectF.bottom);
    this.q.moveTo(localRectF.left + this.j, localRectF.bottom);
    this.q.lineTo(localRectF.left, localRectF.bottom);
    this.q.lineTo(localRectF.left, localRectF.bottom - this.j);
    paramCanvas.drawPath(this.q, this.n);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfv
 * JD-Core Version:    0.7.0.1
 */