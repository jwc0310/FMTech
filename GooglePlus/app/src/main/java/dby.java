import com.google.android.apps.plus.phone.InviteContactActivity;
import java.util.ArrayList;

public final class dby
  implements Runnable
{
  public dby(InviteContactActivity paramInviteContactActivity, ArrayList paramArrayList) {}
  
  public final void run()
  {
    InviteContactActivity localInviteContactActivity = this.b;
    ArrayList localArrayList = this.a;
    bnp localbnp = new bnp(localInviteContactActivity);
    gjp localgjp = localInviteContactActivity.d;
    efj.k();
    localbnp.a = localgjp.a;
    localbnp.b = localInviteContactActivity.e;
    localbnp.c = localInviteContactActivity.f;
    localbnp.d = 66;
    localbnp.e = localArrayList;
    localbnp.f = null;
    localbnp.g = true;
    localbnp.h = false;
    localbnp.i = false;
    bno localbno = localbnp.a();
    gzj localgzj = localInviteContactActivity.h;
    localgzj.d.a(localbno, false);
    localgzj.b(localbno);
    localInviteContactActivity.g = new hvj(localInviteContactActivity, (gxx)localInviteContactActivity.j.a(gxx.class), localInviteContactActivity.e, localArrayList, null, localInviteContactActivity);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dby
 * JD-Core Version:    0.7.0.1
 */