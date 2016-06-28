import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class dwr
  extends dwz
  implements View.OnClickListener
{
  private static int e;
  private static boolean f;
  private static int g;
  private static float h;
  private static int i;
  private static String j;
  public dwb a;
  public dws b;
  public TextView c;
  public boolean d;
  
  public dwr(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!f)
    {
      Resources localResources = paramContext.getResources();
      e = localResources.getDimensionPixelSize(efj.lG);
      g = localResources.getColor(efj.kn);
      j = localResources.getString(aau.fT);
      h = localResources.getDimension(efj.nK);
      i = localResources.getDimensionPixelSize(efj.lI);
      f = true;
    }
    this.b = new dws(paramContext, paramAttributeSet, paramInt);
    addView(this.b);
    this.c = new TextView(paramContext, paramAttributeSet, paramInt);
    addView(this.c);
    this.c.setText(j);
    this.c.setTextSize(0, h);
    this.c.setTextColor(g);
    this.c.setGravity(17);
    this.c.setClickable(true);
    this.c.setOnClickListener(this);
    this.c.setBackgroundDrawable(getResources().getDrawable(efj.qN));
    a(0, 0, 0, e);
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int k = View.MeasureSpec.getSize(paramInt1);
    dws localdws;
    int m;
    if (!this.d)
    {
      localdws = this.b;
      if (localdws.e <= 0) {
        break label98;
      }
      int i1 = 0 + e;
      a(localdws, k, 1073741824, 0, 0);
      a(localdws, 0, 0);
      m = i1 + localdws.getMeasuredHeight();
      localdws.setVisibility(0);
    }
    for (;;)
    {
      int n = m + 0;
      a(this.c, k, 1073741824, i, 1073741824);
      a(this.c, 0, n);
      return;
      label98:
      localdws.setVisibility(8);
      m = 0;
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView == this.c) && (this.a != null)) {
      this.a.C();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwr
 * JD-Core Version:    0.7.0.1
 */