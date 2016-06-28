import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.phone.ProfileEditActivity;

final class dfi
  implements jye
{
  public final Intent a(hae paramhae, Context paramContext, int paramInt)
  {
    Intent localIntent = efj.b(paramContext, paramInt, 1, paramhae.a().getByteArray("name_edit_info_bytes"), null);
    localIntent.putExtra("name_violation", true);
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_profile_edit_field", 1);
    gxx localgxx = (gxx)mbb.a(paramContext, gxx.class);
    gxw localgxw = new gxw(paramContext, paramInt);
    localgxw.c = gxz.w;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    return localIntent;
  }
  
  public final gzf a(Context paramContext, int paramInt)
  {
    return new dfj(paramContext, paramInt);
  }
  
  public final Intent b(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, ProfileEditActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("profile_edit_view_type", 26);
    localIntent.putExtra("profile_data_id", 26);
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfi
 * JD-Core Version:    0.7.0.1
 */