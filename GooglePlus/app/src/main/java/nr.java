import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.WindowInsets;

final class nr
  extends nq
{
  public final float A(View paramView)
  {
    return paramView.getElevation();
  }
  
  public final float B(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  public final boolean C(View paramView)
  {
    return paramView.isNestedScrollingEnabled();
  }
  
  public final void D(View paramView)
  {
    paramView.stopNestedScroll();
  }
  
  public final float E(View paramView)
  {
    return paramView.getZ();
  }
  
  public final pj a(View paramView, pj parampj)
  {
    if ((parampj instanceof pk))
    {
      WindowInsets localWindowInsets1 = ((pk)parampj).a;
      WindowInsets localWindowInsets2 = paramView.onApplyWindowInsets(localWindowInsets1);
      if (localWindowInsets2 != localWindowInsets1) {
        parampj = new pk(localWindowInsets2);
      }
    }
    return parampj;
  }
  
  public final void a(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
  }
  
  public final void a(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
  }
  
  public final void a(View paramView, nb paramnb)
  {
    paramView.setOnApplyWindowInsetsListener(new nt(paramnb));
  }
  
  public final void f(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  public final void q(View paramView)
  {
    paramView.requestApplyInsets();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nr
 * JD-Core Version:    0.7.0.1
 */