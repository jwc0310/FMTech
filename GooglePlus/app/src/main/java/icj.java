import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class icj
  extends bj
{
  public final Dialog c(Bundle paramBundle)
  {
    int i = this.m.getInt("errorCode");
    return ((frz)mbb.a(f(), frz.class)).a(i, f(), 0, this);
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    super.onCancel(paramDialogInterface);
    onDismiss(paramDialogInterface);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    bp localbp = f();
    if (localbp != null) {
      localbp.finish();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     icj
 * JD-Core Version:    0.7.0.1
 */