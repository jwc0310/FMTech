import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;

public final class mde
  extends bj
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    return new AlertDialog.Builder(f()).setMessage(efj.aba).setPositiveButton(17039370, this).setCancelable(true).create();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (f() != null) {
      f().finish();
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    f().startActivity(new Intent("android.settings.SETTINGS"));
    File localFile = new File(f().getFilesDir(), "paddingStart");
    if (localFile.exists()) {
      localFile.delete();
    }
    f().finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mde
 * JD-Core Version:    0.7.0.1
 */