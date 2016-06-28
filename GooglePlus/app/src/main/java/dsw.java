import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class dsw
  implements DialogInterface.OnClickListener
{
  dsw(dsu paramdsu) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    oea localoea = new oea();
    localoea.a = 1;
    localoea.b = 1;
    Intent localIntent = efj.b(this.a.Z, this.a.aa, 36, qat.a(localoea), null);
    this.a.Z.startActivity(localIntent);
    lgk locallgk = new lgk(this.a.Z, this.a.aa, 4);
    ((gzj)mbb.a(this.a.Z, gzj.class)).b(locallgk);
    gwz.a(this.a.ab, 4);
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dsw
 * JD-Core Version:    0.7.0.1
 */