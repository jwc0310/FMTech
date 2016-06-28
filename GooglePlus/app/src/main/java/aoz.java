import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class aoz
  implements atq
{
  public final int a()
  {
    return aow.f.ordinal();
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.sJ, paramViewGroup, false);
      paramView.findViewById(aaw.eF).setVisibility(0);
    }
    paramView.setOnClickListener(new apa(this));
    return paramView;
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aoz
 * JD-Core Version:    0.7.0.1
 */