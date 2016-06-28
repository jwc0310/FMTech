import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class ctq
  implements View.OnClickListener
{
  ctq(ctp paramctp) {}
  
  public final void onClick(View paramView)
  {
    Object localObject = (mbf)paramView.getContext();
    mbb localmbb = ((mbf)localObject).a;
    git localgit = (git)localmbb.a(git.class);
    Intent localIntent;
    if (localgit.f().c("is_google_plus"))
    {
      localIntent = ((iwu)localmbb.a(iwu.class)).a((Context)localObject, localgit.c(), localgit.f().b("gaia_id"));
      if (!(localObject instanceof ContextWrapper)) {
        break label139;
      }
      if (!(localObject instanceof Activity)) {
        break label128;
      }
    }
    label128:
    label139:
    for (Activity localActivity = (Activity)localObject;; localActivity = null)
    {
      if (((localActivity instanceof iwt)) && (!((iwt)localActivity).d(localIntent))) {
        break label145;
      }
      return;
      localObject = ((ContextWrapper)localObject).getBaseContext();
      break;
    }
    label145:
    ay.a(localActivity, localIntent, ((gvj)mbb.a(localActivity, gvj.class)).a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctq
 * JD-Core Version:    0.7.0.1
 */