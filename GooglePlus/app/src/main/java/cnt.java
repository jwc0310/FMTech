import android.animation.LayoutTransition;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

final class cnt
  implements RadioGroup.OnCheckedChangeListener
{
  cnt(cnq paramcnq) {}
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (paramInt == aaw.Y)
    {
      cnq.c(this.a);
      if (Build.VERSION.SDK_INT >= 11)
      {
        if (this.a.a == null) {
          this.a.a = new cnu(this);
        }
        this.a.ax.getLayoutTransition().addTransitionListener(this.a.a);
      }
      for (;;)
      {
        this.a.ay.setVisibility(8);
        return;
        this.a.a(true);
      }
    }
    cnq.a(this.a);
    cnq.b(this.a);
    this.a.ay.setVisibility(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnt
 * JD-Core Version:    0.7.0.1
 */