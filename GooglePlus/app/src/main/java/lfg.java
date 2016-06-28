import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class lfg
  extends mby
  implements DialogInterface.OnClickListener
{
  private String Z;
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = this.m.getString("square_id");
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    un localun = new un(this.ad).b(fa.y);
    localun.a.n = true;
    return localun.a(fa.w, this).b(fa.a, this).a();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1) {
      ((lfh)this.ae.a(lfh.class)).a(this.Z);
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfg
 * JD-Core Version:    0.7.0.1
 */