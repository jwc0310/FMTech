import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class dhh
  extends jhu
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    String str = this.m.getString("entity_name");
    bp localbp = f();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localbp);
    if (TextUtils.isEmpty(str)) {
      localBuilder.setTitle(aw.c);
    }
    for (;;)
    {
      localBuilder.setPositiveButton(aw.d, this);
      localBuilder.setNegativeButton(17039360, this);
      localBuilder.setCancelable(true);
      View localView = LayoutInflater.from(localbp).inflate(efj.AS, null);
      ((TextView)localView.findViewById(ehr.F)).setVisibility(8);
      v();
      localBuilder.setView(localView);
      return localBuilder.create();
      int i = aw.a;
      Object[] arrayOfObject = { str };
      localBuilder.setTitle(g().getString(i, arrayOfObject));
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      Bundle localBundle = (Bundle)this.m.getParcelable("callback_data");
      ((dgy)this.ae.a(dgy.class)).a(localBundle);
      return;
    }
    paramDialogInterface.dismiss();
  }
  
  protected final void v()
  {
    a(f().getString(aw.b), "plusone_promo_block");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dhh
 * JD-Core Version:    0.7.0.1
 */