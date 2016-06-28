import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

public final class bpz
  implements bvz, kbb
{
  static ipb e;
  final Context a;
  Activity b;
  bvy c;
  Intent d;
  oih f;
  int g = -1;
  String h = "";
  String i = "";
  private iph j;
  private Integer k;
  private boolean l;
  private int m = 0;
  private DialogInterface.OnClickListener n = new bqe(this);
  private DialogInterface.OnCancelListener o = new bqd(this);
  private final dme p = new bqa(this);
  
  public bpz(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static oih a(byte[] paramArrayOfByte)
  {
    try
    {
      oih localoih = (oih)qat.b(new oih(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localoih;
    }
    catch (qas localqas)
    {
      Log.e("DefaultEditorProvider", "Failed to deserialize EditInfo.", localqas);
    }
    return null;
  }
  
  private final void j()
  {
    bqc localbqc1 = new bqc(this, 3);
    localbqc1.b();
    localbqc1.ap_();
    String str = localbqc1.a;
    bqc localbqc2 = new bqc(this, 2);
    localbqc2.b();
    localbqc2.ap_();
    new bqh(this, str, localbqc2.a).execute(new Void[0]);
  }
  
  public final void a()
  {
    dme localdme = this.p;
    EsService.d.remove(localdme);
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 0) {
      hzr.a(this.b);
    }
    while (paramInt != 1) {
      return;
    }
    Uri localUri = efj.a(this.b, "plus_stream", "https://support.google.com/plus/?hl=%locale%");
    this.b.startActivity(new Intent("android.intent.action.VIEW", localUri));
  }
  
  final void a(int paramInt, Intent paramIntent)
  {
    dme localdme = this.p;
    EsService.d.remove(localdme);
    this.c.a(paramInt, paramIntent);
  }
  
  protected final void a(int paramInt, dmx paramdmx)
  {
    long l1 = 0L;
    if ((this.k == null) || (this.k.intValue() != paramInt)) {
      return;
    }
    this.k = null;
    byte[] arrayOfByte2;
    if ((paramdmx instanceof dkm))
    {
      arrayOfByte2 = ((dkm)paramdmx).a;
      if (arrayOfByte2 == null) {}
    }
    for (;;)
    {
      try
      {
        oih localoih2 = (oih)qat.b(new oih(), arrayOfByte2, 0, arrayOfByte2.length);
        localoih1 = localoih2;
      }
      catch (qas localqas)
      {
        ipf localipf;
        byte[] arrayOfByte1;
        Log.e("DefaultEditorProvider", "Failed to deserialize EditInfo.", localqas);
        localoih1 = null;
        continue;
      }
      if (paramdmx != null)
      {
        int i1;
        Long localLong2;
        if (paramdmx.c != 200)
        {
          i1 = 1;
          if (i1 == 0) {
            break label379;
          }
          if ((localoih1 == null) || (localoih1.a == null)) {
            break label392;
          }
          localLong1 = localoih1.a.b;
          if ((this.f == null) || (this.f.a == null) || (this.m > 0)) {
            break label322;
          }
          localLong2 = this.f.a.b;
          if (localLong2 == null)
          {
            l2 = l1;
            if (localLong1 != null) {
              break label313;
            }
            if (l2 == l1) {
              break label322;
            }
            this.f.a.b = localLong1;
            localipf = (ipf)this.d.getParcelableExtra("photo_ref");
            arrayOfByte1 = qat.a(this.f);
            this.m = (1 + this.m);
            this.k = Integer.valueOf(EsService.a(this.a, this.d.getIntExtra("account_id", -1), Long.toString(localipf.b.a), localipf.b.b, localipf.a, arrayOfByte1, this.l));
            return;
            localoih1 = null;
          }
        }
        else
        {
          i1 = 0;
          continue;
        }
        long l2 = localLong2.longValue();
        continue;
        label313:
        l1 = localLong1.longValue();
        continue;
        label322:
        this.m = 0;
        Toast.makeText(this.a, aau.mm, 1).show();
        if ((localoih1 != null) && (this.c.a(qat.a(localoih1))))
        {
          this.f = localoih1;
          j();
        }
      }
      for (;;)
      {
        this.l = false;
        return;
        label379:
        this.f = localoih1;
        j();
      }
      label392:
      Long localLong1 = null;
      continue;
      oih localoih1 = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (this.k != null) {
      paramBundle.putInt("pending_request_id", this.k.intValue());
    }
  }
  
  public final void a(Bundle paramBundle, Activity paramActivity, Intent paramIntent, bvy parambvy)
  {
    this.b = paramActivity;
    this.d = paramIntent;
    this.c = parambvy;
    this.l = false;
    this.f = null;
    this.g = -1;
    this.h = "";
    this.i = "";
    if (e == null) {
      e = (ipb)mbb.a(this.a, ipb.class);
    }
    if (i() == null) {
      throw new IllegalArgumentException("A source URI must be specified via the Intent's data field.");
    }
    if ((paramBundle != null) && (paramBundle.containsKey("pending_request_id"))) {
      this.k = Integer.valueOf(paramBundle.getInt("pending_request_id"));
    }
    if (this.d.hasExtra("edit_info")) {
      this.f = a(this.d.getByteArrayExtra("edit_info"));
    }
    if ((this.f != null) && (!this.c.a(qat.a(this.f))))
    {
      new AlertDialog.Builder(this.b).setMessage(aau.oU).setTitle(aau.oV).setPositiveButton(aau.oT, this.n).setNegativeButton(aau.cM, this.n).setOnCancelListener(this.o).show();
      return;
    }
    b();
  }
  
  public final void a(bvx parambvx)
  {
    int i1 = 1;
    oih localoih1 = a(parambvx.b);
    oih localoih2;
    int i4;
    label81:
    int i2;
    if ((this.f != null) && (this.f.a != null))
    {
      localoih1.a.b = this.f.a.b;
      localoih2 = this.f;
      if (jpt.c(localoih1))
      {
        if (!jpt.c(localoih1)) {
          break label284;
        }
        qml[] arrayOfqml = localoih1.a.a;
        int i3 = arrayOfqml.length;
        i4 = 0;
        if (i4 >= i3) {
          break label284;
        }
        qml localqml = arrayOfqml[i4];
        if ((!efj.a(localqml, i1)) || (efj.a(localqml, 3))) {
          break label278;
        }
        i2 = 0;
        label116:
        if ((i2 == 0) && (localoih1.a.e != null) && (localoih1.a.e.a != null) && (localoih1.a.e.a.a != -2147483648)) {
          break label290;
        }
      }
      i1 = 0;
      label165:
      this.l = i1;
      this.f = localoih1;
      if (!this.d.getBooleanExtra("save_photo_edits", false)) {
        break label378;
      }
      byte[] arrayOfByte = qat.a(this.f);
      ipf localipf2 = (ipf)this.d.getParcelableExtra("photo_ref");
      this.k = Integer.valueOf(EsService.a(this.a, this.d.getIntExtra("account_id", -1), Long.toString(localipf2.b.a), localipf2.b.b, localipf2.a, arrayOfByte, this.l));
    }
    label278:
    label284:
    label290:
    label378:
    ipf localipf1;
    do
    {
      return;
      localoih1.a.b = null;
      break;
      i4++;
      break label81;
      i2 = i1;
      break label116;
      if ((!jpt.c(localoih2)) || (localoih2.a.e == null) || (localoih2.a.e.a == null) || (localoih2.a.e.a.a == -2147483648) || (localoih1.a.e.a.a != localoih2.a.e.a.a)) {
        break label165;
      }
      i1 = 0;
      break label165;
      Bundle localBundle = this.d.getExtras();
      if ((localBundle != null) && (localBundle.getBoolean("force_return_edit_list")))
      {
        j();
        return;
      }
      localipf1 = i();
    } while (localipf1 == null);
    new bqg(this, parambvx, localipf1).execute(new Void[0]);
  }
  
  public final void a(kaz paramkaz)
  {
    int i1 = paramkaz.q;
    switch (i1)
    {
    case 2: 
    default: 
      if (Log.isLoggable("DefaultEditorProvider", 4)) {
        new StringBuilder(29).append("A unhandled case: ").append(i1);
      }
    case 1: 
      Object localObject;
      do
      {
        return;
        localObject = paramkaz.p;
      } while (!(localObject instanceof Bitmap));
      new bqb(this, (Bitmap)localObject).execute(new Void[0]);
      return;
    }
    this.c.a(null);
  }
  
  public final void ap_()
  {
    if (this.j != null)
    {
      this.j.b(this);
      this.j = null;
    }
  }
  
  public final void b()
  {
    ipf localipf = i();
    int i1;
    int i2;
    if (localipf != null)
    {
      if (!((ixf)mbb.a(this.a, ixf.class)).i()) {
        break label110;
      }
      i1 = 32768;
      if (!this.d.getBooleanExtra("save_photo_edits", false)) {
        break label117;
      }
      i2 = 5;
      label50:
      if (i2 != 5) {
        break label129;
      }
    }
    label129:
    for (int i3 = 0x10 | i1 | 0x20;; i3 = 16)
    {
      if ((this.d.getData() != null) && (!this.d.hasExtra("base_photo_media_ref"))) {}
      for (int i4 = i3 | 0x1;; i4 = i3)
      {
        this.j = e.a(localipf, i2, null, i4, this);
        return;
        label110:
        i1 = 4096;
        break;
        label117:
        i2 = 1;
        break label50;
      }
    }
  }
  
  public final void d()
  {
    EsService.a(this.a, this.p);
    if (this.k != null)
    {
      int i1 = this.k.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i1)))
      {
        dmx localdmx = EsService.a(this.k.intValue());
        a(this.k.intValue(), localdmx);
      }
    }
  }
  
  public final void e()
  {
    ap_();
  }
  
  public final int f()
  {
    return this.g;
  }
  
  public final String g()
  {
    return this.h;
  }
  
  public final String h()
  {
    return this.i;
  }
  
  final ipf i()
  {
    Bundle localBundle = this.d.getExtras();
    if ((localBundle != null) && (localBundle.containsKey("base_photo_media_ref"))) {
      return (ipf)localBundle.getParcelable("base_photo_media_ref");
    }
    Uri localUri = this.d.getData();
    if (localUri != null) {
      return ipf.a(this.a, localUri, ipm.a, UUID.randomUUID().toString());
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpz
 * JD-Core Version:    0.7.0.1
 */