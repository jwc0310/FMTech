import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.ViewFlipper;

final class csr
  implements RadioGroup.OnCheckedChangeListener
{
  csr(cso paramcso, ViewFlipper paramViewFlipper, View paramView) {}
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    int i = 1;
    int j;
    if (paramInt == 2)
    {
      j = i;
      if (!this.c.f.c.booleanValue()) {
        break label73;
      }
      if (((j == 0) || (this.a.getDisplayedChild() != i)) && ((j != 0) || (this.a.getDisplayedChild() != -1 + this.a.getChildCount()))) {
        break label104;
      }
    }
    label73:
    while (((j != 0) && (this.a.getDisplayedChild() == i)) || ((j == 0) && (this.a.getDisplayedChild() == 0)))
    {
      return;
      j = 0;
      break;
    }
    label104:
    View localView = this.b.findViewById(aaw.eK);
    if ((j == 0) && (this.c.f.c.booleanValue()))
    {
      efj.d(localView);
      if (!this.c.f.c.booleanValue()) {
        break label301;
      }
      if (j != 0) {
        break label290;
      }
    }
    for (;;)
    {
      ViewFlipper localViewFlipper = this.a;
      AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.0F, 1.0F);
      localAlphaAnimation2.setDuration(500L);
      localViewFlipper.setInAnimation(localAlphaAnimation2);
      AlphaAnimation localAlphaAnimation3 = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation3.setDuration(500L);
      localViewFlipper.setOutAnimation(localAlphaAnimation3);
      if (i != 0)
      {
        localViewFlipper.showNext();
        return;
        if (!this.c.f.c.booleanValue()) {
          break;
        }
        AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.0F);
        localAlphaAnimation1.setDuration(500L);
        localAlphaAnimation1.setAnimationListener(new ctl(localView));
        localView.startAnimation(localAlphaAnimation1);
        break;
        label290:
        i = 0;
        continue;
      }
      localViewFlipper.showPrevious();
      return;
      label301:
      i = j;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csr
 * JD-Core Version:    0.7.0.1
 */