import android.content.Intent;
import com.google.android.apps.plus.phone.PhotosAppPromoActivity;

final class cfk
  implements guf
{
  cfk(cff paramcff) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    int i;
    if ((paramInt == -1) && (paramIntent != null))
    {
      i = paramIntent.getIntExtra("manual_awesome_activity_return", 0);
      if (i != 1) {
        break label155;
      }
      localcff = this.a;
      localgxx = (gxx)localcff.bo.a(gxx.class);
      localgxw = new gxw(localcff.bn);
      localgxw.c = gxz.dQ;
      localgxx.a(localgxw);
      if (!((hyi)mbb.a(localcff.bn, hyi.class)).b(bwb.H, localcff.am.c())) {
        break label141;
      }
      localIntent2 = localcff.J();
      localIntent2.putExtra("account_id", localcff.am.c());
      localcff.a(localIntent2);
    }
    label141:
    label155:
    while ((i != 2) || (!paramIntent.hasExtra("result_media")))
    {
      cff localcff;
      gxx localgxx;
      gxw localgxw;
      Intent localIntent2;
      return;
      localcff.a(PhotosAppPromoActivity.a(localcff.bn));
      return;
    }
    ipf localipf = (ipf)paramIntent.getParcelableExtra("result_media");
    bdo localbdo = new bdo(this.a.f(), this.a.am.c());
    localbdo.b = localipf.a;
    localbdo.c = localipf;
    localbdo.e = jrf.a(9, new String[0]);
    Intent localIntent1 = localbdo.a();
    this.a.a(localIntent1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfk
 * JD-Core Version:    0.7.0.1
 */