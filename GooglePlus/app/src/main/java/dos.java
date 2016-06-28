import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

final class dos
  implements Runnable
{
  dos(dor paramdor, int paramInt1, int paramInt2, Context paramContext, int paramInt3) {}
  
  public final void run()
  {
    doq localdoq1 = this.e.a;
    boolean bool;
    Object localObject;
    String str2;
    if (this.a != this.b)
    {
      bool = true;
      localdoq1.ag = bool;
      if (this.e.a.ag) {
        break label151;
      }
      doq localdoq5 = this.e.a;
      int m = aau.on;
      localObject = localdoq5.g().getString(m);
      doq localdoq6 = this.e.a;
      int n = aau.om;
      str2 = localdoq6.g().getString(n);
      Toast.makeText(this.c, aau.oq, 0).show();
      this.e.a.w();
    }
    for (;;)
    {
      this.e.a.af.b((CharSequence)localObject);
      this.e.a.af.a_(str2);
      return;
      bool = false;
      break;
      label151:
      doq localdoq2 = this.e.a;
      int i = aau.ok;
      String str1 = localdoq2.g().getString(i);
      if ((this.d == 0) || (this.d == 1))
      {
        doq localdoq3 = this.e.a;
        int j = aau.os;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(this.b);
        arrayOfObject1[1] = Integer.valueOf(this.a);
        str2 = localdoq3.g().getString(j, arrayOfObject1);
        localObject = str1;
      }
      else
      {
        String str3 = doq.a(this.e.a, this.d);
        doq localdoq4 = this.e.a;
        int k = aau.ot;
        Object[] arrayOfObject2 = { str3 };
        str2 = localdoq4.g().getString(k, arrayOfObject2);
        localObject = str1;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dos
 * JD-Core Version:    0.7.0.1
 */