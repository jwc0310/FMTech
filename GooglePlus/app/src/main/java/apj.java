import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Date;

public final class apj
  implements atq
{
  private final String a;
  
  public apj(Context paramContext, Date paramDate)
  {
    this.a = DateUtils.formatDateTime(paramContext, paramDate.getTime(), 4);
  }
  
  public final int a()
  {
    return aow.c.ordinal();
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.wO, paramViewGroup, false);
    }
    ((TextView)paramView.findViewById(aaw.mG)).setText(this.a);
    return paramView;
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apj
 * JD-Core Version:    0.7.0.1
 */