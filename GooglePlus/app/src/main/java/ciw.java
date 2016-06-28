import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.libraries.social.discovery.views.PeopleListRowAsCardView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;

final class ciw
  extends BaseAdapter
{
  osm a;
  
  ciw(ciu paramciu) {}
  
  public final int getCount()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.c.length;
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    oso localoso = (oso)getItem(paramInt);
    if (paramView == null) {}
    for (PeopleListRowAsCardView localPeopleListRowAsCardView = (PeopleListRowAsCardView)this.b.a_(null).inflate(efj.vw, null);; localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView)
    {
      PeopleListRowView localPeopleListRowView = (PeopleListRowView)localPeopleListRowAsCardView.h;
      localPeopleListRowView.a(this.b, this.b.ag, false);
      localPeopleListRowView.a(localoso, null, null);
      localPeopleListRowView.setOnClickListener(this.b);
      localPeopleListRowView.g = 7;
      localPeopleListRowView.h = null;
      localPeopleListRowAsCardView.a();
      return localPeopleListRowAsCardView;
    }
  }
  
  public final boolean isEmpty()
  {
    return this.a == null;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ciw
 * JD-Core Version:    0.7.0.1
 */