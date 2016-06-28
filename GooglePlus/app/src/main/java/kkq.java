import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.List;

@TargetApi(14)
final class kkq
{
  final Context a;
  final View b;
  final int c;
  final AvatarView d;
  final TextView e;
  boolean f;
  private final MediaView[] g;
  
  kkq(Context paramContext, View paramView, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramView;
    this.f = paramBoolean;
    this.c = paramContext.getResources().getDimensionPixelSize(efj.UH);
    this.d = ((AvatarView)paramView.findViewById(aau.BA));
    this.e = ((TextView)paramView.findViewById(aau.BC));
    MediaView[] arrayOfMediaView1 = new MediaView[3];
    arrayOfMediaView1[0] = ((MediaView)paramView.findViewById(aau.BN));
    arrayOfMediaView1[1] = ((MediaView)paramView.findViewById(aau.BO));
    arrayOfMediaView1[2] = ((MediaView)paramView.findViewById(aau.BP));
    this.g = arrayOfMediaView1;
    MediaView[] arrayOfMediaView2 = this.g;
    int i = arrayOfMediaView2.length;
    for (int j = 0; j < i; j++) {
      arrayOfMediaView2[j].o = false;
    }
    this.d.g = false;
    int k;
    if (Build.VERSION.SDK_INT >= 14)
    {
      k = 1;
      if (k == 0) {
        break label232;
      }
      paramView.setVisibility(0);
      if (!paramBoolean) {
        break label221;
      }
    }
    label221:
    for (float f1 = 0.0F;; f1 = -this.c)
    {
      paramView.setY(f1);
      paramView.animate().setInterpolator(new DecelerateInterpolator()).setDuration(250L);
      return;
      k = 0;
      break;
    }
    label232:
    if (paramBoolean) {}
    for (int m = 0;; m = 8)
    {
      paramView.setVisibility(m);
      return;
    }
  }
  
  final void a(List<ipa> paramList)
  {
    int i = paramList.size();
    int j = Math.max(0, i - this.g.length);
    int i1;
    for (int k = 0; j < i; k = i1)
    {
      ipa localipa = (ipa)paramList.get(j);
      MediaView[] arrayOfMediaView2 = this.g;
      i1 = k + 1;
      MediaView localMediaView = arrayOfMediaView2[k];
      localMediaView.setVisibility(0);
      localMediaView.a(localipa.e());
      j++;
    }
    for (;;)
    {
      int m;
      if (m < this.g.length)
      {
        MediaView[] arrayOfMediaView1 = this.g;
        int n = m + 1;
        arrayOfMediaView1[m].setVisibility(8);
        m = n;
      }
      else
      {
        return;
        m = k;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkq
 * JD-Core Version:    0.7.0.1
 */