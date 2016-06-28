import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.apps.plus.phone.HostLayout;

public final class dbb
  implements hdt
{
  public dbb(HomeActivity paramHomeActivity) {}
  
  public final boolean t_()
  {
    HomeActivity localHomeActivity = this.a;
    boolean bool;
    if (localHomeActivity.h == null) {
      bool = false;
    }
    while ((!bool) && (this.a.d.e()))
    {
      this.a.d(efj.c(this.a));
      return true;
      if (!(localHomeActivity.h.a.a("hosted") instanceof cge)) {
        bool = false;
      } else {
        bool = ((cge)localHomeActivity.h.a.a("hosted")).H();
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbb
 * JD-Core Version:    0.7.0.1
 */