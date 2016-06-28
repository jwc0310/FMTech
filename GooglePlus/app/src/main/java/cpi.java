import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

final class cpi
  extends ArrayAdapter<cpj>
{
  cpi(cph paramcph, Context paramContext, int paramInt, List paramList)
  {
    super(paramContext, 0, paramList);
  }
  
  public final int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    hgl localhgl = new hgl(this.a.aa);
    localhgl.c(false);
    localhgl.a(false);
    cpj localcpj = (cpj)getItem(paramInt);
    localhgl.setTag(localcpj);
    localhgl.a(localcpj.a, localcpj.b, localcpj.c, 0, aau.a(this.a.ad, this.a.Z.c(), localcpj.b));
    return localhgl;
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpi
 * JD-Core Version:    0.7.0.1
 */