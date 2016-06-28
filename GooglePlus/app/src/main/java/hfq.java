import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public final class hfq
  extends ViewGroup
{
  public final ImageButton a;
  private final int b;
  private final TextView c;
  private final hfr d;
  private gqw e;
  
  public hfq(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.d = ((hfr)mbb.a(localContext, hfr.class));
    Resources localResources = localContext.getResources();
    int i = localResources.getDimensionPixelOffset(aaw.nr);
    this.b = localResources.getInteger(aau.yQ);
    setPadding(i, i, i, i);
    this.a = lur.b(localContext, null, 0, 3, i, 0);
    this.a.setClickable(false);
    addView(this.a);
    ImageButton localImageButton = this.a;
    nj.a.c(localImageButton, 2);
    this.a.setFocusable(false);
    this.a.setFocusableInTouchMode(false);
    this.c = new TextView(localContext);
    this.c.setTextAppearance(localContext, aaw.nI);
    this.c.setMaxLines(1);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.c);
    this.e = new gqw(this);
  }
  
  public final void a()
  {
    a(null);
    setVisibility(8);
    this.e.a(null);
  }
  
  public final void a(int paramInt)
  {
    Drawable localDrawable = getResources().getDrawable(paramInt);
    localDrawable.setAlpha(this.b);
    this.a.setImageDrawable(localDrawable);
    this.a.setVisibility(0);
    requestLayout();
  }
  
  public final void a(String paramString)
  {
    int i;
    TextView localTextView;
    int j;
    if (!TextUtils.isEmpty(paramString))
    {
      i = 1;
      this.c.setText(paramString);
      localTextView = this.c;
      j = 0;
      if (i == 0) {
        break label45;
      }
    }
    for (;;)
    {
      localTextView.setVisibility(j);
      requestLayout();
      return;
      i = 0;
      break;
      label45:
      j = 8;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.d.a(paramInt1, paramInt2, paramInt3, paramInt4, this, this.a, this.c);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.d.a(paramInt1, this, this.a, this.c);
    setMeasuredDimension(arrayOfInt[0], arrayOfInt[1]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfq
 * JD-Core Version:    0.7.0.1
 */