import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public final class cxm
  extends ArrayAdapter<Pair<String, String>>
{
  private final LayoutInflater a;
  
  public cxm(Context paramContext, List<Pair<String, String>> paramList)
  {
    super(paramContext, efj.st, paramList);
    this.a = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.a.inflate(efj.st, null);
    }
    Pair localPair = (Pair)getItem(paramInt);
    TextView localTextView;
    if (localPair != null)
    {
      ((TextView)paramView.findViewById(aaw.fv)).setText((CharSequence)localPair.first);
      localTextView = (TextView)paramView.findViewById(aaw.mi);
      localTextView.setText((CharSequence)localPair.second);
      if (!TextUtils.isEmpty((CharSequence)localPair.second)) {
        break label104;
      }
    }
    label104:
    for (int i = -7829368;; i = -1)
    {
      localTextView.setBackgroundColor(i);
      return paramView;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxm
 * JD-Core Version:    0.7.0.1
 */