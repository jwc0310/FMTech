import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.squares.impl.homepage.FollowedSquaresActivity;

final class lcv
  implements View.OnClickListener
{
  lcv(lcu paramlcu) {}
  
  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a.bn, FollowedSquaresActivity.class);
    localIntent.putExtra("account_id", this.a.a);
    ay.a(this.a.f(), localIntent, ((gvj)this.a.bo.a(gvj.class)).a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcv
 * JD-Core Version:    0.7.0.1
 */