import android.view.View;
import com.google.android.libraries.social.ui.views.DeprecatedExpandingScrollView;

final class bet
  implements bey
{
  bet(bem parambem) {}
  
  public final void a()
  {
    bem localbem = this.a;
    if (localbem.ag != null)
    {
      if (localbem.ag.a()) {
        localbem.ag.c();
      }
    }
    else {
      return;
    }
    localbem.ag.b();
  }
  
  public final void a(View paramView, lwz paramlwz)
  {
    bem localbem = this.a;
    if (localbem.ah != paramView)
    {
      localbem.ah = paramView;
      DeprecatedExpandingScrollView localDeprecatedExpandingScrollView = (DeprecatedExpandingScrollView)bem.a(localbem.N, aaw.dv, aaw.dw);
      localDeprecatedExpandingScrollView.removeAllViews();
      if (paramView != null)
      {
        localDeprecatedExpandingScrollView.addView(paramView);
        localDeprecatedExpandingScrollView.c = paramlwz;
      }
    }
  }
  
  public final boolean b()
  {
    bem localbem = this.a;
    return (localbem.ag != null) && (localbem.ag.a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bet
 * JD-Core Version:    0.7.0.1
 */