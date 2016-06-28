import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.apps.plus.views.EsDrawerLayout;
import java.util.List;

public final class dbe
  implements View.OnClickListener
{
  public dbe(HomeActivity paramHomeActivity) {}
  
  public final void onClick(View paramView)
  {
    HomeActivity localHomeActivity = this.a;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjs.h);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(paramView)).b(localHomeActivity);
    this.a.j.b(8388611);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbe
 * JD-Core Version:    0.7.0.1
 */