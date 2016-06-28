import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class ind
  extends mby
  implements DialogInterface.OnClickListener
{
  private ikz Z;
  
  public final Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    localBuilder.setTitle(efj.OE);
    localBuilder.setMessage(efj.OA);
    localBuilder.setPositiveButton(efj.OC, this);
    localBuilder.setNegativeButton(17039360, this);
    return localBuilder.create();
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((ikz)this.ae.a(ikz.class));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.Z.e();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      this.Z.aH_();
      return;
    }
    this.Z.e();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ind
 * JD-Core Version:    0.7.0.1
 */