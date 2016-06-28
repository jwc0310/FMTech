import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class lnr
  extends mab
{
  public String a;
  public String b;
  public String c;
  public int d;
  public ArrayList<lmn> e;
  
  public lnr(Context paramContext, nze paramnze, nzc paramnzc)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramnzc != null) && (paramnzc.b != null)) {
      for (int i = 0; i < paramnzc.b.length; i++)
      {
        nzd localnzd = paramnzc.b[i];
        if ((localnzd.a != null) && (localnzd.a.length > 0)) {
          localArrayList.add(new lmn(paramContext, localnzd.a[0]));
        }
      }
    }
    String str1;
    String str2;
    if (paramnze != null)
    {
      str1 = paramnze.b;
      str2 = paramnze.c;
    }
    for (String str3 = paramnze.d;; str3 = null)
    {
      a(str1, str2, str3, localArrayList, 2);
      return;
      str1 = null;
      str2 = null;
    }
  }
  
  public lnr(Context paramContext, nzg paramnzg, nzf paramnzf)
  {
    this(paramContext, paramnzg, paramnzf, 1);
  }
  
  private lnr(Context paramContext, nzg paramnzg, nzf paramnzf, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramnzf != null) && (paramnzf.b != null)) {
      for (int i = 0; i < paramnzf.b.length; i++) {
        localArrayList.add(new lmn(paramContext, paramnzf.b[i]));
      }
    }
    String str1;
    String str2;
    if (paramnzg != null)
    {
      str1 = paramnzg.b;
      str2 = paramnzg.c;
    }
    for (String str3 = paramnzg.d;; str3 = null)
    {
      a(str1, str2, str3, localArrayList, 1);
      return;
      str1 = null;
      str2 = null;
    }
  }
  
  private lnr(String paramString1, String paramString2, String paramString3, ArrayList<lmn> paramArrayList, int paramInt)
  {
    a(paramString1, paramString2, paramString3, paramArrayList, paramInt);
  }
  
  public lnr(nzb paramnzb)
  {
    if (paramnzb != null) {
      a(paramnzb.b, paramnzb.c, paramnzb.d, null, 0);
    }
  }
  
  public static lnr a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getInt();
    String str1 = d(localByteBuffer);
    String str2 = d(localByteBuffer);
    String str3 = d(localByteBuffer);
    int j = localByteBuffer.getInt();
    ArrayList localArrayList = new ArrayList(j);
    for (int k = 0; k < j; k++) {
      localArrayList.add(lmn.a(localByteBuffer));
    }
    return new lnr(str1, str2, str3, localArrayList, i);
  }
  
  private final void a(String paramString1, String paramString2, String paramString3, ArrayList<lmn> paramArrayList, int paramInt)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    if (paramArrayList != null) {}
    for (;;)
    {
      this.e = paramArrayList;
      this.d = paramInt;
      return;
      paramArrayList = new ArrayList();
    }
  }
  
  public static byte[] a(lnr paramlnr)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      localDataOutputStream.writeInt(paramlnr.d);
      a(localDataOutputStream, paramlnr.a);
      a(localDataOutputStream, paramlnr.b);
      a(localDataOutputStream, paramlnr.c);
      b(localDataOutputStream, paramlnr.e);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      return arrayOfByte;
    }
    finally
    {
      localDataOutputStream.close();
    }
  }
  
  private static void b(DataOutputStream paramDataOutputStream, List<lmn> paramList)
  {
    int i;
    int j;
    lmn locallmn;
    if (paramList != null)
    {
      i = paramList.size();
      paramDataOutputStream.writeInt(i);
      j = 0;
      if (j >= i) {
        return;
      }
      locallmn = (lmn)paramList.get(j);
      mab.a(paramDataOutputStream, locallmn.e);
      mab.a(paramDataOutputStream, locallmn.d);
      paramDataOutputStream.writeInt(locallmn.a);
      if (TextUtils.isEmpty(locallmn.f)) {
        break label154;
      }
      paramDataOutputStream.writeInt(1);
      mab.a(paramDataOutputStream, lwh.a(locallmn.f));
    }
    for (;;)
    {
      lmi.a(locallmn.c, paramDataOutputStream);
      ArrayList localArrayList = locallmn.b;
      int k = localArrayList.size();
      paramDataOutputStream.writeInt(k);
      for (int m = 0; m < k; m++) {
        lmi.a((lmi)localArrayList.get(m), paramDataOutputStream);
      }
      i = 0;
      break;
      label154:
      paramDataOutputStream.writeInt(0);
      CharSequence localCharSequence = locallmn.c();
      if (localCharSequence == null) {
        mab.a(paramDataOutputStream, null);
      } else {
        mab.a(paramDataOutputStream, localCharSequence.toString());
      }
    }
    if (locallmn.g) {}
    for (int n = 1;; n = 0)
    {
      paramDataOutputStream.writeInt(n);
      j++;
      break;
    }
  }
  
  public final boolean a(String paramString1, String paramString2)
  {
    int i = this.e.size();
    for (int j = 0; j < i; j++)
    {
      lmn locallmn = (lmn)this.e.get(j);
      if ((TextUtils.equals(locallmn.e, paramString1)) && (TextUtils.equals(locallmn.d, paramString2)))
      {
        locallmn.g = true;
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnr
 * JD-Core Version:    0.7.0.1
 */