import android.view.View;

public final class lvf
  implements ol
{
  public final void a(View paramView, float paramFloat)
  {
    int i = paramView.getWidth();
    if (paramFloat >= -1.0F)
    {
      if (paramFloat <= 0.0F)
      {
        paramView.setAlpha(1.0F);
        paramView.setTranslationX(0.0F);
        paramView.setScaleX(1.0F);
        paramView.setScaleY(1.0F);
        return;
      }
      if (paramFloat <= 1.0F)
      {
        paramView.setAlpha(1.0F - paramFloat);
        paramView.setTranslationX(i * -paramFloat);
        float f = 0.75F + 0.25F * (1.0F - Math.abs(paramFloat));
        paramView.setScaleX(f);
        paramView.setScaleY(f);
        return;
      }
    }
    paramView.setAlpha(0.0F);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvf
 * JD-Core Version:    0.7.0.1
 */