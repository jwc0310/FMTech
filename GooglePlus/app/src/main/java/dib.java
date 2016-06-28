import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;

public final class dib
  extends mby
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    String str1 = localBundle.getString("name");
    int i = localBundle.getInt("gender");
    boolean bool = localBundle.getBoolean("target_mute");
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    int j;
    if (bool)
    {
      j = aw.v;
      Object[] arrayOfObject = { str1 };
      localBuilder.setTitle(g().getString(j, arrayOfObject)).setPositiveButton(17039370, this).setNegativeButton(17039360, this).setCancelable(true);
      if (i != 1) {
        break label151;
      }
      if (!bool) {
        break label143;
      }
    }
    String str2;
    label143:
    for (int n = aw.u;; n = aw.ai)
    {
      str2 = g().getString(n);
      localBuilder.setMessage(str2);
      return localBuilder.create();
      j = aw.aj;
      break;
    }
    label151:
    if (i == 2)
    {
      if (bool) {}
      for (int m = aw.s;; m = aw.ag)
      {
        str2 = g().getString(m);
        break;
      }
    }
    if (bool) {}
    for (int k = aw.t;; k = aw.ah)
    {
      str2 = g().getString(k);
      break;
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      ((dhc)this.ae.a(dhc.class)).h(this.m.getBoolean("target_mute"));
      return;
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dib
 * JD-Core Version:    0.7.0.1
 */