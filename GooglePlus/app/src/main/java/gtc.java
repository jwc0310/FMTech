import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class gtc
{
  final bp a;
  final ics b;
  final pde c;
  final gth d;
  final qrw e;
  private final bk f;
  
  gtc(bp parambp, bk parambk, ics paramics, pde parampde, gth paramgth, qrw paramqrw)
  {
    this.a = parambp;
    this.f = parambk;
    this.b = paramics;
    this.c = parampde;
    this.d = paramgth;
    this.e = paramqrw;
  }
  
  final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
  {
    int i = this.f.g().getDimensionPixelSize(efj.EL);
    View localView = paramLayoutInflater.inflate(efj.EO, paramViewGroup, false);
    if (Build.VERSION.SDK_INT >= 17)
    {
      localView.findViewById(16908308).setPaddingRelative(i, 0, 0, 0);
      return localView;
    }
    localView.findViewById(16908308).setPadding(i, 0, 0, 0);
    return localView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gtc
 * JD-Core Version:    0.7.0.1
 */