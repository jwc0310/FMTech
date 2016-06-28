import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.List;

final class akr
  implements DialogInterface.OnClickListener
{
  akr(akl paramakl) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt != -1)
    {
      paramDialogInterface.dismiss();
      return;
    }
    mbf localmbf = this.a.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjw.u);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this.a.bn)).b(localmbf);
    aiq localaiq = ((alu)this.a.f()).e();
    if (!localaiq.i) {}
    for (boolean bool = true;; bool = false)
    {
      localaiq.j = bool;
      localaiq.a(null);
      this.a.v();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akr
 * JD-Core Version:    0.7.0.1
 */