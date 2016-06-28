package android.support.v7.widget;

import aau;
import afe;
import aho;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import efj;
import ll;
import yq;
import yz;
import zv;

public class ShareActionProvider
  extends ll
{
  public final Context d;
  public String e = "share_history.xml";
  private int f = 4;
  private final aho g = new aho(this);
  
  public ShareActionProvider(Context paramContext)
  {
    super(paramContext);
    this.d = paramContext;
  }
  
  public final View a()
  {
    ActivityChooserView localActivityChooserView = new ActivityChooserView(this.d);
    if (!localActivityChooserView.isInEditMode())
    {
      yq localyq1 = yq.a(this.d, this.e);
      yz localyz = localActivityChooserView.a;
      yq localyq2 = localyz.c.a.a;
      if ((localyq2 != null) && (localyz.c.isShown())) {
        localyq2.unregisterObserver(localyz.c.i);
      }
      localyz.a = localyq1;
      if ((localyq1 != null) && (localyz.c.isShown())) {
        localyq1.registerObserver(localyz.c.i);
      }
      localyz.notifyDataSetChanged();
      if (localActivityChooserView.c().e.isShowing())
      {
        localActivityChooserView.b();
        localActivityChooserView.a();
      }
    }
    TypedValue localTypedValue = new TypedValue();
    this.d.getTheme().resolveAttribute(aau.A, localTypedValue, true);
    Drawable localDrawable = zv.a(this.d, localTypedValue.resourceId);
    localActivityChooserView.e.setImageDrawable(localDrawable);
    localActivityChooserView.h = this;
    localActivityChooserView.l = efj.bk;
    int i = efj.bj;
    String str = localActivityChooserView.getContext().getString(i);
    localActivityChooserView.e.setContentDescription(str);
    return localActivityChooserView;
  }
  
  public final void a(SubMenu paramSubMenu)
  {
    paramSubMenu.clear();
    yq localyq = yq.a(this.d, this.e);
    PackageManager localPackageManager = this.d.getPackageManager();
    int i = localyq.a();
    int j = Math.min(i, this.f);
    for (int k = 0; k < j; k++)
    {
      ResolveInfo localResolveInfo2 = localyq.a(k);
      paramSubMenu.add(0, k, k, localResolveInfo2.loadLabel(localPackageManager)).setIcon(localResolveInfo2.loadIcon(localPackageManager)).setOnMenuItemClickListener(this.g);
    }
    if (j < i)
    {
      SubMenu localSubMenu = paramSubMenu.addSubMenu(0, j, j, this.d.getString(efj.bh));
      for (int m = 0; m < i; m++)
      {
        ResolveInfo localResolveInfo1 = localyq.a(m);
        localSubMenu.add(0, m, m, localResolveInfo1.loadLabel(localPackageManager)).setIcon(localResolveInfo1.loadIcon(localPackageManager)).setOnMenuItemClickListener(this.g);
      }
    }
  }
  
  public final boolean f()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ShareActionProvider
 * JD-Core Version:    0.7.0.1
 */