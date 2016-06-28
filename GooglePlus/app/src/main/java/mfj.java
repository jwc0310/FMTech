import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class mfj
  extends bp
  implements mej
{
  private int d;
  public final mdt k = new mdt((byte)0);
  
  private final void a(Intent paramIntent)
  {
    int i = this.d;
    this.d = (i + 1);
    if (i == 0) {
      this.k.b(paramIntent);
    }
  }
  
  public final void a(bk parambk)
  {
    this.k.a(parambk);
    super.a(parambk);
  }
  
  public final void a(bk parambk, Intent paramIntent, int paramInt)
  {
    a(paramIntent);
    super.a(parambk, paramIntent, paramInt);
    this.d = (-1 + this.d);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (this.k.a(paramKeyEvent)) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void finish()
  {
    this.k.g();
    super.finish();
  }
  
  public final mek i_()
  {
    return this.k;
  }
  
  @TargetApi(11)
  public void onActionModeFinished(ActionMode paramActionMode)
  {
    this.k.i();
    super.onActionModeFinished(paramActionMode);
  }
  
  @TargetApi(11)
  public void onActionModeStarted(ActionMode paramActionMode)
  {
    this.k.h();
    super.onActionModeStarted(paramActionMode);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.k.a(paramInt1, paramInt2, paramIntent);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onAttachedToWindow()
  {
    this.k.d();
    super.onAttachedToWindow();
  }
  
  public void onBackPressed()
  {
    if (!this.k.j()) {
      super.onBackPressed();
    }
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    if (this.k.a(paramMenuItem)) {
      return true;
    }
    return super.onContextItemSelected(paramMenuItem);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.k.c(paramBundle);
    super.onCreate(paramBundle);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.k.a(paramContextMenu, paramView, paramContextMenuInfo);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.k.a(paramMenu)) {
      return true;
    }
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public void onDestroy()
  {
    this.k.c();
    super.onDestroy();
  }
  
  public void onDetachedFromWindow()
  {
    this.k.e();
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.k.a(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.k.b(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    this.k.n();
    super.onLowMemory();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    this.k.a(paramIntent);
    super.onNewIntent(paramIntent);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.k.b(paramMenuItem)) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public void onPause()
  {
    this.k.b();
    super.onPause();
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    this.k.a(paramBundle);
    super.onPostCreate(paramBundle);
  }
  
  protected void onPostResume()
  {
    this.k.a();
    super.onPostResume();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if (this.k.b(paramMenu)) {
      return true;
    }
    return super.onPrepareOptionsMenu(paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.k.a(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    this.k.b(paramBundle);
    super.onRestoreInstanceState(paramBundle);
  }
  
  public void onResume()
  {
    aau.a(this.b.a.d);
    this.k.l();
    super.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    this.k.d(paramBundle);
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    aau.a(this.b.a.d);
    this.k.k();
    super.onStart();
  }
  
  protected void onStop()
  {
    this.k.m();
    super.onStop();
  }
  
  protected void onUserLeaveHint()
  {
    this.k.f();
    super.onUserLeaveHint();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    this.k.a(paramBoolean);
    super.onWindowFocusChanged(paramBoolean);
  }
  
  public void startActivity(Intent paramIntent)
  {
    a(paramIntent);
    super.startActivity(paramIntent);
    this.d = (-1 + this.d);
  }
  
  @TargetApi(16)
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    a(paramIntent);
    super.startActivity(paramIntent, paramBundle);
    this.d = (-1 + this.d);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    a(paramIntent);
    super.startActivityForResult(paramIntent, paramInt);
    this.d = (-1 + this.d);
  }
  
  @TargetApi(16)
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    a(paramIntent);
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
    this.d = (-1 + this.d);
  }
  
  @TargetApi(16)
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    a(paramIntent);
    super.startActivityFromFragment(paramFragment, paramIntent, paramInt, paramBundle);
    this.d = (-1 + this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfj
 * JD-Core Version:    0.7.0.1
 */