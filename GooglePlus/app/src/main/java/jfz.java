import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutPeopleView;

public final class jfz
  implements View.OnClickListener
{
  public jfz(OneProfileAboutPeopleView paramOneProfileAboutPeopleView) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.c != null) {
      this.a.c.a(paramView.getId(), (String)paramView.getTag());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jfz
 * JD-Core Version:    0.7.0.1
 */