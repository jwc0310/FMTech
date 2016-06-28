import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

public final class gfw
  extends gfx
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private final Drawable e;
  private final Drawable f;
  private final Drawable g;
  private final Paint h;
  private final Paint i;
  private final Rect j = new Rect();
  private final Rect k = new Rect();
  
  public gfw(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    this.h = new Paint();
    this.h.setColor(localResources.getColor(efj.Cw));
    this.h.setAntiAlias(true);
    float f1 = localResources.getDimensionPixelSize(aau.xt);
    this.h.setTextSize(f1);
    this.h.setTextAlign(Paint.Align.CENTER);
    this.i = new Paint(this.h);
    this.i.setColor(localResources.getColor(efj.Cx));
    this.e = localResources.getDrawable(efj.CB);
    this.f = localResources.getDrawable(efj.Cz);
    this.g = localResources.getDrawable(efj.CA);
    this.a = localResources.getDimensionPixelOffset(aau.xv);
    this.b = localResources.getDimensionPixelOffset(aau.xw);
    this.c = localResources.getDimensionPixelOffset(aau.xu);
    this.d = localResources.getDimensionPixelOffset(aau.xs);
  }
  
  private final void a(Canvas paramCanvas, CharSequence paramCharSequence, boolean paramBoolean, Rect paramRect, float paramFloat)
  {
    if (paramBoolean)
    {
      this.f.setBounds(paramRect);
      this.f.draw(paramCanvas);
    }
    for (Paint localPaint = this.h;; localPaint = this.i)
    {
      paramCanvas.drawText(paramCharSequence, 0, paramCharSequence.length(), paramRect.centerX(), paramRect.centerY() + paramFloat / 2.0F, localPaint);
      return;
      this.e.setBounds(paramRect);
      this.e.draw(paramCanvas);
    }
  }
  
  protected final gfy a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    String str = paramCharSequence1.toString();
    this.h.getTextBounds(str, 0, str.length(), this.j);
    gfy localgfy = new gfy(str, this.j, paramCharSequence2);
    localgfy.a.set(this.j);
    localgfy.a.offset(-localgfy.a.left, 0);
    Rect localRect1 = localgfy.a;
    localRect1.right += (this.a << 1);
    Rect localRect2 = localgfy.a;
    localRect2.top -= this.b;
    Rect localRect3 = localgfy.a;
    localRect3.bottom += this.b;
    return localgfy;
  }
  
  protected final gfz a(List<gfy> paramList)
  {
    if (paramList.isEmpty()) {
      return gfz.a;
    }
    Iterator localIterator1 = paramList.iterator();
    int m = 0;
    int n = 0;
    while (localIterator1.hasNext())
    {
      gfy localgfy = (gfy)localIterator1.next();
      n = Math.max(n, localgfy.a.width());
      m = Math.max(m, localgfy.a.height());
    }
    gfz localgfz = new gfz(paramList);
    localgfz.c.set(0, 0, n + (this.d << 1), (m + this.c) * paramList.size() - this.c + (this.d << 1));
    localgfz.d = localgfz.c.centerX();
    Rect localRect = new Rect(0, 0, n, m);
    localRect.offsetTo(this.d, this.d);
    Iterator localIterator2 = paramList.iterator();
    while (localIterator2.hasNext())
    {
      ((gfy)localIterator2.next()).a.set(localRect);
      localRect.offset(0, m + this.c);
    }
    return localgfz;
  }
  
  public final void a(Canvas paramCanvas, gfz paramgfz, int paramInt1, int paramInt2)
  {
    if (paramgfz.b.isEmpty()) {
      return;
    }
    paramCanvas.save();
    paramCanvas.translate(paramInt1 - paramgfz.c.width() / 2, paramInt2 - paramgfz.c.height() / 2 - paramgfz.e);
    this.g.setBounds(paramgfz.c);
    this.g.draw(paramCanvas);
    Object localObject1 = null;
    int m = 0;
    if (m < paramgfz.b.size())
    {
      Object localObject2 = (gfy)paramgfz.b.get(m);
      if (paramgfz.a(m)) {}
      for (;;)
      {
        m++;
        localObject1 = localObject2;
        break;
        a(paramCanvas, ((gfy)localObject2).b, false, ((gfy)localObject2).a, ((gfy)localObject2).d);
        localObject2 = localObject1;
      }
    }
    if (localObject1 != null)
    {
      paramCanvas.restore();
      paramCanvas.save();
      this.k.set(localObject1.a);
      this.k.offsetTo(paramInt1 - this.k.width() / 2, paramInt2 - this.k.height() / 2);
      a(paramCanvas, localObject1.b, true, this.k, localObject1.d);
    }
    paramCanvas.restore();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfw
 * JD-Core Version:    0.7.0.1
 */