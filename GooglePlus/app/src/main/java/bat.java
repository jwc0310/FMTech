import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.libraries.social.stream.legacy.views.CardSocialBarViewGroup;

public final class bat
  implements atq
{
  bas a;
  int b;
  boolean c;
  boolean d;
  String e;
  int f;
  boolean g;
  boolean h;
  private Context i;
  
  bat(Context paramContext)
  {
    this.i = paramContext;
  }
  
  public final int a()
  {
    return -1 + bao.c;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    LinearLayout localLinearLayout = (LinearLayout)paramView;
    if (localLinearLayout == null) {
      localLinearLayout = (LinearLayout)((LayoutInflater)this.i.getSystemService("layout_inflater")).inflate(efj.vQ, paramViewGroup, false);
    }
    boolean bool1 = this.d;
    lmj locallmj = null;
    if (bool1)
    {
      String str = this.e;
      locallmj = null;
      if (str != null)
      {
        oks localoks = new oks();
        localoks.a = this.e;
        localoks.e = Integer.valueOf(this.f);
        localoks.c = Boolean.valueOf(this.g);
        locallmj = new lmj(localoks);
      }
    }
    CardSocialBarViewGroup localCardSocialBarViewGroup = (CardSocialBarViewGroup)localLinearLayout.findViewById(aaw.kd);
    boolean bool2;
    Button localButton;
    if (locallmj != null)
    {
      bool2 = true;
      localCardSocialBarViewGroup.a(locallmj, bool2, this.h, this.b, 0, this.a);
      localButton = (Button)localLinearLayout.findViewById(aaw.hJ);
      if (this.f != 0) {
        break label195;
      }
      localButton.setVisibility(8);
    }
    for (;;)
    {
      localLinearLayout.requestLayout();
      return localLinearLayout;
      bool2 = false;
      break;
      label195:
      Resources localResources = this.i.getResources();
      int j = efj.xQ;
      int k = this.f;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.f);
      localButton.setText(localResources.getQuantityString(j, k, arrayOfObject));
      localButton.setOnClickListener(new gxn(new bau(this)));
      localButton.setVisibility(0);
    }
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bat
 * JD-Core Version:    0.7.0.1
 */