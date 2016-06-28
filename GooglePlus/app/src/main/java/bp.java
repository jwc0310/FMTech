import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class bp
  extends bi
{
  final Handler a = new bq(this);
  public final bu b = new bu(new br(this));
  boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  
  private static String a(View paramView)
  {
    char c1 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    char c3;
    label108:
    char c4;
    label126:
    char c5;
    label143:
    char c6;
    label161:
    char c7;
    label179:
    char c8;
    label197:
    char c9;
    label215:
    label236:
    char c10;
    label253:
    int i;
    Resources localResources;
    switch (paramView.getVisibility())
    {
    default: 
      localStringBuilder.append(c2);
      if (paramView.isFocusable())
      {
        c3 = c1;
        localStringBuilder.append(c3);
        if (!paramView.isEnabled()) {
          break label533;
        }
        c4 = 'E';
        localStringBuilder.append(c4);
        if (!paramView.willNotDraw()) {
          break label539;
        }
        c5 = c2;
        localStringBuilder.append(c5);
        if (!paramView.isHorizontalScrollBarEnabled()) {
          break label546;
        }
        c6 = 'H';
        localStringBuilder.append(c6);
        if (!paramView.isVerticalScrollBarEnabled()) {
          break label552;
        }
        c7 = 'V';
        localStringBuilder.append(c7);
        if (!paramView.isClickable()) {
          break label558;
        }
        c8 = 'C';
        localStringBuilder.append(c8);
        if (!paramView.isLongClickable()) {
          break label564;
        }
        c9 = 'L';
        localStringBuilder.append(c9);
        localStringBuilder.append(' ');
        if (!paramView.isFocused()) {
          break label570;
        }
        localStringBuilder.append(c1);
        if (!paramView.isSelected()) {
          break label575;
        }
        c10 = 'S';
        localStringBuilder.append(c10);
        if (paramView.isPressed()) {
          c2 = 'P';
        }
        localStringBuilder.append(c2);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        i = paramView.getId();
        if (i != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(i));
          localResources = paramView.getResources();
          if ((i != 0) && (localResources != null)) {
            switch (0xFF000000 & i)
            {
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        str1 = localResources.getResourcePackageName(i);
        String str2 = localResources.getResourceTypeName(i);
        String str3 = localResources.getResourceEntryName(i);
        localStringBuilder.append(" ");
        localStringBuilder.append(str1);
        localStringBuilder.append(":");
        localStringBuilder.append(str2);
        localStringBuilder.append("/");
        localStringBuilder.append(str3);
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        String str1;
        label533:
        label539:
        label546:
        label552:
        label558:
        label564:
        label570:
        label575:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append('V');
      break;
      localStringBuilder.append('I');
      break;
      localStringBuilder.append('G');
      break;
      c3 = c2;
      break label108;
      c4 = c2;
      break label126;
      c5 = 'D';
      break label143;
      c6 = c2;
      break label161;
      c7 = c2;
      break label179;
      c8 = c2;
      break label197;
      c9 = c2;
      break label215;
      c1 = c2;
      break label236;
      c10 = c2;
      break label253;
      str1 = "app";
      continue;
      str1 = "android";
    }
  }
  
  private final void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
    }
    for (;;)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i = localViewGroup.getChildCount();
        if (i > 0)
        {
          String str = paramString + "  ";
          for (int j = 0; j < i; j++) {
            a(str, paramPrintWriter, localViewGroup.getChildAt(j));
          }
        }
      }
    }
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.b.a.d.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void a(bk parambk) {}
  
  public void a(bk parambk, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, (1 + parambk.k << 16) + (0xFFFF & paramInt));
  }
  
  final void a(boolean paramBoolean)
  {
    bv localbv;
    if (!this.f)
    {
      this.f = true;
      this.g = paramBoolean;
      this.a.removeMessages(1);
      bu localbu = this.b;
      boolean bool = this.g;
      localbv = localbu.a;
      if ((localbv.f != null) && (localbv.h))
      {
        localbv.h = false;
        if (!bool) {
          break label93;
        }
        localbv.f.d();
      }
    }
    for (;;)
    {
      this.b.a.d.a(2, 0, 0, false);
      return;
      label93:
      localbv.f.c();
    }
  }
  
  public boolean a(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public void aq_()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.h = true;
  }
  
  public final cv c()
  {
    bv localbv = this.b.a;
    if (localbv.f != null) {
      return localbv.f;
    }
    localbv.g = true;
    localbv.f = localbv.a("(root)", localbv.h, true);
    return localbv.f;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.d);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.f);
    bv localbv = this.b.a;
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(localbv.h);
    if (localbv.f != null)
    {
      paramPrintWriter.print(str);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(localbv.f)));
      paramPrintWriter.println(":");
      localbv.f.a(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.b.a.d.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }
  
  public void j_()
  {
    bz localbz = this.b.a.d;
    localbz.j = false;
    localbz.a(5, 0, 0, false);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.b.a.d.noteStateNotSaved();
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      int j = i - 1;
      int k = this.b.a();
      if ((k == 0) || (j < 0) || (j >= k))
      {
        new StringBuilder("Activity result fragment index out of range: 0x").append(Integer.toHexString(paramInt1));
        return;
      }
      bk localbk = (bk)this.b.a(new ArrayList(k)).get(j);
      if (localbk == null)
      {
        new StringBuilder("Activity result no fragment exists for index: 0x").append(Integer.toHexString(paramInt1));
        return;
      }
      localbk.a(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    if (!this.b.a.d.d())
    {
      if (Build.VERSION.SDK_INT >= 21) {
        finishAfterTransition();
      }
    }
    else {
      return;
    }
    finish();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a.d.a(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    bu localbu1 = this.b;
    localbu1.a.d.a(localbu1.a, localbu1.a, null);
    super.onCreate(paramBundle);
    bs localbs = (bs)getLastNonConfigurationInstance();
    if (localbs != null)
    {
      bu localbu3 = this.b;
      la localla = localbs.b;
      localbu3.a.e = localla;
    }
    Parcelable localParcelable;
    bu localbu2;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localbu2 = this.b;
      if (localbs == null) {
        break label135;
      }
    }
    label135:
    for (List localList = localbs.a;; localList = null)
    {
      localbu2.a.d.a(localParcelable, localList);
      bz localbz = this.b.a.d;
      localbz.j = false;
      localbz.a(1, 0, 0, false);
      return;
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      bu localbu = this.b;
      MenuInflater localMenuInflater = getMenuInflater();
      boolean bool2 = bool1 | localbu.a.d.a(paramMenu, localMenuInflater);
      if (Build.VERSION.SDK_INT >= 11) {
        return bool2;
      }
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    a(false);
    this.b.a.d.l();
    bv localbv = this.b.a;
    if (localbv.f != null) {
      localbv.f.g();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.b.a.d.m();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 0: 
      return this.b.a.d.a(paramMenuItem);
    }
    return this.b.a.d.b(paramMenuItem);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.b.a.d.noteStateNotSaved();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.b.a.d.b(paramMenu);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.e = false;
    if (this.a.hasMessages(2))
    {
      this.a.removeMessages(2);
      j_();
    }
    this.b.a.d.a(4, 0, 0, false);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    this.a.removeMessages(2);
    j_();
    this.b.a.d.i();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.h)
      {
        this.h = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return a(paramView, paramMenu) | this.b.a.d.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0xFF & paramInt >> 8;
    int j;
    int k;
    if (i != 0)
    {
      j = i - 1;
      k = this.b.a();
      if ((k == 0) || (j < 0) || (j >= k)) {
        new StringBuilder("Activity result fragment index out of range: 0x").append(Integer.toHexString(paramInt));
      }
    }
    else
    {
      return;
    }
    bk localbk = (bk)this.b.a(new ArrayList(k)).get(j);
    if (localbk == null)
    {
      new StringBuilder("Activity result no fragment exists for index: 0x").append(Integer.toHexString(paramInt));
      return;
    }
    localbk.a(paramInt & 0xFF, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onResume()
  {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.e = true;
    this.b.a.d.i();
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    if (this.c) {
      a(true);
    }
    bz localbz = this.b.a.d;
    ArrayList localArrayList;
    if (localbz.b != null)
    {
      int i = 0;
      localArrayList = null;
      if (i < localbz.b.size())
      {
        bk localbk = (bk)localbz.b.get(i);
        if ((localbk != null) && (localbk.G))
        {
          if (localArrayList == null) {
            localArrayList = new ArrayList();
          }
          localArrayList.add(localbk);
          localbk.H = true;
          if (localbk.n == null) {
            break label130;
          }
        }
        label130:
        for (int j = localbk.n.k;; j = -1)
        {
          localbk.o = j;
          i++;
          break;
        }
      }
    }
    else
    {
      localArrayList = null;
    }
    la localla = this.b.a.g();
    if ((localArrayList == null) && (localla == null)) {
      return null;
    }
    bs localbs = new bs();
    localbs.a = localArrayList;
    localbs.b = localla;
    return localbs;
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.b.a.d.k();
    if (localParcelable != null) {
      paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.c = false;
    this.f = false;
    this.a.removeMessages(1);
    if (!this.d)
    {
      this.d = true;
      bz localbz2 = this.b.a.d;
      localbz2.j = false;
      localbz2.a(2, 0, 0, false);
    }
    this.b.a.d.noteStateNotSaved();
    this.b.a.d.i();
    bv localbv1 = this.b.a;
    if (!localbv1.h)
    {
      localbv1.h = true;
      if (localbv1.f == null) {
        break label225;
      }
      localbv1.f.b();
    }
    int i;
    cx[] arrayOfcx;
    for (;;)
    {
      localbv1.g = true;
      bz localbz1 = this.b.a.d;
      localbz1.j = false;
      localbz1.a(4, 0, 0, false);
      bv localbv2 = this.b.a;
      if (localbv2.e == null) {
        return;
      }
      i = localbv2.e.size();
      arrayOfcx = new cx[i];
      for (int j = i - 1; j >= 0; j--) {
        arrayOfcx[j] = ((cx)localbv2.e.b[(1 + (j << 1))]);
      }
      label225:
      if (!localbv1.g)
      {
        localbv1.f = localbv1.a("(root)", localbv1.h, false);
        if ((localbv1.f != null) && (!localbv1.f.e)) {
          localbv1.f.b();
        }
      }
    }
    for (int k = 0; k < i; k++)
    {
      cx localcx = arrayOfcx[k];
      if (localcx.f)
      {
        if (cx.a) {
          new StringBuilder("Finished Retaining in ").append(localcx);
        }
        localcx.f = false;
        lb locallb = localcx.b;
        if (locallb.b) {
          locallb.a();
        }
        for (int m = -1 + locallb.e; m >= 0; m--)
        {
          cy localcy = (cy)localcx.b.e(m);
          if (localcy.h)
          {
            if (cx.a) {
              new StringBuilder("  Finished Retaining: ").append(localcy);
            }
            localcy.h = false;
            if ((localcy.g != localcy.i) && (!localcy.g)) {
              localcy.b();
            }
          }
          if ((localcy.g) && (localcy.d) && (!localcy.j)) {
            localcy.b(localcy.c, localcy.f);
          }
        }
      }
      localcx.f();
    }
  }
  
  public void onStateNotSaved()
  {
    this.b.a.d.noteStateNotSaved();
  }
  
  public void onStop()
  {
    super.onStop();
    this.c = true;
    this.a.sendEmptyMessage(1);
    bz localbz = this.b.a.d;
    localbz.j = true;
    localbz.a(3, 0, 0, false);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bp
 * JD-Core Version:    0.7.0.1
 */