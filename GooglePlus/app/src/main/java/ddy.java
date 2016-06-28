import android.content.Intent;
import android.net.Uri;
import java.util.List;

public final class ddy
  implements ibz
{
  public final ica a(Intent paramIntent)
  {
    int i = 2;
    Uri localUri = paramIntent.getData();
    if (!efj.a(localUri)) {
      return null;
    }
    List localList = localUri.getPathSegments();
    if (localList.size() == 4)
    {
      boolean bool = "people".equals(localList.get(0));
      int j = 0;
      if (bool) {
        j = 1;
      }
      if (j != 0) {}
    }
    else
    {
      return null;
    }
    String str = (String)localList.get(i);
    if (str.equals("peopleInCommon")) {
      i = 1;
    }
    while (str.equals("peopleInOwnerCircles")) {
      return new ddz(i, (String)localList.get(1), (String)localList.get(3));
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddy
 * JD-Core Version:    0.7.0.1
 */