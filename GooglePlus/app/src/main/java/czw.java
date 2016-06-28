import android.content.Intent;
import android.net.Uri;

public final class czw
  implements ibz
{
  static dam b(Intent paramIntent)
  {
    if (paramIntent.hasExtra("customAppUri")) {}
    for (Uri localUri = Uri.parse(paramIntent.getStringExtra("customAppUri")); localUri == null; localUri = paramIntent.getData()) {
      return null;
    }
    return new dam(localUri);
  }
  
  public final ica a(Intent paramIntent)
  {
    dam localdam = b(paramIntent);
    if (localdam == null) {}
    int i;
    do
    {
      return null;
      i = localdam.a;
    } while ((i == 31) || (i == 0));
    return new czx();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czw
 * JD-Core Version:    0.7.0.1
 */