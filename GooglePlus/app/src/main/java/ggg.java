import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ggg
  extends ggm
{
  private float A;
  private float B;
  private boolean C;
  private final PointF D = new PointF();
  private final PointF E = new PointF();
  public int a = ggl.a;
  public ggi b;
  public ggj c;
  public final List<ggk> d = new ArrayList();
  public ggk e;
  public boolean f;
  private ggd p;
  private int q;
  private gga r;
  private gfu s;
  private final float t;
  private int u = -1;
  private boolean v = true;
  private boolean w;
  private boolean x;
  private float y;
  private float z;
  
  public ggg(ParameterOverlayView paramParameterOverlayView)
  {
    this(paramParameterOverlayView, 0);
  }
  
  private ggg(ParameterOverlayView paramParameterOverlayView, int paramInt)
  {
    super(paramParameterOverlayView, 0);
    Resources localResources = paramParameterOverlayView.getResources();
    Context localContext = this.n.getContext();
    TypedArray localTypedArray = this.n.getContext().obtainStyledAttributes(0, gft.j);
    this.q = localTypedArray.getInt(gft.k, 0);
    localTypedArray.recycle();
    this.p = new ggd(localResources);
    this.r = new gga(localContext, 0);
    this.s = new gfu(localResources);
    this.B = ghv.a(localContext).b;
    this.B *= this.B;
    this.t = (Math.max(this.r.a, this.r.a) / 2);
  }
  
  private void a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      ggk localggk = (ggk)localIterator.next();
      if (localggk != this.e) {
        a(paramCanvas, localggk, false, false, paramInt1, paramInt2);
      }
    }
  }
  
  private void a(Canvas paramCanvas, ggk paramggk, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence = this.b.W();
    if (paramBoolean1) {
      this.r.a(paramCanvas, paramggk.b.x, paramggk.b.y, true, localCharSequence, 0.0F);
    }
    for (;;)
    {
      if ((paramBoolean1) && (paramBoolean2) && (this.b != null))
      {
        float f1 = this.b.c(paramggk.a);
        float f2 = paramInt1;
        float f3 = paramInt2;
        float f4 = (float)(Math.hypot(f2, f3) * f1);
        if (f4 >= this.t) {
          this.p.a(paramCanvas, paramggk.b.x, paramggk.b.y, f4 / 2.0F, this.q);
        }
      }
      return;
      this.r.a(paramCanvas, paramggk.b.x, paramggk.b.y, false, localCharSequence, 0.0F);
    }
  }
  
  private static boolean a(float paramFloat)
  {
    return (paramFloat >= 0.0F) && (paramFloat <= 1.0F);
  }
  
  private final boolean a(RectF paramRectF, float paramFloat1, float paramFloat2)
  {
    if (this.c == null) {}
    float f1;
    float f2;
    do
    {
      return false;
      f1 = paramFloat1 / paramRectF.width();
      f2 = paramFloat2 / paramRectF.height();
    } while ((!a(f1)) || (!a(f2)));
    Object localObject1 = this.c.a(f1, f2);
    ggk localggk1 = this.e;
    this.e = new ggk(localObject1);
    this.e.b.x = paramFloat1;
    this.e.b.y = paramFloat2;
    this.d.add(this.e);
    ggj localggj = this.c;
    if (localggk1 != null) {}
    for (Object localObject2 = localggk1.a;; localObject2 = null)
    {
      ggk localggk2 = this.e;
      Object localObject3 = null;
      if (localggk2 != null) {
        localObject3 = localggk2.a;
      }
      localggj.a(localObject2, localObject3);
      a(ggl.b);
      this.n.invalidate();
      return true;
    }
  }
  
  private boolean a(ggk paramggk)
  {
    if (this.e == paramggk) {
      return false;
    }
    Object localObject1;
    if (this.c != null)
    {
      ggj localggj = this.c;
      ggk localggk = this.e;
      if (localggk != null)
      {
        localObject1 = localggk.a;
        Object localObject2 = null;
        if (paramggk != null) {
          localObject2 = paramggk.a;
        }
        localggj.a(localObject1, localObject2);
      }
    }
    else
    {
      this.e = paramggk;
      if (this.e != null) {
        break label102;
      }
    }
    label102:
    for (int i = ggl.a;; i = ggl.b)
    {
      a(i);
      this.n.invalidate();
      return true;
      localObject1 = null;
      break;
    }
  }
  
  private boolean f(float paramFloat1, float paramFloat2)
  {
    RectF localRectF = this.n.b();
    if (localRectF.isEmpty()) {}
    ggk localggk;
    do
    {
      return true;
      float f1 = paramFloat1 - localRectF.left;
      float f2 = paramFloat2 - localRectF.top;
      localggk = g(f1, f2);
      if ((this.a == ggl.c) && (localggk == null)) {
        return a(localRectF, f1, f2);
      }
    } while ((a(localggk)) || (localggk != null));
    if (this.c != null)
    {
      localRectF.width();
      localRectF.height();
      return false;
    }
    return false;
  }
  
  private ggk g(float paramFloat1, float paramFloat2)
  {
    Object localObject1 = null;
    float f1 = 3.4028235E+38F;
    Iterator localIterator = this.d.iterator();
    Object localObject2;
    float f5;
    if (localIterator.hasNext())
    {
      ggk localggk = (ggk)localIterator.next();
      float f2 = localggk.b.x;
      float f3 = localggk.b.y;
      float f4 = (f2 - paramFloat1) * (f2 - paramFloat1) + (f3 - paramFloat2) * (f3 - paramFloat2);
      if ((f4 >= this.B) || (f4 >= f1)) {
        break label119;
      }
      localObject2 = localggk;
      f5 = f4;
    }
    for (;;)
    {
      f1 = f5;
      localObject1 = localObject2;
      break;
      return localObject1;
      label119:
      f5 = f1;
      localObject2 = localObject1;
    }
  }
  
  protected final gfx a(Context paramContext, int paramInt)
  {
    return new ggb(paramContext, paramInt);
  }
  
  public final void a(Canvas paramCanvas)
  {
    RectF localRectF1 = this.n.b();
    if ((localRectF1 == null) || (localRectF1.isEmpty())) {
      return;
    }
    if (this.f)
    {
      this.d.clear();
      this.e = null;
      if (this.b != null)
      {
        RectF localRectF2 = this.n.b();
        int k = 0;
        if (k < this.b.V())
        {
          Object localObject1 = this.b.g(k);
          PointF localPointF1 = this.b.b(localObject1);
          ggk localggk1 = new ggk(localObject1);
          PointF localPointF2 = localggk1.b;
          if (localPointF2 == null) {
            localPointF2 = new PointF();
          }
          localPointF2.set(localRectF2.width() * localPointF1.x, localRectF2.height() * localPointF1.y);
          this.d.add(localggk1);
          ggj localggj;
          ggk localggk2;
          if (this.b.d(localObject1))
          {
            this.e = localggk1;
            if (this.c != null)
            {
              localggj = this.c;
              localggk2 = this.e;
              if (localggk2 == null) {
                break label238;
              }
            }
          }
          label238:
          for (Object localObject2 = localggk2.a;; localObject2 = null)
          {
            localggj.a(null, localObject2);
            k++;
            break;
          }
        }
      }
      this.f = false;
    }
    paramCanvas.save(1);
    paramCanvas.translate(localRectF1.left, localRectF1.top);
    int i = (int)Math.ceil(localRectF1.width());
    int j = (int)Math.ceil(localRectF1.height());
    a(paramCanvas, i, j);
    if (this.e != null)
    {
      if (!this.k) {
        break label351;
      }
      this.i.a(paramCanvas, this.j, (int)this.e.b.x, (int)this.e.b.y);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      label351:
      if (!this.C) {
        a(paramCanvas, this.e, true, this.w, i, j);
      }
    }
  }
  
  protected final void a(Rect paramRect, Point paramPoint)
  {
    if (this.e != null)
    {
      paramPoint.set(Math.round(this.e.b.x), Math.round(this.e.b.y));
      paramPoint.offset(paramRect.left, paramRect.top);
      return;
    }
    paramPoint.set(paramRect.centerX(), paramRect.centerY());
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.w == paramBoolean) {
      return;
    }
    this.w = paramBoolean;
    this.n.invalidate();
  }
  
  public final boolean a()
  {
    if (!this.x) {}
    do
    {
      return false;
      this.x = false;
    } while (this.e == null);
    this.n.invalidate();
    return true;
  }
  
  public final boolean a(float paramFloat1, float paramFloat2)
  {
    if ((this.u == -1) || (this.e == null) || (this.b == null)) {
      return false;
    }
    this.x = true;
    RectF localRectF = this.n.b();
    float f1 = localRectF.width();
    float f2 = localRectF.height();
    this.A = (1.33F * (float)(Math.hypot(f1, f2) * 1.0F));
    this.y = this.b.c(this.e.a);
    this.z = paramFloat1;
    this.n.invalidate();
    return true;
  }
  
  public final boolean a(int paramInt)
  {
    if (this.a == paramInt) {
      return false;
    }
    this.a = paramInt;
    if (this.c != null) {
      this.c.d(this.a);
    }
    return true;
  }
  
  public final boolean a(int paramInt, float paramFloat1, float paramFloat2)
  {
    return f(paramFloat1, paramFloat2);
  }
  
  public final boolean b()
  {
    if (c())
    {
      int i = ggl.c;
      if (i != ggl.a) {
        if (this.a != i) {
          if (!a(i)) {
            break label49;
          }
        }
      }
      label49:
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label54;
        }
        return true;
        i = ggl.a;
        break;
      }
    }
    label54:
    return false;
  }
  
  public final boolean b(float paramFloat1, float paramFloat2)
  {
    if ((!this.x) || (this.e == null)) {
      return false;
    }
    this.n.invalidate();
    return true;
  }
  
  public final boolean c()
  {
    return this.d.size() < 8;
  }
  
  public final boolean c(float paramFloat1, float paramFloat2)
  {
    return f(paramFloat1, paramFloat2);
  }
  
  public final boolean d()
  {
    if (!this.C) {
      return super.d();
    }
    this.C = false;
    this.n.invalidate();
    return true;
  }
  
  public final boolean d(float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    super.d(paramFloat1, paramFloat2);
    if (this.c == null) {
      return false;
    }
    RectF localRectF = this.n.b();
    float f1 = paramFloat1 - localRectF.left;
    float f2 = paramFloat2 - localRectF.top;
    ggk localggk = g(f1, f2);
    switch (ggh.a[(-1 + this.a)])
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      if ((this.C) && (this.e != null))
      {
        this.E.set(this.e.b);
        this.D.set(paramFloat1, paramFloat2);
        this.n.invalidate();
      }
      return bool;
      if (localggk != null) {
        break;
      }
      a(localRectF, f1, f2);
      this.C = this.v;
      continue;
      if (localggk == null) {
        break;
      }
      a(localggk);
      this.C = this.v;
    }
  }
  
  public final boolean e(float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    if ((!this.C) || (this.e == null)) {
      bool = super.e(paramFloat1, paramFloat2);
    }
    RectF localRectF;
    do
    {
      do
      {
        return bool;
        localRectF = this.n.b();
      } while (localRectF.isEmpty());
      this.e.b.x = efj.a(paramFloat1 + this.E.x - this.D.x, 0.0F, localRectF.width());
      this.e.b.y = efj.a(paramFloat2 + this.E.y - this.D.y, 0.0F, localRectF.height());
    } while (this.c == null);
    float f1 = this.e.b.x / localRectF.width();
    float f2 = this.e.b.y / localRectF.height();
    this.c.a(this.e.a, f1, f2);
    return bool;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggg
 * JD-Core Version:    0.7.0.1
 */