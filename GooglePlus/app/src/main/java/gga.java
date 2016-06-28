import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public final class gga
{
  private static final int[] b = { 16842913 };
  private static final int[] c = new int[0];
  private static final int d = efj.CD;
  public final int a;
  private final Drawable e;
  private final ColorStateList f;
  private final Paint g;
  private final ColorStateList h;
  private final ColorStateList i;
  private final Paint j = new Paint();
  private final RectF k = new RectF();
  private final Rect l;
  
  public gga(Context paramContext, int paramInt)
  {
    this.j.setAntiAlias(bool);
    this.j.setStyle(Paint.Style.STROKE);
    this.g = new Paint();
    this.g.setAntiAlias(bool);
    this.g.setStyle(Paint.Style.FILL);
    this.g.setTextAlign(Paint.Align.CENTER);
    this.l = new Rect();
    gge localgge = new gge(paramContext, gft.l, paramInt, d);
    int m = gft.m;
    this.e = localgge.a(m).getDrawable(m);
    if (this.e != null) {}
    while (!bool)
    {
      throw new IllegalStateException();
      bool = false;
    }
    int n = gft.p;
    this.a = localgge.a(n).getDimensionPixelSize(n, 0);
    int i1 = this.a / 2;
    this.e.setBounds(-i1, -i1, i1, i1);
    int i2 = gft.n;
    this.h = localgge.a(i2).getColorStateList(i2);
    int i3 = gft.o;
    this.i = localgge.a(i3).getColorStateList(i3);
    int i4 = gft.u;
    int i5 = localgge.a(i4).getDimensionPixelSize(i4, 0);
    this.j.setStrokeWidth(i5);
    this.k.set(-i1, -i1, i1, i1);
    this.k.inset(i5 / 2, i5 / 2);
    int i6 = gft.q;
    this.f = localgge.a(i6).getColorStateList(i6);
    Paint localPaint = this.g;
    int i7 = gft.s;
    localPaint.setTextSize(localgge.a(i7).getDimensionPixelSize(i7, 0));
    int i8 = gft.t;
    int i9 = localgge.a(i8).getInt(i8, -1);
    int i10;
    if (Build.VERSION.SDK_INT >= 16) {
      i10 = gft.r;
    }
    for (Typeface localTypeface = Typeface.create(localgge.a(i10).getString(i10), i9);; localTypeface = Typeface.create(Typeface.DEFAULT, i9))
    {
      this.g.setTypeface(localTypeface);
      localgge.a();
      return;
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2, RectF paramRectF)
  {
    paramRectF.set(this.e.getBounds());
    paramRectF.offset(paramFloat1, paramFloat2);
  }
  
  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, boolean paramBoolean, CharSequence paramCharSequence, float paramFloat3)
  {
    paramCanvas.save(1);
    paramCanvas.translate(paramFloat1, paramFloat2);
    int[] arrayOfInt;
    Paint localPaint;
    if (paramBoolean)
    {
      arrayOfInt = b;
      this.e.setState(arrayOfInt);
      this.e.draw(paramCanvas);
      if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
      {
        String str = Character.toString(paramCharSequence.charAt(0));
        this.g.setColor(this.f.getColorForState(arrayOfInt, -16711681));
        this.g.getTextBounds(str, 0, 1, this.l);
        paramCanvas.drawText(str, 0.0F, this.l.height() / 2, this.g);
      }
      if ((paramBoolean) && (paramFloat3 != 0.0F))
      {
        localPaint = this.j;
        if (paramFloat3 >= 0.0F) {
          break label198;
        }
      }
    }
    label198:
    for (int m = this.h.getDefaultColor();; m = this.i.getDefaultColor())
    {
      localPaint.setColor(m);
      paramCanvas.drawArc(this.k, -90.0F, paramFloat3 * 360.0F, false, this.j);
      paramCanvas.restore();
      return;
      arrayOfInt = c;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gga
 * JD-Core Version:    0.7.0.1
 */