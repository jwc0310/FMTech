import android.content.Context;

public final class cwk
  implements jes
{
  public static final hyf a = new hyf("debug.plus.enable_onb_sul", "false", "b1568032", hym.b);
  
  public static void a(Context paramContext, int paramInt)
  {
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("seen_onboarding_sul", true).d();
  }
  
  public final int a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    if (!((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("is_google_plus")) {
      return jet.c;
    }
    if ((((hyi)mbb.a(paramContext, hyi.class)).b(a, paramInt)) && (paramBoolean) && (!((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("seen_onboarding_sul"))) {
      return jet.a;
    }
    return jet.b;
  }
  
  public final bk a()
  {
    return new cwj();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwk
 * JD-Core Version:    0.7.0.1
 */