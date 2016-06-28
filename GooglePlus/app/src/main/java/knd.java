import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;

final class knd
  implements DialogInterface.OnClickListener
{
  knd(knc paramknc) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (!(this.a.f() instanceof kni)) {
      Log.e("DeleteDraftDialog", "Host activity must implement DraftDeleterDialogEvents interface");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knd
 * JD-Core Version:    0.7.0.1
 */