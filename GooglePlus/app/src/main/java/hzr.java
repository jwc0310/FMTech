import android.app.Activity;
import android.net.Uri;

public final class hzr
{
  static final Uri a = Uri.parse("https://support.google.com/mobile/?p=plus_survey_android");
  private static final mcq b = new mcq("debug.app.status");
  
  public static void a(Activity paramActivity)
  {
    a(paramActivity, hzw.a, null);
  }
  
  public static void a(Activity paramActivity, hzw paramhzw, String paramString)
  {
    fsc localfsc = ((fsd)mbb.a(paramActivity, fsd.class)).a(((ftk)mbb.a(paramActivity, ftk.class)).a()).a();
    localfsc.b();
    localfsc.a(new hzs(paramActivity, paramhzw, localfsc, paramString));
    localfsc.a(new hzt(paramActivity));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzr
 * JD-Core Version:    0.7.0.1
 */