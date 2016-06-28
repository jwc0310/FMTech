import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.List;

final class inv
  extends BaseAdapter
{
  private final List<inu> a;
  
  inv(List<inu> paramList)
  {
    Object localObject;
    this.a = localObject;
  }
  
  public final int getCount()
  {
    return this.a.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = this.b.Z.inflate(efj.OL, paramViewGroup, false);
    inu localinu = (inu)this.a.get(paramInt);
    ((AvatarView)localView.findViewById(aw.aH)).a(localinu.a, localinu.c);
    ((TextView)localView.findViewById(aw.aK)).setText(localinu.b);
    return localView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     inv
 * JD-Core Version:    0.7.0.1
 */