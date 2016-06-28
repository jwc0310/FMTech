import android.net.Uri;
import java.util.Locale;

public abstract interface itd
  extends isw, itb
{
  public static final String a = String.format(Locale.US, "case when %1$s then NULL else %2$s end", new Object[] { "_data LIKE '%/DCIM/%'", "bucket_id" });
  
  public abstract String a();
  
  public abstract String a(int paramInt);
  
  public abstract Uri b();
  
  public abstract String[] c();
  
  public abstract String d();
  
  public abstract String[] e();
  
  public abstract String f();
  
  public abstract String[] g();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     itd
 * JD-Core Version:    0.7.0.1
 */