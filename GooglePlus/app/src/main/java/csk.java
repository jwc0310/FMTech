import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public final class csk
  extends bzo
{
  iiu a;
  iiv b;
  private nve[] c;
  
  protected final boolean A()
  {
    return false;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    hqy localhqy = (hqy)localBundle.getParcelable("user_device_locations");
    nve[] arrayOfnve;
    View localView1;
    if (localhqy == null)
    {
      arrayOfnve = null;
      this.c = arrayOfnve;
      localView1 = paramLayoutInflater.inflate(efj.tN, paramViewGroup, false);
      boolean bool = localBundle.getBoolean("show_actions");
      this.b = new iiv(f(), this.c, this.a, true, this.D, bool);
      ((ListView)localView1.findViewById(16908298)).setAdapter(this.b);
      if (this.c != null) {
        break label206;
      }
    }
    View localView2;
    label206:
    for (int i = 0;; i = this.c.length)
    {
      localView2 = localView1.findViewById(aaw.dW);
      if (i <= 1) {
        break label216;
      }
      localView2.setVisibility(0);
      Resources localResources = g();
      int j = efj.xA;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      String str = localResources.getQuantityString(j, i, arrayOfObject);
      ((TextView)localView2.findViewById(aaw.lK)).setText(str);
      return localView1;
      arrayOfnve = (nve[])localhqy.a(new nve[0]);
      break;
    }
    label216:
    localView2.setVisibility(8);
    return localView1;
  }
  
  public final gya r_()
  {
    return gya.P;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csk
 * JD-Core Version:    0.7.0.1
 */