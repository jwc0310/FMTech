import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.internal.NavigationMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

public final class l
  implements AdapterView.OnItemClickListener, xz
{
  public NavigationMenuView a;
  public LinearLayout b;
  xl c;
  public int d;
  public m e;
  public LayoutInflater f;
  int g;
  boolean h;
  ColorStateList i;
  ColorStateList j;
  public Drawable k;
  int l;
  
  public final void a(int paramInt)
  {
    this.g = paramInt;
    this.h = true;
    if (this.e != null) {
      this.e.notifyDataSetChanged();
    }
  }
  
  public final void a(Context paramContext, xl paramxl)
  {
    this.f = LayoutInflater.from(paramContext);
    this.c = paramxl;
    Resources localResources = paramContext.getResources();
    localResources.getDimensionPixelOffset(2131493241);
    this.l = localResources.getDimensionPixelOffset(2131493242);
  }
  
  public final void a(ColorStateList paramColorStateList)
  {
    this.j = paramColorStateList;
    if (this.e != null) {
      this.e.notifyDataSetChanged();
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    Bundle localBundle1 = (Bundle)paramParcelable;
    SparseArray localSparseArray = localBundle1.getSparseParcelableArray("android:menu:list");
    if (localSparseArray != null) {
      this.a.restoreHierarchyState(localSparseArray);
    }
    Bundle localBundle2 = localBundle1.getBundle("android:menu:adapter");
    if (localBundle2 != null)
    {
      m localm = this.e;
      int m = localBundle2.getInt("android:menu:checked", 0);
      if (m != 0)
      {
        localm.c = true;
        Iterator localIterator = localm.a.iterator();
        while (localIterator.hasNext())
        {
          xp localxp = ((aar)localIterator.next()).d();
          if ((localxp != null) && (localxp.getItemId() == m)) {
            localm.a(localxp);
          }
        }
        localm.c = false;
        localm.a();
      }
    }
  }
  
  public final void a(xl paramxl, boolean paramBoolean) {}
  
  public final void a(boolean paramBoolean)
  {
    if (this.e != null) {
      this.e.notifyDataSetChanged();
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(xp paramxp)
  {
    return false;
  }
  
  public final boolean a(ye paramye)
  {
    return false;
  }
  
  public final int b()
  {
    return this.d;
  }
  
  public final void b(ColorStateList paramColorStateList)
  {
    this.i = paramColorStateList;
    if (this.e != null) {
      this.e.notifyDataSetChanged();
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.e != null) {
      this.e.c = paramBoolean;
    }
  }
  
  public final boolean b(xp paramxp)
  {
    return false;
  }
  
  public final Parcelable c()
  {
    Bundle localBundle1 = new Bundle();
    if (this.a != null)
    {
      SparseArray localSparseArray = new SparseArray();
      this.a.saveHierarchyState(localSparseArray);
      localBundle1.putSparseParcelableArray("android:menu:list", localSparseArray);
    }
    if (this.e != null)
    {
      m localm = this.e;
      Bundle localBundle2 = new Bundle();
      if (localm.b != null) {
        localBundle2.putInt("android:menu:checked", localm.b.getItemId());
      }
      localBundle1.putBundle("android:menu:adapter", localBundle2);
    }
    return localBundle1;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int m = paramInt - this.a.getHeaderViewsCount();
    if (m >= 0)
    {
      if (this.e != null) {
        this.e.c = true;
      }
      xp localxp = ((aar)this.e.getItem(m)).d();
      if ((localxp != null) && (localxp.isCheckable())) {
        this.e.a(localxp);
      }
      this.c.a(localxp, this, 0);
      if (this.e != null) {
        this.e.c = false;
      }
      if (this.e != null) {
        this.e.notifyDataSetChanged();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     l
 * JD-Core Version:    0.7.0.1
 */