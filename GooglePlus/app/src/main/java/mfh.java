import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class mfh
  extends bj
  implements mej
{
  public final med af = new med();
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.af.b(paramBundle);
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.af.a(paramInt1, paramInt2, paramIntent);
    super.a(paramInt1, paramInt2, paramIntent);
  }
  
  public final void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.af.a(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void a(Activity paramActivity)
  {
    this.af.a(paramActivity);
    super.a(paramActivity);
  }
  
  public void a(Bundle paramBundle)
  {
    this.af.c(paramBundle);
    super.a(paramBundle);
  }
  
  public final void a(Menu paramMenu)
  {
    if (this.af.b(paramMenu)) {
      d(true);
    }
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    if (this.af.a(paramMenu)) {
      d(true);
    }
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    this.af.a(paramView, paramBundle);
    super.a(paramView, paramBundle);
  }
  
  public final boolean a_(MenuItem paramMenuItem)
  {
    return this.af.b(paramMenuItem);
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    if (this.af.a(paramMenuItem)) {
      return true;
    }
    return super.b(paramMenuItem);
  }
  
  public void d_()
  {
    this.af.a();
    super.d_();
  }
  
  public void e(Bundle paramBundle)
  {
    this.af.d(paramBundle);
    super.e(paramBundle);
  }
  
  public final void f(boolean paramBoolean)
  {
    this.af.a(paramBoolean);
    super.f(paramBoolean);
  }
  
  public void f_()
  {
    this.af.d();
    super.f_();
  }
  
  public final mek i_()
  {
    return this.af;
  }
  
  public void m()
  {
    aau.a(h());
    this.af.l();
    super.m();
  }
  
  public void n()
  {
    this.af.b();
    super.n();
  }
  
  public void o()
  {
    this.af.c();
    super.o();
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.af.a(paramContextMenu, paramView, paramContextMenuInfo);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    this.af.n();
    super.onLowMemory();
  }
  
  public void p_()
  {
    aau.a(h());
    this.af.k();
    super.p_();
  }
  
  public void q_()
  {
    this.af.m();
    super.q_();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfh
 * JD-Core Version:    0.7.0.1
 */