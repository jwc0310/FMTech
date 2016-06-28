import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class coo
  extends bj
{
  DialogInterface.OnCancelListener Z;
  
  public static coo a(String paramString1, String paramString2)
  {
    return a(null, paramString2, true, true);
  }
  
  public static coo a(String paramString1, String paramString2, boolean paramBoolean)
  {
    return a(paramString1, paramString2, paramBoolean, paramBoolean);
  }
  
  public static coo a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    Bundle localBundle = new Bundle();
    if (paramString1 != null) {
      localBundle.putString("title", paramString1);
    }
    localBundle.putString("message", paramString2);
    localBundle.putBoolean("cancelable_outside", paramBoolean2);
    coo localcoo = new coo();
    localcoo.f(localBundle);
    localcoo.b(paramBoolean1);
    return localcoo;
  }
  
  public final void a(bw parambw, String paramString)
  {
    try
    {
      super.a(parambw, paramString);
      return;
    }
    catch (IllegalStateException localIllegalStateException) {}
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    ProgressDialog localProgressDialog = new ProgressDialog(new ContextThemeWrapper(f(), efj.yV));
    if (localBundle.containsKey("title")) {
      localProgressDialog.setTitle(localBundle.getString("title"));
    }
    localProgressDialog.setMessage(localBundle.getString("message"));
    localProgressDialog.setCancelable(this.b);
    localProgressDialog.setCanceledOnTouchOutside(localBundle.getBoolean("cancelable_outside"));
    localProgressDialog.setProgressStyle(0);
    return localProgressDialog;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.Z != null) {
      this.Z.onCancel(paramDialogInterface);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     coo
 * JD-Core Version:    0.7.0.1
 */