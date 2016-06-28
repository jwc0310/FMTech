import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.List;

public final class kwy
  implements DialogInterface.OnClickListener
{
  public kwy(Context paramContext, DialogInterface.OnClickListener paramOnClickListener) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.a).edit();
    localEditor.putBoolean("socialcast_warm_welcome_shown", true);
    localEditor.apply();
    if (this.b != null)
    {
      Context localContext = this.a;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pke.l);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.a)).b(localContext);
      this.b.onClick(paramDialogInterface, paramInt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwy
 * JD-Core Version:    0.7.0.1
 */