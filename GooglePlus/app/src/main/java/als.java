import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.photoeditor.fragments.PhotoEditorActivity;

public final class als
  implements DialogInterface.OnClickListener
{
  public als(PhotoEditorActivity paramPhotoEditorActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1) {
      this.a.g();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     als
 * JD-Core Version:    0.7.0.1
 */