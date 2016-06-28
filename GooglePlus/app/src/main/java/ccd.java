import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.service.EsService;

public final class ccd
  extends bj
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    bp localbp = f();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localbp);
    localBuilder.setMessage(localbp.getString(aau.eQ));
    localBuilder.setPositiveButton(17039370, this);
    localBuilder.setNegativeButton(17039360, this);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case -1: 
      do
      {
        return;
      } while (!(this.n instanceof cbs));
      cbs localcbs = (cbs)this.n;
      localcbs.d(aau.fY);
      bp localbp = localcbs.f();
      int i = localcbs.a.c();
      String str1 = localcbs.b;
      String str2 = localcbs.ab;
      Intent localIntent = EsService.e.a(localbp, EsService.class);
      localIntent.putExtra("op", 908);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("event_id", str1);
      localIntent.putExtra("auth_key", str2);
      localcbs.aj = Integer.valueOf(EsService.a(localbp, localIntent));
      return;
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccd
 * JD-Core Version:    0.7.0.1
 */