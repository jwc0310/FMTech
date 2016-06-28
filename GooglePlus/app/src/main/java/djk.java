import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class djk
  extends mby
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    localBuilder.setTitle(aw.ae);
    localBuilder.setPositiveButton(aw.af, this);
    localBuilder.setNegativeButton(17039360, this);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      String str = this.m.getString("person_id");
      ((dhf)this.ae.a(dhf.class)).k(str);
      return;
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     djk
 * JD-Core Version:    0.7.0.1
 */