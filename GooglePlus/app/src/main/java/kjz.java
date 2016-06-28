import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import com.google.android.libraries.social.sharekit.impl.MediaPreviewFragment;

public final class kjz
  implements View.OnClickListener
{
  public kjz(MediaPreviewFragment paramMediaPreviewFragment) {}
  
  public final void onClick(View paramView)
  {
    this.a.a.b((ipa)paramView.getTag(), this);
    this.a.b.notifyDataSetChanged();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjz
 * JD-Core Version:    0.7.0.1
 */