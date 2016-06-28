import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;

public final class hud
  extends bj
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    localBuilder.setMessage("Set tracing token?");
    localBuilder.setPositiveButton(17039370, this);
    localBuilder.setNegativeButton(17039360, this);
    localBuilder.setCancelable(false);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      String str = f().getIntent().getData().getQueryParameter("token");
      if (str == null) {
        str = "";
      }
      SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(f()).edit();
      localEditor.putString("tracing_token_key", str);
      localEditor.putBoolean("debug.plus.frontend.tracing", true);
      localEditor.commit();
    }
    f().finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hud
 * JD-Core Version:    0.7.0.1
 */