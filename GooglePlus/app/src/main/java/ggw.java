import android.graphics.PointF;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;

public final class ggw
  extends ghp
{
  public ggx a;
  private ggy b;
  private final PointF c = new PointF();
  private final PointF d = new PointF();
  private float e;
  private float f;
  private int g = ggz.a;
  private float h;
  private float i;
  private float j;
  
  public ggw(ParameterOverlayView paramParameterOverlayView)
  {
    super(paramParameterOverlayView);
  }
  
  public final void a(ggy paramggy)
  {
    this.b = paramggy;
    if (this.b != null)
    {
      this.e = this.b.b();
      this.f = this.b.c();
      return;
    }
    this.e = 0.0F;
    this.f = 0.0F;
  }
  
  public final boolean d()
  {
    if ((this.a != null) && (this.g != ggz.a)) {
      this.a.b();
    }
    this.g = ggz.a;
    return true;
  }
  
  public final boolean d(float paramFloat1, float paramFloat2)
  {
    this.c.set(paramFloat1, paramFloat2);
    this.d.set(paramFloat1, paramFloat2);
    return true;
  }
  
  public final boolean e(float paramFloat1, float paramFloat2)
  {
    float f1 = paramFloat1 - this.d.x;
    float f2 = paramFloat2 - this.d.y;
    if (this.g == ggz.a)
    {
      float f9 = this.d.x;
      float f10 = this.d.y;
      if ((f9 - paramFloat1) * (f9 - paramFloat1) + (f10 - paramFloat2) * (f10 - paramFloat2) < 100.0F) {
        return true;
      }
    }
    int k;
    int i2;
    label112:
    float f3;
    int i1;
    label170:
    float f5;
    int n;
    float f6;
    label190:
    float f8;
    if (this.g == ggz.a)
    {
      k = 1;
      if (k != 0)
      {
        if (Math.abs(f1) <= Math.abs(f2)) {
          break label291;
        }
        i2 = ggz.b;
        this.g = i2;
      }
      if (this.g != ggz.c) {
        break label305;
      }
      f3 = this.c.y;
      if (this.n.getWidth() / 2 <= this.n.getWidth() - this.c.x) {
        break label299;
      }
      i1 = 1;
      f5 = 0.75F * this.n.getHeight();
      n = i1;
      f6 = paramFloat2;
      if (k == 0) {
        break label378;
      }
      this.j = f3;
      if (this.b == null) {
        break label372;
      }
      f8 = this.b.a();
      label217:
      this.i = f8;
      this.h = ((this.f - this.e) / f5);
      if (n != 0) {
        this.h = (-this.h);
      }
      if (this.a != null) {
        this.a.a();
      }
    }
    for (;;)
    {
      this.d.x = paramFloat1;
      this.d.y = paramFloat2;
      return true;
      k = 0;
      break;
      label291:
      i2 = ggz.c;
      break label112;
      label299:
      i1 = 0;
      break label170;
      label305:
      f3 = this.c.x;
      boolean bool = this.n.getHeight() / 2 < this.c.y;
      int m = 0;
      if (bool) {
        m = 1;
      }
      float f4 = 0.75F * this.n.getWidth();
      n = m;
      f5 = f4;
      f6 = paramFloat1;
      break label190;
      label372:
      f8 = 0.0F;
      break label217;
      label378:
      float f7 = efj.a(this.i + (f6 - this.j) * this.h, this.e, this.f);
      if ((Math.abs(f7 - this.i) >= 0.1F) && (this.a != null)) {
        this.a.a(f7);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggw
 * JD-Core Version:    0.7.0.1
 */