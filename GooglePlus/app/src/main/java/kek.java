import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class kek
  implements DialogInterface.OnClickListener
{
  kek(kej paramkej) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.d = paramInt;
    this.a.onClick(paramDialogInterface, -1);
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kek
 * JD-Core Version:    0.7.0.1
 */