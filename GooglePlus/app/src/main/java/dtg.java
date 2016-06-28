import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.StaticLayout;

public final class dtg
  extends lov
{
  lmb a;
  private final lwj i = (lwj)mbb.a(getContext(), lwj.class);
  private final Rect j = new Rect();
  private final Point k = new Point();
  private StaticLayout l;
  
  public dtg(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void D_()
  {
    super.D_();
    this.l = null;
    this.j.setEmpty();
    this.k.set(0, 0);
  }
  
  protected final int a(Context paramContext, int paramInt1, int paramInt2)
  {
    int m = paramInt2 - 2 * this.b.m;
    if (this.a.d) {}
    for (int n = efj.Bu;; n = efj.Bk)
    {
      this.l = this.i.a(0, 0, m, 0, this.b.ai, this.j, this.b.n, paramContext.getResources().getString(n), this.k, efj.B(paramContext, aau.xl), true);
      return paramInt1 + Math.max(this.b.ai.getHeight(), this.l.getHeight());
    }
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    int m = paramInt1 + this.b.m;
    this.b.E.set(this.j);
    this.b.E.offset(m, paramInt2);
    paramCanvas.drawBitmap(this.b.ai, null, this.b.E, this.b.F);
    paramCanvas.translate(m + this.k.x, paramInt2 + this.k.y);
    this.l.draw(paramCanvas);
    paramCanvas.translate(-m - this.k.x, -paramInt2 - this.k.y);
    return paramInt2 + Math.max(this.b.ai.getHeight(), this.l.getHeight());
  }
  
  protected final String d()
  {
    return this.a.b;
  }
  
  protected final String e()
  {
    return null;
  }
  
  protected final String f()
  {
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtg
 * JD-Core Version:    0.7.0.1
 */