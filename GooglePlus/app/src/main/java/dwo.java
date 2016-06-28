import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class dwo
  extends dwz
  implements View.OnClickListener, lxx
{
  private static boolean h;
  private static int i;
  private static int j;
  private static int k;
  private static Paint l;
  public TextView a;
  public dwt b;
  public dwk c;
  public dwj d;
  public dwy e;
  public TextView f;
  public dwb g;
  
  public dwo(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!h)
    {
      Resources localResources = paramContext.getResources();
      k = localResources.getDimensionPixelSize(efj.lL);
      Paint localPaint = new Paint();
      l = localPaint;
      localPaint.setColor(localResources.getColor(efj.ju));
      l.setStrokeWidth(localResources.getDimension(efj.lK));
      i = localResources.getColor(efj.ko);
      j = localResources.getDimensionPixelSize(efj.nK);
      h = true;
    }
    this.a = new TextView(paramContext, paramAttributeSet, paramInt);
    this.a.setTextAppearance(paramContext, efj.yo);
    this.a.setMovementMethod(lxy.a());
    addView(this.a);
    this.c = new dwk(paramContext, paramAttributeSet, paramInt);
    addView(this.c);
    this.d = new dwj(paramContext, paramAttributeSet, paramInt);
    addView(this.d);
    this.e = new dwy(paramContext, paramAttributeSet, paramInt);
    this.e.setOnClickListener(this);
    addView(this.e);
    this.b = new dwt(paramContext, paramAttributeSet, paramInt);
    addView(this.b);
    this.b.setLayoutParams(new dxa(-1, -2));
    this.b.setId(aaw.dq);
    float f1 = j;
    int m = i;
    TextView localTextView = new TextView(paramContext, paramAttributeSet, paramInt);
    localTextView.setTextSize(0, f1);
    localTextView.setSingleLine(true);
    localTextView.setTextColor(m);
    localTextView.setEllipsize(TextUtils.TruncateAt.END);
    this.f = localTextView;
    this.f.setLayoutParams(new dxa(-1, -2));
    addView(this.f);
  }
  
  public final void a(URLSpan paramURLSpan)
  {
    if (this.g != null) {
      this.g.c(paramURLSpan.getURL());
    }
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i1 = 0 + k;
    int i2 = m - 2 * k;
    int i3;
    dwp[] arrayOfdwp;
    int i4;
    if (this.a.getText().length() > 0)
    {
      this.a.setVisibility(0);
      a(this.a, i2 - k, -2147483648, n, 0);
      a(this.a, i1 + k, 0);
      i3 = 0 + (this.a.getMeasuredHeight() + k);
      if (this.f.getVisibility() != 8)
      {
        a(this.f, i2, 1073741824, 0, 0);
        a(this.f, i1, i3);
        i3 += this.f.getMeasuredHeight() + k;
      }
      if (this.b.getVisibility() != 8)
      {
        a(this.b, m, 1073741824, 0, 0);
        a(this.b, 0, i3);
        i3 += this.b.getMeasuredHeight();
      }
      if (this.e.getVisibility() != 8)
      {
        a(this.e, m, 1073741824, 0, 0);
        a(this.e, 0, i3);
        i3 += this.e.getMeasuredHeight();
      }
      arrayOfdwp = new dwp[2];
      arrayOfdwp[0] = this.c;
      arrayOfdwp[1] = this.d;
      i4 = 0;
      i5 = 0;
      label269:
      if (i4 >= 2) {
        break label321;
      }
      if ((i5 == 0) && (arrayOfdwp[i4].getVisibility() != 0)) {
        break label315;
      }
    }
    label315:
    for (int i5 = 1;; i5 = 0)
    {
      i4++;
      break label269;
      this.a.setVisibility(8);
      i3 = 0;
      break;
    }
    label321:
    int i6 = 0;
    boolean bool1 = true;
    int i7 = 0;
    int i8 = i3;
    if (i6 < 2)
    {
      dwp localdwp = arrayOfdwp[i6];
      int i9;
      if (localdwp.getVisibility() != 8)
      {
        localdwp.e = bool1;
        a(localdwp, m, -2147483648, 0, 0);
        a(localdwp, 0, i8);
        i9 = localdwp.getMeasuredHeight();
        label389:
        i7 += i9;
        i8 += i9;
        if ((!bool1) || (i9 != 0)) {
          break label432;
        }
      }
      label432:
      for (boolean bool2 = true;; bool2 = false)
      {
        i6++;
        bool1 = bool2;
        break;
        i9 = 0;
        break label389;
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.g != null) {
      this.g.B();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwo
 * JD-Core Version:    0.7.0.1
 */