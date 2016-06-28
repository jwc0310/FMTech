import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import java.util.Locale;

public final class ked
  extends CheckBoxPreference
{
  Intent a;
  
  public ked(Context paramContext)
  {
    super(paramContext);
    b(az.C);
  }
  
  protected final View a(ViewGroup paramViewGroup)
  {
    View localView = super.a(paramViewGroup);
    TextView localTextView = (TextView)localView.findViewById(da.T);
    localTextView.setText(this.l.getResources().getString(ei.b).toUpperCase(Locale.getDefault()));
    localTextView.setOnClickListener(new kee(this));
    return localView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ked
 * JD-Core Version:    0.7.0.1
 */