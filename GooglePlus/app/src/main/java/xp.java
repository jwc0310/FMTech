import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import java.util.ArrayList;

public final class xp
  implements hc
{
  final int a;
  public xl b;
  public ye c;
  public int d = 16;
  public int e = 0;
  public ll f;
  public boolean g = false;
  private final int h;
  private final int i;
  private final int j;
  private CharSequence k;
  private CharSequence l;
  private Intent m;
  private char n;
  private char o;
  private Drawable p;
  private int q = 0;
  private MenuItem.OnMenuItemClickListener r;
  private View s;
  private mr t;
  private ContextMenu.ContextMenuInfo u;
  
  xp(xl paramxl, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.b = paramxl;
    this.h = paramInt2;
    this.i = paramInt1;
    this.j = paramInt3;
    this.a = paramInt4;
    this.k = paramCharSequence;
    this.e = paramInt5;
  }
  
  public final hc a(ll paramll)
  {
    if (this.f != null)
    {
      ll localll = this.f;
      localll.c = null;
      localll.b = null;
    }
    this.s = null;
    this.f = paramll;
    this.b.b(true);
    if (this.f != null) {
      this.f.a(new ln(this));
    }
    return this;
  }
  
  public final hc a(mr parammr)
  {
    this.t = parammr;
    return this;
  }
  
  public final CharSequence a(yc paramyc)
  {
    if ((paramyc != null) && (paramyc.b())) {
      return getTitleCondensed();
    }
    return getTitle();
  }
  
  public final ll a()
  {
    return this.f;
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFFB & this.d;
    if (paramBoolean) {}
    for (int i2 = 4;; i2 = 0)
    {
      this.d = (i2 | i1);
      return;
    }
  }
  
  final void b(boolean paramBoolean)
  {
    int i1 = this.d;
    int i2 = 0xFFFFFFFD & this.d;
    if (paramBoolean) {}
    for (int i3 = 2;; i3 = 0)
    {
      this.d = (i3 | i2);
      if (i1 != this.d) {
        this.b.b(false);
      }
      return;
    }
  }
  
  public final boolean b()
  {
    if ((this.r != null) && (this.r.onMenuItemClick(this))) {}
    do
    {
      do
      {
        return true;
      } while (this.b.a(this.b.i(), this));
      if (this.m != null) {
        try
        {
          this.b.a.startActivity(this.m);
          return true;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", localActivityNotFoundException);
        }
      }
    } while ((this.f != null) && (this.f.e()));
    return false;
  }
  
  public final char c()
  {
    if (this.b.b()) {
      return this.o;
    }
    return this.n;
  }
  
  final boolean c(boolean paramBoolean)
  {
    int i1 = this.d;
    int i2 = 0xFFFFFFF7 & this.d;
    if (paramBoolean) {}
    for (int i3 = 0;; i3 = 8)
    {
      this.d = (i3 | i2);
      int i4 = this.d;
      boolean bool = false;
      if (i1 != i4) {
        bool = true;
      }
      return bool;
    }
  }
  
  public final boolean collapseActionView()
  {
    if ((0x8 & this.e) == 0) {}
    do
    {
      return false;
      if (this.s == null) {
        return true;
      }
    } while ((this.t != null) && (!this.t.b(this)));
    return this.b.b(this);
  }
  
  public final void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d = (0x20 | this.d);
      return;
    }
    this.d = (0xFFFFFFDF & this.d);
  }
  
  public final boolean d()
  {
    return (this.b.c()) && (c() != 0);
  }
  
  public final void e(boolean paramBoolean)
  {
    this.g = paramBoolean;
    this.b.b(false);
  }
  
  public final boolean e()
  {
    return (0x20 & this.d) == 32;
  }
  
  public final boolean expandActionView()
  {
    if (!f()) {}
    while ((this.t != null) && (!this.t.a(this))) {
      return false;
    }
    return this.b.a(this);
  }
  
  public final boolean f()
  {
    int i1 = 0x8 & this.e;
    boolean bool = false;
    if (i1 != 0)
    {
      if ((this.s == null) && (this.f != null)) {
        this.s = this.f.a(this);
      }
      View localView = this.s;
      bool = false;
      if (localView != null) {
        bool = true;
      }
    }
    return bool;
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public final View getActionView()
  {
    if (this.s != null) {
      return this.s;
    }
    if (this.f != null)
    {
      this.s = this.f.a(this);
      return this.s;
    }
    return null;
  }
  
  public final char getAlphabeticShortcut()
  {
    return this.o;
  }
  
  public final int getGroupId()
  {
    return this.i;
  }
  
  public final Drawable getIcon()
  {
    if (this.p != null) {
      return this.p;
    }
    if (this.q != 0)
    {
      Drawable localDrawable = zv.a(this.b.a, this.q);
      this.q = 0;
      this.p = localDrawable;
      return localDrawable;
    }
    return null;
  }
  
  public final Intent getIntent()
  {
    return this.m;
  }
  
  @ViewDebug.CapturedViewProperty
  public final int getItemId()
  {
    return this.h;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.u;
  }
  
  public final char getNumericShortcut()
  {
    return this.n;
  }
  
  public final int getOrder()
  {
    return this.j;
  }
  
  public final SubMenu getSubMenu()
  {
    return this.c;
  }
  
  @ViewDebug.CapturedViewProperty
  public final CharSequence getTitle()
  {
    return this.k;
  }
  
  public final CharSequence getTitleCondensed()
  {
    if (this.l != null) {}
    for (Object localObject = this.l;; localObject = this.k)
    {
      if ((Build.VERSION.SDK_INT < 18) && (localObject != null) && (!(localObject instanceof String))) {
        localObject = ((CharSequence)localObject).toString();
      }
      return localObject;
    }
  }
  
  public final boolean hasSubMenu()
  {
    return this.c != null;
  }
  
  public final boolean isActionViewExpanded()
  {
    return this.g;
  }
  
  public final boolean isCheckable()
  {
    return (0x1 & this.d) == 1;
  }
  
  public final boolean isChecked()
  {
    return (0x2 & this.d) == 2;
  }
  
  public final boolean isEnabled()
  {
    return (0x10 & this.d) != 0;
  }
  
  public final boolean isVisible()
  {
    if ((this.f != null) && (this.f.b())) {
      if (((0x8 & this.d) != 0) || (!this.f.c())) {}
    }
    while ((0x8 & this.d) == 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.o == paramChar) {
      return this;
    }
    this.o = Character.toLowerCase(paramChar);
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = this.d;
    int i2 = 0xFFFFFFFE & this.d;
    if (paramBoolean) {}
    for (int i3 = 1;; i3 = 0)
    {
      this.d = (i3 | i2);
      if (i1 != this.d) {
        this.b.b(false);
      }
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    if ((0x4 & this.d) != 0)
    {
      xl localxl = this.b;
      int i1 = getGroupId();
      int i2 = localxl.c.size();
      int i3 = 0;
      if (i3 < i2)
      {
        xp localxp = (xp)localxl.c.get(i3);
        int i4;
        if (localxp.getGroupId() == i1)
        {
          if ((0x4 & localxp.d) == 0) {
            break label111;
          }
          i4 = 1;
          label76:
          if ((i4 != 0) && (localxp.isCheckable())) {
            if (localxp != this) {
              break label117;
            }
          }
        }
        label111:
        label117:
        for (boolean bool = true;; bool = false)
        {
          localxp.b(bool);
          i3++;
          break;
          i4 = 0;
          break label76;
        }
      }
    }
    else
    {
      b(paramBoolean);
    }
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (this.d = (0x10 | this.d);; this.d = (0xFFFFFFEF & this.d))
    {
      this.b.b(false);
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    this.p = null;
    this.q = paramInt;
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.q = 0;
    this.p = paramDrawable;
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    this.m = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    if (this.n == paramChar) {
      return this;
    }
    this.n = paramChar;
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.r = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.n = paramChar1;
    this.o = Character.toLowerCase(paramChar2);
    this.b.b(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    default: 
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    this.e = paramInt;
    this.b.f();
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    return setTitle(this.b.a.getString(paramInt));
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.k = paramCharSequence;
    this.b.b(false);
    if (this.c != null) {
      this.c.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.l = paramCharSequence;
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    if (c(paramBoolean))
    {
      xl localxl = this.b;
      localxl.d = true;
      localxl.b(true);
    }
    return this;
  }
  
  public final String toString()
  {
    return this.k.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     xp
 * JD-Core Version:    0.7.0.1
 */