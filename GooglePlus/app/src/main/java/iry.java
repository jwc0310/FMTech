import android.content.res.Resources;
import android.provider.MediaStore.Video.Media;
import android.widget.Toast;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;

public final class iry
  implements jpe
{
  public iry(MediaPickerFragment paramMediaPickerFragment) {}
  
  public final void a(jpg paramjpg)
  {
    MediaPickerFragment localMediaPickerFragment = this.a;
    if (paramjpg.a()) {
      localMediaPickerFragment.a("_data", MediaStore.Video.Media.EXTERNAL_CONTENT_URI, ipm.b);
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
 * Qualified Name:     iry
 * JD-Core Version:    0.7.0.1
 */