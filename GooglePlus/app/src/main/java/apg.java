import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.photos.allphotos.adapter.WrappingLinearLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class apg
  implements atq
{
  private static final SimpleDateFormat a = new SimpleDateFormat("LLL", Locale.getDefault());
  private static boolean b;
  private static int c;
  private final asu d;
  private final asv e;
  private final String f;
  
  public apg(Context paramContext, asu paramasu, asv paramasv, Date paramDate)
  {
    if (paramasv.a() > 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      efj.c(bool1, "RowItemProvider must not be empty");
      int i = paramasu.a.size();
      boolean bool2 = false;
      if (i <= 24) {
        bool2 = true;
      }
      int j = paramasu.a.size();
      efj.c(bool2, 37 + "RowInfo has too many ids: " + j);
      this.d = paramasu;
      this.e = paramasv;
      this.f = a.format(paramDate);
      if (!b)
      {
        b = true;
        c = (int)paramContext.getResources().getDimension(efj.ms);
      }
      return;
    }
  }
  
  public static int b()
  {
    return 24;
  }
  
  public final int a()
  {
    return aow.b.ordinal();
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.uG, paramViewGroup, false);
    }
    ((TextView)paramView.findViewById(aaw.fl)).setText(this.f);
    WrappingLinearLayout localWrappingLinearLayout = (WrappingLinearLayout)paramView.findViewById(aaw.fm);
    int i = 0;
    if (i < this.e.a())
    {
      View localView1 = localWrappingLinearLayout.getChildAt(i);
      if (localView1 == null) {}
      for (int k = 1;; k = 0)
      {
        View localView2 = this.e.a(i, c, localView1, paramViewGroup);
        localView2.setLayoutParams(new api(c, c));
        localView2.setVisibility(0);
        if (k != 0) {
          localWrappingLinearLayout.addView(localView2);
        }
        i++;
        break;
      }
    }
    for (int j = this.e.a(); j < localWrappingLinearLayout.getChildCount(); j++) {
      localWrappingLinearLayout.getChildAt(j).setVisibility(8);
    }
    return paramView;
  }
  
  public final void a(atr paramatr)
  {
    paramatr.a(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apg
 * JD-Core Version:    0.7.0.1
 */