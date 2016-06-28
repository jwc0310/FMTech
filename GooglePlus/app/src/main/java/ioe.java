import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

final class ioe
  extends ioh
{
  ioe(iod paramiod)
  {
    super(paramiod);
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
  {
    return paramLayoutInflater.inflate(efj.OJ, paramViewGroup, false);
  }
  
  public final void a(View paramView, int paramInt)
  {
    ((TextView)paramView.findViewById(aw.aK)).setText(this.f);
    ((TextView)paramView.findViewById(aw.aG)).setText(this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ioe
 * JD-Core Version:    0.7.0.1
 */