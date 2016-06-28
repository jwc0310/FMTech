import android.content.res.Resources;
import android.provider.MediaStore.Images.Media;
import android.widget.Toast;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;

public final class irx
  implements jpe
{
  public irx(MediaPickerFragment paramMediaPickerFragment) {}
  
  public final void a(jpg paramjpg)
  {
    MediaPickerFragment localMediaPickerFragment = this.a;
    if (paramjpg.a()) {
      localMediaPickerFragment.a("_data", MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ipm.a);
    }
    for (;;)
    {
      localMediaPickerFragment.v();
      return;
      Toast.makeText(localMediaPickerFragment.bn, localMediaPickerFragment.g().getString(da.w), 1).show();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irx
 * JD-Core Version:    0.7.0.1
 */