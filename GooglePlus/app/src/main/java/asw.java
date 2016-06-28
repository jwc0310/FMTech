import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class asw
  extends BaseAdapter
{
  public final Context a;
  public ArrayList<atq> b = new ArrayList();
  
  public asw(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    CharSequence localCharSequence = this.a.getResources().getText(paramInt3);
    this.b.add(new asz(this.a, paramInt1, paramInt2, localCharSequence));
  }
  
  public final int getCount()
  {
    return this.b.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((atq)this.b.get(paramInt)).a();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return ((atq)this.b.get(paramInt)).a(paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return atb.a().length;
  }
  
  public final boolean isEmpty()
  {
    return this.b.isEmpty();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     asw
 * JD-Core Version:    0.7.0.1
 */