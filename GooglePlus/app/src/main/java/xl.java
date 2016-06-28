import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class xl
  implements hb
{
  private static final int[] o = { 1, 4, 5, 3, 2, 0 };
  public final Context a;
  public xm b;
  ArrayList<xp> c;
  public boolean d;
  public ArrayList<xp> e;
  public ArrayList<xp> f;
  boolean g;
  public int h = 0;
  CharSequence i;
  Drawable j;
  View k;
  public CopyOnWriteArrayList<WeakReference<xz>> l = new CopyOnWriteArrayList();
  xp m;
  public boolean n;
  private final Resources p;
  private boolean q;
  private boolean r;
  private ArrayList<xp> s;
  private boolean t = false;
  private boolean u = false;
  private boolean v = false;
  private boolean w = false;
  private ArrayList<xp> x = new ArrayList();
  
  public xl(Context paramContext)
  {
    this.a = paramContext;
    this.p = paramContext.getResources();
    this.c = new ArrayList();
    this.s = new ArrayList();
    this.d = i1;
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.g = i1;
    if ((this.p.getConfiguration().keyboard != i1) && (this.p.getBoolean(efj.i))) {}
    for (;;)
    {
      this.r = i1;
      return;
      i1 = 0;
    }
  }
  
  private static int a(ArrayList<xp> paramArrayList, int paramInt)
  {
    for (int i1 = -1 + paramArrayList.size(); i1 >= 0; i1--) {
      if (((xp)paramArrayList.get(i1)).a <= paramInt) {
        return i1 + 1;
      }
    }
    return 0;
  }
  
  private xp a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.x;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    xp localxp;
    if (localArrayList.isEmpty()) {
      localxp = null;
    }
    label181:
    for (;;)
    {
      return localxp;
      int i1 = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
      paramKeyEvent.getKeyData(localKeyData);
      int i2 = localArrayList.size();
      if (i2 == 1) {
        return (xp)localArrayList.get(0);
      }
      boolean bool = b();
      int i3 = 0;
      if (i3 >= i2) {
        break;
      }
      localxp = (xp)localArrayList.get(i3);
      if (bool) {}
      for (int i4 = localxp.getAlphabeticShortcut();; i4 = localxp.getNumericShortcut())
      {
        if (((i4 == localKeyData.meta[0]) && ((i1 & 0x2) == 0)) || ((i4 == localKeyData.meta[2]) && ((i1 & 0x2) != 0)) || ((bool) && (i4 == 8) && (paramInt == 67))) {
          break label181;
        }
        i3++;
        break;
      }
    }
    return null;
  }
  
  private final void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.c.size())) {}
    do
    {
      return;
      this.c.remove(paramInt);
    } while (!paramBoolean);
    b(true);
  }
  
  private void a(List<xp> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = b();
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    int i2 = this.c.size();
    int i3 = 0;
    label49:
    xp localxp;
    if (i3 < i2)
    {
      localxp = (xp)this.c.get(i3);
      if (localxp.hasSubMenu()) {
        ((xl)localxp.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      }
      if (!bool) {
        break label181;
      }
    }
    label181:
    for (int i4 = localxp.getAlphabeticShortcut();; i4 = localxp.getNumericShortcut())
    {
      if (((i1 & 0x5) == 0) && (i4 != 0) && ((i4 == localKeyData.meta[0]) || (i4 == localKeyData.meta[2]) || ((bool) && (i4 == 8) && (paramInt == 67))) && (localxp.isEnabled())) {
        paramList.add(localxp);
      }
      i3++;
      break label49;
      break;
    }
  }
  
  public final MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = paramInt3 >> 16;
    if ((i1 < 0) || (i1 >= o.length)) {
      throw new IllegalArgumentException("order does not contain a valid category.");
    }
    int i2 = o[i1] << 16 | 0xFFFF & paramInt3;
    xp localxp = new xp(this, paramInt1, paramInt2, paramInt3, i2, paramCharSequence, this.h);
    this.c.add(a(this.c, i2), localxp);
    b(true);
    return localxp;
  }
  
  protected String a()
  {
    return "android:menu:actionviewstates";
  }
  
  final void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    if (paramView != null)
    {
      this.k = paramView;
      this.i = null;
      this.j = null;
    }
    for (;;)
    {
      b(false);
      return;
      if (paramCharSequence != null) {
        this.i = paramCharSequence;
      }
      if (paramDrawable != null) {
        this.j = paramDrawable;
      }
      this.k = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (this.l.isEmpty()) {
      return;
    }
    SparseArray localSparseArray = new SparseArray();
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      xz localxz = (xz)localWeakReference.get();
      if (localxz == null)
      {
        this.l.remove(localWeakReference);
      }
      else
      {
        int i1 = localxz.b();
        if (i1 > 0)
        {
          Parcelable localParcelable = localxz.c();
          if (localParcelable != null) {
            localSparseArray.put(i1, localParcelable);
          }
        }
      }
    }
    paramBundle.putSparseParcelableArray("android:menu:presenters", localSparseArray);
  }
  
  public void a(xm paramxm)
  {
    this.b = paramxm;
  }
  
  public final void a(xz paramxz)
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      xz localxz = (xz)localWeakReference.get();
      if ((localxz == null) || (localxz == paramxz)) {
        this.l.remove(localWeakReference);
      }
    }
  }
  
  public final void a(xz paramxz, Context paramContext)
  {
    this.l.add(new WeakReference(paramxz));
    paramxz.a(paramContext, this);
    this.g = true;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.w) {
      return;
    }
    this.w = true;
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      xz localxz = (xz)localWeakReference.get();
      if (localxz == null) {
        this.l.remove(localWeakReference);
      } else {
        localxz.a(this, paramBoolean);
      }
    }
    this.w = false;
  }
  
  public final boolean a(MenuItem paramMenuItem, xz paramxz, int paramInt)
  {
    xp localxp = (xp)paramMenuItem;
    boolean bool1;
    if ((localxp == null) || (!localxp.isEnabled())) {
      bool1 = false;
    }
    boolean bool2;
    label92:
    ye localye2;
    boolean bool4;
    do
    {
      return bool1;
      bool2 = localxp.b();
      ll localll = localxp.f;
      if ((localll != null) && (localll.f())) {}
      for (int i1 = 1;; i1 = 0)
      {
        if (!localxp.f()) {
          break label92;
        }
        bool1 = bool2 | localxp.expandActionView();
        if (!bool1) {
          break;
        }
        a(true);
        return bool1;
      }
      if ((!localxp.hasSubMenu()) && (i1 == 0)) {
        break label321;
      }
      a(false);
      if (!localxp.hasSubMenu())
      {
        ye localye1 = new ye(this.a, this, localxp);
        localxp.c = localye1;
        localye1.setHeaderTitle(localxp.getTitle());
      }
      localye2 = (ye)localxp.getSubMenu();
      if (i1 != 0) {
        localll.a(localye2);
      }
      boolean bool3 = this.l.isEmpty();
      bool4 = false;
      if (!bool3) {
        break;
      }
      bool1 = bool2 | bool4;
    } while (bool1);
    a(true);
    return bool1;
    boolean bool5 = false;
    if (paramxz != null) {
      bool5 = paramxz.a(localye2);
    }
    Iterator localIterator = this.l.iterator();
    boolean bool6 = bool5;
    label241:
    xz localxz;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      localxz = (xz)localWeakReference.get();
      if (localxz == null) {
        this.l.remove(localWeakReference);
      } else {
        if (bool6) {
          break label335;
        }
      }
    }
    label321:
    label335:
    for (boolean bool7 = localxz.a(localye2);; bool7 = bool6)
    {
      bool6 = bool7;
      break label241;
      bool4 = bool6;
      break;
      if ((paramInt & 0x1) == 0) {
        a(true);
      }
      return bool2;
    }
  }
  
  boolean a(xl paramxl, MenuItem paramMenuItem)
  {
    return (this.b != null) && (this.b.a(paramxl, paramMenuItem));
  }
  
  public boolean a(xp paramxp)
  {
    boolean bool1 = this.l.isEmpty();
    boolean bool2 = false;
    if (bool1) {}
    label104:
    do
    {
      return bool2;
      d();
      Iterator localIterator = this.l.iterator();
      boolean bool3 = false;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        xz localxz = (xz)localWeakReference.get();
        if (localxz == null)
        {
          this.l.remove(localWeakReference);
        }
        else
        {
          bool2 = localxz.a(paramxp);
          if (bool2) {
            break label104;
          }
          bool3 = bool2;
        }
      }
      bool2 = bool3;
      e();
    } while (!bool2);
    this.m = paramxp;
    return bool2;
  }
  
  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.p.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.p.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.a.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i1;
    int i2;
    label52:
    ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i1 = localList.size();
      if ((paramInt4 & 0x1) == 0) {
        removeGroup(paramInt1);
      }
      i2 = 0;
      if (i2 >= i1) {
        break label211;
      }
      localResolveInfo = (ResolveInfo)localList.get(i2);
      if (localResolveInfo.specificIndex >= 0) {
        break label198;
      }
    }
    label198:
    for (Intent localIntent1 = paramIntent;; localIntent1 = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      Intent localIntent2 = new Intent(localIntent1);
      localIntent2.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      MenuItem localMenuItem = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(localIntent2);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0)) {
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = localMenuItem;
      }
      i2++;
      break label52;
      i1 = 0;
      break;
    }
    label211:
    return i1;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.p.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.p.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    xp localxp = (xp)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    ye localye = new ye(this.a, this, localxp);
    localxp.c = localye;
    localye.setHeaderTitle(localxp.getTitle());
    return localye;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(Bundle paramBundle)
  {
    int i1 = size();
    int i2 = 0;
    Object localObject2;
    for (Object localObject1 = null; i2 < i1; localObject1 = localObject2)
    {
      MenuItem localMenuItem = getItem(i2);
      View localView = mm.a(localMenuItem);
      if ((localView != null) && (localView.getId() != -1))
      {
        if (localObject1 == null) {
          localObject1 = new SparseArray();
        }
        localView.saveHierarchyState((SparseArray)localObject1);
        if (mm.d(localMenuItem)) {
          paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
        }
      }
      localObject2 = localObject1;
      if (localMenuItem.hasSubMenu()) {
        ((ye)localMenuItem.getSubMenu()).b(paramBundle);
      }
      i2++;
    }
    if (localObject1 != null) {
      paramBundle.putSparseParcelableArray(a(), (SparseArray)localObject1);
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (!this.t)
    {
      if (paramBoolean)
      {
        this.d = true;
        this.g = true;
      }
      if (!this.l.isEmpty())
      {
        d();
        Iterator localIterator = this.l.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          xz localxz = (xz)localWeakReference.get();
          if (localxz == null) {
            this.l.remove(localWeakReference);
          } else {
            localxz.a(paramBoolean);
          }
        }
        e();
      }
      return;
    }
    this.u = true;
  }
  
  boolean b()
  {
    return this.q;
  }
  
  public boolean b(xp paramxp)
  {
    boolean bool1 = this.l.isEmpty();
    boolean bool2 = false;
    if (!bool1)
    {
      xp localxp = this.m;
      bool2 = false;
      if (localxp == paramxp) {
        break label30;
      }
    }
    label30:
    label118:
    do
    {
      return bool2;
      d();
      Iterator localIterator = this.l.iterator();
      boolean bool3 = false;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        xz localxz = (xz)localWeakReference.get();
        if (localxz == null)
        {
          this.l.remove(localWeakReference);
        }
        else
        {
          bool2 = localxz.b(paramxp);
          if (bool2) {
            break label118;
          }
          bool3 = bool2;
        }
      }
      bool2 = bool3;
      e();
    } while (!bool2);
    this.m = null;
    return bool2;
  }
  
  public final void c(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    MenuItem localMenuItem1;
    do
    {
      int i3;
      do
      {
        return;
        SparseArray localSparseArray = paramBundle.getSparseParcelableArray(a());
        int i1 = size();
        for (int i2 = 0; i2 < i1; i2++)
        {
          MenuItem localMenuItem2 = getItem(i2);
          View localView = mm.a(localMenuItem2);
          if ((localView != null) && (localView.getId() != -1)) {
            localView.restoreHierarchyState(localSparseArray);
          }
          if (localMenuItem2.hasSubMenu()) {
            ((ye)localMenuItem2.getSubMenu()).c(paramBundle);
          }
        }
        i3 = paramBundle.getInt("android:menu:expandedactionview");
      } while (i3 <= 0);
      localMenuItem1 = findItem(i3);
    } while (localMenuItem1 == null);
    mm.c(localMenuItem1);
  }
  
  public boolean c()
  {
    return this.r;
  }
  
  public void clear()
  {
    if (this.m != null) {
      b(this.m);
    }
    this.c.clear();
    b(true);
  }
  
  public void clearHeader()
  {
    this.j = null;
    this.i = null;
    this.k = null;
    b(false);
  }
  
  public void close()
  {
    a(true);
  }
  
  public final void d()
  {
    if (!this.t)
    {
      this.t = true;
      this.u = false;
    }
  }
  
  public final void e()
  {
    this.t = false;
    if (this.u)
    {
      this.u = false;
      b(true);
    }
  }
  
  final void f()
  {
    this.g = true;
    b(true);
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = (xp)this.c.get(i2);
      if (((xp)localObject).getItemId() == paramInt) {}
      do
      {
        return localObject;
        if (!((xp)localObject).hasSubMenu()) {
          break;
        }
        localObject = ((xp)localObject).getSubMenu().findItem(paramInt);
      } while (localObject != null);
    }
    return null;
  }
  
  public final ArrayList<xp> g()
  {
    if (!this.d) {
      return this.s;
    }
    this.s.clear();
    int i1 = this.c.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      xp localxp = (xp)this.c.get(i2);
      if (localxp.isVisible()) {
        this.s.add(localxp);
      }
    }
    this.d = false;
    this.g = true;
    return this.s;
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.c.get(paramInt);
  }
  
  public final void h()
  {
    ArrayList localArrayList = g();
    if (!this.g) {
      return;
    }
    Iterator localIterator = this.l.iterator();
    boolean bool = false;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      xz localxz = (xz)localWeakReference.get();
      if (localxz == null) {
        this.l.remove(localWeakReference);
      } else {
        bool |= localxz.a();
      }
    }
    if (bool)
    {
      this.e.clear();
      this.f.clear();
      int i1 = localArrayList.size();
      int i2 = 0;
      if (i2 < i1)
      {
        xp localxp = (xp)localArrayList.get(i2);
        if (localxp.e()) {
          this.e.add(localxp);
        }
        for (;;)
        {
          i2++;
          break;
          this.f.add(localxp);
        }
      }
    }
    else
    {
      this.e.clear();
      this.f.clear();
      this.f.addAll(g());
    }
    this.g = false;
  }
  
  public boolean hasVisibleItems()
  {
    if (this.n) {
      return true;
    }
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((xp)this.c.get(i2)).isVisible()) {
        return true;
      }
    }
    return false;
  }
  
  public xl i()
  {
    return this;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), null, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    xp localxp = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (localxp != null) {
      bool = a(localxp, null, paramInt2);
    }
    if ((paramInt2 & 0x2) != 0) {
      a(true);
    }
    return bool;
  }
  
  public void removeGroup(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    int i3;
    if (i2 < i1) {
      if (((xp)this.c.get(i2)).getGroupId() == paramInt) {
        i3 = i2;
      }
    }
    for (;;)
    {
      if (i3 >= 0)
      {
        int i4 = this.c.size() - i3;
        int i6;
        for (int i5 = 0;; i5 = i6)
        {
          i6 = i5 + 1;
          if ((i5 >= i4) || (((xp)this.c.get(i3)).getGroupId() != paramInt)) {
            break;
          }
          a(i3, false);
        }
        i2++;
        break;
        i3 = -1;
        continue;
        b(true);
      }
    }
  }
  
  public void removeItem(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    if (i2 < i1) {
      if (((xp)this.c.get(i2)).getItemId() != paramInt) {}
    }
    for (int i3 = i2;; i3 = -1)
    {
      a(i3, true);
      return;
      i2++;
      break;
    }
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = this.c.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      xp localxp = (xp)this.c.get(i2);
      if (localxp.getGroupId() == paramInt)
      {
        localxp.a(paramBoolean2);
        localxp.setCheckable(paramBoolean1);
      }
    }
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = this.c.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      xp localxp = (xp)this.c.get(i2);
      if (localxp.getGroupId() == paramInt) {
        localxp.setEnabled(paramBoolean);
      }
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i1 = this.c.size();
    int i2 = 0;
    int i3 = 0;
    if (i2 < i1)
    {
      xp localxp = (xp)this.c.get(i2);
      if ((localxp.getGroupId() != paramInt) || (!localxp.c(paramBoolean))) {
        break label76;
      }
    }
    label76:
    for (int i4 = 1;; i4 = i3)
    {
      i2++;
      i3 = i4;
      break;
      if (i3 != 0) {
        b(true);
      }
      return;
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.q = paramBoolean;
    b(false);
  }
  
  public int size()
  {
    return this.c.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     xl
 * JD-Core Version:    0.7.0.1
 */