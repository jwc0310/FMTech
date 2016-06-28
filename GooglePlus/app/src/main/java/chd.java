import android.os.Bundle;
import java.util.ArrayList;

final class chd
  implements gzb
{
  chd(cgr paramcgr) {}
  
  public final void a(Bundle paramBundle)
  {
    this.a.d = paramBundle.getString("activity_id");
    int i = paramBundle.getInt("stream_type", -1 + eai.a);
    if ((i < 0) || (i >= eai.a().length)) {
      i = -1 + eai.a;
    }
    cgr.a(this.a, eai.a()[i]);
    this.a.al = paramBundle.getString("square_id");
    this.a.an = paramBundle.getInt("square_membership", -1);
    this.a.ao = paramBundle.getInt("square_joinability", -1);
    byte[] arrayOfByte = paramBundle.getByteArray("context_specific_data");
    if (arrayOfByte != null) {
      this.a.ar = llr.a(arrayOfByte);
    }
    this.a.av = paramBundle.getBoolean("restrict_to_domain");
    this.a.aK = new ArrayList();
    this.a.aN = paramBundle.getBoolean("show_keyboard", false);
    this.a.aO = paramBundle.getInt("host_mode", 1);
    this.a.aP = paramBundle.getBoolean("force_full_bleed", false);
    this.a.aQ = paramBundle.getInt("max_span", 1);
    this.a.aR = paramBundle.getBoolean("scroll_to_last_comment", false);
    this.a.aS = paramBundle.getByteArray("promoted_post_data");
    this.a.aV = paramBundle.getBoolean("com.google.android.apps.plus.HIDE_ACTION_BAR_LOGO", false);
    this.a.bm = paramBundle.getBoolean("auto_launch_acl_view_dialog", false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chd
 * JD-Core Version:    0.7.0.1
 */