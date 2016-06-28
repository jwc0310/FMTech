import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.squares.impl.HostSquareMemberSearchActivity;
import com.google.android.apps.plus.squares.impl.HostSquareStreamActivity;
import com.google.android.apps.plus.squares.impl.SquareMemberListActivity;
import com.google.android.apps.plus.squares.impl.SquareStreamSettingsActivity;
import com.google.android.libraries.social.squares.impl.homepage.DiscoverSquaresActivity;

public final class dtp
  implements dsr
{
  private final Context a;
  
  public dtp(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt)
  {
    return ((kyg)mbb.a(this.a, kyg.class)).a(paramInt).a();
  }
  
  public final Intent a(int paramInt, String paramString)
  {
    return new Intent(this.a, SquareStreamSettingsActivity.class).putExtra("account_id", paramInt).putExtra("square_id", paramString);
  }
  
  public final Intent a(int paramInt1, String paramString, int paramInt2)
  {
    return new Intent(this.a, HostSquareMemberSearchActivity.class).putExtra("account_id", paramInt1).putExtra("square_id", paramString).putExtra("square_membership", paramInt2);
  }
  
  public final Intent a(int paramInt1, String paramString, int paramInt2, int paramInt3, Integer paramInteger)
  {
    Intent localIntent = new Intent(this.a, SquareMemberListActivity.class).putExtra("account_id", paramInt1).putExtra("square_id", paramString).putExtra("square_membership", paramInt2).putExtra("square_joinability", paramInt3);
    if (paramInteger != null) {
      localIntent.putExtra("square_member_list_type", paramInteger.intValue());
    }
    return localIntent;
  }
  
  public final Intent a(int paramInt, String paramString1, String paramString2)
  {
    return new Intent(this.a, HostSquareStreamActivity.class).putExtra("account_id", paramInt).putExtra("square_id", paramString1).putExtra("stream_id", paramString2);
  }
  
  public final Intent a(int paramInt, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    return new Intent(this.a, HostSquareStreamActivity.class).putExtra("account_id", paramInt).putExtra("square_id", paramString1).putExtra("stream_id", null).putExtra("com.google.android.libraries.social.notifications.notif_id", paramString3).putExtra("com.google.android.libraries.social.notifications.updated_version", paramLong);
  }
  
  public final lpi a(Context paramContext)
  {
    return new dtf(paramContext);
  }
  
  public final Intent b(int paramInt)
  {
    return new Intent(this.a, DiscoverSquaresActivity.class).putExtra("account_id", paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtp
 * JD-Core Version:    0.7.0.1
 */