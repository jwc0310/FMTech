import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.photos.phone.GetContentActivity;
import java.util.List;

public final class bpy
  extends iwb
{
  private final Context a;
  private final giz b;
  
  static
  {
    new iwd(iwf.b, 0, null, null);
  }
  
  public bpy(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  @TargetApi(18)
  public final Intent a(boolean paramBoolean)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(this.a, GetContentActivity.class));
    localIntent.setAction("android.intent.action.GET_CONTENT");
    localIntent.putExtra("exclude_tab_auto_awesome", true);
    localIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
    localIntent.addFlags(524288);
    localIntent.putExtra("is_for_movie_maker_launch", true);
    localIntent.setType("*/*");
    return localIntent;
  }
  
  public final void a(Context paramContext)
  {
    List localList = this.b.a(new String[] { "logged_in" });
    int i = localList.size();
    for (int j = 0; j < i; j++) {
      bua.c(paramContext, ((Integer)localList.get(j)).intValue());
    }
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt != -1)
    {
      int i;
      if (!"TRUE".equalsIgnoreCase(dun.j.a()))
      {
        ((ivl)mbb.a(this.a, ivl.class)).a();
        i = 0;
        if (i == 0) {
          break label138;
        }
        Context localContext = this.a;
        Resources localResources = localContext.getResources();
        boolean bool1 = localResources.getBoolean(efj.je);
        boolean bool2 = localResources.getBoolean(efj.jf);
        gjb localgjb = ((giz)mbb.a(localContext, giz.class)).a(paramInt);
        if ((!localgjb.a("auto_awesome", bool1)) || (!localgjb.a("auto_awesome_movies", bool2))) {
          break label132;
        }
      }
      label132:
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label138;
        }
        return true;
        i = 1;
        break;
      }
    }
    label138:
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpy
 * JD-Core Version:    0.7.0.1
 */