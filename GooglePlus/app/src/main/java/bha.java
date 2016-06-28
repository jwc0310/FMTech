import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class bha
  implements gqv
{
  private final Context a;
  
  public bha(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    if ((((iev)mbb.a(this.a, iev.class)).b().equals(paramUri.getHost())) && ("/share".equals(paramUri.getPath()))) {}
    for (int i = 1; i == 0; i = 0) {
      return null;
    }
    String str = paramBundle.getString("activityId");
    boolean bool1 = paramBundle.getBoolean("isLimitedShare");
    boolean bool2 = paramBundle.getBoolean("restrictToDomain");
    byte[] arrayOfByte = paramBundle.getByteArray("promotedPostData");
    dgs localdgs1 = new dgs(this.a);
    localdgs1.a.setAction("android.intent.action.SEND");
    localdgs1.a.putExtra("account_id", paramInt);
    localdgs1.a.putExtra("activity_id", str);
    dgs localdgs2 = localdgs1.b(bool1).a(bool2);
    localdgs2.a.putExtra("disable_location", true);
    if (arrayOfByte != null) {
      localdgs2.a.putExtra("promoted_post_data", arrayOfByte);
    }
    return localdgs2.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bha
 * JD-Core Version:    0.7.0.1
 */