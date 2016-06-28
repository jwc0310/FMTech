import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class dod
  implements DialogInterface.OnClickListener
{
  dod(dob paramdob) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.f = paramInt;
    this.a.onClick(paramDialogInterface, -1);
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dod
 * JD-Core Version:    0.7.0.1
 */