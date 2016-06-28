import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public final class dvq
  implements kbb, lwu
{
  private static Paint d;
  public final Rect a;
  public hdf b;
  public boolean c;
  private final View e;
  private final RectF f;
  private final String g;
  private final String h;
  private final String i;
  private kaz j;
  private CharSequence k;
  private final String l;
  private final int m;
  private final int n;
  
  public dvq(View paramView, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramView, paramString1, paramString2, null, null, 2);
  }
  
  public dvq(View paramView, String paramString1, String paramString2, String paramString3, hdf paramhdf, int paramInt)
  {
    this(paramView, paramString1, paramString2, paramString3, null, paramhdf, paramInt, 1);
  }
  
  private dvq(View paramView, String paramString1, String paramString2, String paramString3, String paramString4, hdf paramhdf, int paramInt1, int paramInt2)
  {
    this.e = paramView;
    Context localContext = paramView.getContext();
    this.a = new Rect();
    this.f = new RectF();
    this.b = paramhdf;
    this.g = paramString1;
    this.i = null;
    this.h = paramString3;
    Resources localResources = localContext.getResources();
    int i1 = aau.cv;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.h;
    this.k = localResources.getString(i1, arrayOfObject);
    this.l = paramString2;
    this.m = paramInt1;
    this.n = 1;
    if (d == null)
    {
      Paint localPaint = new Paint();
      d = localPaint;
      localPaint.setAntiAlias(true);
      d.setStrokeWidth(4.0F);
      d.setColor(localContext.getApplicationContext().getResources().getColor(efj.jp));
      d.setStyle(Paint.Style.STROKE);
    }
  }
  
  public final Rect a()
  {
    return this.a;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.set(paramInt1, paramInt2, paramInt3, paramInt4);
    this.f.set(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(Canvas paramCanvas)
  {
    switch (this.n)
    {
    default: 
      return;
    case 0: 
      paramCanvas.drawRect(this.a, d);
      return;
    case 1: 
      paramCanvas.drawCircle(this.a.centerX(), this.a.centerY(), this.a.width() / 2, d);
      return;
    }
    float f1 = efj.o(this.e.getContext());
    paramCanvas.drawRoundRect(this.f, f1, f1, d);
  }
  
  public final void a(kaz paramkaz)
  {
    this.e.invalidate();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == 3)
    {
      this.c = false;
      return true;
    }
    if (!this.a.contains(paramInt1, paramInt2))
    {
      if (paramInt3 == 1) {
        this.c = false;
      }
      return false;
    }
    switch (paramInt3)
    {
    default: 
    case 0: 
      for (;;)
      {
        return true;
        this.c = true;
      }
    }
    if (this.c)
    {
      if (this.b == null) {
        break label105;
      }
      this.b.a(this.g);
    }
    for (;;)
    {
      this.c = false;
      break;
      label105:
      hdf localhdf = (hdf)mbb.b(this.e.getContext(), hdf.class);
      if (localhdf != null) {
        localhdf.a(this.g);
      }
    }
  }
  
  public final void ap_()
  {
    if (this.j != null)
    {
      this.j.b(this);
      this.j = null;
    }
  }
  
  public final CharSequence ay_()
  {
    return this.k;
  }
  
  public final void b()
  {
    this.j = ((hdg)mbb.a(this.e.getContext(), hdg.class)).a(this.e.getContext(), this.l, this.m, this.n, this);
  }
  
  public final Bitmap d()
  {
    if ((this.j != null) && (this.j.q == 1)) {
      return (Bitmap)this.j.p;
    }
    return null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append(" gaia id: ").append(this.g);
    localStringBuilder.append(" name: ").append(this.h);
    if (this.e != null)
    {
      localStringBuilder.append(" view: ").append(this.e);
      localStringBuilder.append(" context: ").append(this.e.getContext());
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvq
 * JD-Core Version:    0.7.0.1
 */