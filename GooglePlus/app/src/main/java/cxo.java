import android.content.Context;
import android.os.AsyncTask;

final class cxo
  extends AsyncTask<String, Void, Void>
{
  private final cxn a;
  private final Context b;
  private final String c;
  private final int d;
  
  cxo(Context paramContext, int paramInt, cxn paramcxn, String paramString)
  {
    this.b = paramContext.getApplicationContext();
    this.d = paramInt;
    this.a = paramcxn;
    this.c = paramString;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxo
 * JD-Core Version:    0.7.0.1
 */