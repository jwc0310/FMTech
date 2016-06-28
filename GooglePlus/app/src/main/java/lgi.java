import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class lgi
  implements DialogInterface.OnClickListener
{
  lgi(lgg paramlgg) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    lgk locallgk = new lgk(this.a.Z, this.a.aa, 9);
    ((gzj)mbb.a(this.a.Z, gzj.class)).b(locallgk);
    gwz.a(this.a.ab, 4);
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lgi
 * JD-Core Version:    0.7.0.1
 */