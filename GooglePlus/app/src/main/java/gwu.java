import android.content.Context;
import com.google.android.libraries.social.albumupload.impl.UploadSchedulerService;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

final class gwu
  implements gwa
{
  private final Context a;
  private final gwi b;
  
  public gwu(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.b = ((gwi)mbb.a(paramContext, gwi.class));
  }
  
  public final int a(gvq paramgvq)
  {
    int i = paramgvq.a;
    int j = new gwn(this.a, i).a(paramgvq);
    this.b.a(paramgvq);
    return j;
  }
  
  public final long a(int paramInt, String paramString, Collection<String> paramCollection, gvz paramgvz)
  {
    long l = new gwn(this.a, paramInt).a(paramString, paramCollection);
    gvq localgvq = gvq.a(paramInt, paramString, l);
    if (paramgvz != null)
    {
      gwi localgwi = this.b;
      localgwi.a.add(new gwf(paramgvz, localgvq));
      localgwi.b.execute(localgwi);
    }
    this.b.a(localgvq);
    UploadSchedulerService.a(this.a, paramInt);
    return l;
  }
  
  public final gvt b(gvq paramgvq)
  {
    int i = paramgvq.a;
    return new gwn(this.a, i).c(paramgvq);
  }
  
  public final List<gvv> c(gvq paramgvq)
  {
    int i = paramgvq.a;
    return new gwn(this.a, i).b(paramgvq);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwu
 * JD-Core Version:    0.7.0.1
 */