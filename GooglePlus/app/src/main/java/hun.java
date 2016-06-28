import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;

public final class hun
  implements mbo, mec, mfd
{
  private final int a;
  private hum b;
  
  public hun(mek parammek, int paramInt)
  {
    this.a = paramInt;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((hum)parammbb.a(hum.class));
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    View localView = paramView.findViewById(this.a);
    if ((localView instanceof AbsListView)) {
      ((AbsListView)localView).setOnScrollListener(new huo(this));
    }
    while (!(localView instanceof RecyclingViewGroup)) {
      return;
    }
    RecyclingViewGroup localRecyclingViewGroup = (RecyclingViewGroup)localView;
    localRecyclingViewGroup.b = new hup(this);
    localRecyclingViewGroup.b(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hun
 * JD-Core Version:    0.7.0.1
 */