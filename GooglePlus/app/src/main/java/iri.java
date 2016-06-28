import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.util.Log;

public class iri
  extends ContentObserver
{
  private boolean a;
  private Context b;
  
  public iri(Context paramContext)
  {
    super(null);
    this.b = paramContext;
  }
  
  public final void a()
  {
    if (this.a) {}
    for (;;)
    {
      return;
      this.a = true;
      ContentResolver localContentResolver = this.b.getContentResolver();
      Uri[] arrayOfUri = irj.a;
      int i = arrayOfUri.length;
      for (int j = 0; j < i; j++) {
        localContentResolver.registerContentObserver(arrayOfUri[j], true, this);
      }
    }
  }
  
  public void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }
  
  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    if ((paramUri != null) && (paramUri.getQueryParameter("blocking") != null))
    {
      if (Log.isLoggable("MediaObserver", 3))
      {
        String str = String.valueOf(paramUri);
        new StringBuilder(14 + String.valueOf(str).length()).append("ignoring uri: ").append(str);
      }
      return;
    }
    ((irf)mbb.a(this.b, irf.class)).a(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iri
 * JD-Core Version:    0.7.0.1
 */