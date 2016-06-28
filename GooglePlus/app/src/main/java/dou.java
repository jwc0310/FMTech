import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;

final class dou
  implements key
{
  dou(doq paramdoq) {}
  
  public final boolean a(ket paramket)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.a.al.e());
    if (localArrayList.isEmpty()) {
      return false;
    }
    if (!this.a.ag)
    {
      dpl localdpl = new dpl(this.a, localArrayList);
      new AlertDialog.Builder(this.a.bn).setMessage(aau.op).setPositiveButton(aau.vS, localdpl).setNegativeButton(aau.ly, localdpl).create().show();
    }
    for (;;)
    {
      return true;
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        hbj.d(this.a.bn, localInteger.intValue());
      }
      this.a.ag = false;
      this.a.w();
      doq localdoq1 = this.a;
      int i = aau.on;
      paramket.b(localdoq1.g().getString(i));
      doq localdoq2 = this.a;
      int j = aau.om;
      paramket.a_(localdoq2.g().getString(j));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dou
 * JD-Core Version:    0.7.0.1
 */