import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.sharekit.impl.CommentBoxFragment;
import com.google.android.libraries.social.sharekit.impl.ComposedContentFragment;

public final class kja
  implements View.OnClickListener
{
  public kja(ComposedContentFragment paramComposedContentFragment) {}
  
  public final void onClick(View paramView)
  {
    paramView.setVisibility(8);
    paramView.setOnClickListener(null);
    if (this.a.c.h) {
      this.a.a.v();
    }
    this.a.c.e();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kja
 * JD-Core Version:    0.7.0.1
 */