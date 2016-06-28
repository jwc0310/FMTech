import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintImageView;

final class aco
  extends TintImageView
  implements acu
{
  public aco(acl paramacl, Context paramContext)
  {
    super(paramContext, null, aau.C);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    setOnTouchListener(new acp(this, this, paramacl));
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final boolean d()
  {
    return false;
  }
  
  public final boolean performClick()
  {
    if (super.performClick()) {
      return true;
    }
    playSoundEffect(0);
    this.a.d();
    return true;
  }
  
  protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      int i = getWidth();
      int j = getHeight();
      int k = Math.max(i, j) / 2;
      int m = getPaddingLeft() - getPaddingRight();
      int n = getPaddingTop() - getPaddingBottom();
      int i1 = (i + m) / 2;
      int i2 = (j + n) / 2;
      int i3 = i1 - k;
      int i4 = i2 - k;
      int i5 = i1 + k;
      int i6 = k + i2;
      gl.a.a(localDrawable2, i3, i4, i5, i6);
    }
    return bool;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aco
 * JD-Core Version:    0.7.0.1
 */