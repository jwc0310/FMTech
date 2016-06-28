import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class iiw
  extends mby
  implements DialogInterface.OnClickListener
{
  public nve[] Z;
  public iiv aa;
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.ad);
    hqy localhqy = (hqy)localBundle.getParcelable("user_device_locations");
    nve[] arrayOfnve1;
    boolean bool;
    bp localbp;
    nve[] arrayOfnve2;
    bk localbk;
    if (localhqy == null)
    {
      arrayOfnve1 = null;
      this.Z = arrayOfnve1;
      bool = localBundle.getBoolean("show_actions");
      localbp = f();
      arrayOfnve2 = this.Z;
      localbk = this.n;
      if (!(localbk instanceof iiu)) {
        break label168;
      }
    }
    label168:
    for (iiu localiiu = (iiu)localbk;; localiiu = null)
    {
      this.aa = new iiv(localbp, arrayOfnve2, localiiu, true, this.D, bool);
      localBuilder.setAdapter(this.aa, null);
      localBuilder.setTitle(localBundle.getString("arg_title_text"));
      localBuilder.setPositiveButton(localBundle.getString("arg_positive_button_text"), this);
      localBuilder.setCancelable(true);
      return localBuilder.create();
      arrayOfnve1 = (nve[])localhqy.a(new nve[0]);
      break;
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bk localbk = this.n;
    if ((localbk instanceof iiu)) {
      ((iiu)localbk).a(this.D);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iiw
 * JD-Core Version:    0.7.0.1
 */