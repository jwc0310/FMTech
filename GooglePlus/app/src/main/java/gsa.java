import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

final class gsa
  implements AdapterView.OnItemSelectedListener
{
  gsa(grz paramgrz) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.h = paramInt;
    String str1 = ((qrs)this.a.c.getItem(paramInt)).a;
    Spinner localSpinner = this.a.g;
    String str2 = String.valueOf(this.a.a.getString(efj.EI));
    String str3 = String.valueOf(this.a.f.b(((qrs)this.a.c.getItem(paramInt)).b()));
    localSpinner.setContentDescription(2 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + ", " + str3);
    this.a.e.b.a = str1;
    grv localgrv = this.a.e;
    bz localbz = localgrv.a.b.a.d;
    bk localbk = localbz.a(efj.ED);
    cl localcl = localbz.a();
    if (localbk != null) {
      localcl.a(localbk);
    }
    gse localgse = new gse(localgrv.a);
    localcl.a(efj.ED, localgse).b();
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gsa
 * JD-Core Version:    0.7.0.1
 */