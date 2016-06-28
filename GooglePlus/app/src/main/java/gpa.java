import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;

public final class gpa
  extends mby
  implements DialogInterface.OnClickListener
{
  public static <T extends bk,  extends gpb> gpa a(Parcelable paramParcelable, T paramT)
  {
    gpa localgpa = new gpa();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("item", paramParcelable);
    localgpa.f(localBundle);
    localgpa.n = paramT;
    localgpa.p = 0;
    return localgpa;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.ad);
    Resources localResources = this.ad.getResources();
    localBuilder.setTitle(localResources.getString(efj.Ev));
    localBuilder.setMessage(localResources.getString(efj.Eu));
    localBuilder.setPositiveButton(localResources.getString(17039370), this);
    localBuilder.setNegativeButton(localResources.getString(17039360), null);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bk localbk = this.n;
    if ((localbk instanceof gpb))
    {
      Parcelable localParcelable = this.m.getParcelable("item");
      ((gpb)localbk).b(localParcelable);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpa
 * JD-Core Version:    0.7.0.1
 */