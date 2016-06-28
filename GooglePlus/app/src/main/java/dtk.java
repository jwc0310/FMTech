import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.spaces.SpaceFollowButton;

final class dtk
  implements View.OnClickListener
{
  dtk(dti paramdti, lfk paramlfk) {}
  
  public final void onClick(View paramView)
  {
    if ((paramView instanceof SpaceFollowButton)) {
      this.a.a(((SpaceFollowButton)paramView).b, this.b.a, this.b.h);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtk
 * JD-Core Version:    0.7.0.1
 */