import android.content.Intent;
import com.google.android.apps.plus.phone.InviteContactActivity;
import com.google.android.apps.plus.phone.PeopleSearchActivity;

public final class dbv
  implements Runnable
{
  public dbv(InviteContactActivity paramInviteContactActivity) {}
  
  public final void run()
  {
    InviteContactActivity localInviteContactActivity = this.a;
    gjp localgjp = localInviteContactActivity.d;
    efj.k();
    int i = localgjp.a;
    String str = localInviteContactActivity.f;
    Intent localIntent = new Intent(localInviteContactActivity, PeopleSearchActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("picker_mode", true);
    localIntent.putExtra("search_circles_usage", -1);
    localIntent.putExtra("search_pub_profiles_enabled", true);
    localIntent.putExtra("search_phones_enabled", false);
    localIntent.putExtra("search_plus_pages_enabled", true);
    localIntent.putExtra("search_in_circles_enabled", false);
    localIntent.putExtra("query", str);
    localIntent.putExtra("filter_null_gaia_ids", false);
    localInviteContactActivity.startActivityForResult(localIntent, 1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbv
 * JD-Core Version:    0.7.0.1
 */