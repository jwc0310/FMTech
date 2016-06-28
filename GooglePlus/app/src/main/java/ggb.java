import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

public final class ggb
  extends gfx
{
  private static final int a = efj.CE;
  private final int b;
  private final int c;
  private final int d;
  private final gga e;
  private final Drawable f;
  private final Paint g;
  private final Rect h = new Rect();
  private final boolean i;
  
  public ggb(Context paramContext, int paramInt)
  {
    this.i = ghv.b(paramContext);
    this.e = new gga(paramContext, paramInt);
    gge localgge = new gge(paramContext, gft.v, paramInt, a);
    int j = gft.w;
    this.f = localgge.a(j).getDrawable(j);
    if (this.f != null) {}
    for (boolean bool2 = bool1; !bool2; bool2 = false) {
      throw new IllegalStateException();
    }
    int k = gft.z;
    float f1 = localgge.a(k).getDimensionPixelSize(k, 0);
    int m = gft.y;
    ColorStateList localColorStateList = localgge.a(m).getColorStateList(m);
    this.g = new Paint();
    this.g.setAntiAlias(bool1);
    this.g.setColor(localColorStateList.getDefaultColor());
    this.g.setTextSize(f1);
    int n = gft.C;
    int i1 = localgge.a(n).getColor(n, -1);
    int i2 = gft.F;
    int i3 = localgge.a(i2).getDimensionPixelSize(i2, 0);
    if (Color.alpha(i1) != 0) {}
    for (;;)
    {
      if ((bool1) && (i3 > 0))
      {
        Paint localPaint = this.g;
        float f2 = i3;
        int i7 = gft.D;
        float f3 = localgge.a(i7).getDimensionPixelOffset(i7, 0);
        int i8 = gft.E;
        localPaint.setShadowLayer(f2, f3, localgge.a(i8).getDimensionPixelOffset(i8, 0), i1);
      }
      int i4 = gft.A;
      this.c = localgge.a(i4).getDimensionPixelSize(i4, 0);
      int i5 = gft.x;
      this.b = localgge.a(i5).getDimensionPixelSize(i5, 0);
      int i6 = gft.B;
      this.d = localgge.a(i6).getDimensionPixelSize(i6, 0);
      localgge.a();
      return;
      bool1 = false;
    }
  }
  
  protected final gfy a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    this.g.getTextBounds(paramCharSequence1.toString(), 0, paramCharSequence1.length(), this.h);
    gfy localgfy = new gfy(paramCharSequence1, this.h, null);
    localgfy.a.set(0, 0, this.e.a, this.e.a);
    return localgfy;
  }
  
  protected final gfz a(List<gfy> paramList)
  {
    if (paramList.isEmpty()) {
      return gfz.a;
    }
    Iterator localIterator1 = paramList.iterator();
    for (int j = 0; localIterator1.hasNext(); j = Math.max(j, ((gfy)localIterator1.next()).c.width())) {}
    int k = this.e.a;
    int m = this.e.a;
    ggc localggc = new ggc(paramList);
    localggc.f.set(0, 0, k + (this.b << 1), (m + this.c) * paramList.size() - this.c + (this.b << 1));
    localggc.c.set(localggc.f);
    localggc.d = localggc.f.centerX();
    localggc.c.right = (j + (localggc.c.centerX() + this.d) + this.b);
    Rect localRect = new Rect(0, 0, k, m);
    localRect.offsetTo(this.b, this.b);
    Iterator localIterator2 = paramList.iterator();
    while (localIterator2.hasNext())
    {
      ((gfy)localIterator2.next()).a.set(localRect);
      localRect.offset(0, m + this.c);
    }
    return localggc;
  }
  
  public final void a(Canvas paramCanvas, gfz paramgfz, int paramInt1, int paramInt2)
  {
    if (paramgfz.b.isEmpty()) {
      return;
    }
    paramCanvas.save(1);
    ggc localggc = (ggc)paramgfz;
    paramCanvas.translate(paramInt1 - localggc.d, paramInt2 - localggc.f.centerY() - paramgfz.e);
    this.f.setBounds(localggc.f);
    this.f.draw(paramCanvas);
    Object localObject1 = null;
    int j = 0;
    float f1 = 0.0F;
    if (j < paramgfz.b.size())
    {
      Object localObject2 = (gfy)paramgfz.b.get(j);
      f1 = Math.max(f1, this.g.measureText(((gfy)localObject2).b, 0, ((gfy)localObject2).b.length()));
      if (paramgfz.a(j)) {}
      for (;;)
      {
        j++;
        localObject1 = localObject2;
        break;
        this.e.a(paramCanvas, ((gfy)localObject2).a.centerX(), ((gfy)localObject2).a.centerY(), false, ((gfy)localObject2).b, 0.0F);
        localObject2 = localObject1;
      }
    }
    int k;
    float f2;
    int m;
    Paint.Align localAlign;
    if (localObject1 != null)
    {
      paramCanvas.restore();
      paramCanvas.save(1);
      paramCanvas.translate(paramInt1, paramInt2);
      this.e.a(paramCanvas, 0.0F, 0.0F, true, localObject1.b, 0.0F);
      k = paramCanvas.getWidth();
      f2 = paramInt1;
      m = Math.round(f1 + 3 * this.d / 2);
      if (!this.i) {
        break label360;
      }
      if (f2 - m < 0.0F) {
        break label352;
      }
      localAlign = Paint.Align.LEFT;
      if (localAlign != Paint.Align.RIGHT) {
        break label389;
      }
      this.g.setTextAlign(Paint.Align.LEFT);
      paramCanvas.drawText(localObject1.b, 0, localObject1.b.length(), this.d, localObject1.d / 2.0F, this.g);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      label352:
      localAlign = Paint.Align.RIGHT;
      break;
      label360:
      if (f2 + m < k)
      {
        localAlign = Paint.Align.RIGHT;
        break;
      }
      localAlign = Paint.Align.LEFT;
      break;
      label389:
      this.g.setTextAlign(Paint.Align.RIGHT);
      paramCanvas.drawText(localObject1.b, 0, localObject1.b.length(), -this.d, localObject1.d / 2.0F, this.g);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggb
 * JD-Core Version:    0.7.0.1
 */