import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class lmn
  extends mab
  implements lxc
{
  public int a;
  public ArrayList<lmi> b;
  public lmi c;
  public String d;
  public String e;
  public Spanned f;
  public boolean g;
  private String h;
  
  public lmn(Context paramContext, odg paramodg)
  {
    ArrayList localArrayList = new ArrayList();
    int i = efj.a(paramodg.b);
    String str1 = paramodg.d;
    ors localors1 = paramodg.a;
    String str2 = null;
    if (localors1 != null)
    {
      orm localorm3 = paramodg.a.a;
      str2 = null;
      if (localorm3 != null) {
        str2 = paramodg.a.a.c;
      }
    }
    orn localorn1;
    lmi locallmi;
    Object localObject1;
    orm localorm2;
    String str5;
    if (paramodg.a != null)
    {
      localorn1 = paramodg.a.b;
      locallmi = a(str2, localorn1);
      ors localors2 = paramodg.a;
      localObject1 = null;
      if (localors2 != null)
      {
        localorm2 = paramodg.a.a;
        if (localorm2 == null) {
          break label406;
        }
        if (TextUtils.isEmpty(localorm2.c)) {
          break label296;
        }
        String str8 = String.valueOf(localorm2.c);
        if (str8.length() == 0) {
          break label282;
        }
        str5 = "g:".concat(str8);
        label161:
        localObject1 = str5;
      }
      if (paramodg.a == null) {
        break label412;
      }
    }
    String str3;
    label282:
    label412:
    for (orn localorn2 = paramodg.a.b;; localorn2 = null)
    {
      str3 = efj.a(paramContext, i, localorn2, paramodg.c);
      if (paramodg.c == null) {
        break label418;
      }
      for (ors localors3 : paramodg.c)
      {
        orm localorm1 = localors3.a;
        String str4 = null;
        if (localorm1 != null) {
          str4 = localors3.a.c;
        }
        localArrayList.add(a(str4, localors3.b));
      }
      localorn1 = null;
      break;
      str5 = new String("g:");
      break label161;
      label296:
      if (!TextUtils.isEmpty(localorm2.a))
      {
        String str7 = String.valueOf(localorm2.a);
        if (str7.length() != 0)
        {
          str5 = "e:".concat(str7);
          break label161;
        }
        str5 = new String("e:");
        break label161;
      }
      if (!TextUtils.isEmpty(localorm2.d))
      {
        String str6 = String.valueOf(localorm2.d);
        if (str6.length() != 0)
        {
          str5 = "p:".concat(str6);
          break label161;
        }
        str5 = new String("p:");
        break label161;
      }
      str5 = null;
      break label161;
    }
    label406:
    label418:
    qoq[] arrayOfqoq = paramodg.e;
    Object localObject2;
    if ((arrayOfqoq == null) || (arrayOfqoq.length == 0)) {
      localObject2 = null;
    }
    for (;;)
    {
      a(localArrayList, locallmi, i, str3, (Spanned)localObject2, localObject1, str1, false);
      return;
      localObject2 = efj.a(arrayOfqoq[0]);
      if (arrayOfqoq.length > 1) {
        ((SpannableStringBuilder)localObject2).append('\n').append(efj.a(arrayOfqoq[1]));
      }
    }
  }
  
  private lmn(ArrayList<lmi> paramArrayList, lmi paramlmi, int paramInt, String paramString1, Spanned paramSpanned, String paramString2, String paramString3, boolean paramBoolean)
  {
    a(paramArrayList, paramlmi, paramInt, paramString1, paramSpanned, paramString2, paramString3, paramBoolean);
  }
  
  private static lmi a(String paramString, orn paramorn)
  {
    String str1;
    String str3;
    boolean bool;
    String str5;
    int i;
    label54:
    String str2;
    String str4;
    if (paramorn != null)
    {
      str1 = paramorn.a;
      str3 = paramorn.c;
      bool = efj.b(paramorn.f);
      if (paramorn != null) {
        if (paramorn.o == 1)
        {
          str5 = "male";
          orx[] arrayOforx = paramorn.q;
          i = 0;
          if (arrayOforx == null) {
            break label139;
          }
          if (i >= paramorn.q.length) {
            break label139;
          }
          orx localorx = paramorn.q[i];
          if (!efj.b(localorx.b)) {
            break label133;
          }
          str2 = localorx.a;
          str4 = str5;
        }
      }
    }
    for (;;)
    {
      return new lmi(paramString, str1, str2, str3, bool, str4);
      if (paramorn.o == 2)
      {
        str5 = "female";
        break;
      }
      str5 = "other";
      break;
      label133:
      i++;
      break label54;
      label139:
      str4 = str5;
      str2 = null;
      continue;
      str1 = null;
      str2 = null;
      str3 = null;
      bool = false;
      str4 = null;
    }
  }
  
  public static lmn a(ByteBuffer paramByteBuffer)
  {
    int i = 1;
    String str1 = mab.d(paramByteBuffer);
    String str2 = mab.d(paramByteBuffer);
    int k = paramByteBuffer.getInt();
    byte[] arrayOfByte;
    SpannableStringBuilder localSpannableStringBuilder2;
    label48:
    SpannableStringBuilder localSpannableStringBuilder1;
    String str3;
    if (paramByteBuffer.getInt() == i)
    {
      int m = i;
      if (m == 0) {
        break label123;
      }
      arrayOfByte = mab.b(paramByteBuffer);
      if (arrayOfByte != null) {
        break label110;
      }
      localSpannableStringBuilder2 = null;
      localSpannableStringBuilder1 = localSpannableStringBuilder2;
      str3 = null;
    }
    lmi locallmi;
    ArrayList localArrayList;
    for (;;)
    {
      locallmi = lmi.a(paramByteBuffer);
      int i1 = paramByteBuffer.getInt();
      localArrayList = new ArrayList(i1);
      for (int i2 = 0; i2 < i1; i2++) {
        localArrayList.add(lmi.a(paramByteBuffer));
      }
      int n = 0;
      break;
      label110:
      localSpannableStringBuilder2 = lwh.a(ByteBuffer.wrap(arrayOfByte));
      break label48;
      label123:
      str3 = mab.d(paramByteBuffer);
      localSpannableStringBuilder1 = null;
    }
    if (paramByteBuffer.getInt() == i) {}
    for (;;)
    {
      return new lmn(localArrayList, locallmi, k, str3, localSpannableStringBuilder1, str1, str2, i);
      int j = 0;
    }
  }
  
  private final void a(ArrayList<lmi> paramArrayList, lmi paramlmi, int paramInt, String paramString1, Spanned paramSpanned, String paramString2, String paramString3, boolean paramBoolean)
  {
    this.b = paramArrayList;
    this.c = paramlmi;
    this.d = paramString3;
    this.a = paramInt;
    this.h = paramString1;
    this.f = paramSpanned;
    this.d = paramString3;
    this.e = paramString2;
    this.g = paramBoolean;
  }
  
  public final boolean a()
  {
    return this.g;
  }
  
  public final String b()
  {
    return this.e;
  }
  
  public final CharSequence c()
  {
    if (!TextUtils.isEmpty(this.f)) {
      return this.f;
    }
    return this.h;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmn
 * JD-Core Version:    0.7.0.1
 */