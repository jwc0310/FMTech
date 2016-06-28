import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class hba
  implements gjg, ilt, jen<hba>
{
  private static final mcr b = new mcr("");
  public final jeo<hba> a = new jem(this);
  private final giz c;
  
  public hba(Context paramContext)
  {
    this.c = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final List<Integer> a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.c.a().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      gjb localgjb = this.c.a(i);
      if ((localgjb.a()) && (!localgjb.c("is_plus_page")) && (!localgjb.b("account_name").toLowerCase(Locale.getDefault()).endsWith("@youtube.com"))) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    return localArrayList;
  }
  
  public final void a(int paramInt)
  {
    if (this.c.a(paramInt).c("logged_out")) {
      this.c.b(paramInt).f("com.google.android.libraries.social.autobackup.AutobackupAccountSettingsManager").b("auto_backup_enabled", false).d();
    }
  }
  
  public final void a(int paramInt, String paramString)
  {
    b(paramInt).b("auto_backup_reminder_completed_type", paramString).d();
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    b(paramInt).b("auto_backup_enabled", paramBoolean).d();
    this.a.a();
  }
  
  public final void a(Context paramContext, gje paramgje) {}
  
  public final void a(List<gji> paramList)
  {
    paramList.add(new hbb());
  }
  
  final gjc b(int paramInt)
  {
    return this.c.b(paramInt).f("com.google.android.libraries.social.autobackup.AutobackupAccountSettingsManager");
  }
  
  public final jeo<hba> b()
  {
    return this.a;
  }
  
  public final gjb c(int paramInt)
  {
    return this.c.a(paramInt).d("com.google.android.libraries.social.autobackup.AutobackupAccountSettingsManager");
  }
  
  public final boolean c()
  {
    return !e().isEmpty();
  }
  
  public final int d()
  {
    List localList = e();
    localList.size();
    if (localList.isEmpty()) {
      return -1;
    }
    return ((Integer)localList.get(0)).intValue();
  }
  
  public final void d(int paramInt)
  {
    if (paramInt == -1) {
      throw new IllegalArgumentException("Attempting to enable autobackup for INVALID_ID");
    }
    a(paramInt, true);
  }
  
  public final List<Integer> e()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (c(localInteger.intValue()).c("auto_backup_enabled")) {
        localArrayList.add(localInteger);
      }
    }
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hba
 * JD-Core Version:    0.7.0.1
 */