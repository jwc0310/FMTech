import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

final class cer
  implements View.OnClickListener
{
  cer(ceq paramceq, Context paramContext) {}
  
  public final void onClick(View paramView)
  {
    if (!this.b.a.i()) {
      return;
    }
    if (!this.b.a.aq.a())
    {
      this.a.startActivity(this.b.a.aq.b());
      return;
    }
    cwm localcwm = new cwm();
    localcwm.n = this.b.a;
    localcwm.p = 0;
    localcwm.a(this.b.a.x, "new_circle_input");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cer
 * JD-Core Version:    0.7.0.1
 */