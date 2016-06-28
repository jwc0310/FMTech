import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;

public final class lzw
  implements mbo, mdp, mev, mfd
{
  public boolean a = true;
  ArrayList<lzv> b = new ArrayList();
  private final Activity c;
  private git d;
  private tt e;
  private kbn f;
  
  private lzw(Activity paramActivity, mek parammek)
  {
    this.c = paramActivity;
    parammek.a(this);
  }
  
  lzw(Activity paramActivity, mek parammek, git paramgit)
  {
    this.c = paramActivity;
    parammek.a(this);
    if ((paramActivity instanceof tt)) {
      this.e = ((tt)paramActivity);
    }
    this.d = paramgit;
  }
  
  public lzw(tt paramtt, mek parammek)
  {
    this(paramtt, parammek);
    this.e = paramtt;
  }
  
  @TargetApi(16)
  private final boolean a(Activity paramActivity)
  {
    Intent localIntent = paramActivity.getParentActivityIntent();
    kbn localkbn;
    int i;
    if ((localIntent == null) && (this.f != null))
    {
      localkbn = this.f;
      if (this.d != null) {
        break label80;
      }
      i = -1;
    }
    for (;;)
    {
      localIntent = localkbn.a(paramActivity, i);
      if ((localIntent != null) && (paramActivity.shouldUpRecreateTask(localIntent)))
      {
        TaskStackBuilder localTaskStackBuilder = TaskStackBuilder.create(paramActivity);
        paramActivity.onCreateNavigateUpTaskStack(localTaskStackBuilder);
        paramActivity.onPrepareNavigateUpTaskStack(localTaskStackBuilder);
        localTaskStackBuilder.startActivities();
        try
        {
          paramActivity.finishAffinity();
          return true;
          label80:
          i = this.d.c();
        }
        catch (IllegalStateException localIllegalStateException)
        {
          for (;;)
          {
            paramActivity.finish();
          }
        }
      }
    }
    return false;
  }
  
  private final boolean a(tt paramtt)
  {
    Intent localIntent = paramtt.b_();
    kbn localkbn;
    int i;
    if ((localIntent == null) && (this.f != null))
    {
      localkbn = this.f;
      if (this.d != null) {
        break label106;
      }
      i = -1;
    }
    for (;;)
    {
      localIntent = localkbn.a(paramtt, i);
      if ((localIntent != null) && (cz.a.a(paramtt, localIntent)))
      {
        fe localfe = new fe(paramtt);
        paramtt.a(localfe);
        paramtt.b(localfe);
        if (localfe.a.size() == 0) {
          localfe.a.add(localIntent);
        }
        localfe.a();
        try
        {
          ay.a(paramtt);
          return true;
          label106:
          i = this.d.c();
        }
        catch (IllegalStateException localIllegalStateException)
        {
          for (;;)
          {
            paramtt.finish();
          }
        }
      }
    }
    return false;
  }
  
  public final lzw a(lzv paramlzv)
  {
    if (this.b.contains(paramlzv)) {
      throw new IllegalStateException("UpNavigationHandler already on stack.");
    }
    this.b.add(paramlzv);
    return this;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.f = ((kbn)mbb.b(this.c, kbn.class));
    this.d = ((git)parammbb.b(git.class));
  }
  
  public final boolean a()
  {
    int i = -1 + this.b.size();
    if (i >= 0) {
      if (!((lzv)this.b.get(i)).s_()) {}
    }
    do
    {
      return true;
      i--;
      break;
      if (lzt.a(this.c))
      {
        this.c.onBackPressed();
        return true;
      }
      if (this.e == null) {
        break label87;
      }
    } while (a(this.e));
    label87:
    while ((Build.VERSION.SDK_INT < 16) || (!a(this.c)))
    {
      this.c.onBackPressed();
      return true;
    }
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332) {
      return a();
    }
    return false;
  }
  
  public final void b_(Bundle paramBundle)
  {
    if (this.e != null)
    {
      tp localtp = this.e.e().a();
      if (localtp != null) {
        localtp.c(this.a);
      }
    }
    ActionBar localActionBar;
    do
    {
      do
      {
        return;
      } while (Build.VERSION.SDK_INT < 11);
      localActionBar = this.c.getActionBar();
    } while (localActionBar == null);
    localActionBar.setDisplayHomeAsUpEnabled(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzw
 * JD-Core Version:    0.7.0.1
 */