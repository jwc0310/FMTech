import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.help.TooltipView;
import java.util.List;

final class ead
  implements View.OnClickListener
{
  ead(eab parameab, View paramView) {}
  
  public final void onClick(View paramView)
  {
    if (this.b.o == null) {
      return;
    }
    kuu localkuu = new kuu(pkh.h, this.b.D);
    dge localdge = this.b.o;
    String str1 = this.b.D;
    String str2 = this.b.E;
    Intent localIntent = ((hpo)mbb.a(localdge.b, hpo.class)).a(localdge.a, str1, str2);
    localdge.b.startActivity(localIntent);
    if (this.b.A != null)
    {
      Context localContext = this.b.getContext();
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pkh.M);
      localgxr.b.add(localgxq);
      localgxr.b.add(localkuu);
      new gwz(-1, localgxr.a(this.a)).b(localContext);
      this.b.A.a(true);
    }
    eab.a(this.b, localkuu, paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ead
 * JD-Core Version:    0.7.0.1
 */