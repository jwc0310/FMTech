import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.sharekit.impl.MediaPreviewFragment;
import java.util.List;

public final class kka
  extends ArrayAdapter<ipa>
{
  public kka(MediaPreviewFragment paramMediaPreviewFragment, Context paramContext, int paramInt, List paramList)
  {
    super(paramContext, 17367043, paramList);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.a.f().getLayoutInflater().inflate(efj.UR, null);
    }
    WindowManager localWindowManager = this.a.f().getWindowManager();
    Resources localResources = this.a.g();
    if (getCount() > 1) {}
    for (boolean bool = true;; bool = false)
    {
      int i = MediaPreviewFragment.a(localWindowManager, localResources, bool);
      lxk locallxk = new lxk(i, i);
      locallxk.a = false;
      paramView.setLayoutParams(locallxk);
      ipa localipa = (ipa)getItem(paramInt);
      MediaView localMediaView = (MediaView)paramView.findViewById(aau.Bs);
      localMediaView.r = efj.b(this.a.g());
      localMediaView.q = efj.b(this.a.g());
      localMediaView.setContentDescription(localipa.f());
      localMediaView.a(localipa.e(), null, true);
      View localView = paramView.findViewById(aau.BD);
      localView.setOnClickListener(this.a.c);
      localView.setTag(localipa);
      return paramView;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kka
 * JD-Core Version:    0.7.0.1
 */