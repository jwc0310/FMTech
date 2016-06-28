import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.text.NumberFormat;

public final class jxa
  extends jtu
{
  private static boolean h;
  private static int i;
  private static NumberFormat j;
  public View.OnClickListener f;
  public boolean g;
  private TextView k;
  private int l;
  
  public jxa(Context paramContext)
  {
    super(paramContext);
  }
  
  private final void d()
  {
    Resources localResources = getContext().getResources();
    boolean bool;
    int m;
    label47:
    TextView localTextView2;
    if ((this.c.e > 0L) && (this.g))
    {
      bool = true;
      TextView localTextView1 = this.k;
      if (!bool) {
        break label119;
      }
      m = localResources.getColor(eyg.aT);
      localTextView1.setTextColor(m);
      localTextView2 = this.k;
      if (!bool) {
        break label131;
      }
    }
    label131:
    for (Drawable localDrawable = localResources.getDrawable(efj.TH);; localDrawable = null)
    {
      localTextView2.setBackgroundDrawable(localDrawable);
      TextView localTextView3 = this.k;
      View.OnClickListener localOnClickListener = null;
      if (bool) {
        localOnClickListener = this.f;
      }
      localTextView3.setOnClickListener(localOnClickListener);
      this.k.setClickable(bool);
      return;
      bool = false;
      break;
      label119:
      m = localResources.getColor(eyg.aU);
      break label47;
    }
  }
  
  private final int e()
  {
    if ((this.l > 0) && (this.l < this.d)) {}
    for (int m = this.l;; m = this.d - (a.m << 1)) {
      return View.MeasureSpec.makeMeasureSpec(m, 1073741824);
    }
  }
  
  public final void D_()
  {
    removeAllViews();
    this.g = false;
    this.l = 0;
  }
  
  protected final void a(Context paramContext)
  {
    if (!h)
    {
      Resources localResources = paramContext.getResources();
      i = (int)localResources.getDimension(efj.TD);
      j = NumberFormat.getIntegerInstance(localResources.getConfiguration().locale);
      h = true;
    }
    this.k = new TextView(paramContext);
    this.k.setTextAppearance(paramContext, eyg.aX);
    int m = a.aQ;
    this.k.setPadding(this.k.getPaddingLeft(), m, this.k.getPaddingRight(), m);
  }
  
  public final void b()
  {
    Context localContext = getContext();
    d();
    this.k.setFocusable(true);
    TextView localTextView = this.k;
    nj.a.c(localTextView, 1);
    this.k.setText(c(localContext));
    addView(this.k);
  }
  
  public final void b(Context paramContext)
  {
    d();
    this.k.setText(c(paramContext));
    this.k.measure(e(), b);
    this.k.layout(this.k.getLeft(), this.k.getTop(), this.k.getLeft() + this.k.getMeasuredWidth(), this.k.getTop() + this.k.getMeasuredHeight());
  }
  
  public final String c(Context paramContext)
  {
    long l1 = this.c.e;
    String str1;
    String str2;
    switch (this.c.n)
    {
    default: 
      str1 = null;
      if (str1 == null) {
        if (l1 > 0L)
        {
          Resources localResources2 = paramContext.getResources();
          int i1 = efj.TO;
          int i2 = (int)l1;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = j.format(l1);
          str2 = localResources2.getQuantityString(i1, i2, arrayOfObject2);
        }
      }
      break;
    }
    for (;;)
    {
      mbb.a(paramContext, lwj.class);
      this.l = lwj.a(this.k.getPaint(), str2);
      return str2;
      str1 = paramContext.getString(da.C);
      break;
      str1 = ((git)mbb.a(paramContext, git.class)).f().b("domain_name");
      break;
      str2 = paramContext.getResources().getString(da.F);
      continue;
      if (l1 > 0L)
      {
        Resources localResources1 = paramContext.getResources();
        int m = efj.TP;
        int n = (int)l1;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = j.format(l1);
        arrayOfObject1[1] = str1;
        str2 = localResources1.getQuantityString(m, n, arrayOfObject1);
      }
      else
      {
        str2 = paramContext.getResources().getString(da.G, new Object[] { str1 });
      }
    }
  }
  
  public final void c() {}
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m = i;
    int n = a.m;
    this.k.layout(n, m, n + this.k.getMeasuredWidth(), m + this.k.getMeasuredHeight());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    this.k.measure(e(), b);
    setMeasuredDimension(this.d, this.k.getMeasuredHeight() + i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxa
 * JD-Core Version:    0.7.0.1
 */