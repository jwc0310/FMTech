import android.os.Bundle;
import com.google.android.apps.plus.service.EsService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class avt
  extends mca
  implements luu
{
  static final bfc a = new bfc(aaw.cL);
  Integer Z;
  jov aa;
  jpd ab;
  private final avy ac = new avy(this);
  private final avx ad = new avx(this);
  private final jpe ae = new avu(this);
  private final jpe af = new avv(this);
  beu b;
  bfd c;
  bdk d;
  
  public avt()
  {
    new jeq(this.bp, new avw(this), '\000');
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    bfd localbfd = this.c;
    bfc localbfc = a;
    localbfd.d.add(localbfc);
    if ((paramBundle != null) && (paramBundle.containsKey("pending_request_id"))) {
      this.Z = Integer.valueOf(paramBundle.getInt("pending_request_id"));
    }
    this.aa.a(aaw.iI, this.ae).a(aaw.iJ, this.af);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("download_failed".equals(paramString)) {
      this.aa.a(this.ab, aaw.iJ, v());
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((beu)this.bo.a(beu.class));
    this.c = ((bfd)this.bo.a(bfd.class));
    this.d = ((bdk)this.bo.a(bdk.class));
    this.aa = ((jov)this.bo.a(jov.class));
    this.ab = ((jpd)this.bo.a(jpd.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.Z != null) {
      paramBundle.putInt("pending_request_id", this.Z.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    this.c.a(a, this.ad);
    EsService.a(this.bn, this.ac);
  }
  
  public final void n()
  {
    super.n();
    this.c.b(a, this.ad);
    avy localavy = this.ac;
    EsService.d.remove(localavy);
  }
  
  final List<String> v()
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
    return Arrays.asList(arrayOfString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     avt
 * JD-Core Version:    0.7.0.1
 */