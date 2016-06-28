import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.help.TooltipView;
import java.util.List;

public final class iei
  implements View.OnClickListener
{
  public iei(TooltipView paramTooltipView) {}
  
  public final void onClick(View paramView)
  {
    TooltipView localTooltipView = this.a;
    if (localTooltipView.d.g != null) {
      localTooltipView.getContext().startActivity(localTooltipView.d.g);
    }
    int i = localTooltipView.f.size();
    for (int j = 0; j < i; j++) {
      localTooltipView.f.get(j);
    }
    localTooltipView.a(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iei
 * JD-Core Version:    0.7.0.1
 */