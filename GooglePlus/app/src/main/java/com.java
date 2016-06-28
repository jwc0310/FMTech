import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.libraries.social.squares.list.SquareListItemView;

final class com
  extends BaseAdapter
{
  oed[] a;
  private final Context b;
  private final LayoutInflater c;
  private lfr d;
  
  public com(coh paramcoh, Context paramContext)
  {
    this.b = paramContext;
    this.c = LayoutInflater.from(this.b);
    this.d = ((lfr)paramcoh.bo.a(lfr.class));
  }
  
  public final int getCount()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.length;
  }
  
  public final Object getItem(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      localView = this.c.inflate(efj.wu, paramViewGroup, false);
      localView.setLayoutParams(new lyc(2, -2, 1, 1));
    }
    for (;;)
    {
      SquareListItemView localSquareListItemView = (SquareListItemView)localView;
      localSquareListItemView.a(this.a[paramInt]);
      lfr locallfr = this.d;
      if (localSquareListItemView.c != null) {
        locallfr.a(localSquareListItemView.c);
      }
      return localSquareListItemView;
      localView = paramView;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com
 * JD-Core Version:    0.7.0.1
 */