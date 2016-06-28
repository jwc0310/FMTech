import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public final class ilw
  extends mby
  implements DialogInterface.OnClickListener
{
  private ikz Z;
  private giz aa;
  private pde ab;
  
  public static void a(bw parambw, String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString);
    localBundle.putIntArray("account_ids", paramArrayOfInt);
    localBundle.putBoolean("add_account_enabled", paramBoolean);
    ilw localilw = new ilw();
    localilw.f(localBundle);
    localilw.a(parambw, "account.selector");
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    ContextThemeWrapper localContextThemeWrapper = new ContextThemeWrapper(f(), efj.Oz);
    Bundle localBundle = this.m;
    String str = localBundle.getString("title");
    int[] arrayOfInt = localBundle.getIntArray("account_ids");
    boolean bool = localBundle.getBoolean("add_account_enabled");
    if (this.ab != null) {
      this = new pdg(this.ab, "AccountSelection", this);
    }
    return new AlertDialog.Builder(localContextThemeWrapper).setTitle(str).setAdapter(new ilv(localContextThemeWrapper, arrayOfInt, bool), this).setCancelable(false).create();
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((ikz)this.ae.a(ikz.class));
    this.aa = ((giz)this.ae.a(giz.class));
    this.ab = ((pde)this.ae.b(pde.class));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.Z.e();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int[] arrayOfInt = this.m.getIntArray("account_ids");
    boolean bool = this.m.getBoolean("add_account_enabled");
    ikz localikz = (ikz)this.ae.a(ikz.class);
    int i;
    if ((bool) && (paramInt == arrayOfInt.length)) {
      i = 1;
    }
    while (i == 0)
    {
      int j = arrayOfInt[paramInt];
      if (!this.aa.c(j))
      {
        localikz.e();
        return;
        i = 0;
      }
      else
      {
        gjb localgjb = this.aa.a(j);
        localikz.a(localgjb.b("account_name"), localgjb.b("effective_gaia_id"));
        return;
      }
    }
    localikz.d();
  }
  
  public final void p_()
  {
    super.p_();
    Dialog localDialog = this.d;
    if (localDialog == null) {
      return;
    }
    Resources localResources = g();
    ((AlertDialog)localDialog).getListView().setDivider(null);
    View localView1 = localDialog.findViewById(localResources.getIdentifier("titleDivider", "id", "android"));
    if (localView1 != null) {
      localView1.setVisibility(8);
    }
    View localView2 = localDialog.findViewById(localResources.getIdentifier("title_template", "id", "android"));
    LinearLayout.LayoutParams localLayoutParams;
    int j;
    int k;
    if (localView2 != null)
    {
      localView2.setBackgroundColor(localResources.getColor(aw.aF));
      localLayoutParams = (LinearLayout.LayoutParams)localView2.getLayoutParams();
      if (Build.VERSION.SDK_INT < 17) {
        break label198;
      }
      j = localLayoutParams.getMarginStart();
      k = localLayoutParams.getMarginEnd();
      localLayoutParams.setMarginStart(0);
      localLayoutParams.setMarginEnd(0);
    }
    for (;;)
    {
      localView2.setLayoutParams(localLayoutParams);
      localView2.setPadding(j, localView2.getPaddingTop(), k, localView2.getPaddingBottom());
      int i = localResources.getIdentifier("alertTitle", "id", "android");
      TextView localTextView = (TextView)this.d.findViewById(i);
      if (localTextView == null) {
        break;
      }
      localTextView.setTypeface(null, 1);
      return;
      label198:
      j = localLayoutParams.leftMargin;
      k = localLayoutParams.rightMargin;
      localLayoutParams.setMargins(0, localLayoutParams.topMargin, 0, localLayoutParams.bottomMargin);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ilw
 * JD-Core Version:    0.7.0.1
 */