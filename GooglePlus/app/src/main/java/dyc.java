import android.view.View;

public final class dyc
  implements ol
{
  public final void a(View paramView, float paramFloat)
  {
    if ((paramFloat <= 0.0F) || (paramFloat >= 1.0F))
    {
      paramView.setAlpha(1.0F);
      paramView.setTranslationX(0.0F);
      paramView.setScaleX(1.0F);
      paramView.setScaleY(1.0F);
      return;
    }
    paramView.setTranslationX(-paramFloat * paramView.getWidth());
    paramView.setAlpha(Math.max(0.0F, 1.0F - paramFloat));
    float f = 0.75F + 0.25F * (1.0F - Math.abs(paramFloat));
    paramView.setScaleX(f);
    paramView.setScaleY(f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyc
 * JD-Core Version:    0.7.0.1
 */