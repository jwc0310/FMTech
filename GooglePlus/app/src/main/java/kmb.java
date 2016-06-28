import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;

public final class kmb
{
  final kig a = new kig(3);
  final PopupWindow b;
  final View c;
  final View.OnClickListener d;
  final kmc e;
  final Resources f;
  private final LayoutInflater g;
  private final int h;
  
  public kmb(Context paramContext, ArrayList<gnb> paramArrayList, View.OnClickListener paramOnClickListener, View paramView, boolean paramBoolean)
  {
    this.a.a = paramBoolean;
    this.g = LayoutInflater.from(paramContext);
    this.f = paramContext.getApplicationContext().getResources();
    this.d = paramOnClickListener;
    this.c = paramView;
    this.a.a(paramContext, paramArrayList);
    this.h = eyg.be;
    this.e = new kmc(this, paramContext);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.e.setLayoutParams(localLayoutParams);
    this.e.setBackgroundResource(eyg.bi);
    this.b = new PopupWindow(this.e, -2, -2);
  }
  
  final void a(gnb paramgnb, String paramString, int paramInt, boolean paramBoolean, ViewGroup paramViewGroup, View.OnClickListener paramOnClickListener)
  {
    View localView = this.g.inflate(efj.UM, paramViewGroup, false);
    localView.setSelected(paramBoolean);
    ImageView localImageView = (ImageView)localView.findViewById(aau.Bg);
    TextView localTextView = (TextView)localView.findViewById(aau.Bh);
    localTextView.setTextColor(paramInt);
    localTextView.setText(paramString);
    int j;
    jgs localjgs;
    if (paramgnb != null)
    {
      int i = paramgnb.c.length;
      if (i <= 0) {
        break label233;
      }
      j = 0;
      if (j < i)
      {
        localjgs = paramgnb.c[j];
        if (localjgs.c != 9) {
          break label141;
        }
        localImageView.setImageDrawable(this.f.getDrawable(eyg.bg));
      }
    }
    for (;;)
    {
      localView.setTag(paramgnb);
      localView.setOnClickListener(paramOnClickListener);
      paramViewGroup.addView(localView);
      return;
      label141:
      if (localjgs.c == 8)
      {
        localImageView.setImageDrawable(this.f.getDrawable(eyg.bd));
      }
      else if (localjgs.c == 7)
      {
        localImageView.setImageDrawable(this.f.getDrawable(eyg.ba));
      }
      else
      {
        localImageView.setImageDrawable(this.f.getDrawable(eyg.bb));
        localImageView.setContentDescription(this.f.getString(et.b));
        j++;
        break;
        label233:
        if (paramgnb.e.length > 0)
        {
          localImageView.setImageDrawable(this.f.getDrawable(this.h));
          localImageView.setContentDescription(this.f.getString(et.c));
        }
        else if (paramgnb.d.length > 0)
        {
          localImageView.setImageDrawable(this.f.getDrawable(eyg.bc));
          localImageView.setContentDescription(this.f.getString(et.d));
        }
        else if (paramgnb.a > 0)
        {
          localImageView.setImageDrawable(this.f.getDrawable(eyg.bf));
          localImageView.setContentDescription(this.f.getString(et.e));
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmb
 * JD-Core Version:    0.7.0.1
 */