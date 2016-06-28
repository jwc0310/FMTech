import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;

final class isf
  implements View.OnClickListener
{
  isf(isb paramisb) {}
  
  public final void onClick(View paramView)
  {
    if (!this.a.f.a(1)) {}
    for (int i = 1; i != 0; i = 0)
    {
      MediaPickerFragment localMediaPickerFragment = this.a.f;
      String[] arrayOfString = new String[2];
      arrayOfString[0] = localMediaPickerFragment.g().getString(da.x);
      arrayOfString[1] = localMediaPickerFragment.g().getString(da.y);
      lut locallut = lut.a(null, arrayOfString);
      locallut.n = localMediaPickerFragment;
      locallut.p = 4;
      locallut.a(localMediaPickerFragment.x, "PhotoOrVideo");
      return;
    }
    this.a.f.w();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isf
 * JD-Core Version:    0.7.0.1
 */