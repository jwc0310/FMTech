import android.annotation.TargetApi;
import android.app.Activity;
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

public class mff
  extends Activity
  implements mej
{
  private int a;
  public final mdt b = new mdt();
  
  private final void a(Intent paramIntent)
  {
    int i = this.a;
    this.a = (i + 1);
    if (i == 0) {
      this.b.b(paramIntent);
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (this.b.a(paramKeyEvent)) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void finish()
  {
    this.b.g();
    super.finish();
  }
  
  public final mek i_()
  {
    return this.b;
  }
  
  @TargetApi(11)
  public void onActionModeFinished(ActionMode paramActionMode)
  {
    this.b.i();
    super.onActionModeFinished(paramActionMode);
  }
  
  @TargetApi(11)
  public void onActionModeStarted(ActionMode paramActionMode)
  {
    this.b.h();
    super.onActionModeStarted(paramActionMode);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.b.a(paramInt1, paramInt2, paramIntent);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onAttachedToWindow()
  {
    this.b.d();
    super.onAttachedToWindow();
  }
  
  public void onBackPressed()
  {
    if (!this.b.j()) {
      super.onBackPressed();
    }
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    if (this.b.a(paramMenuItem)) {
      return true;
    }
    return super.onContextItemSelected(paramMenuItem);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.b.c(paramBundle);
    super.onCreate(paramBundle);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.b.a(paramContextMenu, paramView, paramContextMenuInfo);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.b.a(paramMenu)) {
      return true;
    }
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public void onDestroy()
  {
    this.b.c();
    super.onDestroy();
  }
  
  public void onDetachedFromWindow()
  {
    this.b.e();
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.b.a(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.b.b(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    this.b.n();
    super.onLowMemory();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    this.b.a(paramIntent);
    super.onNewIntent(paramIntent);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.b.b(paramMenuItem)) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onPause()
  {
    this.b.b();
    super.onPause();
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    this.b.a(paramBundle);
    super.onPostCreate(paramBundle);
  }
  
  protected void onPostResume()
  {
    this.b.a();
    super.onPostResume();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if (this.b.b(paramMenu)) {
      return true;
    }
    return super.onPrepareOptionsMenu(paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.b.a(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    this.b.b(paramBundle);
    super.onRestoreInstanceState(paramBundle);
  }
  
  public void onResume()
  {
    this.b.l();
    super.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    this.b.d(paramBundle);
    super.onSaveInstanceState(paramBundle);
  }
  
  /* Error */
  @TargetApi(11)
  protected void onStart()
  {
    // Byte code:
    //   0: getstatic 188	android/os/Build$VERSION:SDK_INT	I
    //   3: bipush 11
    //   5: if_icmplt +85 -> 90
    //   8: aload_0
    //   9: invokevirtual 192	mff:getFragmentManager	()Landroid/app/FragmentManager;
    //   12: astore_1
    //   13: getstatic 198	efj:abb	Ljava/lang/reflect/Method;
    //   16: ifnonnull +19 -> 35
    //   19: aload_1
    //   20: invokevirtual 204	java/lang/Object:getClass	()Ljava/lang/Class;
    //   23: ldc 206
    //   25: iconst_0
    //   26: anewarray 208	java/lang/Class
    //   29: invokevirtual 212	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   32: putstatic 198	efj:abb	Ljava/lang/reflect/Method;
    //   35: getstatic 198	efj:abb	Ljava/lang/reflect/Method;
    //   38: astore 4
    //   40: aload 4
    //   42: ifnonnull +34 -> 76
    //   45: new 214	java/lang/NullPointerException
    //   48: dup
    //   49: invokespecial 215	java/lang/NullPointerException:<init>	()V
    //   52: athrow
    //   53: astore_3
    //   54: new 217	java/lang/IllegalStateException
    //   57: dup
    //   58: ldc 219
    //   60: invokespecial 222	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   63: athrow
    //   64: astore 6
    //   66: new 217	java/lang/IllegalStateException
    //   69: dup
    //   70: ldc 219
    //   72: invokespecial 222	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   75: athrow
    //   76: aload 4
    //   78: checkcast 224	java/lang/reflect/Method
    //   81: aload_1
    //   82: iconst_0
    //   83: anewarray 200	java/lang/Object
    //   86: invokevirtual 228	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: aload_0
    //   91: getfield 19	mff:b	Lmdt;
    //   94: invokevirtual 231	mdt:k	()V
    //   97: aload_0
    //   98: invokespecial 233	android/app/Activity:onStart	()V
    //   101: return
    //   102: astore_2
    //   103: new 217	java/lang/IllegalStateException
    //   106: dup
    //   107: ldc 219
    //   109: invokespecial 222	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	mff
    //   12	70	1	localFragmentManager	android.app.FragmentManager
    //   102	1	2	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   53	1	3	localIllegalAccessException	java.lang.IllegalAccessException
    //   38	39	4	localMethod	java.lang.reflect.Method
    //   64	1	6	localNoSuchMethodException	java.lang.NoSuchMethodException
    // Exception table:
    //   from	to	target	type
    //   35	40	53	java/lang/IllegalAccessException
    //   45	53	53	java/lang/IllegalAccessException
    //   76	90	53	java/lang/IllegalAccessException
    //   19	35	64	java/lang/NoSuchMethodException
    //   35	40	102	java/lang/reflect/InvocationTargetException
    //   45	53	102	java/lang/reflect/InvocationTargetException
    //   76	90	102	java/lang/reflect/InvocationTargetException
  }
  
  protected void onStop()
  {
    this.b.m();
    super.onStop();
  }
  
  protected void onUserLeaveHint()
  {
    this.b.f();
    super.onUserLeaveHint();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
    super.onWindowFocusChanged(paramBoolean);
  }
  
  public void startActivity(Intent paramIntent)
  {
    a(paramIntent);
    super.startActivity(paramIntent);
    this.a = (-1 + this.a);
  }
  
  @TargetApi(16)
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    a(paramIntent);
    super.startActivity(paramIntent, paramBundle);
    this.a = (-1 + this.a);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    a(paramIntent);
    super.startActivityForResult(paramIntent, paramInt);
    this.a = (-1 + this.a);
  }
  
  @TargetApi(16)
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    a(paramIntent);
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
    this.a = (-1 + this.a);
  }
  
  @TargetApi(11)
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    a(paramIntent);
    super.startActivityFromFragment(paramFragment, paramIntent, paramInt);
    this.a = (-1 + this.a);
  }
  
  @TargetApi(16)
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    a(paramIntent);
    super.startActivityFromFragment(paramFragment, paramIntent, paramInt, paramBundle);
    this.a = (-1 + this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mff
 * JD-Core Version:    0.7.0.1
 */