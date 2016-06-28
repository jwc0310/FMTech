import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import com.google.android.apps.photos.content.GooglePhotoDownsyncProvider;
import com.google.android.apps.photos.service.GooglePhotoDownsyncService;
import com.google.android.apps.plus.phone.ConversationListActivity;

public final class duj
{
  private static final mcq a = new mcq("debug.plus.restore_p_intent");
  private static final mcq b = new mcq("debug.plus.show_old_p", false);
  private static final String[] c = { "com.google.android.apps.photos.phone.GetContentActivityAlias", "com.google.android.apps.photos.phone.SendContentActivityAlias", "com.google.android.apps.photos.phone.SetWallpaperActivityAlias", "com.google.android.apps.plus.phone.VideoViewActivityAlias", "com.google.android.apps.plus.phone.HostPhotoViewIntentActivityAlias", "com.google.android.apps.plus.service.EsDreamService", "com.google.android.libraries.social.ingest.IngestActivity", "com.google.android.libraries.social.ingest.IngestService" };
  private static final String[] d = { "com.google.android.apps.photoeditor.fragments.PhotoEditorActivityAlias", "com.google.android.apps.photoeditor.fragments.PlusCropActivityAlias" };
  
  public static Intent a(Context paramContext, String paramString)
  {
    if (duk.a(paramContext.getPackageManager())) {
      return a("market://details", paramString);
    }
    return a("https://play.google.com/store/apps/details", paramString);
  }
  
  private static Intent a(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    Uri.Builder localBuilder = Uri.parse(paramString1).buildUpon();
    localBuilder.appendQueryParameter("id", "com.google.android.apps.photos");
    localBuilder.appendQueryParameter("referrer", paramString2);
    localIntent.setData(localBuilder.build());
    localIntent.addFlags(524288);
    return localIntent;
  }
  
  public static boolean a()
  {
    return (Build.DEVICE.equalsIgnoreCase("deb")) || (Build.DEVICE.equals("flo"));
  }
  
  public static boolean a(Context paramContext)
  {
    return (g(paramContext)) && (!dtz.a(paramContext, "com.google.android.apps.photos", "com.google.android.apps.photos.trampoline"));
  }
  
  public static boolean b(Context paramContext)
  {
    return (a(paramContext)) && (paramContext.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos") != null);
  }
  
  public static boolean c(Context paramContext)
  {
    return (g(paramContext)) && (dtz.a(paramContext, "com.google.android.apps.photos", "com.google.android.apps.photos.trampoline"));
  }
  
  public static void d(Context paramContext)
  {
    if (g(paramContext)) {
      if (paramContext.getPackageManager().getComponentEnabledSetting(new ComponentName(paramContext, ConversationListActivity.class)) != 2) {
        break label50;
      }
    }
    label50:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        efj.a(paramContext, new ComponentName(paramContext, ConversationListActivity.class), false);
      }
      return;
    }
  }
  
  public static void e(Context paramContext)
  {
    int i = 0;
    if (!fpf.a(((duh)mbb.a(paramContext, duh.class)).a, "plusone:prevent_disabling_p_components_in_gplus_app", false)) {}
    for (int j = 1;; j = 0)
    {
      boolean bool = a(paramContext);
      if ((j == 0) || (!bool)) {
        break label169;
      }
      arrayOfString3 = c;
      i1 = arrayOfString3.length;
      for (i2 = 0; i2 < i1; i2++) {
        efj.a(paramContext, new ComponentName(paramContext, arrayOfString3[i2]), false);
      }
    }
    arrayOfString4 = d;
    i3 = arrayOfString4.length;
    for (i4 = 0; i4 < i3; i4++) {
      efj.a(paramContext, new ComponentName(paramContext, arrayOfString4[i4]), true);
    }
    GooglePhotoDownsyncService.c(paramContext);
    efj.a(paramContext, new ComponentName(paramContext, GooglePhotoDownsyncService.class), false);
    efj.a(paramContext, new ComponentName(paramContext, GooglePhotoDownsyncProvider.class.getCanonicalName()), true);
    label169:
    while (j != 0)
    {
      String[] arrayOfString3;
      int i1;
      int i2;
      String[] arrayOfString4;
      int i3;
      int i4;
      return;
    }
    String[] arrayOfString1 = c;
    int k = arrayOfString1.length;
    for (int m = 0; m < k; m++) {
      efj.a(paramContext, arrayOfString1[m], false);
    }
    String[] arrayOfString2 = d;
    int n = arrayOfString2.length;
    while (i < n)
    {
      efj.a(paramContext, arrayOfString2[i], true);
      i++;
    }
    GooglePhotoDownsyncService.b(paramContext);
  }
  
  public static Intent f(Context paramContext)
  {
    return paramContext.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos");
  }
  
  private static boolean g(Context paramContext)
  {
    return (dtz.a(paramContext, "com.google.android.apps.photos")) && (dtz.b(paramContext, "com.google.android.apps.photos"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duj
 * JD-Core Version:    0.7.0.1
 */