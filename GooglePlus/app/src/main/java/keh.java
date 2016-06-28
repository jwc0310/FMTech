import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class keh
  extends ket
{
  public Intent a;
  public CharSequence b;
  
  public keh(Context paramContext)
  {
    super(paramContext);
    b(az.B);
  }
  
  protected final View a(ViewGroup paramViewGroup)
  {
    View localView = super.a(paramViewGroup);
    TextView localTextView = (TextView)localView.findViewById(da.O);
    localTextView.setText(this.b);
    localTextView.setOnClickListener(new kei(this));
    return localView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     keh
 * JD-Core Version:    0.7.0.1
 */