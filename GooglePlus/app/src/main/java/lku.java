import java.util.ArrayList;
import java.util.List;

public final class lku
  implements oxo<Boolean, String>
{
  volatile boolean a = false;
  
  public lku(lkg paramlkg, qzz paramqzz, boolean paramBoolean, int paramInt1, int paramInt2) {}
  
  public final ouq<oxm<Boolean>> a()
  {
    if (this.a) {
      return ouq.a(phu.b(oxm.a(Boolean.valueOf(false), oxn.a)));
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.b);
    ljc localljc = (ljc)this.f.d.a();
    localljc.a(localArrayList.size());
    localljc.a(localArrayList);
    if (this.c) {}
    for (ouq localouq1 = this.f.c.a(this.b, localljc.b, localljc.c);; localouq1 = this.f.c.a(this.d, this.e, this.b, localljc.b, localljc.c))
    {
      ouq localouq2 = localouq1.b(new lkv(this), this.f.b);
      oxb localoxb = this.f.e;
      pic localpic = localouq2.a();
      String str = String.valueOf(this.f.a);
      localoxb.a(localpic, (String)(13 + String.valueOf(str).length() + "update_stream" + str));
      return localouq2;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lku
 * JD-Core Version:    0.7.0.1
 */