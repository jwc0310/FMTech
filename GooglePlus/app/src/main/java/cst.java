import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.apps.plus.locations.LocationSharingRadioGroup;

final class cst
  implements View.OnClickListener
{
  cst(cso paramcso, View paramView) {}
  
  public final void onClick(View paramView)
  {
    cso localcso = this.b;
    View localView1 = this.a;
    if (localcso.l)
    {
      localcso.a();
      return;
    }
    localcso.a(gxz.cI, gya.R);
    TextView localTextView = (TextView)localView1.findViewById(aaw.ea);
    ViewFlipper localViewFlipper1 = (ViewFlipper)localView1.findViewById(aaw.eW);
    LocationSharingRadioGroup localLocationSharingRadioGroup = (LocationSharingRadioGroup)localView1.findViewById(aaw.io);
    Button localButton1 = (Button)localView1.findViewById(aaw.fF);
    View localView2 = localView1.findViewById(aaw.aO);
    Button localButton2 = (Button)localView1.findViewById(aaw.hN);
    ViewFlipper localViewFlipper2 = (ViewFlipper)localView1.findViewById(aaw.eK);
    if (localcso.f.c.booleanValue()) {
      localcso.a.b();
    }
    for (;;)
    {
      int i = efj.a(localcso.g.e.n.a).a;
      if ((!localcso.f.c.booleanValue()) || (i == 2)) {
        localViewFlipper2.setVisibility(4);
      }
      efj.a(localViewFlipper2);
      Resources localResources = localcso.c.getResources();
      int j = aau.iu;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localcso.g.e.a.a;
      localTextView.setText(localResources.getString(j, arrayOfObject));
      localLocationSharingRadioGroup.setVisibility(0);
      efj.d(localViewFlipper1);
      localButton1.setVisibility(0);
      localView2.setVisibility(0);
      localButton2.setText(aau.in);
      localButton2.setOnClickListener(new csu(localcso, localLocationSharingRadioGroup));
      return;
      localViewFlipper1.setBackgroundColor(localcso.c.getResources().getColor(efj.jC));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cst
 * JD-Core Version:    0.7.0.1
 */