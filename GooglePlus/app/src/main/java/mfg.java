import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class mfg
  extends tt
  implements mej
{
  private int d;
  public final mdt n = new mdt((byte)0);
  
  private final void a(Intent paramIntent)
  {
    int i = this.d;
    this.d = (i + 1);
    if (i == 0) {
      this.n.b(paramIntent);
    }
  }
  
  public final void a(aci paramaci)
  {
    this.n.h();
    super.a(paramaci);
  }
  
  public void a(bk parambk)
  {
    this.n.a(parambk);
    super.a(parambk);
  }
  
  public final void a(bk parambk, Intent paramIntent, int paramInt)
  {
    a(paramIntent);
    super.a(parambk, paramIntent, paramInt);
    this.d = (-1 + this.d);
  }
  
  public final void b(aci paramaci)
  {
    this.n.i();
    super.b(paramaci);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (this.n.a(paramKeyEvent)) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void finish()
  {
    this.n.g();
    super.finish();
  }
  
  public final mek i_()
  {
    return this.n;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.n.a(paramInt1, paramInt2, paramIntent);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onAttachedToWindow()
  {
    this.n.d();
    super.onAttachedToWindow();
  }
  
  public void onBackPressed()
  {
    if (!this.n.j()) {
      super.onBackPressed();
    }
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    if (this.n.a(paramMenuItem)) {
      return true;
    }
    return super.onContextItemSelected(paramMenuItem);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.n.c(paramBundle);
    super.onCreate(paramBundle);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.n.a(paramContextMenu, paramView, paramContextMenuInfo);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.n.a(paramMenu)) {
      return true;
    }
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public void onDestroy()
  {
    this.n.c();
    super.onDestroy();
  }
  
  public void onDetachedFromWindow()
  {
    this.n.e();
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.n.a(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.n.b(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    this.n.n();
    super.onLowMemory();
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    this.n.a(paramIntent);
    super.onNewIntent(paramIntent);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.n.b(paramMenuItem)) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public void onPause()
  {
    this.n.b();
    super.onPause();
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    this.n.a(paramBundle);
    super.onPostCreate(paramBundle);
  }
  
  public void onPostResume()
  {
    this.n.a();
    super.onPostResume();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if (this.n.b(paramMenu)) {
      return true;
    }
    return super.onPrepareOptionsMenu(paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.n.a(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    this.n.b(paramBundle);
    super.onRestoreInstanceState(paramBundle);
  }
  
  public void onResume()
  {
    aau.a(this.b.a.d);
    this.n.l();
    super.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    this.n.d(paramBundle);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStart()
  {
    aau.a(this.b.a.d);
    this.n.k();
    super.onStart();
  }
  
  public void onStop()
  {
    this.n.m();
    super.onStop();
  }
  
  public void onUserLeaveHint()
  {
    this.n.f();
    super.onUserLeaveHint();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    this.n.a(paramBoolean);
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
 * Qualified Name:     mfg
 * JD-Core Version:    0.7.0.1
 */