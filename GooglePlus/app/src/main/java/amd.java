import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

final class amd
  extends nc
{
  private final LayoutInflater b;
  
  amd(alw paramalw)
  {
    this.b = paramalw.f().getLayoutInflater();
  }
  
  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = this.b.inflate(efj.gn, paramViewGroup, false);
    TextView localTextView = (TextView)localView.findViewById(efj.fY);
    localTextView.setId(paramInt);
    localTextView.setText(alw.a(paramInt));
    paramViewGroup.addView(localView);
    return localView;
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)paramObject);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
  
  public final int b()
  {
    return this.c.ah.size();
  }
  
  public final CharSequence b(int paramInt)
  {
    return alw.a(paramInt);
  }
  
  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    this.c.b(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amd
 * JD-Core Version:    0.7.0.1
 */