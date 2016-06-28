import android.content.Context;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.apps.plus.views.UnifiedSearchHeader;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dzw
  implements Runnable
{
  public dzw(UnifiedSearchHeader paramUnifiedSearchHeader) {}
  
  public final void run()
  {
    UnifiedSearchHeader localUnifiedSearchHeader = this.a;
    Context localContext = localUnifiedSearchHeader.getContext();
    if (localContext != null)
    {
      localUnifiedSearchHeader.b();
      localUnifiedSearchHeader.d.removeAllViews();
      int i = 0;
      if (i < localUnifiedSearchHeader.o)
      {
        AvatarView localAvatarView = new AvatarView(localContext);
        localAvatarView.a(0);
        localAvatarView.setVisibility(8);
        LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(UnifiedSearchHeader.a, UnifiedSearchHeader.a);
        if (i > 0) {}
        for (int j = UnifiedSearchHeader.b;; j = 0)
        {
          localLayoutParams1.leftMargin = j;
          localAvatarView.setLayoutParams(localLayoutParams1);
          localUnifiedSearchHeader.d.addView(localAvatarView);
          i++;
          break;
        }
      }
      localUnifiedSearchHeader.c();
      localUnifiedSearchHeader.f.removeAllViews();
      int k = 0;
      if (k < localUnifiedSearchHeader.p)
      {
        MediaView localMediaView1 = new MediaView(localContext);
        localMediaView1.s = 0;
        localMediaView1.setVisibility(8);
        LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(UnifiedSearchHeader.a, UnifiedSearchHeader.a);
        if (k > 0) {}
        for (int m = UnifiedSearchHeader.b;; m = 0)
        {
          localLayoutParams2.leftMargin = m;
          localMediaView1.setLayoutParams(localLayoutParams2);
          localUnifiedSearchHeader.f.addView(localMediaView1);
          k++;
          break;
        }
      }
      localUnifiedSearchHeader.a(localUnifiedSearchHeader.m, localUnifiedSearchHeader.e, localUnifiedSearchHeader.f);
      localUnifiedSearchHeader.h.removeAllViews();
      int n = 0;
      if (n < localUnifiedSearchHeader.q)
      {
        MediaView localMediaView2 = new MediaView(localContext);
        localMediaView2.s = 0;
        localMediaView2.p = UnifiedSearchHeader.c;
        localMediaView2.q = UnifiedSearchHeader.c;
        localMediaView2.setVisibility(8);
        LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(UnifiedSearchHeader.a, UnifiedSearchHeader.a);
        if (n > 0) {}
        for (int i1 = UnifiedSearchHeader.b;; i1 = 0)
        {
          localLayoutParams3.leftMargin = i1;
          localMediaView2.setLayoutParams(localLayoutParams3);
          localUnifiedSearchHeader.h.addView(localMediaView2);
          n++;
          break;
        }
      }
      localUnifiedSearchHeader.a(localUnifiedSearchHeader.n, localUnifiedSearchHeader.g, localUnifiedSearchHeader.h);
    }
    this.a.invalidate();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzw
 * JD-Core Version:    0.7.0.1
 */