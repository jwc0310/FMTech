import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.plus.notifications.actions.CommentActionReceiver;
import com.google.android.apps.plus.service.EsService;
import java.util.ArrayList;
import java.util.List;

public final class cva
  implements jtj
{
  private Context a;
  
  public cva(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final List<dg> a(int paramInt, String paramString, mlw parammlw)
  {
    if ((parammlw.a == null) || (parammlw.a.a == null) || (TextUtils.isEmpty(parammlw.a.a.a))) {
      return null;
    }
    String str1 = parammlw.a.a.a;
    Context localContext = this.a;
    String[] arrayOfString = { str1 };
    if (hsb.b(localContext, paramInt).query("activities", null, "activity_id = ? ", arrayOfString, null, null, null).getCount() == 0)
    {
      biu localbiu = new biu(localContext, new kcg(localContext, paramInt), paramInt, arrayOfString, null, false, 8);
      localbiu.i();
      if (localbiu.n()) {
        localbiu.c("PostActionHandler");
      }
    }
    for (int i = 0; i == 0; i = 1) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    String str3;
    if (!lmp.d(this.a, paramInt, str1))
    {
      boolean bool1 = lmp.c(this.a, paramInt, str1);
      boolean bool2 = lmp.e(this.a, paramInt, str1);
      if ((!bool1) && (!bool2))
      {
        PendingIntent localPendingIntent2 = EsService.a(this.a, paramInt, str1, paramString, 0L);
        localArrayList.add(new dg(efj.sg, this.a.getString(aau.lX), localPendingIntent2));
      }
      Intent localIntent = new Intent(this.a, CommentActionReceiver.class);
      String str2 = String.valueOf(str1);
      if (str2.length() != 0)
      {
        str3 = "comment:".concat(str2);
        localIntent.setData(Uri.parse(str3));
        localIntent.putExtra("account_id", paramInt);
        localIntent.putExtra("activity_id", str1);
        localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramString);
        dh localdh = new dh(new dg(efj.sf, this.a.getString(aau.lW), PendingIntent.getBroadcast(this.a, paramInt, localIntent, 134217728)));
        er localer = new er("extra_voice_comment");
        eq localeq = new eq(localer.a, null, null, localer.b, localer.c);
        if (localdh.a == null) {
          localdh.a = new ArrayList();
        }
        localdh.a.add(localeq);
        localArrayList.add(localdh.a());
      }
    }
    for (;;)
    {
      return localArrayList;
      str3 = new String("comment:");
      break;
      llu localllu = lmp.f(this.a, paramInt, str1);
      PendingIntent localPendingIntent1 = EsService.a(this.a, paramInt, str1, localllu, 0, 0L, paramString, null);
      localArrayList.add(new dg(efj.pp, localllu.d, localPendingIntent1));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cva
 * JD-Core Version:    0.7.0.1
 */