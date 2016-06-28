import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

public final class iok
  extends mca
{
  ikz a;
  ins b;
  private gug c;
  private guf d = new iol(this);
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle == null)
    {
      String str = this.m.getString("AccountName");
      gch localgch = (gch)mbb.a(f(), gch.class);
      int i = do.b;
      Intent localIntent = localgch.a(str, null, null, g().getString(i));
      localIntent.putExtra("com.google.android.gms.plus.OVERRIDE_THEME", 1);
      localIntent.putExtra("com.google.android.gms.plus.GPSRC", "gpac0");
      this.c.a(aw.aM, localIntent);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = new gug(this.bp, (byte)0).a(aw.aM, this.d);
    this.a = ((ikz)mbb.a(this.bn, ikz.class));
    this.b = ((ins)this.bo.a(ins.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iok
 * JD-Core Version:    0.7.0.1
 */