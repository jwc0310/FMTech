import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.Window;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;

final class isd
  implements View.OnLongClickListener
{
  isd(isb paramisb) {}
  
  public final boolean onLongClick(View paramView)
  {
    this.a.f.f().getWindow().getDecorView().performHapticFeedback(0, 1);
    this.a.f.b.c = 2;
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isd
 * JD-Core Version:    0.7.0.1
 */