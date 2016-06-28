import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;

final class dta
  implements iii
{
  dta(dsy paramdsy) {}
  
  public final String a()
  {
    return this.a.c;
  }
  
  public final Intent b()
  {
    return new Intent("android.intent.action.VIEW", Uri.parse("https://plus.google.com/communities").buildUpon().appendPath(this.a.a).build()).putExtra("account_id", this.a.at.c());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dta
 * JD-Core Version:    0.7.0.1
 */