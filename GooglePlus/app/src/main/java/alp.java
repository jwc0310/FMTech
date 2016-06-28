import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.photoeditor.fragments.PhotoEditorActivity;
import java.util.List;

public final class alp
  implements DialogInterface.OnClickListener
{
  public alp(PhotoEditorActivity paramPhotoEditorActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      PhotoEditorActivity localPhotoEditorActivity = this.a;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pjw.i);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.a)).b(localPhotoEditorActivity);
      this.a.g();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alp
 * JD-Core Version:    0.7.0.1
 */