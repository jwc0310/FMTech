import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class dsv
  implements DialogInterface.OnClickListener
{
  dsv(dsu paramdsu) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    lgk locallgk = new lgk(this.a.Z, this.a.aa, 5);
    ((gzj)mbb.a(this.a.Z, gzj.class)).b(locallgk);
    gwz.a(this.a.ac, 4);
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dsv
 * JD-Core Version:    0.7.0.1
 */