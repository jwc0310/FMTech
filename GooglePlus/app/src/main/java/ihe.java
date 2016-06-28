import android.annotation.TargetApi;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.google.android.libraries.social.ingest.ui.DateTileView;
import com.google.android.libraries.social.ingest.ui.MtpThumbnailTileView;

@TargetApi(12)
public final class ihe
  extends BaseAdapter
  implements SectionIndexer
{
  public ihp a;
  private int b = ihr.b;
  private LayoutInflater c;
  private int d = 0;
  
  public ihe(Activity paramActivity)
  {
    this.c = LayoutInflater.from(paramActivity);
  }
  
  public final int a(int paramInt)
  {
    int i = -1;
    if (this.a == null) {}
    int j;
    ihv localihv;
    label144:
    do
    {
      do
      {
        return i;
        ihp localihp = this.a;
        j = this.b;
        localihv = localihp.e;
      } while (localihv == null);
      if (j == ihr.b) {
        paramInt = -1 + localihv.b.length - paramInt;
      }
      int k = -1 + localihv.c.length;
      int m = 0;
      while (k >= m)
      {
        n = (k + m) / 2;
        if (localihv.c[n].d + localihv.c[n].e <= paramInt)
        {
          m = n + 1;
        }
        else
        {
          if (localihv.c[n].d <= paramInt) {
            break label144;
          }
          k = n - 1;
        }
      }
      int n = 0;
      i = 1 + (paramInt + localihv.c[n].b - localihv.c[n].d);
    } while (j != ihr.b);
    return localihv.a.length - i;
  }
  
  public final boolean areAllItemsEnabled()
  {
    return true;
  }
  
  public final int getCount()
  {
    ihp localihp = this.a;
    int i = 0;
    if (localihp != null)
    {
      ihv localihv = this.a.e;
      i = 0;
      if (localihv != null) {
        i = localihv.a.length;
      }
    }
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    ihp localihp = this.a;
    int i = this.b;
    ihv localihv = localihp.e;
    if (localihv == null) {
      return null;
    }
    if (i == ihr.a)
    {
      ihh localihh2 = localihv.c[localihv.a[paramInt]];
      if (localihh2.b == paramInt) {
        return localihh2.a;
      }
      return localihv.b[(-1 + (paramInt + localihh2.d) - localihh2.b)];
    }
    int j = -1 + localihv.a.length - paramInt;
    ihh localihh1 = localihv.c[localihv.a[j]];
    if (localihh1.c == j) {
      return localihh1.a;
    }
    return localihv.b[(j + localihh1.d - localihh1.b)];
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt == getPositionForSection(getSectionForPosition(paramInt))) {
      return 1;
    }
    return 0;
  }
  
  public final int getPositionForSection(int paramInt)
  {
    if (getCount() == 0) {
      return 0;
    }
    int i = getSections().length;
    if (paramInt >= i) {
      paramInt = i - 1;
    }
    ihp localihp = this.a;
    int j = this.b;
    ihv localihv = localihp.e;
    if (j == ihr.a) {
      return localihv.c[paramInt].b;
    }
    return -1 + (localihv.a.length - localihv.c[(-1 + localihv.c.length - paramInt)].c);
  }
  
  public final int getSectionForPosition(int paramInt)
  {
    int i = getCount();
    if (i == 0) {
      return 0;
    }
    if (paramInt >= i) {
      paramInt = i - 1;
    }
    ihp localihp = this.a;
    int j = this.b;
    ihv localihv = localihp.e;
    if (j == ihr.a) {
      return localihv.a[paramInt];
    }
    return -1 + localihv.c.length - localihv.a[(-1 + localihv.a.length - paramInt)];
  }
  
  public final Object[] getSections()
  {
    int i;
    ihv localihv;
    if (getCount() > 0)
    {
      ihp localihp = this.a;
      i = this.b;
      localihv = localihp.e;
      if (localihv != null) {}
    }
    else
    {
      return null;
    }
    if (i == ihr.a) {
      return localihv.c;
    }
    return localihv.d;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (getItemViewType(paramInt) == 0)
    {
      if (paramView == null) {}
      for (localObject = (MtpThumbnailTileView)this.c.inflate(efj.Nw, paramViewGroup, false);; localObject = (MtpThumbnailTileView)paramView)
      {
        ((MtpThumbnailTileView)localObject).a(this.a.a(), (ihk)getItem(paramInt), this.d);
        return localObject;
      }
    }
    label86:
    int j;
    int k;
    TextView localTextView;
    if (paramView == null)
    {
      localObject = (DateTileView)this.c.inflate(efj.Nu, paramViewGroup, false);
      ihw localihw = (ihw)getItem(paramInt);
      int i = localihw.b;
      j = localihw.a;
      k = localihw.c;
      if (i != ((DateTileView)localObject).g)
      {
        ((DateTileView)localObject).g = i;
        localTextView = ((DateTileView)localObject).b;
        if (((DateTileView)localObject).g <= 9) {
          break label297;
        }
      }
    }
    label297:
    int m;
    for (String str = Integer.toString(((DateTileView)localObject).g);; str = 12 + "0" + m)
    {
      localTextView.setText(str);
      if (((DateTileView)localObject).h != DateTileView.a)
      {
        ((DateTileView)localObject).h = DateTileView.a;
        if (j == ((DateTileView)localObject).e) {
          ((DateTileView)localObject).c.setText(localObject.h[localObject.e]);
        }
      }
      if (j != ((DateTileView)localObject).e)
      {
        ((DateTileView)localObject).e = j;
        ((DateTileView)localObject).c.setText(localObject.h[localObject.e]);
      }
      if (k == ((DateTileView)localObject).f) {
        break;
      }
      ((DateTileView)localObject).f = k;
      ((DateTileView)localObject).d.setText(Integer.toString(((DateTileView)localObject).f));
      return localObject;
      localObject = (DateTileView)paramView;
      break label86;
      m = ((DateTileView)localObject).g;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return true;
  }
  
  public final void notifyDataSetChanged()
  {
    this.d = (1 + this.d);
    super.notifyDataSetChanged();
  }
  
  public final void notifyDataSetInvalidated()
  {
    this.d = (1 + this.d);
    super.notifyDataSetInvalidated();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihe
 * JD-Core Version:    0.7.0.1
 */