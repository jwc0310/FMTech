import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Environment;
import android.preference.PreferenceManager;
import java.io.File;

final class iyu
  implements iyj
{
  public final boolean a(Context paramContext)
  {
    boolean bool1 = PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("com.google.android.libraries.social.networkqueue.impl.MEDIA_CACHE_CLEAN_COMPLETE_KEY", false);
    boolean bool2 = false;
    if (!bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final void b(Context paramContext)
  {
    int i = 0;
    File localFile = paramContext.getExternalCacheDir();
    if ((localFile != null) && (Environment.getExternalStorageState().equals("mounted")))
    {
      String[] arrayOfString = localFile.list();
      if (arrayOfString != null)
      {
        int j = arrayOfString.length;
        for (int k = 0; k < j; k++) {
          if (new File(localFile, arrayOfString[k]).delete()) {
            i++;
          }
        }
        if (i == arrayOfString.length) {
          PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putBoolean("com.google.android.libraries.social.networkqueue.impl.MEDIA_CACHE_CLEAN_COMPLETE_KEY", true).apply();
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iyu
 * JD-Core Version:    0.7.0.1
 */