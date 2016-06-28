import com.google.android.gms.common.api.Scope;
import java.util.List;
import java.util.concurrent.ExecutorService;

final class fow
  extends fon
{
  final foh a;
  private final ExecutorService b;
  
  public fow(foh paramfoh, ExecutorService paramExecutorService)
  {
    this.a = paramfoh;
    this.b = paramExecutorService;
  }
  
  public final void a(String paramString1, String paramString2, for paramfor)
  {
    this.b.submit(new foy(this, paramString1, paramString2, paramfor));
  }
  
  public final void a(String paramString, List<Scope> paramList, for paramfor)
  {
    this.b.submit(new fox(this, paramList, paramString, paramfor));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fow
 * JD-Core Version:    0.7.0.1
 */