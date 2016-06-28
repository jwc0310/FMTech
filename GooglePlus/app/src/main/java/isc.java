import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;
import java.util.ArrayList;

final class isc
  implements View.OnClickListener
{
  isc(isb paramisb, Context paramContext) {}
  
  public final void onClick(View paramView)
  {
    irm localirm = (irm)paramView;
    ipa localipa = (ipa)paramView.getTag();
    if (!this.b.a(localipa.e().d))
    {
      Toast.makeText(this.a, da.l, 1).show();
      return;
    }
    if (this.b.f.b.a.contains(localipa))
    {
      this.b.f.b.b(localipa, this);
      localirm.a(false);
      return;
    }
    this.b.f.b.a(localipa, this);
    localirm.a(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isc
 * JD-Core Version:    0.7.0.1
 */