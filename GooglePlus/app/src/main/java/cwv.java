import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.people.ui.CircleWithAvatarsViewGroup;

final class cwv
  extends agt
  implements View.OnClickListener
{
  public CircleWithAvatarsViewGroup p;
  public View q;
  public Intent r;
  private Activity s;
  
  public cwv(Activity paramActivity, View paramView)
  {
    super(paramView);
    this.s = paramActivity;
    this.p = ((CircleWithAvatarsViewGroup)paramView.findViewById(efj.AB));
    this.q = paramView.findViewById(efj.AD);
    paramView.setOnClickListener(new gxn(this));
  }
  
  public final void onClick(View paramView)
  {
    this.s.startActivity(this.r);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwv
 * JD-Core Version:    0.7.0.1
 */