import android.content.Intent;

public final class ejj
{
  public static Intent a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Intent localIntent = new Intent();
    localIntent.setPackage("com.google.android.gms");
    localIntent.setAction("com.google.android.gms.common.oob.OOB_SIGN_UP");
    localIntent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", paramString1);
    localIntent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", paramString2);
    localIntent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE", paramString3);
    localIntent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT", paramString4);
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejj
 * JD-Core Version:    0.7.0.1
 */