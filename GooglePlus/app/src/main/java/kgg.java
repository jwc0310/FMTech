import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class kgg
  extends kdn
  implements kfp
{
  private kfo aa = new kfo(this, this.c);
  
  public static Bundle b(Intent paramIntent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("terms_uri", paramIntent.getStringExtra("terms_uri"));
    localBundle.putString("privacy_uri", paramIntent.getStringExtra("privacy_uri"));
    return localBundle;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b.a(kfs.class, this.aa);
  }
  
  public final void v()
  {
    kgh localkgh = new kgh();
    Bundle localBundle1 = this.m;
    String str1;
    Uri localUri1;
    label34:
    String str2;
    if (localBundle1 != null)
    {
      str1 = localBundle1.getString("terms_uri");
      if (str1 == null) {
        break label97;
      }
      localUri1 = Uri.parse(str1);
      localkgh.a = localUri1;
      Bundle localBundle2 = this.m;
      if (localBundle2 == null) {
        break label103;
      }
      str2 = localBundle2.getString("privacy_uri");
      label60:
      if (str2 == null) {
        break label109;
      }
    }
    label97:
    label103:
    label109:
    for (Uri localUri2 = Uri.parse(str2);; localUri2 = null)
    {
      localkgh.b = localUri2;
      this.aa.a.a(localkgh, null);
      return;
      str1 = null;
      break;
      localUri1 = null;
      break label34;
      str2 = null;
      break label60;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgg
 * JD-Core Version:    0.7.0.1
 */