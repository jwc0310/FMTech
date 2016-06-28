import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.apps.plus.phone.PanoramaViewerActivity;

public class axe
  extends mca
  implements View.OnClickListener
{
  Animation Z;
  bdi a;
  boolean aa;
  private bdk ab;
  private bdj ac;
  ImageButton b;
  boolean c;
  Animation d;
  
  public axe()
  {
    new jeq(this.bp, new axf(this), '\000');
    new jeq(this.bp, new axg(this), (byte)0);
    new jeq(this.bp, new axh(this));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.b = ((ImageButton)paramLayoutInflater.inflate(efj.uE, paramViewGroup, false));
    this.b.setOnClickListener(this);
    return this.b;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ab = ((bdk)this.bo.a(bdk.class));
    this.a = ((bdi)this.bo.a(bdi.class));
    this.ac = ((bdj)this.bo.a(bdj.class));
    this.c = this.a.c;
    this.d = AnimationUtils.loadAnimation(f(), efj.iG);
    this.Z = AnimationUtils.loadAnimation(f(), efj.iI);
    this.d.setAnimationListener(new axi(this));
    this.Z.setAnimationListener(new axj(this));
  }
  
  public final void m()
  {
    super.m();
    bdj localbdj = this.ac;
    localbdj.c = false;
    localbdj.a.a();
  }
  
  public void onClick(View paramView)
  {
    bcp localbcp = this.ab.b;
    int i = this.m.getInt("account_id", -1);
    if (localbcp.E())
    {
      if (i != -1)
      {
        localgxx = (gxx)this.bo.a(gxx.class);
        localgxw = new gxw(this.bn, i);
        localgxw.c = gxz.dg;
        localgxx.a(localgxw);
      }
      if (localbcp.O())
      {
        a(localbcp.d(f()));
        localbdj = this.ac;
        localbdj.c = true;
        localbdj.a.a();
      }
    }
    while (!localbcp.F())
    {
      gxx localgxx;
      gxw localgxw;
      bdj localbdj;
      return;
      int j = aau.vC;
      String str = g().getString(j);
      Toast.makeText(f(), str, 1).show();
      return;
    }
    bp localbp = f();
    ipf localipf = localbcp.a();
    Intent localIntent = new Intent(localbp, PanoramaViewerActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("photo_ref", localipf);
    a(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axe
 * JD-Core Version:    0.7.0.1
 */