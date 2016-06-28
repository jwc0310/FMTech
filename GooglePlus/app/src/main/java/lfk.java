import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class lfk
  implements gzi, lfe, lfy, mbo, mfd
{
  private Context a;
  private git b;
  private bk c;
  private lfm d;
  private gzj e;
  private lfq f;
  private lfi g;
  private ill h;
  private final Map<String, kxg> i;
  
  public lfk(bk parambk, mek parammek, lfm paramlfm)
  {
    this.c = parambk;
    this.d = paramlfm;
    this.i = new HashMap();
    parammek.a(this);
  }
  
  private static String a(kxg paramkxg)
  {
    switch (lfl.a[paramkxg.ordinal()])
    {
    default: 
      return "otherAction";
    case 1: 
      return "leave";
    case 2: 
      return "join";
    case 3: 
      return "acceptInvitation";
    case 4: 
      return "declineInvitation";
    case 5: 
      return "cancelRequest";
    }
    return "requestToJoin";
  }
  
  private final void a(kxg paramkxg, String paramString)
  {
    lfp locallfp = new lfp(this.a, this.b.c(), paramString, efj.a(paramkxg).intValue());
    String str = a(paramkxg);
    locallfp.f = str;
    this.e.b(locallfp);
    this.e.d.a(this.a.getString(efj.b(paramkxg)), null, str, false);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
    this.b = ((git)parammbb.a(git.class));
    ((gzj)parammbb.a(gzj.class)).a.add(this);
    this.e = ((gzj)parammbb.a(gzj.class));
    this.g = ((lfi)parammbb.b(lfi.class));
    this.f = new lfq(paramContext, this.c, this.b.c(), this);
    ill localill = new ill(paramContext, this.b.c());
    localill.a.add(ine.class);
    this.h = localill;
  }
  
  public final void a(String paramString)
  {
    if (this.i.containsKey(paramString))
    {
      a((kxg)this.i.get(paramString), paramString);
      this.i.remove(paramString);
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("leave".equals(paramString)) || ("join".equals(paramString)) || ("acceptInvitation".equals(paramString)) || ("declineInvitation".equals(paramString)) || ("requestToJoin".equals(paramString)) || ("cancelRequest".equals(paramString)) || ("otherAction".equals(paramString)) || (("DeclineSquareInvitationTask".equals(paramString)) && (paramhae != null))) {
      if (paramhae.b == 200) {
        break label153;
      }
    }
    label153:
    for (int j = 1; j != 0; j = 0)
    {
      String str2 = paramhae.d;
      if (!TextUtils.isEmpty(str2)) {
        Toast.makeText(this.a, str2, 0).show();
      }
      haa localhaa = this.e.d;
      localhaa.a(paramString);
      if (this.f != null) {
        this.f.a(localhaa);
      }
      return;
    }
    String str1 = paramhae.a().getString("square_id");
    lfm locallfm = this.d;
    kxg localkxg;
    if ("leave".equals(paramString)) {
      localkxg = kxg.k;
    }
    for (;;)
    {
      locallfm.a(str1, localkxg);
      break;
      if ("join".equals(paramString)) {
        localkxg = kxg.d;
      } else if ("acceptInvitation".equals(paramString)) {
        localkxg = kxg.e;
      } else if ("declineInvitation".equals(paramString)) {
        localkxg = kxg.l;
      } else if ("cancelRequest".equals(paramString)) {
        localkxg = kxg.g;
      } else if ("requestToJoin".equals(paramString)) {
        localkxg = kxg.f;
      } else {
        localkxg = kxg.a;
      }
    }
  }
  
  public final void a(kxg paramkxg, String paramString, int paramInt)
  {
    int j = efj.a(paramkxg).intValue();
    if (paramkxg == kxg.k)
    {
      lfx.a(paramString, paramInt).a(this.c.h(), null);
      return;
    }
    if ((paramkxg == kxg.l) && (this.g != null))
    {
      this.g.b(paramString);
      return;
    }
    if (efj.o(j))
    {
      if (!this.h.a())
      {
        this.a.startActivity(this.h.b());
        return;
      }
      this.e.d.a(this.a.getString(efj.b(paramkxg)), null, a(paramkxg), false);
      this.i.put(paramString, paramkxg);
      this.f.a(paramString, j);
      return;
    }
    a(paramkxg, paramString);
  }
  
  public final void b(String paramString)
  {
    a(kxg.k, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfk
 * JD-Core Version:    0.7.0.1
 */