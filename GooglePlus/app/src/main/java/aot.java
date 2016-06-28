import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class aot
  implements atq
{
  private final int a;
  private final Context b;
  private final ast c;
  
  public aot(Context paramContext, ast paramast, int paramInt)
  {
    this.a = paramInt;
    this.b = paramContext;
    this.c = paramast;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.sI, paramViewGroup, false);
    }
    TextView localTextView = (TextView)paramView.findViewById(aaw.lK);
    if ((this.c.b() == 0L) || (this.c.a() == 0L))
    {
      localTextView.setText(this.b.getString(aau.ve));
      return paramView;
    }
    if (this.c.b)
    {
      localTextView.setText(DateUtils.formatDateRange(this.b, this.c.a(), this.c.b(), 524304));
      return paramView;
    }
    localTextView.setText(DateUtils.formatDateTime(this.b, this.c.a(), 524304));
    return paramView;
  }
  
  public final void a(atr paramatr)
  {
    paramatr.a(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aot
 * JD-Core Version:    0.7.0.1
 */