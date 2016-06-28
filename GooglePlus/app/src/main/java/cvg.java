import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class cvg
  implements jtk
{
  private Context a;
  
  public cvg(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, mlu parammlu)
  {
    if ((parammlu.e == null) || (parammlu.e.a == null) || (parammlu.e.a.length == 0)) {}
    ArrayList localArrayList;
    do
    {
      return null;
      localArrayList = new ArrayList();
      for (mmn localmmn : parammlu.e.a) {
        if (!TextUtils.isEmpty(localmmn.a)) {
          localArrayList.add(new bpx(localmmn.a, null, null));
        }
      }
    } while (localArrayList.isEmpty());
    try
    {
      byte[] arrayOfByte = bpw.a(localArrayList);
      Intent localIntent = efj.a(this.a, paramInt, arrayOfByte, null);
      return localIntent;
    }
    catch (IOException localIOException)
    {
      Log.e("ProfileListDestHandler", "Unable to serialize DataActor list", localIOException);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvg
 * JD-Core Version:    0.7.0.1
 */