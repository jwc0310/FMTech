import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public abstract class czn
  extends mbp
  implements DialogInterface.OnClickListener, gxv
{
  private cmf d;
  
  public czn()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(bk parambk)
  {
    super.a(parambk);
    if ((parambk instanceof cmf)) {
      this.d = ((cmf)parambk);
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    this.d.A();
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      paramDialogInterface.dismiss();
      return;
      setResult(0);
      finish();
    }
  }
  
  public Dialog onCreateDialog(int paramInt, Bundle paramBundle)
  {
    if (paramInt == 901235)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setMessage(aau.fA);
      localBuilder.setPositiveButton(aau.vS, this);
      localBuilder.setNegativeButton(aau.ly, this);
      localBuilder.setCancelable(true);
      return localBuilder.create();
    }
    if (paramInt == 297895)
    {
      ProgressDialog localProgressDialog = new ProgressDialog(this);
      localProgressDialog.setProgressStyle(0);
      localProgressDialog.setMessage(getString(aau.po));
      localProgressDialog.setCancelable(false);
      return localProgressDialog;
    }
    return null;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if ((i == 16908332) || (i == aaw.fc))
    {
      this.d.A();
      return true;
    }
    if (i == aaw.ff)
    {
      this.d.w();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    MenuItem localMenuItem = paramMenu.findItem(aaw.ff);
    if (this.d.v())
    {
      localMenuItem.setEnabled(true);
      localMenuItem.getIcon().setAlpha(255);
      return true;
    }
    localMenuItem.setEnabled(false);
    localMenuItem.getIcon().setAlpha(130);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czn
 * JD-Core Version:    0.7.0.1
 */