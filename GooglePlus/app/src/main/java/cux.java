import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public final class cux
  implements gjg
{
  public static boolean a(Context paramContext, int paramInt)
  {
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    boolean bool = paramContext.getResources().getBoolean(efj.jb);
    return localgiz.a(paramInt).a("push_notifications", bool);
  }
  
  public static boolean b(Context paramContext, int paramInt)
  {
    return ((giz)mbb.a(paramContext, giz.class)).a(paramInt).a("notifications_vibrate", paramContext.getResources().getBoolean(efj.jc));
  }
  
  public static Uri c(Context paramContext, int paramInt)
  {
    return Uri.parse(((giz)mbb.a(paramContext, giz.class)).a(paramInt).a("notifications_ringtone", paramContext.getResources().getString(aau.mb)));
  }
  
  public static boolean d(Context paramContext, int paramInt)
  {
    return !TextUtils.isEmpty(((giz)mbb.a(paramContext, giz.class)).a(paramInt).a("notifications_ringtone", null));
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    paramgje.c("notifications_ringtone", paramContext.getResources().getString(aau.mb));
  }
  
  public final void a(List<gji> paramList)
  {
    paramList.add(new cuy());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cux
 * JD-Core Version:    0.7.0.1
 */