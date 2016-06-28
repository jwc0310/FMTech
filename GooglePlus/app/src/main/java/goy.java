import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class goy
  extends LinearLayout
{
  public final TextView a;
  public View b;
  private final RelativeLayout c;
  
  public goy(Context paramContext)
  {
    super(paramContext, null);
    int i = getResources().getDimensionPixelSize(efj.Eb);
    int j = getResources().getDimensionPixelOffset(efj.Ec);
    setPadding(j, i, j, i);
    setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0F));
    setOrientation(1);
    Context localContext = getContext();
    this.c = new RelativeLayout(localContext);
    int k = getResources().getDimensionPixelSize(efj.Ea);
    this.c.setPadding(0, 0, 0, k);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2, 1.0F);
    localLayoutParams1.gravity = 1;
    addView(this.c, localLayoutParams1);
    this.a = new TextView(localContext);
    this.a.setMaxLines(2);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    this.a.setGravity(1);
    this.a.setTextAppearance(getContext(), aau.xX);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.gravity = 1;
    addView(this.a, localLayoutParams2);
    TypedValue localTypedValue = new TypedValue();
    localContext.getTheme().resolveAttribute(16843534, localTypedValue, true);
    setBackgroundResource(localTypedValue.resourceId);
  }
  
  public static int a(Context paramContext)
  {
    Configuration localConfiguration = paramContext.getResources().getConfiguration();
    int i = 3;
    switch (0xF & localConfiguration.screenLayout)
    {
    }
    for (;;)
    {
      if (localConfiguration.orientation == 2) {
        i++;
      }
      return i;
      i = 4;
    }
  }
  
  public final void a(View paramView)
  {
    this.b = paramView;
    this.c.removeAllViews();
    this.c.addView(this.b);
  }
  
  public final void a(String paramString)
  {
    this.a.setCompoundDrawablePadding(0);
    this.a.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    this.a.setText(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     goy
 * JD-Core Version:    0.7.0.1
 */