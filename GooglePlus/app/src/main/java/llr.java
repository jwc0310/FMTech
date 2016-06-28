import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.SpannableString;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class llr
  extends mab
{
  public lmo a;
  public lmk b;
  public String c;
  public lmd d;
  public lmf e;
  public lls f;
  public llq g;
  private long h = 0L;
  
  public llr() {}
  
  public llr(Context paramContext, opo paramopo)
  {
    if (paramopo.ag != null)
    {
      this.h = (0x40 | this.h);
      ong localong1 = paramopo.ag;
      if (localong1.a != null) {
        for (qop localqop2 : localong1.a.a) {
          if ((localqop2.a == 2) && (localqop2.d != null) && (!TextUtils.isEmpty(localqop2.d.a)))
          {
            Uri localUri = Uri.parse(localqop2.d.a);
            String str2 = ((iev)mbb.a(paramContext, iev.class)).b();
            if (localUri.isRelative())
            {
              String str3 = localUri.buildUpon().scheme("https").authority(str2).toString();
              if (URLUtil.isValidUrl(str3)) {
                localqop2.d.a = str3;
              }
            }
          }
        }
      }
      SpannableString localSpannableString = new SpannableString(efj.b(paramopo.ag.a));
      ong localong2 = paramopo.ag;
      this.g = new llq(localong2.b, localong2.c, localSpannableString);
    }
    int i;
    qop localqop1;
    if (paramopo.z != null)
    {
      if (paramopo.z.a != 300) {
        break label476;
      }
      if (paramopo.T == null) {
        break label562;
      }
      i = -1 + paramopo.T.length;
      if (i < 0) {
        break label562;
      }
      mih localmih = paramopo.T[i];
      if ((localmih.a != 2) || (localmih.b(opo.b) == null) || (((qoq)localmih.b(opo.b)).a == null) || (((qoq)localmih.b(opo.b)).a.length <= 0)) {
        break label470;
      }
      localqop1 = ((qoq)localmih.b(opo.b)).a[0];
      if (localqop1.a != 0) {
        break label470;
      }
    }
    label562:
    for (String str1 = localqop1.b;; str1 = null)
    {
      this.a = new lmo(false, str1);
      this.h = (1L | this.h);
      for (;;)
      {
        if (paramopo.z.c != null)
        {
          this.c = paramopo.z.c;
          this.h = (0x4 | this.h);
        }
        if (paramopo.aa != null)
        {
          this.d = new lmd(paramopo.aa);
          this.h = (0x8 | this.h);
        }
        a(paramopo.ac);
        return;
        label470:
        i--;
        break;
        label476:
        if (paramopo.z.a == 202)
        {
          this.b = new lmk(paramopo.z.b);
          this.h = (0x2 | this.h);
        }
        else if (paramopo.z.a == 207)
        {
          this.e = new lmf(false);
          this.h = (0x10 | this.h);
        }
      }
    }
  }
  
  public static llr a(byte[] paramArrayOfByte)
  {
    int i = 1;
    if (paramArrayOfByte == null) {
      return null;
    }
    llr localllr = new llr();
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    localllr.h = localByteBuffer.getLong();
    if ((1L & localllr.h) > 0L) {
      if (localByteBuffer.get() != i) {
        break label139;
      }
    }
    lmk locallmk;
    label139:
    int n;
    for (int m = i;; n = 0)
    {
      localllr.a = new lmo(m, lmo.d(localByteBuffer));
      if ((0x2 & localllr.h) <= 0L) {
        break label151;
      }
      locallmk = new lmk();
      int j = localByteBuffer.getInt();
      locallmk.a = new ArrayList(j);
      for (int k = 0; k < j; k++) {
        locallmk.a.add(lmi.a(localByteBuffer));
      }
    }
    localllr.b = locallmk;
    label151:
    if ((0x4 & localllr.h) > 0L) {
      localllr.c = d(localByteBuffer);
    }
    if ((0x8 & localllr.h) > 0L)
    {
      lmd locallmd = new lmd();
      locallmd.a = localByteBuffer.getInt();
      localllr.d = locallmd;
    }
    lmf locallmf;
    if ((0x10 & localllr.h) > 0L)
    {
      locallmf = new lmf();
      if (localByteBuffer.get() != i) {
        break label329;
      }
    }
    for (;;)
    {
      locallmf.a = i;
      localllr.e = locallmf;
      if ((0x20 & localllr.h) > 0L)
      {
        lls locallls = new lls();
        locallls.a = localByteBuffer.getInt();
        locallls.b = lls.d(localByteBuffer);
        locallls.c = lls.d(localByteBuffer);
        localllr.f = locallls;
      }
      if ((0x40 & localllr.h) > 0L) {
        localllr.g = llq.a(localByteBuffer);
      }
      return localllr;
      label329:
      i = 0;
    }
  }
  
  public static byte[] a(llr paramllr)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    localDataOutputStream.writeLong(paramllr.h);
    if ((1L & paramllr.h) > 0L)
    {
      lmo locallmo = paramllr.a;
      localDataOutputStream.writeBoolean(locallmo.a);
      lmo.a(localDataOutputStream, locallmo.b);
    }
    if ((0x2 & paramllr.h) > 0L) {
      lmk.a(paramllr.b, localDataOutputStream);
    }
    if ((0x4 & paramllr.h) > 0L) {
      a(localDataOutputStream, paramllr.c);
    }
    if ((0x8 & paramllr.h) > 0L) {
      localDataOutputStream.writeInt(paramllr.d.a);
    }
    if ((0x10 & paramllr.h) > 0L) {
      if (!paramllr.e.a) {
        break label267;
      }
    }
    label267:
    for (int i = 1;; i = 0)
    {
      localDataOutputStream.writeByte(i);
      if ((0x20 & paramllr.h) > 0L)
      {
        lls locallls = paramllr.f;
        localDataOutputStream.writeInt(locallls.a);
        lls.a(localDataOutputStream, locallls.b);
        lls.a(localDataOutputStream, locallls.c);
      }
      if ((0x40 & paramllr.h) > 0L)
      {
        llq localllq = paramllr.g;
        llq.a(localDataOutputStream, localllq.a);
        localDataOutputStream.writeInt(localllq.b);
        llq.a(localDataOutputStream, lwh.a(localllq.c));
      }
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localDataOutputStream.close();
      return arrayOfByte;
    }
  }
  
  public final void a(lmd paramlmd)
  {
    this.d = paramlmd;
    if (this.d == null)
    {
      this.h = (0xFFFFFFF7 & this.h);
      return;
    }
    this.h = (0x8 | this.h);
  }
  
  public final void a(ond[] paramArrayOfond)
  {
    this.f = null;
    this.h = (0xFFFFFFDF & this.h);
    if ((paramArrayOfond == null) || (paramArrayOfond.length == 0)) {}
    for (;;)
    {
      return;
      for (int i = 0; i < paramArrayOfond.length; i++)
      {
        ond localond = paramArrayOfond[i];
        if ((localond != null) && (localond.a != null) && (localond.a.a == 11))
        {
          this.h = (0x20 | this.h);
          this.f = new lls(localond.a.a, localond.a.b, localond.b);
          return;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llr
 * JD-Core Version:    0.7.0.1
 */