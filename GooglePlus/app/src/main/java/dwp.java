import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.ArrayList;

public class dwp
  extends dwz
  implements View.OnClickListener
{
  private static int j;
  private static Paint k;
  private static float l;
  private static int m;
  private static int n;
  private static boolean o;
  View a;
  View b;
  View c;
  View d;
  boolean e;
  int f;
  dwq g;
  private int h;
  private int i;
  
  public dwp(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void a(int paramInt) {}
  
  protected void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    if (!o)
    {
      Resources localResources = paramContext.getResources();
      m = localResources.getDimensionPixelSize(efj.lD);
      n = localResources.getDimensionPixelSize(efj.lC);
      j = localResources.getDimensionPixelSize(efj.lL);
      Paint localPaint = new Paint();
      k = localPaint;
      localPaint.setColor(localResources.getColor(efj.ju));
      k.setStrokeWidth(localResources.getDimension(efj.lK));
      l = k.getStrokeWidth();
      o = true;
    }
    this.g = new dwq(paramContext, paramAttributeSet, paramInt);
    this.g.setLayoutParams(new dxa(0, 0));
    addView(this.g);
    this.a = new View(paramContext, paramAttributeSet, paramInt);
    this.a.setLayoutParams(new dxa(0, 0));
    this.a.setClickable(true);
    this.a.setVisibility(8);
    this.a.setOnClickListener(this);
    this.b = new View(paramContext, paramAttributeSet, paramInt);
    this.b.setLayoutParams(new dxa(0, 0));
    this.b.setClickable(true);
    this.b.setVisibility(8);
    this.b.setOnClickListener(this);
    this.a.setBackgroundDrawable(getResources().getDrawable(efj.qN));
    this.b.setBackgroundDrawable(getResources().getDrawable(efj.qN));
    addView(this.a);
    addView(this.b);
    setWillNotDraw(false);
  }
  
  public final void a(String paramString1, String paramString2, View paramView1, View paramView2)
  {
    b();
    this.c = paramView1;
    this.d = paramView2;
    if (this.c != null) {
      addView(this.c);
    }
    if (this.d != null) {
      addView(this.d);
    }
    dwq localdwq = this.g;
    ArrayList localArrayList = new ArrayList();
    if (paramString1 == null) {}
    for (;;)
    {
      localdwq.a(paramString2, localArrayList);
      return;
      localArrayList.add(paramString2);
      paramString2 = paramString1;
    }
  }
  
  public final void b()
  {
    if (this.c != null)
    {
      removeView(this.c);
      this.c = null;
    }
    if (this.d != null)
    {
      removeView(this.d);
      this.d = null;
    }
    dwq localdwq = this.g;
    localdwq.a.setText(null);
    for (int i1 = -1 + localdwq.b.size(); i1 >= 0; i1--) {
      localdwq.removeView((View)localdwq.b.get(i1));
    }
    localdwq.c = 0;
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.a) {
      a(0);
    }
    while (paramView != this.b) {
      return;
    }
    a(1);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.e) {
      paramCanvas.drawLine(0.0F, 0.0F, this.i, 0.0F, k);
    }
    int i1 = Math.round(this.h - l);
    paramCanvas.drawLine(0.0F, i1, this.i, i1, k);
    if ((this.d != null) && (this.d.getVisibility() != 8))
    {
      int i2 = this.i - this.f;
      paramCanvas.drawLine(i2, 0.0F, i2, i1, k);
    }
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    if (this.e) {}
    for (int i3 = (int)(0.0F + l);; i3 = 0)
    {
      int i5;
      int i4;
      if (this.c != null)
      {
        a(this.c, i1, -2147483648, 0, 0);
        int i11 = Math.max(2 * j + this.c.getMeasuredWidth(), m);
        a(this.c, 0, i3);
        b(this.c, i11, 0);
        i5 = i11 + 0;
        i4 = i1 - i11;
      }
      for (;;)
      {
        int i10;
        int i6;
        if ((this.d != null) && (this.d.getVisibility() != 8))
        {
          a(this.d, i4, -2147483648, 0, 0);
          this.f = Math.max(2 * j + this.d.getMeasuredWidth(), m);
          a(this.d, i1 - this.f, i3);
          b(this.d, this.f, 0);
          i10 = this.f + (int)k.getStrokeWidth();
          i6 = i4 - i10;
        }
        for (int i7 = i10;; i7 = 0)
        {
          a(this.g, i6, -2147483648, i2, 0);
          a(this.g, i5, i3);
          View[] arrayOfView = new View[3];
          arrayOfView[0] = this.d;
          arrayOfView[1] = this.c;
          arrayOfView[2] = this.g;
          int i8 = Math.max(n, a(arrayOfView) + (j << 1));
          a(i8, arrayOfView);
          int i9 = i3 + i8;
          if (this.a.getVisibility() != 8)
          {
            a(this.a, 0, i3);
            a(this.a, i1 - i7, 1073741824, i9, 1073741824);
          }
          if (this.b.getVisibility() != 8)
          {
            a(this.b, i1 - i7, i3);
            a(this.b, i7, 1073741824, i9, 1073741824);
          }
          this.h = ((int)(i9 + l));
          this.i = i1;
          setMeasuredDimension(i1, this.h);
          return;
          i6 = i4;
        }
        i4 = i1;
        i5 = 0;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwp
 * JD-Core Version:    0.7.0.1
 */