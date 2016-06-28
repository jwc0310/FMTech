import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class hfn
  extends ViewGroup
{
  public final Button a;
  public final Button b;
  private final Paint c;
  private final int d;
  private final TextView e;
  
  public hfn(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.c = new Paint();
    this.c.setColor(localResources.getColor(aau.yl));
    this.c.setStyle(Paint.Style.STROKE);
    this.c.setStrokeWidth(localResources.getDimension(aau.yy));
    int i = localResources.getDimensionPixelOffset(aau.yq);
    this.d = localResources.getDimensionPixelOffset(aau.yx);
    int j = localResources.getDimensionPixelOffset(aau.yu);
    this.a = new Button(localContext, null, 0);
    this.a.setGravity(16);
    this.a.setPadding(i, i, i, i);
    this.a.setMinHeight(j);
    this.a.setVisibility(8);
    this.a.setTextAppearance(localContext, aau.yM);
    addView(this.a);
    this.b = new Button(localContext, null, 0);
    this.b.setGravity(16);
    this.b.setPadding(i, i, i, i);
    this.b.setMinHeight(j);
    this.b.setVisibility(8);
    this.b.setTextAppearance(localContext, aau.yM);
    addView(this.b);
    TypedArray localTypedArray = localContext.obtainStyledAttributes(new int[] { 16843534 });
    this.a.setBackgroundResource(localTypedArray.getResourceId(0, 0));
    this.b.setBackgroundResource(localTypedArray.getResourceId(0, 0));
    localTypedArray.recycle();
    this.e = new TextView(localContext);
    this.e.setTextAppearance(localContext, aau.yM);
    this.e.setGravity(17);
    this.e.setVisibility(8);
    this.e.setText(localResources.getString(efj.Gk));
    this.e.setClickable(false);
    this.e.setFocusable(false);
    this.e.setFocusableInTouchMode(false);
    TextView localTextView = this.e;
    nj.a.c(localTextView, 2);
    addView(this.e);
  }
  
  public final void a(String paramString)
  {
    this.a.setText(paramString);
    Button localButton = this.a;
    if (TextUtils.isEmpty(paramString)) {}
    for (int i = 8;; i = 0)
    {
      localButton.setVisibility(i);
      return;
    }
  }
  
  public final void b(String paramString)
  {
    this.b.setText(paramString);
    Button localButton = this.b;
    if (TextUtils.isEmpty(paramString)) {}
    for (int i = 8;; i = 0)
    {
      localButton.setVisibility(i);
      return;
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (getVisibility() == 0)
    {
      int i = getHeight();
      paramCanvas.drawLine(0.0F, i, getWidth(), i, this.c);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt4 - paramInt2;
    if (aau.a(getContext()))
    {
      int i3 = paramInt3 - paramInt1 - this.d;
      if (this.a.getVisibility() != 8)
      {
        int i7 = (i - this.a.getMeasuredHeight()) / 2;
        int i8 = i3 + this.a.getPaddingLeft();
        this.a.layout(i8 - this.a.getMeasuredWidth(), i7, i8, i7 + this.a.getMeasuredHeight());
        i3 = i8 - (this.a.getMeasuredWidth() - this.a.getPaddingRight());
      }
      if (this.e.getVisibility() != 8)
      {
        int i6 = (i - this.e.getMeasuredHeight()) / 2;
        this.e.layout(i3 - this.e.getMeasuredWidth(), i6, i3, i6 + this.e.getMeasuredHeight());
        i3 -= this.e.getMeasuredWidth();
      }
      if (this.b.getVisibility() != 8)
      {
        int i4 = (i - this.b.getMeasuredHeight()) / 2;
        int i5 = i3 + this.b.getPaddingLeft();
        this.b.layout(i5 - this.b.getMeasuredWidth(), i4, i5, i4 + this.b.getMeasuredHeight());
      }
    }
    int j;
    do
    {
      return;
      j = this.d;
      if (this.a.getVisibility() != 8)
      {
        int i1 = (i - this.a.getMeasuredHeight()) / 2;
        int i2 = j - this.a.getPaddingLeft();
        this.a.layout(i2, i1, i2 + this.a.getMeasuredWidth(), i1 + this.a.getMeasuredHeight());
        j = i2 + (this.a.getMeasuredWidth() - this.a.getPaddingRight());
      }
      if (this.e.getVisibility() != 8)
      {
        int n = (i - this.e.getMeasuredHeight()) / 2;
        this.e.layout(j, n, j + this.e.getMeasuredWidth(), n + this.e.getMeasuredHeight());
        j += this.e.getMeasuredWidth();
      }
    } while (this.b.getVisibility() == 8);
    int k = (i - this.b.getMeasuredHeight()) / 2;
    int m = j - this.b.getPaddingLeft();
    this.b.layout(m, k, m + this.b.getMeasuredWidth(), k + this.b.getMeasuredHeight());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = aau.a(getContext(), paramInt1);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k;
    int m;
    label46:
    int n;
    if (this.b.getVisibility() != 8)
    {
      k = 1;
      if (this.a.getVisibility() == 8) {
        break label227;
      }
      m = 1;
      if (k == 0) {
        break label244;
      }
      this.b.measure(j, j);
      n = 0 + this.b.getMeasuredWidth();
    }
    for (int i1 = 0 + this.b.getMeasuredHeight();; i1 = 0)
    {
      int i2 = i - n;
      int i4;
      int i3;
      if ((k != 0) && (m != 0))
      {
        this.e.setVisibility(0);
        this.e.measure(j, j);
        int i6 = i2 - this.e.getMeasuredWidth();
        i4 = Math.max(this.e.getMeasuredHeight(), i1);
        i3 = i6;
      }
      for (;;)
      {
        if (m != 0)
        {
          int i5 = View.MeasureSpec.makeMeasureSpec(i3, -2147483648);
          this.a.measure(i5, j);
          n += this.a.getMeasuredWidth();
          i4 = Math.max(this.a.getMeasuredHeight(), i4);
        }
        if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
          n = i;
        }
        setMeasuredDimension(n, i4);
        return;
        k = 0;
        break;
        label227:
        m = 0;
        break label46;
        i3 = i2;
        i4 = i1;
      }
      label244:
      n = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfn
 * JD-Core Version:    0.7.0.1
 */