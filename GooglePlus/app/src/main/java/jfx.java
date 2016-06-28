import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class jfx
  implements View.OnClickListener
{
  public jfx(jfw paramjfw) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.d != null)
    {
      AvatarView localAvatarView = (AvatarView)paramView;
      this.a.d.a(localAvatarView.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jfx
 * JD-Core Version:    0.7.0.1
 */