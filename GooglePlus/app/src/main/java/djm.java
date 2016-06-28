import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.photos.viewer.pager.HostPhotoPagerActivity;
import com.google.android.apps.plus.phone.HostAllFoldersTileActivity;
import com.google.android.apps.plus.phone.HostSingleAlbumTileActivity;
import com.google.android.apps.plus.phone.HostStreamAllFoldersTileActivity;
import com.google.android.apps.plus.phone.HostStreamOneUpActivity;
import com.google.android.apps.plus.phone.HostStreamPhotoPagerActivity;
import com.google.android.apps.plus.phone.HostStreamPhotosHomeTileActivity;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import com.google.android.apps.plus.phone.MiniShareActivity;
import com.google.android.apps.plus.phone.PhotoStreamOneUpActivity;
import com.google.android.apps.plus.phone.SelectFromHomePhotosActivity;
import com.google.android.apps.plus.phone.StreamMiniShareActivity;
import com.google.android.apps.plus.settings.MainSettingsPhotosActivity;
import com.google.android.apps.plus.settings.MainSettingsPlusActivity;

public final class djm
  implements mbo, mds, mfd
{
  private static final kl<String, Class<?>> a;
  private final Context b;
  private boolean c;
  
  static
  {
    kl localkl = new kl(8);
    a = localkl;
    localkl.put(StreamMiniShareActivity.class.getName(), MiniShareActivity.class);
    a.put(HostStreamAllFoldersTileActivity.class.getName(), HostAllFoldersTileActivity.class);
    a.put(HostStreamSingleAlbumTileActivity.class.getName(), HostSingleAlbumTileActivity.class);
    a.put(HostStreamPhotoPagerActivity.class.getName(), HostPhotoPagerActivity.class);
    a.put(HostStreamPhotosHomeTileActivity.class.getName(), SelectFromHomePhotosActivity.class);
    a.put(HostStreamOneUpActivity.class.getName(), PhotoStreamOneUpActivity.class);
    a.put(MainSettingsPlusActivity.class.getName(), MainSettingsPhotosActivity.class);
  }
  
  djm(Context paramContext, mek parammek)
  {
    this.b = paramContext;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    if (mbb.a(paramContext, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
  
  public final void b(Intent paramIntent)
  {
    Context localContext = this.b;
    if ((!this.c) || (paramIntent.getComponent() == null) || (paramIntent.getComponent().getClass() == null)) {}
    Class localClass;
    do
    {
      return;
      localClass = (Class)a.get(paramIntent.getComponent().getClassName());
    } while (localClass == null);
    paramIntent.setClass(localContext, localClass);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     djm
 * JD-Core Version:    0.7.0.1
 */