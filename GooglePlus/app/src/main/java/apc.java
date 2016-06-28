import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class apc
  implements atq
{
  boolean a;
  
  public final int a()
  {
    return aow.i.ordinal();
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.sK, paramViewGroup, false);
    }
    if (this.a)
    {
      paramView.findViewById(aaw.eG).setVisibility(4);
      paramView.findViewById(aaw.hX).setVisibility(0);
      paramView.setOnClickListener(null);
      return paramView;
    }
    paramView.findViewById(aaw.eG).setVisibility(0);
    paramView.findViewById(aaw.hX).setVisibility(4);
    paramView.setOnClickListener(new apd(this));
    return paramView;
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apc
 * JD-Core Version:    0.7.0.1
 */