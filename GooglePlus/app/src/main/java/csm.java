import android.content.Intent;

public final class csm
  implements ibz
{
  public final ica a(Intent paramIntent)
  {
    if (!"com.google.android.apps.plus.LOCATION_PLUS_MAP".equals(paramIntent.getAction())) {
      return null;
    }
    return new csn();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csm
 * JD-Core Version:    0.7.0.1
 */