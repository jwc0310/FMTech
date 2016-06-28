import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class dfd
  implements ibz
{
  private final Context a;
  
  public dfd(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final ica a(Intent paramIntent)
  {
    if (!"android.intent.action.VIEW".equals(paramIntent.getAction())) {}
    Uri localUri;
    do
    {
      return null;
      localUri = paramIntent.getData();
    } while ((localUri == null) || (!"vnd.android.cursor.item/vnd.googleplus.profile".equals(this.a.getContentResolver().getType(localUri))));
    return new dfe();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfd
 * JD-Core Version:    0.7.0.1
 */