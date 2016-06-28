import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public final class gro
  extends ArrayAdapter<qrs>
{
  private final ics a;
  
  gro(ics paramics, Context paramContext)
  {
    super(paramContext, efj.Ey);
    setDropDownViewResource(efj.Ey);
    this.a = paramics;
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    TextView localTextView = (TextView)super.getDropDownView(paramInt, paramView, paramViewGroup);
    localTextView.setText(this.a.b(((qrs)getItem(paramInt)).b()));
    return localTextView;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    TextView localTextView = (TextView)super.getView(paramInt, paramView, paramViewGroup);
    localTextView.setText(this.a.b(((qrs)getItem(paramInt)).b()));
    return localTextView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gro
 * JD-Core Version:    0.7.0.1
 */