import android.content.Context;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.apps.plus.service.SlideshowService;
import java.util.ArrayList;

public final class dnj
  implements Handler.Callback
{
  public dnj(SlideshowService paramSlideshowService) {}
  
  public final boolean handleMessage(Message paramMessage)
  {
    dnl localdnl;
    fj[] arrayOffj;
    SlideshowService localSlideshowService;
    Bundle localBundle;
    int i;
    Context localContext;
    String str1;
    String str2;
    String str3;
    boolean bool1;
    boolean bool2;
    Object localObject;
    if (paramMessage.what == 1)
    {
      localdnl = new dnl(this.a);
      arrayOffj = new fj[1];
      localSlideshowService = this.a;
      localBundle = this.a.b;
      i = localBundle.getInt("account_id", -1);
      localContext = localSlideshowService.getApplicationContext();
      str1 = localBundle.getString("view_id");
      str2 = localBundle.getString("tile_id");
      str3 = localBundle.getString("photo_id");
      bool1 = localBundle.getBoolean("oob_only", false);
      bool2 = localBundle.getBoolean("show_oob_tile", false);
      long l = localBundle.getLong("all_photos_row_id");
      int j = localBundle.getInt("all_photos_offset", 0);
      if (!localSlideshowService.f) {
        break label169;
      }
      localObject = new aqb(localContext, i, null, Long.valueOf(l), j, 10000, 0);
    }
    for (;;)
    {
      arrayOffj[0] = localObject;
      localdnl.execute(arrayOffj);
      return true;
      label169:
      if (localSlideshowService.e)
      {
        boolean bool3 = localBundle.containsKey("shareables");
        ArrayList localArrayList = null;
        if (bool3) {
          localArrayList = localBundle.getParcelableArrayList("shareables");
        }
        ipf localipf = (ipf)localBundle.getParcelable("photo_ref");
        localObject = new dch(localContext, localArrayList, localBundle.getInt("filter", 0), localipf, str1, null);
      }
      else
      {
        localObject = new def(localContext, i, str1, str2, str3, bool2, bool1, localBundle.getInt("filter", 0));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnj
 * JD-Core Version:    0.7.0.1
 */