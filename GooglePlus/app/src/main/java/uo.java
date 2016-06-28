import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public class uo
  extends bp
  implements ff, tw, up
{
  private uq d;
  
  private boolean g()
  {
    Intent localIntent = b_();
    if (localIntent != null)
    {
      if (cz.a.a(this, localIntent))
      {
        fe localfe = new fe(this);
        a(localfe);
        b(localfe);
        localfe.a();
      }
      for (;;)
      {
        try
        {
          ay.a(this);
          return true;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        cz.a.b(this, localIntent);
      }
    }
    return false;
  }
  
  public void a(aci paramaci) {}
  
  public final void a(fe paramfe)
  {
    boolean bool = this instanceof ff;
    Intent localIntent1 = null;
    if (bool) {
      localIntent1 = ((ff)this).b_();
    }
    if (localIntent1 == null) {}
    for (Intent localIntent2 = cz.a.a(this);; localIntent2 = localIntent1)
    {
      if (localIntent2 != null)
      {
        ComponentName localComponentName = localIntent2.getComponent();
        if (localComponentName == null) {
          localComponentName = localIntent2.resolveActivity(paramfe.b.getPackageManager());
        }
        paramfe.a(localComponentName);
        paramfe.a.add(localIntent2);
      }
      return;
    }
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    e().b(paramView, paramLayoutParams);
  }
  
  public final void aq_()
  {
    e().f();
  }
  
  public void b(aci paramaci) {}
  
  public void b(fe paramfe) {}
  
  public Intent b_()
  {
    return cz.a.a(this);
  }
  
  public final tv d()
  {
    return e().h();
  }
  
  public final uq e()
  {
    if (this.d == null) {
      this.d = uq.a(this, getWindow(), this);
    }
    return this.d;
  }
  
  public MenuInflater getMenuInflater()
  {
    return e().b();
  }
  
  public void invalidateOptionsMenu()
  {
    e().f();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    e().a(paramConfiguration);
  }
  
  public void onContentChanged() {}
  
  public void onCreate(Bundle paramBundle)
  {
    e().i();
    e().a(paramBundle);
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    e().g();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    tp localtp = e().a();
    if ((paramMenuItem.getItemId() == 16908332) && (localtp != null) && ((0x4 & localtp.a()) != 0)) {
      return g();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    e().c();
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    e().e();
  }
  
  public void onStop()
  {
    super.onStop();
    e().d();
  }
  
  public void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    e().a(paramCharSequence);
  }
  
  public void setContentView(int paramInt)
  {
    e().a(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    e().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    e().a(paramView, paramLayoutParams);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     uo
 * JD-Core Version:    0.7.0.1
 */