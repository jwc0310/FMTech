import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class nm
  extends nl
{
  public final int a(int paramInt1, int paramInt2)
  {
    return View.combineMeasuredStates(paramInt1, paramInt2);
  }
  
  public final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }
  
  final long a()
  {
    return ValueAnimator.getFrameDelay();
  }
  
  public final void a(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
  
  public final void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
  
  public final void a(View paramView, boolean paramBoolean)
  {
    paramView.setSaveFromParentEnabled(paramBoolean);
  }
  
  public final float b(View paramView)
  {
    return paramView.getAlpha();
  }
  
  public final void b(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
  
  public final void b(View paramView, boolean paramBoolean)
  {
    paramView.setActivated(paramBoolean);
  }
  
  public final int c(View paramView)
  {
    return paramView.getLayerType();
  }
  
  public final void c(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
  
  public final int d(View paramView)
  {
    return paramView.getMeasuredState();
  }
  
  public final void d(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }
  
  public final float e(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  public final void e(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }
  
  public final float f(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public final float g(View paramView)
  {
    return paramView.getScaleX();
  }
  
  public final void h(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nm
 * JD-Core Version:    0.7.0.1
 */