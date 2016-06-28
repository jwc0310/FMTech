import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.pm.PackageManager;

public abstract interface frz
{
  public abstract int a(Context paramContext);
  
  public abstract Dialog a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener);
  
  public abstract void a(PackageManager paramPackageManager, String paramString);
  
  public abstract boolean a(int paramInt);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     frz
 * JD-Core Version:    0.7.0.1
 */