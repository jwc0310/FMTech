import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class lfx
  extends mby
  implements DialogInterface.OnClickListener
{
  private String Z;
  private int aa;
  
  public static bj a(String paramString, int paramInt)
  {
    lfx locallfx = new lfx();
    Bundle localBundle = new Bundle();
    localBundle.putString("square_id", paramString);
    localBundle.putInt("square_visibility", paramInt);
    locallfx.f(localBundle);
    return locallfx;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = this.m.getString("square_id");
    this.aa = this.m.getInt("square_visibility");
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    un localun1 = new un(this.ad).a(fa.t);
    localun1.a.n = true;
    un localun2 = localun1.a(fa.x, this).b(fa.a, this);
    if (this.aa == 0) {
      localun2.b(fa.s);
    }
    for (;;)
    {
      return localun2.a();
      localun2.b(fa.r);
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1) {
      ((lfy)this.ae.a(lfy.class)).b(this.Z);
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfx
 * JD-Core Version:    0.7.0.1
 */