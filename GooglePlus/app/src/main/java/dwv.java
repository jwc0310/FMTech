import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

public final class dwv
  extends dwz
  implements View.OnClickListener, AdapterView.OnItemSelectedListener
{
  private static boolean i;
  private static int j;
  private static Drawable k;
  private static String l;
  private static Drawable m;
  private static String n;
  boolean a;
  boolean b;
  Spinner c;
  dww d;
  dwu e;
  dwb f;
  int g = -1;
  hxj h;
  private dwa o;
  
  public dwv(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!i)
    {
      Resources localResources = paramContext.getResources();
      j = localResources.getDimensionPixelSize(efj.lE);
      k = localResources.getDrawable(efj.qz);
      l = localResources.getString(aau.fS);
      m = localResources.getDrawable(efj.qy);
      n = localResources.getString(aau.fR);
      i = true;
    }
    this.c = new Spinner(paramContext);
    this.c.setLayoutParams(new dxa(-1, -2));
    addView(this.c);
    this.o = new dwa(paramContext, paramAttributeSet, paramInt);
    this.o.setOnClickListener(this);
    addView(this.o);
    setPadding(j, j, j, j);
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    if (!this.a) {}
    for (;;)
    {
      a(this.c, i1, 1073741824, 0, 0);
      a(this.c, 0, 0);
      if (!this.a) {
        break label149;
      }
      a(this.o, i1, 1073741824, this.c.getMeasuredHeight(), 1073741824);
      a(this.o, i1 + 0 + j, 0);
      this.o.setVisibility(0);
      if ((this.h == null) || (this.h.a == null) || (!this.b)) {
        break;
      }
      this.o.a(n, m);
      return;
      i1 = Math.max(0, (i1 - j) / 2);
    }
    this.o.a(l, k);
    return;
    label149:
    this.o.setVisibility(8);
  }
  
  public final void onClick(View paramView)
  {
    if ((this.f != null) && (paramView == this.o))
    {
      if (this.b) {
        this.f.E();
      }
    }
    else {
      return;
    }
    this.f.D();
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i1 = 2;
    int i2;
    if (this.g != paramInt)
    {
      if (this.g != -1) {
        break label91;
      }
      i2 = 1;
      if (i2 == 0) {}
      switch (paramInt)
      {
      default: 
        label56:
        this.g = paramInt;
        int i3 = this.g;
        if (i3 != 0) {
          break;
        }
      }
    }
    for (boolean bool = true;; bool = false)
    {
      this.a = bool;
      requestLayout();
      return;
      label91:
      i2 = 0;
      break;
      this.e.b(1);
      break label56;
      dwu localdwu = this.e;
      if (this.b) {}
      for (;;)
      {
        localdwu.b(i1);
        break;
        i1 = 6;
      }
      this.e.b(i1);
      break label56;
    }
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwv
 * JD-Core Version:    0.7.0.1
 */