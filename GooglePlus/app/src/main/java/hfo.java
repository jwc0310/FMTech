import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class hfo
  extends ViewGroup
  implements gxs, lxj
{
  public AvatarView a;
  private final int b = getResources().getDimensionPixelSize(aaw.nu);
  private final gxq c = new gxq(pka.x);
  
  public hfo(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void D_()
  {
    if (this.a != null) {
      this.a.a();
    }
  }
  
  public final int b()
  {
    efj.e(this.a, "AvatarView was never set on this View. Was setAvatar() called?");
    if (this.a.getMeasuredHeight() > this.b) {
      return 0;
    }
    return (this.b - this.a.getMeasuredHeight()) / 2;
  }
  
  public final CharSequence getContentDescription()
  {
    if (!TextUtils.isEmpty(this.a.h))
    {
      if (isClickable()) {}
      for (int j = aaw.nE;; j = aaw.nD)
      {
        Resources localResources = getResources();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a.h;
        return localResources.getString(j, arrayOfObject);
      }
    }
    if (isClickable()) {}
    for (int i = aaw.nC;; i = aaw.nB) {
      return getResources().getString(i);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.a.getMeasuredHeight();
    if (i > this.b)
    {
      this.a.layout(0, 0, i, i);
      return;
    }
    int j = (paramInt3 - paramInt1 - i) / 2;
    int k = (paramInt4 - paramInt2 - i) / 2;
    this.a.layout(j, k, j + i, i + k);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    efj.e(this.a, "AvatarView was never set on this View. Was setAvatar() called?");
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.a.measure(i, i);
    int j = this.a.getMeasuredHeight();
    if (j > this.b)
    {
      setMeasuredDimension(j, j);
      return;
    }
    setMeasuredDimension(this.b, this.b);
  }
  
  public final gxq v()
  {
    return this.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfo
 * JD-Core Version:    0.7.0.1
 */