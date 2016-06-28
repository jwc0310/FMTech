import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;

public final class dxf
  extends dxb
{
  private static boolean p;
  private static int q;
  private static int r;
  private static Paint s;
  public dxg o;
  
  public dxf(Context paramContext, AbsListView paramAbsListView, TextView paramTextView, View paramView, dxd paramdxd, dxc paramdxc)
  {
    super(paramContext, paramAbsListView, paramTextView, paramView, paramdxd, paramdxc);
    if (!p)
    {
      q = paramContext.getResources().getDimensionPixelSize(efj.lO);
      r = paramContext.getResources().getDimensionPixelSize(efj.lP);
      TextPaint localTextPaint = efj.B(paramContext, efj.yP);
      s = localTextPaint;
      localTextPaint.setTextAlign(Paint.Align.LEFT);
      p = true;
    }
  }
  
  public final void a()
  {
    super.a();
  }
  
  public final void a(int paramInt)
  {
    int i = this.k;
    super.a(paramInt);
    if (paramInt == i) {}
    for (;;)
    {
      return;
      if (this.o != null)
      {
        int j;
        if (paramInt == 2) {
          j = dxh.a;
        }
        while (j != 0)
        {
          this.o.a(j);
          return;
          if (i == 2)
          {
            j = dxh.b;
          }
          else
          {
            j = 0;
            if (paramInt == 1) {
              j = dxh.c;
            }
          }
        }
      }
    }
  }
  
  final void a(Canvas paramCanvas, String paramString)
  {
    if (s != null) {
      paramCanvas.drawText(paramString, q, r + s.getTextSize(), s);
    }
  }
  
  public final void a(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.a(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    return super.a(paramMotionEvent);
  }
  
  public final void b()
  {
    super.b();
  }
  
  public final boolean b(MotionEvent paramMotionEvent)
  {
    return super.b(paramMotionEvent);
  }
  
  public final boolean c()
  {
    return super.c();
  }
  
  public final void e()
  {
    this.h = "";
    super.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxf
 * JD-Core Version:    0.7.0.1
 */