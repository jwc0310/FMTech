import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.ArrayList;

final class cmd
  extends ArrayAdapter<onj>
{
  public cmd(Context paramContext)
  {
    super(paramContext, efj.tw, new ArrayList());
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 0;
    if (paramView == null) {
      paramView = LayoutInflater.from(getContext()).inflate(efj.tw, null);
    }
    onj localonj = (onj)getItem(paramInt);
    AvatarView localAvatarView = (AvatarView)paramView.findViewById(aaw.as);
    localAvatarView.setVisibility(0);
    localAvatarView.a(localonj.a.b, localonj.a.c);
    ((TextView)paramView.findViewById(aaw.fv)).setText(localonj.a.a);
    int k;
    int m;
    int n;
    if (localonj.b != null)
    {
      mig[] arrayOfmig = localonj.b;
      int j = arrayOfmig.length;
      k = 0;
      m = 0;
      if (i < j)
      {
        mig localmig = arrayOfmig[i];
        if (localmig.a == 2) {
          k = 1;
        }
        for (;;)
        {
          i++;
          break;
          if (localmig.a == 3) {
            m = 1;
          }
        }
      }
      if ((k == 0) || (m == 0)) {
        break label210;
      }
      n = aau.fL;
    }
    for (;;)
    {
      if (n != -1) {
        ((TextView)paramView.findViewById(aaw.K)).setText(paramView.getResources().getString(n));
      }
      return paramView;
      label210:
      if (k != 0) {
        n = aau.fK;
      } else if (m != 0) {
        n = aau.fM;
      } else {
        n = -1;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmd
 * JD-Core Version:    0.7.0.1
 */