import android.content.Context;
import android.os.AsyncTask;
import java.util.concurrent.atomic.AtomicBoolean;

final class cxx
  extends AsyncTask<String, Void, Void>
{
  private final Context a;
  private final int b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final AtomicBoolean g;
  
  public cxx(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, AtomicBoolean paramAtomicBoolean)
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramAtomicBoolean;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxx
 * JD-Core Version:    0.7.0.1
 */