import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public final class hpe
  extends ArrayAdapter<hpd>
{
  private final LayoutInflater a;
  private final boolean b;
  
  public hpe(Context paramContext, int paramInt, ArrayList<hpd> paramArrayList, boolean paramBoolean)
  {
    super(paramInt, paramArrayList, paramBoolean);
    this.a = LayoutInflater.from(paramInt);
    boolean bool;
    this.b = bool;
  }
  
  private final View a(View paramView, ViewGroup paramViewGroup, hpd paramhpd)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)paramView;
    if (localRelativeLayout == null) {
      localRelativeLayout = (RelativeLayout)this.a.inflate(aau.zw, paramViewGroup, false);
    }
    ((ImageView)localRelativeLayout.findViewById(efj.JA)).setImageResource(paramhpd.d);
    return localRelativeLayout;
  }
  
  private final void a(TextView paramTextView, hpd paramhpd)
  {
    if ((paramhpd.c == 1) || (paramhpd.c == 4)) {}
    for (int i = aw.aD;; i = aw.aE)
    {
      paramTextView.setTextColor(getContext().getResources().getColor(i));
      return;
    }
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    hpd localhpd = (hpd)getItem(paramInt);
    View localView = a(paramView, paramViewGroup, localhpd);
    TextView localTextView = (TextView)localView.findViewById(efj.JB);
    localTextView.setText(localhpd.a);
    if (this.b) {
      a(localTextView, localhpd);
    }
    ((TextView)localView.findViewById(efj.Jy)).setText(localhpd.b);
    localView.findViewById(efj.Jz).setVisibility(8);
    return localView;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    hpd localhpd = (hpd)getItem(paramInt);
    View localView = a(paramView, paramViewGroup, localhpd);
    localView.setTag(Integer.valueOf(localhpd.c));
    TextView localTextView = (TextView)localView.findViewById(efj.JB);
    localTextView.setText(hpb.a(this.c, localhpd));
    if (this.b) {
      a(localTextView, localhpd);
    }
    ((TextView)localView.findViewById(efj.Jy)).setText(ehr.bS);
    return localView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpe
 * JD-Core Version:    0.7.0.1
 */