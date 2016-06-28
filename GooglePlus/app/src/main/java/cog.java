import android.app.SharedElementCallback;
import android.view.View;
import com.google.android.apps.plus.views.OneProfileAvatarView;
import com.google.android.apps.plus.views.OneProfileHeader;
import java.util.List;
import java.util.Map;

final class cog
  extends SharedElementCallback
{
  cog(cob paramcob) {}
  
  public final void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
  {
    ddo localddo = this.a.c;
    if (localddo.ad != null) {}
    for (OneProfileAvatarView localOneProfileAvatarView = localddo.ad.l;; localOneProfileAvatarView = null)
    {
      if (localOneProfileAvatarView != null) {
        paramMap.put(paramList.get(0), localOneProfileAvatarView);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cog
 * JD-Core Version:    0.7.0.1
 */