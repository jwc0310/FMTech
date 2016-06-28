import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class boj
  extends gzf
{
  final String a;
  private final String b;
  private final gxx c;
  private final jiw d;
  private final jjm<jjg> l;
  private bru m;
  private int n;
  
  public boj(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, "ShowProfilePhotoPromptTask");
    this.a = paramString1;
    this.b = paramString2;
    this.n = paramInt;
    this.c = ((gxx)mbb.a(paramContext, gxx.class));
    this.d = ((jiw)mbb.a(paramContext, jiw.class));
    this.l = new bok(this);
  }
  
  private final boolean a(String paramString)
  {
    ArrayList localArrayList = mfx.a(paramString, '|');
    List localList = this.d.a(this.n, jgx.b);
    int i = localList.size();
    for (int j = 0; j < i; j++) {
      if (localArrayList.contains(((jgw)localList.get(j)).b())) {
        return true;
      }
    }
    return false;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    List localList = this.d.a(this.n, 0, this.l);
    Object localObject;
    int i;
    label57:
    String str4;
    label94:
    boolean bool2;
    nxl localnxl;
    if (localList.isEmpty())
    {
      localObject = null;
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        break label494;
      }
      i = 1;
      if (i == 0) {
        break label618;
      }
      int i4 = this.n;
      String str3 = String.valueOf(this.a);
      if (str3.length() == 0) {
        break label500;
      }
      str4 = "g:".concat(str3);
      this.m = brn.a(localContext, i4, str4, true);
      bool2 = a((String)localObject);
      localnxl = this.m.h;
    }
    for (boolean bool1 = bool2;; bool1 = false)
    {
      int j;
      label136:
      nxv localnxv;
      label144:
      int k;
      label160:
      String str1;
      label188:
      int i1;
      int i2;
      if (localnxl == null)
      {
        j = 1;
        if (localnxl != null) {
          break label535;
        }
        localnxv = null;
        if ((localnxv != null) && (localnxv.e != null)) {
          break label545;
        }
        k = 0;
        if ((!bool1) || (localnxv == null) || (localnxv.a == null)) {
          break label579;
        }
        str1 = localnxv.a.a;
        i1 = this.n;
        if ((i == 0) || (j != 0) || (!bool1)) {
          break label610;
        }
        if (k != 1) {
          break label588;
        }
        i2 = aau.ta;
      }
      for (;;)
      {
        String str2 = localContext.getString(i2, new Object[] { str1 });
        Intent localIntent = efj.a(localContext, i1, jjf.a(((giz)mbb.a(localContext, giz.class)).a(i1).b("gaia_id")), null, 4, false);
        localIntent.putExtra("add_profile_photo_message_id", i2);
        localIntent.setPackage(localContext.getPackageName());
        PendingIntent localPendingIntent = PendingIntent.getActivity(localContext, dmr.a(), localIntent, 0);
        dk localdk = new dk(localContext);
        int i3 = efj.sc;
        localdk.x.icon = i3;
        localdk.e = BitmapFactory.decodeResource(localContext.getResources(), efj.pd);
        localdk.a(16, true);
        localdk.b = dk.a(localContext.getString(aau.td));
        localdk.c = dk.a(str2);
        localdk.d = localPendingIntent;
        ((NotificationManager)localContext.getSystemService("notification")).notify(String.valueOf(localContext.getPackageName()).concat(":notifications:addprofilephoto:"), aaw.gg, localdk.a());
        gxx localgxx = this.c;
        gxw localgxw = new gxw(localContext, this.n);
        localgxw.c = gxz.J;
        localgxw.d = gya.w;
        localgxx.a(localgxw);
        return new hae(true);
        localObject = ((jjg)localList.get(0)).j();
        break;
        label494:
        i = 0;
        break label57;
        label500:
        str4 = new String("g:");
        break label94;
        if (localnxl.b == 2)
        {
          j = 1;
          break label136;
        }
        j = 0;
        break label136;
        label535:
        localnxv = localnxl.e;
        break label144;
        label545:
        Integer localInteger = Integer.valueOf(localnxv.e.b);
        if (localInteger == null)
        {
          k = 0;
          break label160;
        }
        k = localInteger.intValue();
        break label160;
        label579:
        str1 = this.b;
        break label188;
        label588:
        if (k == 2)
        {
          i2 = aau.sZ;
        }
        else
        {
          i2 = aau.tb;
          continue;
          label610:
          i2 = aau.tc;
        }
      }
      label618:
      localnxl = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boj
 * JD-Core Version:    0.7.0.1
 */