import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.profile.suspension.impl.ProfileSuspensionActivity;
import java.util.ArrayList;

public final class jyo
  implements View.OnClickListener
{
  public jyo(ProfileSuspensionActivity paramProfileSuspensionActivity, nvf paramnvf) {}
  
  public final void onClick(View paramView)
  {
    int i = this.a.a;
    ProfileSuspensionActivity localProfileSuspensionActivity = this.b;
    int j = this.b.d.c();
    switch (i)
    {
    default: 
      return;
    case 4: 
      this.b.finish();
      return;
    case 3: 
      gzf localgzf = this.b.f.a(localProfileSuspensionActivity, j);
      this.b.e.a.add(localProfileSuspensionActivity);
      this.b.e.b(localgzf);
      return;
    case 2: 
      iis.a(localProfileSuspensionActivity, j, this.a.c, null);
    }
    this.b.finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyo
 * JD-Core Version:    0.7.0.1
 */