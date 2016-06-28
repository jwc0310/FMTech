import android.content.Intent;
import android.os.Bundle;

public final class lim
  extends kdn
  implements kfp
{
  private kfo aa = new kfo(this, this.c);
  private lio ab;
  
  public static Bundle b(Intent paramIntent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("square_id", paramIntent.getStringExtra("square_id"));
    return localBundle;
  }
  
  protected final void c(Bundle paramBundle)
  {
    this.b.a(kfs.class, this.aa);
  }
  
  public final void v()
  {
    this.ab = new lio();
    this.ab.c = this.m.getString("square_id");
    kfo localkfo = this.aa;
    lio locallio = this.ab;
    localkfo.a.a(locallio, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lim
 * JD-Core Version:    0.7.0.1
 */