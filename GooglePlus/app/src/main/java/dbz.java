import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.widget.ArrayAdapter;
import com.google.android.apps.plus.phone.InviteContactActivity;

public final class dbz
  extends bj
  implements DialogInterface.OnClickListener
{
  public dbz() {}
  
  @SuppressLint({"ValidFragment"})
  public dbz(String[] paramArrayOfString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putStringArray("emails", paramArrayOfString);
    f(localBundle);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(new ContextThemeWrapper(f(), efj.yV));
    localBuilder.setTitle(aau.bJ);
    localBuilder.setAdapter(new ArrayAdapter(f(), 17367058, this.m.getStringArray("emails")), this);
    localBuilder.setNegativeButton(17039360, this);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    f().finish();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -2)
    {
      f().finish();
      return;
    }
    Bundle localBundle = this.m;
    ((InviteContactActivity)f()).a(localBundle.getStringArray("emails")[paramInt]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbz
 * JD-Core Version:    0.7.0.1
 */