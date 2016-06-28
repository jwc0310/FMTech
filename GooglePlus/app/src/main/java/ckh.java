import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

final class ckh
  implements Runnable
{
  ckh(ckg paramckg) {}
  
  public final void run()
  {
    ckf localckf = this.a.a;
    if (localckf.i())
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)localckf.N.findViewById(aaw.ey);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(14, -1);
      hvl.a(localckf.bn, aau.cI, aau.uL, localRelativeLayout, localLayoutParams);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckh
 * JD-Core Version:    0.7.0.1
 */