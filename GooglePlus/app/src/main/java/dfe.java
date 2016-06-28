import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.apps.plus.phone.ProfileActionGatewayActivity;
import java.util.Collections;
import java.util.List;

final class dfe
  implements giv, ica
{
  Activity a;
  ibw b;
  ikt c;
  final cw<Cursor> d = new dfg(this);
  private jov e;
  private final jpe f = new dff(this);
  
  public final void a()
  {
    jpd localjpd = (jpd)mbb.a(this.a, jpd.class);
    this.e.a(localjpd, aaw.iT, Collections.singletonList("android.permission.READ_CONTACTS"));
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.a = paramActivity;
    this.b = paramibw;
    paramikt.g.add(this);
    this.c = ((ikt)paramikt);
    this.e = ((jov)mbb.a(paramActivity, jov.class));
    this.e.a(aaw.iT, this.f);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      Intent localIntent = new Intent(this.a.getIntent());
      localIntent.setComponent(new ComponentName(this.a, ProfileActionGatewayActivity.class));
      localIntent.addFlags(41943040);
      ikt localikt = this.c;
      efj.k();
      localIntent.putExtra("account_id", localikt.e);
      this.b.a(localIntent);
      return;
    }
    this.b.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfe
 * JD-Core Version:    0.7.0.1
 */