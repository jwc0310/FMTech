import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public final class lhu
  extends ArrayAdapter<lhr>
  implements kxa
{
  private kxb a;
  private final int b;
  
  public lhu(Context paramContext)
  {
    super(paramContext, 17367048);
    setDropDownViewResource(efj.Yt);
    setNotifyOnChange(false);
    this.b = paramContext.getResources().getDimensionPixelSize(efj.Yr);
  }
  
  public final void a(List<lhr> paramList)
  {
    clear();
    if (paramList != null) {
      addAll(paramList);
    }
    notifyDataSetChanged();
  }
  
  public final void a(kxb paramkxb)
  {
    this.a = paramkxb;
    notifyDataSetChanged();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = super.getView(paramInt, paramView, paramViewGroup);
    localView.setPadding(this.b, this.b, this.b, this.b);
    if ((this.a != null) && ((localView instanceof TextView)))
    {
      ((TextView)localView).setTextColor(this.a.d);
      localView.setBackgroundColor(0);
    }
    return localView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhu
 * JD-Core Version:    0.7.0.1
 */