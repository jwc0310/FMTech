import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public final class hjs
  extends mby
  implements DialogInterface.OnClickListener
{
  private final gxj Z = new gxj(this.af, (byte)0);
  private hgw aa;
  private hjk ab;
  private Button ac;
  private gxt ag;
  private Button ah;
  private gxt ai;
  
  public static hjs a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    hjs localhjs = new hjs();
    Bundle localBundle = new Bundle();
    if (paramInt != 0) {
      localBundle.putInt("custom_view", paramInt);
    }
    if (paramString1 != null) {
      localBundle.putString("title", paramString1);
    }
    if (paramString2 != null) {
      localBundle.putCharSequence("message", paramString2);
    }
    if (paramString3 != null) {
      localBundle.putString("positive", paramString3);
    }
    if (paramString4 != null) {
      localBundle.putString("negative", paramString4);
    }
    localhjs.f(localBundle);
    return localhjs;
  }
  
  private final hgw v()
  {
    if (this.aa == null) {
      this.aa = ((hgw)this.ae.a(hgw.class));
    }
    return this.aa;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.ad);
    if (localBundle.containsKey("custom_view"))
    {
      mbf localmbf = this.ad;
      int i = localBundle.getInt("custom_view");
      View localView = LayoutInflater.from(localmbf).inflate(i, null);
      this.ab = ((hjk)localView);
      this.ab.a(localBundle.getString("title"));
      this.ab.b(localBundle.getString("message"));
      if ((localView instanceof gxs)) {
        this.Z.b = new gxk(this, localView);
      }
      localBuilder.setView(localView);
    }
    for (;;)
    {
      if (localBundle.containsKey("positive")) {
        localBuilder.setPositiveButton(localBundle.getString("positive"), this);
      }
      if (localBundle.containsKey("negative")) {
        localBuilder.setNegativeButton(localBundle.getString("negative"), this);
      }
      return localBuilder.create();
      if (localBundle.containsKey("title")) {
        localBuilder.setTitle(localBundle.getString("title"));
      }
      if (localBundle.containsKey("message")) {
        localBuilder.setMessage(localBundle.getString("message"));
      }
    }
  }
  
  public final void m()
  {
    super.m();
    AlertDialog localAlertDialog = (AlertDialog)this.d;
    v().a(this.D, localAlertDialog);
    if (this.ab == null) {}
    do
    {
      return;
      this.ac = localAlertDialog.getButton(-2);
      this.ag = this.ab.a();
      this.ah = localAlertDialog.getButton(-1);
      this.ai = this.ab.b();
      if (this.ag != null) {
        efj.a(this.ac, new gxq(this.ag));
      }
    } while (this.ai == null);
    efj.a(this.ah, new gxq(this.ai));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    v();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    hgw localhgw = v();
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        return;
        localhgw.b(this.D);
      } while (this.ai == null);
      gwz.a(this.ah, 4);
      return;
    } while (this.ag == null);
    gwz.a(this.ac, 4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjs
 * JD-Core Version:    0.7.0.1
 */