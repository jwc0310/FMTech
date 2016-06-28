import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class eeu
  extends bj
{
  Dialog Z = null;
  DialogInterface.OnCancelListener aa = null;
  
  public final void a(bw parambw, String paramString)
  {
    super.a(parambw, paramString);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    if (this.Z == null) {
      this.c = false;
    }
    return this.Z;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.aa != null) {
      this.aa.onCancel(paramDialogInterface);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eeu
 * JD-Core Version:    0.7.0.1
 */