import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class any
  implements anw, mbo, mfd
{
  private anz a;
  
  public any(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a()
  {
    anz localanz = this.a;
    Activity localActivity = localanz.a;
    String str1 = localanz.d;
    int i = localanz.c;
    String str2 = localanz.b;
    int j = localanz.e;
    Intent localIntent = new Intent("android.intent.action.SEND_MULTIPLE");
    localIntent.setComponent(new ComponentName(localActivity, "com.google.android.apps.moviemaker.MovieMakerActivity"));
    localIntent.putExtra("session_id", str1);
    localIntent.putExtra("source_id", i);
    localIntent.putExtra("source_name", str2);
    localIntent.putExtra("account_id", j);
    dbs.a(localIntent, "android.intent.action.GET_CONTENT", ((aud)mbb.a(localanz.a, aud.class)).b.a(jpx.class), localanz.a);
    localanz.a.startActivity(localIntent);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((anz)parammbb.a(anz.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     any
 * JD-Core Version:    0.7.0.1
 */