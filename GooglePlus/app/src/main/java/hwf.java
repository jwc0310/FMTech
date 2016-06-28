import android.content.Context;
import android.content.Intent;

final class hwf
  implements ibz
{
  private final Context a;
  
  hwf(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final ica a(Intent paramIntent)
  {
    if (("android.intent.action.EDIT".equals(paramIntent.getAction())) && (String.valueOf(paramIntent.resolveType(this.a)).startsWith("image/"))) {
      return new hwb();
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwf
 * JD-Core Version:    0.7.0.1
 */