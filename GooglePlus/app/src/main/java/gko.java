import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import java.util.List;

public class gko
  extends mca
  implements guf
{
  public gko()
  {
    gug localgug = new gug(this.bp, (byte)0);
    this.bo.a(gug.class, localgug);
    localgug.a(efj.CG, this);
  }
  
  public static void a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    localBuilder.setPositiveButton(dl.t, new kwy(paramContext, paramOnClickListener));
    localBuilder.setView(LayoutInflater.from(paramContext).inflate(efj.VQ, null));
    localBuilder.setCancelable(true);
    AlertDialog localAlertDialog = localBuilder.create();
    localAlertDialog.setOnCancelListener(paramOnCancelListener);
    localAlertDialog.show();
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pke.l);
    localgxr.b.add(localgxq);
    new gwz(-1, localgxr.a(paramContext)).b(paramContext);
  }
  
  public static boolean a(Context paramContext)
  {
    boolean bool1 = PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext()).getBoolean("socialcast_warm_welcome_shown", false);
    boolean bool2 = false;
    if (!bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final void a(int paramInt, Intent paramIntent)
  {
    ((gjn)this.A).a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gko
 * JD-Core Version:    0.7.0.1
 */