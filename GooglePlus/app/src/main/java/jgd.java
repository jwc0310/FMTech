import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class jgd
  extends LinearLayout
  implements lxj
{
  public static int d;
  public static int e;
  public static int f;
  public static int g;
  public static int h;
  public static int i;
  public static int j;
  public static ColorStateList k;
  public static int l;
  public static int m;
  public static int n;
  public static String o;
  private TextView a;
  public boolean p;
  public boolean q;
  public boolean r;
  public jgl s;
  public View t;
  public View u;
  
  public jgd(Context paramContext)
  {
    super(paramContext);
    if (d == 0)
    {
      Resources localResources = getContext().getResources();
      d = localResources.getDimensionPixelSize(aaw.pi);
      e = localResources.getDimensionPixelSize(aaw.ph);
      f = localResources.getDimensionPixelSize(aaw.ph);
      g = localResources.getColor(ehr.dd);
      h = localResources.getColor(ehr.dd);
      i = localResources.getColor(ehr.dd);
      localResources.getColor(ehr.cZ);
      j = localResources.getColor(ehr.dc);
      k = localResources.getColorStateList(ehr.cW);
      o = getContext().getResources().getString(efj.RD);
      l = localResources.getDimensionPixelSize(aaw.oZ);
      m = localResources.getDimensionPixelSize(aaw.oY);
      n = localResources.getDimensionPixelSize(aaw.pa);
    }
  }
  
  public jgd(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (d == 0)
    {
      Resources localResources = getContext().getResources();
      d = localResources.getDimensionPixelSize(aaw.pi);
      e = localResources.getDimensionPixelSize(aaw.ph);
      f = localResources.getDimensionPixelSize(aaw.ph);
      g = localResources.getColor(ehr.dd);
      h = localResources.getColor(ehr.dd);
      i = localResources.getColor(ehr.dd);
      localResources.getColor(ehr.cZ);
      j = localResources.getColor(ehr.dc);
      k = localResources.getColorStateList(ehr.cW);
      o = getContext().getResources().getString(efj.RD);
      l = localResources.getDimensionPixelSize(aaw.oZ);
      m = localResources.getDimensionPixelSize(aaw.oY);
      n = localResources.getDimensionPixelSize(aaw.pa);
    }
  }
  
  public jgd(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (d == 0)
    {
      Resources localResources = getContext().getResources();
      d = localResources.getDimensionPixelSize(aaw.pi);
      e = localResources.getDimensionPixelSize(aaw.ph);
      f = localResources.getDimensionPixelSize(aaw.ph);
      g = localResources.getColor(ehr.dd);
      h = localResources.getColor(ehr.dd);
      i = localResources.getColor(ehr.dd);
      localResources.getColor(ehr.cZ);
      j = localResources.getColor(ehr.dc);
      k = localResources.getColorStateList(ehr.cW);
      o = getContext().getResources().getString(efj.RD);
      l = localResources.getDimensionPixelSize(aaw.oZ);
      m = localResources.getDimensionPixelSize(aaw.oY);
      n = localResources.getDimensionPixelSize(aaw.pa);
    }
  }
  
  public static void a(View paramView)
  {
    paramView.setPadding(l, m, l, m);
  }
  
  public void D_()
  {
    if (this.t != null)
    {
      this.t.setOnClickListener(null);
      this.t.setBackgroundDrawable(null);
      if (this.t != null) {
        this.t.setTag(efj.Fe, null);
      }
    }
  }
  
  public final void a(TextView paramTextView)
  {
    int i1 = e;
    int i2 = h;
    paramTextView.setTextSize(0, i1);
    paramTextView.setTextColor(i2);
  }
  
  public final void a(TextView paramTextView, int paramInt, boolean paramBoolean)
  {
    paramTextView.setTextSize(0, d);
    paramTextView.setTextColor(paramInt);
    paramTextView.setTypeface(null, 1);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramTextView.getLayoutParams();
    if (localMarginLayoutParams != null)
    {
      int i1 = 0;
      if (paramBoolean) {}
      for (;;)
      {
        localMarginLayoutParams.topMargin = i1;
        return;
        i1 = l;
      }
    }
    if (paramBoolean) {}
    for (int i2 = 0;; i2 = l)
    {
      paramTextView.setPadding(0, i2, 0, 0);
      return;
    }
  }
  
  public abstract void a(nxl paramnxl);
  
  public int b()
  {
    return 0;
  }
  
  public final void b(TextView paramTextView)
  {
    int i1 = f;
    int i2 = i;
    paramTextView.setTextSize(0, i1);
    paramTextView.setTextColor(i2);
  }
  
  public gxq c()
  {
    return null;
  }
  
  public final void c(TextView paramTextView)
  {
    int i1 = f;
    int i2 = j;
    paramTextView.setTextSize(0, i1);
    paramTextView.setTextColor(i2);
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(aw.dc));
    if (this.a != null) {
      this.a.setTextAppearance(getContext(), aau.AC);
    }
    this.t = findViewById(aw.bG);
    if (this.t != null) {
      efj.a(this.t, c());
    }
    this.u = findViewById(aw.bz);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jgd
 * JD-Core Version:    0.7.0.1
 */