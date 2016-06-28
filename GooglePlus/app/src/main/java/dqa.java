import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;

final class dqa
  implements kex
{
  dqa(dpw paramdpw) {}
  
  public final boolean a(ket paramket, Object paramObject)
  {
    String str = (String)paramObject;
    mbf localmbf = this.a.bn;
    int i = this.a.c;
    gjc localgjc = ((giz)mbb.a(localmbf, giz.class)).b(i);
    if (!TextUtils.isEmpty(str))
    {
      localgjc.b("notifications_ringtone", str);
      localgjc.d();
      if (TextUtils.isEmpty(str)) {
        break label133;
      }
      Ringtone localRingtone = RingtoneManager.getRingtone(this.a.bn, Uri.parse(str));
      this.a.d.a_(localRingtone.getTitle(this.a.bn));
      this.a.d.a(str);
    }
    for (;;)
    {
      return true;
      localgjc.e("notifications_ringtone");
      break;
      label133:
      dog localdog = this.a.d;
      int j = aau.ti;
      localdog.a_(localdog.l.getString(j));
      this.a.d.a(null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqa
 * JD-Core Version:    0.7.0.1
 */