import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseIntArray;

public abstract class gih
  extends mby
  implements DialogInterface.OnClickListener
{
  private int Z = 0;
  
  public final Dialog c(Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.Z = paramBundle.getInt("selected_index");
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.ad);
    localBuilder.setTitle(efj.CF);
    localBuilder.setPositiveButton(17039370, this);
    localBuilder.setNegativeButton(17039360, this);
    localBuilder.setCancelable(true);
    SparseIntArray localSparseIntArray = v();
    String[] arrayOfString = new String[localSparseIntArray.size()];
    for (int i = -1 + localSparseIntArray.size(); i >= 0; i--) {
      arrayOfString[i] = this.ad.getString(localSparseIntArray.valueAt(i));
    }
    localBuilder.setSingleChoiceItems(arrayOfString, this.Z, this);
    return localBuilder.create();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("selected_index", this.Z);
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      if (paramInt >= 0) {
        this.Z = paramInt;
      }
    case -1: 
      int i;
      gii localgii;
      do
      {
        return;
        i = v().keyAt(this.Z);
        if (i == 4)
        {
          a(new Intent("android.intent.action.VIEW", Uri.parse(efj.j("https://support.google.com/legal/troubleshooter/1114905"))));
          return;
        }
        localgii = (gii)mbb.b(this.ad, gii.class);
      } while (localgii == null);
      localgii.c_(i);
      return;
    }
    paramDialogInterface.dismiss();
  }
  
  public abstract SparseIntArray v();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gih
 * JD-Core Version:    0.7.0.1
 */