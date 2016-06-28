import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class bwg
  implements View.OnClickListener
{
  bwg(bwf parambwf) {}
  
  public final void onClick(View paramView)
  {
    bwf localbwf = this.a;
    ((ClipboardManager)localbwf.f().getSystemService("clipboard")).setText(localbwf.Z);
    Toast.makeText(localbwf.f(), aau.cb, 0).show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwg
 * JD-Core Version:    0.7.0.1
 */