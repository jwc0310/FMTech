import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

final class evy
  extends evv
{
  evy(evx paramevx) {}
  
  public final void a(GoogleHelp paramGoogleHelp)
  {
    TogglingData localTogglingData;
    String str1;
    int j;
    View localView;
    if (paramGoogleHelp.x != null)
    {
      localTogglingData = paramGoogleHelp.x;
      Activity localActivity = this.a.b;
      str1 = localActivity.getTitle().toString();
      int i = localActivity.getResources().getIdentifier("action_bar", "id", localActivity.getPackageName());
      if (i == 0) {
        break label183;
      }
      ViewGroup localViewGroup = (ViewGroup)localActivity.findViewById(i);
      if (localViewGroup == null) {
        break label183;
      }
      j = 0;
      if (j >= localViewGroup.getChildCount()) {
        break label183;
      }
      localView = localViewGroup.getChildAt(j);
      if (!(localView instanceof TextView)) {
        break label177;
      }
    }
    label177:
    label183:
    for (String str2 = ((TextView)localView).getText().toString();; str2 = str1)
    {
      localTogglingData.d = str2;
      this.a.a.putExtra("EXTRA_GOOGLE_HELP", paramGoogleHelp).putExtra("EXTRA_START_TICK", System.nanoTime());
      this.a.b.startActivityForResult(this.a.a, 123);
      this.a.a(Status.a);
      return;
      j++;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     evy
 * JD-Core Version:    0.7.0.1
 */