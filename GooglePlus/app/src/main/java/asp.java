import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

final class asp
  implements Runnable
{
  asp(aso paramaso, bti parambti, jqu[] paramArrayOfjqu) {}
  
  public final void run()
  {
    if (this.a.g) {
      return;
    }
    int i = this.b.a();
    Resources localResources = this.a.a.getResources();
    int j = efj.xC;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    String str1 = localResources.getQuantityString(j, i, arrayOfObject);
    lug locallug = new lug(this.a.a, this.a.f);
    locallug.c = str1;
    String str2 = this.a.a.getString(aau.cJ);
    asq localasq = new asq(this);
    locallug.e.add(new luj(str2, localasq, 0));
    lud locallud = new lud(locallug);
    luk localluk = this.a.f;
    int k = luh.a.b;
    if (localluk.b != null) {
      localluk.a(true);
    }
    localluk.b = locallud.b;
    if (locallud.c)
    {
      localluk.b.setOnTouchListener(localluk.h);
      localluk.b.findViewById(efj.Zz).setOnTouchListener(localluk.h);
      lui locallui = localluk.i;
      locallud.d.add(locallui);
    }
    localluk.e.removeCallbacks(localluk.g);
    if (!efj.B(localluk.a)) {
      localluk.e.postDelayed(localluk.g, k);
    }
    localluk.b.setLayoutParams(localluk.f);
    localluk.c.addView(localluk.b, localluk.f);
    asn localasn = this.a.d;
    bti localbti = this.b;
    jqu[] arrayOfjqu = this.c;
    localasn.c = localbti;
    localasn.a = arrayOfjqu;
    localasn.b = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     asp
 * JD-Core Version:    0.7.0.1
 */