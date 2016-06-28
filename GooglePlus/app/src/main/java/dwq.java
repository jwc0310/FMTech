import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class dwq
  extends dwz
{
  private static boolean d;
  private static int e;
  private static float f;
  private static int g;
  private static float h;
  TextView a;
  ArrayList<TextView> b = new ArrayList();
  int c;
  private AttributeSet i;
  private Context j;
  private int k;
  
  public dwq(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.j = paramContext;
    this.i = paramAttributeSet;
    this.k = paramInt;
    Resources localResources = paramContext.getResources();
    if (!d)
    {
      e = localResources.getColor(efj.kp);
      f = localResources.getDimension(efj.nK);
      g = localResources.getColor(efj.kp);
      h = localResources.getDimension(efj.nJ);
      d = true;
    }
    float f1 = f;
    int m = e;
    TextView localTextView = new TextView(paramContext, paramAttributeSet, paramInt);
    localTextView.setTextSize(0, f1);
    localTextView.setSingleLine(true);
    localTextView.setTextColor(m);
    localTextView.setEllipsize(TextUtils.TruncateAt.END);
    localTextView.setTypeface(Typeface.DEFAULT_BOLD);
    this.a = localTextView;
    addView(this.a);
  }
  
  public final void a(String paramString, List<String> paramList)
  {
    this.a.setText(paramString);
    TextView localTextView1 = this.a;
    if (TextUtils.isEmpty(this.a.getText())) {}
    for (int m = 8;; m = 0)
    {
      localTextView1.setVisibility(m);
      for (int n = -1 + this.b.size(); n >= 0; n--) {
        removeView((View)this.b.get(n));
      }
    }
    this.c = 0;
    if (paramList != null)
    {
      int i1 = paramList.size();
      for (int i2 = 0; i2 < i1; i2++) {
        if (!TextUtils.isEmpty((String)paramList.get(i2)))
        {
          if (i2 > -1 + this.b.size())
          {
            ArrayList localArrayList = this.b;
            Context localContext = this.j;
            AttributeSet localAttributeSet = this.i;
            int i3 = this.k;
            float f1 = h;
            int i4 = g;
            TextView localTextView3 = new TextView(localContext, localAttributeSet, i3);
            localTextView3.setTextSize(0, f1);
            localTextView3.setSingleLine(true);
            localTextView3.setTextColor(i4);
            localTextView3.setEllipsize(TextUtils.TruncateAt.END);
            localArrayList.add(localTextView3);
          }
          TextView localTextView2 = (TextView)this.b.get(i2);
          localTextView2.setText((CharSequence)paramList.get(i2));
          addView(localTextView2);
          this.c = (1 + this.c);
        }
      }
    }
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt2);
    a(this.a, m, -2147483648, n, 0);
    a(this.a, 0, 0);
    if (TextUtils.isEmpty(this.a.getText())) {}
    for (int i1 = 0;; i1 = this.a.getMeasuredHeight())
    {
      int i2 = i1 + 0;
      int i3 = 0;
      int i4 = i2;
      while (i3 < this.c)
      {
        TextView localTextView = (TextView)this.b.get(i3);
        a(localTextView, m, -2147483648, n, 0);
        a(localTextView, 0, i4);
        i4 += localTextView.getMeasuredHeight();
        i3++;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwq
 * JD-Core Version:    0.7.0.1
 */