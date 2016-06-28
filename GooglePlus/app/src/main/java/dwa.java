import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;

public final class dwa
  extends dwz
{
  private static int c;
  private TextView a;
  private ImageView b;
  private boolean d;
  
  public dwa(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!this.d)
    {
      c = paramContext.getResources().getDimensionPixelSize(efj.lj);
      this.d = true;
    }
    setClickable(true);
    setFocusable(true);
    setWillNotDraw(false);
    setBackgroundDrawable(getResources().getDrawable(efj.qN));
    this.a = new TextView(paramContext, paramAttributeSet, efj.yi);
    addView(this.a);
    this.b = new ImageView(paramContext, paramAttributeSet, paramInt);
    addView(this.b);
  }
  
  public final void a(String paramString, Drawable paramDrawable)
  {
    this.b.setBackgroundDrawable(paramDrawable);
    this.a.setText(paramString);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    a(this.b, Math.max(0, i), -2147483648, j, 0);
    a(this.b, 0, 0);
    int k = 0 + (this.b.getMeasuredWidth() + c);
    a(this.a, Math.max(0, i - k), -2147483648, j, 0);
    a(this.a, k, 0);
    int m = k + this.a.getMeasuredWidth();
    View[] arrayOfView1 = new View[2];
    arrayOfView1[0] = this.b;
    arrayOfView1[1] = this.a;
    a(j, arrayOfView1);
    int n = (i - m) / 2;
    View[] arrayOfView2 = new View[2];
    arrayOfView2[0] = this.a;
    arrayOfView2[1] = this.b;
    for (int i1 = Math.max(1, 0); i1 >= 0; i1--)
    {
      View localView = arrayOfView2[i1];
      dxa localdxa = (dxa)localView.getLayoutParams();
      if (localdxa != null)
      {
        localdxa.a = (n + localdxa.a);
        localdxa.b = (0 + localdxa.b);
        localView.setLayoutParams(localdxa);
      }
    }
    setMeasuredDimension(resolveSize(i, paramInt1), resolveSize(j, paramInt2));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwa
 * JD-Core Version:    0.7.0.1
 */