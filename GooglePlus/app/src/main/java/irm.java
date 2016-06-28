import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import com.google.android.libraries.social.media.ui.MediaView;

public final class irm
  extends MediaView
{
  public float a = 1.0F;
  private CharSequence b;
  
  public irm(Context paramContext)
  {
    super(paramContext);
  }
  
  private final void d()
  {
    if (!isSelected())
    {
      super.setContentDescription(this.b);
      return;
    }
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.b;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = getResources().getString(da.r);
      efj.a(localStringBuilder, arrayOfCharSequence2);
      super.setContentDescription(mfx.b(localStringBuilder));
      return;
    }
  }
  
  public final void D_()
  {
    super.D_();
    this.b = null;
  }
  
  public final void a(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    d();
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt2) != 0)
    {
      setMeasuredDimension((int)(View.MeasureSpec.getSize(paramInt2) * this.a), paramInt2);
      return;
    }
    setMeasuredDimension(paramInt1, (int)(View.MeasureSpec.getSize(paramInt1) / this.a));
  }
  
  public final void setContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.equals(this.b, paramCharSequence)) {
      this.b = paramCharSequence;
    }
    d();
  }
  
  public final void setSelected(boolean paramBoolean) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irm
 * JD-Core Version:    0.7.0.1
 */