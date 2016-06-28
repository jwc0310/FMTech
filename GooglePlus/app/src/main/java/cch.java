import android.os.Bundle;

final class cch
  implements gzb
{
  cch(cbs paramcbs) {}
  
  public final void a(Bundle paramBundle)
  {
    this.a.b = paramBundle.getString("event_id");
    this.a.c = paramBundle.getString("owner_id");
    this.a.aa = paramBundle.getString("invitation_token");
    this.a.ab = paramBundle.getString("auth_key");
    this.a.ac = paramBundle.getInt("rsvp", -2147483648);
    this.a.ak = paramBundle.getByteArray("promoted_post_data");
    this.a.Z = paramBundle.getInt("notif_type");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cch
 * JD-Core Version:    0.7.0.1
 */