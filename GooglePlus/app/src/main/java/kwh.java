import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.socialcast.impl.StreamCastActivity;

public final class kwh
  extends luv
{
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d.setCanceledOnTouchOutside(false);
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    super.onCancel(paramDialogInterface);
    bp localbp = f();
    if ((localbp instanceof StreamCastActivity)) {
      ((StreamCastActivity)localbp).g();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwh
 * JD-Core Version:    0.7.0.1
 */