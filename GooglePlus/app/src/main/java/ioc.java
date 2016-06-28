import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public final class ioc
  extends mby
  implements iof
{
  private LayoutInflater Z;
  private ikz aa;
  private giz ab;
  private iod ac = new iod(this.af);
  
  public ioc()
  {
    a(0, aaw.oR);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = this.Z.inflate(efj.OM, paramViewGroup, false);
    ((ListView)localView.findViewById(16908298)).setAdapter(this.ac);
    this.ac.e = this;
    return localView;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a(true);
    this.aa.a(paramString1, paramString2);
  }
  
  public final void b(String paramString1, String paramString2)
  {
    a(true);
    int i = this.ab.b(paramString1, paramString2);
    this.aa.a(i);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Dialog localDialog = super.c(paramBundle);
    localDialog.setTitle(do.e);
    return localDialog;
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = LayoutInflater.from(new ContextThemeWrapper(this.ad, this.a));
    this.aa = ((ikz)this.ae.a(ikz.class));
    this.ab = ((giz)this.ae.a(giz.class));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    super.onCancel(paramDialogInterface);
    this.aa.e();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ioc
 * JD-Core Version:    0.7.0.1
 */