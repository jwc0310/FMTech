import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class byy
  extends bj
  implements DialogInterface.OnClickListener
{
  public static bj a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Intent paramIntent, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("title", paramCharSequence1);
    localBundle.putCharSequence("message", paramCharSequence2);
    localBundle.putCharSequence("positive", paramCharSequence3);
    localBundle.putParcelable("intent", paramIntent);
    localBundle.putParcelable("activity_options", paramBundle);
    byy localbyy = new byy();
    localbyy.f(localBundle);
    return localbyy;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    localBuilder.setTitle(localBundle.getCharSequence("title"));
    localBuilder.setMessage(localBundle.getCharSequence("message"));
    localBuilder.setPositiveButton(localBundle.getCharSequence("positive"), this);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      a(false);
      return;
      if ((i()) && (!this.F))
      {
        Intent localIntent = (Intent)this.m.getParcelable("intent");
        Bundle localBundle = (Bundle)this.m.getParcelable("activity_options");
        if ((localBundle != null) && (Build.VERSION.SDK_INT >= 16)) {
          f().startActivity(localIntent, localBundle);
        } else {
          a(localIntent);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byy
 * JD-Core Version:    0.7.0.1
 */