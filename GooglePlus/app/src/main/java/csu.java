import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.locations.LocationSharingRadioGroup;

final class csu
  implements View.OnClickListener
{
  csu(cso paramcso, LocationSharingRadioGroup paramLocationSharingRadioGroup) {}
  
  public final void onClick(View paramView)
  {
    this.b.i = this.a.a;
    if (this.b.i == 1) {
      this.b.a(gxz.cx, gya.R);
    }
    for (;;)
    {
      if ((this.b.a != null) && (this.b.d())) {
        this.b.a.a(this.b.i, true, false);
      }
      this.b.a();
      return;
      if (this.b.i == 2) {
        this.b.a(gxz.cy, gya.R);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csu
 * JD-Core Version:    0.7.0.1
 */