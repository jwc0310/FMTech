import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;

public final class asf
  extends bj
  implements DialogInterface.OnClickListener
{
  public static asf a(isq paramisq)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("selected_media", paramisq);
    asf localasf = new asf();
    localasf.f(localBundle);
    return localasf;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    bp localbp = f();
    git localgit = (git)mbb.a(localbp, git.class);
    hyi localhyi = (hyi)mbb.a(localbp, hyi.class);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localbp);
    localBuilder.setNegativeButton(aau.cM, this);
    if (localhyi.b(bwb.B, localgit.c()))
    {
      localBuilder.setTitle(aau.hS);
      localBuilder.setPositiveButton(aau.la, this);
      int j = aau.hR;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(60L);
      localBuilder.setMessage(g().getString(j, arrayOfObject2));
    }
    for (;;)
    {
      localBuilder.setCancelable(false);
      AlertDialog localAlertDialog = localBuilder.create();
      localAlertDialog.show();
      localAlertDialog.getButton(-1).setTextColor(g().getColor(efj.kn));
      localAlertDialog.getButton(-2).setTextColor(g().getColor(efj.jW));
      return localAlertDialog;
      localBuilder.setPositiveButton(aau.eR, this);
      int i = aau.hQ;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(60L);
      localBuilder.setMessage(g().getString(i, arrayOfObject1));
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      isq localisq = (isq)this.m.getParcelable("selected_media");
      ((asl)mbb.a(f(), asl.class)).a(localisq, false);
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     asf
 * JD-Core Version:    0.7.0.1
 */