import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class inb
  extends mby
{
  private ikz Z;
  
  public static void a(bw parambw)
  {
    bj localbj = (bj)parambw.a("login.progress");
    if (localbj != null) {}
    try
    {
      localbj.a(false);
      return;
    }
    catch (Exception localException) {}
  }
  
  public static void a(bw parambw, String paramString, boolean paramBoolean)
  {
    if (parambw.a("login.progress") != null) {}
    for (int i = 1; i != 0; i = 0) {
      throw new IllegalStateException("Progress dialog is already showing");
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString);
    localBundle.putBoolean("cancelable", paramBoolean);
    inb localinb = new inb();
    localinb.f(localBundle);
    localinb.a(parambw, "login.progress");
  }
  
  public static boolean b(bw parambw)
  {
    return parambw.a("login.progress") != null;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    ProgressDialog localProgressDialog = new ProgressDialog(new ContextThemeWrapper(f(), aau.Ae));
    localProgressDialog.setMessage(this.m.getString("message"));
    localProgressDialog.setProgressStyle(0);
    localProgressDialog.setCancelable(this.m.getBoolean("cancelable"));
    return localProgressDialog;
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((ikz)this.ae.a(ikz.class));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    super.onCancel(paramDialogInterface);
    this.Z.e();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     inb
 * JD-Core Version:    0.7.0.1
 */