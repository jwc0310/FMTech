import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import com.google.android.libraries.social.location.FriendLocationsListItemView;

public final class iix
  implements View.OnClickListener
{
  public iix(FriendLocationsListItemView paramFriendLocationsListItemView) {}
  
  public final void onClick(View paramView)
  {
    FriendLocationsListItemView localFriendLocationsListItemView = this.a;
    PopupMenu localPopupMenu = new PopupMenu(localFriendLocationsListItemView.getContext(), paramView);
    localPopupMenu.setOnMenuItemClickListener(localFriendLocationsListItemView);
    localPopupMenu.inflate(efj.Oe);
    localPopupMenu.show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iix
 * JD-Core Version:    0.7.0.1
 */