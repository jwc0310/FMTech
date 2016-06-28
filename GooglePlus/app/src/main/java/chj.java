import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.widget.Toast;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;

final class chj
  implements DialogInterface.OnCancelListener
{
  chj(cgr paramcgr) {}
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.a.aL != null)
    {
      this.a.aL.setText(null);
      this.a.ah = null;
      this.a.A();
    }
    bp localbp = this.a.f();
    cgr localcgr = this.a;
    int i = aau.po;
    Toast localToast = Toast.makeText(localbp, localcgr.g().getString(i), 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chj
 * JD-Core Version:    0.7.0.1
 */