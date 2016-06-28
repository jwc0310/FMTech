import android.content.Intent;
import java.util.Set;

public final class jee
  implements ibz
{
  public final ica a(Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getCategories() == null) || (!paramIntent.getCategories().contains("android.intent.category.NOTIFICATION_PREFERENCES"))) {
      return null;
    }
    return new jef();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jee
 * JD-Core Version:    0.7.0.1
 */