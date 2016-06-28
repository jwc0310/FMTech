import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;
import com.google.android.apps.plus.phone.TileCropActivity;
import com.google.android.apps.plus.phone.VideoViewActivity;
import java.util.Arrays;
import java.util.EnumMap;

public abstract class bcv
  implements bcp
{
  public final long A;
  public final long B;
  public final String C;
  public final long D;
  public aud E;
  public atu F;
  private anz a;
  private ivl b;
  private iwb c;
  public final Bundle d;
  public final int e;
  public final EnumMap<bcx, ipf> f;
  public final oih g;
  public final oih h;
  public final ojx i;
  public final ojx j;
  public final ojf k;
  public final isq l;
  public final String m;
  public final String n;
  public final String o;
  public final String p;
  public final String q;
  public final String r;
  public final Integer s;
  public final boolean t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public final boolean x;
  public final boolean y;
  public final long z;
  
  protected bcv(Parcel paramParcel)
  {
    this.d = null;
    this.e = -1;
    this.f = new EnumMap(bcx.class);
    ipf localipf1 = (ipf)paramParcel.readParcelable(ipf.class.getClassLoader());
    if (localipf1 != null) {
      this.f.put(bcx.a, localipf1);
    }
    ipf localipf2 = (ipf)paramParcel.readParcelable(ipf.class.getClassLoader());
    if (localipf2 != null) {
      this.f.put(bcx.d, localipf2);
    }
    ipf localipf3 = (ipf)paramParcel.readParcelable(ipf.class.getClassLoader());
    if (localipf3 != null) {
      this.f.put(bcx.b, localipf3);
    }
    ipf localipf4 = (ipf)paramParcel.readParcelable(ipf.class.getClassLoader());
    if (localipf4 != null) {
      this.f.put(bcx.c, localipf4);
    }
    this.l = ((isq)paramParcel.readParcelable(isq.class.getClassLoader()));
    this.m = paramParcel.readString();
    this.n = paramParcel.readString();
    this.o = paramParcel.readString();
    this.p = paramParcel.readString();
    this.q = paramParcel.readString();
    this.r = paramParcel.readString();
    this.s = ((Integer)paramParcel.readValue(Integer.class.getClassLoader()));
    int i2;
    int i3;
    label262:
    int i4;
    label279:
    int i5;
    label296:
    int i6;
    if (paramParcel.readInt() == i1)
    {
      i2 = i1;
      this.t = i2;
      if (paramParcel.readInt() != i1) {
        break label484;
      }
      i3 = i1;
      this.u = i3;
      if (paramParcel.readInt() != i1) {
        break label490;
      }
      i4 = i1;
      this.v = i4;
      if (paramParcel.readInt() != i1) {
        break label496;
      }
      i5 = i1;
      this.w = i5;
      if (paramParcel.readInt() != i1) {
        break label502;
      }
      i6 = i1;
      label313:
      this.x = i6;
      if (paramParcel.readInt() != i1) {
        break label508;
      }
    }
    for (;;)
    {
      this.y = i1;
      this.z = paramParcel.readLong();
      this.A = paramParcel.readLong();
      this.B = paramParcel.readLong();
      this.C = paramParcel.readString();
      this.D = paramParcel.readLong();
      this.k = ((ojf)a(new ojf(), paramParcel.createByteArray()));
      this.g = ((oih)a(new oih(), paramParcel.createByteArray()));
      this.h = ((oih)a(new oih(), paramParcel.createByteArray()));
      this.i = ((ojx)a(new ojx(), paramParcel.createByteArray()));
      this.j = ((ojx)a(new ojx(), paramParcel.createByteArray()));
      return;
      i2 = 0;
      break;
      label484:
      i3 = 0;
      break label262;
      label490:
      i4 = 0;
      break label279;
      label496:
      i5 = 0;
      break label296;
      label502:
      i6 = 0;
      break label313;
      label508:
      i1 = 0;
    }
  }
  
  protected bcv(bcw parambcw)
  {
    this.d = parambcw.d;
    this.e = parambcw.e;
    this.f = new EnumMap(parambcw.f);
    this.g = parambcw.g;
    this.h = parambcw.h;
    this.i = parambcw.i;
    this.j = parambcw.j;
    this.k = parambcw.k;
    this.l = parambcw.l;
    this.m = parambcw.m;
    this.n = parambcw.n;
    this.o = parambcw.o;
    this.p = parambcw.p;
    this.q = parambcw.q;
    this.r = parambcw.r;
    this.s = parambcw.s;
    this.t = parambcw.t;
    this.u = parambcw.u;
    this.v = parambcw.v;
    this.w = parambcw.w;
    this.x = parambcw.x;
    this.y = parambcw.y;
    this.z = parambcw.z;
    this.A = parambcw.A;
    this.B = parambcw.B;
    this.C = parambcw.C;
    this.D = parambcw.D;
  }
  
  private final oih V()
  {
    jpx localjpx = c();
    oih localoih1 = null;
    if (localjpx != null)
    {
      oih localoih2 = localjpx.h();
      localoih1 = null;
      if (localoih2 != null) {
        localoih1 = localjpx.h();
      }
    }
    return localoih1;
  }
  
  protected static Intent a(Context paramContext, Uri paramUri, String paramString)
  {
    if (paramUri == null) {
      return null;
    }
    Intent localIntent = new Intent("android.intent.action.ATTACH_DATA");
    localIntent.setDataAndType(paramUri, paramString);
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.putExtra("mimeType", paramString);
    }
    localIntent.addFlags(1);
    GooglePhotosImageProvider.a(paramContext, paramUri, "com.android.camera.action.CROP", paramString);
    return localIntent;
  }
  
  private static <T extends qat> T a(T paramT, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        qat localqat = qat.b(paramT, paramArrayOfByte, 0, paramArrayOfByte.length);
        return localqat;
      }
      catch (qas localqas)
      {
        Log.e("1upMediaProxyBase", "Failed to deserialize EditInfo.", localqas);
      }
    }
    return null;
  }
  
  protected static boolean c(oih paramoih)
  {
    int i1;
    int i5;
    int i3;
    label60:
    qml localqml;
    if (paramoih != null)
    {
      if ((paramoih != null) && (paramoih.a != null)) {
        break label113;
      }
      i1 = 1;
      if (i1 == 0)
      {
        if (!jpt.a(paramoih)) {
          break label417;
        }
        qmg localqmg = paramoih.a;
        if (!efj.a(localqmg)) {
          break label411;
        }
        qml[] arrayOfqml = localqmg.a;
        int i4 = arrayOfqml.length;
        i5 = 0;
        i3 = 0;
        if (i5 < i4)
        {
          localqml = arrayOfqml[i5];
          if ((localqml.a != null) && (localqml.a.a != null)) {
            break label387;
          }
          i3 = 0;
        }
        label96:
        if (i3 == 0) {
          break label417;
        }
      }
    }
    label263:
    label411:
    label417:
    for (int i2 = 1;; i2 = 0)
    {
      boolean bool = false;
      if (i2 != 0) {
        bool = true;
      }
      return bool;
      label113:
      int i6;
      if ((paramoih == null) || (paramoih.a == null)) {
        i6 = 1;
      }
      for (;;)
      {
        if ((i6 == 0) || ((paramoih.a.a != null) && (paramoih.a.a.length != 0))) {
          break label382;
        }
        i1 = 1;
        break;
        if ((paramoih.a.d != -2147483648) && (paramoih.a.d != 0))
        {
          i6 = 0;
        }
        else
        {
          if ((paramoih.a.c != null) && (paramoih.a.c.a != null))
          {
            Float localFloat1 = paramoih.a.c.a.a;
            float f1;
            label233:
            Float localFloat2;
            float f2;
            Float localFloat3;
            float f3;
            label293:
            Float localFloat4;
            if (localFloat1 == null)
            {
              f1 = 0.0F;
              if (f1 == 0.0F)
              {
                localFloat2 = paramoih.a.c.a.c;
                if (localFloat2 != null) {
                  break label346;
                }
                f2 = 1.0F;
                if (f2 == 1.0F)
                {
                  localFloat3 = paramoih.a.c.a.b;
                  if (localFloat3 != null) {
                    break label356;
                  }
                  f3 = 0.0F;
                  if (f3 == 0.0F)
                  {
                    localFloat4 = paramoih.a.c.a.d;
                    if (localFloat4 != null) {
                      break label366;
                    }
                  }
                }
              }
            }
            label346:
            label356:
            label366:
            for (float f4 = 1.0F;; f4 = localFloat4.floatValue())
            {
              if (f4 == 1.0F) {
                break label376;
              }
              i6 = 0;
              break;
              f1 = localFloat1.floatValue();
              break label233;
              f2 = localFloat2.floatValue();
              break label263;
              f3 = localFloat3.floatValue();
              break label293;
            }
          }
          label376:
          i6 = 1;
        }
      }
      label382:
      i1 = 0;
      break;
      if (efj.a(localqml, 1))
      {
        i5++;
        i3 = 1;
        break label60;
      }
      i3 = 0;
      break label96;
      i3 = 0;
      break label96;
    }
  }
  
  public boolean A()
  {
    return (this.k != null) && ((0x10000000 & this.A) != 0L);
  }
  
  public boolean B()
  {
    return this.y;
  }
  
  public boolean C()
  {
    return M();
  }
  
  public final boolean E()
  {
    return ((ipf)this.f.get(bcx.a)).e == ipm.b;
  }
  
  public final boolean F()
  {
    return ((ipf)this.f.get(bcx.a)).e == ipm.c;
  }
  
  public final boolean G()
  {
    return ((ipf)this.f.get(bcx.a)).e == ipm.d;
  }
  
  public final boolean H()
  {
    return (0x80000 & this.z) != 0L;
  }
  
  public final boolean I()
  {
    return this.t;
  }
  
  public final boolean J()
  {
    return this.u;
  }
  
  public boolean K()
  {
    boolean bool1 = this.F.c();
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.d.getBoolean("selected_only", false);
      bool2 = false;
      if (!bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean L()
  {
    return c(e());
  }
  
  public final boolean N()
  {
    ojf localojf = this.k;
    boolean bool1 = false;
    Boolean localBoolean;
    if (localojf != null)
    {
      oks localoks = this.k.q;
      bool1 = false;
      if (localoks != null)
      {
        localBoolean = this.k.q.c;
        if (localBoolean != null) {
          break label56;
        }
      }
    }
    label56:
    for (boolean bool2 = false;; bool2 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public boolean O()
  {
    if (this.i != null)
    {
      if ((this.i.b == 3) || (this.i.b == 2)) {}
      for (int i1 = 1; (i1 != 0) && (mar.a(this.i)); i1 = 0) {
        return true;
      }
      return false;
    }
    return false;
  }
  
  public final boolean P()
  {
    return (ipf)this.f.get(bcx.a) != null;
  }
  
  public final int Q()
  {
    if ((this.k == null) || (this.k.q == null) || (this.k.q.e == null)) {
      return 0;
    }
    return this.k.q.e.intValue();
  }
  
  public final boolean T()
  {
    ojf localojf = this.k;
    if ((((ipf)this.f.get(bcx.a)).e == ipm.b) && ((0x100 & this.z) != 0L) && (localojf != null) && (localojf.F != null) && (localojf.F.c != null) && (localojf.F.c.a == 8) && (localojf.F.c.b != null)) {
      this.b.k();
    }
    return false;
  }
  
  protected abstract bcw U();
  
  public Intent a(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, e(), false);
  }
  
  protected final Intent a(Context paramContext, int paramInt, oih paramoih, boolean paramBoolean)
  {
    if (T())
    {
      anz localanz = this.a;
      ipf localipf3 = (ipf)this.f.get(bcx.a);
      String str2 = this.C;
      Activity localActivity = localanz.a;
      long l1 = localipf3.b.a;
      String str3 = localipf3.b.b;
      String str4 = localipf3.c;
      int i1 = localanz.c;
      String str5 = localanz.b;
      int i2 = localanz.e;
      return new Intent("android.intent.action.SEND").setComponent(new ComponentName(localActivity, "com.google.android.apps.moviemaker.MovieMakerActivity")).putExtra("aam_photo_id", l1).putExtra("aadm_media_key", str2).putExtra("aam_owner_id", str3).putExtra("source_id", i1).putExtra("source_name", str5).putExtra("account_id", i2).putExtra("android.intent.extra.STREAM", Uri.parse(str4));
    }
    ipf localipf1 = (ipf)this.f.get(bcx.a);
    ipf localipf2 = (ipf)this.f.get(bcx.b);
    String str1 = this.p;
    boolean bool = this.d.getBoolean("force_return_edit_list");
    if (localipf2 != null) {}
    for (;;)
    {
      Intent localIntent = new Intent();
      localIntent.setClassName(paramContext, hwg.b);
      localIntent.putExtra("account_id", paramInt);
      localIntent.putExtra("photo_ref", localipf1);
      localIntent.putExtra("base_photo_media_ref", localipf2);
      localIntent.putExtra("auto_enhanced_photo_url", str1);
      localIntent.putExtra("save_photo_edits", paramBoolean);
      localIntent.putExtra("force_return_edit_list", bool);
      if (paramoih != null) {
        localIntent.putExtra("edit_info", qat.a(paramoih));
      }
      return localIntent;
      localipf2 = localipf1;
    }
  }
  
  public final ipf a()
  {
    return (ipf)this.f.get(bcx.a);
  }
  
  public final String a(int paramInt)
  {
    String str;
    if (this.q != null) {
      str = this.q;
    }
    for (;;)
    {
      if (str == null) {
        str = null;
      }
      while (!iqw.a(str))
      {
        return str;
        if (this.i != null)
        {
          str = this.i.e;
          break;
        }
        if ((ipf)this.f.get(bcx.a) == null) {
          break label90;
        }
        str = ((ipf)this.f.get(bcx.a)).c;
        break;
      }
      return iqw.a(str, 582, paramInt);
      label90:
      str = null;
    }
  }
  
  public final jpx a(oih paramoih)
  {
    jpx localjpx = c();
    if (localjpx == null) {
      localjpx = d();
    }
    return localjpx.a(paramoih);
  }
  
  public void a(Context paramContext)
  {
    this.E = ((aud)mbb.a(paramContext, aud.class));
    mbb.a(paramContext, dxl.class);
    this.F = ((atu)mbb.a(paramContext, atu.class));
    this.a = ((anz)mbb.a(paramContext, anz.class));
    this.b = ((ivl)mbb.a(paramContext, ivl.class));
    this.c = ((iwb)mbb.a(paramContext, iwb.class));
  }
  
  public final bcp b(oih paramoih)
  {
    bcw localbcw = U().a(this);
    localbcw.g = paramoih;
    return localbcw.a();
  }
  
  public final ipf b()
  {
    return (ipf)this.f.get(bcx.d);
  }
  
  public final Intent c(Context paramContext)
  {
    String str = this.d.getString("view_id");
    dbu localdbu = new dbu(paramContext, TileCropActivity.class, this.e);
    localdbu.a = ((ipf)this.f.get(bcx.a));
    localdbu.c = str;
    localdbu.d = this.n;
    localdbu.b = 1;
    return localdbu.a();
  }
  
  public Intent d(Context paramContext)
  {
    byte[] arrayOfByte = ojx.a(this.i);
    int i1 = this.e;
    String str = this.m;
    long l1 = this.B;
    Intent localIntent = new Intent(paramContext, VideoViewActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", i1);
    localIntent.putExtra("owner_id", str);
    localIntent.putExtra("photo_id", l1);
    localIntent.putExtra("video_data", arrayOfByte);
    return localIntent;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final oih e()
  {
    oih localoih = V();
    if (localoih != null) {
      return localoih;
    }
    return this.g;
  }
  
  public final oih f()
  {
    oih localoih1 = V();
    if (localoih1 != null)
    {
      oih localoih4 = this.g;
      boolean bool2;
      if (localoih4 == localoih1) {
        bool2 = true;
      }
      while (!bool2)
      {
        return localoih1;
        if ((localoih4 == null) || (localoih1 == null))
        {
          bool2 = false;
        }
        else if (localoih4.getClass() != localoih1.getClass())
        {
          bool2 = false;
        }
        else
        {
          int i3 = localoih4.a();
          localoih4.ak = i3;
          int i4 = localoih1.a();
          localoih1.ak = i4;
          if (i4 != i3)
          {
            bool2 = false;
          }
          else
          {
            byte[] arrayOfByte3 = new byte[i3];
            byte[] arrayOfByte4 = new byte[i3];
            qat.a(localoih4, arrayOfByte3, 0, i3);
            qat.a(localoih1, arrayOfByte4, 0, i3);
            bool2 = Arrays.equals(arrayOfByte3, arrayOfByte4);
          }
        }
      }
    }
    oih localoih2 = this.g;
    oih localoih3 = this.h;
    boolean bool1;
    if (localoih2 == localoih3) {
      bool1 = true;
    }
    while (!bool1)
    {
      return this.g;
      if ((localoih2 == null) || (localoih3 == null))
      {
        bool1 = false;
      }
      else if (localoih2.getClass() != localoih3.getClass())
      {
        bool1 = false;
      }
      else
      {
        int i1 = localoih2.a();
        localoih2.ak = i1;
        int i2 = localoih3.a();
        localoih3.ak = i2;
        if (i2 != i1)
        {
          bool1 = false;
        }
        else
        {
          byte[] arrayOfByte1 = new byte[i1];
          byte[] arrayOfByte2 = new byte[i1];
          qat.a(localoih2, arrayOfByte1, 0, i1);
          qat.a(localoih3, arrayOfByte2, 0, i1);
          bool1 = Arrays.equals(arrayOfByte1, arrayOfByte2);
        }
      }
    }
    return null;
  }
  
  public final ojf g()
  {
    return this.k;
  }
  
  public final ojx h()
  {
    return this.i;
  }
  
  public final ojx i()
  {
    return this.j;
  }
  
  public final String j()
  {
    return this.m;
  }
  
  public final String k()
  {
    return this.n;
  }
  
  public final String l()
  {
    return this.o;
  }
  
  public final String m()
  {
    return this.r;
  }
  
  public final long n()
  {
    return this.z;
  }
  
  public final long o()
  {
    return this.B;
  }
  
  public final String p()
  {
    return this.C;
  }
  
  public final long q()
  {
    return this.D;
  }
  
  public final boolean r()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool4;
    if (((ipf)this.f.get(bcx.a)).e == ipm.a)
    {
      bool2 = bool1;
      if (!bool2) {
        break label191;
      }
      Integer localInteger1 = Integer.valueOf(R());
      Integer localInteger2 = Integer.valueOf(S());
      if ((!hwg.a()) || (localInteger1 == null) || (localInteger2 == null) || (Math.min(localInteger1.intValue(), localInteger2.intValue()) < 32)) {
        break label185;
      }
      bool4 = bool1;
      label85:
      if (!bool4) {
        break label191;
      }
    }
    label185:
    label191:
    for (boolean bool3 = bool1;; bool3 = false)
    {
      if (T()) {
        this.b.j();
      }
      if ((!this.w) || (Build.VERSION.SDK_INT < 11) || ((0x0 & this.A) == 0L) || ((ipf)this.f.get(bcx.a) == null) || (H()) || (this.d.getBoolean("prevent_edit", false)) || (!bool3)) {
        bool1 = false;
      }
      return bool1;
      bool2 = false;
      break;
      bool4 = false;
      break label85;
    }
  }
  
  public final boolean s()
  {
    if ((this.k != null) && (this.k.l != null) && (this.k.l.b != 3)) {}
    for (int i1 = 1; (i1 == 0) && ((0x0 & this.A) != 0L); i1 = 0) {
      return true;
    }
    return false;
  }
  
  public final boolean t()
  {
    boolean bool2;
    if ((0x0 & this.A) == 0L)
    {
      boolean bool3 = (0x20000000 & this.A) < 0L;
      bool2 = false;
      if (!bool3) {}
    }
    else
    {
      boolean bool1 = this.d.getBoolean("prevent_share", false);
      bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean u()
  {
    boolean bool1 = (0x0 & this.A) < 0L;
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = (0x80000 & this.z) < 0L;
      bool2 = false;
      if (!bool3)
      {
        boolean bool4 = this.d.getBoolean("prevent_delete", false);
        bool2 = false;
        if (!bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public boolean v()
  {
    if ((this.x) && ((ipf)this.f.get(bcx.a) != null) && (ipm.a.equals(((ipf)this.f.get(bcx.a)).e)))
    {
      if (Build.VERSION.SDK_INT >= 19) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
  
  public boolean w()
  {
    boolean bool1 = (0x4000000 & this.A) < 0L;
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.d.getBoolean("disable_photo_comments", false);
      bool2 = false;
      if (!bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = 1;
    paramParcel.writeParcelable((Parcelable)this.f.get(bcx.a), 0);
    paramParcel.writeParcelable((Parcelable)this.f.get(bcx.d), 0);
    paramParcel.writeParcelable((Parcelable)this.f.get(bcx.b), 0);
    paramParcel.writeParcelable((Parcelable)this.f.get(bcx.c), 0);
    paramParcel.writeParcelable(this.l, 0);
    paramParcel.writeString(this.m);
    paramParcel.writeString(this.n);
    paramParcel.writeString(this.o);
    paramParcel.writeString(this.p);
    paramParcel.writeString(this.q);
    paramParcel.writeString(this.r);
    paramParcel.writeValue(this.s);
    int i2;
    int i3;
    label165:
    int i4;
    label181:
    int i5;
    label197:
    int i6;
    label213:
    label226:
    byte[] arrayOfByte1;
    label281:
    byte[] arrayOfByte2;
    label297:
    byte[] arrayOfByte3;
    label313:
    byte[] arrayOfByte4;
    label329:
    byte[] arrayOfByte5;
    if (this.t)
    {
      i2 = i1;
      paramParcel.writeInt(i2);
      if (!this.u) {
        break label362;
      }
      i3 = i1;
      paramParcel.writeInt(i3);
      if (!this.v) {
        break label368;
      }
      i4 = i1;
      paramParcel.writeInt(i4);
      if (!this.w) {
        break label374;
      }
      i5 = i1;
      paramParcel.writeInt(i5);
      if (!this.x) {
        break label380;
      }
      i6 = i1;
      paramParcel.writeInt(i6);
      if (!this.y) {
        break label386;
      }
      paramParcel.writeInt(i1);
      paramParcel.writeLong(this.z);
      paramParcel.writeLong(this.A);
      paramParcel.writeLong(this.B);
      paramParcel.writeString(this.C);
      paramParcel.writeLong(this.D);
      if (this.k != null) {
        break label391;
      }
      arrayOfByte1 = null;
      paramParcel.writeByteArray(arrayOfByte1);
      if (this.g != null) {
        break label403;
      }
      arrayOfByte2 = null;
      paramParcel.writeByteArray(arrayOfByte2);
      if (this.h != null) {
        break label415;
      }
      arrayOfByte3 = null;
      paramParcel.writeByteArray(arrayOfByte3);
      if (this.i != null) {
        break label427;
      }
      arrayOfByte4 = null;
      paramParcel.writeByteArray(arrayOfByte4);
      ojx localojx = this.j;
      arrayOfByte5 = null;
      if (localojx != null) {
        break label439;
      }
    }
    for (;;)
    {
      paramParcel.writeByteArray(arrayOfByte5);
      return;
      i2 = 0;
      break;
      label362:
      i3 = 0;
      break label165;
      label368:
      i4 = 0;
      break label181;
      label374:
      i5 = 0;
      break label197;
      label380:
      i6 = 0;
      break label213;
      label386:
      i1 = 0;
      break label226;
      label391:
      arrayOfByte1 = qat.a(this.k);
      break label281;
      label403:
      arrayOfByte2 = qat.a(this.g);
      break label297;
      label415:
      arrayOfByte3 = qat.a(this.h);
      break label313;
      label427:
      arrayOfByte4 = qat.a(this.i);
      break label329;
      label439:
      arrayOfByte5 = qat.a(this.j);
    }
  }
  
  public boolean x()
  {
    boolean bool1 = this.t;
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.d.getBoolean("disable_photo_comments", false);
      bool2 = false;
      if (!bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean y()
  {
    return (0x8000000 & this.A) != 0L;
  }
  
  public boolean z()
  {
    int i1;
    int i4;
    if ((0x40000000 & this.A) != 0L)
    {
      i1 = 1;
      if (this.k == null) {
        break label121;
      }
      ojm[] arrayOfojm = this.k.f;
      if ((arrayOfojm == null) || (arrayOfojm.length <= 0)) {
        break label121;
      }
      i4 = -1 + arrayOfojm.length;
      i3 = 0;
      i2 = 0;
      label53:
      if (i4 < 0) {
        break label125;
      }
      switch (arrayOfojm[i4].c)
      {
      }
    }
    for (;;)
    {
      i4--;
      break label53;
      i1 = 0;
      break;
      i2 = 1;
      continue;
      i3 = 1;
    }
    label121:
    int i2 = 0;
    int i3 = 0;
    label125:
    return ((i1 != 0) && (i3 != 0)) || (i2 != 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bcv
 * JD-Core Version:    0.7.0.1
 */