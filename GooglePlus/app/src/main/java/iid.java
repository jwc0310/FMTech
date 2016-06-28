import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.graphics.Bitmap;
import android.os.Parcelable;

final class iid
  implements jpe
{
  iid(iic paramiic) {}
  
  public final void a(jpg paramjpg)
  {
    if (paramjpg.a())
    {
      iic localiic = this.a;
      localiic.h.putExtra("from_shortcut", true);
      localiic.h.setPackage(localiic.b.getPackageName());
      Intent localIntent1 = localiic.h;
      String str1 = localiic.g;
      Parcelable localParcelable = localiic.i;
      Intent localIntent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
      localIntent2.putExtra("android.intent.extra.shortcut.INTENT", localIntent1);
      localIntent2.putExtra("android.intent.extra.shortcut.NAME", str1);
      if (localParcelable != null)
      {
        if (!(localParcelable instanceof Intent.ShortcutIconResource)) {
          break label136;
        }
        localIntent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", localParcelable);
      }
      for (;;)
      {
        localIntent2.putExtra("duplicate", true);
        localiic.b.sendBroadcast(localIntent2);
        localiic.b(efj.NK);
        return;
        label136:
        if (!(localParcelable instanceof Bitmap)) {
          break;
        }
        localIntent2.putExtra("android.intent.extra.shortcut.ICON", localParcelable);
      }
      String str2 = String.valueOf(localParcelable);
      throw new IllegalArgumentException(23 + String.valueOf(str2).length() + "Unknown icon resource: " + str2);
    }
    this.a.b(efj.NL);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iid
 * JD-Core Version:    0.7.0.1
 */