import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.plus.widget.EsWidgetProvider;

public final class eaq
{
  public static boolean a = true;
  
  public static ear a(Context paramContext, int paramInt)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.apps.plus.widget.EsWidgetUtils", 0);
    String str1 = String.valueOf("gaiaId_");
    String str2 = localSharedPreferences.getString(11 + String.valueOf(str1).length() + str1 + paramInt, null);
    if (TextUtils.isEmpty(str2)) {
      return null;
    }
    int i = ((giz)mbb.a(paramContext, giz.class)).b(str2);
    if (i == -1) {
      return null;
    }
    String str3 = String.valueOf("circleId_");
    String str4 = localSharedPreferences.getString(11 + String.valueOf(str3).length() + str3 + paramInt, null);
    if (TextUtils.isEmpty(str4)) {
      return null;
    }
    String str5 = String.valueOf("circleName_");
    String str6 = localSharedPreferences.getString(11 + String.valueOf(str5).length() + str5 + paramInt, null);
    if (TextUtils.isEmpty(str6)) {
      return null;
    }
    return new ear(i, str4, str6);
  }
  
  public static void a(Context paramContext)
  {
    AppWidgetManager localAppWidgetManager = b(paramContext);
    if (localAppWidgetManager == null) {}
    for (;;)
    {
      return;
      int[] arrayOfInt = localAppWidgetManager.getAppWidgetIds(new ComponentName(paramContext, EsWidgetProvider.class));
      int i = arrayOfInt.length;
      for (int j = 0; j < i; j++) {
        paramContext.startService(EsWidgetProvider.a(paramContext, arrayOfInt[j], null, false, false));
      }
    }
  }
  
  public static AppWidgetManager b(Context paramContext)
  {
    try
    {
      AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(paramContext);
      return localAppWidgetManager;
    }
    catch (NullPointerException localNullPointerException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eaq
 * JD-Core Version:    0.7.0.1
 */