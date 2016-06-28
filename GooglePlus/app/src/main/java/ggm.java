import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.TypedValue;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import java.util.ArrayList;
import java.util.List;

public class ggm
  extends ghp
{
  private boolean A;
  private float B;
  private float C;
  private final float a;
  private float b = 1.333F;
  private int c;
  private float d;
  private float e;
  private float f;
  public ggq g;
  public ggp h;
  final gfx i;
  gfz j = gfz.a;
  boolean k;
  public final SparseArray<ggr> l = new SparseArray();
  private final float p;
  private int q = ggo.a;
  private float r;
  private float s;
  private Number t;
  private final ggr u = new ggr();
  private final Point v = new Point();
  private ggr w;
  private final PointF x = new PointF();
  private final PointF y = new PointF();
  private final Rect z = new Rect();
  
  public ggm(ParameterOverlayView paramParameterOverlayView)
  {
    this(paramParameterOverlayView, 0);
  }
  
  public ggm(ParameterOverlayView paramParameterOverlayView, int paramInt)
  {
    super(paramParameterOverlayView);
    Context localContext = this.n.getContext();
    this.i = a(localContext, paramInt);
    float f1 = ghv.a(localContext).a;
    this.p = (f1 * f1);
    this.a = TypedValue.applyDimension(1, 1.0F, localContext.getResources().getDisplayMetrics());
  }
  
  protected gfx a(Context paramContext, int paramInt)
  {
    return new gfw(paramContext);
  }
  
  public void a(Canvas paramCanvas)
  {
    super.a(paramCanvas);
    if (this.k)
    {
      a(this.n.a(), this.v);
      this.i.a(paramCanvas, this.j, this.v.x, this.v.y);
    }
  }
  
  public final void a(Rect paramRect)
  {
    Rect localRect = this.n.a();
    if (localRect == null)
    {
      paramRect.setEmpty();
      return;
    }
    this.j.a(localRect.centerX(), localRect.centerY(), paramRect);
  }
  
  protected void a(Rect paramRect, Point paramPoint)
  {
    paramPoint.set(paramRect.centerX(), paramRect.centerY());
  }
  
  public boolean d()
  {
    switch (ggn.a[(-1 + this.q)])
    {
    }
    for (;;)
    {
      this.q = ggo.a;
      this.n.invalidate();
      return false;
      if (this.k)
      {
        this.k = false;
        continue;
        int m = this.c;
        this.w = null;
        if ((this.h != null) && (m >= 0)) {
          this.h.b(m);
        }
      }
    }
  }
  
  public boolean d(float paramFloat1, float paramFloat2)
  {
    this.x.set(paramFloat1, paramFloat2);
    this.y.set(paramFloat1, paramFloat2);
    return false;
  }
  
  public boolean e(float paramFloat1, float paramFloat2)
  {
    if ((this.g == null) || (this.g.a() == 0)) {}
    float f1;
    float f2;
    float f5;
    float f6;
    do
    {
      return false;
      f1 = paramFloat1 - this.y.x;
      f2 = paramFloat2 - this.y.y;
      if (this.q != ggo.a) {
        break;
      }
      f5 = this.y.x;
      f6 = this.y.y;
    } while ((f5 - paramFloat1) * (f5 - paramFloat1) + (f6 - paramFloat2) * (f6 - paramFloat2) < this.p);
    int m;
    int i5;
    label131:
    boolean bool;
    label188:
    gfx localgfx;
    ggq localggq;
    int i3;
    label221:
    gfz localgfz;
    if (this.q == ggo.a)
    {
      m = 1;
      if (m != 0)
      {
        if (Math.abs(f1) <= Math.abs(f2)) {
          break label364;
        }
        i5 = ggo.b;
        this.q = i5;
      }
      if (this.q != ggo.c) {
        break label745;
      }
      if (m == 0) {
        break label454;
      }
      int i2 = this.g.a();
      this.c = this.g.b();
      if ((this.c < 0) || (i2 <= 1)) {
        break label372;
      }
      bool = true;
      this.k = bool;
      if (this.k)
      {
        localgfx = this.i;
        localggq = this.g;
        if (localggq != null) {
          break label378;
        }
        i3 = 0;
        if (i3 > 0) {
          break label388;
        }
        localgfz = gfz.a;
        label231:
        this.j = localgfz;
        this.d = this.j.b(this.c);
        this.e = this.j.b(0);
        this.f = this.j.b(i2 - 1);
        this.j.a(this.d);
        a(this.n.a(), this.v);
        this.j.a(this.v.x, this.v.y, this.z);
        this.n.invalidate();
      }
    }
    for (;;)
    {
      this.y.x = paramFloat1;
      this.y.y = paramFloat2;
      return true;
      m = 0;
      break;
      label364:
      i5 = ggo.c;
      break label131;
      label372:
      bool = false;
      break label188;
      label378:
      i3 = localggq.a();
      break label221;
      label388:
      ArrayList localArrayList = new ArrayList(i3);
      for (int i4 = 0; i4 < i3; i4++) {
        localArrayList.add(localgfx.a(localggq.b(i4), localggq.a(i4)));
      }
      localgfz = localgfx.a(localArrayList);
      break label231;
      label454:
      if (this.k)
      {
        float f4 = efj.a(this.d + this.y.y - paramFloat2, this.e, this.f);
        if (f4 != this.d)
        {
          a(this.n.a(), this.v);
          this.j.a(this.v.x, this.v.y, this.z);
          Rect localRect1 = this.z;
          localRect1.right = (1 + localRect1.right);
          Rect localRect5;
          if (this.d > f4)
          {
            Rect localRect4 = this.z;
            localRect4.top = (-2 + localRect4.top);
            localRect5 = this.z;
          }
          Rect localRect3;
          for (localRect5.bottom = ((int)(localRect5.bottom + (2.0D + Math.ceil(this.d - f4))));; localRect3.bottom = (2 + localRect3.bottom))
          {
            this.d = f4;
            int i1 = this.j.a(this.d);
            if ((i1 >= 0) && (i1 != this.c))
            {
              this.c = i1;
              if (this.h != null) {
                this.h.c(this.c);
              }
            }
            this.n.invalidate();
            break;
            Rect localRect2 = this.z;
            localRect2.top = ((int)(localRect2.top + (Math.ceil(this.d - f4) - 2.0D)));
            localRect3 = this.z;
          }
          label745:
          if (m != 0)
          {
            if (this.g != null)
            {
              this.c = this.g.b();
              if (this.c >= 0)
              {
                this.A = ghv.b(this.n.getContext());
                Number localNumber1 = (Number)this.g.c(this.c);
                Number localNumber2 = (Number)this.g.d(this.c);
                this.r = localNumber1.floatValue();
                this.s = localNumber2.floatValue();
                this.w = ((ggr)this.l.get(this.c));
                if (this.w == null)
                {
                  this.u.a(this.r, this.s, this.n.getWidth(), this.b);
                  this.w = this.u;
                }
                this.t = ((Number)this.g.e(this.c));
                this.B = this.t.floatValue();
                this.C = this.x.x;
                int n = this.c;
                if (this.h != null) {
                  this.h.a(n);
                }
              }
            }
          }
          else if ((this.c >= 0) && (Math.abs(this.C - paramFloat1) >= this.a))
          {
            float f3 = this.w.a(this.A, this.B, this.C, paramFloat1);
            this.C = paramFloat1;
            if (f3 != this.B)
            {
              this.B = f3;
              this.t = Float.valueOf(f3);
              if (this.h != null) {
                this.h.c(this.c, Float.valueOf(f3));
              }
            }
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggm
 * JD-Core Version:    0.7.0.1
 */