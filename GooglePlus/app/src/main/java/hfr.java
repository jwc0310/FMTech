import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.MeasureSpec;

public final class hfr
{
  private final int a;
  private final int b;
  
  public hfr(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    this.a = localResources.getDimensionPixelOffset(aaw.nz);
    this.b = localResources.getDimensionPixelOffset(aaw.nA);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView1, View paramView2, View paramView3)
  {
    boolean bool = aau.a(paramView2.getContext());
    int i;
    int j;
    int k;
    int m;
    int i1;
    int n;
    if (paramView3.getVisibility() != 8)
    {
      i = 1;
      j = paramInt4 - paramInt2 - paramView1.getPaddingTop() - paramView1.getPaddingBottom();
      k = paramView1.getPaddingTop();
      m = paramView2.getMeasuredWidth();
      if (i == 0) {
        break label272;
      }
      i1 = paramView3.getMeasuredHeight();
      if (m <= i1) {
        break label173;
      }
      n = k + (j - i1) / 2;
    }
    for (;;)
    {
      label86:
      if (bool)
      {
        int i4 = paramInt3 - paramInt1 - paramView1.getPaddingRight();
        paramView2.layout(i4 - paramView2.getMeasuredWidth(), k, i4, m + k);
        if (i != 0)
        {
          int i5 = i4 - (paramView2.getMeasuredWidth() + this.b);
          paramView3.layout(i5 - paramView3.getMeasuredWidth(), n, i5, i1 + n);
        }
      }
      label173:
      int i2;
      do
      {
        return;
        i = 0;
        break;
        int i6 = k + (j - m) / 2;
        int i7 = k;
        k = i6;
        n = i7;
        break label86;
        i2 = paramView1.getPaddingLeft();
        paramView2.layout(i2, k, i2 + paramView2.getMeasuredWidth(), m + k);
      } while (i == 0);
      int i3 = i2 + (paramView2.getMeasuredWidth() + this.b);
      paramView3.layout(i3, n, i3 + paramView3.getMeasuredWidth(), i1 + n);
      return;
      label272:
      n = k;
      i1 = 0;
    }
  }
  
  public final int[] a(int paramInt, View paramView1, View paramView2, View paramView3)
  {
    int i = aau.a(paramView1.getContext(), paramInt);
    int j = paramView1.getPaddingLeft() + paramView1.getPaddingRight();
    int k;
    if (paramView2.getVisibility() != 8)
    {
      int i2 = View.MeasureSpec.makeMeasureSpec(this.a, 1073741824);
      paramView2.measure(i2, i2);
      k = 0 + paramView2.getMeasuredHeight();
      j += paramView2.getMeasuredWidth();
    }
    for (;;)
    {
      int m = i - j;
      if (m < 0)
      {
        paramView3.setVisibility(8);
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = j;
        arrayOfInt[1] = (k + paramView1.getPaddingTop() + paramView1.getPaddingBottom());
        return arrayOfInt;
      }
      int i1;
      int n;
      if (paramView3.getVisibility() != 8)
      {
        paramView3.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
        i1 = paramView3.getMeasuredWidth() + this.b;
        if (m < i1)
        {
          paramView3.setVisibility(8);
          n = k;
        }
      }
      for (;;)
      {
        if (n > 0) {
          n += paramView1.getPaddingTop() + paramView1.getPaddingBottom();
        }
        if (View.MeasureSpec.getMode(paramInt) == 1073741824) {}
        for (;;)
        {
          return new int[] { i, n };
          j += i1;
          n = Math.max(paramView3.getMeasuredHeight(), k);
          break;
          i = j;
        }
        n = k;
      }
      k = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfr
 * JD-Core Version:    0.7.0.1
 */