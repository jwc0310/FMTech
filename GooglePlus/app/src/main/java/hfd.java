import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;

public final class hfd
  extends ViewGroup
  implements lxj
{
  public final TextView a;
  public boolean b;
  public final TextView c;
  private final int d;
  private boolean e;
  private boolean f;
  private final TextView g;
  private final int h;
  
  public hfd(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.d = localContext.getResources().getDimensionPixelOffset(aau.yx);
    this.e = false;
    this.h = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.a = new TextView(localContext);
    this.a.setTextAppearance(localContext, aau.yP);
    this.a.setMaxLines(1);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    TextView localTextView1 = this.a;
    nj.a.c(localTextView1, 2);
    addView(this.a);
    this.c = new TextView(localContext);
    this.c.setTextAppearance(localContext, aau.yO);
    this.c.setMaxLines(1);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    TextView localTextView2 = this.c;
    nj.a.c(localTextView2, 2);
    addView(this.c);
    this.g = new TextView(localContext);
    this.g.setTextAppearance(localContext, aau.yO);
    this.g.setMaxLines(1);
    this.g.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.g);
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public final void D_()
  {
    this.e = false;
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    boolean bool1;
    TextView localTextView;
    int i;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      bool1 = true;
      this.f = bool1;
      this.a.setText(paramCharSequence);
      localTextView = this.a;
      boolean bool2 = this.f;
      i = 0;
      if (!bool2) {
        break label53;
      }
    }
    for (;;)
    {
      localTextView.setVisibility(i);
      return;
      bool1 = false;
      break;
      label53:
      i = 8;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    int i;
    StringBuilder localStringBuilder;
    if ((paramBoolean) && ((this.f) || (this.b)))
    {
      i = 1;
      if (i == 0) {
        break label171;
      }
      setVisibility(0);
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      if (localmfz.b != 1) {
        break label150;
      }
      localStringBuilder = localmfz.a;
      label68:
      if (this.a == null) {
        break label165;
      }
    }
    label150:
    label165:
    for (CharSequence localCharSequence1 = this.a.getText();; localCharSequence1 = null)
    {
      TextView localTextView = this.c;
      CharSequence localCharSequence2 = null;
      if (localTextView != null) {
        localCharSequence2 = this.c.getText();
      }
      efj.a(localStringBuilder, new CharSequence[] { localCharSequence1 });
      efj.a(localStringBuilder, new CharSequence[] { localCharSequence2 });
      setContentDescription(mfx.b(localStringBuilder));
      return;
      i = 0;
      break;
      localStringBuilder = new StringBuilder(256);
      break label68;
    }
    label171:
    setVisibility(8);
    setContentDescription("");
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    int j = this.d;
    int k = i - this.d;
    boolean bool = aau.a(getContext());
    int m = getPaddingTop();
    int i1;
    if (this.f)
    {
      i1 = m + this.a.getMeasuredHeight();
      if (!bool) {
        break label143;
      }
      this.a.layout(k - this.a.getMeasuredWidth(), m, k, i1);
    }
    int n;
    for (;;)
    {
      m += this.a.getMeasuredHeight();
      if (this.b)
      {
        n = m + this.c.getMeasuredHeight();
        if (!bool) {
          break;
        }
        this.c.layout(k - this.c.getMeasuredWidth(), m, k, n);
      }
      return;
      label143:
      this.a.layout(j, m, j + this.a.getMeasuredWidth(), i1);
    }
    this.c.layout(j, m, j + this.c.getMeasuredWidth(), n);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (!this.e)
    {
      String str = String.valueOf(getClass().getCanonicalName());
      throw new IllegalStateException(73 + String.valueOf(str).length() + str + " expected to have been bound with valid data. Was boundWithData() called?");
    }
    if (getVisibility() == 8)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int i = aau.a(getContext(), paramInt1);
    int j = View.MeasureSpec.makeMeasureSpec(i - 2 * this.d, -2147483648);
    boolean bool = this.f;
    int k = 0;
    if (bool)
    {
      this.a.measure(j, this.h);
      k = Math.max(this.a.getMeasuredHeight(), 0);
    }
    if (this.b)
    {
      this.c.measure(j, this.h);
      k += this.c.getMeasuredHeight();
    }
    setMeasuredDimension(i, k + (getPaddingTop() + getPaddingBottom()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfd
 * JD-Core Version:    0.7.0.1
 */