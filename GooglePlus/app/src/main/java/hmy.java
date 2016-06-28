import android.content.Intent;
import android.net.Uri;
import java.util.List;

public final class hmy
  implements ibz
{
  public final ica a(Intent paramIntent)
  {
    Uri localUri = paramIntent.getData();
    List localList;
    int i;
    if (localUri != null)
    {
      localList = localUri.getPathSegments();
      i = localList.size();
      if (i != 0) {
        break label29;
      }
    }
    label29:
    do
    {
      do
      {
        return null;
        if (("collection".equals(localList.get(0))) && (i >= 2)) {
          return new hna(this, (String)localList.get(1));
        }
        if ("collections".equals(localList.get(0))) {
          return new hmz(this);
        }
      } while (i < 3);
      if (("collection".equals(localList.get(2))) && (i >= 4)) {
        return new hna(this, (String)localList.get(3));
      }
    } while (!"collections".equals(localList.get(2)));
    return new hmz(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmy
 * JD-Core Version:    0.7.0.1
 */