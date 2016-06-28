import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.design.internal.NavigationMenuItemView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public final class m
  extends BaseAdapter
{
  final ArrayList<aar> a = new ArrayList();
  xp b;
  boolean c;
  private ColorDrawable d;
  
  public m(l paraml)
  {
    a();
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      xp localxp = ((aar)this.a.get(paramInt1)).d();
      if (localxp.getIcon() == null)
      {
        if (this.d == null) {
          this.d = new ColorDrawable(17170445);
        }
        localxp.setIcon(this.d);
      }
      paramInt1++;
    }
  }
  
  final void a()
  {
    if (this.c) {
      return;
    }
    this.c = true;
    this.a.clear();
    int i = -1;
    int j = 0;
    int k = 0;
    int m = this.e.c.g().size();
    int n = 0;
    while (n < m)
    {
      xp localxp1 = (xp)this.e.c.g().get(n);
      if (localxp1.isChecked()) {
        a(localxp1);
      }
      if (localxp1.isCheckable()) {
        localxp1.a(false);
      }
      int i4;
      int i5;
      int i6;
      if (localxp1.hasSubMenu())
      {
        SubMenu localSubMenu = localxp1.getSubMenu();
        if (localSubMenu.hasVisibleItems())
        {
          if (n != 0) {
            this.a.add(new aar(null, this.e.l, 0));
          }
          this.a.add(new aar(localxp1, 0, 0));
          int i8 = 0;
          int i9 = this.a.size();
          int i10 = localSubMenu.size();
          for (int i11 = 0; i11 < i10; i11++)
          {
            xp localxp2 = (xp)localSubMenu.getItem(i11);
            if (localxp2.isVisible())
            {
              if ((i8 == 0) && (localxp2.getIcon() != null)) {
                i8 = 1;
              }
              if (localxp2.isCheckable()) {
                localxp2.a(false);
              }
              if (localxp1.isChecked()) {
                a(localxp1);
              }
              this.a.add(new aar(localxp2, 0, 0));
            }
          }
          if (i8 != 0) {
            a(i9, this.a.size());
          }
        }
        i4 = k;
        i5 = j;
        i6 = i;
        n++;
        j = i5;
        i = i6;
        k = i4;
      }
      else
      {
        int i1 = localxp1.getGroupId();
        label367:
        int i7;
        int i2;
        if (i1 != i)
        {
          j = this.a.size();
          if (localxp1.getIcon() != null)
          {
            k = 1;
            if (n == 0) {
              break label500;
            }
            i7 = j + 1;
            this.a.add(new aar(null, this.e.l, this.e.l));
            i2 = k;
          }
        }
        for (int i3 = i7;; i3 = j)
        {
          if ((i2 != 0) && (localxp1.getIcon() == null)) {
            localxp1.setIcon(17170445);
          }
          this.a.add(new aar(localxp1, 0, 0));
          i4 = i2;
          i5 = i3;
          i6 = i1;
          break;
          k = 0;
          break label367;
          if ((k == 0) && (localxp1.getIcon() != null))
          {
            k = 1;
            a(j, this.a.size());
          }
          label500:
          i2 = k;
        }
      }
    }
    this.c = false;
  }
  
  public final void a(xp paramxp)
  {
    if ((this.b == paramxp) || (!paramxp.isCheckable())) {
      return;
    }
    if (this.b != null) {
      this.b.setChecked(false);
    }
    this.b = paramxp;
    paramxp.setChecked(true);
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final int getCount()
  {
    return this.a.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    aar localaar = (aar)getItem(paramInt);
    if (localaar.a()) {
      return 2;
    }
    if (localaar.d().hasSubMenu()) {
      return 1;
    }
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    aar localaar = (aar)getItem(paramInt);
    switch (getItemViewType(paramInt))
    {
    default: 
      return paramView;
    case 0: 
      if (paramView != null) {
        break;
      }
    }
    for (View localView2 = this.e.f.inflate(2130968756, paramViewGroup, false);; localView2 = paramView)
    {
      NavigationMenuItemView localNavigationMenuItemView = (NavigationMenuItemView)localView2;
      localNavigationMenuItemView.b = this.e.j;
      if (localNavigationMenuItemView.a != null) {
        localNavigationMenuItemView.a(localNavigationMenuItemView.a.getIcon());
      }
      if (this.e.h) {
        localNavigationMenuItemView.setTextAppearance(localNavigationMenuItemView.getContext(), this.e.g);
      }
      if (this.e.i != null) {
        localNavigationMenuItemView.setTextColor(this.e.i);
      }
      if (this.e.k != null) {}
      for (Drawable localDrawable = this.e.k.getConstantState().newDrawable();; localDrawable = null)
      {
        localNavigationMenuItemView.setBackgroundDrawable(localDrawable);
        localNavigationMenuItemView.a(localaar.d(), 0);
        return localView2;
      }
      if (paramView == null) {}
      for (View localView1 = this.e.f.inflate(2130968759, paramViewGroup, false);; localView1 = paramView)
      {
        ((TextView)localView1).setText(localaar.d().getTitle());
        return localView1;
        if (paramView == null) {
          paramView = this.e.f.inflate(2130968758, paramViewGroup, false);
        }
        paramView.setPadding(0, localaar.b(), 0, localaar.c());
        break;
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return ((aar)getItem(paramInt)).e();
  }
  
  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     m
 * JD-Core Version:    0.7.0.1
 */