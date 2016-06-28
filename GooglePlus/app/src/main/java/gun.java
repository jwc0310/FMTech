import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class gun
  implements meq, mes, mfa, mfd
{
  public final Activity a;
  final Set<guo> b = new HashSet();
  gux<gud> c;
  
  public gun(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    gud localgud = new gud(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = this.b.iterator();
    int i = 0;
    if (localIterator.hasNext()) {
      if (!((guo)localIterator.next()).a(localgud)) {
        break label85;
      }
    }
    label85:
    for (int j = 1;; j = i)
    {
      i = j;
      break;
      if (i == 0) {
        this.c.a(Integer.valueOf(paramInt1), localgud);
      }
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.c = ((gux)paramBundle.getParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results"));
      return;
    }
    this.c = new gux(gud.class);
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results", this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gun
 * JD-Core Version:    0.7.0.1
 */