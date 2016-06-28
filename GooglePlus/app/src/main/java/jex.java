import android.content.Context;
import android.content.SharedPreferences;

final class jex
  implements gji
{
  public final String a()
  {
    return "OnboardingUserPrefsAccountStoreExtension-OnboardingCompleteDevicePrefToAccount";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    if (paramContext.getSharedPreferences("onboarding", 0).getBoolean("completed", false)) {
      paramgje.c("ONBOARDING_COMPLETED", true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jex
 * JD-Core Version:    0.7.0.1
 */