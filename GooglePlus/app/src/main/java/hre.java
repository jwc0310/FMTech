import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import java.util.Collection;
import java.util.List;

public final class hre
  extends BaseAdapter
  implements View.OnClickListener, hru
{
  private hrd a;
  private int b;
  private Context c;
  private List<hrx> d;
  private hrs e;
  
  public hre(Context paramContext, hrd paramhrd)
  {
    this.a = paramhrd;
    this.c = paramContext;
    this.b = paramhrd.a(paramContext);
    this.d = mbb.c(paramContext, hrx.class);
    this.e = ((hrs)mbb.b(paramContext, hrs.class));
    if ((this.e instanceof hrw)) {
      ((hrw)this.e).a(this);
    }
  }
  
  private final View a(int paramInt, hro paramhro)
  {
    int i = this.a.x();
    int j = paramInt * this.b;
    int k = j + this.b;
    int m = Math.min(i, k);
    int n = j;
    if (n < m)
    {
      int i3 = n - j;
      View localView = paramhro.a[i3];
      Parcelable localParcelable = this.a.a(n);
      hrd localhrd = this.a;
      Context localContext = this.c;
      if ((this.e != null) && (this.e.c(localParcelable))) {}
      for (boolean bool = true;; bool = false)
      {
        localhrd.a(localContext, n, localView, bool);
        localView.setTag(localParcelable);
        localView.setOnClickListener(new gxn(this));
        paramhro.a[i3] = localView;
        paramhro.a[i3].setVisibility(0);
        n++;
        break;
      }
    }
    for (;;)
    {
      int i1;
      if (i1 < k)
      {
        int i2 = i1 - j;
        paramhro.a[i2].setVisibility(4);
        i1++;
      }
      else
      {
        return paramhro;
        i1 = n;
      }
    }
  }
  
  public final void a(int paramInt, Parcelable paramParcelable)
  {
    notifyDataSetChanged();
  }
  
  public final void a(Integer paramInteger, Collection<Parcelable> paramCollection)
  {
    notifyDataSetChanged();
  }
  
  public final int getCount()
  {
    int i = 1;
    if (this.a == null) {
      return 0;
    }
    int j = (this.a.x() + (-1 + this.b)) / this.b;
    int k;
    if (this.a.w())
    {
      k = i;
      if (!this.a.v()) {
        break label70;
      }
    }
    for (;;)
    {
      return i + (k + j);
      k = 0;
      break;
      label70:
      i = 0;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    return this.a.a(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if ((paramInt == -1 + getCount()) && (this.a.w())) {
      return 1;
    }
    if ((paramInt == 0) && (this.a.v())) {
      return 0;
    }
    return 2;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((this.a.v()) && (paramInt == 0))
    {
      if (paramView == null)
      {
        View localView2 = this.a.c(this.c);
        this.a.a(this.c, localView2);
        return localView2;
      }
      this.a.a(this.c, paramView);
      return paramView;
    }
    if ((this.a.w()) && (paramInt == -1 + getCount()))
    {
      if (paramView == null)
      {
        View localView1 = this.a.d(this.c);
        this.a.a(localView1);
        return localView1;
      }
      this.a.a(paramView);
      return paramView;
    }
    if (this.a.v()) {
      paramInt--;
    }
    if (paramView == null)
    {
      hro localhro = new hro(this.c);
      hrd localhrd = this.a;
      int i = this.b;
      localhro.a = new View[i];
      for (int j = 0; j < i; j++)
      {
        localhro.a[j] = localhrd.b(localhro.getContext());
        if (localhro.a[j].getLayoutParams() == null) {
          localhro.a[j].setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        localhro.addView(localhro.a[j]);
      }
      if (Build.VERSION.SDK_INT >= 16) {
        localhro.setImportantForAccessibility(2);
      }
      return a(paramInt, localhro);
    }
    return a(paramInt, (hro)paramView);
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final void onClick(View paramView)
  {
    for (int i = 0; i < this.d.size(); i++) {
      ((hrx)this.d.get(i)).a((Parcelable)paramView.getTag());
    }
    if ((this.a instanceof hrx)) {
      ((hrx)this.a).a((Parcelable)paramView.getTag());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hre
 * JD-Core Version:    0.7.0.1
 */