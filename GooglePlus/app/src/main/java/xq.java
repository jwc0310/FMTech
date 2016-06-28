import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

@TargetApi(14)
public class xq
  extends xh<hc>
  implements MenuItem
{
  public Method e;
  
  public xq(Context paramContext, hc paramhc)
  {
    super(paramContext, paramhc);
  }
  
  xr a(ActionProvider paramActionProvider)
  {
    return new xr(this, this.a, paramActionProvider);
  }
  
  public boolean collapseActionView()
  {
    return ((hc)this.d).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((hc)this.d).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    ll localll = ((hc)this.d).a();
    if ((localll instanceof xr)) {
      return ((xr)localll).d;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView = ((hc)this.d).getActionView();
    if ((localView instanceof xs)) {
      localView = (View)((xs)localView).a;
    }
    return localView;
  }
  
  public char getAlphabeticShortcut()
  {
    return ((hc)this.d).getAlphabeticShortcut();
  }
  
  public int getGroupId()
  {
    return ((hc)this.d).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((hc)this.d).getIcon();
  }
  
  public Intent getIntent()
  {
    return ((hc)this.d).getIntent();
  }
  
  public int getItemId()
  {
    return ((hc)this.d).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((hc)this.d).getMenuInfo();
  }
  
  public char getNumericShortcut()
  {
    return ((hc)this.d).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((hc)this.d).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return a(((hc)this.d).getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return ((hc)this.d).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((hc)this.d).getTitleCondensed();
  }
  
  public boolean hasSubMenu()
  {
    return ((hc)this.d).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((hc)this.d).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((hc)this.d).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((hc)this.d).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((hc)this.d).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((hc)this.d).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    hc localhc = (hc)this.d;
    if (paramActionProvider != null) {}
    for (xr localxr = a(paramActionProvider);; localxr = null)
    {
      localhc.a(localxr);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((hc)this.d).setActionView(paramInt);
    View localView = ((hc)this.d).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((hc)this.d).setActionView(new xs(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    if ((paramView instanceof CollapsibleActionView)) {
      paramView = new xs(paramView);
    }
    ((hc)this.d).setActionView(paramView);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((hc)this.d).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((hc)this.d).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((hc)this.d).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((hc)this.d).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((hc)this.d).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((hc)this.d).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((hc)this.d).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((hc)this.d).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    hc localhc = (hc)this.d;
    if (paramOnActionExpandListener != null) {}
    for (xt localxt = new xt(this, paramOnActionExpandListener);; localxt = null)
    {
      localhc.a(localxt);
      return this;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    hc localhc = (hc)this.d;
    if (paramOnMenuItemClickListener != null) {}
    for (xu localxu = new xu(this, paramOnMenuItemClickListener);; localxu = null)
    {
      localhc.setOnMenuItemClickListener(localxu);
      return this;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((hc)this.d).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((hc)this.d).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((hc)this.d).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((hc)this.d).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((hc)this.d).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((hc)this.d).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((hc)this.d).setVisible(paramBoolean);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     xq
 * JD-Core Version:    0.7.0.1
 */