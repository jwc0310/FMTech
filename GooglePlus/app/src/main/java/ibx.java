import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.google.android.libraries.social.gateway.GatewayActivity;

public final class ibx
  extends bj
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    localBuilder.setMessage(this.m.getString("error_message"));
    localBuilder.setPositiveButton(17039370, this);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bp localbp = f();
    if (localbp != null)
    {
      int i = this.m.getInt("result_code");
      ((GatewayActivity)localbp).a(i);
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    onCancel(paramDialogInterface);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibx
 * JD-Core Version:    0.7.0.1
 */