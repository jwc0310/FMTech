import android.content.Context;
import android.content.Intent;

public final class jbb
  implements jdu
{
  private static final String a = jdr.a("ActorsSelectedIntentHandler");
  
  public final void a(Intent paramIntent, Context paramContext)
  {
    String[] arrayOfString = paramIntent.getStringArrayExtra("notification_keys");
    if (arrayOfString.length == 1)
    {
      int i = paramIntent.getIntExtra("account_id", -1);
      jah[] arrayOfjah = jdj.b(paramContext, i, arrayOfString);
      mkr[] arrayOfmkr = jdj.a(paramContext, i, arrayOfString[0]);
      jay localjay = (jay)mbb.b(paramContext, jay.class);
      if (localjay != null) {
        localjay.a(i, arrayOfmkr, arrayOfjah[0]);
      }
      return;
    }
    jdr.b(a, "EXTRA_NOTIFICATION_KEYS array must have length = 1.", new Exception());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbb
 * JD-Core Version:    0.7.0.1
 */