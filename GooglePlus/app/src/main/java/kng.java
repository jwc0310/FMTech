import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.sharekit.impl.drafts.DraftsFragment;

final class kng
  implements View.OnClickListener
{
  kng(knf paramknf, long paramLong, String paramString) {}
  
  public final void onClick(View paramView)
  {
    bp localbp = this.c.g.f();
    Intent localIntent = localbp.getIntent();
    localIntent.putExtra("extra_draft_id", this.a);
    localIntent.putExtra("activity_id", this.b);
    localbp.setResult(-1, localIntent);
    localbp.finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kng
 * JD-Core Version:    0.7.0.1
 */