import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;

final class kne
  implements DialogInterface.OnClickListener
{
  kne(knc paramknc) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bp localbp = this.a.f();
    if ((localbp instanceof kni))
    {
      ((kni)localbp).a(this.a.Z);
      return;
    }
    Log.e("DeleteDraftDialog", "Host activity must implement DraftDeleterDialogEvents interface");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kne
 * JD-Core Version:    0.7.0.1
 */