import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public final class grt
  implements View.OnClickListener
{
  private final grv a;
  
  grt(grv paramgrv)
  {
    this.a = paramgrv;
  }
  
  public final void onClick(View paramView)
  {
    grv localgrv = this.a;
    View localView = localgrv.a.findViewById(efj.EB);
    nj.a.c(localView, 4);
    qrw localqrw = (qrw)paramView.getTag(96372017);
    gtb localgtb = new gtb();
    Bundle localBundle = new Bundle();
    efj.a(localBundle, "TIKTOK_FRAGMENT_ARGUMENT", localqrw);
    localgtb.f(localBundle);
    localgrv.a.b.a.d.a().a(efj.EC, localgtb, "menu_fragment_tag").a(null).b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     grt
 * JD-Core Version:    0.7.0.1
 */