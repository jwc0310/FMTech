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

public class mfi
  extends bk
  implements mej
{
  public final med bp = new med();
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.bp.b(paramBundle);
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.bp.a(paramInt1, paramInt2, paramIntent);
    super.a(paramInt1, paramInt2, paramIntent);
  }
  
  public final void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.bp.a(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void a(Activity paramActivity)
  {
    this.bp.a(paramActivity);
    super.a(paramActivity);
  }
  
  public void a(Bundle paramBundle)
  {
    this.bp.c(paramBundle);
    super.a(paramBundle);
  }
  
  public void a(Menu paramMenu)
  {
    if (this.bp.b(paramMenu)) {
      d(true);
    }
  }
  
  public void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    if (this.bp.a(paramMenu)) {
      d(true);
    }
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    this.bp.a(paramView, paramBundle);
    super.a(paramView, paramBundle);
  }
  
  public boolean a_(MenuItem paramMenuItem)
  {
    return this.bp.b(paramMenuItem);
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    if (this.bp.a(paramMenuItem)) {
      return true;
    }
    return super.b(paramMenuItem);
  }
  
  public void d(Bundle paramBundle)
  {
    this.bp.a(paramBundle);
    super.d(paramBundle);
  }
  
  public void d_()
  {
    this.bp.a();
    super.d_();
  }
  
  public void e(Bundle paramBundle)
  {
    this.bp.d(paramBundle);
    super.e(paramBundle);
  }
  
  public final void f(boolean paramBoolean)
  {
    this.bp.a(paramBoolean);
    super.f(paramBoolean);
  }
  
  public void f_()
  {
    this.bp.d();
    super.f_();
  }
  
  public final mek i_()
  {
    return this.bp;
  }
  
  public void m()
  {
    aau.a(h());
    this.bp.l();
    super.m();
  }
  
  public void n()
  {
    this.bp.b();
    super.n();
  }
  
  public void o()
  {
    this.bp.c();
    super.o();
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.bp.a(paramContextMenu, paramView, paramContextMenuInfo);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    this.bp.n();
    super.onLowMemory();
  }
  
  public void p_()
  {
    aau.a(h());
    this.bp.k();
    super.p_();
  }
  
  public void q_()
  {
    this.bp.m();
    super.q_();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfi
 * JD-Core Version:    0.7.0.1
 */