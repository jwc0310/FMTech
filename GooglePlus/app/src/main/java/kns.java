import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class kns
  extends knq
{
  private String f;
  private List<String> g = new ArrayList();
  
  protected final void a(ooa paramooa)
  {
    super.a(paramooa);
    this.g.clear();
    onz[] arrayOfonz = paramooa.e;
    String str4;
    String str6;
    String str1;
    String str2;
    if ((arrayOfonz != null) && (arrayOfonz.length != 0))
    {
      onz localonz = arrayOfonz[0];
      List localList = this.g;
      str4 = String.valueOf("https:");
      String str5 = String.valueOf(localonz.a);
      if (str5.length() != 0)
      {
        str6 = str4.concat(str5);
        localList.add(str6);
      }
    }
    else
    {
      mfx.a(paramooa.c);
      this.f = paramooa.b;
      if (!TextUtils.isEmpty(this.f))
      {
        str1 = String.valueOf("https:");
        str2 = String.valueOf(this.f);
        if (str2.length() == 0) {
          break label171;
        }
      }
    }
    label171:
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      this.f = str3;
      mfx.a(paramooa.d);
      return;
      str6 = new String(str4);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kns
 * JD-Core Version:    0.7.0.1
 */