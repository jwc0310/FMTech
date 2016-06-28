import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ddv
  extends bj
{
  public ddv() {}
  
  public ddv(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("errorCode", paramInt);
    f(localBundle);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    return ((frz)mbb.a(f(), frz.class)).a(this.m.getInt("errorCode"), f(), 0, null);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    bp localbp = f();
    if (localbp != null) {
      localbp.finish();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddv
 * JD-Core Version:    0.7.0.1
 */