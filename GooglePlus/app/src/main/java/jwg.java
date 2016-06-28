import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

final class jwg
  implements View.OnLongClickListener
{
  jwg(jwe paramjwe) {}
  
  public final boolean onLongClick(View paramView)
  {
    jwu localjwu = (jwu)this.a.c();
    int i = localjwu.a(paramView);
    if (i == -1) {
      return false;
    }
    heh localheh = (heh)mbb.a(localjwu.getContext(), heh.class);
    llx localllx = localjwu.c.h[i].d;
    localheh.a(((MediaView)localjwu.g.get(i)).t, localllx.g, localllx.f, false, localjwu.c.d);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwg
 * JD-Core Version:    0.7.0.1
 */